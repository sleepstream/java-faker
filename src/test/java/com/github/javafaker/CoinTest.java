package com.github.javafaker;

import org.junit.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class CoinTest extends AbstractFakerTest {

    @Test
    public void coinFlip() {
        assertThat(faker.coin().flip(), matchesRegularExpression("\\w+"));
    }
}