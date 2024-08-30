package hubspot_challenge.hubspot.controller;

import hubspot_challenge.hubspot.model.Employee;
import hubspot_challenge.hubspot.service.InvitationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/health")
public class HealthController {

    private final InvitationsService invitationsService;

    @Autowired
    public HealthController(InvitationsService invitationsService) {
        this.invitationsService = invitationsService;
    }


    @GetMapping("version")
    public ResponseEntity<String> getversion(){
       return ResponseEntity.ok("V1");
    }

    @GetMapping("emps")
    public ResponseEntity<Employee> getEmployees(){
        Employee response = invitationsService.get();
        return ResponseEntity.ok(response);
    }

}
