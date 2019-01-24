package Model;

import java.util.ArrayList;
import java.util.ListIterator;

public class FootballPlayerData
{

    private ArrayList<String> columnNames;
    private ArrayList<footballPlayer> FPList;

    public FootballPlayerData()
    {
        columnNames = new ArrayList<String>();
        FPList = new ArrayList<footballPlayer>();
        createColumns();
        createPlayers();
    }

    void createColumns()
    {
        columnNames.add("Number");
        columnNames.add("Name");
        columnNames.add("Position");
        columnNames.add("Height");
        columnNames.add("Weight");
        columnNames.add("Hometown");
        columnNames.add("High School");

    }

    void createPlayers()
    {
        getFPList().add(new footballPlayer(2, "Marcus Allen", "S", 6, 2, 209, "Upper Marlboro, Md.", "Dr. Henry A. Wise, Jr."));
        getFPList().add(new footballPlayer(37, "Kyle Alston", "CB", 5, 9, 180, "Robbinsville, N.J.", "Robbinsville"));
        getFPList().add(new footballPlayer(28, "Troy Apke", "S", 6, 1, 198, "Mt. Lebanon, Pa.", "Mount Lebanon"));
        getFPList().add(new footballPlayer(35, "Matthew Baney", "LB", 6, 0, 225, "State College, Pa.", "State College"));
        getFPList().add(new footballPlayer(26, "Saquon Barkley", "RB", 5, 11, 222, "Coplay, Pa.", "Whitehall"));
        getFPList().add(new footballPlayer(91, "Tarow Barney", "DT", 6, 1, 306, "Bainbridge, Ga.", "Bainbridge"));
        getFPList().add(new footballPlayer(52, "Ryan Bates", "G/C", 6, 4, 284, "Warrington, Pa.", "Archbishop Wood"));
        getFPList().add(new footballPlayer(60, "Noah Beh", "T", 6, 6, 294, "Moscow, Pa.", "Scranton Prep"));
        getFPList().add(new footballPlayer(11, "Brandon Bell", "LB", 6, 1, 231, "Mays Landing, N.J.", "Oakcrest"));
        getFPList().add(new footballPlayer(89, "Gordon Bentley", "WR", 6, 2, 201, "Ambler, Pa.", "Wissahickon"));
        getFPList().add(new footballPlayer(32, "Joe Berg", "S", 6, 0, 197, "Mundelein, Ill.", "Carmel Catholic"));
        getFPList().add(new footballPlayer(13, "Saeed Blacknall", "WR", 6, 3, 211, "Manalapan, N.J.", "Manalapan"));
        getFPList().add(new footballPlayer(91, "Nick Boumerhi", "PK", 5, 9, 173, "Phillipsburg, Pa.", "Phillipsburg-Osceola"));
        getFPList().add(new footballPlayer(43, "Manny Bowen", "LB", 6, 1, 200, "Barnegat, N.J.", "Barnegat"));
        getFPList().add(new footballPlayer(83, "Nick Bowers", "TE/H", 6, 4, 255, "Kittanning, Pa.", "Kittanning Senior"));
        getFPList().add(new footballPlayer(81, "Adam Breneman", "TE/H", 6, 4, 245, "Mechanicsburg, Pa.", "Cedar Cliff"));
        getFPList().add(new footballPlayer(75, "Brendan Brosnan", "T", 6, 6, 297, "Park Ridge, Ill.", "Maine South"));
        getFPList().add(new footballPlayer(19, "Torrence Brown", "DE", 6, 3, 250, "Tuscaloosa, Ala.", "Tuscaloosa Academy"));
        getFPList().add(new footballPlayer(97, "Ryan Buchholz", "DE", 6, 6, 254, "Malvern, Pa.", "Great Valley"));
        getFPList().add(new footballPlayer(40, "Jason Cabinda", "LB", 6, 1, 245, "Flemington, N.J.", "Hunterdon Central"));
        getFPList().add(new footballPlayer(1, "Christian Campbell", "CB", 6, 1, 186, "Phenix City, Ala.", "Central"));
        getFPList().add(new footballPlayer(55, "Kam Carter", "DE", 6, 4, 271, "Silver Spring, Md.", "Gaithersburg"));
        getFPList().add(new footballPlayer(87, "Kyle Carter", "TE/H", 6, 3, 252, "Bear, Del.", "William Penn"));
        getFPList().add(new footballPlayer(46, "Colin Castagna", "DE", 6, 4, 244, "Barrington, Ill.", "Barrington"));
        getFPList().add(new footballPlayer(85, "Irvin Charles", "WR", 6, 4, 213, "Sicklerville, N.J.", "Paul VI"));
        getFPList().add(new footballPlayer(87, "Dan Chisena", "WR", 6, 2, 182, "Exton, Pa.", "Downingtown-East"));
        getFPList().add(new footballPlayer(33, "Jake Cooper", "LB", 6, 1, 226, "Doylestown, Pa.", "Archbishop Wood"));
        getFPList().add(new footballPlayer(52, "Curtis Cothran", "DE", 6, 5, 261, "Newtown, Pa.", "Council Rock North"));
        getFPList().add(new footballPlayer(41, "Parker Cothren", "DT", 6, 4, 302, "Huntsville, Ala.", "Hazel Green"));
        getFPList().add(new footballPlayer(97, "Nick Cox", "SN", 6, 0, 230, "Tampa, Fla.", "Jesuit"));
        getFPList().add(new footballPlayer(38, "Desi Davis", "CB", 5, 11, 172, "Admore, Pa.", "Harriton"));
        getFPList().add(new footballPlayer(95, "Tyler Davis", "K/P", 5, 11, 186, "St. Charles, Ill.", "N.A."));
        getFPList().add(new footballPlayer(69, "Adam De Boef", "G/C", 6, 5, 273, "State College, Pa.", "State College Area"));
        getFPList().add(new footballPlayer(78, "Tom Devenney", "C/G", 6, 1, 302, "Lititz, Pa.", "Warwick"));
        getFPList().add(new footballPlayer(53, "Derek Dowrey", "G/C", 6, 3, 321, "Winchester, Va.", "John Handley"));
        getFPList().add(new footballPlayer(20, "Jordan Dudas", "LB", 6, 0, 209, "Lake City, Pa.", "Girard"));
        getFPList().add(new footballPlayer(49, "Will Eikenberry", "DE", 6, 2, 230, "Andover, Mass.", "Andover"));
        getFPList().add(new footballPlayer(17, "Jackson Erdmann", "QB", 6, 3, 205, "Rosemount, Minn.", "Rosemount"));
        getFPList().add(new footballPlayer(7, "Koa Farmer", "LB", 6, 1, 222, "Lake View Terrace, Calif.", "Notre Dame"));
        getFPList().add(new footballPlayer(16, "Billy Fessler", "QB", 5, 11, 184, "Erie, Pa.", "Erie Cathedral Prep"));
        getFPList().add(new footballPlayer(72, "Brian Gaia", "G/C", 6, 3, 304, "Pasadena, Md.", "Gilman School"));
        getFPList().add(new footballPlayer(74, "Evan Galimberti", "G/C", 6, 4, 279, "State College, Pa.", "State College Area"));
        getFPList().add(new footballPlayer(19, "Gregg Garrity", "WR", 5, 10, 157, "Pittsburgh, Pa.", "North Allegheny"));
        getFPList().add(new footballPlayer(88, "Mike Gesicki", "TE/H", 6, 6, 255, "Manahawkin, N.J.", "Southern Regional"));
        getFPList().add(new footballPlayer(30, "Kevin Givens", "DE", 6, 1, 238, "Altoona, Pa.", "Altoona Area"));
        getFPList().add(new footballPlayer(12, "Chris Godwin", "WR", 6, 1, 208, "Middletown, Del.", "Middletown"));
        getFPList().add(new footballPlayer(6, "Malik Golden", "S", 6, 0, 205, "Hartford, Conn.", "Cheshire Academy"));
        getFPList().add(new footballPlayer(57, "Steven Gonzalez", "G/C", 6, 4, 324, "Union City, N.J.", "Union City"));
        getFPList().add(new footballPlayer(37, "Chris Gulla", "K/P", 6, 1, 199, "Toms River, N.J.", "Toms River North"));
        getFPList().add(new footballPlayer(14, "Christian Hackenberg", "QB", 6, 4, 228, "Palmyra, Va.", "Fork Union Military Academy"));
        getFPList().add(new footballPlayer(32, "Jack Haffner", "LB", 5, 10, 218, "State College, Pa.", "State College Area"));
        getFPList().add(new footballPlayer(15, "Grant Haley", "CB", 5, 9, 189, "Atlanta, Ga.", "The Lovett School"));
        getFPList().add(new footballPlayer(71, "Albert Hall", "T", 6, 4, 298, "Warwick, N.Y.", "Warwick Valley"));
        getFPList().add(new footballPlayer(5, "DaeSean Hamilton", "WR", 6, 1, 206, "Fredericksburg, Va.", "Mountain View"));
        getFPList().add(new footballPlayer(45, "Bryant Harper", "S", 5, 9, 211, "McKeesport, Pa.", "McKeesport"));
        getFPList().add(new footballPlayer(27, "Colin Harrop", "S", 6, 0, 194, "Sinking Spring, Pa.", "Wilson"));
        getFPList().add(new footballPlayer(18, "Jonathan Holland", "TE/H", 6, 4, 240, "Brandywine, Md.", "The Bullis School"));
        getFPList().add(new footballPlayer(92, "Joe Holmes", "DT", 5, 10, 273, "Clarks Summit, Pa.", "Scranton Prep"));
        getFPList().add(new footballPlayer(30, "Charles Idemudia", "TE/H", 5, 11, 259, "Detroit, Mich.", "Grosse Pointe North"));
        getFPList().add(new footballPlayer(76, "Sterling Jenkins", "T", 6, 8, 329, "Pittsburgh, Pa.", "Baldwin"));
        getFPList().add(new footballPlayer(99, "Austin Johnson", "DT", 6, 4, 323, "Galloway, N.J.", "St. Augustine Prep"));
        getFPList().add(new footballPlayer(27, "Brandon Johnson", "RB", 6, 2, 228, "Harrisburg, Pa.", "Middletown"));
        getFPList().add(new footballPlayer(34, "Jan Johnson", "LB", 6, 2, 216, "Mohnton, Pa.", "Governor Mifflin"));
        getFPList().add(new footballPlayer(84, "Juwan Johnson", "WR", 6, 4, 213, "Glassboro, N.J.", "Glassboro"));
        getFPList().add(new footballPlayer(99, "Joey Julius", "K", 5, 10, 259, "Hummelstown, Pa.", "Lower Dauphin"));
        getFPList().add(new footballPlayer(2, "Jake Kiley", "WR", 6, 0, 183, "Plymouth, N.H.", "New Hampton"));
        getFPList().add(new footballPlayer(38, "Ben Kline", "LB", 6, 2, 230, "Seven Valleys, Pa.", "Dallastown"));
        getFPList().add(new footballPlayer(41, "Zach Ladonis", "SN", 6, 2, 224, "Nescopeck, Pa.", "Berwick Area"));
        getFPList().add(new footballPlayer(61, "Jack Lasher", "G", 6, 5, 304, "Richmond, Va.", "Benedictine"));
        getFPList().add(new footballPlayer(55, "Wendy Laurent", "C/G", 6, 2, 294, "Hamilton, N.J.", "The Hun School"));
        getFPList().add(new footballPlayer(7, "Geno Lewis", "WR", 6, 1, 205, "Wilkes-Barre, Pa.", "Wyoming Valley West"));
        getFPList().add(new footballPlayer(93, "Robby Liebel", "P", 6, 2, 194, "St. Petersburg, Fla.", "IMG Academy"));
        getFPList().add(new footballPlayer(5, "Jordan Lucas", "S", 6, 0, 199, "New Rochelle, N.Y.", "New Rochelle"));
        getFPList().add(new footballPlayer(22, "Akeel Lynch", "RB", 5, 11, 220, "Toronto, Ontario, Canada", "St. Francis (N.Y.)"));
        getFPList().add(new footballPlayer(70, "Brendan Mahon", "G/C", 6, 4, 318, "Randolph, N.J.", "Randolph"));
        getFPList().add(new footballPlayer(66, "Angelo Mangiro", "C/G", 6, 3, 321, "Roxbury, N.J.", "Roxbury"));
        getFPList().add(new footballPlayer(39, "Josh McPhearson", "WR", 5, 10, 195, "Columbia, Md.", "Annapolis Area Christian"));
        getFPList().add(new footballPlayer(9, "Trace McSorley", "QB", 6, 0, 196, "Ashburn, Va.", "Briar Woods"));
        getFPList().add(new footballPlayer(14, "Jarvis Miller", "S", 6, 2, 198, "Suffield, Conn.", "Windsor Locks/Suffield/East Granby"));
        getFPList().add(new footballPlayer(48, "Shareef Miller", "DE", 6, 5, 245, "Philadelphia, Pa.", "George Washington"));
        getFPList().add(new footballPlayer(63, "Ryan Monk", "DT", 6, 1, 258, "Dallas, Pa.", "Dallas"));
        getFPList().add(new footballPlayer(23, "Ayron Monroe", "S", 5, 11, 200, "Largo, Md.", "Saint Johns College H.S."));
        getFPList().add(new footballPlayer(95, "Carl Nassib", "DE", 6, 7, 272, "West Chester, Pa.", "Malvern Prep"));
        getFPList().add(new footballPlayer(59, "Andrew Nelson", "T", 6, 6, 302, "Hershey, Pa.", "Hershey"));
        getFPList().add(new footballPlayer(21, "Amani Oruwariye", "CB", 6, 1, 205, "Tampa, Fla.", "Gaither"));
        getFPList().add(new footballPlayer(73, "Paris Palmer", "T", 6, 7, 302, "Plymouth, N.C.", "N.A."));
        getFPList().add(new footballPlayer(89, "Tom Pancoast", "TE/H", 6, 3, 231, "West Chester, Pa.", "Unionville"));
        getFPList().add(new footballPlayer(92, "Daniel Pasquariello", "P", 6, 1, 200, "Melbourne, Victoria, Australia", "Xavier College"));
        getFPList().add(new footballPlayer(16, "John Petrishen", "S", 6, 0, 201, "Lower Burrell, Pa.", "Pittsburgh Central Catholic"));
        getFPList().add(new footballPlayer(10, "Brandon Polk", "WR", 5, 9, 170, "Ashburn, Va.", "Briar Woods"));
        getFPList().add(new footballPlayer(42, "Troy Reeder", "LB", 6, 1, 241, "Wilmington, Del.", "Salesianum School"));
        getFPList().add(new footballPlayer(29, "John Reid", "CB", 5, 10, 186, "Mount Laurel, N.J.", "St. Joseph's Prep"));
        getFPList().add(new footballPlayer(68, "Kevin Reihner", "C/G", 6, 3, 313, "Scranton, Pa.", "Scranton Prep"));
        getFPList().add(new footballPlayer(6, "Andre Robinson", "RB", 5, 9, 209, "Mechanicsburg, Pa.", "Bishop McDevitt"));
        getFPList().add(new footballPlayer(34, "Dominic Salomone", "TE/H", 5, 10, 242, "Dillsburg, Pa.", "Northern"));
        getFPList().add(new footballPlayer(94, "Evan Schwan", "DE", 6, 6, 256, "Harrisburg, Pa.", "Central Dauphin"));
        getFPList().add(new footballPlayer(24, "Nick Scott", "RB", 5, 11, 198, "Fairfax, Va.", "Fairfax"));
        getFPList().add(new footballPlayer(82, "Tyler Shoop", "WR", 5, 11, 171, "Nashville, Tenn.", "Father Ryan"));
        getFPList().add(new footballPlayer(79, "Charlie Shuman", "T", 6, 8, 290, "Pittsford, N.Y.", "Mendon-Sutherland"));
        getFPList().add(new footballPlayer(90, "Garrett Sickels", "DE", 6, 4, 258, "Red Bank, N.J.", "Red Bank Regional"));
        getFPList().add(new footballPlayer(62, "Zach Simpson", "G", 6, 3, 272, "Hollidaysburg, Pa.", "Hollidaysburg Area"));
        getFPList().add(new footballPlayer(24, "Anthony Smith", "S", 6, 0, 206, "Dover, N.J.", "Pope John XXIII"));
        getFPList().add(new footballPlayer(47, "Brandon Smith", "LB", 6, 0, 223, "Winfield, Pa.", "Lewisburg"));
        getFPList().add(new footballPlayer(12, "Jordan Smith", "CB", 5, 10, 190, "Washington, D.C.", "H.D. Woodson"));
        getFPList().add(new footballPlayer(58, "Chance Sorrell", "T", 6, 5, 295, "Middletown, Ohio", "Middletown"));
        getFPList().add(new footballPlayer(4, "Tommy Stevens", "QB", 6, 4, 211, "Indianapolis, Ind.", "Decatur Central High School"));
        getFPList().add(new footballPlayer(17, "Garrett Taylor", "CB", 6, 0, 187, "Richmond, Va.", "Saint Christopher's"));
        getFPList().add(new footballPlayer(20, "Johnathan Thomas", "RB", 5, 11, 221, "Peabody, Mass.", "St. John's Prep"));
        getFPList().add(new footballPlayer(3, "DeAndre Thompkins", "WR", 5, 11, 185, "Hubert, N.C.", "Swansboro"));
        getFPList().add(new footballPlayer(49, "Brian Tomasetti", "S", 6, 1, 191, "Old Forge, Pa.", "Old Forge"));
        getFPList().add(new footballPlayer(96, "Kyle Vasey", "SN", 6, 2, 241, "Hawley, Pa.", "Wallenpaupack"));
        getFPList().add(new footballPlayer(25, "Von Walker", "LB", 5, 11, 219, "Mill Hall, Pa.", "Central Mountain"));
        getFPList().add(new footballPlayer(5, "Nyeem Wartman-White", "LB", 6, 1, 243, "Philadelphia, Pa.", "Valley View"));
        getFPList().add(new footballPlayer(93, "Antoine White", "DT", 6, 2, 292, "Millville, N.J.", "Millville"));
        getFPList().add(new footballPlayer(11, "Brent Wilkerson", "TE/H", 6, 3, 250, "Clinton, Md.", "DeMatha Catholic"));
        getFPList().add(new footballPlayer(10, "Trevor Williams", "CB", 6, 0, 200, "Baltimore, Md.", "Calvert Hall College"));
        getFPList().add(new footballPlayer(54, "Robert Windsor", "DT", 6, 4, 286, "Fond Du Lac, Wis.", "Fond Du Lac"));
        getFPList().add(new footballPlayer(98, "Jordan Wombacker", "K/P", 5, 10, 175, "Hermitage, Pa.", "Hickory"));
        getFPList().add(new footballPlayer(8, "Gary Wooten Jr.", "LB", 6, 2, 237, "Miami, Fla.", "Hialeah Senior"));
        getFPList().add(new footballPlayer(4, "Daquan Worley", "CB", 5, 9, 180, "Coatesville, Pa.", "Coatesville"));
        getFPList().add(new footballPlayer(77, "Chasz Wright", "G/C", 6, 7, 339, "Woodbridge, Va.", "Milford Academy"));
        getFPList().add(new footballPlayer(44, "Tyler Yazujian", "SN", 5, 11, 264, "Royersford, Pa.", "Spring-Ford"));
        getFPList().add(new footballPlayer(80, "Matt Zanellato", "WR", 6, 3, 210, "Burke, Va.", "Lake Braddock Secondary"));
        getFPList().add(new footballPlayer(98, "Anthony Zettel", "DT", 6, 4, 284, "West Branch, Mich.", "Ogemaw Heights"));
    }

    public ArrayList<footballPlayer> getFpList()
    {
        return getFPList();
    }

    public void setFpList(ArrayList<footballPlayer> fplist)
    {
        this.setFPList(fplist);
    }

    public ArrayList<String> getColumnNames()
    {
        return columnNames;
    }

    public void setColumnNames(ArrayList<String> columnNames)
    {
        this.columnNames = columnNames;
    }

    public ArrayList<String> getLine(int n)
    {
        return getFPList().get(n).fpString();
    }

    public ArrayList<ArrayList<String>> getLines(int begin, int end)
    {
        ArrayList<ArrayList<String>> lines = new ArrayList<ArrayList<String>>();
        for (int i = begin; i < end; i++)
        {
            lines.add(getFPList().get(i).fpString());
        }
        return lines;
    }

    /**
     * @return the FPList
     */
    public ArrayList<footballPlayer> getFPList()
    {
        return FPList;
    }

    /**
     * @param FPList the FPList to set
     */
    public void setFPList(ArrayList<footballPlayer> FPList)
    {
        this.FPList = FPList;
    }

}
