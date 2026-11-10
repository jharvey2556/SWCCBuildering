package io.github.jharvey2556.SWCCBuildering.list;

import java.util.List;

public class ClimbServiceImpl implements ClimbService {
    private final ClimbRepository climbRepository;

    public ClimbServiceImpl(ClimbRepository climbRepository) {
        this.climbRepository = climbRepository;
    }

    @Override
    public List<ClimbItem> getClimbs() {
        return climbRepository.getClimbs();
    }
}
