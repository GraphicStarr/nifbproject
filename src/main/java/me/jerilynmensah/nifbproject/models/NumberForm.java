package me.jerilynmensah.nifbproject.models;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class NumberForm {
    @NotNull
    @Min(1)
    private int id;

    @NotNull
    @Size(min=10,max=10000)
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
