package org.exemple;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrattionUtilTest {
    RegistrattionUtil verification;
    @BeforeEach
    void setUp() {
        verification= new RegistrattionUtil();
    }
    @Test
    void test_if_user_is_Working(){
        assertTrue(verification.validateUserInput("bah","1234","1234"));
        assertTrue(verification.validateUserInput("berete","8558","8558"));
    }
}