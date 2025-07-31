import java.util.*;

class Main {
    public static void main(String[] args) {
        Resort[] resorts = new Resort[4];
        Scanner sc = new Scanner(System.in);

        // Input resort details
        for (int i = 0; i < resorts.length; i++) {
            System.out.println("Enter Resort " + (i + 1) + " details:");
            int resortId = sc.nextInt();
            sc.nextLine();
            String resortName = sc.nextLine();
            String category = sc.nextLine();
            double price = sc.nextDouble();
            double rating = sc.nextDouble();
            sc.nextLine();
            resorts[i] = new Resort(resortId, resortName, category, price, rating);
        }

        System.out.print("Enter category to filter: ");
        String inputCategory = sc.nextLine();
        int avg = findAvg(resorts, inputCategory);

        if (avg > 0) {
            System.out.println("Avg price of " + inputCategory + " resorts: " + avg);
        } else {
            System.out.println("No resorts available");
        }
    }

    public static int findAvg(Resort[] resorts, String category) {
        int totalPrice = 0;
        int count = 0;
        for (Resort resort : resorts) {
            if (resort.getCategory().equalsIgnoreCase(category) && resort.getRating() > 4) {
                totalPrice += resort.getPrice();
                count++;
            }
        }
        return (count > 0) ? totalPrice / count : 0;
    }
}

class Resort {
    private int resortId;
    private String resortName;
    private String category;
    private double price;
    private double rating;

    public Resort(int resortId, String resortName, String category, double price, double rating) {
        this.resortId = resortId;
        this.resortName = resortName;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    // Getters and Setters
    public int getResortId() { return resortId; }
    public void setResortId(int resortId) { this.resortId = resortId; }

    public String getResortName() { return resortName; }
    public void setResortName(String resortName) { this.resortName = resortName; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }
}
