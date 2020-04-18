public class Spy {
    public String name;
    private String realName;
    private int squad;
    private String getSpyInfo(){
        return ("\nИмя: " + this.name+"\nНастоящее имя: "+this.realName+"\nОтряд: "+this.squad);
    }
    public void print(){
        System.out.println(this.getSpyInfo());
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setRealName(String realName) {
        this.realName = realName;
    }
    public String getRealName() {
        return realName;
    }
    public void setSquad(int squad) {
        this.squad = squad;
    }
    public int getSquad() {
        return squad;
    }

}
