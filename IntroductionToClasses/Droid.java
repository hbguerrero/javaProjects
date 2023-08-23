public class Droid {
  int batteryLevel;
  String name;

  public Droid(String droidName) {
    batteryLevel = 100;
    name = droidName;
  }

  public String toString() {
    return "Hello, I'm the droid " + name;
  }

  public void performTask(String task) {
    System.out.println(name + " is performing " + task); 
  }
  public void batteryLevelLosing() {
    batteryLevel -= 10; 
  }

  public void energyReport() {
    System.out.println(batteryLevel);
  }

  public void energyTransfer() {
    System.out.println(batteryLevel);
  }

  public static void main(String[] args) {
    Droid Codey = new Droid("Codey");
    //System.out.println(Codey.name);       
    System.out.println(Codey.toString());
    Codey.performTask("dancing");
    Codey.batteryLevelLosing();
    Codey.energyReport();


  }

}
