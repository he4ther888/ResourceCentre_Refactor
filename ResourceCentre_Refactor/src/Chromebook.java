
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
<<<<<<< HEAD
		String output = super.toString();
		output = String.format("%-63s %-20s", output, os);
				
=======
		// Write your codes here
		String output = super.toString();
		output = String.format("%-63s %-20s", output, os);
>>>>>>> branch 'master' of https://github.com/he4ther888/ResourceCentre_Refactor.git
		return output;
	}
}


