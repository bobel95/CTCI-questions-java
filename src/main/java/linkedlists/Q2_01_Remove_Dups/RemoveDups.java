package linkedlists.Q2_01_Remove_Dups;

import java.util.*;

public class RemoveDups {

    // Write code to remove duplicates from an unsorted linked list.
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


    // FOLLOW UP
    // How would you solve this problem if a temporary buffer is not allowed?
    public void removeDupsFollowUp(LinkedList<Integer> list) {
        Collections.sort(list);

        var iterator = list.listIterator();
        while (iterator.hasNext()) {

            int el1 = iterator.next();
            if (iterator.hasNext()) {

                int el2 = iterator.next();

                if (el1 == el2) {
                    iterator.remove();
                }

                iterator.previous();
            }
        }
    }
}
