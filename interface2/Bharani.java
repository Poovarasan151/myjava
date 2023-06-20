package trichy;

public class Bharani implements Govt,FranceGovt{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bharani bb = new Bharani();
		bb.follow_traffic_rules();
		System.out.println(Bharani.no_helmet_fine);
		bb.play();
		
		Govt traffic_police = new Bharani();
		traffic_police.follow_traffic_rules();

	}
	
	public void play()
	{
		System.out.println("play badminton");
	}

	@Override
	public void follow_traffic_rules() {
		
		System.out.println("two wheeler rules");
		
	}

	@Override
	public void go_by_flight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keep_visa() {
		// TODO Auto-generated method stub
		
	}

}
