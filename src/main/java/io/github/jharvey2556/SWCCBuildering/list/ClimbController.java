package io.github.jharvey2556.SWCCBuildering.list;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/climbs")
public class ClimbController {
    private final ClimbService climbService;

    public ClimbController(ClimbService climbService) {
        this.climbService = climbService;
    }

    @GetMapping("")
    public String displayClimbs(Model model) {
        model.addAttribute("climbs", climbService.getClimbs());
        return "climbs";
    }

    @GetMapping("/{id}")
    public String getClimbDetails(@PathVariable("id") Long id, Model model) {
        ClimbItem climb = climbService.getClimbById(id);

        model.addAttribute("climb", climb);

        return "climb-detail";
    }
}
