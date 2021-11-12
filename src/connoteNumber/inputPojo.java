package connoteNumber;

public class inputPojo {
	
	// POJO Class with input fields and their getters and setters.
	private String carrierName;
	private String accNum;
	private Integer digits;
	private Integer lastInd;
	private Integer start;
	private Integer end;
	
	public inputPojo(String name, String acc, Integer dig, Integer lastInd, Integer start, Integer end) {
		// Assign initial values in constructor.
		this.carrierName = name;
		this.accNum = acc;
		this.digits = dig;
		this.lastInd = lastInd;
		this.start = start;
		this.end = end;
	}
	
	// Check if incremented index is in permissible range.
	public boolean isValid(Integer currentInd, Integer start, Integer end) {
		if (start <= currentInd && currentInd <= end) return true;
		else return false;
	}
	
	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public Integer getDigits() {
		return digits;
	}
	public void setDigits(Integer digits) {
		this.digits = digits;
	}
	public Integer getLastInd() {
		return lastInd;
	}
	public void setLastInd(Integer lastInd) {
		this.lastInd = lastInd;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getEnd() {
		return end;
	}
	public void setEnd(Integer end) {
		this.end = end;
	}

	// format input fields as string. 
	@Override
	public String toString() {
		return "Input: [carrierName=" + carrierName + ", accountNumber=" + accNum + ", digits=" + digits + ", lastUsedIndex="
				+ lastInd + ", rangeStart=" + start + ", rangeEnd=" + end + "]\n";
	}
	
}
