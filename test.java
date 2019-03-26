public class main {
    
	public static void main(String[] args){
    
		int value = 12;
    
		int[] distance = { 5,3,2 };
    
		int[] time = { 2,3,5 };
    
		int x =0;
    
		int y=0;
    
		int k =0;
    
		for(;x<=value;){
        
			for(int i=0;i<distance.length;i++){
        
				x = x+ distance[i]; 
        
				if ( x <= value)
				{
        
				k = x;
        
				System.out.println(k);
        
				}
        
				if ( x<=value)
				{
        
				y = y + time[i];
        
				}
        
			}
    
		}
    
		System.out.println("Distance",k);
   
		System.out.println("Time",y);
    
	}

}