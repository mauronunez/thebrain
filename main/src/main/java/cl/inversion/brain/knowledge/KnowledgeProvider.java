package cl.inversion.brain.knowledge;

import java.util.Collection;

public interface KnowledgeProvider {

	void build();

	Collection<? extends Suggestion> apply(Situation situation);

}
