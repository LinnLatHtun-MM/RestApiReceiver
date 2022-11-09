package per.llt.restapireceiver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.llt.restapireceiver.response.*;
import per.llt.restapireceiver.service.ReceiverService;

import java.util.List;

/**
 * @author: Linn Lat Htun
 * @created: 10/27/2022
 * @project: restapicaller
 * @package: per.llt.restapireceiver.controller
 */

@RestController
@Slf4j
@RequestMapping("/api")
public class ReceiverController {

    @Autowired
    ReceiverService receiverService;

    @GetMapping("/responseSingleString")
    public ResponseEntity singleStringMethod() {
        try {
            log.info("====Start Calling Single String Method====");
            String response = receiverService.callSingleString();
            log.info("Response Data: {}", response);
            log.info("====End Calling Single String Method====");
            return ResponseEntity.ok().body(response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Internal Server Error from Receiver : {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }

    }

    @GetMapping("/responseSingleObject")
    public ResponseEntity singleObjectMethod() {
        try {
            log.info("====Start Calling Single Object Method====");
            Salary response = receiverService.callSingleObject();
            log.info("Response Data: {}", response);
            log.info("====End Calling Single Object Method====");
            return ResponseEntity.ok().body(response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Internal Server Error from Receiver : {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }

    }

    @GetMapping("/responseObject")
    public ResponseEntity responseObjectMethod() {
        try {
            log.info("====Start Calling Response Object Method====");
            Employee response = receiverService.callResponseObject();
            log.info("Response Data: {}", response);
            log.info("====End Calling Response Object Method====");
            return ResponseEntity.ok().body(response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Internal Server Error from Receiver : {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }

    }

    @GetMapping("/responseStringList")
    public ResponseEntity responseStringListMethod() {
        try {
            log.info("====Start Calling Response String List Method====");
            List<String> response = receiverService.callResponseStringList();
            log.info("Response Data: {}", response);
            log.info("====End  Calling Response String List Method====");
            return ResponseEntity.ok().body(response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Internal Server Error From Receiver: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/responseObjectList")
    public ResponseEntity responseObjectListMethod() {
        try {
            log.info("====Start Calling Response Object List Method====");
            List<Employee> response = receiverService.callResponseObjectList();
            log.info("Response Data: {}", response);
            log.info("====End  Calling Response Object List Method====");
            return ResponseEntity.ok().body(response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Internal Server Error From Receiver: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/responseCustomObjectList")
    public ResponseEntity responseCustomObjectListMethod() {
        try {
            log.info("====Start Calling Response Custom Object List Method====");
            List<EmployeeAndDept> response = receiverService.callResponseCustomObjectList();
            log.info("Response Data: {}", response);
            log.info("====End  Calling Response Custom Object List Method====");
            return ResponseEntity.ok().body(response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Internal Server Error From Receiver: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/responseNestedObject")
    public ResponseEntity responseNestedObjectMethod() {
        try {
            log.info("====Start Calling Response Nested Object Method====");
            ResponseObject response = receiverService.callResponseNestedObject();
            log.info("Response Data: {}", response);
            log.info("====End  Calling Response Nested Object Method====");
            return ResponseEntity.ok().body(response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Internal Server Error From Receiver: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/responseNestedObjectAndNestedObjectList")
    public ResponseEntity responseNestedObjectAndNestedObjectListMethod() {
        try {
            log.info("====Start Calling Response Nested Object And Nested Object List Method====");
            ResponseObjectList response = receiverService.callResponseNestedObjectAndNestedObjectList();
            log.info("Response Data: {}", response);
            log.info("====End Calling Response Nested Object And Nested Object List Method====");
            return ResponseEntity.ok().body(response);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Internal Server Error From Receiver: {}", e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

}
