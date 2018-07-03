package institution;

import Development.ScheduleRule;
import person.Student;

public interface  KnowledgeSource {

     ScheduleRule getScheduleRule();
     void takeKnowledge(Student student);
}
