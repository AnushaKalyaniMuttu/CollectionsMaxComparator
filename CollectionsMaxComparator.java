package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsMaxComparator {

	public static void main(String[] args) {
		
		 List<Integer> sourceList = new ArrayList<>();
	        sourceList.add(1);
	        sourceList.add(2);
	        sourceList.add(3);
	        
	        
	        
	  int max= Collections.max(sourceList);
	  System.out.println(max);
	int maxValue= Collections.max(sourceList, Comparator.comparing(Integer:: intValue));
	System.out.println(maxValue);
	      	}
		
	}
