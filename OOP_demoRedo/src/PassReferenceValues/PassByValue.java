package PassReferenceValues;

public class PassByValue {
	void changeValue(int val1) {
		val1=10;
		val1 = 30 + val1;
	}
}
