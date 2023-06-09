package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TechProPage {
    public TechProPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    /*
    driver.findElement(By.xpath("//*[@class='eicon-close']")).click();
     */
    @FindBy(xpath = "//*[@class='eicon-close']")
    public WebElement reklam;

    @FindBy(css = "input[type='search'")
    public WebElement aramaKutusu;


}
