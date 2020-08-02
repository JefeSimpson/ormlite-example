package org.github.jefeSimpson.ormlite.example;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class StudentClass {
    @DatabaseField(id = true)
    private long groupId;
    @DatabaseField()
    private String name;

    public StudentClass(){

    }

    public StudentClass(long groupId, String name) {
        this.groupId = groupId;
        this.name=name;
    }

    public long getGroupId() {
        return groupId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

}
