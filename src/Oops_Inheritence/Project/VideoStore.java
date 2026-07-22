package Oops_Inheritence.Project;

public class VideoStore {

    Vedio[] store = new Vedio[10];
    int count = 0;

    // Add Video
    public void addVideo(String name) {

        store[count] = new Vedio(name);
        count++;

        System.out.println("Video \"" + name + "\" added successfully.");
    }

    // Checkout Video
    public void doCheckout(String name) {

        for (int i = 0; i < count; i++) {

            if (store[i].getName().equalsIgnoreCase(name)) {

                store[i].doCheckout();

                System.out.println("Video \"" + name + "\" checked out successfully.");
                return;
            }
        }

        System.out.println("Video not found.");
    }

    // Return Video
    public void doReturn(String name) {

        for (int i = 0; i < count; i++) {

            if (store[i].getName().equalsIgnoreCase(name)) {

                store[i].doReturn();

                System.out.println("Video \"" + name + "\" returned successfully.");
                return;
            }
        }

        System.out.println("Video not found.");
    }

    // Receive Rating
    public void receiveRating(String name, int rating) {

        for (int i = 0; i < count; i++) {

            if (store[i].getName().equalsIgnoreCase(name)) {

                store[i].receiveRating(rating);

                System.out.println("Rating \"" + rating +
                        "\" has been mapped to the Video \"" + name + "\".");
                return;
            }
        }

        System.out.println("Video not found.");
    }

    // List Inventory
    public void listInventory() {

        System.out.println();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Video Name\t\tRating\t\tStatus");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < count; i++) {

            String status;

            if (store[i].getCheckout())
                status = "Checked Out";
            else
                status = "Available";

            System.out.println(store[i].getName() + "\t\t\t"
                    + store[i].getRating() + "\t\t" + status);
        }

        System.out.println("--------------------------------------------------------------");
    }
}
