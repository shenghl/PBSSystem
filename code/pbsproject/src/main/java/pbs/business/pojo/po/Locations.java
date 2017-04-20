package pbs.business.pojo.po;

public class Locations {

	private double lat;
	private double lng;
	private double cLat;
	private double cLng;
	
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public double getcLat() {
		return cLat;
	}
	public void setcLat(double cLat) {
		this.cLat = cLat;
	}
	public double getcLng() {
		return cLng;
	}
	public void setcLng(double cLng) {
		this.cLng = cLng;
	}
	@Override
	public String toString() {
		return "Locations [lat=" + lat + ", lng=" + lng + ", cLat=" + cLat
				+ ", cLng=" + cLng + "]";
	}
	
	
}
