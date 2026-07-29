//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String[] months = {"Month 1", "Month 2", "Month 3"};
    String[] gym = {"Gym1", "Gym2", "Gym3"};
    int[][] kilograms = {{10, 20, 27}, {22, 5, 20}, {30, 20, 10}}; // kilograms[gym][month]

    System.out.println("GYM WEIGHTLOSS APPLIATION");
    System.out.println("---------------------------------------------------------------------------------");

    System.out.printf("%-8s", "");
    for (int a = 0; a < months.length; a++) {
        System.out.printf("%-8s", months[a]);
    }
    System.out.printf("| %-8s%-8s%-8s%-8s%n","TOTAL", "AVG", "MIN", "MAX");
    System.out.println("---------------------------------------------------------------------------------");

    for (int b = 0; b < gym.length; b++) {
        System.out.printf("%-8s", gym[b]);

        int total = 0;
        int min = kilograms[b][0];
        int max = kilograms[b][0];

        for (int c = 0; c < kilograms[b].length; c++) {
            System.out.printf("%-8s", kilograms[b][c] + "Kg");
            total += kilograms[b][c];

            if (kilograms[b][c] < min) {
                min = kilograms[b][c];
            }
            if (kilograms[b][c] > max) {
                max = kilograms[b][c];
            }
        }

        double average = (double) total / kilograms[b].length;

        System.out.printf("|,%-8s%-8s%-8s%-8s%n",
                total + "Kg", String.format("%.2f", average) + "Kg", min + "Kg", max + "Kg");
    }

}

