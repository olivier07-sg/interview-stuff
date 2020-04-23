package com.interview.interviewstuff.service;

import org.springframework.stereotype.Service;

@Service
public class CardValidationService {

    /**
     * 1. From the last digit moving backwards, double every second digit
     * 2. If the doubled number is greater than 9, add it's two digits together
     * 3. Sum all card digits together
     * 4. If the total ends in zero, then the number is a valid credit card
     */
    public boolean isValid(String cardNumber) {

        int count = 1;
        int total  = 0;

        for (int i = cardNumber.length() - 1; i >= 0; i--) {

            int digit = Integer.parseInt(String.valueOf(cardNumber.charAt(i)));

            if(count % 2 == 0) {
                digit = doubleDigit(digit);
            }

            count++;

            System.out.println(digit);

            total += digit;
        }

        System.out.println(total);

        String totalString = String.valueOf(total);
        return totalString.charAt(totalString.length()-1) == '0';
    }

    private int doubleDigit(int digit) {
        digit = digit * 2;

        if (digit > 9) {
            String stringDoubleDigit = String.valueOf(digit);
            int firstDigit = Integer.parseInt(String.valueOf(stringDoubleDigit.charAt(0)));
            int secondDigit = Integer.parseInt(String.valueOf(stringDoubleDigit.charAt(1)));
            digit = firstDigit + secondDigit;
        }
        return digit;
    }

}
