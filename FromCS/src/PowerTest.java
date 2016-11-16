import java.util.*;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class PowerTest {

	String out = " ";
	
	
	static PowerTest PowerObj;
	//boolean SleepIn ;
	
	public PowerTest(){
		out =" 9";
	}
	
	public boolean SleepIn(boolean weekday, boolean vacation){
		if(weekday && vacation){
			return true;
		} 
		if(!weekday && !vacation){
			return true;
		}			
		return false;
	}
	
	public int sumDouble(int a, int b){
				
		 int c = a +b;
		 return c; 
				  
		}
	
	public int diff21(int n){
		if(n<=21){
			return   21 -n;
			//return j;
		}else{
			return n*2;
		}
			
	}
	
	public boolean parrotTrouble(boolean talking, int hour){
	 
	if(talking &&((hour<7) || (hour>20))){
		return true;
	}
	else
		return false;
	}
	
	public boolean makes10(int z, int x){
		if((z==10 || x==10) || (x+z==10)){
			return true ;
		}
		else
				return  false;
		
	}
	
	public boolean nearHundred(int n){
		 return ((Math.abs(100 - n) <= 10) ||
				    (Math.abs(200 - n) <= 10));
	}

	public boolean posNeg(int a, int b, boolean negative){
		
//		if(((a<0 || b>0)&&true) || ((a>0 || b<0)&&true) || ((a<0 || b<0)&&false) ){
//			return true;
//		}
//		else 
//			return false;
//				
		if (negative) {
			return (a < 0 && b < 0);
		}
		else {
			return ((a < 0 && b > 0) || (a > 0 && b < 0));
		} 
		 
		 
	}
	
	public String notString(String str){
		
		if(str.length() >=3 && str.substring(0, 3).equals("not")){
		return str;	
		}else		
		return ("not ");
	}
	
  public String missingChar(String str, int n){
	  String front = str.substring(0, n);
	  
	  // Start this substring at n+1 to omit the char.
	  // Can also be shortened to just str.substring(n+1)
	  // which goes through the end of the string.
	  String back = str.substring(n+1, str.length());
	  
	  return front + back;
  }
	
 public String frontBack(String str){
	 //String back = str.lastIndexOf();
	 
	  if (str.length() <= 1) return str;
	  
	  String mid = str.substring(1, str.length()-1);
	  
	  // last + mid + first
	  return str.charAt(str.length()-1) + mid + str.charAt(0);
	 
 }
 
 public String front3(String str){
	 if(str.length() <=3) return str +str+str ;
	 
		 String mid = str.substring(0, 3);
	 return mid + mid +mid;
 }
 
 //
 public int fact1(int n){
	 if (n==0)
		 return 1;
	 else
		 return n * fact1(n-1);
 }
 
 public static void countDown(int n){
	 if (n <=0)
			System.out.println("Blast");
	 else{
			System.out.println("Blast" + n);
			countDown(n-1);
	 }
		 
 }

// public static void printLL(ListNode n){
//	 if (n != null){
//		 System.out.println(n.value);
//		 printLL(n.next);
//	 }
// }

 public String backAround(String str){
	 //Get the latest Char
	 String last = str.substring(str.length()-1);
	 return last + str + last ;
	 
 }
 
 public boolean or35(int n){
	 //if((n%3==0)||(n%5==0)) return true;
	 return ((n%3==0)||(n%5==0)) ;
//	 else
//		 return false;
 }
 
 public String front22(String str){
	 //
	 int take =2;
	 if(take >str.length()){
		 take = str.length();
	 }
	 String front = str.substring(0, take);
	 return front + str + front;
	 
 }
 
 public	boolean startHi(String str){
//	 if (str =="Hi")
//		 return true;
//		 else
//			 return false;
//	 
	String firstTwo = str.substring(0,2);
	
	//test if it is equal to "hi"
	if(firstTwo.equals("hi")){
		return true;
	}else {
		return false;
	}
		
 }
 
 public boolean icyHot(int temp1, int temp2){
	 
	 if((temp1 <0) && (temp2>101) || (temp1 > 101 && temp2 <0)  )
		 return true; 
	 else
		 return false;
	 	 
 }
 
 public boolean in1020(int a, int b){
	 if((a>10 && a<20) && (b>10 && b<20))
		 return true ;
		 else
			 return false;
 }
 
 public boolean hasTeen(int a, int b, int c){
	 return (a>=13&& a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19); 
 }
 
 public String delDel(String str){
	 
	 if(str.length()>=4 && str.substring(1, 4).equals("del")){
		 return str.substring(0,1) + str.substring(4);
	 }
	 else
		 return str;
 }
 
public boolean mixStart(String str){
	
//	if(str.substring(0,4).contentEquals("mix")){
//		return true;
//	}
//	else
//		return false;
	
	String two = str.substring(1,3);
	
	if(two.equals("ix")){
		return true;
	}else{
		return false;
	}
}

public String startOz(String str){
	String result = "";
	
	if(str.length() >=1 && str.charAt(0)=='o'){
		result += str.charAt(0);
	}
	if(str.length() >=2 && str.charAt(1)=='z'){
		result += str.charAt(1);
	}
	return result;
}

public int intMax(int a, int b, int c){
	
	int max;
	if(a>b){
		max =a;
	}else{
		max=b;
	}
	
	if(c>max){
		max = c;
	}
	
	return max;		
}


public int close10(int a, int b){
	
	int aDiff = Math.abs(a-10);
	int bDiff = Math.abs(b-10);	
	
	
	if (aDiff < bDiff ){
		return a;
	}
	if (bDiff < aDiff ){
		return b;
	}
	return 0;
	
}


public boolean in3050(int a, int b){
	if(a >=30 && a <=40 && b >=30 && b<=40){
		return true;
	}
	if(a >=40 && a <=50 && b >=40 && b<=50){
		return true;
	}
	return false;
}

public int max1020(int a, int b){
	// Make it so the bigger value is in a
	// suppos 100,200
	if(b>a){
		int temp = a; // temp is now 100
		a =b; // a is now 200
		b = temp; // b is now 100
	}
	
	//knowing a is bigger, just check a first 
	if(a >=10 && a <=20) return a;
	if(b >=10 && b<=20) return b;
	return 0;
	
}
 
public boolean stringE(String str){
	
	int count =0;
	
	//loop across the text length
	for(int i=0; i<str.length();i++){
		if(str.charAt(i) =='e') count ++;		
	}
	
	return (count >= 1 && count <= 3);	
}

public boolean lastDigit(int a, int b){
	
	return(a% 10 ==b %10);

}

public String endUp(String str){
	if(str.length() <=3) return str.toUpperCase();
	int cut = str.length() -3;
	String front = str.substring(0, cut);
	String back = str.substring(cut);
	
	return front + back.toUpperCase();
	
}

public String everyNth(String str, int n){
	String result ="";
	
	for(int  i=0; i<str.length(); i =i +n){
		result += str.charAt(i);
	}
	return result;
		
}

public String stirngTimes(String str, int n){
	String result ="" +"b";
	for(int i=0; i<n;i++){
		result+= str;
	}
	return result;
}

public String frontTimes(String str, int n){
	
	int frontLen=3;
	if(frontLen>str.length()){
		frontLen = str.length(); // assing the value of 3 to str.length
	}
	String front = str.substring(0, frontLen);
	
	String result = "";
	for(int i=0;i<n;i++){
		result = result +front;
	}
	return result;	
}

public int CountXX(String str){
	int count =0;
	for(int i =0; i < str.length()-1; i++){	
		if(str.substring(i, i+2).equals("XX")) count ++;
	}
	return count;	
}

public boolean doubleX(String str){
	int i = str.indexOf("X");
	if(i ==-1) 
		return false; // if no x at all
	
	//Is Char a i+1 also an "X"?
	if(i +1 >= str.length()) return false;
	return str.substring(i+1, i+2).equals("X");	
}

//Given a string, return a new string made of every other char starting with the first, so "Hello" yields "HlO"

public String StringBits(String str){
	String result = "";
	
	for(int i = 0; i<str.length();i+=2){
	result +=  str.substring(i,i+1);
	}
	return result;
}

// given a non-empty string like "code" return a string  like "CCoCODCode".

public String stringSplosion(String str){
	String result = "";
	//On each interation., add rhe substring of the chars 0..i
	for(int i=0; i<str.length(); i ++){
		result += str.substring(0,  i+1);
	}
	return result;
}

//given a string, return the count of the number of times that a substring length 2 appears in the string 
//and also as the last 2 characters  of the string, so "HIxX:" yields 1 (we wont count the end string):

public int last2(String str){
	//Screen out too-short string case
	if(str.length()<2) return 0;
	
	String end =  str.substring(str.length()-2);
	int count =0;
	
	//Check each substring length 2 starting at i
	for(int i=0; i<str.length()-2; i++){
		String sub = str.substring(i, i+2);
		if(sub.equals(end)){
			count++;
		}
	}
	return count;
}

// Given an array of int, return the number of 9 in the array



public static double[] makeArray(int size, double limit) {
	double[] arr = new double[size];
	for (int i=0; i < arr.length; i++)
		arr[i] = limit/(i+1);
	return arr;
}

public int arrayCounts9(int[] nums){
	int count = 0;
	
	for(int i=0; i<nums.length; i++){
		if(nums[i] ==9) {
			count++;
		}
	}
	return count;	
}

// given an  array of ints, return true if one of the first 4 elements in the array is a 9, . The array length may
// be less than 4

public boolean arrayFront9(int[] nums){
	//First figure the end for the loop
	int end = nums.length;
	if(end>4) 
		end =4;
	 //iterate inside  the loop
	for(int i=0; i<end; i++){
		if(nums[i] ==9) 
			return true;
	}
	return false;
}


//Given an array of ints, return true if th esequence of numbers 1,2,3 appears in the array somewhere 
public boolean arrray123(int[] nums){
	
	for(int i=0; i<(nums.length-2);i++){
		if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
	}
	return false;
}

//Given 2 strings, a and b, return the number of the positios where they contain the same length 2
// substring. So "XXCEE" and "XXbax" uileds 3 , since the 

public int stringMatch(String a, String b){
	// Figure which strng is sshorter
	int len = Math.min(a.length(),b.length());
	int count = 0;
	//Look at both substring starting at i
	for(int i=0; i<len-1;i++){
		String aSub = a.substring(i, i+2);
		String bSub = a.substring(i, i+2);
	
		if(aSub.equals(bSub)){
				count++;
		}		
	}	
	return count;
}

//given a string, return a version where all the "x" have been removed.
//Except an "x" at the very start or end should not be removed

public String stringX(String str){
	String result = "";
	for(int i=0;i<str.length(); i++){
		//Only append the char if it is not the "X" case
		if(!(i > 0 && i < (str.length()-1)  && str.substring(i, i+1).equals("x"))){
			//Could use str.charAt(i)
			result = result + str.substring(i,i+1);
		}
	}
	
	return result;
}

//Given a String, return a string made of the chars at indexes 0,1,4,5,8 ..... So kittens yields kien
public String altpairs(String str){
	String result = "";
	
	//Run i by 4 to hit 0,4,8
	for(int i =0;i<str.length();i=i+4){		
		//append the chars between i and i +2
		int end = i+2;
		if(end >str.length()){
			end = str.length();
		}
		result =  result +str.substring(i, end);
	}
	
	return result;
}

//suppose the stirng 'yak' is unluckly. Given a string, return a version where all the "Yax" are removed,
// but the "a" can be any char.The "yah" string will not overlap 

public String stringYak(String str){
	String result="";

	for(int i =0; i<str.length();i++){
		// Look for i starting a "yak" -- advance i in that case
		if(i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
				i =i +2;
		}else{
			// otherwise do the normal append 
			result = result + str.charAt(i);
		}
	}
	return result;
}

//Given an array of inits, return the number of times that two 6s are next to each other int he array
//Also count instances where the Second "6" is actually a 7
//

public int array667(int []nums){
	int count =0;
	//Iterate to length-1, so can use i+1 in the loop
	
	for(int i =0; i <(nums.length-1);i++){
		//System.out.println(nums.length);
		if(nums[i] ==6){
			if(nums[i+1] == 6 || nums[i+1] ==7){
				count = count + 1;
			}
		}
	}
	
	return count;
}

//given an array of ints, we say that a triple is a value appearing 3 times in a row in the array. ]
// return true if the array does not contain any triples

public boolean notTripes(int[] nums){
	// Iterate < length-2, so can use i+1 and i +2 in th eloop
	// Return false immediately of every seeing a triple
	
	for(int i =0; i<(nums.length-2);i++){
		int first = nums[i];
		if(nums[i+1]==first && nums[i+2]==first) return false;
	}
	// If we get there ... no triples
	return true;
	
}

//Given an array of ints, return true if t contains a 2,7,1 pattern -- a value, followed by the value plus 5,
// followed by the value mnus 1. Adddionally the 271 counts even if the "1" differs by 2 or less form the correct value

public boolean has271(int[] nums){
	
	//Iterate < length-2, so can use i+1 and i+2 in the loop
	//Returen true immdediately when seeing 217	
	for(int i = 0; i<(nums.length-2);i++){
		int val = nums[i];
		if (nums[i+1] == (val + 5) &&
				Math.abs(nums[i +2] - (val-1)) <=2) return true;		
	}
	// if we reach here none found 
	return false;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PowerObj = new PowerTest();
		
		int[] nums={1,2,6,6,4};
		
		System.out.println(PowerObj.notTripes(nums));		
		System.out.println(PowerObj.stringYak("yakppapa"));		
		System.out.println(PowerObj.stringX("xxxabc"));		
		System.out.println(PowerObj.stringMatch("abc","abc"));		
//		System.out.println(PowerObj.arrray123(nums));		
//		System.out.println(PowerObj.arrayFront9(nums));
//		System.out.println(PowerObj.stringSplosion("Code"));
//		System.out.println(PowerObj.StringBits("abcXXX"));
//		System.out.println(PowerObj.CountXX("abcXXX"));
//		System.out.println(PowerObj.frontTimes("wowlag",3));
//		System.out.println(PowerObj.stirngTimes("Miracle",2));
//		System.out.println(PowerObj.stringE("Hello"));
//		System.out.println(PowerObj.close10(12,11));
//		System.out.println(PowerObj.out);
//		System.out.println(PowerObj.SleepIn(true, false));
//		System.out.println(PowerObj.sumDouble(5,9));
//		System.out.println(PowerObj.diff21(50));
//		System.out.println(PowerObj.parrotTrouble(true,8));
//		System.out.println(PowerObj.makes10(5,100));
//		System.out.println(PowerObj.nearHundred(100));
//		System.out.println(PowerObj.posNeg(-1,-1,true));
//		System.out.println(PowerObj.notString("not jay"));
//		System.out.println(PowerObj.front3("Jay2"));
//		System.out.println(PowerObj.fact1(2));
//		countDown(10);
//		System.out.println(PowerObj.backAround("rat"));
//		System.out.println(PowerObj.or35(7));
//		System.out.println(PowerObj.front22("pwwoow"));
//		System.out.println(PowerObj.startHi("Hi"));
//	   System.out.println(PowerObj.in1020(11,19));
//	   System.out.println(PowerObj.delDel("adebc"));
//	   System.out.println(PowerObj.mixStart("mix retract"));
//	  System.out.println(PowerObj.startOz("ozx"));
//	  System.out.println(PowerObj.intMax(100000, 300, 10));
	}


}
