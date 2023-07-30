package ru.geekbrains.lesson4;

public class Program {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(4);

        String prevValue = hashMap.put("+79001112233", "Андрей");
        prevValue = hashMap.put("+79001112231", "Андрей");
        prevValue = hashMap.put("+79001112231", "Сергей");

        String searchValue = hashMap.get("+79001112233");

        // prevValue = hashMap.remove("+79001112233");
        // prevValue = hashMap.remove("+79001112233");

        searchValue = hashMap.get("+79001112233");

        System.out.println(searchValue);
        System.out.println();


        for (HashMap.Entity item : hashMap) {
            System.out.println(item);
        }

    }

}

