package Calculate.pro.CalculateKIMdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String helloCalculator() {
        return calculatorService.helloCalculator();
    }

    @GetMapping("/plus")
    public String calculatorPlus(
            @RequestParam(name = "number1", required = false) Integer a,
            @RequestParam(name = "number2", required = false) Integer b) {
        return calculatorService.operationPlus(a, b);
    }

    @GetMapping("/minus")
    public String calculatorMinus(
            @RequestParam(name = "number1", required = false) Integer a,
            @RequestParam(name = "number2", required = false) Integer b) {
        return calculatorService.operationMinus(a, b);
    }

    @GetMapping("/multiply")
    public String calculatorMultiply(
            @RequestParam(name = "number1", required = false) Integer a,
            @RequestParam(name = "number2", required = false) Integer b) {
        return calculatorService.operationMultiply(a, b);
    }

    @GetMapping("/division")
    public String calculatorDivision(
            @RequestParam(name = "number1", required = false) Integer a,
            @RequestParam(name = "number2", required = false) Integer b) {
        return calculatorService.operationDivision(a, b);
    }
}
