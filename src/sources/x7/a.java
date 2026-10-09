package x7;

import android.util.Base64;
import androidx.media3.common.ParserException;
import com.google.logging.type.LogSeverity;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import rt.m5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f55813a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f55814b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f55815c = {1, 2, 3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f55816d = {48000, 44100, 32000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f55817e = {24000, 22050, 16000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f55818f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f55819g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f55820h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f55821i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, LogSeverity.EMERGENCY_VALUE, LogSeverity.EMERGENCY_VALUE, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f55822j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f55823k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f55824l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f55825n = {5, 8, 10, 12};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f55826o = {6, 9, 12, 15};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f55827p = {2, 4, 6, 8};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f55828q = {9, 11, 13, 16};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f55829r = {5, 8, 10, 12};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f55830s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f55831t = {44100, 48000, 32000};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f55832u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f55833v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f55834w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f55835x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f55836y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static ArrayList a(byte[] bArr) {
        long j11 = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j11).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static boolean b(b7.w wVar, r rVar, int i11, kw.b bVar) {
        long jY = wVar.y();
        long j11 = jY >>> 16;
        if (j11 != i11) {
            return false;
        }
        boolean z11 = (j11 & 1) == 1;
        int i12 = (int) ((jY >> 12) & 15);
        int i13 = (int) ((jY >> 8) & 15);
        int i14 = (int) ((jY >> 4) & 15);
        int i15 = (int) ((jY >> 1) & 7);
        boolean z12 = (jY & 1) == 1;
        if (i14 <= 7) {
            if (i14 != rVar.f55922g - 1) {
                return false;
            }
        } else if (i14 > 10 || rVar.f55922g != 2) {
            return false;
        }
        if (!(i15 == 0 || i15 == rVar.f55924i) || z12) {
            return false;
        }
        try {
            long jD = wVar.D();
            if (!z11) {
                jD *= (long) rVar.f55917b;
            }
            bVar.f38845a = jD;
            int iT = t(i12, wVar);
            if (iT == -1 || iT > rVar.f55917b) {
                return false;
            }
            int i16 = rVar.f55920e;
            if (i13 != 0) {
                if (i13 <= 11) {
                    if (i13 != rVar.f55921f) {
                        return false;
                    }
                } else if (i13 != 12) {
                    if (i13 > 14) {
                        return false;
                    }
                    int iC = wVar.C();
                    if (i13 == 14) {
                        iC *= 10;
                    }
                    if (iC != i16) {
                        return false;
                    }
                } else if (wVar.w() * 1000 != i16) {
                    return false;
                }
            }
            int iW = wVar.w();
            int i17 = wVar.f4040b;
            byte[] bArr = wVar.f4039a;
            int i18 = i17 - 1;
            int i19 = 0;
            for (int i21 = wVar.f4040b; i21 < i18; i21++) {
                i19 = b7.f0.f3986l[i19 ^ (bArr[i21] & 255)];
            }
            String str = b7.f0.f3975a;
            return iW == i19;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void c(String str, boolean z11) throws ParserException {
        if (!z11) {
            throw ParserException.a(null, str);
        }
    }

    public static void d(long j11, b7.w wVar, e0[] e0VarArr) {
        int i11;
        int iW;
        while (true) {
            if (wVar.a() <= 1) {
                return;
            }
            int i12 = 0;
            while (true) {
                if (wVar.a() == 0) {
                    i11 = -1;
                    break;
                }
                int iW2 = wVar.w();
                i12 += iW2;
                if (iW2 != 255) {
                    i11 = i12;
                    break;
                }
            }
            int i13 = 0;
            do {
                if (wVar.a() == 0) {
                    i13 = -1;
                    break;
                } else {
                    iW = wVar.w();
                    i13 += iW;
                }
            } while (iW == 255);
            int i14 = wVar.f4040b + i13;
            if (i13 == -1 || i13 > wVar.a()) {
                b7.a.B("Skipping remainder of malformed SEI NAL unit.");
                i14 = wVar.f4041c;
            } else if (i11 == 4 && i13 >= 8) {
                int iW3 = wVar.w();
                int iC = wVar.C();
                int iJ = iC == 49 ? wVar.j() : 0;
                int iW4 = wVar.w();
                if (iC == 47) {
                    wVar.J(1);
                }
                boolean z11 = iW3 == 181 && (iC == 49 || iC == 47) && iW4 == 3;
                if (iC == 49) {
                    z11 &= iJ == 1195456820;
                }
                if (z11) {
                    e(j11, wVar, e0VarArr);
                }
            }
            wVar.I(i14);
        }
    }

    public static void e(long j11, b7.w wVar, e0[] e0VarArr) {
        int iW = wVar.w();
        if ((iW & 64) != 0) {
            wVar.J(1);
            int i11 = (iW & 31) * 3;
            int i12 = wVar.f4040b;
            for (e0 e0Var : e0VarArr) {
                wVar.I(i12);
                e0Var.a(wVar, i11, 0);
                b7.a.j(j11 != -9223372036854775807L);
                e0Var.d(j11, 1, i11, 0, null);
            }
        }
    }

    public static int f(int i11, int i12) {
        int i13 = i12 / 2;
        if (i11 < 0 || i11 >= 3 || i12 < 0 || i13 >= 19) {
            return -1;
        }
        int i14 = f55816d[i11];
        if (i14 == 44100) {
            return ((i12 % 2) + f55820h[i13]) * 2;
        }
        int i15 = f55819g[i13];
        return i14 == 32000 ? i15 * 6 : i15 * 4;
    }

    public static void g(int i11, b7.w wVar) {
        wVar.F(7);
        byte[] bArr = wVar.f4039a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i11 >> 16) & 255);
        bArr[5] = (byte) ((i11 >> 8) & 255);
        bArr[6] = (byte) (i11 & 255);
    }

    public static int h(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if ((i11 & (-2097152)) != -2097152 || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0 || (i14 = (i11 >>> 12) & 15) == 0 || i14 == 15 || (i15 = (i11 >>> 10) & 3) == 3) {
            return -1;
        }
        int i17 = f55831t[i15];
        if (i12 == 2) {
            i17 /= 2;
        } else if (i12 == 0) {
            i17 /= 4;
        }
        int i18 = (i11 >>> 9) & 1;
        if (i13 == 3) {
            return ((((i12 == 3 ? f55832u[i14 - 1] : f55833v[i14 - 1]) * 12) / i17) + i18) * 4;
        }
        if (i12 == 3) {
            i16 = i13 == 2 ? f55834w[i14 - 1] : f55835x[i14 - 1];
        } else {
            i16 = f55836y[i14 - 1];
        }
        if (i12 == 3) {
            return defpackage.e.D(i16, 144, i17, i18);
        }
        return defpackage.e.D(i13 == 1 ? 72 : 144, i16, i17, i18);
    }

    public static int i(int i11) {
        if (i11 == 20) {
            return 63750;
        }
        if (i11 == 30) {
            return 2250000;
        }
        switch (i11) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i11) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static b7.v j(byte[] bArr) {
        byte b3 = bArr[0];
        if (b3 == 127 || b3 == 100 || b3 == 64 || b3 == 113) {
            return new b7.v(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b11 = bArrCopyOf[0];
        if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
            for (int i11 = 0; i11 < bArrCopyOf.length - 1; i11 += 2) {
                byte b12 = bArrCopyOf[i11];
                int i12 = i11 + 1;
                bArrCopyOf[i11] = bArrCopyOf[i12];
                bArrCopyOf[i12] = b12;
            }
        }
        b7.v vVar = new b7.v(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            b7.v vVar2 = new b7.v(bArrCopyOf, bArrCopyOf.length);
            while (vVar2.b() >= 16) {
                vVar2.t(2);
                int i13 = vVar2.i(14) & 16383;
                int iMin = Math.min(8 - vVar.f4034d, 14);
                int i14 = vVar.f4034d;
                int i15 = (8 - i14) - iMin;
                byte[] bArr2 = vVar.f4032b;
                int i16 = vVar.f4033c;
                byte b13 = (byte) (((65280 >> i14) | ((1 << i15) - 1)) & bArr2[i16]);
                bArr2[i16] = b13;
                int i17 = 14 - iMin;
                bArr2[i16] = (byte) (b13 | ((i13 >>> i17) << i15));
                int i18 = i16 + 1;
                while (i17 > 8) {
                    vVar.f4032b[i18] = (byte) (i13 >>> (i17 - 8));
                    i17 -= 8;
                    i18++;
                }
                int i19 = 8 - i17;
                byte[] bArr3 = vVar.f4032b;
                byte b14 = (byte) (bArr3[i18] & ((1 << i19) - 1));
                bArr3[i18] = b14;
                bArr3[i18] = (byte) (((i13 & ((1 << i17) - 1)) << i19) | b14);
                vVar.t(14);
                vVar.a();
            }
        }
        vVar.p(bArrCopyOf, bArrCopyOf.length);
        return vVar;
    }

    public static long k(byte b3, byte b11) {
        int i11;
        int i12;
        int i13 = b3 & 255;
        int i14 = b3 & 3;
        if (i14 != 0) {
            i11 = 2;
            if (i14 != 1 && i14 != 2) {
                i11 = b11 & 63;
            }
        } else {
            i11 = 1;
        }
        int i15 = i13 >> 3;
        int i16 = i15 & 3;
        if (i15 >= 16) {
            i12 = 2500 << i16;
        } else if (i15 >= 12) {
            i12 = 10000 << (i15 & 1);
        } else {
            i12 = i16 == 3 ? 60000 : 10000 << i16;
        }
        return ((long) i11) * ((long) i12);
    }

    public static int l(b7.v vVar) throws ParserException {
        int i11 = vVar.i(4);
        if (i11 == 15) {
            if (vVar.b() >= 24) {
                return vVar.i(24);
            }
            throw ParserException.a(null, "AAC header insufficient data");
        }
        if (i11 < 13) {
            return f55813a[i11];
        }
        throw ParserException.a(null, "AAC header wrong Sampling Frequency Index");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    public static c7.j m(b7.v vVar) {
        int i11;
        int i12;
        int i13 = vVar.i(16);
        int i14 = vVar.i(16);
        if (i14 == 65535) {
            i14 = vVar.i(24);
            i11 = 7;
        } else {
            i11 = 4;
        }
        int i15 = i14 + i11;
        if (i13 == 44097) {
            i15 += 2;
        }
        if (vVar.i(2) == 3) {
            do {
                vVar.i(2);
            } while (vVar.h());
        }
        int i16 = vVar.i(10);
        if (vVar.h() && vVar.i(3) > 0) {
            vVar.t(2);
        }
        int i17 = vVar.h() ? 48000 : 44100;
        int i18 = vVar.i(4);
        int[] iArr = f55821i;
        if (i17 == 44100 && i18 == 13) {
            i12 = iArr[i18];
        } else if (i17 != 48000 || i18 >= 14) {
            i12 = 0;
        } else {
            int i19 = iArr[i18];
            int i21 = i16 % 5;
            if (i21 == 1) {
                if (i18 != 3 || i18 == 8) {
                    i12 = i19 + 1;
                } else {
                    i12 = i19;
                }
            } else if (i21 != 2) {
                if (i21 == 3) {
                    if (i18 != 3) {
                    }
                    i12 = i19 + 1;
                } else if (i21 == 4 && (i18 == 3 || i18 == 8 || i18 == 11)) {
                    i12 = i19 + 1;
                } else {
                    i12 = i19;
                }
            } else if (i18 == 8 || i18 == 11) {
                i12 = i19 + 1;
            } else {
                i12 = i19;
            }
        }
        return new c7.j(i17, i15, i12);
    }

    public static com.android.billingclient.api.i n(b7.v vVar, boolean z11) throws ParserException {
        int i11 = vVar.i(5);
        if (i11 == 31) {
            i11 = vVar.i(6) + 32;
        }
        int iL = l(vVar);
        int i12 = vVar.i(4);
        String strJ = nv.p.j(i11, "mp4a.40.");
        if (i11 == 5 || i11 == 29) {
            iL = l(vVar);
            int i13 = vVar.i(5);
            if (i13 == 31) {
                i13 = vVar.i(6) + 32;
            }
            i11 = i13;
            if (i11 == 22) {
                i12 = vVar.i(4);
            }
        }
        if (z11) {
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4 && i11 != 6 && i11 != 7 && i11 != 17) {
                switch (i11) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + i11);
                }
            }
            if (vVar.h()) {
                b7.a.B("Unexpected frameLengthFlag = 1");
            }
            if (vVar.h()) {
                vVar.t(14);
            }
            boolean zH = vVar.h();
            if (i12 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i11 == 6 || i11 == 20) {
                vVar.t(3);
            }
            if (zH) {
                if (i11 == 22) {
                    vVar.t(16);
                }
                if (i11 == 17 || i11 == 19 || i11 == 20 || i11 == 23) {
                    vVar.t(3);
                }
                vVar.t(1);
            }
            switch (i11) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i14 = vVar.i(2);
                    if (i14 == 2 || i14 == 3) {
                        throw ParserException.c("Unsupported epConfig: " + i14);
                    }
                    break;
            }
        }
        int i15 = f55814b[i12];
        if (i15 == -1) {
            throw ParserException.a(null, null);
        }
        com.android.billingclient.api.i iVar = new com.android.billingclient.api.i();
        iVar.f7515a = iL;
        iVar.f7516b = i15;
        iVar.f7517c = strJ;
        return iVar;
    }

    public static void o(b7.v vVar, b bVar) throws ParserException {
        int i11 = vVar.i(5);
        vVar.t(2);
        if (vVar.h()) {
            vVar.t(5);
        }
        if (i11 >= 7 && i11 <= 10) {
            vVar.s();
        }
        if (vVar.h()) {
            int i12 = vVar.i(3);
            if (bVar.f55845b == -1 && i11 >= 0 && i11 <= 15 && (i12 == 0 || i12 == 1)) {
                bVar.f55845b = i11;
            }
            if (vVar.h()) {
                w(vVar);
            }
        }
    }

    public static void p(b7.v vVar, b bVar) throws ParserException {
        vVar.t(2);
        boolean zH = vVar.h();
        int i11 = vVar.i(8);
        for (int i12 = 0; i12 < i11; i12++) {
            vVar.t(2);
            if (vVar.h()) {
                vVar.t(5);
            }
            if (zH) {
                vVar.t(24);
            } else {
                if (vVar.h()) {
                    if (!vVar.h()) {
                        vVar.t(4);
                    }
                    bVar.f55846c = vVar.i(6) + 1;
                }
                vVar.t(4);
            }
        }
        if (vVar.h()) {
            vVar.t(3);
            if (vVar.h()) {
                w(vVar);
            }
        }
    }

    public static int q(b7.v vVar, int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 3 && vVar.h(); i12++) {
            i11++;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 += 1 << iArr[i14];
        }
        return vVar.i(iArr[i11]) + i13;
    }

    public static y6.c0 r(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            String str = (String) list.get(i11);
            String str2 = b7.f0.f3975a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                b7.a.B("Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(j8.a.d(new b7.w(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e8) {
                    b7.a.C("Failed to parse vorbis picture", e8);
                }
            } else {
                arrayList.add(new o8.a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new y6.c0(arrayList);
    }

    public static y6.c0 s(n nVar, boolean z11) throws Throwable {
        h2.d dVar = z11 ? null : l8.i.f39823b;
        b7.w wVar = new b7.w(10);
        y6.c0 c0VarN = null;
        int i11 = 0;
        while (true) {
            try {
                nVar.A(wVar.f4039a, 0, 10);
                wVar.I(0);
                if (wVar.z() != 4801587) {
                    break;
                }
                wVar.J(3);
                int iV = wVar.v();
                int i12 = iV + 10;
                if (c0VarN == null) {
                    byte[] bArr = new byte[i12];
                    System.arraycopy(wVar.f4039a, 0, bArr, 0, 10);
                    nVar.A(bArr, 10, iV);
                    c0VarN = new l8.i(dVar).N(bArr, i12);
                } else {
                    nVar.k(iV);
                }
                i11 += i12;
            } catch (EOFException unused) {
            }
        }
        nVar.r();
        nVar.k(i11);
        if (c0VarN == null || c0VarN.f57178a.length == 0) {
            return null;
        }
        return c0VarN;
    }

    public static int t(int i11, b7.w wVar) {
        switch (i11) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i11 - 2);
            case 6:
                return wVar.w() + 1;
            case 7:
                return wVar.C() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i11 - 8);
            default:
                return -1;
        }
    }

    public static qp.b u(b7.w wVar) {
        wVar.J(1);
        int iZ = wVar.z();
        long j11 = ((long) wVar.f4040b) + ((long) iZ);
        int i11 = iZ / 18;
        long[] jArrCopyOf = new long[i11];
        long[] jArrCopyOf2 = new long[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            long jQ = wVar.q();
            if (jQ == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i12);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i12);
                break;
            }
            jArrCopyOf[i12] = jQ;
            jArrCopyOf2[i12] = wVar.q();
            wVar.J(2);
        }
        wVar.J((int) (j11 - ((long) wVar.f4040b)));
        return new qp.b(10, jArrCopyOf, jArrCopyOf2);
    }

    public static m5 v(b7.w wVar, boolean z11, boolean z12) throws ParserException {
        if (z11) {
            x(3, wVar, false);
        }
        wVar.u((int) wVar.n(), StandardCharsets.UTF_8);
        long jN = wVar.n();
        String[] strArr = new String[(int) jN];
        for (int i11 = 0; i11 < jN; i11++) {
            strArr[i11] = wVar.u((int) wVar.n(), StandardCharsets.UTF_8);
        }
        if (z12 && (wVar.w() & 1) == 0) {
            throw ParserException.a(null, "framing bit expected to be set");
        }
        return new m5(strArr, 8);
    }

    public static void w(b7.v vVar) throws ParserException {
        int i11 = vVar.i(6);
        if (i11 < 2 || i11 > 42) {
            throw ParserException.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i11)));
        }
        vVar.t(i11 * 8);
    }

    public static boolean x(int i11, b7.w wVar, boolean z11) throws ParserException {
        if (wVar.a() < 7) {
            if (z11) {
                return false;
            }
            throw ParserException.a(null, "too short header: " + wVar.a());
        }
        if (wVar.w() != i11) {
            if (z11) {
                return false;
            }
            throw ParserException.a(null, "expected header type " + Integer.toHexString(i11));
        }
        if (wVar.w() == 118 && wVar.w() == 111 && wVar.w() == 114 && wVar.w() == 98 && wVar.w() == 105 && wVar.w() == 115) {
            return true;
        }
        if (z11) {
            return false;
        }
        throw ParserException.a(null, "expected characters 'vorbis'");
    }
}
