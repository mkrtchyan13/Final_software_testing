package signin;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;
import static org.testng.Assert.*;


public class SignInTests extends BaseTest {


    @Test
    public void blahBlah(){
        SignInPage loginPage = homePage.clickSignIn();
        loginPage.setEmailField("jane.mkrtchyan13@gmail.com");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        secureAreaPage.setPasswordField("cQJmUtku131213");
        Product newPage = secureAreaPage.chooseProduct();
        Settings newSettings = newPage.chooseSetting();
        ChangeName newChangeName = newSettings.changeName();
        EditingPart newEditingPart = newChangeName.editName();
        newEditingPart.changeNameField("Blah121");
        String editedName = newEditingPart.editedName().getName();
        assertEquals(editedName, "Blah121");


}
}
