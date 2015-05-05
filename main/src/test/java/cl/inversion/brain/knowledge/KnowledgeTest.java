package cl.inversion.brain.knowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class KnowledgeTest {

	@Test
	public void test() {
		
		Knowledge knowledge=Knowledge.getInstance();
		
		
		knowledge.adquire(new KnowledgeProvider(){});
		
		knowledge.build();
		
		Suggestion[] suggestions=knowledge.suggest(new Situation());
		for(Suggestion suggestion:suggestions){
			suggestion.toString();
		}
		
		
		
		//fail("Not yet implemented");
	}

}
