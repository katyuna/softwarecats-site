package dev;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import dev.po.MainPage;

import static com.codeborne.selenide.Selenide.open;

public abstract class BaseTest {
     @Before
    public void before() {
        //по умолчанию запускается Google Chrome
        MainPage mainPage = open(MainPage.URL, MainPage.class);
    }

    @After
    //Закрыть браузер
    public void closeBrowser() {
        Selenide.closeWindow();
    }
}

