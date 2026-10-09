package com.google.zxing.oned;

import com.google.zxing.FormatException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class UPCEANReader extends OneDReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f21544a = {1, 1, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f21545b = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f21546c = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f21547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[][] f21548e;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f21547d = iArr;
        int[][] iArr2 = new int[20][];
        f21548e = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i11 = 10; i11 < 20; i11++) {
            int[] iArr3 = f21547d[i11 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i12 = 0; i12 < iArr3.length; i12++) {
                iArr4[i12] = iArr3[(iArr3.length - i12) - 1];
            }
            f21548e[i11] = iArr4;
        }
    }

    public UPCEANReader() {
        new UPCEANExtensionSupport();
        new EANManufacturerOrgSupport();
    }

    public static boolean a(String str) {
        int length = str.length();
        if (length != 0) {
            int i11 = length - 1;
            if (b(str.subSequence(0, i11)) == Character.digit(str.charAt(i11), 10)) {
                return true;
            }
        }
        return false;
    }

    public static int b(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i11 = 0;
        for (int i12 = length - 1; i12 >= 0; i12 -= 2) {
            int iCharAt = charSequence.charAt(i12) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw FormatException.a();
            }
            i11 += iCharAt;
        }
        int i13 = i11 * 3;
        for (int i14 = length - 2; i14 >= 0; i14 -= 2) {
            int iCharAt2 = charSequence.charAt(i14) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw FormatException.a();
            }
            i13 += iCharAt2;
        }
        return (1000 - i13) % 10;
    }
}
