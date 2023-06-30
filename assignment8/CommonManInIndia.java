package india.newDelhi;

import tamilnadu.chennai.TrafficRules;

public class CommonManInIndia implements TrafficRulesDelhi,TrafficRules{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonManInIndia cmi = new CommonManInIndia();
		cmi.dontGoByDieselVehicle();
		cmi.goByBicycle();
		cmi.goByDieselVehicle();
		cmi.goByBycycle();

	}

	@Override
	public void goByBycycle() {
		// TODO Auto-generated method stub
		System.out.println("delhi");
		
	}

	@Override
	public void dontGoByDieselVehicle() {
		// TODO Auto-generated method stub
		System.out.println("diesel");
		
	}

	@Override
	public void goByDieselVehicle() {
		// TODO Auto-generated method stub
		System.out.println("vehicle");
		
	}

	@Override
	public void goByBicycle() {
		// TODO Auto-generated method stub
		System.out.println("india");
		
	}

}
