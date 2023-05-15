package techproed.stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Hooks {

    /*
    Scenario'lar arasindaki baglantiyi saglayan glue parametresine koydugumuz stepDefinition package icerisinde
    @Before ve @After gibi bir notasyon varsa extend yapmamiza gerek kalmadan her scenario'dan öce veya sonra  bu
    methodlar calisacaktir.
        Cucumber'da @Before, @After kullanma ihtiyacimiz olursa bunu Hooks class'ina koyariz.
        Istersek yeni bir package olusturup bunu icinede Hooks class'ini kayabiliriz. Eger yeni bir package icerisine
    koyarsak runner clasindaki glue parametresine bu package'da eklemiz gerekir.
        Kullandigimiz @Before @After notasyonlari Junit'ten degil Cucumberden import edilmelidir.

     */

    @Before ("@All") //import io.cucumber.java.Before;
    public void setUp1()  {
        System.out.println("Testler calismaya basladi");
    }
    @Before ("@gr1")
    public void setUp2() {
        System.out.println("Amazonda SQL aratildi");
    }
    @Before ("@gr2")
    public void setUp3() {
        System.out.println("Amazonda Java aratildi");
    }
    @Before ("@gr3")
    public void setUp4() {
        System.out.println("Amazonda Selenium aratildi");
    }

    @After  //import io.cucumber.java.After;
    public void tearDown(Scenario scenario){//Bu method Scenario class'indan bir parametre atamasi yapilir.
        //Bu method'u (fail olan scenario'larimizin) resmini almak icin kullaniriz
        if (scenario.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();  //Screenshot almak icin bunu yaziyoruz
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/jpeg","screenShot_"+scenario.getName());
        }
        Driver.closeDriver();

    }



}
