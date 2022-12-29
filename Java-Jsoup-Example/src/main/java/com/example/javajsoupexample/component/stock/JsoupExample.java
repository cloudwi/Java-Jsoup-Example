package com.example.javajsoupexample.component.stock;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class JsoupExample {

    // 크롤링 할 사이트 주소
    private String url;

    private Document doc = null;

    public String example(String url) throws IOException {
        this.url = url;

        doc = Jsoup.connect(url).get();

        Elements elements = doc.select("div.option_cont");

        String data = elements.select("select").text();

        System.out.println(data);

        return data;

    }

}
