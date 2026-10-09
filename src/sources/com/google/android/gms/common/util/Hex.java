package com.google.android.gms.common.util;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Hex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f9122a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f9123b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = (bArr[i11] & 240) >>> 4;
            char[] cArr = f9122a;
            sb2.append(cArr[i12]);
            sb2.append(cArr[bArr[i11] & 15]);
        }
        return sb2.toString();
    }
}
