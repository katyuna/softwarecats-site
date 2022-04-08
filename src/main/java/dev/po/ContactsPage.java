package dev.po;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactsPage {
    public static final String URL_CONTACTS = "https://softwarecats.dev/#rec394189455";

    //Поле "Как вас зовут?"
    @FindBy(how = How.XPATH, using = ".//input[@name='name']")
    public SelenideElement inputName;
    //Поле "Укажите любой удобный контакт"
    @FindBy(how = How.XPATH, using = ".//input[@name='Input']")
    public SelenideElement inputContact;
    //Поле "Что вы хотите обсудить"
    @FindBy(how = How.XPATH, using = ".//input[@name='Input']")
    public SelenideElement inputAbout;
    //Кнопка "Отправить заявку"
    @FindBy(how = How.XPATH, using = ".//button[@type='submit']")
    public SelenideElement buttonSubmit;


    //Методы заполнения полей формы и клик по кнопке
    public void setName(String name)
    {
        this.inputName.click();
        this.inputName.setValue(name);
    }
    public void setContact(String contact)
    {
        this.inputContact.click();
        this.inputContact.setValue(contact);
    }
    public void setAbout(String about)
    {
        this.inputContact.click();
        this.inputContact.setValue(about);
    }

    public void clickSubmitButton(){
        this.buttonSubmit.click();
    }
    public  void fillTheForm (String name, String contact, String about){
        setName(name);
        setContact(contact);
        setAbout(about);
        clickSubmitButton();
    }
}
