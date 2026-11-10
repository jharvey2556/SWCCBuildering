package io.github.jharvey2556.SWCCBuildering.Main;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String printTable() {
        return "table here";
    }
}
