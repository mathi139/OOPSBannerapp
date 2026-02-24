public class OOPSBannerapp {

    public static void main(String[] args) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            printO(i, height);
            System.out.print("  ");
            printO(i, height);
            System.out.print("  ");
            printP(i, height);
            System.out.print("  ");
            printS(i, height);

            System.out.println();
        }
    }

    static void printO(int i, int n) {
        for (int j = 0; j < n; j++) {
            if ((i == 0 || i == n - 1) && j > 0 && j < n - 1 ||
                (j == 0 || j == n - 1) && i > 0 && i < n - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    static void printP(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (j == 0 ||
                (i == 0 && j < n - 1) ||
                (i == n / 2 && j < n - 1) ||
                (j == n - 1 && i > 0 && i < n / 2)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    static void printS(int i, int n) {
        for (int j = 0; j < n; j++) {
            if ((i == 0 || i == n / 2 || i == n - 1) ||
                (j == 0 && i < n / 2) ||
                (j == n - 1 && i > n / 2)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}