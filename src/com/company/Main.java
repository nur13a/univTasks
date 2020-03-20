package com.company;

public class Main {
    public static void main(String[] args) {
        QueueQ myQueue = new QueueQ(5);

        myQueue.insert(1);
        myQueue.insert(2);
        myQueue.insert(3);
        myQueue.insert(4);
        myQueue.insert(5);

        myQueue.remove();
        myQueue.remove();
        myQueue.remove();

        myQueue.insert(6);
        myQueue.insert(7);

        while (!myQueue.isEmpty()) {
            int n = myQueue.remove();
            System.out.println("Elem: " + n);
        }
    }
}






   /* public static void main(String[] args) {
        Matrix m = new Matrix(new int[3][3]);
        m.matrix[0][0] = 1;
        m.matrix[0][1] = 0;
        m.matrix[0][2] = 1;
        m.matrix[1][0] = 0;
        m.matrix[1][1] = 2;
        m.matrix[1][2] = -1;
        m.matrix[2][0] = 3;
        m.matrix[2][1] = -1;
        m.matrix[2][2] = 0;
        int[] nums = {4, 1, 1};
     //   System.out.println(answer(getDelta(m),getDelta2(m,nums,0)));
       System.out.println(answer(getDelta(m),getDelta2(m,nums,1)));
//        System.out.println(answer(getDelta(m),getDelta2(m,nums,2)));
//        m.printMatrix();
    }

    public static double getDelta(Matrix m) {
        return m.getMatrix()[0][0] * m.getMatrix()[1][1] * m.getMatrix()[2][2] +
                m.getMatrix()[0][1] * m.getMatrix()[1][2] * m.getMatrix()[2][0] +
                m.getMatrix()[0][2] * m.getMatrix()[1][0] * m.getMatrix()[2][1] -
                m.getMatrix()[0][2] * m.getMatrix()[1][1] * m.getMatrix()[2][0] -
                m.getMatrix()[0][1] * m.getMatrix()[1][0] * m.getMatrix()[2][2] -
                m.getMatrix()[0][0] * m.getMatrix()[1][2] * m.getMatrix()[2][1];

    }

    public static double getDelta2(Matrix m, int[] a, int column) {
        for (int k = 0; k < a.length; k++) {
            for (int i = 0; i < m.getMatrix().length; i++) {
                for (int j = 0; j < m.getMatrix()[i].length; j++) {
                    if (j == column)
                        m.matrix[i][column] = a[i];
                }
            }
        }
        return getDelta(m);
    }

    public static double answer(double delta, double deltaX) {
        return delta / deltaX;
    }
}*/
