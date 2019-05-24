package th.co.integrationworks.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.co.integrationworks.poc.entity.User;

public interface UserRepository extends JpaRepository<User,String> {
}
