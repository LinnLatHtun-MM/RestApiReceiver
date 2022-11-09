package per.llt.restapireceiver.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Linn Lat Htun
 * @created: 10/27/2022
 * @project: restapicaller
 * @package: per.llt.restapireceiver.response
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeAndDept {
    private String empName;
    private String department;
}
