package revision1;

public class Raul implements Person {

	public String name;

	public Raul(String raul) {
		super();
		this.name = raul;
	}

	public String getRaul() {
		return name;
	}

	public void setRaul(String raul) {
		this.name = raul;
	}

	/* (non-Javadoc)
	 * @see revision1.Person#whatIsYourName()
	 */
	@Override
	public void whatIsYourName() {
		System.out.println("name is " + name);
		
	}

}
