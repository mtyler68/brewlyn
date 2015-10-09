package com.dazlyn.brewlyn.beerxml.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.Data;

@XmlType(name = "HOP")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Style {

    @XmlElement(name = "NAME", required = true)
    protected String name;

    @XmlElement(name = "VERSION")
    protected int version;

    @XmlElement(name = "CATEGORY", required = true)
    protected String category;

    @XmlElement(name = "CATEGORY_NUMBER")
    protected int categorynumber;

    @XmlElement(name = "STYLE_LETTER", required = true)
    protected String styleletter;

    @XmlElement(name = "STYLE_GUIDE", required = true)
    protected String styleguide;

    @XmlElement(name = "TYPE", required = true)
    protected String type;

    @XmlElement(name = "OG_MIN")
    protected double ogmin;

    @XmlElement(name = "OG_MAX")
    protected double ogmax;

    @XmlElement(name = "FG_MIN")
    protected double fgmin;

    @XmlElement(name = "FG_MAX")
    protected double fgmax;

    @XmlElement(name = "IBU_MIN")
    protected int ibumin;

    @XmlElement(name = "IBU_MAX")
    protected int ibumax;

    @XmlElement(name = "COLOR_MIN")
    protected int colormin;

    @XmlElement(name = "COLOR_MAX")
    protected int colormax;

    @XmlElement(name = "CARB_MIN")
    protected double carbmin;

    @XmlElement(name = "CARB_MAX")
    protected double carbmax;

    @XmlElement(name = "ABV_MAX")
    protected double abvmax;

    @XmlElement(name = "ABV_MIN")
    protected double abvmin;

    @XmlElement(name = "NOTES", required = true)
    protected String notes;

    @XmlElement(name = "PROFILE", required = true)
    protected String profile;

    @XmlElement(name = "INGREDIENTS", required = true)
    protected String ingredients;

    @XmlElement(name = "EXAMPLES", required = true)
    protected String examples;

    @XmlElement(name = "DISPLAY_OG_MIN", required = true)
    protected String displayogmin;

    @XmlElement(name = "DISPLAY_OG_MAX", required = true)
    protected String displayogmax;

    @XmlElement(name = "DISPLAY_FG_MIN", required = true)
    protected String displayfgmin;

    @XmlElement(name = "DISPLAY_FG_MAX", required = true)
    protected String displayfgmax;

    @XmlElement(name = "DISPLAY_COLOR_MIN", required = true)
    protected String displaycolormin;

    @XmlElement(name = "DISPLAY_COLOR_MAX", required = true)
    protected String displaycolormax;

    @XmlElement(name = "OG_RANGE", required = true)
    protected String ogrange;

    @XmlElement(name = "FG_RANGE", required = true)
    protected String fgrange;

    @XmlElement(name = "IBU_RANGE", required = true)
    protected String iburange;

    @XmlElement(name = "CARB_RANGE", required = true)
    protected String carbrange;

    @XmlElement(name = "COLOR_RANGE", required = true)
    protected String colorrange;

    @XmlElement(name = "ABV_RANGE", required = true)
    protected String abvrange;

}
