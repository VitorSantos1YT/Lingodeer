package okhttp3.internal.http2;

import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.p3;
import kotlin.jvm.internal.m;
import l0.Eeqr.HOBXIlHxIkMBEA;
import m00.l;
import okhttp3.internal._UtilJvmKt;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Http2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Http2 f45416a = new Http2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f45417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f45418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f45419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f45420e;

    private Http2() {
    }

    public static String a(int i11) {
        String[] strArr = f45418c;
        return i11 < strArr.length ? strArr[i11] : _UtilJvmKt.d("0x%02x", Integer.valueOf(i11));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0055  */
    public static String b(int i11, int i12, int i13, int i14, boolean z11) {
        String strQ0;
        String str;
        String strA = a(i13);
        if (i14 == 0) {
            strQ0 = BuildConfig.VERSION_NAME;
        } else {
            String[] strArr = f45420e;
            if (i13 == 2 || i13 == 3) {
                strQ0 = strArr[i14];
            } else if (i13 == 4 || i13 == 6) {
                strQ0 = i14 == 1 ? "ACK" : strArr[i14];
            } else if (i13 == 7 || i13 == 8) {
                strQ0 = strArr[i14];
            } else {
                String[] strArr2 = f45419d;
                if (i14 < strArr2.length) {
                    str = strArr2[i14];
                    m.c(str);
                } else {
                    str = strArr[i14];
                }
                if (i13 != 5 || (i14 & 4) == 0) {
                    strQ0 = (i13 != 0 || (i14 & 32) == 0) ? str : x.q0(str, "PRIORITY", "COMPRESSED");
                } else {
                    strQ0 = x.q0(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return _UtilJvmKt.d("%s 0x%08x %5d %-13s %s", z11 ? "<<" : ">>", Integer.valueOf(i11), Integer.valueOf(i12), strA, strQ0);
    }

    public static String c(int i11, int i12, long j11, boolean z11) {
        return _UtilJvmKt.d("%s 0x%08x %5d %-13s %d", z11 ? "<<" : ">>", Integer.valueOf(i11), Integer.valueOf(i12), a(8), Long.valueOf(j11));
    }

    static {
        l lVar = l.f40723d;
        f45417b = p3.l("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f45418c = new String[]{"DATA", "HEADERS", "PRIORITY", HOBXIlHxIkMBEA.JnRJHIpmqLXa, "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f45419d = new String[64];
        String[] strArr = new String[256];
        for (int i11 = 0; i11 < 256; i11++) {
            String binaryString = Integer.toBinaryString(i11);
            m.e(binaryString, "toBinaryString(...)");
            strArr[i11] = x.p0(_UtilJvmKt.d("%8s", binaryString), ' ', '0');
        }
        f45420e = strArr;
        String[] strArr2 = f45419d;
        strArr2[0] = BuildConfig.VERSION_NAME;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i12 = iArr[0];
        strArr2[i12 | 8] = ep.a.k(new StringBuilder(), strArr2[i12], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr2[i13];
            int i15 = iArr[0];
            String[] strArr3 = f45419d;
            int i16 = i15 | i14;
            strArr3[i16] = strArr3[i15] + '|' + strArr3[i14];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i15]);
            sb2.append('|');
            strArr3[i16 | 8] = ep.a.k(sb2, strArr3[i14], "|PADDED");
        }
        int length = f45419d.length;
        for (int i17 = 0; i17 < length; i17++) {
            String[] strArr4 = f45419d;
            if (strArr4[i17] == null) {
                strArr4[i17] = f45420e[i17];
            }
        }
    }
}
