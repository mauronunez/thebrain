package cl.inversion.brain.knowledge;

import static org.junit.Assert.*;

import org.junit.Test;

import cl.inversion.brain.provider.host.HostKnowledgeProvider;

public class KnowledgeTest {

	@Test
	public void test() {
		
		Knowledge knowledge=Knowledge.getInstance();
		
		knowledge.adquire(new HostKnowledgeProvider());
		
		knowledge.build();
		
		Suggestion[] suggestions=knowledge.suggest(new Situation(){});
		
		for(Suggestion suggestion:suggestions){
			suggestion.toString();
		}
		
		Suggestion s=suggestions[0];
		System.out.println(s.getText());
		assertEquals("El host no pertenece al listado", s.getText());
	}

}
