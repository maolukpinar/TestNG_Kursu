/**
 * @Author:Otosun Tarih :29/09/2020
 */
package Proje.Proje6.POM_template;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Elements {
    public POM_Elements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(css=".abc")
        public WebElement abc;

    @FindBy(xpath="//a[@clas='def']")
    public WebElement def;
}
