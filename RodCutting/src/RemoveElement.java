
public class RemoveElement {
	
	int[] a=new int[]{1, 3, 1, 5, 2};

	int i=0;
	int j=4;
	int k=1;
	int total=0;
	int maxSum()
	{
		while(i<=j){
			if(a[i]<=a[j]){
				total=total+a[i]*k;
				i++;
				k++;
			}
			else{
				total=total+a[j]*k;
				j--;
				k++;
			}
		}
		return total;
	}

	public static void main(String[] args) {
	RemoveElement re=new RemoveElement();
	int maxlength=re.maxSum();
	System.out.println(maxlength);

	}

}
