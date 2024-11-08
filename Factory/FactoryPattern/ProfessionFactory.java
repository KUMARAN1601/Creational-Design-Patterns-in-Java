package FactoryPattern;

public class ProfessionFactory {
    public Profession getProfession(String typeOfProfession) {
        if (typeOfProfession == null) {
            return null;
        }
        switch (typeOfProfession) {
            case "Doctor":
                return new Doctor();
            case "Engineer":
                return new Engineer();
            case "Teacher":
                return new Teacher();
            default:
                System.out.println("Unknown profession type: " + typeOfProfession);
                return null;
        }
    }
}
