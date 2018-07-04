package Development;

import person.Student;

import java.time.LocalDate;
import java.util.List;

public class DevelopmentPlan {

    LocalDate startDay;
    private List<DevelopmentEntity> developments;

    public DevelopmentPlan(LocalDate startDay, List<DevelopmentEntity> developments) {
        this.startDay = startDay;
        this.developments = developments;
    }

    public void executeDevelopmentPlan(Student student, Development.Period developmentPeriod) {
        LocalDate currentDay = LocalDate.now();
        if (DateUtils.isIncludeCurrnetDayInPeriod(currentDay, developmentPeriod)) {
            while (!currentDay.isEqual(developmentPeriod.getLastDay().plusDays(1))) {
                for (DevelopmentEntity developmentEntity : developments) {
                    System.out.println("NEXT DAY:   " + developmentEntity.getScheduleRule().getDate());
                    if (DateUtils.isIncludeCurrnetDayInPeriod(currentDay, developmentEntity.getScheduleRule().getPeriod())) {
                        if (developmentEntity.getScheduleRule().isIncludeDay(currentDay)) {
                            System.out.println(student.getName() + " taking Knowledge today: >> " + currentDay);
                            developmentEntity.getKnowledgeSource().teach(student);
                            developmentEntity.getScheduleRule().setDate(developmentEntity.getScheduleRule().getScheduleType().getNextDate(currentDay));
                            System.out.println("NEXT DAY:   " + developmentEntity.getScheduleRule().getDate());
                        }
                    }
                }
                currentDay = currentDay.plusDays(1);
            }
        }
    }
}
