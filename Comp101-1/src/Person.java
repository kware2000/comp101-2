
public class Person {
	float x = 10.0f;
	float height;
	float weight;
	int a;
	public void walks() {
		x--;
		System.out.println("X: " + x);
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
}
