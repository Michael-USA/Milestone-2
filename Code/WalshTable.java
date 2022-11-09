package Code;

import java.util.Arrays;

public class WalshTable {
    private int size = 4;
    private int[][] chips = {{1, 1, 1, 1},
                            {1, -1, 1, -1},  
                            {1, 1, -1, -1},
                            {1, -1, -1, 1}};
    private int chipAssigner;
    
    public WalshTable() {
        chipAssigner = -1;
    }
    
    // Cycles through the chips 2D array, returning the
    // next array in the sequence.
    public int[] getNextChip() {
        chipAssigner++;
        if (chipAssigner >= 4) {
            System.out.println("WARNING: Assigner exceeds chip quantity. Cycling back to first sequence.");
            chipAssigner = 0;
        }
        return chips[chipAssigner];
    }
    
    public int getSize() {
        return size;
    }
    
    // Prints the multiplicities of an array of stations.
    public void printChipMultiplicities(Station[] stations) {
        for (int i = 0; i < stations.length; i++) {
            System.out.println(Arrays.toString(stations[i].getChipMultiplicity()));
        }
    }
    
    // Prints the final data array, obtained from summing the
    // values of a list of station multiplicity arrays that
    // have matching indecies.
    public void printDataArray(Station[] stations) {
        int[] dataArray = new int[4];
        for (int i = 0; i < stations.length; i++) {
            for (int j = 0; j < stations.length; j++) {
                dataArray[i] += stations[j].getChipMultiplicity()[i];
            }
        }
        System.out.println("Message: " + Arrays.toString(dataArray));
    }
    
    @Override
    public String toString() {
        String value = "Walsh Matrix Data:\n";
        for (int i = 0; i < chips[0].length; i++) {
            value += "C" + (i + 1) + ": " + Arrays.toString(chips[i]) + "\n";
        }
        return value;
    }
    
    public String toString(Station[] stations) {
        String value = "";
        for (int i = 0; i < stations.length; i++) {
            value += "Station " + (i + 1) + ": " + stations[i].toString() + "\n";
        }
        return value;
    }
}

