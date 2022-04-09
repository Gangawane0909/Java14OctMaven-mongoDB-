package Java14octMaven.Java14octMaven.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee,String> {
}
