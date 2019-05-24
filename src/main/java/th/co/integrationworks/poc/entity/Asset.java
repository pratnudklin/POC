package th.co.integrationworks.poc.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ASSET")
public class Asset {

    @Id
    @Column(name = "ASSET_ID")
    private String assetId;

    @Column(name = "ASSET_NAME", length = 10, nullable= false)
    @NotNull
    private String assetName;

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }
}
