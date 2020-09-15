
public class TubeLight {
public static void main(String[] args) {
	Light l=new Light(){
		@Override
		public String giveLight(){
			return"TubeLight";
		}
	};
	System.out.println(l.giveLight());
}
}
