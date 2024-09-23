package com.github.javafaker;

public class Emotion {
    private final Faker faker;

    protected Emotion(Faker faker) {
        this.faker = faker;
    }

    public String adjective() {
        return faker.fakeValuesService().resolve("emotion.adjective", this, faker);
    }

    public String noun() {
        return faker.fakeValuesService().resolve("emotion.noun", this, faker);
    }
}
