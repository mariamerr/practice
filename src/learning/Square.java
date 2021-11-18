package learning;

public class Square {

        public static void main(String[] args) {
            int y = 0;
            while (y < 10) {
                if (!(y == 0 || y == 9)) {
                int x = 0;
                while (x < 20) {
                    if (x == 0 || x == 19) {
                        System.out.print('Б');
                            } else {
                            System.out.print(' ');
                            }
                    x++;
                }

                } else {
                    int z = 0;
                    while (z < 20) {
                        System.out.print('Б');
                        z++;
                    }
                }
                y++;
                System.out.println();
            }
        }
}