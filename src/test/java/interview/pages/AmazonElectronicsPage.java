package interview.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonElectronicsPage extends BasePage {

    @FindBy (xpath = "//*[@id=\"nav-subnav\"]/a[3]/span")
    public WebElement bestSellersElement;

    @FindBy(xpath = "//div[.='Fire TV Stick with Alexa Voice Remote (includes TV controls), HD streaming device']")
    public WebElement item;

    public void setBestSellers(String bestSellers){
        bestSellersElement.click();



    }




}
