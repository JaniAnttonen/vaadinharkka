package com.example.testinnggg;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("testinnggg")
public class TestinngggUI extends UI {

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = TestinngggUI.class)
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {

        // Tehdään VerticalLayout, jonka sisään sivu (webapp lol Vaadin)
        // laitetaan näytille
        final VerticalLayout ebin = new VerticalLayout();
        ebin.setWidth("100%");
        ebin.setHeight("100%");

        // Sivun (lol applikaation) otsikko
        Label title = new Label("Ebinedarivaalit 2014");
        title.setStyleName("title");
        ebin.addComponent(title);

        // Ehdokkaat
        /*
         * Lisätään VerticalLayoutin sisään GridLayout, joka sisältää
         * ehdokaslistauksen.
         */
        final GridLayout grid = new GridLayout(2, 3);
        grid.setWidth("100%");
        ebin.addComponent(grid);

        // Äänestysnappi
        final Button vote = new Button("VOTE");
        vote.setStyleName("btn");
        ebin.addComponent(vote);

        vote.addClickListener(new Button.ClickListener() {
            public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
                grid.addComponent(new Label("SPAM"));
            }
        });

        // Laitetaan sivu näytille
        setContent(ebin);

    }
}