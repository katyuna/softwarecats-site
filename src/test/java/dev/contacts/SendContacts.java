package dev.contacts;

import dev.BaseTest;
import dev.po.ContactsPage;
import dev.po.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class SendContacts extends BaseTest {
    //Открыть страницу контактов
    ContactsPage contactsPage = open(ContactsPage.URL_CONTACTS, ContactsPage.class);
}
