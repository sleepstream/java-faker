package com.github.javafaker;

import org.junit.Test;

import java.text.DecimalFormatSymbols;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class EmotionsTest extends AbstractFakerTest {

    private static final char decimalSeparator = new DecimalFormatSymbols().getDecimalSeparator();

    @Test
    public void testEmotion() {
        final String emotion = faker.emotion().adjective();
        assertThat(emotion, matchesRegularExpression("[A-Za-z]+"));
    }
}
