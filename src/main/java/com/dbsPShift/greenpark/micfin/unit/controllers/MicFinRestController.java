package com.dbsPShift.greenpark.micfin.unit.controllers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
