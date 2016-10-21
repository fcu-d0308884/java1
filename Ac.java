
class Ac extends ButtonClient {

	int currentDegree = 25;

	String state = "off";

	public String turnOn() {
		 state ="On";
		 return	printState();
		

	}

	public String turnOff() {

		state = "off";

		return printState();

	}

	public String up() {

		if (currentDegree < 30 && currentDegree >= 20) {
			currentDegree++;
		}

		return	printTemperature();

	}

	public String down() {

		if (currentDegree <= 30 && currentDegree > 20) {
			currentDegree--;
		}

		return printTemperature();

	}

	private String printState() {

		return("AC is " + state);

	}

	public void setDegree(int d) {

		this.currentDegree = d;

	}

	private String printTemperature() {

		return ("AC is " + currentDegree);

	}

}