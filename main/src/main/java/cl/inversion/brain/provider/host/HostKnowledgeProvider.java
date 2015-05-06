package cl.inversion.brain.provider.host;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;

import cl.inversion.brain.knowledge.Knowledge;
import cl.inversion.brain.knowledge.KnowledgeProvider;
import cl.inversion.brain.knowledge.Situation;
import cl.inversion.brain.knowledge.Suggestion;

public class HostKnowledgeProvider implements KnowledgeProvider {

	public static final String HOST_UNKNOWN = "Host unknown";

	@Override
	public void build() {

	}

	private boolean _apply(Situation situation) {
		return (situation instanceof HostSituation);
	}

	@Override
	public Collection<? extends Suggestion> apply(Situation situation) {
		Suggestion[] ss = new Suggestion[] {};
		Suggestion s=null;
		
	
		if (_apply(situation)) {
			try {
				InetAddress host = InetAddress.getByName(((HostSituation)situation).getHost());
				s = Suggestion.fromText(host.toString());
			} catch (UnknownHostException e) {
				s = Suggestion.fromText(HOST_UNKNOWN);
			}


			ss = new Suggestion[] { s };
		}

		return Arrays.asList(ss);

	}

}
