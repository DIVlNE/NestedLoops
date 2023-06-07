public class NestedLoops {
    public static void main(String[] args) {
        String[] usernameOne = {"dylan", "changfong", "kenly", "bryan"};

        String[] usernameTwo = {"guoliang", "kenly", "cf", "jon"};

        int matchCounter = 0;

        for (int i = 0; i < usernameOne.length; i++) {
            for (int j = 0; j < usernameTwo.length; j++) {
                if (usernameOne[i] == usernameTwo[j]) {
                    matchCounter++;
                    System.out.println("Duplicate username : " + usernameOne[i]);
                    break;
                }
            }
        }
        System.out.println("The number of same name matches " + matchCounter);

    }

}

