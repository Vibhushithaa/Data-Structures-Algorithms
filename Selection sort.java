package e;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array=new int[5];
		
		array[0]=35;
		array[1]=43;
		array[2]=49;
		array[3]=11;
		array[4]=55;
		
		int n=5;
		
		for(int i=0; i<n-1; i++) {
			int small = array[i];
			int a = i;
		
			for (int j=i; j<n-1; j++) {
		         if(array[j+1] < small) {
		        	 small =array[j+1];
		        	 a=j+1;
		         }  
		    }
		     
			int key=array[i];
			array[i]=small;
			array[a]=key;
		}
		
		for (int x=0; x<n; x++) {
			System.out.println(array[x]);
		}
    }
}