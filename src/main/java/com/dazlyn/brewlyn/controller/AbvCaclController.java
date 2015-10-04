package com.dazlyn.brewlyn.controller;

import com.dazlyn.brewlyn.tool.calculator.AbvCalculator;
import com.dazlyn.brewlyn.tool.calculator.GravityUnit;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import lombok.Getter;

@Named
@SessionScoped
public class AbvCaclController implements Serializable {

    @Getter
    private AbvCalculator calc;

    @PostConstruct
    public void init() {
        calc = AbvCalculator.builder()
                .equation(AbvCalculator.Equation.STANDARD)
                .finalGravity(1.011d)
                .gravityUnit(GravityUnit.SPECIFIC_GRAVITY)
                .originalGravity(1.045d)
                .build();
        calc.calculate();
    }

    public void calculate() {
        calc.calculate();
    }
}
