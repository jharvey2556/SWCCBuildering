package io.github.jharvey2556.SWCCBuildering.list;
import java.util.List;

public interface ClimbRepository {
    List<ClimbItem> getClimbs();
    ClimbItem getClimb(Long id);
}
