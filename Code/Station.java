package Code;

import java.util.Arrays;

public class Station {
    
    private int bit;
    private int[] chip = new int[4];
    
    public Station(WalshTable table, int bit) {
        chip = table.getNextChip();
        this.bit = bit;
    }
    
    public void setBit(int bit) {
        this.bit = bit;
    }
    
    public int getBit() {
        return bit;
    }
    
    public void setChip(int[] chip) {
        this.chip = chip;
    }
    
    public int[] getChip() {
        return chip;
    }
    
    // Returns a new array created from the product of each
    // value in the chip array and the bit value.
    public int[] getChipMultiplicity() {
        int[] returnChip = new int[4];
        for (int i = 0; i < 4; i++) {
            returnChip[i] = bit * chip[i];
        }
        return returnChip;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(chip) + ", Bit: " + bit;
    }
    
}

