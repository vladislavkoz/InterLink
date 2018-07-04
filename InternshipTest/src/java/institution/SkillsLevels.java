package institution;

public enum SkillsLevels {

    LOW(1), MIDDLE(2), HIGHT(3);

    private double level;

    SkillsLevels(double level) {
        this.level = level;
    }

    public double getLevel() {
        return level;
    }
}
