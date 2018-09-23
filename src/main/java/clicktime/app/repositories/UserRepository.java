package clicktime.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import clicktime.app.entities.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	User findByUserNameAndPassword(String userName, String password);
}
