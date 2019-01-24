package Model;

import java.util.ArrayList;

public class footballPlayer
{

    private int number;
    private String name;
    private String position;
    private heightClass height;
    private int weight;
    private String hometown;
    private String highSchool;

    public footballPlayer(int nu, String na, String po, int hf, int hi, int wt, String ht, String hs)
    {
        number = nu;
        name = na;
        position = po;
        height = new heightClass(hf, hi);
        weight = wt;
        hometown = ht;
        highSchool = hs;
    }

    public ArrayList<String> fpString()
    {
        ArrayList<String> sFP = new ArrayList<String>();
        sFP.add(getNumberString());
        sFP.add(name);
        sFP.add(position);
        sFP.add(height.toString());
        sFP.add(getWeightString());
        sFP.add(hometown);
        sFP.add(highSchool);
        return sFP;
    }

    public int getNumber()
    {
        return number;
    }

    public String getNumberString()
    {
        return new Integer(number).toString();
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public heightClass getHeight()
    {
        return height;
    }

    public void setHeight(heightClass height)
    {
        this.height = height;
    }

    public int getWeight()
    {
        return weight;
    }

    public String getWeightString()
    {
        return new Integer(weight).toString();
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public String getHometown()
    {
        return hometown;
    }

    public void setHometown(String hometown)
    {
        this.hometown = hometown;
    }

    public String getHighSchool()
    {
        return highSchool;
    }

    public void setHighSchool(String highSchool)
    {
        this.highSchool = highSchool;
    }

}
