package operation;

public class division extends Operator{

    public division(double a, double b) {
        super(a, b);
    }

    /**
     * Почему-то выдает бесконечность, почитал, что из-за 2 типов плавающих, решил перекинуть их сначала в int, после вернуть, так получается ошибка
     * @return Exception и 0 при нуле, либо деление
     */
    @Override
    public double calculate() {
        try {
            if ( b == 0)
            {
                int aErrorExceptionNull = (int) a;
                int bErrorExceptionNull = (int) b;
                return aErrorExceptionNull / bErrorExceptionNull;
            }
            return a / b;
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
