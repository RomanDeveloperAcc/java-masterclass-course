package rbd.project;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        this.groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + this.groceryList.size() + " items in your grocery list");
        for (int i = 0; i < this.groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + this.groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        this.groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        this.groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        return this.groceryList.indexOf(searchItem);
//        boolean exists = groceryList.contains(searchItem);
//        int position = this.groceryList.indexOf(searchItem);
//        if (position >= 0) {
//            return this.groceryList.get(position);
//        }
//
//        return null;
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);

        return position >= 0;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
