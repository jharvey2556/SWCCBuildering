package io.github.jharvey2556.SWCCBuildering.list;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClimbRepositoryImpl implements ClimbRepository {
    private final JdbcTemplate jdbc;
    private final RowMapper<ClimbItem> climbMapper;

    public ClimbRepositoryImpl(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
        this.climbMapper = (rs, rowNum) -> new ClimbItem(
            rs.getLong("id"),
            rs.getString("name"),
            rs.getString("grade"),
            rs.getInt("stars"),
            rs.getString("location"),
            rs.getString("description")
        );
    }

    @Override
    public List<ClimbItem> getClimbs() {
        String sql = "SELECT id, name, grade, stars, location, description FROM climb";
        return jdbc.query(sql, climbMapper);
    }

    @Override 
    public ClimbItem getClimb(Long id) {
        String sql = "SELECT * FROM climb WHERE id = ?";
        return jdbc.queryForObject(sql, climbMapper, id);
    }
}
