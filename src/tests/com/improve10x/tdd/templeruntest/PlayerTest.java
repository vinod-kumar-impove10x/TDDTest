package com.improve10x.tdd.templeruntest;

import com.improve10x.tdd.templerun.Coin;
import com.improve10x.tdd.templerun.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void givenNameExplorer_whenGetNameCalled_returnExplorer(){
        Player player = new Player("Explorer");
        assertEquals("Explorer",player.getName());
    }

    @Test
    public void givenNameExplorerWithSpaces_whenGetNameCalled_returnExplorerTrimmed(){
        Player player = new Player(" Explorer  ");
        assertEquals("Explorer",player.getName());
    }

    @Test
    public void givenNoHealth_whenGetHealthCalled_thenReturns100(){
        Player player = new Player("Name");
        assertEquals(100,player.getHealth());
    }

    @Test
    public void givenHealthMinusOne_thenThrowsInvalidHealthException() {
        assertThrows(Player.InvalidHealthException.class,
                () -> new Player("Name", -1),
                "Health should be between 0 and 100");
    }

    @Test
    public void givenHealth101_thenThrowsInvalidHealthException() {
        assertThrows(Player.InvalidHealthException.class,
                () -> new Player("Name", 101),
                "Health should be between 0 and 100");
    }

    @Test
    public void givenHealth100_whenGetHealthCalled_thenReturn100() throws Player.InvalidHealthException {
        Player player = new Player("Name", 100);
        assertEquals(100, player.getHealth());
    }

    @Test
    public void givenHealth90_whenGetHealthCalled_thenReturn90() throws Player.InvalidHealthException {
        Player player = new Player("Name", 90);
        assertEquals(90, player.getHealth());
    }

    @Test
    public void whenRunCalled_displaysRunningMessage() throws Player.InvalidHealthException {
        Player player = new Player("Name", 100);
        player.run();
        assertEquals("Running...!", outputStream.toString().trim());
    }

    @Test
    public void whenGetScoreCalled_returns0() throws Player.InvalidHealthException {
        Player player = new Player("Name");
        assertEquals(0, player.getScore());
    }

    @Test
    public void givenCoin10_whenGetScoreCalled_returns10() throws Player.InvalidHealthException {
        Player player = new Player("Name");
        player.collectCoin(new Coin(10));
        assertEquals(10, player.getScore());
    }

    @Test
    public void givenCoins10and20_whenGetScoreCalled_returns30() throws Player.InvalidHealthException {
        Player player = new Player("Name");
        player.collectCoin(new Coin(10));
        player.run();
        player.collectCoin(new Coin(20));
        assertEquals(30, player.getScore());
    }
}
