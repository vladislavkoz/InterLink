package Development;

import institution.KnowledgeSource;


import java.time.Period;

public class DevelopmentEntity {
    private KnowledgeSource knowledgeSource;

    public DevelopmentEntity(KnowledgeSource knowledgeSource) {
        this.knowledgeSource = knowledgeSource;
    }

    public KnowledgeSource getKnowledgeSource() {
        return knowledgeSource;
    }

    public void setKnowledgeSource(KnowledgeSource knowledgeSource) {
        this.knowledgeSource = knowledgeSource;
    }
}
