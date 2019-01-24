package Model;

import java.util.ArrayList;

public class Model
{

    private FootballPlayerData FPData;

    public Model()
    {
        FPData = new FootballPlayerData();
    }

    /**
     * @return the FPData
     */
    public FootballPlayerData getFPData()
    {
        return FPData;
    }

    /**
     * @param FPData the FPData to set
     */
    public void setFPData(FootballPlayerData FPData)
    {
        this.FPData = FPData;
    }

}
