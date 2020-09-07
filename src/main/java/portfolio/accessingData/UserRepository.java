package portfolio.accessingData;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import portfolio.models.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
