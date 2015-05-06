package cl.inversion.brain.knowledge;

public interface Suggestion {
	
	public String getText();
	static Suggestion fromText(String text){
		return new Suggestion() {
			@Override
			public String getText() {
				return text;
			}
		};
		
	}
	
}
