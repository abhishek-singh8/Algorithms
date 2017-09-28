
public class DynamicProg {	
	int[] p = new int[ ]{0,2,4,7,9,12};
    int[] maximum=new int[6];
    int x=8;
    DynamicProg(){
    	maximum[1]=2;
    }
    
    int maxLength(int length)
    {
    	for(int n=2;n<=length;n++){
    		int max=0;
    		for(int i=1;i<=n;i++){
    			int x=p[i]+maximum[n-i];
    			if(x>=max){
    				max=x;
    			}
    			maximum[n]=Math.max(max, n*p[1]);
    		}
    		
    	}
    	return maximum[length];
    }

	public static void main(String[] args) {
     
	DynamicProg dp=new DynamicProg();
	
        int length=dp.maxLength(5);
        System.out.println(length);
	}

}