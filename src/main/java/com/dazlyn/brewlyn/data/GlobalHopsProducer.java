package com.dazlyn.brewlyn.data;

import com.dazlyn.brewlyn.beerxml.v1.Hop;
import com.dazlyn.brewlyn.beerxml.v1.Hops;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.xml.bind.JAXB;
import lombok.extern.slf4j.Slf4j;

@ApplicationScoped
@Slf4j
public class GlobalHopsProducer {

    @Named("globalHops")
    @Produces
    private List<Hop> hops;

    @PostConstruct
    public void init() {
        try (InputStream is = GlobalHopsProducer.class.getResourceAsStream("/data/hops.xml")) {
            Hops listSource = JAXB.unmarshal(is, Hops.class);
            this.hops = Collections.unmodifiableList(listSource.getHopList());
        } catch (IOException ioex) {
            log.error("action=init, message=\"exception while loading hops.xml", ioex);
        }
    }
}
