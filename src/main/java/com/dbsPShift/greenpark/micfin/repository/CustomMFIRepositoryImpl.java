package com.dbsPShift.greenpark.micfin.repository;

import com.dbsPShift.greenpark.micfin.beans.MFI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

/**
 * Use this for complex MongoDB queries
 */
public class CustomMFIRepositoryImpl implements CustomMFIRepository<MFI,String>{

    @Autowired
    MongoTemplate mongoTemplate;


    @Override
    public List<MFI> findByNameStartingWith(String regexp) {
       return null;
    }
}
