package src.services;

import src.models.Asset;
import java.util.*;

public class AssetService {

    private List<Asset> assets = new ArrayList<>();
    private int nextId = 1;

    public void registerAsset(String category, String name, String serialNumber) {
        assets.add(new Asset(nextId++, category, name, serialNumber));
    }

    public Asset findAsset(int id) {
        for (Asset asset : assets) {
            if (asset.getId() == id) {
                return asset;
            }
        }
        return null;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public int totalAssets() {
        return assets.size();
    }

    public int countByStatus(String status) {
        int count = 0;

        for (Asset asset : assets) {
            if (asset.getStatus().equals(status)) {
                count++;
            }
        }

        return count;
    }
}
