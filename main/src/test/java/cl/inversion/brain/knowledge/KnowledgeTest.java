package cl.inversion.brain.knowledge;

import static org.junit.Assert.*;

import org.junit.Test;

import cl.inversion.brain.provider.host.HostKnowledgeProvider;
import cl.inversion.brain.provider.host.HostSituation;

public class KnowledgeTest {

	@Test
	public void testByIP() {
		
		Knowledge knowledge=Knowledge.getInstance();
		
		knowledge.adquire(new HostKnowledgeProvider());

		knowledge.build();
		
		Suggestion[] suggestions=knowledge.suggest(new HostSituation("127.0.0.1"));
		
		for(Suggestion suggestion:suggestions){
			suggestion.toString();
		}
		assertTrue(suggestions.length>0);
		Suggestion s=suggestions[0];
		assertNotEquals(HostKnowledgeProvider.HOST_UNKNOWN, s.getText());
	}
	
	@Test
	public void testLocal() {
		
		Knowledge knowledge=Knowledge.getInstance();
		
		knowledge.adquire(new HostKnowledgeProvider());

		knowledge.build();
		
		Suggestion[] suggestions=knowledge.suggest(new HostSituation("localhost"));
		
		for(Suggestion suggestion:suggestions){
			suggestion.toString();
		}
		assertTrue(suggestions.length>0);
		Suggestion s=suggestions[0];
		assertNotEquals(HostKnowledgeProvider.HOST_UNKNOWN, s.getText());
	}
	
	@Test
	public void testDNS() {
		
		Knowledge knowledge=Knowledge.getInstance();
		
		knowledge.adquire(new HostKnowledgeProvider());

		knowledge.build();
		
		Suggestion[] suggestions=knowledge.suggest(new HostSituation("www.chile.com"));
		
		for(Suggestion suggestion:suggestions){
			suggestion.toString();
		}
		assertTrue(suggestions.length>0);
		Suggestion s=suggestions[0];
		assertNotEquals(HostKnowledgeProvider.HOST_UNKNOWN, s.getText());
	}

}
