package com.interview.interviewstuff;

import com.interview.interviewstuff.service.CardValidationService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CardValidationServiceTest {

    private static final String VALID_CARD_NUMBER = "4242424242424242";

    private static final String VALID_CARD_NUMBER_2 = "5454545454545454";

    private static final String INVALID_CARD_NUMBER = "111111111111111";

    @Inject
    private static CardValidationService cardNumberValidationService;

    @BeforeAll
    static void beforeAll() {
        cardNumberValidationService = new CardValidationService();
    }

    @Test
    public void testIsValid() {
        assertTrue(cardNumberValidationService.isValid(VALID_CARD_NUMBER));
        assertTrue(cardNumberValidationService.isValid(VALID_CARD_NUMBER_2));
        assertFalse(cardNumberValidationService.isValid(INVALID_CARD_NUMBER));
    }

    // TODO: Create tests below to test your service implementation

}
