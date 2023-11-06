package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void returnsTrue_whenInputIsLongerThan8() {
        //Given

        String input = Main.inputPassword;

        //When
        boolean actual = Main.passwordLength(input);

        //Then
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void returnsTrue_whenNumbersAreIncluded() {
        //GIVEN
        String input = Main.inputPassword;
        //WHEN
        boolean actual = Main.numbersIncluded(input);

        //THEN
        assertTrue(actual);
    }

    @Test
    void returnsTrue_whenUpperAndLowercaseIsIncluded() {
        //GIVEN
        String input = Main.inputPassword;
        //WHEN
        boolean actual = Main.upperLowercaseIncluded(input);
        //THEN
        assertTrue(actual);

    }

    @Test
    void returnsFalse_whenUnsafePwIsUsed() {
        //GIVEN
        String input = Main.inputPassword;
        //WHEN
        boolean actual = Main.checkForUnsafePasswords(input);
        //THEN
        assertTrue(actual);
    }


}