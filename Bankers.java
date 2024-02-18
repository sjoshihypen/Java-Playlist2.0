public class Bankers {
    public static void main (String [ ] args) {
     // Resources (available, total)
     int[ ] resources = {10, 5, 7};

    // Process needs (max, allocated)
    int[ ][ ] needs = {{7, 2, 2}, {3, 2, 1}, {9, 0, 2}};
    int[ ][ ] allocated = {{0, 0, 0}, {2, 1, 0}, {0, 0, 1}};

   // Check for safe state
   boolean safe = true;
   for (int process = 0; process < needs.length; process++) {
   boolean canFinish = true;
   for (int resource = 0; resource < resources.length; resource++) {
        if (needs[process][resource] > resources[resource]) {
       canFinish = false;
       break;
    }
}

   if (canFinish) {
   // Allocate resources to finishing process
    for (int resource = 0; resource < resources.length; resource++) {
         resources[resource] += allocated[process][resource];
      }
} else {
    safe = false;
    break;
   }
}

    // Print results
       System.out.println("Safe state: " + safe);
   }
}

