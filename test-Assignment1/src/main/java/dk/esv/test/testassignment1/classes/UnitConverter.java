package dk.esv.test.testassignment1.classes;

public class UnitConverter {

    public double convert(double input, char type) {
        if (type == 'C') {
            return (input*1.8)+32;
        } else if (type == 'F') {
            return (input-32)/1.8;
        } else {
            throw new IllegalArgumentException();
        }

    }

}
