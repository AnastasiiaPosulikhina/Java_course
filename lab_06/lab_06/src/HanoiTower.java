public class HanoiTower {
    public int diskCount;
    public int disks[];
    public HanoiTower(int diskCount, int n) { //конструктор класса HanoiTower, принимающий на вход количество дисков на стержне и общее количество дисков
        this.diskCount = diskCount;
        this.disks = new int[n];
    }
    public int getDisk(int i) {
        return disks[i];
    }
    public void setDisk(int i, int disk) {
        disks[i] = disk;
    }
    public void moveDisk(HanoiTower toStack) {
        diskCount--;
        toStack.disks[toStack.diskCount] = disks[diskCount];
        disks[diskCount] = 0;
        toStack.diskCount++;
    }
}
