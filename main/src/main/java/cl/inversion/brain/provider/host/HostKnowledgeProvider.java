package cl.inversion.brain.provider.host;

import java.util.Arrays;
import java.util.Collection;

import cl.inversion.brain.knowledge.Knowledge;
import cl.inversion.brain.knowledge.KnowledgeProvider;
import cl.inversion.brain.knowledge.Situation;
import cl.inversion.brain.knowledge.Suggestion;

public class HostKnowledgeProvider implements KnowledgeProvider{

	@Override
	public void build(Knowledge knowledge) {

		
	}

	@Override
	public Collection<? extends Suggestion> apply(Situation situation) {
		
		Suggestion s=new Suggestion(){
			@Override
			public String getText() {
				return "Host unknown"; 
			}
		};
		Suggestion[] ss=new Suggestion[]{
				s
		};
		
		return Arrays.asList(ss);
		
	}

}
