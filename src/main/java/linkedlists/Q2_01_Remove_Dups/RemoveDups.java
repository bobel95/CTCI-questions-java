package linkedlists.Q2_01_Remove_Dups;

import java.util.*;

// Write code to remove duplicates from an unsorted linked list.
// FOLLOW UP
// How would you solve this problem if a temporary buffer is not allowed?
public class RemoveDups {


    public void removeDups(LinkedList<Integer> list) {

        var occurrencesMap = new HashMap<Integer, Integer>();

        int index = 0;
        var listIterator = list.listIterator(index);

        while (listIterator.hasNext()) {
            int key = listIterator.next();
            int val = occurrencesMap.getOrDefault(key, 0) + 1;

            occurrencesMap.put(key, val);

            index++;
        }

        for (Map.Entry<Integer, Integer> entry : occurrencesMap.entrySet()) {

            if (entry.getValue() > 1) {
                int timesDuplicated = entry.getValue();

                while (timesDuplicated > 1) {
                    list.remove(entry.getKey());
                    timesDuplicated--;
                }
            }
        }
    }

}
