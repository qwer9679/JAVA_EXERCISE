package icehs.science.chapter10.mobiles;

public class Galaxy extends Mobile implements GooPlay{
	
	private String osVersion;

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	@Override
	public void charge(int time) {
		System.out.println("Galaxy : " + time + "분 충전했더니 Full!!!");
		
	@Override
	public void buy(String kind, int price) {
		System.out.println("Galaxy : " + kind + "을" + price + "원에 구입하엿습니다.");
	}
	}
}
