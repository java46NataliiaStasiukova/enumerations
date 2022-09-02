package telran.measure;

public enum LengthUtil {
SM(1.0f), M(100f), KM(100000);
	float value;
	private LengthUtil(float value) {
		this.value = value;
	}
	public float convertValue(LengthUtil wu, float amount) {
		
		return value * amount / wu.value;
	}
}
