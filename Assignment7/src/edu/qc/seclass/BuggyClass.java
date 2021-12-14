package edu.qc.seclass;

public class BuggyClass {
	
	public int buggyMethod1(int x, int y){
		int z = 0;
        if (x < 5){
        	 x = x + 10;
             y = x  + 5;
             z = y + 10;
             x = z + x + y;
             
        }
        
        y = x / z;
        return y;
    }
	
	public int buggyMethod2(int x, int y) {
		int z = 0;
		
		if(y < 10) {
			z = -28;
		}
		
        if (x < 5){
        	 x = x + 10;
             y = x  + 5;
             z = z + y + 10;
             x = z + x + y;
             
        }
        
        
        y = x / z;
        return y;
	}
	
	public void buggyMethod3() {
		/* It is impossible to create such a method because a program that has 100% branch coverage, it executes every branch
		   so the fault will be executed.*/
	}
	
	public void buggyMethod4() {
		/* It is impossible to create such a method that has 100% branch coverage but not reveal the fault. To
		   have 100% branch, every branch has to be executed and there will be a fault in one of the branches. Since there is a fault in 100% statement 
		   coverage, then one of the branches will have the fault.*/
	}
	
	public void buggyMethod5() {
		/* It is impossible to create such a method because for a statement to have 100% statement coverage, it needs to execute every statement. The zero fault at 
		   line 4 has to be executed to achieve 100% statement coverage.*/
	}
	
}
