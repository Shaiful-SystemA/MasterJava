import java.util.*;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Search
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		boolean result = searchArray(array, array.length, 10);
		System.out.println(result);

	}
	
	public static boolean searchArray(int[] a, int length, int x) {
		boolean isFound = false;
		for (int index = 0; index < length; index++) {
			if (a[index] == x) {
			          isFound = true;
			}
		}
		return isFound;                
	}

}


