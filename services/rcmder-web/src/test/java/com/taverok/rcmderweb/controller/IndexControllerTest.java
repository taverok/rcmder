package com.taverok.rcmderweb.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@WebMvcTest
public class IndexControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void indexPageTest() throws Exception {
        MockHttpServletResponse response = mvc.perform(MockMvcRequestBuilders.get("/")
                .accept(MediaType.TEXT_HTML))
                .andReturn()
                .getResponse();

        assertEquals(response.getStatus(), HttpStatus.OK.value());
        assertEquals(response.getContentAsString(), "OK");
    }
}