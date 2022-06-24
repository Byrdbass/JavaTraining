package PassReferenceValues;

public class PassByReference {
	void change2(PassByValue PBR){
		int y = 2;
		PBR.changeValue(y +2);
		
		
	}
}
