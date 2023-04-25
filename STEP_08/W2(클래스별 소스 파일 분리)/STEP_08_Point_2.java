class STEP_08_Point_2 {
    public static void main(String args[]) throws IOException{
        Point pnt1, pnt2;
        int x1, y1, x2, y2;
        double dl;

        x1 = System.in.read() - '0';
        y1 = System.in.read() - '0';
        x2 = System.in.read() - '0';
        y2 = System.in.read() - '0';

        pnt1 = new Point_1(x1, y1);
        pnt2 = new Point_1(x2, y2);

        dl = Math.sqrt(Math.pow(pnt1.get_x() - pnt2.get_x(), 2) + Math.pow(pnt1.get_y() - pnt2.get_y(), 2));
        System.out.printf("dl=%f\n", dl);
    }
}
