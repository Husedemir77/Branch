package basqar.pages;

public enum LocatorsEnum1 {

     url (1, "https://test.basqar.techno.study/"),
     kullanici (2, "daulet2030@gmail.com"),
     password (3, "TechnoStudy123@");

     private int sayi;
     private String s;

    LocatorsEnum1(int sayi, String s) {
        this.sayi = sayi;
        this.s = s;

    }

    public int getSayi(){
        return sayi;
    }
    public String getStr(){
        return s;
    }




}
