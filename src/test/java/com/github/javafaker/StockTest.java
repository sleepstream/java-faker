package com.github.javafaker;

import org.junit.Test;

import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

public class StockTest extends AbstractFakerTest {

    @Test
    public void testNasdaq() {
        assertThat(faker.stock().nsdqSymbol(), not(isEmptyOrNullString()));
    }

    @Test
    public void testNYSE() {
        assertThat(faker.stock().nyseSymbol(), not(isEmptyOrNullString()));
    }

}
