package com.google.common.base;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Ascii {
    private Ascii() {
    }

    public static boolean a(String str, String str2) {
        char c11;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = str.charAt(i11);
                char cCharAt2 = str2.charAt(i11);
                if (cCharAt == cCharAt2 || ((c11 = (char) ((cCharAt | ' ') - 97)) < 26 && c11 == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(char c11) {
        return c11 >= 'a' && c11 <= 'z';
    }

    public static String c(String str) {
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i11 < length) {
                    char c11 = charArray[i11];
                    if (c11 >= 'A' && c11 <= 'Z') {
                        charArray[i11] = (char) (c11 ^ ' ');
                    }
                    i11++;
                }
                return String.valueOf(charArray);
            }
            i11++;
        }
        return str;
    }

    public static String d(String str) {
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            if (b(str.charAt(i11))) {
                char[] charArray = str.toCharArray();
                while (i11 < length) {
                    char c11 = charArray[i11];
                    if (b(c11)) {
                        charArray[i11] = (char) (c11 ^ ' ');
                    }
                    i11++;
                }
                return String.valueOf(charArray);
            }
            i11++;
        }
        return str;
    }

    public static String e(String str) {
        str.getClass();
        if (str.length() <= 30) {
            str = str.toString();
            if (str.length() <= 30) {
                return str;
            }
        }
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append((CharSequence) str, 0, 27);
        sb2.append("...");
        return sb2.toString();
    }
}
