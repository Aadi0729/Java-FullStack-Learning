/**
 * Build a system that:
 * Fetches users from a database (we'll mock it).
 * Each user has roles (unique).
 *
 * We want to:
 * Remove inactive users
 * List all active users
 * Count users per role
 */

package Project;

import java.util.Set;

public class User {
    private String user;
    private boolean isActive;
    private Set<String> roles;

    public User(String user, boolean isActive, Set<String> roles) {
        this.user = user;
        this.isActive = isActive;
        this.roles = roles;
    }

    public String getUser() {
        return user;
    }

    public boolean isActive() {
        return isActive;
    }

    public Set<String> getRoles() {
        return roles;
    }
}
