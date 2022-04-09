package Java14octMaven.Java14octMaven.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private  EmployeeRepo employeeRepo;

    @PostMapping("saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){

        employeeRepo.save(employee);
        return "Saved..";
    }

}
