package testSuite;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testClass.BusquedaGoogle;

public class tCase {

    ChromeDriver webDrivers;
    String url = "https://google.cl";

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver","./driverNavegador/chromedriver.exe");
        webDrivers = new ChromeDriver();
        webDrivers.get(url);
    }

    @AfterTest
    public void closeTest(){

       webDrivers.close();
    }

    @Test
    public void BuscarPerro() throws InterruptedException {
        BusquedaGoogle busquedaGoogle = new BusquedaGoogle();
        busquedaGoogle.BusquedaPerro(webDrivers);
    }

    @Test
    public void BuscarGato() throws InterruptedException {
        BusquedaGoogle busquedaGoogle = new BusquedaGoogle();
        busquedaGoogle.BusquedaGato(webDrivers);
    }

}
