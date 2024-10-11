package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void sameObject() {
        Team t = team;
        assertEquals(true, team.equals(t));
    }

    @Test
    public void notSameClass() {
        String n = "no";
        assertEquals(false, team.equals(n));
    }

    @Test
    public void otherTT(){
        Object o = team;
        assertEquals(true, team.equals(o));
    }

    @Test
    public void otherTF(){
        Team t = new Team("test-team");  
        t.addMember("new");
        assertEquals(false, team.equals(t));
    }

    @Test
    public void otherF(){
        Team t = new Team("newteam");  
        assertEquals(false, team.equals(t));
    }

    @Test
    public void hashcodeTest(){
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void hashTest(){
        // instantiate t as a Team object
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }

}
