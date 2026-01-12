package zad16;

public class MemoryTester {
    public static void main(String[] args) {
        MemoryManager ram = new RAMManager();
        MemoryManager disk = new DiskManager();

        System.out.println("RAM: ");
        ram.allocateMemory(204);
        ram.freeMemory();

        System.out.println("DISK: ");
        disk.allocateMemory(512);
        disk.freeMemory();

        System.out.println("Test of static method: ");
        System.out.println(MemoryManager.getMemoryType());
    }
}
