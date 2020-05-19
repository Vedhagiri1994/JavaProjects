package com.lao.collection;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> linkList= new LinkedList<Integer>();
		
		linkList.add(10);
		linkList.add(12);
		linkList.add(20);
		linkList.add(15);
		linkList.add(07);
		
		System.out.println("Add all values : "+linkList);
		
		// add the first index
		
		linkList.addFirst(03);
		System.out.println("Add new index in front : " +linkList);
		
		//add the last index
		
		linkList.addLast(32);
		System.out.println("Add new index in back : "+linkList);
		
		// get the first index
		linkList.getFirst();
		System.out.println("Retrive the first index : " +linkList);
		
		//get the any one index
		linkList.get(3);
		System.out.println("Retrive the 3rd index : " +linkList);
		
		//remove the first index
		linkList.removeFirst();
		System.out.println("Remove the first index : "  +linkList);
		
		//remove last index
		linkList.removeLast();
		System.out.println("Remove the last index : "  +linkList);
		
		//delete the element
		linkList.poll();
		System.out.println("Delete the all : " +linkList);
		
		//delete the first element
		linkList.pollFirst();
		System.out.println("Delete first index : " +linkList);
		
		//delete the last element
		linkList.pollLast();
		System.out.println("Delete last index : " +linkList);
		
		//remove first occurrence
		linkList.removeFirstOccurrence(12);
		System.out.println("Remove first Occurrence : " +linkList);
		
		//remove last occurrence
		linkList.removeLastOccurrence(15);
		System.out.println("Remove last Occurrence : " +linkList);
	}

}
