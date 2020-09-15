
public class LedLight implements Light {
public String giveLight(){
	return "Led Light";
	
}
public static void main(String[] args) {
	LedLight l=new LedLight();
	System.out.println(l.giveLight());
}
}
