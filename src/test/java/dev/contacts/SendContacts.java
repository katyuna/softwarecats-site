package dev.contacts;

import dev.BaseTest;
import dev.model.User;
import dev.po.ContactsPage;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.open;

public class SendContacts extends BaseTest {

    @Test
    @DisplayName("Заполнение о отправка формы Обсудить проект со страницы контактов")
    public void testSendFormFromContactsPage(){
        //Открыть страницу контактов
        ContactsPage contactsPage = open(ContactsPage.URL_CONTACTS, ContactsPage.class);
        User user = User.getRandomUser();
        contactsPage.fillTheForm(user.getName(), user.getContact(),"Это не ральный отклик - это ЗАПУСК АВТОТЕСТОВ с сайта от Катюни. ИЗВИНИТИ!");
    }
}
