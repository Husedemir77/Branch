package basqar.pages;

import org.openqa.selenium.By;

public interface LocatorsBy {   // interface clasin elemanlari hepsi public static tir

    String url1 = "https://test.basqar.techno.study/";
    String kullanici1 = "daulet2030@gmail.com";
    String password1 = "TechnoStudy123@";

    By Username1 = By.cssSelector("input[formcontrolname=\"username\"]");
    By Password1 = By.cssSelector("input[formcontrolname=\"password\"]");


}
