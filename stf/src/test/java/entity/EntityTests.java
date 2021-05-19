package entity;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SearchPage;
import pages.Entity;


import static org.testng.Assert.*;

public class EntityTests extends BaseTest{
 //Search
    @Test
    public void checkSearch() {
        SearchPage searchpage11 = homePage.search("instax");
        assertEquals(searchpage11.getUrl(), "instax");

    }
    //AddCart
    @Test
    public void checkCart() {
        SearchPage searchpage = homePage.search("instax film");
        Entity searchedPage = searchpage.clickSearched().clickEntity();
        assertEquals(searchedPage.returnSum(), searchedPage.clickSum().returnSum());
    }
    //RemoveItemCart
    @Test
    public void removeCart() {
        SearchPage searchpage = homePage.search("instax film");
        String searchedPage1 = searchpage.clickSearched().clickEntity().clickSum().deleteItem();
        assertEquals(searchedPage1, "Subtotal (1 item):");
    }

    //ChangeQuantity
    @Test
    public void changeQuant() {
        SearchPage searchpage = homePage.search("instax film");
        int searchedPage = searchpage.clickSearched().clickEntity().clickSum().changeQuantity(3);
        assertEquals(searchedPage, 3);

    }
}