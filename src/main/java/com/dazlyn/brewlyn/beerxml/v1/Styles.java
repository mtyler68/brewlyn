package com.dazlyn.brewlyn.beerxml.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "STYLES")
@XmlAccessorType(XmlAccessType.FIELD)
public class Styles {

    @XmlElement(name = "STYLE", required = true)
    protected List<Style> styleList;

    public List<Style> getStyleList() {
        if (styleList == null) {
            styleList = new ArrayList<>();
        }
        return this.styleList;
    }
}
