package com.dbsPShift.greenpark.micfin.repository;

import com.dbsPShift.greenpark.micfin.beans.MFI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

public interface CustomMFIRepository<T,Id> {

     List<MFI> findByNameStartingWith(String regexp);
}
