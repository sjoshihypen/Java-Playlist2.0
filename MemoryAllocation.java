import java.util.*;
public class MemoryAllocation {
    private static class MemoryBlock {
        int startingAddress;
        int size;
        boolean allocated;

        public MemoryBlock(int startingAddress, int size) {
            this.startingAddress = startingAddress;
            this.size = size;
            this.allocated = false;
        }
    }

    public static void main(String[] args) {
        List<MemoryBlock> memoryBlocks = Arrays.asList(
                new MemoryBlock(0, 100),
                new MemoryBlock(100, 50),
                new MemoryBlock(150, 200),
                new MemoryBlock(350, 300)
        );

        List<Integer> processSizes = Arrays.asList(90, 40, 250, 110);

        System.out.println("Worst-fit Allocation:");
        allocateMemory(memoryBlocks, processSizes, (b1, b2) -> Integer.compare(b2.size, b1.size));

        System.out.println("\nBest-fit Allocation:");
        allocateMemory(memoryBlocks, processSizes, Comparator.comparingInt(b -> b.size));

        System.out.println("\nFirst-fit Allocation:");
        allocateMemory(memoryBlocks, processSizes, Comparator.comparingInt(b -> b.startingAddress));
    }

    private static void allocateMemory(List<MemoryBlock> memoryBlocks, List<Integer> processSizes, Comparator<MemoryBlock> comparator) {
        for (int processSize : processSizes) {
            MemoryBlock selectedBlock = memoryBlocks.stream()
                    .filter(block -> !block.allocated && block.size >= processSize)
                    .max(comparator)
                    .orElse(null);

            if (selectedBlock != null) {
                selectedBlock.allocated = true;
                System.out.println("Process size: " + processSize + " allocated to block: " + selectedBlock.startingAddress + " - " + (selectedBlock.startingAddress + selectedBlock.size));
            } else {
                System.out.println("Process size: " + processSize + " cannot be allocated");
            }
        }
    }
}
 
