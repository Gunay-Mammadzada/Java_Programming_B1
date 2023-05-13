package day25_methods;

import my_util.StringUtil;

import java.sql.SQLOutput;

public class UsingStringClass {
    public static void main(String[] args) {

        System.out.println(StringUtil.reverseStr("java"));

        String fixed = StringUtil.fixFormat("toM") +" is friend with"+StringUtil.fixFormat(" JERRY");
        System.out.println(fixed);

        System.out.println(StringUtil.camelCase("JAVA is GooD LAnGuage"));

        System.out.println(StringUtil.frequencyOfCharacter("apple",'z'));
        System.out.println(StringUtil.frequencyOfCharacter("apple",'p'));
    }
}
