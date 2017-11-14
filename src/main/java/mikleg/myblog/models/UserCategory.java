package mikleg.myblog.models;

import javax.persistence.*;
import java.util.List;
@Entity
public class UserCategory {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private boolean isPostAllowed;
    private boolean isAddUsersAllowed;
    private boolean isCommentsAllowed;

    @OneToMany()
    @JoinColumn(name ="user_category_id")
    private List<User> users;

    public UserCategory() {
    }

    public UserCategory(String name, boolean isPostAllowed, boolean isAddUsersAllowed, boolean isCommentsAllowed) {
        this.name = name;
        this.isPostAllowed = isPostAllowed;
        this.isAddUsersAllowed = isAddUsersAllowed;
        this.isCommentsAllowed = isCommentsAllowed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPostAllowed() {
        return isPostAllowed;
    }

    public void setPostAllowed(boolean postAllowed) {
        isPostAllowed = postAllowed;
    }

    public boolean isAddUsersAllowed() {
        return isAddUsersAllowed;
    }

    public void setAddUsersAllowed(boolean addUsersAllowed) {
        isAddUsersAllowed = addUsersAllowed;
    }

    public boolean isCommentsAllowed() {
        return isCommentsAllowed;
    }

    public void setCommentsAllowed(boolean commentsAllowed) {
        isCommentsAllowed = commentsAllowed;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public int getId() {
        return id;
    }
}
