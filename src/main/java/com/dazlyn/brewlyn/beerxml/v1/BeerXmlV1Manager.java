package com.dazlyn.brewlyn.beerxml.v1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.xml.bind.JAXB;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Named
@ApplicationScoped
@Slf4j
public class BeerXmlV1Manager {

    @Getter
    private List<Style> styles;

    @PostConstruct
    public void init() {
        try (InputStream is = BeerXmlV1Manager.class.getResourceAsStream("/data/styles.xml")) {
            Styles listSource = JAXB.unmarshal(is, Styles.class);
            this.styles = Collections.unmodifiableList(listSource.getStyleList());
        } catch (IOException ioex) {
            log.error("action=init, message=\"exception while loading styles.xml", ioex);
        }
    }
}
