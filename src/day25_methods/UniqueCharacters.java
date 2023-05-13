package day25_methods;

import my_util.StringUtil;

public class UniqueCharacters {


    public static String uniqueCharacters (String str) {
        String checked = "";
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            if (!checked.contains(str.charAt(i) + "")) {
                int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));
                checked += str.charAt(i);

                if (count == 1) {
                    unique += str.charAt(i);

                }



            }

        }
        return unique;
    }

}
