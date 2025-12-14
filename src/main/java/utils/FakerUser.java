package utils;

import com.github.javafaker.Faker;

public class FakerUser {

    Faker faker = new Faker();

    public String generateFullUserName() {
        return faker.name().fullName();
    }

    public String generateUserEmail() {
        return faker.internet().emailAddress();
    }

    public String generateUserFullAddress() {
        return faker.address().fullAddress();
    }

    public String generateUserNumber() {
        return faker.phoneNumber().phoneNumber();
    }
}
