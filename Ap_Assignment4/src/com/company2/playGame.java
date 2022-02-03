package com.company2;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class playGame implements Cloneable{

    private RandomGenerator R = new RandomGenerator();
    private Calculator<Integer> ci = new Calculator<>();
    private Calculator<String> cs = new Calculator<>();
    private int jump;

    private ArrayList<Toy> Bucket = new ArrayList<Toy>();
    private int hopCount = 1;
    playGame() throws CloneNotSupportedException {
        System.out.println("Game is ready");
        startGame();
    }
    private String numtoEng(int no){
        if(no==1){
            return "first";
        }
        else if(no==2){
            return "second";
        }
        else if(no==3){
            return "third";
        }
        else if(no==4){
            return "fourth";
        }
        else if(no==5){
            return "fifth";
        }
        return null;
    }
    public void startGame() throws CloneNotSupportedException {
        if (hopCount <= 5) {
            System.out.println("Hit enter for your " + numtoEng(this.hopCount) + " hop ");
            Main.scn.nextLine();
            this.hopCount++;
            jump = R.generateJump();

            System.out.println("You landed on tile " + jump);
            if(jump==21){
                System.out.println("You are too energetic and zoomed past all the tiles. Muddy Puddle Splash!");
                startGame();
                return;
            }
            if(jump%2 != 0) {
                System.out.println("Question answer round. Integer or strings?");
                try {
                    String inp = Main.scn.next();
                    Main.scn.nextLine();
                    if (inp.equals("integer")) {
                        int n1 = R.generateNumbers();
                        int n2 = R.generateNumbers();
                        System.out.println("Calculate the result of " + n1 + " divide by " + n2);
                        try {
                            int answer = Main.scn.nextInt();
                            Main.scn.nextLine();
                            if (ci.calculateI(n1, n2) == answer) {
                                System.out.println("Correct Answer");

                            } else {
                                System.out.println("Incorrect Answer");
                                System.out.println("You did not win any soft toy");
                                startGame();
                                return;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("InputMismatchException occured. Restarting this hop");
                            this.hopCount--;
                            startGame();
                            return;
                        }
                    } else if (inp.equals("string")) {
                        String s1 = R.generateString();
                        String s2 = R.generateString();
                        System.out.println("Calculate the concatenation of strings " + s1 + " and " + s2);
                        try {
                            String ans = Main.scn.next();
                            Main.scn.nextLine();
                            if (ans.equals(cs.calculateS(s1, s2))) {
                                System.out.println("Correct Answer");
                            } else {
                                System.out.println("Incorrect Answer");
                                System.out.println("You did not win any soft toy");
                                startGame();
                                return;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("InputMismatchException occured. Restarting this hop");
                            this.hopCount--;
                            startGame();
                            return;
                        }
                    } else {
                        System.out.println("wrong input. Try again");
                        this.hopCount--;
                        startGame();
                        return;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Wrong input. Try again");
                    this.hopCount--;
                    startGame();
                    return;
                }

            }
            Toy T = Main.getToy(jump);
            Toy clone = (Toy)T.clone();
            System.out.println("You won a " + clone.getToyName() + " soft toy");
            this.Bucket.add(clone);
            startGame();

        }
        else{
            System.out.println("Game Over");
            System.out.println("Soft toys won by you are:");
            for(int i =0; i< Bucket.size(); i++){
                System.out.print(Bucket.get(i).getToyName() + ",");
            }
            return;
        }

    }

}
