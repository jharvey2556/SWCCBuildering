package io.github.jharvey2556.SWCCBuildering.list;

public class ClimbItem {
    private Long id;
    private String name;
    private String grade;
    private Integer stars;
    private String location;
    private String description;

    // Default Constructor
    public ClimbItem() {}

    // Parameterized Constructor
    public ClimbItem(Long id, String name, String grade, Integer stars, String location, String description) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.stars = stars;
        this.location = location;
        this.description = description;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public Integer getStars() { return stars; }
    public void setStars(Integer stars) { this.stars = stars; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description;}
}
