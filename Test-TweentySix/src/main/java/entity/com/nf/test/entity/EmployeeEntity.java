package entity.com.nf.test.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EmployeeEntity {
    private Integer id;
    private String username;
    private BigDecimal salary;
    private Date hiredate;

    public EmployeeEntity(Integer id, String username, BigDecimal salary, Date hiredate) {
        this.id = id;
        this.username = username;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", salary=" + salary +
                ", hiredate=" + hiredate +
                '}';
    }
}
