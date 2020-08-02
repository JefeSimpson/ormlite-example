package org.github.jefeSimpson.ormlite.example;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Student {
    @DatabaseField(id = true)
    private long id;
    @DatabaseField(columnName = "first_name")
    private String firstName;
    @DatabaseField(columnName = "last_name")
    private String lastName;
    @DatabaseField(columnName = "group_id", foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    private StudentClass groupId;

    public Student() {
    }

    public Student(long id, String firstName, String lastName, StudentClass groupId) {
        this.groupId = groupId;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public StudentClass getGroupId() {
        return groupId;
    }

    public void setGroupId(StudentClass groupId) {
        this.groupId = groupId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupId=" + groupId +
                '}';
    }
}
