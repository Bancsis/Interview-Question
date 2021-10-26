
public class Interview {

	public static void main(String[] args) {
        // Initialise number
        int number = 0;

        // function calls for the iterations of 7, 8, 9 until the cap specified in the briefing
        number = loop(7, 100, number);
        number = loop(8, 200, number);
        number = loop(9, 300, number);
        System.out.println("End number : " + number);

    }

    public static int loop(int iteration, int cap, int number) {
        // checks the number is below the cap to run the loop
        while(number < cap){
            // if statement to make sure the number doesn't go over cap as while loop doesn't catch the final number
            if(number + iteration >= cap){return number;}
            // adding the iteration
            number += iteration;
            // showing the output
            System.out.print(number + "\n");

        }
        // returning the number so it doesn't reset the number back to 0
        return number;
    }
}