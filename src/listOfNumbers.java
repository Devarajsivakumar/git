
public class listOfNumbers {

	public static void main(String[] args) {
		
       int a[] = new int[5]; //compile time menory
       
        a[2]=30;
        a[0]=10;
        a[3]=40;
        a[1]=70;
        a[4]=50;
        
        int b = a.length;
        System.out.println(b);//length of index
        
        
        //fetch particular value
        System.out.println(a[4]);
        
        //
        
        for (int i = 0; i < a.length; i++) {
        	System.out.println(i);
        	
        	for (int x : a) {
        		System.out.println(x);
			}
        	
        	
        	
        	
        	
        	
        	
			
		}
        
        
        
        
	}
}
