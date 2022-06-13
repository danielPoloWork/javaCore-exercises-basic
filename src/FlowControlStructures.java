public class FlowControlStructures {

    public static void main(String[] args) {
        /** FLOW CONTROL STRUCTURE: IF */
        /*boolean booleanCondition = false;

        if(booleanCondition) {}*/

        if (args[0].equals("SUM")) {
            System.out.println(1 + 2);
        } else {
            System.out.println("SUM operation not found.");
        }

        if (args[0].equals("MIN")) {
            System.out.println(1 - 2);
        } else {
            System.out.println("MIN operation not found.");
        }

        if (args[0].equals("SUM")) {
            System.out.println(1 + 2);
        } else if (args[0].equals("MIN")) {
            System.out.println(1 - 2);
        } else {
            System.out.println("SUM or MIN operation not found.");
        }

        /** FLOW CONTROL STRUCTURE: SWITCH */
        switch (args[0]) {
            case "SUM":
                System.out.println(1 + 2);
                break; //interrompe il flusso ed esce dallo switch.
            case "MIN":
                System.out.println(1 - 2);
                break; //interrompe il flusso ed esce dallo switch.
            default:
                System.out.println("SUM or MIN operation not found.");
        }
    }
}