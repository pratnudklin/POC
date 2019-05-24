package th.co.integrationworks.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.co.integrationworks.poc.entity.Tenant;

public interface TenantRepository extends JpaRepository<Tenant,String> {
}
