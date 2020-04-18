package Computer;
public class MainMemory implements Memory {
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
        return info;
    }
    public void RAMtype(String type) {
        System.out.println("Тип оперативной памяти: " + type);

    }
}
