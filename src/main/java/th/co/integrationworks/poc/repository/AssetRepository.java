package th.co.integrationworks.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import th.co.integrationworks.poc.entity.Asset;

public interface AssetRepository  extends JpaRepository<Asset,String> {
}
