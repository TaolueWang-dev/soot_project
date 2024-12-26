public class testGoto {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;

        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is not greater than y");
        }

        switch (x) {
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            case 3:
                System.out.println("x is 3");
                break;
            default:
                System.out.println("x is other value");
                break;
        }

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("Breaking the loop at i = " + i);
                break;
            }
            System.out.println("i = " + i);
        }

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Skipping i = " + i);
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
