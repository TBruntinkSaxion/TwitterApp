package nl.saxion.tk.twitterapp.models;

public class User {

    private long id;
    private String id_str;
    private String name;
    private String screen_name;
    private String location;
    private String description;
    private String url;
    private String profile_image_url;

    public User(String name, String screen_name, String location, String description) {
        this.name = name;
        this.screen_name = screen_name;
        this.location = location;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
