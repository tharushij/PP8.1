public class daysOfChristmas
{
    public static void main(String[]args)
    {
        song(12);
    } //end method main
    public static void song(int num)
    {
        if(num > 0)
        {
            song(num-1);
        } //end if

        switch(num)
        {
            case 1:
                System.out.println("On the first day of Christmas, my true love gave to me, a partridge in a pear tree.");
                break;

            case 2:
                System.out.println("On the second day of Christmas, my true love gave to me two turtle doves.");
                break;

            case 3:
                System.out.println("On the third day of Christmas, my true love gave to me three French hens.");
                break;

            case 4:
                System.out.println("On the fourth day of Christmas, my true love gave to me four calling birds.");
                break;

            case 5:
                System.out.println("On the fifth day of Christmas, my true love gave to me five golden rings.");
                break;

            case 6:
                System.out.println("On the sixth day of Christmas, my true love gave to me six geese a-laying.");
                break;

            case 7:
                System.out.println("On the seventh day of Christmas, my true love gave to me seven swans a-swimming.");
                break;

            case 8:
                System.out.println("On the eighth day of Christmas, my true love gave to me eigth maids a-milking.");
                break;

            case 9:
                System.out.println("On the ninth day of Christmas, my true love gave to me nine ladies dancing.");
                break;

            case 10:
                System.out.println("On the tenth day of Christmas, my true love gave to me ten lords a-leaping.");
                break;

            case 11:
                System.out.println("On the eleventh day of Christmas, my true love gave to me eleven pipers piping.");
                break;

            case 12:
                System.out.println("On the twelfth day of Christmas, my true love gave to me twelve drummers drumming");
                break;
        }
    } //end method daysOfChristmas
} //end class daysOfChristmas