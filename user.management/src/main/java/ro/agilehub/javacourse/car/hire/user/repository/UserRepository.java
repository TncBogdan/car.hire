package ro.agilehub.javacourse.car.hire.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.agilehub.javacourse.car.hire.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

//    Optional<User> findByUsernameIgnoreCase(String username);
}