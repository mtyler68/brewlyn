package com.dazlyn.brewlyn.beerxml.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HOPS")
@XmlAccessorType(XmlAccessType.FIELD)
public class Hops {

    @XmlElement(name = "HOP", required = true)
    protected List<Hop> hopList;

    public List<Hop> getHopList() {
        if (hopList == null) {
            hopList = new ArrayList<>();
        }
        return this.hopList;
    }
}
