package cl.inversion.brain.knowledge;

import java.util.ArrayList;
import java.util.List;

public class Knowledge {
	
	private static Knowledge instance=new Knowledge();
	
	private List<KnowledgeProvider> providers=new ArrayList<KnowledgeProvider>();
	
	public static Knowledge getInstance(){
		return instance;
	}

	public void adquire(KnowledgeProvider knowledgeProvider) {
		providers.add(knowledgeProvider);
	}

	public void build() {
		for(KnowledgeProvider provider:providers){
			provider.build(this);
		}
	}

	public Suggestion[] suggest(Situation situation) {
		List<Suggestion> suggestions=new ArrayList<Suggestion>();
		for(KnowledgeProvider provider:providers){
			suggestions.addAll(provider.apply(situation));
		}
		return suggestions.toArray(new Suggestion[]{});
	}

}
