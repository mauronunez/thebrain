package cl.inversion.brain.knowledge;

public class Knowledge {
	
	private static Knowledge instance=new Knowledge();
	
	public static Knowledge getInstance(){
		return instance;
	}

	public void adquire(KnowledgeProvider knowledgeProvider) {
		
	}

	public void build() {
		
	}

	public Suggestion[] suggest(Situation situation) {
		return new Suggestion[]{};
	}

}
