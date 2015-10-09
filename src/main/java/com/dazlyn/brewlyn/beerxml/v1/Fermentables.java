package com.dazlyn.brewlyn.beerxml.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "FERMENTABLES")
@XmlAccessorType(XmlAccessType.FIELD)
public class Fermentables {

    @XmlElement(name = "FERMENTABLE", required = true)
    protected List<Fermentable> fermentableList;

    public List<Fermentable> getFermentableList() {
        if (fermentableList == null) {
            fermentableList = new ArrayList<>();
        }
        return this.fermentableList;
    }
}
