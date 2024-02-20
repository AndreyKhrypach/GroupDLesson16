public class ProgramLesson16 {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Harum odio commodi explicabo iste " +
                "voluptas culpa minus. Ratione voluptatem sunt maiores eius illum, blanditiis saepe aperiam ipsam, " +
                "perspiciatis architecto placeat incidunt laboriosam aliquam similique est vel nam harum explicabo et " +
                "officiis neque? Dolore quisquam nisi minima voluptate velit aut, sapiente nemo.";

        int bigSymbols = 0;
        int smallSymbols = 0;
        int spaces = 0;
        int specialSymbols = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                bigSymbols++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                smallSymbols++;
            } else if (str.charAt(i) == ' ') {
                spaces++;
            }else {
                specialSymbols++;
            }
        }

        System.out.printf("Big letter = %d, small letters = %d, spaces = %d, " +
                "special symbols = %d", bigSymbols, smallSymbols, spaces, specialSymbols);
    }
}
