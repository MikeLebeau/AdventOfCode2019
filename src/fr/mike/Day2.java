package fr.mike;

import java.util.Arrays;

public class Day2 {
    public static void main(String[] args) {

        System.out.println("Star 1: " + (Arrays.toString(compute(getRealInput(), 12, 2))).replace(" ", ""));

        int nounMax = 100;
        int verbMax = 100;
        for(int i = 0; i < nounMax; i++){
            for(int j = 0; j < verbMax; j++){
                Integer[] test = compute(getRealInput(), i, j);

                if(test[0] == 19690720){
                    System.out.println("Star 2: " + (Arrays.toString(test)).replace(" ", ""));
                    break;
                }
            }
        }

    }

    public static Integer[] compute(String instruction, int noun, int verb){
        Integer[] opcodes = Arrays.stream(instruction.split(",")).map(Integer::parseInt).toArray(Integer[]::new);

        opcodes[1] = noun;
        opcodes[2] = verb;

        for(int i = 0; i < opcodes.length; i+=4){
            switch (opcodes[i]){
                case 1: // Add
                    opcodes[opcodes[i+3]] = opcodes[opcodes[i+1]] + opcodes[opcodes[i+2]];
                    break;
                case 2: // Multiply
                    opcodes[opcodes[i+3]] = opcodes[opcodes[i+1]] * opcodes[opcodes[i+2]];
                    break;
                case 99: // Halt
                    break;
                default:
                    break;
            }
        }
        return opcodes;
    }

    public static String getInput(){
        return "1,1,1,4,99,5,6,0,99"; // Expect 30,1,1,4,2,5,6,0,99
    }

    public static String getRealInput(){
        return "1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,10,1,19,2,19,6,23,2,13,23,27,1,9,27,31,2,31,9,35,1,6,35,39,2,10,39,43,1,5,43,47,1,5,47,51,2,51,6,55,2,10,55,59,1,59,9,63,2,13,63,67,1,10,67,71,1,71,5,75,1,75,6,79,1,10,79,83,1,5,83,87,1,5,87,91,2,91,6,95,2,6,95,99,2,10,99,103,1,103,5,107,1,2,107,111,1,6,111,0,99,2,14,0,0";
    }
}
