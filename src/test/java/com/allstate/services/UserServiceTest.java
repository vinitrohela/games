package com.allstate.services;

import com.allstate.entities.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value = {"/sql/seed.sql"})
public class UserServiceTest {

    @Autowired
    private UserService userservices;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateUser() throws Exception {

        User user = this.userservices.create("Raman");
        assertEquals(1, user.getId());
        assertEquals("Raman", user.getName());
    }

    @Test
    public void shouldCreateUserWithBalance() throws Exception {

        User user = this.userservices.createUserWithBalance("vinit", 10000);
        assertEquals(1, user.getId());
        assertEquals("vinit", user.getName());
    }
}