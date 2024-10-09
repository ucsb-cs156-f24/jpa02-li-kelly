package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        // <https://bit.ly/cs156-f24-teams>
        assertEquals("Kelly", Developer.getName());
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    
    @Test
    public void getGithubId_returns_correct_githubId() {
        // <https://bit.ly/cs156-f24-teams>
        assertEquals("li-kelly", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f24-16", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Claire"),"Team should contain Claire");
        assertTrue(t.getMembers().contains("Jayden"),"Team should contain Jayden");
        assertTrue(t.getMembers().contains("Kelly"),"Team should contain Kelly");
        assertTrue(t.getMembers().contains("Rohan"),"Team should contain Rohan");
        assertTrue(t.getMembers().contains("Shiraan"),"Team should contain Shiraan");
        assertTrue(t.getMembers().contains("Tiffany"),"Team should contain Tiffany");
    }

    @Test
    public void getTeam_returns_team_with_Claire(){
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Claire"), "Team should contain Claire");
    }

    @Test
    public void getTeam_returns_team_with_Jayden() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Jayden"),"Team should contain Jayden");
    }

    @Test
    public void getTeam_returns_team_with_Kelly() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Kelly"),"Team should contain Kelly");
    }
    
    @Test
    public void getTeam_returns_team_with_Rohan() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Rohan"),"Team should contain Rohan");
    }

    @Test
    public void getTeam_returns_team_with_Shiraan() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Shiraan"),"Team should contain Shiraan");
    }

    @Test
    public void getTeam_returns_team_with_Tiffany() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Tiffany"),"Team should contain Tiffany");
    }

}
