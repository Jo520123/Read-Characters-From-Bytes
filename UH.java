package component;

import java.io.Serializable;

public class UH implements Serializable {

    private String lastname;
    private int age;


    public UH()
    {

    }


    public UH(String name, int age)
    {

        this.lastname = name;
        this.age = age;


    }


    public String getLastName()
    {
        return lastname;

    }

    public void setLastName(String lastname)
    {

        this.lastname = lastname;

    }



    public int getAge()
    {

        return age;

    }


    public void setAge(int age)
    {

        this.age = age;

    }



    @Override

    public String toString()
    {

        return "User{" +
                "name ='" + lastname + '\'' + ", age=" + age + '}';

    }




}
