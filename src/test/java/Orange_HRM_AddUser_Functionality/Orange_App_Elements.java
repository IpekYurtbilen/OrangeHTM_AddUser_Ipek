package Orange_HRM_AddUser_Functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_App_Elements {

    public Orange_App_Elements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input[name='username']")
    private WebElement userName;

    @FindBy(css = "input[name='password']")
    private WebElement password;

    @FindBy(css = "button[type='submit']")
    private WebElement submitButton;

    @FindBy(css = "span>h6")
    private WebElement dashboardHeader;

    @FindBy(xpath = "//span[text()='Admin']")
    private WebElement adminButton;

    @FindBy(css = "button[class='oxd-button oxd-button--medium oxd-button--secondary']")
    private WebElement addButton;

    @FindBy(css = "div>h6")
    private WebElement addUserHeader;

    @FindBy(xpath = "(//div[@role='option']//span)[1]")
    private WebElement employeeNameFromDropdownMenu;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement usernameSearchButton;

    @FindBy(xpath = "//div//label[text()='User Role']")
    private WebElement userRole;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    private WebElement userRoleDropdownArrow;

    @FindBy(xpath = "//div//span[text()='Admin']")
    private WebElement adminFromUserRole;

    @FindBy(xpath = "//div//span[text()='ESS']")
    private WebElement ESSFromUserRole;

    @FindBy(xpath = "//div//label[text()='Status']")
    private WebElement status;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    private WebElement statusDropdownMenuArrow;

    @FindBy( xpath = "//div//span[text()='Enabled']")
    private WebElement enabledFromStatus;

    @FindBy(xpath = "//div[text()='Disabled']")
    private WebElement disabledFromStatus;

    @FindBy(xpath = "//label[text()='Password']")
    private WebElement passwordAdminPage;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    private WebElement passwordInputBox;

    @FindBy(xpath = "//label[text()='Employee Name']")
    private WebElement employeeName;

    @FindBy(css = "input[placeholder='Type for hints...']")
    private WebElement employeeNameInputBox;

    @FindBy(xpath = "//label[text()='Username']")
    private WebElement UsernameAdminPage;

    @FindBy(xpath = "(//div/input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement usernameInputBox;

    @FindBy(xpath = "//label[text()='Confirm Password']")
    private WebElement confirmPassword;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    private WebElement confirmPasswordInputBox;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    private WebElement cancelButton;

    @FindBy(css = "button[type='submit']")
    private WebElement saveButton;

    @FindBy(css = "button[type='submit']")
    private WebElement submitButtonForSearch;

    @FindBy(css = "span.oxd-text.oxd-text--span.oxd-input-field-error-message.oxd-input-group__message")
    private WebElement passwordErrorMessage;

    @FindBy(xpath = "(//span[text()='Required'])[1]")
    private WebElement errorForEmptyFields;

    @FindBy(xpath = "(//div[@class='oxd-table-cell oxd-padding-cell'])[2]")
    private WebElement recordFound;

    @FindBy(xpath = "//span[text()='Invalid']")
    private WebElement invalidErrorMessage;

    @FindBy(xpath = "//span[text()='Should be at least 5 characters']")
    private WebElement usernameErrorMessage;

    @FindBy(xpath = "//span[text()='Already exists']")
    private WebElement alreadyExistsMessage;

    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getDashboardHeader() {
        return dashboardHeader;
    }

    public WebElement getAdminButton() {
        return adminButton;
    }

    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getAddUserHeader() {
        return addUserHeader;
    }

    public WebElement getEmployeeNameFromDropdownMenu() {
        return employeeNameFromDropdownMenu;
    }

    public WebElement getUsernameSearchButton() {
        return usernameSearchButton;
    }

    public WebElement getUserRole() {
        return userRole;
    }

    public WebElement getUserRoleDropdownArrow() {
        return userRoleDropdownArrow;
    }

    public WebElement getAdminFromUserRole() {
        return adminFromUserRole;
    }

    public WebElement getESSFromUserRole() {
        return ESSFromUserRole;
    }

    public WebElement getStatus() {
        return status;
    }

    public WebElement getStatusDropdownMenuArrow() {
        return statusDropdownMenuArrow;
    }

    public WebElement getEnabledFromStatus() {
        return enabledFromStatus;
    }

    public WebElement getDisabledFromStatus() {
        return disabledFromStatus;
    }

    public WebElement getPasswordAdminPage() {
        return passwordAdminPage;
    }

    public WebElement getPasswordInputBox() {
        return passwordInputBox;
    }

    public WebElement getEmployeeName() {
        return employeeName;
    }

    public WebElement getEmployeeNameInputBox() {
        return employeeNameInputBox;
    }

    public WebElement getUsernameAdminPage() {
        return UsernameAdminPage;
    }

    public WebElement getUsernameInputBox() {
        return usernameInputBox;
    }

    public WebElement getConfirmPassword() {
        return confirmPassword;
    }

    public WebElement getConfirmPasswordInputBox() {
        return confirmPasswordInputBox;
    }

    public WebElement getCancelButton() {
        return cancelButton;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSubmitButtonForSearch() {
        return submitButtonForSearch;
    }

    public WebElement getPasswordErrorMessage() {
        return passwordErrorMessage;
    }

    public WebElement getErrorForEmptyFields() {
        return errorForEmptyFields;
    }

    public WebElement getRecordFound() {
        return recordFound;
    }

    public WebElement getInvalidErrorMessage() {
        return invalidErrorMessage;
    }

    public WebElement getUsernameErrorMessage() {
        return usernameErrorMessage;
    }

    public WebElement getAlreadyExistsMessage() {
        return alreadyExistsMessage;
    }
}
