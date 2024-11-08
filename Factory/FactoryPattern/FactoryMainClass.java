package FactoryPattern;

public class FactoryMainClass {
    public static void main(String[] args) {
        // Create a factory object
        ProfessionFactory professionFactory = new ProfessionFactory();
        
        // Example for Engineer
        Profession profession = professionFactory.getProfession("Engineer");
        if (profession != null) {
            profession.print();
        }

        // Example for Doctor
        profession = professionFactory.getProfession("Doctor");
        if (profession != null) {
            profession.print();
        }

        // Example for Teacher
        profession = professionFactory.getProfession("Teacher");
        if (profession != null) {
            profession.print();
        }

        // Example for unknown profession
        profession = professionFactory.getProfession("Unknown");
        if (profession != null) {
            profession.print();
        }
    }
}

