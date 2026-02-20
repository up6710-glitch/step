class step4 {

    public static void main(String[] args) {

        // Store OOPS banner lines in an array
        String[] banner = {
                " *****    *****    *****    ***** ",
                "*     *  *     *  *     *  *     *",
                "*     *  *     *  *     *  *      ",
                "*     *  *     *  *****    *****  ",
                "*     *  *     *  *        *     *",
                "*     *  *     *  *        *     *",
                " *****    *****    *         ***** "
        };

        // Print using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}