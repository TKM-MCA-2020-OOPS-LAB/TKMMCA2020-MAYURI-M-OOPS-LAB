package co4;
import java.util.*;
import java.util.stream.*;
public class convert_hash_into_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
	      map.put("1", "Anandhu");
	      map.put("2", "Monisha");
	      map.put("3", "Anusree");
	      map.put("4", "Manu");
	      map.put("5", "Manju");
	      System.out.println("HashMap = " + map);
	      Map<String, String> treeMap = new TreeMap<>();
	      treeMap.putAll(map);
	      System.out.println("TreeMap (HashMap to TreeMap) " + treeMap);
	}

}
