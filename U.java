package component;

import java.io.Serializable;

public class U implements Serializable {

    private static final long serialVersionUID = -8174243983776052960L;

    //private String name;
    private String firstName;
    private int age;


    public U()
    {

    }


    public U(String name, int age)
    {

        this.firstName = name;
        this.age = age;


    }


    public String getFirstName()
    {
        return firstName;

    }

    public void setName(String name)
    {

        this.firstName = name;

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
                "First Name ='" + firstName + '\'' + ", Age=" + age + '}';

    }


}
