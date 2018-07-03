package Development;

import person.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DevelopmentPlan {

    private List<DevelopmentEntity> developments = new ArrayList<>();

    public DevelopmentPlan(List<DevelopmentEntity> developments) {
        this.developments = developments;
    }

    public void executeDevelopmentPlan(Student student, Development.Period developmentPeriod){
        LocalDate currentDay = LocalDate.now();
        while(!currentDay.isEqual(developmentPeriod.getLastDay().plusDays(1))){
            if (DateUtils.isIncludeCurrnetDayInPeriod(currentDay,developmentPeriod)){
                for (DevelopmentEntity developmentEntity : developments) {
                    if (DateUtils.isIncludeCurrnetDayInPeriod(currentDay,developmentEntity.getKnowledgeSource().getScheduleRule().getPeriod())) {
                        if (developmentEntity.getKnowledgeSource().getScheduleRule().isIncludeCurrentDayInScheduleRule(currentDay)) {
                            System.out.println("student taking Knowledge today: >> " + currentDay);
                            developmentEntity.getKnowledgeSource().takeKnowledge(student);
                        }
                    }
                }
            }
            currentDay = currentDay.plusDays(1);
        }
    }
}
