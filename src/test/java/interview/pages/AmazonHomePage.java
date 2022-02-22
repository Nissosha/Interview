package interview.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends BasePage {

    @FindBy (id = "searchDropdownBox")
    public WebElement all;

    @FindBy (xpath = "//option[@value='search-alias=electronics']")
    public WebElement electronics;

    @FindBy (id = "nav-search-submit-button")
    public WebElement searchBtn;

    public void searchElectronics() {
        all.click();
        electronics.click();
        searchBtn.click();
    }



}
