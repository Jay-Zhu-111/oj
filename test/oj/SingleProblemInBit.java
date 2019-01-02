package oj;

import java.util.Scanner;
import java.util.Vector;

public class SingleProblemInBit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			long result = 0;
			Vector<Long> vec = new Vector<Long>();
			Long size = scanner.nextLong();
			for (Long j = (long) 0; j < size; j++) {
				vec.add(scanner.nextLong());
			}
			for (Long i = (long) 0; i < 64; i++) {
				int sum = 0;
				for (int j = 0; j < vec.size(); j++) {
					sum += (vec.get(j) >> i & 1);
				}
				result |= ((sum % 3) << i);
			}
			System.out.println(result);
		}
        scanner.close();
	}
}
