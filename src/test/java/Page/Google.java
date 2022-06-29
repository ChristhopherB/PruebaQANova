package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {
    @FindBy(xpath = "//input[@class = 'gLFyf gsfi']")
    WebElement inputBuscador;
    @FindBy(xpath ="(//input[@value = 'Buscar con Google'])[2]")
    WebElement btnBuscar;

   public Google(WebDriver webDriver){
       PageFactory.initElements(webDriver, this);
   }

    public void setInputBuscador(String busqueda) throws InterruptedException {
        this.inputBuscador = inputBuscador;
        inputBuscador.sendKeys(busqueda);
        Thread.sleep(2000);
        inputBuscador.sendKeys(Keys.ESCAPE);
    }

    public void clickBtnBuscar(){
       btnBuscar.click();
    }
}




