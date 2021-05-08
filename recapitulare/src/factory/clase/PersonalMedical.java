package factory.clase;

public abstract class  PersonalMedical {
    private String name;
    private float salariu;

    public PersonalMedical(String name, float salariu) {
        this.name = name;
        this.salariu = salariu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalMedical{");
        sb.append("name='").append(name).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
