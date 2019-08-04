package com.dbspshift.greenpark.micfin.integration.controllers;

import com.dbspshift.greenpark.micfin.controllers.MicFinRestController;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(MicFinRestController.class)
public class MicFinRestControllerTest {

    @Autowired
    private MockMvc mockMvc;


    public void registerMFI(){

    }

}
