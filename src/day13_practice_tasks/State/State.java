package day13_practice_tasks.State;

public class State {
    private String name;
    private String abbreviation;
    private String politicalParty;
    private String governor;
    private String senator;
    private int population;

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public String getSenator() {
        return senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setPoliticalParty(String politicalParty) {
        this.politicalParty = politicalParty;
    }

    public void setGovernor(String governor) {
        this.governor = governor;
    }

    public void setSenator(String senator) {
        this.senator = senator;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void name(String name) {
        if (name == null || name.isEmpty() || name.equals(" "))
            System.exit(1);
    }

    public void abbreviation(String abbreviation) {
        if (abbreviation == null || abbreviation.isEmpty() || abbreviation.equals(" "))
            System.exit(1);
    }

    public void politicalParty(String politicalParty) {
        if (politicalParty == null || politicalParty.isEmpty() || politicalParty.equals(" "))
            System.exit(1);
    }

    public void governor(String governor) {
        if (governor == null || governor.isEmpty() || governor.equals(" "))
            System.exit(1);
    }

    public void senator(String governor) {
        if (senator == null || senator.isEmpty() || senator.equals(" "))
            System.exit(1);
    }
    public void population (int population){
        if ( population <= 0 )
            System.exit(1);
    }
    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.politicalParty = politicalParty;
        this.governor = governor;
        this.senator = senator;
        this.population = population;
    }
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}



