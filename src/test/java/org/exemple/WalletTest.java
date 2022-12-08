package org.exemple;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {
    @Test
    void test_wallet_created(){
        Wallet wallet= new Wallet(50000.0);
        double actual=wallet.getSolde();
        assertEquals(50000.0,actual);
    }
}
