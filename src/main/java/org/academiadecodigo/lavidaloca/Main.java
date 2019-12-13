package org.academiadecodigo.lavidaloca;


import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("file:src/main/webapp/WEB-INF/spring/spring-config.xml");
        ctx.refresh();
    }
}
