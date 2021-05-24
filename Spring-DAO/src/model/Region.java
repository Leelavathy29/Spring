package model;

public class Region {

	String regionName = null;
	
	int regionId = 0;

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	@Override
	public String toString() {
		return "Region [regionName=" + regionName + ", regionId=" + regionId + "]";
	}
	
	
	
	
}
