package Calculate.pro.CalculateKIMdemo;

@org.springframework.stereotype.Service
public class CalculatorServiceImpl implements Service {

    public String helloCalculator() {
        return "Hello Calculator";
    }

    public String operationPlus(Integer a, Integer b) {
        if (a == null || b == null) {
            return "Both numbers are required";
        }
        int result = a + b;
        return a + " + " + b + " = " + result;
    }

    public String operationMinus(Integer a, Integer b) {
        if (a == null || b == null) {
            return "Both numbers are required";
        }
        int result = a - b;
        return a + " - " + b + " = " + result;
    }

    public String operationMultiply(Integer a, Integer b) {
        if (a == null || b == null) {
            return "Both numbers are required";
        }
        int result = a * b;
        return a + " * " + b + " = " + result;
    }

    public String operationDivision(Integer a, Integer b) {
        if (a == null || b == null) {
            return "Both numbers are required";
        } else if (b == 0) {
            return "Division by zero is not allowed";
        }
        int result = a / b;
        return a + " / " + b + " = " + result;
    }

}
