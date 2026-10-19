void main() {
    //
//// Creates a 2D List container for Integers (Rows can be added dynamically)
    List<List<Integer>> matrix = new ArrayList<>();
    /// Method 1: Add empty rows and populate them
    matrix.add(new ArrayList<>()); // Adds row 0
    matrix.get(0).add(10);        // Adds 10 to row 0, column 0
    matrix.get(0).add(20);        // Adds 20 to row 0, column 1

/// Method 2: Add a pre-populated row using List.of() or Arrays.asList()
    matrix.add(new ArrayList<>(List.of(30, 40, 50))); // Adds row 1
// Get the element at row 1, column 0 (which is 30)
    int value = matrix.get(1).get(0);
    System.out.println(value);
    // Change the element at row 0, column 1 from 20 to 99
    matrix.get(0).set(1, 99);
    for (int i = 0; i < matrix.size(); i++) {
        for (int j = 0; j < matrix.get(i).size(); j++) {
            System.out.print(matrix.get(i).get(j) + " ");
        }
        System.out.println();
    }



}
