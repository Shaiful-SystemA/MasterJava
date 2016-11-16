import java.util.*;
//import.java.util.vector;

public class Memorize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.printf("wow %.3f\n",3.26);
	
		
		
		
		
		
		int nTerms, sign =1, denom=1;
		double pi = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter numbe of terms ");
		
		nTerms = sc.nextInt();
		
		for(int i =0; i < nTerms; i++){
			
			pi = pi +  4.0 /denom*sign;
			sign = sign * -1;
			denom += denom +2;						
		}
		
		System.out.printf("%.6f", pi);
		
		
		int[]  arr;
		arr = new int[3]; // because arr is an object 
		System.out.println("arr" + arr.length);
		
		arr[0] = 100;
		arr[1] = arr[0] - 37;
		arr[2] = arr[1] /2;
		for(int i=0; i<arr.length;i++)
		System.out.println("arr[" + i +" ] " + arr[i]);
				
		
		double[]  arr2 = {25.1,67.1,32.1,1.1};
		
		System.out.println("Length = " + arr.length);
		
		for(double element: arr2){
			System.out.println(element + " ");
		}
		
		System.out.println(Arrays.toString(arr2));
		
		
		int[] list = {22,55,33,90};
		
		swap(list,0,2);

		for(double element: list){
			System.out.println(element + " ");
		}
		
		int J = 9;
		Integer y = new Integer(J);
		System.out.println(y.byteValue());

	}
	
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]=temp;
	}
	
//	
//	Vector<String> courses;
//	
//	courses = new Vector<String>();
//	
//	courses.add("slslsl");
//	System.out.println(courses);
//	
	
	ArrayList<Integer> list2 = new ArrayList<Integer>();
    //System.out.println("Enter");
//	while (sc.hasNext()){
//		list.add(sc.nextInt());
//		}	

}
