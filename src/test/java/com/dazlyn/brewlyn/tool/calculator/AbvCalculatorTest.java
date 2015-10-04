package com.dazlyn.brewlyn.tool.calculator;

import org.junit.Assert;
import org.junit.Test;

public class AbvCalculatorTest {

    @Test
    public void shouldCalcStandardMethod01() {
        AbvCalculator sut = AbvCalculator.builder()
                .gravityUnit(GravityUnit.SPECIFIC_GRAVITY)
                .originalGravity(1.048d)
                .finalGravity(1.011d)
                .equation(AbvCalculator.Equation.STANDARD)
                .build();

        sut.calculate();

        Assert.assertEquals(4.86d, sut.getAlcoholByVolume(), 0.004d);
        Assert.assertEquals(0.77d, sut.getApparentAttenuation(), 0.004d);
    }

    @Test
    public void shouldCalcStandardMethod02() {
        AbvCalculator sut = AbvCalculator.builder()
                .gravityUnit(GravityUnit.SPECIFIC_GRAVITY)
                .originalGravity(1.066d)
                .finalGravity(1.018d)
                .equation(AbvCalculator.Equation.STANDARD)
                .build();

        sut.calculate();

        Assert.assertEquals(6.3d, sut.getAlcoholByVolume(), 0.004d);
//        Assert.assertEquals(219.6, sut.getCaloriesPer12Oz(), 0.4d);
    }

    @Test
    public void shouldCalcStandardMethod03() {
        AbvCalculator sut = AbvCalculator.builder()
                .gravityUnit(GravityUnit.SPECIFIC_GRAVITY)
                .originalGravity(1.048d)
                .finalGravity(1.010d)
                .equation(AbvCalculator.Equation.STANDARD)
                .build();

        sut.calculate();

        Assert.assertEquals(4.987d, sut.getAlcoholByVolume(), 0.004d);
        Assert.assertEquals(0.79d, sut.getApparentAttenuation(), 0.004d);
        Assert.assertEquals(158, sut.getCaloriesPer12Oz(), 0.4d);
    }

}
