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
		System.out.println("Galaxy : " + time + "�� �����ߴ��� Full!!!");
		
	@Override
	public void buy(String kind, int price) {
		System.out.println("Galaxy : " + kind + "��" + price + "���� �����Ͽ����ϴ�.");
	}
	}
}
