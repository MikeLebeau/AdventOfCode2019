package fr.mike;

public class Day1 {
    public static void main(String[] args) {
        System.out.println("Exo 1");

        int value = 0;

        for(String mass: getRealInput().split("\n")){
            value += calculFuelRequired(Integer.parseInt(mass));
        }

        System.out.println("Result: " + value);
    }

    public static int calculFuelRequired(int mass){
        int fuelNeeded = mass / 3;
        fuelNeeded = Math.round(fuelNeeded);
        fuelNeeded -= 2;
        fuelNeeded += calculAdditionalFuel(fuelNeeded);
        return fuelNeeded;
    }

    public static int calculAdditionalFuel(int fuel){
        int additionalFuel = 0;

        do{
            fuel = Math.round((fuel/3));
            if(fuel-2 > 0) {
                fuel -= 2;
                additionalFuel += fuel;
            }
        }while(fuel != 0);

        return additionalFuel;
    }

    public static String getInput(){
        return "12\n" +
                "14\n" +
                "1969\n" +
                "100756";
    }

    public static String getRealInput(){
        return "113045\n" +
                "63499\n" +
                "117820\n" +
                "67582\n" +
                "100343\n" +
                "132920\n" +
                "122289\n" +
                "142311\n" +
                "51373\n" +
                "142364\n" +
                "121174\n" +
                "90330\n" +
                "111284\n" +
                "82104\n" +
                "79008\n" +
                "141202\n" +
                "138923\n" +
                "100852\n" +
                "56219\n" +
                "72879\n" +
                "101983\n" +
                "78405\n" +
                "139516\n" +
                "112582\n" +
                "84889\n" +
                "131671\n" +
                "137836\n" +
                "88443\n" +
                "79239\n" +
                "70567\n" +
                "112671\n" +
                "63253\n" +
                "139851\n" +
                "100280\n" +
                "62443\n" +
                "109478\n" +
                "116067\n" +
                "94324\n" +
                "107225\n" +
                "53355\n" +
                "63022\n" +
                "102727\n" +
                "66149\n" +
                "111880\n" +
                "114110\n" +
                "77370\n" +
                "98892\n" +
                "120981\n" +
                "149730\n" +
                "84149\n" +
                "103898\n" +
                "145915\n" +
                "132071\n" +
                "73244\n" +
                "58793\n" +
                "130003\n" +
                "127716\n" +
                "114590\n" +
                "127568\n" +
                "68300\n" +
                "103464\n" +
                "97757\n" +
                "89432\n" +
                "145750\n" +
                "132882\n" +
                "92343\n" +
                "106288\n" +
                "101093\n" +
                "76813\n" +
                "66761\n" +
                "100011\n" +
                "128436\n" +
                "117810\n" +
                "146648\n" +
                "63211\n" +
                "107305\n" +
                "111933\n" +
                "137197\n" +
                "54156\n" +
                "122614\n" +
                "129652\n" +
                "141407\n" +
                "99562\n" +
                "50643\n" +
                "57059\n" +
                "134789\n" +
                "140015\n" +
                "112419\n" +
                "117933\n" +
                "139452\n" +
                "138977\n" +
                "137325\n" +
                "113279\n" +
                "111160\n" +
                "145219\n" +
                "107037\n" +
                "97361\n" +
                "72949\n" +
                "52997\n" +
                "121614\n";
    }
}
