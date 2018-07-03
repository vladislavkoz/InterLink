package Development;

import person.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DevelopmentPlan {

    LocalDate startDay;
    private List<DevelopmentEntity> developments = new ArrayList<>();

    public DevelopmentPlan(LocalDate startDay, List<DevelopmentEntity> developments) {
        this.startDay = startDay;
        this.developments = developments;
    }

    public void executeDevelopmentPlan(Student student, Development.Period developmentPeriod){
        LocalDate currentDay = LocalDate.now();
        if (DateUtils.isIncludeCurrnetDayInPeriod(currentDay,developmentPeriod)){
        while(!currentDay.isEqual(developmentPeriod.getLastDay().plusDays(1))){
                for (DevelopmentEntity developmentEntity : developments) {
                    if (DateUtils.isIncludeCurrnetDayInPeriod(currentDay,developmentEntity.getScheduleRule().getPeriod())) {
                        if (developmentEntity.getScheduleRule().isIncludeCurrentDayInScheduleRule(currentDay)) {
                            System.out.println(student.getName() +  " taking Knowledge today: >> " + currentDay);
                            developmentEntity.getKnowledgeSource().teach(student);
                        }
                    }
                }
            currentDay = currentDay.plusDays(1);
        }
        }
    }
}
