package cl.inversion.brain.provider.host;

import cl.inversion.brain.knowledge.Situation;

public class HostSituation implements Situation{
	
	private String host;
	
	public HostSituation(String host){
		this.host=host;
	}

	public String getHost(){
		return host;
	}

}
