package vo;

public class FoodshopVO {
	String fname;
	String latitude;
	String longitude;
	String mainfood;
	String foodstyle;
	String image;
	String ttag;
	int discount;
	String holiday;
	int otime;
	int ctime;
	String tel;
	String park;
	
	public FoodshopVO() {}
	
	public FoodshopVO(String fname, String latitude, String longitude, String mainfood, String foodstyle, String image,
			String ttag, int discount, String holiday, int otime, int ctime, String tel, String park) {
		super();
		this.fname = fname;
		this.latitude = latitude;
		this.longitude = longitude;
		this.mainfood = mainfood;
		this.foodstyle = foodstyle;
		this.image = image;
		this.ttag = ttag;
		this.discount = discount;
		this.holiday = holiday;
		this.otime = otime;
		this.ctime = ctime;
		this.tel = tel;
		this.park = park;
	}
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
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
	
	public String getMainfood() {
		return mainfood;
	}
	
	public void setMainfood(String mainfood) {
		this.mainfood = mainfood;
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
	
	public String getTtag() {
		return ttag;
	}
	
	public void setTtag(String ttag) {
		this.ttag = ttag;
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
	
	public int getOtime() {
		return otime;
	}
	
	public void setOtime(int otime) {
		this.otime = otime;
	}
	
	public int getCtime() {
		return ctime;
	}
	
	public void setCtime(int ctime) {
		this.ctime = ctime;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getPark() {
		return park;
	}
	
	public void setPark(String park) {
		this.park = park;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ctime;
		result = prime * result + discount;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((foodstyle == null) ? 0 : foodstyle.hashCode());
		result = prime * result + ((holiday == null) ? 0 : holiday.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((mainfood == null) ? 0 : mainfood.hashCode());
		result = prime * result + otime;
		result = prime * result + ((park == null) ? 0 : park.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		result = prime * result + ((ttag == null) ? 0 : ttag.hashCode());
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
		if (ctime != other.ctime)
			return false;
		if (discount != other.discount)
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
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		if (mainfood == null) {
			if (other.mainfood != null)
				return false;
		} else if (!mainfood.equals(other.mainfood))
			return false;
		if (otime != other.otime)
			return false;
		if (park == null) {
			if (other.park != null)
				return false;
		} else if (!park.equals(other.park))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		if (ttag == null) {
			if (other.ttag != null)
				return false;
		} else if (!ttag.equals(other.ttag))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "FoodshopVO [fname=" + fname + ", latitude=" + latitude + ", longitude=" + longitude + ", mainfood="
				+ mainfood + ", foodstyle=" + foodstyle + ", image=" + image + ", ttag=" + ttag + ", discount="
				+ discount + ", holiday=" + holiday + ", otime=" + otime + ", ctime=" + ctime + ", tel=" + tel
				+ ", park=" + park + "]";
	}

}