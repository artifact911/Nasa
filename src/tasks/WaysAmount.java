package tasks;

// дан прямоугольник со сторонами x и y
// в левом верхнем углу челик, в нижем правом - финиш
// Челик может ходить только направо и вниз
// необходимо написать метод, который принимает на вход стороны прямоугольника
// и выдает количество возможных путей похода челика к финишу
public class WaysAmount {
    public static void main(String[] args) {
        int x = 4;
        int y = 4;

        System.out.println("Итого вариантов: " + ways(x, y));
    }

    private static int ways(int x, int y) {
        int[][] array = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == 0 && j == 0) {
                    array[i][j] = 0;
                }

                if (i == 0 && j > 0) {
                    array[i][j] = 1;
                }

                if (j == 0 && i > 0) {
                    array[i][j] = 1;
                }

                if (i > 0 && j > 0) {
                    array[i][j] = array[i][j - 1] + array[i - 1][j];
                }
            }
        }

        return array[x - 1][y - 1];

    }
}
