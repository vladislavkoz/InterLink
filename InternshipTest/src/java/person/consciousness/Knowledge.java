package person.consciousness;


public class Knowledge {

    private double practiceSkills;
    private double theorySkills;
    private double knowledgeLevel;

    public Knowledge(double practiceSkills, double theorySkills) {
        this.practiceSkills = practiceSkills;
        this.theorySkills = theorySkills;
    }

    public Knowledge() {
    }

    public double getPracticeSkills() {
        return practiceSkills;
    }

    public void setPracticeSkills(double practiceSkills) {
        this.practiceSkills = practiceSkills;
    }

    public double getTheorySkills() {
        return theorySkills;
    }

    public void setTheorySkills(double theorySkills) {
        this.theorySkills = theorySkills;
    }

    public double getKnowledgeLevel() {
        return this.practiceSkills + this.theorySkills;
    }

    @Override
    public String toString() {
        return "Knowledge{" +
                "practiceSkills=" + practiceSkills +
                ", theorySkills=" + theorySkills +
                '}';
    }


//    public static Builder getBuilder(){
//         return  new Knowledge().new Builder();
//    }
//
//    private  class Builder{
//
//
//        private Builder() {
//
//        }
//
//        public Knowledge buildKnowledge(){
//                return Knowledge.this;
//        }
//
//        public Builder buildTheory(double level){
//            Knowledge.this.theorySkills = level;
//            return this;
//        }
//
//        public Builder buildPratice(double level){
//            Knowledge.this.practiceSkills = level;
//            return this;
//        }
//
//        public Knowledge buildTheory() {
//        }
//    }
}
