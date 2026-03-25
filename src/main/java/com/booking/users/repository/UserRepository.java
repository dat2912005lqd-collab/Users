package com.booking.users.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.booking.users.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByEmailAndPassword(String email, String password);

}
