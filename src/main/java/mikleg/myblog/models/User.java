package mikleg.myblog.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String passwordHash;
    private String fullName;

    @OneToMany()
    @JoinColumn(name ="user_id")
    private Set<Post> posts = new HashSet<>();

    @ManyToOne
    private UserCategory userCategory;

    public User() {
    }

    public User(int id, String username, String fullName, UserCategory category) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.userCategory = category;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    public UserCategory getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(UserCategory userCategory) {
        this.userCategory = userCategory;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", fullName='" + fullName + '\'' +
                ", userCategory=" + userCategory +
                '}';
    }
}
