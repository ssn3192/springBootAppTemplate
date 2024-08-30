package hubspot_challenge.hubspot.service.impl;

import hubspot_challenge.hubspot.dao.InvitationsDao;
import hubspot_challenge.hubspot.model.Employee;
import hubspot_challenge.hubspot.service.InvitationsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class InvitationsServiceImpl   implements InvitationsService {

    private final InvitationsDao invitationsDao;
    Logger LOG = LoggerFactory.getLogger(InvitationsServiceImpl.class);

    public InvitationsServiceImpl(InvitationsDao invitationsDao) {
        this.invitationsDao = invitationsDao;
    }

    @Override
    public Employee get() {
       return invitationsDao.getEmployees();
    }
}
