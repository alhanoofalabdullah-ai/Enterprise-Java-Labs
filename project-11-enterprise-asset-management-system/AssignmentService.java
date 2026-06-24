package src.services;

import src.models.Asset;

public class AssignmentService {

    private AssetService assetService;
    private int assignments = 0;

    public AssignmentService(AssetService assetService) {
        this.assetService = assetService;
    }

    public void assignAsset(int assetId, String employeeName) {

        Asset asset = assetService.findAsset(assetId);

        if (asset != null && asset.getStatus().equals("AVAILABLE")) {
            asset.assign();
            assignments++;
        }
    }

    public int totalAssignments() {
        return assignments;
    }
}
