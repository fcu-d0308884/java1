
public class Button {
	private ButtonClient bClient;

	public Button(ButtonClient b) {
		bClient = b;

	}

	public String turnOn() {

		return bClient.turnOn();

	}

	public String turnOff() {

		return bClient.turnOff();

	}

	public String up() {

		return bClient.up();

	}

	public String down() {

		return bClient.down();

	}

}
