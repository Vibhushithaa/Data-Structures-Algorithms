package a;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array=new int[5];
		
		array[0]=27;
		array[1]=15;
		array[2]=23;
		array[3]=12;
		array[4]=10;
		
		for(int i=1;i<(array.length);i++) {
			for(int j=1;j<=(array.length-i);j++) {
				if(array[j-1]>array[j]) {
					int x=array[j];
					array[j]=array[j-1];
					array[j-1]=x;
				}
			}
		}
		for (int n=0;n<5;n++) {
			System.out.println(array[n]);
			
		}
		
	}
 
}
