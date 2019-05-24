package th.co.integrationworks.poc.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TENANT")
public class Tenant {

    @Id
    @Column(name = "TENANT_ID")
    private String tenantId;

    @Column(name = "COMPANY_NAME")
    private String companyName;


    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
