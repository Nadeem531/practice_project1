package project07_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		Map<String,String>map = new HashMap<>();
		map.put("myname", "nadeem");
		map.put("company","mphasis" );
		Set<String> keys = map.keySet();
		for(String key:keys)
		{
			System.out.println(key+" "+map.get(key));
		}

	}

		
	}

