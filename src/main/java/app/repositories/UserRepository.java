package app.repositories;

import app.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Created by cjl20 on 2015/11/24.
 */
public interface UserRepository extends CrudRepository<User, String> {

    List<User> findAll();

    User findByUsername(String username);

    User findByUsernameAndPassword(String username, String password);

}
