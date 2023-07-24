package com.improve10x.tdd.templeruntest;

import com.improve10x.tdd.templerun.Player;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    private ByteArrayOutputStream outputStream;
    @BeforeEach
    public void setup() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }
    /*
    Given - Providing some input
    When - Situation or a set of actions
    Then - Result or output
     */

    @Test
    public void givenNameNull_whenGetNameCalled_returnEmpty(){
        Player player = new Player(null);
        assertEquals("",player.getName());
    }

    @Test
    public void givenNameEmpty_whenGetNameCalled_returnEmpty(){
        Player player = new Player("");
        assertEquals("",player.getName());
    }
}
