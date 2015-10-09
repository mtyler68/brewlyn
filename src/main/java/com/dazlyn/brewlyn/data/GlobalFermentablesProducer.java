package com.dazlyn.brewlyn.data;

import com.dazlyn.brewlyn.beerxml.v1.Fermentable;
import com.dazlyn.brewlyn.beerxml.v1.Fermentables;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.xml.bind.JAXB;
import lombok.extern.slf4j.Slf4j;

@ApplicationScoped
@Slf4j
public class GlobalFermentablesProducer {

    @Produces
    @Named("globalFermentables")
    private List<Fermentable> fermentables;

    @Produces
    @Named("fermentableTypes")
    private Set<String> fermentableTypes;

    @Produces
    @Named("fermentableOrigins")
    private List<String> fermentableOrigins;

    @PostConstruct
    public void init() {
        try (InputStream is = GlobalHopsProducer.class.getResourceAsStream("/data/fermentables.xml")) {
            Fermentables listSource = JAXB.unmarshal(is, Fermentables.class);
            this.fermentables = Collections.unmodifiableList(listSource.getFermentableList());
        } catch (IOException ioex) {
            log.error("action=init, message=\"exception while loading hops.xml", ioex);
        }

        fermentableTypes = new HashSet<>();
        fermentableOrigins = new ArrayList<>();
        for (Fermentable fermentable : fermentables) {
            fermentableTypes.add(fermentable.getType());

            if (!fermentableOrigins.contains(fermentable.getOrigin())) {
                fermentableOrigins.add(fermentable.getOrigin());
            }
        }
        fermentableTypes = Collections.unmodifiableSet(fermentableTypes);

    }

}
