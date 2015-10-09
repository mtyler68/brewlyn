package com.dazlyn.brewlyn.controller;

import com.dazlyn.brewlyn.beerxml.v1.BeerXmlV1Manager;
import com.dazlyn.brewlyn.beerxml.v1.Style;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Named
@ViewScoped
@Slf4j
public class StyleBrowserController implements Serializable {

    @Getter
    private List<String> categories;

    @Getter
    private List<String> styles;

    @Getter
    @Setter
    private String currentCategory;

    @Getter
    @Setter
    private String currentStyle;

    @Inject
    private BeerXmlV1Manager bx1Manager;

    @PostConstruct
    public void init() {
        categories = new ArrayList<>();
        for (Style style : bx1Manager.getStyles()) {
            if (!categories.contains(style.getCategory())) {
                categories.add(style.getCategory());
            }
        }
        Collections.sort(categories);
    }

    public void onCategoryChange() {
        styles = new ArrayList<>();
        if (currentCategory != null) {
            for (Style style : bx1Manager.getStyles()) {
                if (currentCategory.equals(style.getCategory()) && !styles.contains(style.getName())) {
                    styles.add(style.getName());
                }
            }
        }
    }
}
