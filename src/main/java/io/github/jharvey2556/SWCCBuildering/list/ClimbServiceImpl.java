package io.github.jharvey2556.SWCCBuildering.list;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service 
public class ClimbServiceImpl implements ClimbService {
    private final ClimbRepository climbRepository;

    public ClimbServiceImpl(ClimbRepository climbRepository) {
        this.climbRepository = climbRepository;
    }

    @Override
    public List<ClimbItem> getClimbs() {
        return climbRepository.getClimbs();
    }

    @Override
    public ClimbItem getClimbById(Long id) {
        ClimbItem climb = climbRepository.getClimb(id);
        if (climb == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Climb not found with id: " + id);
        }
        return climb;
    }
}
