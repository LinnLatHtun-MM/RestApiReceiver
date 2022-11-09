package per.llt.restapireceiver.service;

import per.llt.restapireceiver.response.*;

import java.util.List;

/**
 * @author: Linn Lat Htun
 * @created: 10/27/2022
 * @project: restapicaller
 * @package: per.llt.restapireceiver.service
 */

public interface ReceiverService {
    String callSingleString();

    Salary callSingleObject();

    Employee callResponseObject();

    List<String> callResponseStringList();

    List<Employee> callResponseObjectList();

    List<EmployeeAndDept> callResponseCustomObjectList();

    ResponseObject callResponseNestedObject();

    ResponseObjectList callResponseNestedObjectAndNestedObjectList();

}
