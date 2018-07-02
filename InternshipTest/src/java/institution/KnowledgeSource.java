package institution;

import person.Student;
import person.consciousness.Knowledge;

public interface  KnowledgeSource {

     Knowledge getKnowledge(Student student);

     void takeKnowledge(KnowledgeSource knowledgeSource);


}
