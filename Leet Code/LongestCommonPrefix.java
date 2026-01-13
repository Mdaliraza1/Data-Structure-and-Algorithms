class longestCommonPrefix {
    public String longestPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                // Case 1: index out of bounds
                // Case 2: character mismatch
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return first.substring(0, i);
                }
            }
        }

        return first; // entire first string is prefix
    }
    public static void main(String[] args) {
        longestCommonPrefix sol = new longestCommonPrefix();
        String[] strs = {"clubhouse", "club", "clubbing"};
        System.out.println(sol.longestPrefix(strs));
    }
}
