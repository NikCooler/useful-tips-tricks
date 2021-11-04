package summery_stats;

import java.util.List;

public class User {

    private Integer id;
    private String name;
    private Double money;
    private List<UserRole> roles;

    public User(Integer id, String name, Double money, List<UserRole> roles) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getMoney() {
        return money;
    }

    public List<UserRole> getRoles() {
        return roles;
    }
}
