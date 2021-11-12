package connoteNumber;

public class numGenerator {
	private static String connoteNum="FMCC";
		
	public static void main(String[] args) {
		
		inputPojo input = new inputPojo("FreightmateCourierCo", "ABC123", 10, 19604, 19000, 20000);
		System.out.println(input.toString());
		
		Integer currentInd = input.getLastInd()+1;
		boolean valid = input.isValid(currentInd, input.getStart(), input.getEnd());
		
		if(valid) {
			connoteNum += input.getAccNum().substring(3, 6) + input.getAccNum().substring(0, 3);
			
			int i=0, evenPosSum=0, oddPosSum=0, counter=0;
			while (i <= input.getDigits()-input.getAccNum().length()) {
				connoteNum += '0';
				i++;
			}
			connoteNum += currentInd.toString();
			
			for (int j= currentInd.toString().length()-1; j>=0; j--) {
				int add = Character.getNumericValue(currentInd.toString().charAt(j));
				if (counter%2 == 0) {
					evenPosSum += add;
				} else {
					oddPosSum += add;
				}
				counter++;
			}
			
			Integer checksum = 100 - (evenPosSum*3 + oddPosSum*7);
			connoteNum += checksum.toString();
			
		} else {
			connoteNum = "Invalid Index!";
		}
		
		System.out.println("\nOutput: "+connoteNum);
		
	}


}
