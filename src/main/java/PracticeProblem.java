public class PracticeProblem {

	public static void main(String args[]) {

	}
//Question 1
public static int find(int[] array, int number) {
	for (int i = 0; i < array.length; i++) {
		if (array[i] == number) {
			return i;
		}
	}
	return -1;
}
	
//Question 2
public static int findLast(String[] array, String string) {
	for (int i = array.length - 1; i >= 0; i--) {
		if (array[i] == string) {
			return i;
		}
	}
	return -1;
}
//Question 3
public static int findSecond(char[] array, char character) {
	int count = 0;
	int firstIndex = 0;
	for (int i = 0; i < array.length; i++) {
		if (array[i] == character)
		count+= 1;
		if (count == 1) {
		firstIndex = i;
		}
		if (count == 2) {
		return i;
	}
	}
	if (count == 1) {
		return firstIndex;
	}
	return -1;
}
}



