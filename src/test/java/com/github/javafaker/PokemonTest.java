package com.github.javafaker;

import org.junit.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class PokemonTest extends AbstractFakerTest {

    @Test
    public void name() {
        assertThat(faker.pokemon().name(), matchesRegularExpression("[\\w']+.?( \\w+)?"));
    }

    @Test
    public void location() {
        assertThat(faker.pokemon().location(), matchesRegularExpression("\\w+( \\w+)?( \\w+)?"));
    }
}
