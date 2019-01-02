package oj;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class ThreePointOnALine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int GNum = scanner.nextInt();
		for (int i = 0; i < GNum; i++) {
			int flag = 0;
			int PNum = scanner.nextInt();
			Vector<Float> vec1 = new Vector<Float>();
			vec1.clear();
			Vector<Float> vec2 = new Vector<Float>();
			vec2.clear();
			Vector<Float> vec3 = new Vector<Float>();
			vec3.clear();
			Vector<Float> vec4 = new Vector<Float>();
			vec4.clear();
			for (int j = 0; j < PNum; j++) {
				vec1.add(scanner.nextFloat());
				vec2.add(scanner.nextFloat());
			}
			if(PNum >= 3) {
				for (int j = 0; j < PNum; j++) {
					vec3.clear();
					vec4.clear();
					for (int j2 = j+1; j2 < vec1.size(); j2++) {
						vec3.add(vec1.get(j2) - vec1.get(j));
					}
					for (int j2 = j+1; j2 < vec1.size(); j2++) {
						if(vec3.get(j2-j-1) != 0)
							vec4.add((vec2.get(j2) - vec2.get(j)) / vec3.get(j2-j-1));
						else
							vec4.add((float) 100000);
					}
					Collections.sort(vec4);
					for (int j2 = 1; j2 < vec4.size(); j2++) {
						if(Math.abs(vec4.get(j2-1) - vec4.get(j2)) < 0.00000001) {
							flag = 1;
							break;
						}
					}
					if(flag == 1)
						break;
				}
				if(flag == 0)
					System.out.println("No");
				else
					System.out.println("Yes");
			}
			else
				System.out.println("No");
		}
        scanner.close();
	}
}
