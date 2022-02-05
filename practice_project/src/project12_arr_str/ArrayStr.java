package project12_arr_str;


public class ArrayStr {
	public static void main(String[] args)
	{
		String[] arr = { "Apple", "Banana", "Orange" };
		String key = "Banana";
		boolean flag = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("found in index"+ i);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("Not found");
		}
	}
}

	


