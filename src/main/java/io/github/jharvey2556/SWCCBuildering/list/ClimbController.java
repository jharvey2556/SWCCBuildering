package io.github.jharvey2556.SWCCBuildering.list;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClimbController {
    private final ClimbService climbService;

    public ClimbController(ClimbService climbService) {
        this.climbService = climbService;
    }

    @GetMapping("/climbs")
    public String displayClimbs(Model model) {
        model.addAttribute("climbs", climbService.getClimbs());
        return "climbs";
    }
}
