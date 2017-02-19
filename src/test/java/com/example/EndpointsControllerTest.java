package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by oswaldosalazar on 2/18/17.
 */

@RunWith(SpringRunner.class)
@WebMvcTest(EndpointsController.class)
public class EndpointsControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testEndpoints() throws Exception {
        RequestBuilder request1 = MockMvcRequestBuilders.patch("/tasks");

        this.mvc.perform(request1)
                .andExpect(status().isOk())
                .andExpect(content().string("You PATCHed to /tasks"));

        RequestBuilder request2 = MockMvcRequestBuilders.delete("/tasks");

        this.mvc.perform(request2)
                .andExpect(content().string("You DELETEd to /tasks"));
    }

}
