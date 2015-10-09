package com.dazlyn.brewlyn.beerxml.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.Data;

@XmlType(name = "FERMENTABLE")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Fermentable {

    @XmlElement(name = "NAME", required = true)
    protected String name;

    @XmlElement(name = "VERSION")
    protected int version;

    @XmlElement(name = "TYPE", required = true)
    protected String type;

    @XmlElement(name = "AMOUNT")
    protected double amount;

    @XmlElement(name = "YIELD")
    protected int yield;

    @XmlElement(name = "COLOR")
    protected double color;

    @XmlElement(name = "ADD_AFTER_BOIL", required = true)
    protected Boolean addafterboil;

    @XmlElement(name = "ORIGIN", required = true)
    protected String origin;

    @XmlElement(name = "SUPPLIER", required = true)
    protected Object supplier;

    @XmlElement(name = "NOTES", required = true)
    protected String notes;

    @XmlElement(name = "COARSE_FINE_DIFF")
    protected double coarsefinediff;

    @XmlElement(name = "MOISTURE")
    protected int moisture;

    @XmlElement(name = "DIASTATIC_POWER")
    protected int diastaticpower;

    @XmlElement(name = "PROTEIN")
    protected double protein;

    @XmlElement(name = "MAX_IN_BATCH")
    protected int maxinbatch;

    @XmlElement(name = "RECOMMEND_MASH", required = true)
    protected String recommendmash;

    @XmlElement(name = "IBU_GAL_PER_LB")
    protected int ibugalperlb;

    @XmlElement(name = "DISPLAY_AMOUNT", required = true)
    protected String displayamount;

    @XmlElement(name = "INVENTORY", required = true)
    protected String inventory;

    @XmlElement(name = "POTENTIAL")
    protected double potential;

    @XmlElement(name = "DISPLAY_COLOR", required = true)
    protected String displaycolor;

}
