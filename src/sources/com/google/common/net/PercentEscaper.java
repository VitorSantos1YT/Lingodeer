package com.google.common.net;

import com.google.common.escape.UnicodeEscaper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class PercentEscaper extends UnicodeEscaper {
    static {
        "0123456789ABCDEF".toCharArray();
    }

    public PercentEscaper(String str, boolean z11) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        String strConcat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (z11 && strConcat.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        char[] charArray = strConcat.toCharArray();
        int iMax = -1;
        for (char c11 : charArray) {
            iMax = Math.max((int) c11, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c12 : charArray) {
            zArr[c12] = true;
        }
    }
}
