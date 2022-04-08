package dev.po;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactsPage {
    //Поле "Как вас зовут?"
    @FindBy(how = How.XPATH, using = ".//input[@name='name']")
    public SelenideElement inputName;
}
