public class lingkaran {
        private int r;
        private double pi;
        private double Keliling;

        public void hitungKeliling () {
            this.Keliling = 2 * pi * r;
        }

        public void setR ( int r){
            this.r = r;
        }

        public void setPi ( double pi){
            this.pi = pi;
        }

        public double getKeliling () {
            return Keliling;
        }
}
