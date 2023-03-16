package Orange_HRM_AddUser_Functionality;

import Orange_HRM_AddUser_Functionality.Utilities.ParameterDriverClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Add_User_Functionality_Test_Cases extends ParameterDriverClass {

    @Test
    void testCase01(){
        Orange_App_Elements elements=new Orange_App_Elements(driver);
        clickElements(elements.getAdminButton());
        clickElements(elements.getAddButton());
        clickElements(elements.getUserRoleDropdownArrow());
        clickElements(elements.getESSFromUserRole());
        clickElements(elements.getStatusDropdownMenuArrow());
        clickElements(elements.getEnabledFromStatus());
        sendKeysElements(elements.getEmployeeNameInputBox(), "a");
        clickElements(elements.getEmployeeNameFromDropdownMenu());

        sendKeysElements(elements.getUsernameInputBox(), "techno");

        sendKeysElements(elements.getPasswordInputBox(), "technoStudy1!");

        sendKeysElements(elements.getConfirmPasswordInputBox(), "technoStudy1!");

        clickElements(elements.getSaveButton());


        clickElements(elements.getAdminButton());

        sendKeysElements(elements.getUsernameInputBox(), "techno");

        clickElements(elements.getSubmitButtonForSearch());

        Assert.assertTrue(getTextFromElements(elements.getRecordFound()).contains("techno"));



    }

    @Test
    void testCase02(){
        Orange_App_Elements elements=new Orange_App_Elements(driver);
        clickElements(elements.getAdminButton());
        clickElements(elements.getAddButton());
        clickElements(elements.getUserRoleDropdownArrow());
        clickElements(elements.getESSFromUserRole());
        clickElements(elements.getStatusDropdownMenuArrow());
        clickElements(elements.getEnabledFromStatus());
        sendKeysElements(elements.getEmployeeNameInputBox(), "a");
        clickElements(elements.getEmployeeNameFromDropdownMenu());

        sendKeysElements(elements.getUsernameInputBox(), "techno11");

        sendKeysElements(elements.getPasswordInputBox(), "technoStudy1!");

        sendKeysElements(elements.getConfirmPasswordInputBox(), "technoStudy1!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        clickElements(elements.getSaveButton());

        clickElements(elements.getAdminButton());

        sendKeysElements(elements.getUsernameInputBox(), "techno11");

        clickElements(elements.getSubmitButtonForSearch());

        Assert.assertTrue(getTextFromElements(elements.getRecordFound()).contains("techno11"));

    }
    @Test
    void testCase03(){

        Orange_App_Elements elements=new Orange_App_Elements(driver);
        clickElements(elements.getAdminButton());
        clickElements(elements.getAddButton());
        clickElements(elements.getSaveButton());

        String actualColor=elements.getErrorForEmptyFields().getCssValue("color");
        String expectedColor="rgba(235, 9, 16, 1)";

        Assert.assertTrue(isDisplayedElements(elements.getErrorForEmptyFields()));
        Assert.assertEquals(actualColor,expectedColor);



    }

    @Test
    void testCase04(){

        Orange_App_Elements elements=new Orange_App_Elements(driver);

        clickElements(elements.getAdminButton());
        clickElements(elements.getAddButton());

        sendKeysElements(elements.getPasswordInputBox(), "technoStudy1!");
        sendKeysElements(elements.getConfirmPasswordInputBox(), "technoStudy2!");

        String expectedErrorMessage = "Passwords do not match";
        String actualErrorMessage = getTextFromElements(elements.getPasswordErrorMessage());

        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);


    }

    @Test
    void testCase05(){
        Orange_App_Elements elements=new Orange_App_Elements(driver);

        clickElements(elements.getAdminButton());
        clickElements(elements.getAddButton());

        sendKeysElements(elements.getEmployeeNameInputBox(), "Techno");

        Actions actions = new Actions(driver);
        Action action = actions.sendKeys(Keys.TAB).build();
        action.perform();

        String expectedColor = "rgba(235, 9, 16, 1)";
        String actualColor = elements.getInvalidErrorMessage().getCssValue("color");

        Assert.assertTrue(isDisplayedElements(elements.getInvalidErrorMessage()));
        Assert.assertEquals(actualColor, expectedColor, "The colors are not same");


    }

    @Test
    void testCase06(){

        Orange_App_Elements elements=new Orange_App_Elements(driver);

        clickElements(elements.getAdminButton());
        clickElements(elements.getAddButton());

        sendKeysElements(elements.getUsernameInputBox(),"tek");

        String expectedColor = "rgba(235, 9, 16, 1)";

        String actualColor = elements.getUsernameErrorMessage().getCssValue("color");

        Assert.assertTrue(isDisplayedElements(elements.getUsernameErrorMessage()));
        Assert.assertEquals(actualColor, expectedColor, "The colors are not same");



    }

    @Test
    void testCase07(){

        Orange_App_Elements elements=new Orange_App_Elements(driver);

        clickElements(elements.getAdminButton());
        clickElements(elements.getAddButton());

        sendKeysElements(elements.getUsernameInputBox(), "Dominic.Chase");

        String expectedColor = "rgba(235, 9, 16, 1)";

        String actualColor = elements.getAlreadyExistsMessage().getCssValue("color");

        Assert.assertTrue(isDisplayedElements(elements.getAlreadyExistsMessage()));
        Assert.assertEquals(actualColor, expectedColor, "The colors are not same");



    }

    @Test
    void testCase08(){

        Orange_App_Elements elements=new Orange_App_Elements(driver);

        clickElements(elements.getAdminButton());

        Assert.assertTrue(isDisplayedElements(elements.getAddButton()), "Failed to display Add Button");

    }

    @Test
    void testCase09(){
        Orange_App_Elements elements=new Orange_App_Elements(driver);
        //Check if you are in Dashboard page
        Assert.assertEquals(getTextFromElements(elements.getDashboardHeader()), "Dashboard");

        //Navigate to Admin page
        clickElements(elements.getAdminButton());

        //Check if you landed on Admin page
        Assert.assertTrue(driver.getCurrentUrl().contains("SystemUsers"));

        //Click on add button
        clickElements(elements.getAddButton());

        //Verify the elements are displayed;
        Assert.assertTrue(isDisplayedElements(elements.getUserRole()));
        Assert.assertTrue(isDisplayedElements(elements.getEmployeeName()));
        Assert.assertTrue(isDisplayedElements(elements.getStatus()));
        Assert.assertTrue(isDisplayedElements(elements.getUsernameAdminPage()));
        Assert.assertTrue(isDisplayedElements(elements.getPasswordAdminPage()));
        Assert.assertTrue(isDisplayedElements(elements.getConfirmPassword()));
        Assert.assertTrue(isDisplayedElements(elements.getCancelButton()));
        Assert.assertTrue(isDisplayedElements(elements.getSaveButton()));


    }

    @Test
    void testCase10(){
        Orange_App_Elements elements=new Orange_App_Elements(driver);
        clickElements(elements.getAdminButton());

        Assert.assertTrue(driver.getCurrentUrl().contains("SystemUsers"));

        clickElements(elements.getAddButton());

        Assert.assertTrue(isDisplayedElements(elements.getAddUserHeader()));
    }

    @Test
    @Parameters(value = "msg")
    void testCase11(String str){
        Orange_App_Elements elements=new Orange_App_Elements(driver);
        clickElements(elements.getAdminButton());
        clickElements(elements.getAddButton());
        sendKeysElements(elements.getPasswordInputBox(),str);

        String actualPasswordErrorMessage = getTextFromElements(elements.getPasswordErrorMessage());
        String expectedPasswordErrorMessage = "Should have at least 8 characters";

        String actualPasswordMessageColor = elements.getPasswordErrorMessage().getCssValue("color");
        String expectedPasswordMessageColor ="rgba(235, 9, 16, 1)";

        Assert.assertEquals(actualPasswordErrorMessage, expectedPasswordErrorMessage, "The message is not same");
        Assert.assertTrue(isDisplayedElements(elements.getPasswordErrorMessage()), "Failed to display the password error message");
        Assert.assertEquals(actualPasswordMessageColor, expectedPasswordMessageColor, "The colors are not same");

    }

    @Test
    void testCase12(){
        Orange_App_Elements elements=new Orange_App_Elements(driver);
        clickElements(elements.getAdminButton());
        clickElements(elements.getAddButton());
        sendKeysElements(elements.getPasswordInputBox(),"ABCDEFG1");

        String actualPasswordErrorMessage = getTextFromElements(elements.getPasswordErrorMessage());
        String expectedPasswordErrorMessage = "Your password must contain a lower-case letter, an upper-case letter, a digit and a special character. Try a different password";

        String actualPasswordMessageColor = elements.getPasswordErrorMessage().getCssValue("color");
        String expectedPasswordMessageColor ="rgba(235, 9, 16, 1)";

        Assert.assertEquals(actualPasswordErrorMessage, expectedPasswordErrorMessage, "The message is not same");
        Assert.assertTrue(isDisplayedElements(elements.getPasswordErrorMessage()), "Failed to display the password error message");
        Assert.assertEquals(actualPasswordMessageColor, expectedPasswordMessageColor, "The colors are not same");

    }

}
