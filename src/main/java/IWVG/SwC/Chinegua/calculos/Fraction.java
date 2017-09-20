package IWVG.SwC.Chinegua.calculos;

public class Fraction {
    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean largerNumerator() {
        if (this.numerator > this.denominator) {
            return true;
        }
        return false;
    }

    public double multiplyFraction(Fraction fractionA, Fraction fractionB) {
        assert fractionA != null;
        assert fractionB != null;
        return (double)((fractionA.getNumerator() / fractionA.getDenominator()) * (fractionB.getNumerator() / fractionB.getDenominator()));
    }

    public Fraction addFraction(Fraction f) {
        int num = this.getNumerator() * f.getDenominator() + f.getNumerator() * this.getDenominator();
        int den = this.getDenominator() * f.getDenominator();
        Fraction result = new Fraction(num, den);
        return result;
    }
}
