package ru.netology;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SendFormTest {
    @Test
    void shouldFillCheckAndClick() {
        open("http://localhost:9999");
        //SelenideElement form = $("[data-test-id]=name);
        $("[data-test-id='name'] input").setValue("Римский-Корсаков Николай");
        $("[data-test-id='phone'] input").setValue("+79019019012");
        $("[data-test-id='agreement']").click();
        $("[button.button]").click();

    }

}
