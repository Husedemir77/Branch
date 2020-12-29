package basqar.pages;

import org.testng.annotations.Test;
import static basqar.pages.Locators.*;
import static basqar.pages.LocatorsEnum.password;


public class LoginPage implements LocatorsBy{     // bircok class implements edebiliriz

    @Test
    public void login(){
        System.out.println(url);   // Locators class tan geldi
        System.out.println(kullanici);
        System.out.println(url1);   // implemetten dolayi LocatorsBy class tan geldi

        System.out.println(password);
        System.out.println(password.getSayi());   // enum class tan geldi
        System.out.println(password.getStr());
        System.out.println();



    }


}
