class RemoveSortedArrayDuplicate {
	
	public static void main(String args[]) {
		int array[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5 };
		int j=0;

		for(int i=0; i<array.length-1; i++) {
			if(!(array[i] == (array[i+1]))) {
				array[j] = array[i];
				j++;;
			}
		}

		array[j] = array[array.length-1];
		
		// printing final array without duplicates
		for (int k=0; k<=j; k++) {
			System.out.println(array[k]);
		}
	}	
}