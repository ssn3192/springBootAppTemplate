package hubspot_challenge.hubspot.dao;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfig {
    Logger LOG = LoggerFactory.getLogger(DataConfig.class);

    @Value("${hubspot_challenge.hubsport.get.employee}")
    private String getEmployeeUrl;

    @PostConstruct
    public void init(){
        LOG.info("Hubspot challenge");
        LOG.info(getInvitationUrl());
    }

    public String getInvitationUrl(){
        return  getEmployeeUrl;
    }
}
