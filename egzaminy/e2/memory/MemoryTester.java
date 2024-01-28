package memory;

public class MemoryTester {
    public static void main(String[] args){
        RAMManager ram = new RAMManager();
        DiskManager disk = new DiskManager();

        ram.allocateMemory(10);
        disk.allocateMemory(50);

        ram.freeMemory();
        disk.freeMemory();

        MemoryManager.getMemoryType();
    }
}
