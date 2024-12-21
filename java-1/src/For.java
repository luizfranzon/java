public class For {

    public static void main(String[] args) {
        String[] personsList = new String[10];

        for (int i = 0; i < personsList.length; i++) {
            personsList[i] = i + 1 + "dale";
        }

        for (String s : personsList) {
            System.out.println(s);
        }
    }


}
