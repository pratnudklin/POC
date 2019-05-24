package th.co.integrationworks.poc.entity;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "EMAIL", length = 100, nullable= false)
    private String email;

    @Column(name = "NAME", length = 100, nullable= false)
    private String name;

    @Column(name="TENANT_ID", length = 100, nullable= false)
    private String tenantId;




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}
