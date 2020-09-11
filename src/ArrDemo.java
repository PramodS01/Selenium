import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrDemo {
public static void main(String[] args) {
	Set <String> st = new HashSet<>();
	st.add("a");
	st.add("b");
	st.add("c");
	st.add("d");
	List<String> lst =new ArrayList<>();
	lst.addAll(st);
	for (String val:lst) {
		System.out.println(val);
	}
	System.out.println(lst.getClass());
}
}
