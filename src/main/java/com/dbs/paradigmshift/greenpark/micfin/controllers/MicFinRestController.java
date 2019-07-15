package com.dbs.paradigmshift.greenpark.micfin.controllers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.slf4j.SLF4JLogger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by gayathrig on 15/07/2019.
 */
@Controller
@RequestMapping("/micfin")
public class MicFinRestController {

    private final Logger log= LogManager.getLogger(MicFinRestController.class);


    @RequestMapping(method= RequestMethod.GET , path = "/getStatus")
    public @ResponseBody
    String getStatus(){
        return "ALIVE!";
    }


}
