package pageUIs.user.nopCommerce;

public class BasePageUI {
	public static final String HEADER_TEXT_LINK_BY_NAME = "//div[@class = 'header-links']//a[text()='%s']";
	public static final String DYNAMIC_BUTTON_BY_NAME = "//div[@class = 'buttons']/button[text() = '%s']";
	public static final String DYNAMIC_VALIDATION_MESSAGE_BY_TEXT = "//span[@class='field-validation-error']/span[text()='%s']";
	public static final String DYNAMIC_RADIO_BUTTON_BY_LABEL = "//label[text()='%s']/preceding-sibling::input[@type='radio']";
	public static final String DYNAMIC_TEXTBOX_BY_ID = "//input[@id='%s']";
}
