package com.tibjoz.checkmarxeval1.web.rest;

import com.tibjoz.checkmarxeval1.CheckmarxEval1App;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/**
 * Test class for the HelloResource REST controller.
 *
 * @see HelloResource
 */
@SpringBootTest(classes = CheckmarxEval1App.class)
public class HelloResourceIT {

    private MockMvc restMockMvc;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        HelloResource helloResource = new HelloResource();
        restMockMvc = MockMvcBuilders
            .standaloneSetup(helloResource)
            .build();
    }

    /**
     * Test hello
     */
    @Test
    public void testHello() throws Exception {
        restMockMvc.perform(get("/api/hello/hello"))
            .andExpect(status().isOk());
    }

    /**
     * Test test
     */
    @Test
    public void testTest() throws Exception {
        restMockMvc.perform(post("/api/hello/test"))
            .andExpect(status().isOk());
    }
}
