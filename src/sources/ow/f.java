package ow;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f46116a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f46117b = new String[64];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f46118c = new String[256];

    static {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            String[] strArr = f46118c;
            if (i12 >= strArr.length) {
                break;
            }
            strArr[i12] = String.format("%8s", Integer.toBinaryString(i12)).replace(' ', '0');
            i12++;
        }
        String[] strArr2 = f46117b;
        strArr2[0] = BuildConfig.VERSION_NAME;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i13 = iArr[0];
        strArr2[i13 | 8] = ep.a.k(new StringBuilder(), strArr2[i13], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i14 = 0; i14 < 3; i14++) {
            int i15 = iArr2[i14];
            int i16 = iArr[0];
            String[] strArr3 = f46117b;
            int i17 = i16 | i15;
            strArr3[i17] = strArr3[i16] + '|' + strArr3[i15];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i16]);
            sb2.append('|');
            strArr3[i17 | 8] = ep.a.k(sb2, strArr3[i15], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f46117b;
            if (i11 >= strArr4.length) {
                return;
            }
            if (strArr4[i11] == null) {
                strArr4[i11] = f46118c[i11];
            }
            i11++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    public static String a(boolean z11, int i11, int i12, byte b3, byte b11) {
        String strReplace;
        String str = b3 < 10 ? f46116a[b3] : String.format("0x%02x", Byte.valueOf(b3));
        if (b11 == 0) {
            strReplace = BuildConfig.VERSION_NAME;
        } else {
            String[] strArr = f46118c;
            if (b3 == 2 || b3 == 3) {
                strReplace = strArr[b11];
            } else if (b3 == 4 || b3 == 6) {
                strReplace = b11 == 1 ? "ACK" : strArr[b11];
            } else if (b3 == 7 || b3 == 8) {
                strReplace = strArr[b11];
            } else {
                String str2 = b11 < 64 ? f46117b[b11] : strArr[b11];
                if (b3 != 5 || (b11 & 4) == 0) {
                    strReplace = (b3 != 0 || (b11 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                } else {
                    strReplace = str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", z11 ? "<<" : ">>", Integer.valueOf(i11), Integer.valueOf(i12), str, strReplace);
    }
}
