
public class Tv extends ButtonClient {

	int currentDegree = 7;

	String state = "off";

	public String turnOn() {

		state = "on";
		return printState();
	}

	public String turnOff() {

		state = "off";
		return printState();
	}

	public String up() {
		if (currentDegree < 15 && currentDegree >= 0) {
			currentDegree++;
		}

		return printChannel();

	}

	private String printChannel() {

		return ("Tv is " + currentDegree);

	}

	private String printState() {

		return ("Tv is " + state);

	}

	public void setDegree(int d) {

		this.currentDegree = d;

	}

	public String down() {
		if (currentDegree <= 15 && currentDegree > 1) {
			currentDegree--;
		}

		return printChannel();

	}

}
