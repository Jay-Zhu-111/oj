package oj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			try {
				Map<Long, Integer> map = new HashMap<Long, Integer>();
				Long size = scanner.nextLong();
				for (Long j = (long) 0; j < size; j++) {
					Long temp = scanner.nextLong();
					int count;
					if(map.containsKey(temp)) {
						count = map.get(temp);
						count ++;
						if(count == 3)
							map.remove(temp);
						else
							map.put(temp, count);
					}
					else
						map.put(temp, 1);		
				}
				System.out.println(map.keySet().toArray()[0]);
			} catch (Exception e) {
				break;
			}
		}
        scanner.close();
	}
}
