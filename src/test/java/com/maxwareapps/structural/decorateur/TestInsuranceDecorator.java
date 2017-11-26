package com.maxwareapps.structural.decorateur;

import com.maxwareapps.structural.decorator.BaseInsurance;
import com.maxwareapps.structural.decorator.CollisionDamage;
import com.maxwareapps.structural.decorator.FireDamage;
import com.maxwareapps.structural.decorator.Insurance;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Decorator Design Pattern (Insurance Decorator).
 */
public class TestInsuranceDecorator {
    @Test
    public void testDecorating(){
        Insurance baseInsurance = new BaseInsurance("Base Insurance",1000);
        FireDamage fireDamage = new FireDamage(baseInsurance);
        CollisionDamage collisionDamage = new CollisionDamage(fireDamage);
        Assert.assertEquals("Base Insurance + Fire Damage Insurance + Collision Damage Insurance",collisionDamage.getDescription());
        Assert.assertEquals(1300.0,collisionDamage.getCost(),0.0);
    }
}
