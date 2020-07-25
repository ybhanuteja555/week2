package com.epam.week2;
import java.util.*;

public class Automobile {

	public static void main(String[] args) {
		int NumberOfVehicles = 0,CostOfEachVehicle = 0,totalVehicle_Cost=0,i=0,totCost=0;
		String s[]= {"Swift","Benz","Activa","Beneli"};
		int[] a = new int[4];
        char n1;
        Vehicles collect;
        Boolean n=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("select different Vehicles which are given below");
        while(n)
        {
        	System.out.println("Available Vehicles:");
        	System.out.println("1.Swift");
        	System.out.println("2.Benz");
        	System.out.println("3.Activa");
        	System.out.println("4.Beneli");
        	System.out.println("Select from the above Vehicles");
        	switch(sc.next().charAt(0))
        	{
        	case '1': System.out.println("Enter the Number of vehicles of Swift: ");
        			  NumberOfVehicles=sc.nextInt();
        			  System.out.println("Enter the Cost of each vehicle: ");
        			  CostOfEachVehicle=sc.nextInt();
        			  collect= new Swift();
          			  totCost=collect.totalCost(NumberOfVehicles, CostOfEachVehicle);
        			  totalVehicle_Cost=totalVehicle_Cost+totCost;
        			  System.out.println("Total cost of the vehicle:" + totCost);
        			  a[0]+=NumberOfVehicles*CostOfEachVehicle;
        			  
        			  totCost=0;
        			  System.out.println("Total cost of all vehicles:"+totalVehicle_Cost+"Rupees");
        			  System.out.println("do you want to add any other Vehicle(y/n)");
   	        	      n1=sc.next().charAt(0);
   	        	      if(n1=='y'|| n1=='Y')
   	        	        { 
   	        	    	  n=true;
   	        	          break;
   	        	        }
   	        	     else
   	        		    {
   	        	    	 n=false;
   	                     System.out.println("Total cost of all vehicles:"+totalVehicle_Cost+"Rupees");
   	                     break;
   	                    }
        	case '2': System.out.println("Enter the Number of vehicles of Benz: ");
			  NumberOfVehicles=sc.nextInt();
			  System.out.println("Enter the Cost of each vehicle: ");
			  CostOfEachVehicle=sc.nextInt();
			  collect= new Benz();
			  totCost=collect.totalCost(NumberOfVehicles, CostOfEachVehicle);
			  totalVehicle_Cost=totalVehicle_Cost+totCost;
			  System.out.println("Total cost of the vehicle:" + totCost);
			  a[1]+=totCost;
			  
			  totCost=0;
			  System.out.println("Total cost of all vehicles:"+totalVehicle_Cost+"Rupees");
			  System.out.println("do you want to add any other Vehicle(y/n)");
     	      n1=sc.next().charAt(0);
     	      if(n1=='y'|| n1=='Y')
     	        { 
     	    	  n=true;
     	          break;
     	        }
     	     else
     		    {
     	    	 n=false;
                  System.out.println("Total cost of all vehicles:"+totalVehicle_Cost+"Rupees");
                  break;
                 }
        	case '3':System.out.println("Enter the Number of vehicles of Activa: ");
			  NumberOfVehicles=sc.nextInt();
			  System.out.println("Enter the Cost of each vehicle: ");
			  CostOfEachVehicle=sc.nextInt();
			  collect= new Activa();
			  totCost=collect.totalCost(NumberOfVehicles, CostOfEachVehicle);
			  totalVehicle_Cost=totalVehicle_Cost+totCost;
			  System.out.println("Total cost of the vehicle:" + totCost);
			  a[2]+=totCost;
			  
			  totCost=0;
			  System.out.println("Total cost of all vehicles:"+totalVehicle_Cost+"Rupees");
			  System.out.println("do you want to add any other Vehicle(y/n)");
     	      n1=sc.next().charAt(0);
     	      if(n1=='y'|| n1=='Y')
     	        { 
     	    	  n=true;
     	          break;
     	        }
     	     else
     		    {
     	    	 n=false;
                  System.out.println("Total cost of all vehicles:"+totalVehicle_Cost+"Rupees");
                  break;
                 }	  
        	
        case '4': System.out.println("Enter the Number of vehicles of Beneli: ");
		  NumberOfVehicles=sc.nextInt();
		  System.out.println("Enter the Cost of each vehicle: ");
		  CostOfEachVehicle=sc.nextInt();
		  collect= new Beneli();
		  totCost=collect.totalCost(NumberOfVehicles, CostOfEachVehicle);
		  totalVehicle_Cost=totalVehicle_Cost+totCost;
		  System.out.println("Total cost of the vehicle:" + totCost);
		  a[3]+=totCost;
		  
		  totCost=0;
		  System.out.println("Total cost of all vehicles:"+totalVehicle_Cost+"Rupees");
		  System.out.println("do you want to add any other Vehicle(y/n)");
 	      n1=sc.next().charAt(0);
 	      if(n1=='y'|| n1=='Y')
 	        { 
 	    	  n=true;
 	          break;
 	        }
 	     else
 		    {
 	    	 n=false;
              System.out.println("Total cost of all vehicles:"+totalVehicle_Cost+"Rupees");
              break;
             }
	      default: System.out.println("Please select correct option from 1 to 4");
        }
        	
        }
        System.out.println("Enter the range in which you need cost of vehicles");
        int w=sc.nextInt();
        int k=sc.nextInt();
        
        for( i=0;i<=3;i++)
        {
        	if(a[i]<=k && a[i]>=w)
        	{
        		System.out.println(s[i]+" :" + a[i]+"\n");
        	}
        }
        sc.close();
	}
	
	}

