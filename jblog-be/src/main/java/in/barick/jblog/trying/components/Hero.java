package in.barick.jblog.trying.components;

public class Hero {
    String name;
    String secretName;

    public Hero(String name, String secretName) {
        this.name = name;
        this.secretName = secretName;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", secretName='" + secretName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }
}
