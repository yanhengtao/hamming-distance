package com.hamming.test;

import com.hamming.util.HammingDistance;

public class HammingDistanceTest {

	public static void main(String[] args) {
		String str1 = "abcdefg";
		String str2 = "aacceeg";
		HammingDistance hd = new HammingDistance();
		int distance = hd.getDistance(str1, str2);
		System.out.println("distance is " + distance);
		int weight = hd.getWeight(255);
		System.out.println("weight is " + weight);
	}

}
