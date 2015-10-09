package com.dazlyn.brewlyn.controller;

import com.dazlyn.brewlyn.beerxml.v1.Fermentable;
import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@ViewScoped
public class GlobalFermentablesController implements Serializable {

    @Getter
    @Setter
    private List<Fermentable> filteredFermentables;
}
