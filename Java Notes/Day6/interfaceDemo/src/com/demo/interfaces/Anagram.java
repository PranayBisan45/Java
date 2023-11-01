public class Anagram {
    public static void main(String [] args) {
        String a="listen";
        String b="silent";

        if(a.length()==b.length()) {
            for(int i=0;i<a.length();i++) {
                for(int j=0;j<b.length();j++) {
                    if(a[i]==b[j]) {
                        System.out.println("Strings are Anagram");               //error
                    } else {
                        System.out.println("Strings are not Anagram");
                    }
                }
            }
        } else {
            System.out.println("Strings are not Anagram");
        }
    }
}
