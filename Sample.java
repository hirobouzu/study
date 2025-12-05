package kuro3;

public class Sample {
	private int num;
	public Sample(int num) {
		this.num = num;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Sample == false) {
			return false;
		}
		if (this.num == ((Sample) obj).num) {
			return true;
		}
		return false;
	}

}
