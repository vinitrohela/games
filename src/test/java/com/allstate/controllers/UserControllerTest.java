package com.allstate.controllers;

import com.allstate.entities.User;
import com.allstate.services.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private UserService userService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

//    @Test
//    public void shouldCreateUser() throws Exception {
//        User user = new User("Rakesh");
//
//        given(this.userService.create(Mockito.any(User.class)))
//                .willReturn(user);
//
//        MockHttpServletRequestBuilder request = post("/users")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\"name\": \"Rakesh\"}");
//
//        this.mvc.perform(request)
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name", is("Rakesh")));
//
//    }
}