package th.co.integrationworks.poc.entity;

import javax.persistence.*;

@Entity
@Table(name = "WIFI")
public class Wifi {

    @Id
    @Column(name = "WIFI_ID")
    private String wifiId;

    @Column(name = "USERNAME", length = 100, nullable= false)
    private String username;

    @Column(name = "PASSWORD", length = 100, nullable= false)
    private String password;

    @Column(name = "SSID", length = 100, nullable= false)
    private String ssid;


    @Column(name="TENANT_ID", length = 100, nullable= false)
    private String tenantId;

    public String getWifiId() {
        return wifiId;
    }

    public void setWifiId(String wifiId) {
        this.wifiId = wifiId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }
}
