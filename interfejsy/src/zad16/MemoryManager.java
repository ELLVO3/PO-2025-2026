package zad16;

public interface MemoryManager {
    void allocateMemory(int size);
    default void freeMemory(){
            System.out.println("Memory freed");
    }
    static String getMemoryType(){
        return "Memory Type";
    }
}
