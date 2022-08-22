package com.mindgate.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.mindgate.pojo.Employee;

public class CollectionsMain {
	
	public static void main(String[] args) {
		List<String> nameList= new ArrayList<>();
		System.out.println(nameList.size());
		nameList.add("pandey");
		nameList.add("don");
		nameList.add("chagan");
		nameList.add("pandey");
		nameList.add("siraj");
		nameList.add("akki");
		nameList.add("pandey");
		System.out.println(nameList);
		System.out.println(nameList.size());
		nameList.remove(3);
		System.out.println(nameList);
		System.out.println(nameList.size());
		
		System.out.println();
		List<Employee>  employeeList= new ArrayList<>();
		
		
	Employee employee1 = new Employee(101,"vj",5000);
	Employee employee2 = new Employee(102, "sj",3000);
	Employee employee3 = new Employee(103, "aj",2000);
	
	
	
	employeeList.add(employee1);
	employeeList.add(employee2);
	employeeList.add(employee3);
	
	
	for(Employee e:employeeList)
	{
		System.out.println(e);
	}
	
	System.out.println();
	System.out.println(employeeList);
	
	 System.out.println();
	 
	 Set<String> nameSet= new HashSet<>();
	 nameSet.add("yash");
	 nameSet.add("harihar");
	 nameSet.add("yash");
	 nameSet.add("akki");
	 nameSet.add("null");
	 nameSet.add("sachin");
	 nameSet.add("akki");
	 
	 System.out.println(nameSet);
	 System.out.println(nameSet.size());
	 
	 
	 System.out.println();
	 
	 SortedSet<String> sortedNameSet = new TreeSet<>();
	 
	 
	 sortedNameSet.add("hero");
	 sortedNameSet.add("heena");
	 sortedNameSet.add("hari");
	 sortedNameSet.add("hero");
	 sortedNameSet.add("sanagm");
	 sortedNameSet.add("satya");
	 sortedNameSet.add("null");
	 
	 
	 System.out.println(sortedNameSet);
	 
	 
	 System.out.println();
	 
	 
	HashMap<Integer, String> employeeMap = new HashMap<>();
	
	employeeMap.put(101, "ai");
	employeeMap.put(102, "ai");
	employeeMap.put(103, "ai");
	employeeMap.put(104, "ai");
	
	System.out.println(employeeMap);
	
	Integer i=40;
	System.out.println(i.hashCode());
	
	
	System.out.println();
	
	SortedMap<Integer, String> employeeSortedMap = new TreeMap<>();
	
	employeeSortedMap.put(101, "ajay");
	employeeSortedMap.put(102, "jay");
	employeeSortedMap.put(103, "vjay");
	employeeSortedMap.put(108, "ajay");
	employeeSortedMap.put(106, "jay");
	
	System.out.println(employeeSortedMap);
	
	
	
	
	
	
	
	 
	}
	
	

}
