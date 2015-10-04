package com.dazlyn.brewlyn.beerxml.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.Data;

@XmlType(name = "HOP")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Hop {

    @XmlElement(name = "NAME", required = true)
    protected String name;

    @XmlElement(name = "VERSION")
    protected int version;

    @XmlElement(name = "ORIGIN", required = true)
    protected String origin;

    @XmlElement(name = "ALPHA")
    protected double alpha;

    @XmlElement(name = "AMOUNT")
    protected double amount;

    @XmlElement(name = "USE", required = true)
    protected String use;

    @XmlElement(name = "TIME")
    protected int time;

    @XmlElement(name = "NOTES", required = true)
    protected String notes;

    @XmlElement(name = "TYPE", required = true)
    protected String type;

    @XmlElement(name = "FORM", required = true)
    protected String form;

    @XmlElement(name = "BETA")
    protected double beta;

    @XmlElement(name = "HSI")
    protected int hsi;

    @XmlElement(name = "DISPLAY_AMOUNT", required = true)
    protected String displayamount;

    @XmlElement(name = "INVENTORY", required = true)
    protected String inventory;

    @XmlElement(name = "DISPLAY_TIME", required = true)
    protected String displaytime;


}
