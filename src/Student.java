public class Student {
    public String name;
    public String student;
    public double bimestre1;
    public double bimestre2;
    public double bimestre3;
    public double notafinal(){
        return bimestre1 + bimestre2 + bimestre3;

    }

    public double precisandoDePontos() {
        if (notafinal() < 60.0 ){
            return 60.0 - notafinal();
        }
        else {
            return 0.0;
        }
    }
}
