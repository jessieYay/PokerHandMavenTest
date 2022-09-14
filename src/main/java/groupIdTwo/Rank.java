package groupIdTwo;

public enum Rank {
    Number_2, Number_3,Number_4, Number_5, Number_6, Number_7, Number_10,  Ace;

    public String getDescription(){
        return switch(this)  {
            case Number_2 -> "2";
            case Number_3 -> "3";
            case Number_4 -> "4";
            case Number_5 -> "5";
            case Number_6 -> "6";
            case Number_7 -> "7";
            case Number_10 -> "10";
            case Ace -> "Ace";
        };

    }
}
