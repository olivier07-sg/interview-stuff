package com.interview.interviewstuff;

import com.interview.interviewstuff.service.CardValidationService;
import org.junit.jupiter.api.BeforeAll;

public class CardValidationServiceTest {

    private static final String VALID_CARD_NUMBER = "4242424242424242";

    private static final String INVALID_CARD_NUMBER = "111111111111111";

    private static CardValidationService cardNumberValidationService;

    @BeforeAll
    static void beforeAll() {
        cardNumberValidationService = new CardValidationService();
    }

}
