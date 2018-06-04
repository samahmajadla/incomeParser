public class IncomeRecord {

    private int age;
    private Education education;
    private MarriageStatus married;
    private Race race;
    private Sex sex;
    private Occupation occupation;
    private int hoursPerWeek;
    private NativeCountry country;
    private boolean above50;

    public int getAge() {
        return age;
    }

    public Education getEducation() {
        return education;
    }

    public MarriageStatus getMarried() {
        return married;
    }

    public Race getRace() {
        return race;
    }

    public Sex getSex() {
        return sex;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public NativeCountry getCountry() {
        return country;
    }

    public boolean isAbove50() {
        return above50;
    }

    public IncomeRecord(int age, Education education, MarriageStatus married, Occupation occupation,Race race, Sex sex, int hoursPerWeek, NativeCountry country, boolean above50){
        this.age = age;
        this.education = education;
        this.married = married;
        this.race = race;
        this.sex = sex;
        this.occupation = occupation;
        this.hoursPerWeek = hoursPerWeek;
        this.country = country;
        this.above50 = above50;
    }


}
