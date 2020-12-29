package arbeit1;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class Test01 {

    @Test
    public void test1() {
       /*
           open(url);
           $("selecor").doAction();
           $("seloctor").check(condition);
        */
        Configuration.startMaximized = true;
        Configuration.browser = "edge";
        // Configuration.browserSize = "600x400";   // ekran büyüklügünü ayarlayabiliriz

        open("http://opencart.abstracta.us/");

        sleep(2000); // bekletme komutu
        zoom(0.7);  //  ekran büyüklügünü zoom yapiyor
        sleep(3000);

    }

    @Test
    public void test2() {
        Configuration.startMaximized = true;
        open("http://opencart.abstracta.us/");
        /*
            $ == driver.findElement()
            $ -> ilk eleman döner, 4 sn otamatik olarak bekler
            $$(selector) == driver.find.findElement(selector) ---> list icin kullaniyoruz
            Assertions
             $().should()                   $().shouldNot()
             $().shouldBe()                 $().shouldNotBe()
             $().shouldHave()               $().shouldNotHave()
         */

        $(By.cssSelector("input[name=\"search\"]")).setValue("mac");
        $(By.cssSelector("button[type='button'][class='btn btn-default btn-lg']")).click();


        By products = By.cssSelector("div[class=\"product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12\"]");
        $$(products).shouldBe(CollectionCondition.size(4));
        $$(products).shouldHaveSize(4);  // üstteki satir ile ayni islemi yapiyor

        sleep(3000);

    }


    @Test
    public void test3() {
        Configuration.startMaximized = true;
        open("http://opencart.abstracta.us/");

        String input = "input[name=\"search\"]";
        By products = By.cssSelector("div[class=\"product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12\"]");

        $(input).setValue("mac").pressEnter();
        System.out.println($$(products).size());

        // $$(products).get(0).hover().contextClick();   // mause sag tusa bastigimiz click tir

        $$(products).get(0).scrollIntoView(true).hover().contextClick();

        sleep(3000);

    }

    @Test
    public void test4() {
        Configuration.startMaximized = true;
        open("http://opencart.abstracta.us/");

        String input = "input[name=\"search\"]";
        By products = By.cssSelector("div[class=\"product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12\"]");

        // $(input).shouldBe(Condition.appear).setValue("mac").pressEnter();  // görünene kadar bekleme yapiliyor

        $(input).waitUntil(Condition.appear,10000).setValue("mac").pressEnter();

        System.out.println($$(products).size());
    }

    @Test
    public void test5(){
        String url = "https://test.basqar.techno.study/";
        String kullanici = "daulet2030@gmail.com";
        String sifre = "TechnoStudy123@";
        Configuration.startMaximized = true;

        open(url);
        $("input[formcontrolname=\"username\"]").shouldBe(Condition.appear).setValue(kullanici);
        $("input[formcontrolname=\"password\"]").shouldBe(Condition.appear).setValue(sifre).pressEnter();

        if($(By.partialLinkText("Got it")).isEnabled()) {
            $(By.partialLinkText("Got it")).click();
        }
        sleep(3000);

        $("user-message-bell").shouldBe(Condition.exist);


        zoom(0.7);
        sleep(3000);


    }

}
