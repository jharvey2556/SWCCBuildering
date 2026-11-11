package io.github.jharvey2556.SWCCBuildering.list;

import java.util.List;

public interface ClimbService {
    List<ClimbItem> getClimbs();
    ClimbItem getClimbById(Long id);
}
