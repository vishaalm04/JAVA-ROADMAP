package Enums;

enum Season {
    SPRING("Mild"), SUMMER("Hot"), FALL("Cool"), WINTER("Cold");

    private String description;

    // Constructor
    Season(String description) {
        this.description = description;
    }

    // Method to get the description
    public String getDescription() {
        return description;
    }
}

public class EnumWithFieldsExample {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season + " is " + season.getDescription());
        }
    }
}

