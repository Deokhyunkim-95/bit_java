package vo;

public class FoodshopVO {

	int fid;
	String fname;
	String address;
	String latitude;
	String longitude;
	String foodstyle;
	String image;
	String loc;
	int discount;
	String holiday;
	String octime;
	String tel;
	
	
	public FoodshopVO() {	}


	public FoodshopVO(int fid, String fname, String address, String latitude, String longitude, String foodstyle,
			String image, String loc, int discount, String holiday, String octime, String tel) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.foodstyle = foodstyle;
		this.image = image;
		this.loc = loc;
		this.discount = discount;
		this.holiday = holiday;
		this.octime = octime;
		this.tel = tel;
	}


	public int getFid() {
		return fid;
	}


	public void setFid(int fid) {
		this.fid = fid;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	public String getFoodstyle() {
		return foodstyle;
	}


	public void setFoodstyle(String foodstyle) {
		this.foodstyle = foodstyle;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}


	public int getDiscount() {
		return discount;
	}


	public void setDiscount(int discount) {
		this.discount = discount;
	}


	public String getHoliday() {
		return holiday;
	}


	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}


	public String getOctime() {
		return octime;
	}


	public void setOctime(String octime) {
		this.octime = octime;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + discount;
		result = prime * result + fid;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((foodstyle == null) ? 0 : foodstyle.hashCode());
		result = prime * result + ((holiday == null) ? 0 : holiday.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((loc == null) ? 0 : loc.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((octime == null) ? 0 : octime.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodshopVO other = (FoodshopVO) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (discount != other.discount)
			return false;
		if (fid != other.fid)
			return false;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (foodstyle == null) {
			if (other.foodstyle != null)
				return false;
		} else if (!foodstyle.equals(other.foodstyle))
			return false;
		if (holiday == null) {
			if (other.holiday != null)
				return false;
		} else if (!holiday.equals(other.holiday))
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (latitude == null) {
			if (other.latitude != null)
				return false;
		} else if (!latitude.equals(other.latitude))
			return false;
		if (loc == null) {
			if (other.loc != null)
				return false;
		} else if (!loc.equals(other.loc))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		if (octime == null) {
			if (other.octime != null)
				return false;
		} else if (!octime.equals(other.octime))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "FoodshopVO [fid=" + fid + ", fname=" + fname + ", address=" + address + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", foodstyle=" + foodstyle + ", image=" + image + ", loc=" + loc
				+ ", discount=" + discount + ", holiday=" + holiday + ", octime=" + octime + ", tel=" + tel + "]";
	}
	
}