package hubspot_challenge.hubspot.dao;

import hubspot_challenge.hubspot.model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static java.util.Objects.requireNonNull;

@Repository
public class InvitationsDao{

    private final DataConfig dataConfig;

    //autowire
    InvitationsDao(DataConfig dataConfig) {
        this.dataConfig = requireNonNull(dataConfig);
    }

    public Employee getEmployees() {
        System.out.println(this.dataConfig.getInvitationUrl());
        RestTemplate restTemplate = new RestTemplate();
        Employee emp = restTemplate.getForObject(this.dataConfig.getInvitationUrl(), Employee.class);
        return emp;
    }
}
