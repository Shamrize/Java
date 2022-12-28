public class Reptile extends Animal {
	
    String skin = "Dry";
    String backbone = "present";
    String eggs = "soft-shelled";
	public Reptile(int height, int weight, String animal_type, String skin, String backbone, String eggs) {
		super(height, weight, animal_type);
		this.skin = skin;
		this.backbone = backbone;
		this.eggs = eggs;
		
		// TODO Auto-generated constructor stub
	}
	public String getSkin() {
		return skin;
	}
	public String getEggs() {
		return eggs;
	}
	public String getBackbone() {
		return backbone;
	}
		// TODO Auto-generated constructor stub
    
	
	public String showinfo() {
		return toString();
	}
	@Override
	public String toString() {
		return "Reptile [skin=" + skin + ", backbone=" + backbone + ", eggs=" + eggs + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + ", getAnimal_type()=" + getAnimal_type() + "]";
	}
}
