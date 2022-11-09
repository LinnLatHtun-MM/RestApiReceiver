package per.llt.restapireceiver.service;


import org.springframework.stereotype.Service;
import per.llt.restapireceiver.response.*;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Linn Lat Htun
 * @created: 10/27/2022
 * @project: restapicaller
 * @package: per.llt.restapireceiver.service
 */

@Service
public class ReceiverServiceImpl implements ReceiverService {

    @Override
    public String callSingleString() {
        return "Welcome From Receiver";
    }

    @Override
    public Salary callSingleObject() {
        return new Salary(400000.00);
    }

    @Override
    public Employee callResponseObject() {
        Employee employee = new Employee(1L, "Linn Lat Htun", "Yangon", "0978787878789", "Master in Computer Science");
        return employee;
    }

    @Override
    public List<String> callResponseStringList() {
        return Arrays.asList("Linn Lat Htun", "Ms.Linn Lat Htun");
    }

    @Override
    public List<Employee> callResponseObjectList() {
        return Arrays.asList(
                new Employee(1L, "Linn Lat Htun", "Yangon", "0978787878789", "Master in Computer Science"),
                new Employee(2L, "Daw Linn Lat Htun", "Yangon", "0978787878770", "Work At CB Bank")
        );
    }

    @Override
    public List<EmployeeAndDept> callResponseCustomObjectList() {
        return Arrays.asList(
                new EmployeeAndDept("Linn Lat Htun", "IT Department")
                , new EmployeeAndDept("Linn Lat Htun", "IT")
        );
    }

    @Override
    public ResponseObject callResponseNestedObject() {
        StatusObject statusObject = new StatusObject();
        statusObject.setStatus("Success");
        statusObject.setMessage("No Eror");

        ResponseObject responseObject = new ResponseObject(Instant.now().toString(), statusObject);
        return responseObject;
    }

    @Override
    public ResponseObjectList callResponseNestedObjectAndNestedObjectList() {
        StatusObject statusObject = new StatusObject("Success", "No Error");
        ResponseObjectList responseObjectList = new ResponseObjectList(
                Instant.now().toString(),
                statusObject,
                Arrays.asList(
                        new Employee(1L, "Linn Lat Htun", "Yangon", "0978787878789", "Master in Computer Science"),
                        new Employee(2L, "Daw Linn Lat Htun", "Yangon", "0978787878770", "Work At CB Bank")
                )
        );

        return responseObjectList;
    }
}
