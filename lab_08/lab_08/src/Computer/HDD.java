package Computer;
public class HDD implements Memory {
    private String info = "";
    @Override
    public void setInfo(String info) {
        if (!(this.info.isEmpty())) {
            this.info += "\n";
        }
        this.info += info;
    }
    @Override
    public String getInfo() {
        return this.info;
    }
    public void capacity(String value) {
        System.out.println("Ёмкость жёсткого диска: " + value);
    }
}





