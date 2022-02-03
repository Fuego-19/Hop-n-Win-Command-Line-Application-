package com.company2;
import java.util.Random;


public class RandomGenerator {
    private int value;


    public int generateNumbers(){
        Random rand = new Random();
        this.value =rand.nextInt(5000);
        return this.value;
    }
    public int generateJump(){
        Random rand = new Random();
        this.value =rand.nextInt(21) + 1;
        return this.value;
    }

    public String generateString() {
        int lt = 97; // letter 'a'
        int rt = 122; // letter 'z'
        int len = 4;
        Random random = new Random();

        String strGen = random.ints(lt, rt + 1)
                .limit(len)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return strGen;
    }

}
