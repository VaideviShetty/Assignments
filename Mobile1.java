package week1.day1;

public class Mobile1 {
public void makeCall() {
	System.out.println("Make a call to friend");
	String mobileModel= "Redmi11";
	float mobileWeight=125.6f;
}

public void sendMgs() {
	System.out.println("Hi,How are you?");
	boolean isFullCharged= true;
	int mobileCost= 23500;
	
}
	public static void main(String[] args) {
	Mobile1 obj=new Mobile1();
	obj.makeCall();
	obj.sendMgs();
	System.out.println("This is my mobile");

	}

}
