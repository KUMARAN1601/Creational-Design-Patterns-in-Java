package AbstractFactoryExample;

public class TraineeAbstractFactory extends AbstractFactory{
  public Profession getProfession(String typeOfProfession){
    if(typeOfProfession==null){
      return null;
    }
    if(typeOfProfession.equals("Engineer")){
      return new TraineeEngineer();
    }
    else if(typeOfProfession.equals("Teacher")){
      return new TraineeTeacher();
    }
    return null;
  }
}
