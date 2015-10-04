package com.dazlyn.brewlyn.tool.calculator;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

/**
 * Stateful class.
 *
 * Apparent Attenuation http://hbd.org/uchima/tech/gravity.html Calories
 * http://beersmith.com/blog/2011/02/04/counting-calories-in-your-homebrewed-beer/
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AbvCalculator implements Serializable {

    private static final double STD_FACTOR = 131.25d;

    public enum Equation {

        STANDARD,
        ALTERNATE

    }

    private double originalGravity;

    private double finalGravity;

    private GravityUnit gravityUnit;

    private Equation equation;

    private double alcoholByVolume;

    private double apparentAttenuation;

    private double caloriesPer12Oz;

    private String errorMessage;

    public void calculate() {
        switch (equation) {
            case ALTERNATE:
                alternateCalc();
                break;
            case STANDARD:
                standardCalc();
                break;
        }

        calcAttenuation();
        calcCalories();
    }

    private void alternateCalc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void standardCalc() {
        setAlcoholByVolume((originalGravity - finalGravity) * STD_FACTOR);
    }

    private void calcAttenuation() {
        double ogPoints = 1000d * (originalGravity - 1d);
        double fgPoints = 1000d * (finalGravity - 1d);
        setApparentAttenuation((ogPoints - fgPoints) / ogPoints);
    }

    private void calcCalories() {
        double alcoholCal = 1881.22d * finalGravity * (originalGravity - finalGravity) / (1.775d - originalGravity);
        double carbCal = 3550d * finalGravity * ((0.1808d * originalGravity) + (0.8192d * finalGravity) - 1.0004d);
        setCaloriesPer12Oz(alcoholCal + carbCal);
    }

}
