package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {
    @FindBy(className = "gLFyf gsfi")
    WebElement inputBuscador;
    @FindBy(xpath ="//input[contains(@data-ved,'0ahUKEwjTj5aB-MP4AhXzCNQKHUdTDQ8Q4dUDCA0')]")
    WebElement btnBuscar;

   public Google(WebDriver webDriver){
       PageFactory.initElements(webDriver, this);
   }

    public void setInputBuscador(String busqueda) {
        this.inputBuscador = inputBuscador;
        inputBuscador.sendKeys(busqueda);
    }

    public void clickBtnBuscar(){
       btnBuscar.click();
    }
}




