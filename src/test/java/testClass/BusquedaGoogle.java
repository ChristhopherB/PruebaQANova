package testClass;
import Page.Google;
import org.openqa.selenium.WebDriver;

public class BusquedaGoogle {
    private Google google;
    public void BusquedaPerro(WebDriver webDriver) throws InterruptedException {
        google = new Google(webDriver);
        google.setInputBuscador("Perro");
        google.clickBtnBuscar();
    }
    public void BusquedaGato(WebDriver webDriver) throws InterruptedException {
        google = new Google(webDriver);
        google.setInputBuscador("Gato");
        google.clickBtnBuscar();
    }


}
