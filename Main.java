class Main{
  public static void main(String[] args){
    Avatar jocelyn = new Avatar("Jocelyn", "Human", "Fairy");
    jocelyn.fightBoss();
  }
  public static class Avatar{
    String type, weapon, name;
    public Avatar(String StartType, String StartWeapon, String startName){
      type = StartType;
      weapon = StartWeapon;
    }
    public void fightBoss(){
      System.out.println("You fight the boss in the " + type);  
      if(type.equals("Fairy")) {
        System.out.println("you jump to victory!");
      } else {
        System.out.println("You are defeated by the boss!");
      }
    }
  }
}