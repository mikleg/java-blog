package mikleg.myblog.models;

import java.util.HashSet;
import java.util.Set;


public class User {
    private Long id;
    private String username;
    private String passwordHash;
    private String fullName;
    private Set<Post> posts = new HashSet<>();

}
