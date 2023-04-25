interface Measure {
    public double max();
    double min();
    double avg();
}
    class Temperature implements Measure {
        double[] T_data;

        public double max() {
            //double mx;
            //int i;

            double mx = T_data[0];
            for (int i = 1; i < T_data.length; i++)
                if (mx < T_data[i]) mx = T_data[i];

                return (mx);
        }


        public double min() {

            double mn = T_data[0];
            for (int i = 1; i < T_data.length; i++)
                if (mn > T_data[i]) mn = T_data[i];

                return (mn);
        }
        public double avg() {

            double sm;
            int i;

            for (i =0, sm = 0; i <T_data[0]; i++)
                sm += T_data[i];
                return(sm / i);
        }    
    }

class Humidity implements Measure {
    double H_data[];

    public double max() {

        double mx = H_data[0];
        for (int i = 1; i < H_data.length; i++)
            if (H_data[i] <= 100 && mx < H_data[i])
                mx = H_data[i];
            
            return (mx);
    }
    public double min() {

        double mn = H_data[0];
        for (int i = 1; i < H_data.length; i++)
            if (H_data[i] >= 100 && mn > H_data[i])
                mn = H_data[i];
            
            return (mn);
    }
    public double avg() {

        double sm = 0;
        int count = 0;
        for (int i = 0; i < H_data.length; i++) {
            if (0 <= H_data[i] && H_data[i] <= 100) {
                sm += H_data[i];
                count++;
            }
        }
        return (sm/count);
    }    
}
