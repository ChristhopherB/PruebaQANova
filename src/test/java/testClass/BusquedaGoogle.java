package testClass;

import Page.Google;
import org.openqa.selenium.WebDriver;

public class BusquedaGoogle {

    private Google google;
    public void Busqueda(WebDriver webDriver){
        google = new Google(webDriver);
        google.setInputBuscador("Perro");
        google.clickBtnBuscar();
    }

}
