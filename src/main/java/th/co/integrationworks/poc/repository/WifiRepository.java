package th.co.integrationworks.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.co.integrationworks.poc.entity.Wifi;

public interface WifiRepository extends JpaRepository<Wifi,String> {
}
