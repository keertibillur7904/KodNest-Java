
class ArraySearch {

    void search(int ref[], int key) {
        boolean found = false;
        for (int i = 0; i <= ref.length - 1; i++) {
            if (ref[i] == key) {
                System.out.println("the element is found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Elements not found ");
        }
    }
}
