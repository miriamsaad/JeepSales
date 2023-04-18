/**
 * 
 */
package com.promineotech.jeep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.promineotech.jeep.dao.JeepSalesDao;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import lombok.extern.slf4j.Slf4j;
import java.util.List;



@Service
@Slf4j

public class DefaultJeepSalesService implements JeepSalesService {
  
 @Autowired
  private JeepSalesDao jeepSalesDao; 
  
  @Override
  public List<Jeep> fetchJeeps(JeepModel model, String trim) {
    log.info("The fetchJeeps method was called with model={} and trim={}", 
        model, trim);
  
return jeepSalesDao.fetchJeeps(model,trim);

}
}
