package com.example.javajsoupexample.component.stock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

class JsoupExampleTest {

    @Test
    @DisplayName("url을 입력하면 값이 출력 되나?")
    void jsoupExampleTest() throws IOException {
        //given
        JsoupExample jsoupExample = new JsoupExample();

        //when
        String example = jsoupExample.example("https://www.musinsa.com/app/goods/2747337");

        //then
        assertThat(example.isEmpty(), is(false));

    }
}