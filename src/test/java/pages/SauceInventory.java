package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.Driver;

import java.util.List;

public class SauceInventory {


    public SauceInventory(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(tagName = "select")
    WebElement sortBy;

    @FindBy (className = "inventory_item_price")
    List<WebElement> products;


    public void sortBy(String filter){

        Select select = new Select(sortBy);
        select.selectByVisibleText(filter);

    }

   public void validateProductAreSorted(){


        // yöntem1: for i ile

       for (int i = 0; i < products.size()-1; i++) {

           WebElement currentProduct  = products.get(i);
           WebElement nextProduct = products.get(i+1);

           double currentPrice = Double.parseDouble(currentProduct.getText().substring(1));
           double nextPrice = Double.parseDouble(nextProduct.getText().substring(1));

           Assert.assertTrue(currentPrice<=nextPrice,"product are not sorted");


       }
       

   }

}
