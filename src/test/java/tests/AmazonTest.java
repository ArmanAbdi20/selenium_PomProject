package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.amazon.AmazonCartPage;
import pages.amazon.AmazonHomePage;
import pages.amazon.AmazonProductPage;
import pages.amazon.AmazonSearchPage;
import utils.Driver;

public class AmazonTest {

    /*
    http://www.amazon.com/" a git
    arama kutusuna "{keywords}" yaz ve arama yaptır
    gelen ilk ürünü sepete ekle
    sepete git
    sepette ürün sayısı 3 e çıkar
    sepet tutarının ürün fiyatı x 3 olduğunu doğrula


     */

    /*
    keywords = "microphone" ,"gaming keyboard" , "gaming mouse"
    quantity = 2            , 3               ,  4
     */

/*
sayfalar: ana sayfa, arama sayfası, ürün sayfası, sepet sayfası
 */


    @Test
    public void testAmazon() throws InterruptedException {

        Driver.getDriver().get("http://www.amazon.com");

        AmazonHomePage hp = new AmazonHomePage();
        hp.searchFor("microphone");

        AmazonSearchPage sp = new AmazonSearchPage();
        sp.navigateToProduct(1);

        AmazonProductPage pp = new AmazonProductPage();
        pp.addProductToCart();

        Thread.sleep(3000);
        pp.navigateCard();

        AmazonCartPage cp = new AmazonCartPage();
        cp.selectQuantity(3);

        double expectedPrice = cp.getProductPrice()*3;

        double actualPrice = cp.getSubtotalAmount();

        System.out.println(cp.getSubtotalAmount());
        Assert.assertEquals(actualPrice,expectedPrice);



        Driver.closeDriver();


    }

}
