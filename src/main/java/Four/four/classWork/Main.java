package Four.four.classWork;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Storage storage1 = new Storage("first", "World st, 17");
        Storage storage2 = new Storage("second", "Puskin st, 23");

        Product milk = new Product("123", "Musaffo", 80);
        Product tea = new Product("456", "Tudor", 150);
        Product potato = new Product("789", "Red", 20);

        Map<Product, Integer> productMap1 = new HashMap<>();
        productMap1.put(milk, 100);
        productMap1.put(tea, 200);
        productMap1.put(potato, 300);

        Map<Product, Integer> productMap2 = new HashMap<>();
        productMap2.put(milk, 400);
        productMap2.put(tea, 500);
        productMap2.put(potato, 600);

        Map<Storage, Map<Product, Integer>> storageMap = new HashMap<>();
        storageMap.put(storage1, productMap1);
        storageMap.put(storage2, productMap2);

        displayAll(storageMap);

        System.out.println("************************\n\n\n\n");
//        searchProduct(storageMap, "789");
//        searchProduct(storageMap, "456");

        searchProduct(storageMap, "123", "first");
        searchProduct(storageMap, "123", "second");

        System.out.println("***");
        displayAll(storageMap);
        System.out.println("***");
        transferProduct(storageMap, "123", "first", "second");
        System.out.println("***");
        displayAll(storageMap);
    }

    private static void transferProduct(Map<Storage, Map<Product, Integer>> storageMap, String productNumber, String from, String to) {
        Map<Product, Integer> productFrom = storageMap.get(new Storage(from));
        Map<Product, Integer> productTo = storageMap.get(new Storage(to));
        Product product = new Product(productNumber);
        if (productFrom != null) {
            Integer amountFrom = productFrom.get(product);
            if (amountFrom != null) {
                Integer amountTo = productTo.get(product);
                productTo.put(getProductName(product, productFrom), amountFrom + ((amountTo == null) ? 0 : amountTo));
                productFrom.remove(product);
            }
        } else {
            System.out.println("ERROR!!!");
        }

    }

    private static Product getProductName(Product searchProduct, Map<Product, Integer> productFrom) {
        for (Product product : productFrom.keySet()) {
            if (product.equals((searchProduct))) {
                return product;
            }
        }
        return null;
    }

    private static void searchProduct(Map<Storage, Map<Product, Integer>> storageMap, String productNumber, String storageName) {
        Map<Product, Integer> productMap = storageMap.get(new Storage(storageName));
        if (productMap != null) {
            Integer amount = productMap.get(new Product(productNumber));
            if (amount != null) {
                System.out.println("In storage " + storageName + " found " + amount + " pieces of product ");
            }
        }

    }

    private static void searchProduct(Map<Storage, Map<Product, Integer>> storageMap, String productNumber) {

        for (Storage storage : storageMap.keySet()) {
            Map<Product, Integer> productMap = storageMap.get(storage);
            Integer amount = productMap.get(new Product(productNumber));
            if (amount != null) {
                System.out.println("In storage " + storage.getName() + " found " + amount + " pieces of product ");
            }

        }
    }

    private static void displayAll(Map<Storage, Map<Product, Integer>> storageMap) {
        for (Map.Entry<Storage, Map<Product, Integer>> storageMapEntry : storageMap.entrySet()) {
            for (Map.Entry<Product, Integer> productEntry : storageMapEntry.getValue().entrySet()) {
                System.out.println("In storage " + storageMapEntry.getKey().getName() + " found " + productEntry.getValue() + " pieces of product " + productEntry.getKey().getName());
            }
            System.out.println("");
        }
    }
}
