package com.github.javafaker;

import org.junit.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class CurrencyTest extends AbstractFakerTest {

    @Test
    public void testName() {
        assertThat(faker.currency().name(), matchesRegularExpression("[\\w\\'\\.\\-\\(\\) ]+"));
    }

    @Test
    public void testCode() {
        final Currency currency = faker.currency();
        assertThat(currency.code(), matchesRegularExpression("[A-Z]{3}"));
    }

}
