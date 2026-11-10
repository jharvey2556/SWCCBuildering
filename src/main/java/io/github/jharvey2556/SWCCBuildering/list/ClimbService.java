package io.github.jharvey2556.SWCCBuildering.list;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ClimbService {
    List<ClimbItem> getClimbs();
}
