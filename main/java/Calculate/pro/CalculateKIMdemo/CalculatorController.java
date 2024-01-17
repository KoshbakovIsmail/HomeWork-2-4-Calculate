package Calculate.pro.CalculateKIMdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final Service service;

    @Autowired
    public CalculatorController(Service service) {
        this.service = service;
    }

    @GetMapping()
    public String helloCalculator() {
        return service.helloCalculator();
    }

    @GetMapping("/plus")
    public String calculatorPlus(
            @RequestParam(name = "number1", required = false) Integer a,
            @RequestParam(name = "number2", required = false) Integer b) {
        return service.operationPlus(a, b);
    }

    @GetMapping("/minus")
    public String calculatorMinus(
            @RequestParam(name = "number1", required = false) Integer a,
            @RequestParam(name = "number2", required = false) Integer b) {
        return service.operationMinus(a, b);
    }

    @GetMapping("/multiply")
    public String calculatorMultiply(
            @RequestParam(name = "number1", required = false) Integer a,
            @RequestParam(name = "number2", required = false) Integer b) {
        return service.operationMultiply(a, b);
    }

    @GetMapping("/division")
    public String calculatorDivision(
            @RequestParam(name = "number1", required = false) Integer a,
            @RequestParam(name = "number2", required = false) Integer b) {
        return service.operationDivision(a, b);
    }
}
