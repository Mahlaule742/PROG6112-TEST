/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author nmahl
 */

import java.util.Scanner;
public class Console
{
        @SuppressWarnings("empty-statement")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 1D array for city names
		String[] cities = {"Cape Town","Port Elizabeth","Pretoria"};
            
		
		// 2D array for sales info
                
		int [][] sales = new int[2][3];
		
		// getting input
		for (int i = 0; i < cities.length; i++){
		    System.out.print("Enter the number of sales for"+cities[i] + ":");
		    sales[i][0] = input.nextInt();
		    sales[i][1] = input.nextInt();
		    sales[i][2] = input.nextInt();
		}
		    System.out.println();
		    System.out.println("------------------------------------");
		    System.out.println("ROAD ACCIDENT REPORT");
		    System.out.println("------------------------------------");
		    System.out.println("City\t\tcar\tMOROR BIKE");
		    
		    for (int i = 0; i < cities.length; i++){
		        System.out.println(cities[i] + sales[i][0] + sales[i][1]);
		    }
		    
		    // calculating totals
		    
		    System.out.println();
		    System.out.println("------------------------------------");
		    System.out.println("total sales of all cities");
		    System.out.println("------------------------------------");
		    
		    for (int i = 0; i < cities.length; i++){
                    int[] totals = null;
		        totals[i] = sales[i][0] + sales[i][1];
		        System.out.println(cities[i] + " " + totals[i]);
		    }
            int[] totals = null;
                    
                    // finding the highest sales 
                    
                    int highestTotal = totals[0];
                    
                    for(int i = 1; i < cities.length; i++){
                        if (totals[i] > highestTotal){
                        }
                    }
                    
                    
		    
		    
	}
}