package com.alibaba.sdk.android.oss.common.utils;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class StringUtils {
    public static final Charset UTF8 = Charset.forName("utf-8");

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static String join(String str, String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            sb2.append(strArr[i11]);
            if (i11 < strArr.length - 1) {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public static String replaceEach(String str, String[] strArr, String[] strArr2) {
        String str2;
        String str3;
        int length;
        int length2 = strArr.length;
        int length3 = strArr2.length;
        if (!isNullOrEmpty(str) && (length2 != 0 || length3 != 0)) {
            if (length2 != length3) {
                throw new IllegalArgumentException(p.p("Search and Replace array lengths don't match: ", length2, length3, " vs "));
            }
            boolean[] zArr = new boolean[length2];
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < length2; i13++) {
                if (!zArr[i13] && !isNullOrEmpty(strArr[i13]) && strArr2[i13] != null) {
                    int iIndexOf = str.indexOf(strArr[i13]);
                    if (iIndexOf == -1) {
                        zArr[i13] = true;
                    } else if (i11 == -1 || iIndexOf < i11) {
                        i12 = i13;
                        i11 = iIndexOf;
                    }
                }
            }
            if (i11 != -1) {
                int i14 = 0;
                for (int i15 = 0; i15 < strArr.length; i15++) {
                    if (strArr[i15] != null && (str3 = strArr2[i15]) != null && (length = str3.length() - strArr[i15].length()) > 0) {
                        i14 += length * 3;
                    }
                }
                StringBuilder sb2 = new StringBuilder(str.length() + Math.min(i14, str.length() / 5));
                int length4 = 0;
                while (i11 != -1) {
                    while (length4 < i11) {
                        sb2.append(str.charAt(length4));
                        length4++;
                    }
                    sb2.append(strArr2[i12]);
                    length4 = strArr[i12].length() + i11;
                    i11 = -1;
                    i12 = -1;
                    for (int i16 = 0; i16 < length2; i16++) {
                        if (!zArr[i16] && (str2 = strArr[i16]) != null && !str2.isEmpty() && strArr2[i16] != null) {
                            int iIndexOf2 = str.indexOf(strArr[i16], length4);
                            if (iIndexOf2 == -1) {
                                zArr[i16] = true;
                            } else if (i11 == -1 || iIndexOf2 < i11) {
                                i12 = i16;
                                i11 = iIndexOf2;
                            }
                        }
                    }
                }
                int length5 = str.length();
                while (length4 < length5) {
                    sb2.append(str.charAt(length4));
                    length4++;
                }
                return sb2.toString();
            }
        }
        return str;
    }

    public static String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static String join(String str, Collection<String> collection) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            sb2.append(it.next());
            if (i11 < collection.size() - 1) {
                sb2.append(str);
            }
            i11++;
        }
        return sb2.toString();
    }
}
