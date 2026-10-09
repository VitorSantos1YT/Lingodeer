package p8;

import aj.uZCn.evRpcb;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import b7.f0;
import b7.o;
import b7.v;
import b7.w;
import bq.f;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.android.billingclient.api.c0;
import com.google.api.Service;
import com.google.common.collect.ImmutableList;
import com.lingodeer.data.model.AchievementLevelType;
import com.stkouyu.util.httputil.Consts;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dt.Xk.wuoM;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import n9.q;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import u8.i;
import x7.e0;
import x7.j;
import x7.m;
import x7.n;
import x7.u;
import x7.y;
import y6.d0;
import y6.g;
import y6.k;
import y6.l;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f46598f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final byte[] f46599g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final byte[] f46600h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final byte[] f46601i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final UUID f46602j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Map f46603k0;
    public long A;
    public boolean B;
    public long C;
    public long D;
    public long E;
    public o F;
    public o G;
    public boolean H;
    public boolean I;
    public int J;
    public long K;
    public long L;
    public int M;
    public int N;
    public int[] O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public long U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f46604a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f46605a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f46606b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f46607b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f46608c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public byte f46609c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46610d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f46611d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46612e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public x7.o f46613e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f46614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f46615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f46616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f46617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f46618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w f46619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w f46620l;
    public final w m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w f46621n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w f46622o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f46623p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f46624q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f46625r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f46626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f46627t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f46628u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f46629v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f46630w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c f46631x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f46632y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f46633z;

    static {
        String str = f0.f3975a;
        f46599g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f46600h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f46601i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f46602j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        defpackage.e.z(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        defpackage.e.z(AchievementLevelType.DAY_STREAK_LV_8, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f46603k0 = Collections.unmodifiableMap(map);
    }

    public d(i iVar, int i11) {
        b bVar = new b(0);
        this.f46626s = -1L;
        this.f46627t = -9223372036854775807L;
        this.f46628u = -9223372036854775807L;
        this.f46629v = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.f46604a = bVar;
        bVar.f46571g = new q(this, 7);
        this.f46614f = iVar;
        this.f46610d = (i11 & 1) == 0;
        this.f46612e = (i11 & 2) == 0;
        this.f46606b = new e();
        this.f46608c = new SparseArray();
        this.f46617i = new w(4);
        this.f46618j = new w(ByteBuffer.allocate(4).putInt(-1).array());
        this.f46619k = new w(4);
        this.f46615g = new w(c7.q.f6709a);
        this.f46616h = new w(4);
        this.f46620l = new w();
        this.m = new w();
        this.f46621n = new w(8);
        this.f46622o = new w();
        this.f46623p = new w();
        this.O = new int[1];
    }

    public static byte[] i(long j11, long j12, String str) {
        b7.a.d(j11 != -9223372036854775807L);
        int i11 = (int) (j11 / 3600000000L);
        long j13 = j11 - (((long) i11) * 3600000000L);
        int i12 = (int) (j13 / 60000000);
        long j14 = j13 - (((long) i12) * 60000000);
        int i13 = (int) (j14 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf((int) ((j14 - (((long) i13) * 1000000)) / j12)));
        String str3 = f0.f3975a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    public final void a(int i11) {
        if (this.F == null || this.G == null) {
            throw ParserException.a(null, "Element " + i11 + " must be in a Cues");
        }
    }

    public final void b(int i11) {
        if (this.f46631x != null) {
            return;
        }
        throw ParserException.a(null, "Element " + i11 + " must be in a TrackEntry");
    }

    @Override // x7.m
    public final boolean c(n nVar) throws EOFException, InterruptedIOException {
        c0 c0Var = new c0(10, (byte) 0);
        w wVar = (w) c0Var.f7471c;
        j jVar = (j) nVar;
        long j11 = jVar.f55900c;
        long j12 = 1024;
        if (j11 != -1 && j11 <= 1024) {
            j12 = j11;
        }
        int i11 = (int) j12;
        jVar.f(wVar.f4039a, 0, 4, false);
        c0Var.f7470b = 4;
        for (long jY = wVar.y(); jY != 440786851; jY = ((jY << 8) & (-256)) | ((long) (wVar.f4039a[0] & 255))) {
            int i12 = c0Var.f7470b + 1;
            c0Var.f7470b = i12;
            if (i12 == i11) {
                return false;
            }
            jVar.f(wVar.f4039a, 0, 1, false);
        }
        long jE = c0Var.e(jVar);
        long j13 = c0Var.f7470b;
        if (jE != Long.MIN_VALUE && (j11 == -1 || j13 + jE < j11)) {
            while (true) {
                long j14 = c0Var.f7470b;
                long j15 = j13 + jE;
                if (j14 < j15) {
                    if (c0Var.e(jVar) == Long.MIN_VALUE) {
                        break;
                    }
                    long jE2 = c0Var.e(jVar);
                    if (jE2 < 0 || jE2 > 2147483647L) {
                        break;
                    }
                    if (jE2 != 0) {
                        int i13 = (int) jE2;
                        jVar.b(i13, false);
                        c0Var.f7470b += i13;
                    }
                } else if (j14 == j15) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d(c cVar, long j11, int i11, int i12, int i13) {
        byte[] bArrI;
        int i14;
        int i15;
        x7.f0 f0Var = cVar.V;
        if (f0Var != null) {
            f0Var.b(cVar.Z, j11, i11, i12, i13, cVar.f46583k);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f46575c) || "S_TEXT/ASS".equals(cVar.f46575c) || "S_TEXT/SSA".equals(cVar.f46575c) || "S_TEXT/WEBVTT".equals(cVar.f46575c)) {
                if (this.N > 1) {
                    b7.a.B("Skipping subtitle sample in laced block.");
                } else {
                    long j12 = this.L;
                    if (j12 == -9223372036854775807L) {
                        b7.a.B("Skipping subtitle sample with no duration.");
                    } else {
                        String str = cVar.f46575c;
                        w wVar = this.m;
                        byte[] bArr = wVar.f4039a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                bArrI = i(j12, 10000L, "%01d:%02d:%02d:%02d");
                                i14 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrI = i(j12, 1000L, "%02d:%02d:%02d.%03d");
                                i14 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrI = i(j12, 1000L, "%02d:%02d:%02d,%03d");
                                i14 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrI, 0, bArr, i14, bArrI.length);
                        for (int i16 = wVar.f4040b; i16 < wVar.f4041c; i16++) {
                            if (wVar.f4039a[i16] == 0) {
                                wVar.H(i16);
                                cVar.Z.a(wVar, wVar.f4041c, 0);
                                i15 = i12 + wVar.f4041c;
                            }
                        }
                        cVar.Z.a(wVar, wVar.f4041c, 0);
                        i15 = i12 + wVar.f4041c;
                    }
                }
                i15 = i12;
            } else {
                i15 = i12;
            }
            if ((i11 & 268435456) != 0) {
                int i17 = this.N;
                w wVar2 = this.f46623p;
                if (i17 > 1) {
                    wVar2.F(0);
                } else {
                    int i18 = wVar2.f4041c;
                    cVar.Z.a(wVar2, i18, 2);
                    i15 += i18;
                }
            }
            cVar.Z.d(j11, i11, i15, i13, cVar.f46583k);
        }
        this.I = true;
    }

    @Override // x7.m
    public final void e(x7.o oVar) {
        if (this.f46612e) {
            oVar = new f(oVar, this.f46614f);
        }
        this.f46613e0 = oVar;
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        this.E = -9223372036854775807L;
        this.J = 0;
        b bVar = this.f46604a;
        bVar.f46566b = 0;
        ((ArrayDeque) bVar.f46569e).clear();
        e eVar = (e) bVar.f46570f;
        eVar.f46636b = 0;
        eVar.f46637c = 0;
        e eVar2 = this.f46606b;
        eVar2.f46636b = 0;
        eVar2.f46637c = 0;
        k();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f46608c;
            if (i11 >= sparseArray.size()) {
                return;
            }
            x7.f0 f0Var = ((c) sparseArray.valueAt(i11)).V;
            if (f0Var != null) {
                f0Var.f55882b = false;
                f0Var.f55883c = 0;
            }
            i11++;
        }
    }

    public final void j(n nVar, int i11) {
        w wVar = this.f46617i;
        if (wVar.f4041c >= i11) {
            return;
        }
        byte[] bArr = wVar.f4039a;
        if (bArr.length < i11) {
            wVar.c(Math.max(bArr.length * 2, i11));
        }
        byte[] bArr2 = wVar.f4039a;
        int i12 = wVar.f4041c;
        nVar.readFully(bArr2, i12, i11 - i12);
        wVar.H(i11);
    }

    public final void k() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.f46605a0 = false;
        this.f46607b0 = 0;
        this.f46609c0 = (byte) 0;
        this.f46611d0 = false;
        this.f46620l.F(0);
    }

    public final long l(long j11) throws ParserException {
        long j12 = this.f46627t;
        if (j12 == -9223372036854775807L) {
            throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = f0.f3975a;
        return f0.R(j11, j12, 1000L, RoundingMode.DOWN);
    }

    public final int m(n nVar, c cVar, int i11, boolean z11) {
        int iC;
        int iC2;
        boolean z12;
        int i12;
        if ("S_TEXT/UTF8".equals(cVar.f46575c)) {
            n(nVar, f46598f0, i11);
            int i13 = this.W;
            k();
            return i13;
        }
        if ("S_TEXT/ASS".equals(cVar.f46575c) || "S_TEXT/SSA".equals(cVar.f46575c)) {
            n(nVar, f46600h0, i11);
            int i14 = this.W;
            k();
            return i14;
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f46575c)) {
            n(nVar, f46601i0, i11);
            int i15 = this.W;
            k();
            return i15;
        }
        e0 e0Var = cVar.Z;
        boolean z13 = this.Y;
        w wVar = this.f46620l;
        if (!z13) {
            boolean z14 = cVar.f46581i;
            w wVar2 = this.f46617i;
            if (z14) {
                this.R &= -1073741825;
                if (!this.Z) {
                    nVar.readFully(wVar2.f4039a, 0, 1);
                    this.V++;
                    byte b3 = wVar2.f4039a[0];
                    if ((b3 & 128) == 128) {
                        throw ParserException.a(null, "Extension bit is set in signal byte");
                    }
                    this.f46609c0 = b3;
                    this.Z = true;
                }
                byte b11 = this.f46609c0;
                if ((b11 & 1) == 1) {
                    boolean z15 = (b11 & 2) == 2;
                    this.R |= 1073741824;
                    if (!this.f46611d0) {
                        w wVar3 = this.f46621n;
                        nVar.readFully(wVar3.f4039a, 0, 8);
                        this.V += 8;
                        this.f46611d0 = true;
                        wVar2.f4039a[0] = (byte) ((z15 ? 128 : 0) | 8);
                        wVar2.I(0);
                        e0Var.a(wVar2, 1, 1);
                        this.W++;
                        wVar3.I(0);
                        e0Var.a(wVar3, 8, 1);
                        this.W += 8;
                    }
                    if (z15) {
                        if (!this.f46605a0) {
                            nVar.readFully(wVar2.f4039a, 0, 1);
                            this.V++;
                            wVar2.I(0);
                            this.f46607b0 = wVar2.w();
                            this.f46605a0 = true;
                        }
                        int i16 = this.f46607b0 * 4;
                        wVar2.F(i16);
                        nVar.readFully(wVar2.f4039a, 0, i16);
                        this.V += i16;
                        short s3 = (short) ((this.f46607b0 / 2) + 1);
                        int i17 = (s3 * 6) + 2;
                        ByteBuffer byteBuffer = this.f46624q;
                        if (byteBuffer == null || byteBuffer.capacity() < i17) {
                            this.f46624q = ByteBuffer.allocate(i17);
                        }
                        this.f46624q.position(0);
                        this.f46624q.putShort(s3);
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            i12 = this.f46607b0;
                            if (i18 >= i12) {
                                break;
                            }
                            int iA = wVar2.A();
                            if (i18 % 2 == 0) {
                                this.f46624q.putShort((short) (iA - i19));
                            } else {
                                this.f46624q.putInt(iA - i19);
                            }
                            i18++;
                            i19 = iA;
                        }
                        int i21 = (i11 - this.V) - i19;
                        if (i12 % 2 == 1) {
                            this.f46624q.putInt(i21);
                        } else {
                            this.f46624q.putShort((short) i21);
                            this.f46624q.putInt(0);
                        }
                        byte[] bArrArray = this.f46624q.array();
                        w wVar4 = this.f46622o;
                        wVar4.G(bArrArray, i17);
                        e0Var.a(wVar4, i17, 1);
                        this.W += i17;
                    }
                }
            } else {
                byte[] bArr = cVar.f46582j;
                if (bArr != null) {
                    wVar.G(bArr, bArr.length);
                }
            }
            if ("A_OPUS".equals(cVar.f46575c)) {
                z12 = z11;
            } else {
                z12 = cVar.f46579g > 0;
            }
            if (z12) {
                this.R |= 268435456;
                this.f46623p.F(0);
                int i22 = (wVar.f4041c + i11) - this.V;
                wVar2.F(4);
                byte[] bArr2 = wVar2.f4039a;
                bArr2[0] = (byte) ((i22 >> 24) & 255);
                bArr2[1] = (byte) ((i22 >> 16) & 255);
                bArr2[2] = (byte) ((i22 >> 8) & 255);
                bArr2[3] = (byte) (i22 & 255);
                e0Var.a(wVar2, 4, 2);
                this.W += 4;
            }
            this.Y = true;
        }
        int i23 = i11 + wVar.f4041c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f46575c) && !"V_MPEGH/ISO/HEVC".equals(cVar.f46575c)) {
            if (cVar.V != null) {
                b7.a.j(wVar.f4041c == 0);
                cVar.V.c(nVar);
            }
            while (true) {
                int i24 = this.V;
                if (i24 >= i23) {
                    break;
                }
                int i25 = i23 - i24;
                int iA2 = wVar.a();
                if (iA2 > 0) {
                    iC2 = Math.min(i25, iA2);
                    e0Var.a(wVar, iC2, 0);
                } else {
                    iC2 = e0Var.c(nVar, i25, false);
                }
                this.V += iC2;
                this.W += iC2;
            }
        } else {
            w wVar5 = this.f46616h;
            byte[] bArr3 = wVar5.f4039a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i26 = cVar.f46573a0;
            int i27 = 4 - i26;
            while (this.V < i23) {
                int i28 = this.X;
                if (i28 == 0) {
                    int iMin = Math.min(i26, wVar.a());
                    nVar.readFully(bArr3, i27 + iMin, i26 - iMin);
                    if (iMin > 0) {
                        wVar.h(bArr3, i27, iMin);
                    }
                    this.V += i26;
                    wVar5.I(0);
                    this.X = wVar5.A();
                    w wVar6 = this.f46615g;
                    wVar6.I(0);
                    e0Var.a(wVar6, 4, 0);
                    this.W += 4;
                } else {
                    int iA3 = wVar.a();
                    if (iA3 > 0) {
                        iC = Math.min(i28, iA3);
                        e0Var.a(wVar, iC, 0);
                    } else {
                        iC = e0Var.c(nVar, i28, false);
                    }
                    this.V += iC;
                    this.W += iC;
                    this.X -= iC;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f46575c)) {
            w wVar7 = this.f46618j;
            wVar7.I(0);
            e0Var.a(wVar7, 4, 0);
            this.W += 4;
        }
        int i29 = this.W;
        k();
        return i29;
    }

    public final void n(n nVar, byte[] bArr, int i11) {
        int length = bArr.length + i11;
        w wVar = this.m;
        byte[] bArr2 = wVar.f4039a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i11);
            wVar.getClass();
            wVar.G(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        nVar.readFully(wVar.f4039a, bArr.length, i11);
        wVar.I(0);
        wVar.H(length);
    }

    @Override // x7.m
    public final void release() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:237:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:538:0x0911  */
    /* JADX WARN: Code duplicated, block: B:543:0x0928  */
    /* JADX WARN: Code duplicated, block: B:544:0x092a  */
    /* JADX WARN: Code duplicated, block: B:547:0x093b  */
    /* JADX WARN: Code duplicated, block: B:548:0x0948  */
    /* JADX WARN: Code duplicated, block: B:550:0x094e  */
    /* JADX WARN: Code duplicated, block: B:552:0x0952  */
    /* JADX WARN: Code duplicated, block: B:554:0x0957  */
    /* JADX WARN: Code duplicated, block: B:557:0x095f  */
    /* JADX WARN: Code duplicated, block: B:559:0x0964  */
    /* JADX WARN: Code duplicated, block: B:562:0x0969  */
    /* JADX WARN: Code duplicated, block: B:565:0x0977  */
    /* JADX WARN: Code duplicated, block: B:568:0x097d  */
    /* JADX WARN: Code duplicated, block: B:570:0x0983  */
    /* JADX WARN: Code duplicated, block: B:590:0x0a39  */
    /* JADX WARN: Code duplicated, block: B:592:0x0a55  */
    /* JADX WARN: Code duplicated, block: B:595:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:598:0x0a6f  */
    /* JADX WARN: Code duplicated, block: B:601:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:620:0x0ac2  */
    /* JADX WARN: Code duplicated, block: B:622:0x0adc  */
    /* JADX WARN: Code duplicated, block: B:624:0x0ae2  */
    /* JADX WARN: Code duplicated, block: B:640:0x0b0e  */
    /* JADX WARN: Code duplicated, block: B:645:0x0b22  */
    /* JADX WARN: Code duplicated, block: B:646:0x0b25  */
    /* JADX WARN: Code duplicated, block: B:96:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object, p8.c] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50, types: [java.lang.RuntimeException] */
    @Override // x7.m
    public final int g(n nVar, kw.b bVar) throws ParserException {
        n nVar2;
        boolean z11;
        int i11;
        boolean z12;
        String str;
        long j11;
        int i12;
        int iA;
        d dVar;
        boolean z13;
        byte b3;
        d dVar2;
        List listSingletonList;
        int iW;
        int i13;
        List list;
        RuntimeException runtimeException;
        Pair pair;
        String str2;
        List list2;
        String str3;
        List list3;
        List listU;
        d dVar3;
        List list4;
        List list5;
        int i14;
        y6.o oVar;
        boolean zK;
        int i15;
        int i16;
        int i17;
        float f5;
        g gVar;
        String str4;
        int iIntValue;
        int i18;
        byte[] bArr;
        int i19;
        int i21;
        int i22;
        String str5;
        String str6;
        c7.a aVarA;
        y qVar;
        int i23;
        d dVar4 = this;
        dVar4.I = false;
        boolean z14 = true;
        while (true) {
            int i24 = -1;
            if (z14 && !dVar4.I) {
                b bVar2 = dVar4.f46604a;
                e eVar = (e) bVar2.f46570f;
                ArrayDeque arrayDeque = (ArrayDeque) bVar2.f46569e;
                b7.a.k((q) bVar2.f46571g);
                while (true) {
                    a aVar = (a) arrayDeque.peek();
                    if (aVar == null || nVar.getPosition() < aVar.f46564b) {
                        int i25 = 0;
                        if (bVar2.f46566b == 0) {
                            nVar2 = nVar;
                            int i26 = 4;
                            long jB = eVar.b(nVar2, true, false, 4);
                            if (jB == -2) {
                                byte[] bArr2 = (byte[]) bVar2.f46568d;
                                nVar2.r();
                                while (true) {
                                    nVar2.A(bArr2, i25, i26);
                                    byte b11 = bArr2[i25];
                                    int i27 = 0;
                                    while (true) {
                                        if (i27 >= 8) {
                                            i12 = -1;
                                        } else if ((e.f46634d[i27] & ((long) b11)) != 0) {
                                            i12 = i27 + 1;
                                        } else {
                                            i27++;
                                        }
                                    }
                                    if (i12 != -1 && i12 <= 4) {
                                        iA = (int) e.a(bArr2, i12, false);
                                        Object obj = ((q) bVar2.f46571g).f43673b;
                                        if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                                        }
                                    }
                                    nVar2.s(1);
                                    i25 = 0;
                                    i26 = 4;
                                }
                                nVar2.s(i12);
                                j11 = iA;
                            } else {
                                j11 = jB;
                            }
                            z11 = true;
                            if (j11 == -1) {
                                z14 = false;
                                z12 = false;
                            } else {
                                bVar2.f46567c = (int) j11;
                                bVar2.f46566b = 1;
                            }
                        } else {
                            nVar2 = nVar;
                            z11 = true;
                        }
                        if (bVar2.f46566b == z11) {
                            bVar2.f46565a = eVar.b(nVar2, false, z11, 8);
                            bVar2.f46566b = 2;
                        }
                        q qVar2 = (q) bVar2.f46571g;
                        int i28 = bVar2.f46567c;
                        Object obj2 = qVar2.f43673b;
                        switch (i28) {
                            case 131:
                            case 136:
                            case 155:
                            case 159:
                            case 176:
                            case 179:
                            case 186:
                            case 215:
                            case 231:
                            case 238:
                            case 241:
                            case 251:
                            case 16871:
                            case 16980:
                            case 17029:
                            case 17143:
                            case 18401:
                            case 18408:
                            case 20529:
                            case 20530:
                            case 21420:
                            case 21432:
                            case 21680:
                            case 21682:
                            case 21690:
                            case 21930:
                            case 21938:
                            case 21945:
                            case 21946:
                            case 21947:
                            case 21948:
                            case 21949:
                            case 21998:
                            case 22186:
                            case 22203:
                            case 25188:
                            case 30114:
                            case 30321:
                            case 2352003:
                            case 2807729:
                                i11 = 2;
                                break;
                            case 134:
                            case 17026:
                            case 21358:
                            case 2274716:
                                i11 = 3;
                                break;
                            case 160:
                            case 166:
                            case 174:
                            case 183:
                            case 187:
                            case 224:
                            case 225:
                            case 16868:
                            case 18407:
                            case 19899:
                            case 20532:
                            case 20533:
                            case 21936:
                            case 21968:
                            case 25152:
                            case 28032:
                            case 30113:
                            case 30320:
                            case 290298740:
                            case 357149030:
                            case 374648427:
                            case 408125543:
                            case 440786851:
                            case 475249515:
                            case 524531317:
                                i11 = 1;
                                break;
                            case 161:
                            case 163:
                            case 165:
                            case 16877:
                            case 16981:
                            case 18402:
                            case 21419:
                            case 25506:
                            case 30322:
                                i11 = 4;
                                break;
                            case 181:
                            case 17545:
                            case 21969:
                            case 21970:
                            case 21971:
                            case 21972:
                            case 21973:
                            case 21974:
                            case 21975:
                            case 21976:
                            case 21977:
                            case 21978:
                            case 30323:
                            case 30324:
                            case 30325:
                                i11 = 5;
                                break;
                            default:
                                i11 = 0;
                                break;
                        }
                        if (i11 == 0) {
                            nVar2.s((int) bVar2.f46565a);
                            bVar2.f46566b = 0;
                            i24 = -1;
                        } else if (i11 == 1) {
                            long position = nVar2.getPosition();
                            arrayDeque.push(new a(bVar2.f46567c, bVar2.f46565a + position));
                            q qVar3 = (q) bVar2.f46571g;
                            int i29 = bVar2.f46567c;
                            long j12 = bVar2.f46565a;
                            d dVar5 = (d) qVar3.f43673b;
                            b7.a.k(dVar5.f46613e0);
                            if (i29 != 160) {
                                if (i29 == 174) {
                                    c cVar = new c();
                                    cVar.f46585n = -1;
                                    cVar.f46586o = -1;
                                    cVar.f46587p = -1;
                                    cVar.f46588q = -1;
                                    cVar.f46589r = -1;
                                    cVar.f46590s = 0;
                                    cVar.f46591t = -1;
                                    cVar.f46592u = CropImageView.DEFAULT_ASPECT_RATIO;
                                    cVar.f46593v = CropImageView.DEFAULT_ASPECT_RATIO;
                                    cVar.f46594w = CropImageView.DEFAULT_ASPECT_RATIO;
                                    cVar.f46595x = null;
                                    cVar.f46596y = -1;
                                    cVar.f46597z = false;
                                    cVar.A = -1;
                                    cVar.B = -1;
                                    cVar.C = -1;
                                    cVar.D = 1000;
                                    cVar.E = 200;
                                    cVar.F = -1.0f;
                                    cVar.G = -1.0f;
                                    cVar.H = -1.0f;
                                    cVar.I = -1.0f;
                                    cVar.J = -1.0f;
                                    cVar.K = -1.0f;
                                    cVar.L = -1.0f;
                                    cVar.M = -1.0f;
                                    cVar.N = -1.0f;
                                    cVar.O = -1.0f;
                                    cVar.Q = 1;
                                    cVar.R = -1;
                                    cVar.S = 8000;
                                    cVar.T = 0L;
                                    cVar.U = 0L;
                                    cVar.X = true;
                                    cVar.Y = "eng";
                                    dVar5.f46631x = cVar;
                                    cVar.f46572a = dVar5.f46630w;
                                } else if (i29 == 187) {
                                    z12 = false;
                                    dVar5.H = false;
                                } else if (i29 == 19899) {
                                    dVar5.f46633z = -1;
                                    dVar5.A = -1L;
                                } else if (i29 == 20533) {
                                    dVar5.b(i29);
                                    dVar5.f46631x.f46581i = true;
                                } else if (i29 == 21968) {
                                    dVar5.b(i29);
                                    dVar5.f46631x.f46597z = true;
                                } else if (i29 == 408125543) {
                                    long j13 = dVar5.f46626s;
                                    if (j13 != -1 && j13 != position) {
                                        throw ParserException.a(null, "Multiple Segment elements not supported");
                                    }
                                    dVar5.f46626s = position;
                                    dVar5.f46625r = j12;
                                } else if (i29 == 475249515) {
                                    dVar5.F = new o(0, (byte) 0);
                                    dVar5.G = new o(0, (byte) 0);
                                } else if (i29 == 524531317 && !dVar5.f46632y) {
                                    if (!dVar5.f46610d || dVar5.C == -1) {
                                        dVar5.f46613e0.q(new x7.q(dVar5.f46629v));
                                        dVar5.f46632y = true;
                                    } else {
                                        dVar5.B = true;
                                    }
                                }
                                z12 = false;
                            } else {
                                z12 = false;
                                dVar5.T = false;
                                dVar5.U = 0L;
                            }
                            bVar2.f46566b = z12 ? 1 : 0;
                        } else if (i11 == 2) {
                            long j14 = bVar2.f46565a;
                            if (j14 > 8) {
                                throw ParserException.a(null, "Invalid integer size: " + bVar2.f46565a);
                            }
                            qVar2.h(i28, bVar2.d(nVar2, (int) j14));
                            z12 = false;
                            bVar2.f46566b = 0;
                        } else if (i11 == 3) {
                            long j15 = bVar2.f46565a;
                            if (j15 > 2147483647L) {
                                throw ParserException.a(null, "String element size: " + bVar2.f46565a);
                            }
                            int i30 = (int) j15;
                            if (i30 == 0) {
                                str = BuildConfig.VERSION_NAME;
                            } else {
                                byte[] bArr3 = new byte[i30];
                                nVar2.readFully(bArr3, 0, i30);
                                while (i30 > 0 && bArr3[i30 - 1] == 0) {
                                    i30--;
                                }
                                str = new String(bArr3, 0, i30);
                            }
                            d dVar6 = (d) qVar2.f43673b;
                            if (i28 == 134) {
                                dVar6.b(i28);
                                dVar6.f46631x.f46575c = str;
                            } else if (i28 == 17026) {
                                if (!"webm".equals(str) && !"matroska".equals(str)) {
                                    throw ParserException.a(null, "DocType " + str + " not supported");
                                }
                                dVar6.f46630w = str.equals("webm");
                            } else if (i28 == 21358) {
                                dVar6.b(i28);
                                dVar6.f46631x.f46574b = str;
                            } else if (i28 == 2274716) {
                                dVar6.b(i28);
                                dVar6.f46631x.Y = str;
                            }
                            z12 = false;
                            bVar2.f46566b = 0;
                        } else if (i11 == 4) {
                            qVar2.c(i28, (int) bVar2.f46565a, nVar2);
                            z12 = false;
                            bVar2.f46566b = 0;
                        } else {
                            if (i11 != 5) {
                                throw ParserException.a(null, "Invalid element type " + i11);
                            }
                            long j16 = bVar2.f46565a;
                            if (j16 != 4 && j16 != 8) {
                                throw ParserException.a(null, evRpcb.zxDrIdrqGkUz + bVar2.f46565a);
                            }
                            int i31 = (int) j16;
                            long jD = bVar2.d(nVar2, i31);
                            double dIntBitsToFloat = i31 == 4 ? Float.intBitsToFloat((int) jD) : Double.longBitsToDouble(jD);
                            d dVar7 = (d) qVar2.f43673b;
                            if (i28 == 181) {
                                dVar7.b(i28);
                                dVar7.f46631x.S = (int) dIntBitsToFloat;
                            } else if (i28 != 17545) {
                                switch (i28) {
                                    case 21969:
                                        dVar7.b(i28);
                                        dVar7.f46631x.F = (float) dIntBitsToFloat;
                                        break;
                                    case 21970:
                                        dVar7.b(i28);
                                        dVar7.f46631x.G = (float) dIntBitsToFloat;
                                        break;
                                    case 21971:
                                        dVar7.b(i28);
                                        dVar7.f46631x.H = (float) dIntBitsToFloat;
                                        break;
                                    case 21972:
                                        dVar7.b(i28);
                                        dVar7.f46631x.I = (float) dIntBitsToFloat;
                                        break;
                                    case 21973:
                                        dVar7.b(i28);
                                        dVar7.f46631x.J = (float) dIntBitsToFloat;
                                        break;
                                    case 21974:
                                        dVar7.b(i28);
                                        dVar7.f46631x.K = (float) dIntBitsToFloat;
                                        break;
                                    case 21975:
                                        dVar7.b(i28);
                                        dVar7.f46631x.L = (float) dIntBitsToFloat;
                                        break;
                                    case 21976:
                                        dVar7.b(i28);
                                        dVar7.f46631x.M = (float) dIntBitsToFloat;
                                        break;
                                    case 21977:
                                        dVar7.b(i28);
                                        dVar7.f46631x.N = (float) dIntBitsToFloat;
                                        break;
                                    case 21978:
                                        dVar7.b(i28);
                                        dVar7.f46631x.O = (float) dIntBitsToFloat;
                                        break;
                                    default:
                                        switch (i28) {
                                            case 30323:
                                                dVar7.b(i28);
                                                dVar7.f46631x.f46592u = (float) dIntBitsToFloat;
                                                break;
                                            case 30324:
                                                dVar7.b(i28);
                                                dVar7.f46631x.f46593v = (float) dIntBitsToFloat;
                                                break;
                                            case 30325:
                                                dVar7.b(i28);
                                                dVar7.f46631x.f46594w = (float) dIntBitsToFloat;
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                dVar7.f46628u = (long) dIntBitsToFloat;
                            }
                            z12 = false;
                            bVar2.f46566b = 0;
                        }
                    } else {
                        q qVar4 = (q) bVar2.f46571g;
                        int i32 = ((a) arrayDeque.pop()).f46563a;
                        d dVar8 = (d) qVar4.f43673b;
                        SparseArray sparseArray = dVar8.f46608c;
                        b7.a.k(dVar8.f46613e0);
                        if (i32 != 160) {
                            String str7 = wuoM.FKWYhkS;
                            if (i32 == 174) {
                                ?? r9 = dVar8.f46631x;
                                b7.a.k(r9);
                                String str8 = r9.f46575c;
                                if (str8 == null) {
                                    throw ParserException.a(null, "CodecId is missing in TrackEntry element");
                                }
                                switch (str8) {
                                    case "V_MPEG4/ISO/AP":
                                    case "V_MPEG4/ISO/SP":
                                    case "A_MS/ACM":
                                    case "A_TRUEHD":
                                    case "A_VORBIS":
                                    case "A_MPEG/L2":
                                    case "A_MPEG/L3":
                                    case "V_MS/VFW/FOURCC":
                                    case "S_DVBSUB":
                                    case "V_MPEG4/ISO/ASP":
                                    case "V_MPEG4/ISO/AVC":
                                    case "S_VOBSUB":
                                    case "A_DTS/LOSSLESS":
                                    case "A_AAC":
                                    case "A_AC3":
                                    case "A_DTS":
                                    case "V_AV1":
                                    case "V_VP8":
                                    case "V_VP9":
                                    case "S_HDMV/PGS":
                                    case "V_THEORA":
                                    case "A_DTS/EXPRESS":
                                    case "A_PCM/FLOAT/IEEE":
                                    case "A_PCM/INT/BIG":
                                    case "A_PCM/INT/LIT":
                                    case "S_TEXT/ASS":
                                    case "S_TEXT/SSA":
                                    case "V_MPEGH/ISO/HEVC":
                                    case "S_TEXT/WEBVTT":
                                    case "S_TEXT/UTF8":
                                    case "V_MPEG2":
                                    case "A_EAC3":
                                    case "A_FLAC":
                                    case "A_OPUS":
                                        x7.o oVar2 = dVar8.f46613e0;
                                        int i33 = r9.f46576d;
                                        switch (str8) {
                                            case "V_MPEG4/ISO/AP":
                                                b3 = 0;
                                                break;
                                            case "V_MPEG4/ISO/SP":
                                                b3 = 1;
                                                break;
                                            case "A_MS/ACM":
                                                b3 = 2;
                                                break;
                                            case "A_TRUEHD":
                                                b3 = 3;
                                                break;
                                            case "A_VORBIS":
                                                b3 = 4;
                                                break;
                                            case "A_MPEG/L2":
                                                b3 = 5;
                                                break;
                                            case "A_MPEG/L3":
                                                b3 = 6;
                                                break;
                                            case "V_MS/VFW/FOURCC":
                                                b3 = 7;
                                                break;
                                            case "S_DVBSUB":
                                                b3 = 8;
                                                break;
                                            case "V_MPEG4/ISO/ASP":
                                                b3 = 9;
                                                break;
                                            case "V_MPEG4/ISO/AVC":
                                                b3 = 10;
                                                break;
                                            case "S_VOBSUB":
                                                b3 = 11;
                                                break;
                                            case "A_DTS/LOSSLESS":
                                                b3 = 12;
                                                break;
                                            case "A_AAC":
                                                b3 = 13;
                                                break;
                                            case "A_AC3":
                                                b3 = 14;
                                                break;
                                            case "A_DTS":
                                                b3 = 15;
                                                break;
                                            case "V_AV1":
                                                b3 = 16;
                                                break;
                                            case "V_VP8":
                                                b3 = 17;
                                                break;
                                            case "V_VP9":
                                                b3 = 18;
                                                break;
                                            case "S_HDMV/PGS":
                                                b3 = 19;
                                                break;
                                            case "V_THEORA":
                                                b3 = 20;
                                                break;
                                            case "A_DTS/EXPRESS":
                                                b3 = 21;
                                                break;
                                            case "A_PCM/FLOAT/IEEE":
                                                b3 = 22;
                                                break;
                                            case "A_PCM/INT/BIG":
                                                b3 = 23;
                                                break;
                                            case "A_PCM/INT/LIT":
                                                b3 = 24;
                                                break;
                                            case "S_TEXT/ASS":
                                                b3 = 25;
                                                break;
                                            case "S_TEXT/SSA":
                                                b3 = 26;
                                                break;
                                            case "V_MPEGH/ISO/HEVC":
                                                b3 = 27;
                                                break;
                                            case "S_TEXT/WEBVTT":
                                                b3 = 28;
                                                break;
                                            case "S_TEXT/UTF8":
                                                b3 = 29;
                                                break;
                                            case "V_MPEG2":
                                                b3 = 30;
                                                break;
                                            case "A_EAC3":
                                                b3 = 31;
                                                break;
                                            case "A_FLAC":
                                                b3 = 32;
                                                break;
                                            case "A_OPUS":
                                                b3 = 33;
                                                break;
                                            default:
                                                b3 = -1;
                                                break;
                                        }
                                        String str9 = "video/x-unknown";
                                        String str10 = OYAvlbfUyD.fInRlCrKHBXHSeF;
                                        switch (b3) {
                                            case 0:
                                            case 1:
                                            case 9:
                                                dVar2 = dVar8;
                                                byte[] bArr4 = r9.f46584l;
                                                str9 = "video/mp4v-es";
                                                listSingletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                                iW = -1;
                                                i13 = -1;
                                                list = listSingletonList;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null && (aVarA = c7.a.a(new w(r9.P))) != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z15 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i34 = (z15 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16 || (i19 = r9.f46589r) == i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = (r9.f46586o * i17) / (r9.f46585n * i19);
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f || r9.G == -1.0f || r9.H == -1.0f || r9.I == -1.0f || r9.J == -1.0f || r9.K == -1.0f || r9.L == -1.0f || r9.M == -1.0f || r9.N == -1.0f || r9.O == -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            byte[] bArr5 = new byte[25];
                                                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                            byteBufferOrder.put((byte) 0);
                                                            byteBufferOrder.putShort((short) ((r9.F * 50000.0f) + 0.5f));
                                                            byteBufferOrder.putShort((short) ((r9.G * 50000.0f) + 0.5f));
                                                            byteBufferOrder.putShort((short) ((r9.H * 50000.0f) + 0.5f));
                                                            byteBufferOrder.putShort((short) ((r9.I * 50000.0f) + 0.5f));
                                                            byteBufferOrder.putShort((short) ((r9.J * 50000.0f) + 0.5f));
                                                            byteBufferOrder.putShort((short) ((r9.K * 50000.0f) + 0.5f));
                                                            byteBufferOrder.putShort((short) ((r9.L * 50000.0f) + 0.5f));
                                                            byteBufferOrder.putShort((short) ((r9.M * 50000.0f) + 0.5f));
                                                            byteBufferOrder.putShort((short) (r9.N + 0.5f));
                                                            byteBufferOrder.putShort((short) (r9.O + 0.5f));
                                                            byteBufferOrder.putShort((short) r9.D);
                                                            byteBufferOrder.putShort((short) r9.E);
                                                            bArr = bArr5;
                                                        }
                                                        int i35 = r9.A;
                                                        int i36 = r9.C;
                                                        int i37 = r9.B;
                                                        int i38 = r9.f46587p;
                                                        gVar = new g(i35, i36, i37, i38, i38, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null && map.containsKey(str4)) {
                                                        iIntValue = ((Integer) map.get(r9.f46574b)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0 || Float.compare(r9.f46592u, CropImageView.DEFAULT_ASPECT_RATIO) != 0 || Float.compare(r9.f46593v, CropImageView.DEFAULT_ASPECT_RATIO) != 0) {
                                                        i18 = iIntValue;
                                                    } else if (Float.compare(r9.f46594w, CropImageView.DEFAULT_ASPECT_RATIO) == 0) {
                                                        i18 = 0;
                                                    } else if (Float.compare(r9.f46594w, 90.0f) == 0) {
                                                        i18 = 90;
                                                    } else if (Float.compare(r9.f46594w, -180.0f) == 0 || Float.compare(r9.f46594w, 180.0f) == 0) {
                                                        i18 = AchievementLevelType.DAY_STREAK_LV_8;
                                                    } else if (Float.compare(r9.f46594w, -90.0f) == 0) {
                                                        i18 = 270;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9) && !"text/x-ssa".equals(str9) && !"text/vtt".equals(str9) && !"application/vobsub".equals(str9) && !"application/pgs".equals(str9) && !"application/dvbsubs".equals(str9)) {
                                                        throw ParserException.a(null, "Unexpected MIME type.");
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null && !map.containsKey(str5)) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i34;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar = new p(oVar);
                                                e0 e0VarV = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV;
                                                e0VarV.b(pVar);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 2:
                                                dVar2 = dVar8;
                                                w wVar = new w(r9.a(r9.f46575c));
                                                try {
                                                    int iP = wVar.p();
                                                    if (iP != 1) {
                                                        if (iP == 65534) {
                                                            wVar.I(24);
                                                            long jQ = wVar.q();
                                                            UUID uuid = f46602j0;
                                                            if (jQ != uuid.getMostSignificantBits() || wVar.q() != uuid.getLeastSignificantBits()) {
                                                            }
                                                            str9 = str10;
                                                            iW = -1;
                                                            i13 = -1;
                                                            list = null;
                                                            str2 = null;
                                                            list5 = list;
                                                            if (r9.P != null) {
                                                                str2 = aVarA.f6641a;
                                                                str9 = "video/dolby-vision";
                                                            }
                                                            boolean z16 = r9.X;
                                                            if (r9.W) {
                                                                i14 = 2;
                                                            } else {
                                                                i14 = 0;
                                                            }
                                                            int i39 = (z16 ? 1 : 0) | i14;
                                                            oVar = new y6.o();
                                                            zK = d0.k(str9);
                                                            Map map2 = f46603k0;
                                                            if (zK) {
                                                                oVar.E = r9.Q;
                                                                oVar.F = r9.S;
                                                                oVar.G = iW;
                                                                i15 = 1;
                                                            } else if (d0.n(str9)) {
                                                                if (r9.f46590s == 0) {
                                                                    i21 = r9.f46588q;
                                                                    i16 = -1;
                                                                    if (i21 == -1) {
                                                                        i21 = r9.f46585n;
                                                                    }
                                                                    r9.f46588q = i21;
                                                                    i22 = r9.f46589r;
                                                                    if (i22 == -1) {
                                                                        i22 = r9.f46586o;
                                                                    }
                                                                    r9.f46589r = i22;
                                                                } else {
                                                                    i16 = -1;
                                                                }
                                                                i17 = r9.f46588q;
                                                                if (i17 != i16) {
                                                                    f5 = -1.0f;
                                                                } else {
                                                                    f5 = -1.0f;
                                                                }
                                                                if (r9.f46597z) {
                                                                    if (r9.F != -1.0f) {
                                                                        bArr = null;
                                                                    } else {
                                                                        bArr = null;
                                                                    }
                                                                    int i310 = r9.A;
                                                                    int i311 = r9.C;
                                                                    int i312 = r9.B;
                                                                    int i313 = r9.f46587p;
                                                                    gVar = new g(i310, i311, i312, i313, i313, bArr);
                                                                } else {
                                                                    gVar = null;
                                                                }
                                                                str4 = r9.f46574b;
                                                                if (str4 == null) {
                                                                    iIntValue = -1;
                                                                } else {
                                                                    iIntValue = -1;
                                                                }
                                                                if (r9.f46591t == 0) {
                                                                    i18 = iIntValue;
                                                                } else {
                                                                    i18 = iIntValue;
                                                                }
                                                                oVar.f57271t = r9.f46585n;
                                                                oVar.f57272u = r9.f46586o;
                                                                oVar.f57277z = f5;
                                                                oVar.f57276y = i18;
                                                                oVar.A = r9.f46595x;
                                                                oVar.B = r9.f46596y;
                                                                oVar.C = gVar;
                                                                i15 = 2;
                                                            } else {
                                                                if ("application/x-subrip".equals(str9)) {
                                                                }
                                                                i15 = 3;
                                                            }
                                                            str5 = r9.f46574b;
                                                            if (str5 != null) {
                                                                oVar.f57254b = r9.f46574b;
                                                            }
                                                            oVar.f57253a = Integer.toString(i33);
                                                            if (r9.f46572a) {
                                                                str6 = str7;
                                                            } else {
                                                                str6 = "video/x-matroska";
                                                            }
                                                            oVar.f57264l = d0.o(str6);
                                                            oVar.m = d0.o(str9);
                                                            oVar.f57265n = i13;
                                                            oVar.f57256d = r9.Y;
                                                            oVar.f57257e = i39;
                                                            oVar.f57267p = list5;
                                                            oVar.f57262j = str2;
                                                            oVar.f57268q = r9.m;
                                                            p pVar2 = new p(oVar);
                                                            e0 e0VarV2 = oVar2.v(r9.f46576d, i15);
                                                            r9.Z = e0VarV2;
                                                            e0VarV2.b(pVar2);
                                                            sparseArray.put(r9.f46576d, r9);
                                                            dVar8 = dVar2;
                                                        }
                                                        b7.a.B("Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                        str9 = str10;
                                                        iW = -1;
                                                        i13 = -1;
                                                        list = null;
                                                        str2 = null;
                                                        list5 = list;
                                                        if (r9.P != null) {
                                                            str2 = aVarA.f6641a;
                                                            str9 = "video/dolby-vision";
                                                        }
                                                        boolean z17 = r9.X;
                                                        if (r9.W) {
                                                            i14 = 2;
                                                        } else {
                                                            i14 = 0;
                                                        }
                                                        int i314 = (z17 ? 1 : 0) | i14;
                                                        oVar = new y6.o();
                                                        zK = d0.k(str9);
                                                        Map map3 = f46603k0;
                                                        if (zK) {
                                                            oVar.E = r9.Q;
                                                            oVar.F = r9.S;
                                                            oVar.G = iW;
                                                            i15 = 1;
                                                        } else if (d0.n(str9)) {
                                                            if (r9.f46590s == 0) {
                                                                i21 = r9.f46588q;
                                                                i16 = -1;
                                                                if (i21 == -1) {
                                                                    i21 = r9.f46585n;
                                                                }
                                                                r9.f46588q = i21;
                                                                i22 = r9.f46589r;
                                                                if (i22 == -1) {
                                                                    i22 = r9.f46586o;
                                                                }
                                                                r9.f46589r = i22;
                                                            } else {
                                                                i16 = -1;
                                                            }
                                                            i17 = r9.f46588q;
                                                            if (i17 != i16) {
                                                                f5 = -1.0f;
                                                            } else {
                                                                f5 = -1.0f;
                                                            }
                                                            if (r9.f46597z) {
                                                                if (r9.F != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                int i315 = r9.A;
                                                                int i316 = r9.C;
                                                                int i317 = r9.B;
                                                                int i318 = r9.f46587p;
                                                                gVar = new g(i315, i316, i317, i318, i318, bArr);
                                                            } else {
                                                                gVar = null;
                                                            }
                                                            str4 = r9.f46574b;
                                                            if (str4 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (r9.f46591t == 0) {
                                                                i18 = iIntValue;
                                                            } else {
                                                                i18 = iIntValue;
                                                            }
                                                            oVar.f57271t = r9.f46585n;
                                                            oVar.f57272u = r9.f46586o;
                                                            oVar.f57277z = f5;
                                                            oVar.f57276y = i18;
                                                            oVar.A = r9.f46595x;
                                                            oVar.B = r9.f46596y;
                                                            oVar.C = gVar;
                                                            i15 = 2;
                                                        } else {
                                                            if ("application/x-subrip".equals(str9)) {
                                                            }
                                                            i15 = 3;
                                                        }
                                                        str5 = r9.f46574b;
                                                        if (str5 != null) {
                                                            oVar.f57254b = r9.f46574b;
                                                        }
                                                        oVar.f57253a = Integer.toString(i33);
                                                        if (r9.f46572a) {
                                                            str6 = str7;
                                                        } else {
                                                            str6 = "video/x-matroska";
                                                        }
                                                        oVar.f57264l = d0.o(str6);
                                                        oVar.m = d0.o(str9);
                                                        oVar.f57265n = i13;
                                                        oVar.f57256d = r9.Y;
                                                        oVar.f57257e = i314;
                                                        oVar.f57267p = list5;
                                                        oVar.f57262j = str2;
                                                        oVar.f57268q = r9.m;
                                                        p pVar3 = new p(oVar);
                                                        e0 e0VarV3 = oVar2.v(r9.f46576d, i15);
                                                        r9.Z = e0VarV3;
                                                        e0VarV3.b(pVar3);
                                                        sparseArray.put(r9.f46576d, r9);
                                                        dVar8 = dVar2;
                                                        break;
                                                    }
                                                    int i40 = r9.R;
                                                    String str11 = f0.f3975a;
                                                    iW = f0.w(i40, ByteOrder.LITTLE_ENDIAN);
                                                    if (iW == 0) {
                                                        b7.a.B("Unsupported PCM bit depth: " + r9.R + ". Setting mimeType to audio/x-unknown");
                                                        str9 = str10;
                                                        iW = -1;
                                                    } else {
                                                        str9 = "audio/raw";
                                                    }
                                                    i13 = -1;
                                                    list = null;
                                                    str2 = null;
                                                    list5 = list;
                                                    if (r9.P != null) {
                                                        str2 = aVarA.f6641a;
                                                        str9 = "video/dolby-vision";
                                                    }
                                                    boolean z18 = r9.X;
                                                    if (r9.W) {
                                                        i14 = 2;
                                                    } else {
                                                        i14 = 0;
                                                    }
                                                    int i319 = (z18 ? 1 : 0) | i14;
                                                    oVar = new y6.o();
                                                    zK = d0.k(str9);
                                                    Map map4 = f46603k0;
                                                    if (zK) {
                                                        oVar.E = r9.Q;
                                                        oVar.F = r9.S;
                                                        oVar.G = iW;
                                                        i15 = 1;
                                                    } else if (d0.n(str9)) {
                                                        if (r9.f46590s == 0) {
                                                            i21 = r9.f46588q;
                                                            i16 = -1;
                                                            if (i21 == -1) {
                                                                i21 = r9.f46585n;
                                                            }
                                                            r9.f46588q = i21;
                                                            i22 = r9.f46589r;
                                                            if (i22 == -1) {
                                                                i22 = r9.f46586o;
                                                            }
                                                            r9.f46589r = i22;
                                                        } else {
                                                            i16 = -1;
                                                        }
                                                        i17 = r9.f46588q;
                                                        if (i17 != i16) {
                                                            f5 = -1.0f;
                                                        } else {
                                                            f5 = -1.0f;
                                                        }
                                                        if (r9.f46597z) {
                                                            if (r9.F != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i3110 = r9.A;
                                                            int i3111 = r9.C;
                                                            int i3112 = r9.B;
                                                            int i3113 = r9.f46587p;
                                                            gVar = new g(i3110, i3111, i3112, i3113, i3113, bArr);
                                                        } else {
                                                            gVar = null;
                                                        }
                                                        str4 = r9.f46574b;
                                                        if (str4 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (r9.f46591t == 0) {
                                                            i18 = iIntValue;
                                                        } else {
                                                            i18 = iIntValue;
                                                        }
                                                        oVar.f57271t = r9.f46585n;
                                                        oVar.f57272u = r9.f46586o;
                                                        oVar.f57277z = f5;
                                                        oVar.f57276y = i18;
                                                        oVar.A = r9.f46595x;
                                                        oVar.B = r9.f46596y;
                                                        oVar.C = gVar;
                                                        i15 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str9)) {
                                                        }
                                                        i15 = 3;
                                                    }
                                                    str5 = r9.f46574b;
                                                    if (str5 != null) {
                                                        oVar.f57254b = r9.f46574b;
                                                    }
                                                    oVar.f57253a = Integer.toString(i33);
                                                    if (r9.f46572a) {
                                                        str6 = str7;
                                                    } else {
                                                        str6 = "video/x-matroska";
                                                    }
                                                    oVar.f57264l = d0.o(str6);
                                                    oVar.m = d0.o(str9);
                                                    oVar.f57265n = i13;
                                                    oVar.f57256d = r9.Y;
                                                    oVar.f57257e = i319;
                                                    oVar.f57267p = list5;
                                                    oVar.f57262j = str2;
                                                    oVar.f57268q = r9.m;
                                                    p pVar4 = new p(oVar);
                                                    e0 e0VarV4 = oVar2.v(r9.f46576d, i15);
                                                    r9.Z = e0VarV4;
                                                    e0VarV4.b(pVar4);
                                                    sparseArray.put(r9.f46576d, r9);
                                                    dVar8 = dVar2;
                                                } catch (ArrayIndexOutOfBoundsException unused) {
                                                    throw ParserException.a(null, "Error parsing MS/ACM codec private");
                                                }
                                                break;
                                            case 3:
                                                dVar2 = dVar8;
                                                r9.V = new x7.f0();
                                                str9 = "audio/true-hd";
                                                iW = -1;
                                                i13 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z19 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i3114 = (z19 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map5 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i3115 = r9.A;
                                                        int i3116 = r9.C;
                                                        int i3117 = r9.B;
                                                        int i3118 = r9.f46587p;
                                                        gVar = new g(i3115, i3116, i3117, i3118, i3118, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i3114;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar5 = new p(oVar);
                                                e0 e0VarV5 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV5;
                                                e0VarV5.b(pVar5);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 4:
                                                byte[] bArrA = r9.a(str8);
                                                try {
                                                    try {
                                                        if (bArrA[0] != 2) {
                                                            throw ParserException.a(null, "Error parsing vorbis codec private");
                                                        }
                                                        int i41 = 0;
                                                        int i42 = 1;
                                                        while (true) {
                                                            int i43 = bArrA[i42] & 255;
                                                            if (i43 != 255) {
                                                                int i44 = i42 + 1;
                                                                int i45 = i41 + i43;
                                                                dVar2 = dVar8;
                                                                int i46 = 0;
                                                                while (true) {
                                                                    int i47 = bArrA[i44] & 255;
                                                                    if (i47 != 255) {
                                                                        int i48 = i44 + 1;
                                                                        int i49 = i46 + i47;
                                                                        if (bArrA[i48] != 1) {
                                                                            throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                        }
                                                                        byte[] bArr6 = new byte[i45];
                                                                        System.arraycopy(bArrA, i48, bArr6, 0, i45);
                                                                        int i50 = i48 + i45;
                                                                        if (bArrA[i50] != 3) {
                                                                            throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                        }
                                                                        int i51 = i50 + i49;
                                                                        if (bArrA[i51] != 5) {
                                                                            throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                        }
                                                                        byte[] bArr7 = new byte[bArrA.length - i51];
                                                                        System.arraycopy(bArrA, i51, bArr7, 0, bArrA.length - i51);
                                                                        ArrayList arrayList = new ArrayList(2);
                                                                        arrayList.add(bArr6);
                                                                        arrayList.add(bArr7);
                                                                        str9 = "audio/vorbis";
                                                                        i13 = OSSConstants.DEFAULT_BUFFER_SIZE;
                                                                        list = arrayList;
                                                                        iW = -1;
                                                                        str2 = null;
                                                                        list5 = list;
                                                                        if (r9.P != null) {
                                                                            str2 = aVarA.f6641a;
                                                                            str9 = "video/dolby-vision";
                                                                        }
                                                                        boolean z110 = r9.X;
                                                                        if (r9.W) {
                                                                            i14 = 2;
                                                                        } else {
                                                                            i14 = 0;
                                                                        }
                                                                        int i3119 = (z110 ? 1 : 0) | i14;
                                                                        oVar = new y6.o();
                                                                        zK = d0.k(str9);
                                                                        Map map6 = f46603k0;
                                                                        if (zK) {
                                                                            oVar.E = r9.Q;
                                                                            oVar.F = r9.S;
                                                                            oVar.G = iW;
                                                                            i15 = 1;
                                                                        } else if (d0.n(str9)) {
                                                                            if (r9.f46590s == 0) {
                                                                                i21 = r9.f46588q;
                                                                                i16 = -1;
                                                                                if (i21 == -1) {
                                                                                    i21 = r9.f46585n;
                                                                                }
                                                                                r9.f46588q = i21;
                                                                                i22 = r9.f46589r;
                                                                                if (i22 == -1) {
                                                                                    i22 = r9.f46586o;
                                                                                }
                                                                                r9.f46589r = i22;
                                                                            } else {
                                                                                i16 = -1;
                                                                            }
                                                                            i17 = r9.f46588q;
                                                                            if (i17 != i16) {
                                                                                f5 = -1.0f;
                                                                            } else {
                                                                                f5 = -1.0f;
                                                                            }
                                                                            if (r9.f46597z) {
                                                                                if (r9.F != -1.0f) {
                                                                                    bArr = null;
                                                                                } else {
                                                                                    bArr = null;
                                                                                }
                                                                                int i31110 = r9.A;
                                                                                int i31111 = r9.C;
                                                                                int i31112 = r9.B;
                                                                                int i31113 = r9.f46587p;
                                                                                gVar = new g(i31110, i31111, i31112, i31113, i31113, bArr);
                                                                            } else {
                                                                                gVar = null;
                                                                            }
                                                                            str4 = r9.f46574b;
                                                                            if (str4 == null) {
                                                                                iIntValue = -1;
                                                                            } else {
                                                                                iIntValue = -1;
                                                                            }
                                                                            if (r9.f46591t == 0) {
                                                                                i18 = iIntValue;
                                                                            } else {
                                                                                i18 = iIntValue;
                                                                            }
                                                                            oVar.f57271t = r9.f46585n;
                                                                            oVar.f57272u = r9.f46586o;
                                                                            oVar.f57277z = f5;
                                                                            oVar.f57276y = i18;
                                                                            oVar.A = r9.f46595x;
                                                                            oVar.B = r9.f46596y;
                                                                            oVar.C = gVar;
                                                                            i15 = 2;
                                                                        } else {
                                                                            if ("application/x-subrip".equals(str9)) {
                                                                            }
                                                                            i15 = 3;
                                                                        }
                                                                        str5 = r9.f46574b;
                                                                        if (str5 != null) {
                                                                            oVar.f57254b = r9.f46574b;
                                                                        }
                                                                        oVar.f57253a = Integer.toString(i33);
                                                                        if (r9.f46572a) {
                                                                            str6 = str7;
                                                                        } else {
                                                                            str6 = "video/x-matroska";
                                                                        }
                                                                        oVar.f57264l = d0.o(str6);
                                                                        oVar.m = d0.o(str9);
                                                                        oVar.f57265n = i13;
                                                                        oVar.f57256d = r9.Y;
                                                                        oVar.f57257e = i3119;
                                                                        oVar.f57267p = list5;
                                                                        oVar.f57262j = str2;
                                                                        oVar.f57268q = r9.m;
                                                                        p pVar6 = new p(oVar);
                                                                        e0 e0VarV6 = oVar2.v(r9.f46576d, i15);
                                                                        r9.Z = e0VarV6;
                                                                        e0VarV6.b(pVar6);
                                                                        sparseArray.put(r9.f46576d, r9);
                                                                        dVar8 = dVar2;
                                                                    } else {
                                                                        i46 += 255;
                                                                        i44++;
                                                                    }
                                                                }
                                                            } else {
                                                                i41 += 255;
                                                                i42++;
                                                            }
                                                        }
                                                    } catch (ArrayIndexOutOfBoundsException unused2) {
                                                        throw ParserException.a(r9, "Error parsing vorbis codec private");
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused3) {
                                                    r9 = 0;
                                                }
                                                break;
                                            case 5:
                                                str9 = "audio/mpeg-L2";
                                                dVar2 = dVar8;
                                                iW = -1;
                                                i13 = 4096;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z111 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i31114 = (z111 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map7 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i31115 = r9.A;
                                                        int i31116 = r9.C;
                                                        int i31117 = r9.B;
                                                        int i31118 = r9.f46587p;
                                                        gVar = new g(i31115, i31116, i31117, i31118, i31118, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i31114;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar7 = new p(oVar);
                                                e0 e0VarV7 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV7;
                                                e0VarV7.b(pVar7);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 6:
                                                str9 = "audio/mpeg";
                                                dVar2 = dVar8;
                                                iW = -1;
                                                i13 = 4096;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z112 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i31119 = (z112 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map8 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i311110 = r9.A;
                                                        int i311111 = r9.C;
                                                        int i311112 = r9.B;
                                                        int i311113 = r9.f46587p;
                                                        gVar = new g(i311110, i311111, i311112, i311113, i311113, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i31119;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar8 = new p(oVar);
                                                e0 e0VarV8 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV8;
                                                e0VarV8.b(pVar8);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 7:
                                                w wVar2 = new w(r9.a(r9.f46575c));
                                                try {
                                                    wVar2.J(16);
                                                    long jN = wVar2.n();
                                                    if (jN == 1482049860) {
                                                        runtimeException = null;
                                                        try {
                                                            pair = new Pair("video/divx", null);
                                                            str2 = null;
                                                        } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        }
                                                    } else {
                                                        if (jN == 859189832) {
                                                            pair = new Pair("video/3gpp", null);
                                                        } else {
                                                            if (jN == 826496599) {
                                                                int i52 = wVar2.f4040b + 20;
                                                                byte[] bArr8 = wVar2.f4039a;
                                                                while (true) {
                                                                    if (i52 < bArr8.length - 4) {
                                                                        if (bArr8[i52] == 0 && bArr8[i52 + 1] == 0 && bArr8[i52 + 2] == 1) {
                                                                            if (bArr8[i52 + 3] == 15) {
                                                                                pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i52, bArr8.length)));
                                                                            }
                                                                        }
                                                                        i52++;
                                                                    } else {
                                                                        try {
                                                                            throw ParserException.a(null, "Failed to find FourCC VC1 initialization data");
                                                                        } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                            runtimeException = null;
                                                                        }
                                                                    }
                                                                    throw ParserException.a(runtimeException, "Error parsing FourCC private data");
                                                                }
                                                            }
                                                            b7.a.B("Unknown FourCC. Setting mimeType to video/x-unknown");
                                                            str2 = null;
                                                            pair = new Pair("video/x-unknown", null);
                                                        }
                                                        str2 = null;
                                                    }
                                                    str9 = (String) pair.first;
                                                    dVar2 = dVar8;
                                                    list2 = (List) pair.second;
                                                    iW = -1;
                                                    i13 = -1;
                                                    list5 = list2;
                                                    if (r9.P != null) {
                                                        str2 = aVarA.f6641a;
                                                        str9 = "video/dolby-vision";
                                                    }
                                                    boolean z113 = r9.X;
                                                    if (r9.W) {
                                                        i14 = 2;
                                                    } else {
                                                        i14 = 0;
                                                    }
                                                    int i311114 = (z113 ? 1 : 0) | i14;
                                                    oVar = new y6.o();
                                                    zK = d0.k(str9);
                                                    Map map9 = f46603k0;
                                                    if (zK) {
                                                        oVar.E = r9.Q;
                                                        oVar.F = r9.S;
                                                        oVar.G = iW;
                                                        i15 = 1;
                                                    } else if (d0.n(str9)) {
                                                        if (r9.f46590s == 0) {
                                                            i21 = r9.f46588q;
                                                            i16 = -1;
                                                            if (i21 == -1) {
                                                                i21 = r9.f46585n;
                                                            }
                                                            r9.f46588q = i21;
                                                            i22 = r9.f46589r;
                                                            if (i22 == -1) {
                                                                i22 = r9.f46586o;
                                                            }
                                                            r9.f46589r = i22;
                                                        } else {
                                                            i16 = -1;
                                                        }
                                                        i17 = r9.f46588q;
                                                        if (i17 != i16) {
                                                            f5 = -1.0f;
                                                        } else {
                                                            f5 = -1.0f;
                                                        }
                                                        if (r9.f46597z) {
                                                            if (r9.F != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i311115 = r9.A;
                                                            int i311116 = r9.C;
                                                            int i311117 = r9.B;
                                                            int i311118 = r9.f46587p;
                                                            gVar = new g(i311115, i311116, i311117, i311118, i311118, bArr);
                                                        } else {
                                                            gVar = null;
                                                        }
                                                        str4 = r9.f46574b;
                                                        if (str4 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (r9.f46591t == 0) {
                                                            i18 = iIntValue;
                                                        } else {
                                                            i18 = iIntValue;
                                                        }
                                                        oVar.f57271t = r9.f46585n;
                                                        oVar.f57272u = r9.f46586o;
                                                        oVar.f57277z = f5;
                                                        oVar.f57276y = i18;
                                                        oVar.A = r9.f46595x;
                                                        oVar.B = r9.f46596y;
                                                        oVar.C = gVar;
                                                        i15 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str9)) {
                                                        }
                                                        i15 = 3;
                                                    }
                                                    str5 = r9.f46574b;
                                                    if (str5 != null) {
                                                        oVar.f57254b = r9.f46574b;
                                                    }
                                                    oVar.f57253a = Integer.toString(i33);
                                                    if (r9.f46572a) {
                                                        str6 = str7;
                                                    } else {
                                                        str6 = "video/x-matroska";
                                                    }
                                                    oVar.f57264l = d0.o(str6);
                                                    oVar.m = d0.o(str9);
                                                    oVar.f57265n = i13;
                                                    oVar.f57256d = r9.Y;
                                                    oVar.f57257e = i311114;
                                                    oVar.f57267p = list5;
                                                    oVar.f57262j = str2;
                                                    oVar.f57268q = r9.m;
                                                    p pVar9 = new p(oVar);
                                                    e0 e0VarV9 = oVar2.v(r9.f46576d, i15);
                                                    r9.Z = e0VarV9;
                                                    e0VarV9.b(pVar9);
                                                    sparseArray.put(r9.f46576d, r9);
                                                    dVar8 = dVar2;
                                                } catch (ArrayIndexOutOfBoundsException unused6) {
                                                    runtimeException = null;
                                                }
                                                break;
                                            case 8:
                                                byte[] bArr9 = new byte[4];
                                                System.arraycopy(r9.a(str8), 0, bArr9, 0, 4);
                                                listSingletonList = ImmutableList.u(bArr9);
                                                dVar2 = dVar8;
                                                str9 = "application/dvbsubs";
                                                iW = -1;
                                                i13 = -1;
                                                list = listSingletonList;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z114 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i311119 = (z114 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map10 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i3111110 = r9.A;
                                                        int i3111111 = r9.C;
                                                        int i3111112 = r9.B;
                                                        int i3111113 = r9.f46587p;
                                                        gVar = new g(i3111110, i3111111, i3111112, i3111113, i3111113, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i311119;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar10 = new p(oVar);
                                                e0 e0VarV10 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV10;
                                                e0VarV10.b(pVar10);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 10:
                                                x7.c cVarA = x7.c.a(new w(r9.a(r9.f46575c)));
                                                ArrayList arrayList2 = cVarA.f55851a;
                                                r9.f46573a0 = cVarA.f55852b;
                                                str3 = cVarA.f55862l;
                                                str9 = "video/avc";
                                                list4 = arrayList2;
                                                str2 = str3;
                                                dVar2 = dVar8;
                                                list2 = list4;
                                                iW = -1;
                                                i13 = -1;
                                                list5 = list2;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z115 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i3111114 = (z115 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map11 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i3111115 = r9.A;
                                                        int i3111116 = r9.C;
                                                        int i3111117 = r9.B;
                                                        int i3111118 = r9.f46587p;
                                                        gVar = new g(i3111115, i3111116, i3111117, i3111118, i3111118, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i3111114;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar11 = new p(oVar);
                                                e0 e0VarV11 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV11;
                                                e0VarV11.b(pVar11);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 11:
                                                listSingletonList = ImmutableList.u(r9.a(str8));
                                                dVar2 = dVar8;
                                                str9 = "application/vobsub";
                                                iW = -1;
                                                i13 = -1;
                                                list = listSingletonList;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z116 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i3111119 = (z116 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map12 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i31111110 = r9.A;
                                                        int i31111111 = r9.C;
                                                        int i31111112 = r9.B;
                                                        int i31111113 = r9.f46587p;
                                                        gVar = new g(i31111110, i31111111, i31111112, i31111113, i31111113, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i3111119;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar12 = new p(oVar);
                                                e0 e0VarV12 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV12;
                                                e0VarV12.b(pVar12);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 12:
                                                str9 = "audio/vnd.dts.hd";
                                                dVar2 = dVar8;
                                                iW = -1;
                                                i13 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z117 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i31111114 = (z117 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map13 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i31111115 = r9.A;
                                                        int i31111116 = r9.C;
                                                        int i31111117 = r9.B;
                                                        int i31111118 = r9.f46587p;
                                                        gVar = new g(i31111115, i31111116, i31111117, i31111118, i31111118, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i31111114;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar13 = new p(oVar);
                                                e0 e0VarV13 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV13;
                                                e0VarV13.b(pVar13);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 13:
                                                List listSingletonList2 = Collections.singletonList(r9.a(str8));
                                                byte[] bArr10 = r9.f46584l;
                                                com.android.billingclient.api.i iVarN = x7.a.n(new v(bArr10, bArr10.length), false);
                                                r9.S = iVarN.f7515a;
                                                r9.Q = iVarN.f7516b;
                                                str9 = "audio/mp4a-latm";
                                                dVar2 = dVar8;
                                                str2 = iVarN.f7517c;
                                                i13 = -1;
                                                list3 = listSingletonList2;
                                                iW = -1;
                                                list5 = list3;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z118 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i31111119 = (z118 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map14 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i311111110 = r9.A;
                                                        int i311111111 = r9.C;
                                                        int i311111112 = r9.B;
                                                        int i311111113 = r9.f46587p;
                                                        gVar = new g(i311111110, i311111111, i311111112, i311111113, i311111113, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i31111119;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar14 = new p(oVar);
                                                e0 e0VarV14 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV14;
                                                e0VarV14.b(pVar14);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 14:
                                                str9 = "audio/ac3";
                                                dVar2 = dVar8;
                                                iW = -1;
                                                i13 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z119 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i311111114 = (z119 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map15 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i311111115 = r9.A;
                                                        int i311111116 = r9.C;
                                                        int i311111117 = r9.B;
                                                        int i311111118 = r9.f46587p;
                                                        gVar = new g(i311111115, i311111116, i311111117, i311111118, i311111118, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i311111114;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar15 = new p(oVar);
                                                e0 e0VarV15 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV15;
                                                e0VarV15.b(pVar15);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 15:
                                            case 21:
                                                str9 = "audio/vnd.dts";
                                                dVar2 = dVar8;
                                                iW = -1;
                                                i13 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z1110 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i311111119 = (z1110 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map16 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i3111111110 = r9.A;
                                                        int i3111111111 = r9.C;
                                                        int i3111111112 = r9.B;
                                                        int i3111111113 = r9.f46587p;
                                                        gVar = new g(i3111111110, i3111111111, i3111111112, i3111111113, i3111111113, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i311111119;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar16 = new p(oVar);
                                                e0 e0VarV16 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV16;
                                                e0VarV16.b(pVar16);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 16:
                                                byte[] bArr11 = r9.f46584l;
                                                listU = bArr11 == null ? null : ImmutableList.u(bArr11);
                                                str9 = "video/av01";
                                                listSingletonList = listU;
                                                dVar2 = dVar8;
                                                iW = -1;
                                                i13 = -1;
                                                list = listSingletonList;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z1111 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i3111111114 = (z1111 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map17 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i3111111115 = r9.A;
                                                        int i3111111116 = r9.C;
                                                        int i3111111117 = r9.B;
                                                        int i3111111118 = r9.f46587p;
                                                        gVar = new g(i3111111115, i3111111116, i3111111117, i3111111118, i3111111118, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i3111111114;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar17 = new p(oVar);
                                                e0 e0VarV17 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV17;
                                                e0VarV17.b(pVar17);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 17:
                                                str9 = "video/x-vnd.on2.vp8";
                                                dVar2 = dVar8;
                                                iW = -1;
                                                i13 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z1112 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i3111111119 = (z1112 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map18 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i31111111110 = r9.A;
                                                        int i31111111111 = r9.C;
                                                        int i31111111112 = r9.B;
                                                        int i31111111113 = r9.f46587p;
                                                        gVar = new g(i31111111110, i31111111111, i31111111112, i31111111113, i31111111113, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i3111111119;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar18 = new p(oVar);
                                                e0 e0VarV18 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV18;
                                                e0VarV18.b(pVar18);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 18:
                                                byte[] bArr12 = r9.f46584l;
                                                listU = bArr12 == null ? null : ImmutableList.u(bArr12);
                                                str9 = "video/x-vnd.on2.vp9";
                                                listSingletonList = listU;
                                                dVar2 = dVar8;
                                                iW = -1;
                                                i13 = -1;
                                                list = listSingletonList;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z1113 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i31111111114 = (z1113 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map19 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i31111111115 = r9.A;
                                                        int i31111111116 = r9.C;
                                                        int i31111111117 = r9.B;
                                                        int i31111111118 = r9.f46587p;
                                                        gVar = new g(i31111111115, i31111111116, i31111111117, i31111111118, i31111111118, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i31111111114;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar19 = new p(oVar);
                                                e0 e0VarV19 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV19;
                                                e0VarV19.b(pVar19);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 19:
                                                dVar2 = dVar8;
                                                str9 = "application/pgs";
                                                iW = -1;
                                                i13 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z1114 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i31111111119 = (z1114 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map110 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i311111111110 = r9.A;
                                                        int i311111111111 = r9.C;
                                                        int i311111111112 = r9.B;
                                                        int i311111111113 = r9.f46587p;
                                                        gVar = new g(i311111111110, i311111111111, i311111111112, i311111111113, i311111111113, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i31111111119;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar110 = new p(oVar);
                                                e0 e0VarV110 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV110;
                                                e0VarV110.b(pVar110);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 20:
                                                dVar2 = dVar8;
                                                iW = -1;
                                                i13 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z1115 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i311111111114 = (z1115 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map111 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i311111111115 = r9.A;
                                                        int i311111111116 = r9.C;
                                                        int i311111111117 = r9.B;
                                                        int i311111111118 = r9.f46587p;
                                                        gVar = new g(i311111111115, i311111111116, i311111111117, i311111111118, i311111111118, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i311111111114;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar111 = new p(oVar);
                                                e0 e0VarV111 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV111;
                                                e0VarV111.b(pVar111);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 22:
                                                dVar3 = dVar8;
                                                if (r9.R == 32) {
                                                    dVar2 = dVar3;
                                                    str9 = "audio/raw";
                                                    iW = 4;
                                                } else {
                                                    b7.a.B("Unsupported floating point PCM bit depth: " + r9.R + ". Setting mimeType to audio/x-unknown");
                                                    dVar2 = dVar3;
                                                    str9 = str10;
                                                    iW = -1;
                                                }
                                                i13 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z1116 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i311111111119 = (z1116 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map112 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i3111111111110 = r9.A;
                                                        int i3111111111111 = r9.C;
                                                        int i3111111111112 = r9.B;
                                                        int i3111111111113 = r9.f46587p;
                                                        gVar = new g(i3111111111110, i3111111111111, i3111111111112, i3111111111113, i3111111111113, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i311111111119;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar112 = new p(oVar);
                                                e0 e0VarV112 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV112;
                                                e0VarV112.b(pVar112);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 23:
                                                dVar3 = dVar8;
                                                int i53 = r9.R;
                                                if (i53 == 8) {
                                                    dVar2 = dVar3;
                                                    str9 = "audio/raw";
                                                    iW = 3;
                                                } else {
                                                    if (i53 == 16) {
                                                        iW = 268435456;
                                                    } else if (i53 == 24) {
                                                        iW = 1342177280;
                                                    } else if (i53 == 32) {
                                                        iW = 1610612736;
                                                    } else {
                                                        b7.a.B("Unsupported big endian PCM bit depth: " + r9.R + ". Setting mimeType to audio/x-unknown");
                                                        dVar2 = dVar3;
                                                        str9 = str10;
                                                        iW = -1;
                                                    }
                                                    dVar2 = dVar3;
                                                    str9 = "audio/raw";
                                                }
                                                i13 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z1117 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i3111111111114 = (z1117 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map113 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i3111111111115 = r9.A;
                                                        int i3111111111116 = r9.C;
                                                        int i3111111111117 = r9.B;
                                                        int i3111111111118 = r9.f46587p;
                                                        gVar = new g(i3111111111115, i3111111111116, i3111111111117, i3111111111118, i3111111111118, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i3111111111114;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar113 = new p(oVar);
                                                e0 e0VarV113 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV113;
                                                e0VarV113.b(pVar113);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case Service.METRICS_FIELD_NUMBER /* 24 */:
                                                dVar3 = dVar8;
                                                int i54 = r9.R;
                                                String str12 = f0.f3975a;
                                                iW = f0.w(i54, ByteOrder.LITTLE_ENDIAN);
                                                if (iW == 0) {
                                                    b7.a.B("Unsupported little endian PCM bit depth: " + r9.R + ". Setting mimeType to audio/x-unknown");
                                                    dVar2 = dVar3;
                                                    str9 = str10;
                                                    iW = -1;
                                                    i13 = -1;
                                                    list = null;
                                                    str2 = null;
                                                    list5 = list;
                                                    if (r9.P != null) {
                                                        str2 = aVarA.f6641a;
                                                        str9 = "video/dolby-vision";
                                                    }
                                                    boolean z1118 = r9.X;
                                                    if (r9.W) {
                                                        i14 = 2;
                                                    } else {
                                                        i14 = 0;
                                                    }
                                                    int i3111111111119 = (z1118 ? 1 : 0) | i14;
                                                    oVar = new y6.o();
                                                    zK = d0.k(str9);
                                                    Map map114 = f46603k0;
                                                    if (zK) {
                                                        oVar.E = r9.Q;
                                                        oVar.F = r9.S;
                                                        oVar.G = iW;
                                                        i15 = 1;
                                                    } else if (d0.n(str9)) {
                                                        if (r9.f46590s == 0) {
                                                            i21 = r9.f46588q;
                                                            i16 = -1;
                                                            if (i21 == -1) {
                                                                i21 = r9.f46585n;
                                                            }
                                                            r9.f46588q = i21;
                                                            i22 = r9.f46589r;
                                                            if (i22 == -1) {
                                                                i22 = r9.f46586o;
                                                            }
                                                            r9.f46589r = i22;
                                                        } else {
                                                            i16 = -1;
                                                        }
                                                        i17 = r9.f46588q;
                                                        if (i17 != i16) {
                                                            f5 = -1.0f;
                                                        } else {
                                                            f5 = -1.0f;
                                                        }
                                                        if (r9.f46597z) {
                                                            if (r9.F != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i31111111111110 = r9.A;
                                                            int i31111111111111 = r9.C;
                                                            int i31111111111112 = r9.B;
                                                            int i31111111111113 = r9.f46587p;
                                                            gVar = new g(i31111111111110, i31111111111111, i31111111111112, i31111111111113, i31111111111113, bArr);
                                                        } else {
                                                            gVar = null;
                                                        }
                                                        str4 = r9.f46574b;
                                                        if (str4 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (r9.f46591t == 0) {
                                                            i18 = iIntValue;
                                                        } else {
                                                            i18 = iIntValue;
                                                        }
                                                        oVar.f57271t = r9.f46585n;
                                                        oVar.f57272u = r9.f46586o;
                                                        oVar.f57277z = f5;
                                                        oVar.f57276y = i18;
                                                        oVar.A = r9.f46595x;
                                                        oVar.B = r9.f46596y;
                                                        oVar.C = gVar;
                                                        i15 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str9)) {
                                                        }
                                                        i15 = 3;
                                                    }
                                                    str5 = r9.f46574b;
                                                    if (str5 != null) {
                                                        oVar.f57254b = r9.f46574b;
                                                    }
                                                    oVar.f57253a = Integer.toString(i33);
                                                    if (r9.f46572a) {
                                                        str6 = str7;
                                                    } else {
                                                        str6 = "video/x-matroska";
                                                    }
                                                    oVar.f57264l = d0.o(str6);
                                                    oVar.m = d0.o(str9);
                                                    oVar.f57265n = i13;
                                                    oVar.f57256d = r9.Y;
                                                    oVar.f57257e = i3111111111119;
                                                    oVar.f57267p = list5;
                                                    oVar.f57262j = str2;
                                                    oVar.f57268q = r9.m;
                                                    p pVar114 = new p(oVar);
                                                    e0 e0VarV114 = oVar2.v(r9.f46576d, i15);
                                                    r9.Z = e0VarV114;
                                                    e0VarV114.b(pVar114);
                                                    sparseArray.put(r9.f46576d, r9);
                                                    dVar8 = dVar2;
                                                }
                                                dVar2 = dVar3;
                                                str9 = "audio/raw";
                                                i13 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z1119 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i31111111111114 = (z1119 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map115 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i31111111111115 = r9.A;
                                                        int i31111111111116 = r9.C;
                                                        int i31111111111117 = r9.B;
                                                        int i31111111111118 = r9.f46587p;
                                                        gVar = new g(i31111111111115, i31111111111116, i31111111111117, i31111111111118, i31111111111118, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i31111111111114;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar115 = new p(oVar);
                                                e0 e0VarV115 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV115;
                                                e0VarV115.b(pVar115);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                                            case Service.BILLING_FIELD_NUMBER /* 26 */:
                                                listSingletonList = ImmutableList.v(f46599g0, r9.a(str8));
                                                dVar2 = dVar8;
                                                str9 = "text/x-ssa";
                                                iW = -1;
                                                i13 = -1;
                                                list = listSingletonList;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z11110 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i31111111111119 = (z11110 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map116 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i311111111111110 = r9.A;
                                                        int i311111111111111 = r9.C;
                                                        int i311111111111112 = r9.B;
                                                        int i311111111111113 = r9.f46587p;
                                                        gVar = new g(i311111111111110, i311111111111111, i311111111111112, i311111111111113, i311111111111113, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i31111111111119;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar116 = new p(oVar);
                                                e0 e0VarV116 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV116;
                                                e0VarV116.b(pVar116);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 27:
                                                u uVarA = u.a(new w(r9.a(r9.f46575c)), false, null);
                                                List list6 = uVarA.f55932a;
                                                r9.f46573a0 = uVarA.f55933b;
                                                str3 = uVarA.f55944n;
                                                str9 = "video/hevc";
                                                list4 = list6;
                                                str2 = str3;
                                                dVar2 = dVar8;
                                                list2 = list4;
                                                iW = -1;
                                                i13 = -1;
                                                list5 = list2;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z11111 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i311111111111114 = (z11111 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map117 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i311111111111115 = r9.A;
                                                        int i311111111111116 = r9.C;
                                                        int i311111111111117 = r9.B;
                                                        int i311111111111118 = r9.f46587p;
                                                        gVar = new g(i311111111111115, i311111111111116, i311111111111117, i311111111111118, i311111111111118, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i311111111111114;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar117 = new p(oVar);
                                                e0 e0VarV117 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV117;
                                                e0VarV117.b(pVar117);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                                                dVar2 = dVar8;
                                                str9 = "text/vtt";
                                                iW = -1;
                                                i13 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z11112 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i311111111111119 = (z11112 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map118 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i3111111111111110 = r9.A;
                                                        int i3111111111111111 = r9.C;
                                                        int i3111111111111112 = r9.B;
                                                        int i3111111111111113 = r9.f46587p;
                                                        gVar = new g(i3111111111111110, i3111111111111111, i3111111111111112, i3111111111111113, i3111111111111113, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i311111111111119;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar118 = new p(oVar);
                                                e0 e0VarV118 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV118;
                                                e0VarV118.b(pVar118);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                                                dVar2 = dVar8;
                                                str9 = "application/x-subrip";
                                                iW = -1;
                                                i13 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z11113 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i3111111111111114 = (z11113 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map119 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i3111111111111115 = r9.A;
                                                        int i3111111111111116 = r9.C;
                                                        int i3111111111111117 = r9.B;
                                                        int i3111111111111118 = r9.f46587p;
                                                        gVar = new g(i3111111111111115, i3111111111111116, i3111111111111117, i3111111111111118, i3111111111111118, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i3111111111111114;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar119 = new p(oVar);
                                                e0 e0VarV119 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV119;
                                                e0VarV119.b(pVar119);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 30:
                                                str9 = "video/mpeg2";
                                                dVar2 = dVar8;
                                                iW = -1;
                                                i13 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z11114 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i3111111111111119 = (z11114 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map1110 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i31111111111111110 = r9.A;
                                                        int i31111111111111111 = r9.C;
                                                        int i31111111111111112 = r9.B;
                                                        int i31111111111111113 = r9.f46587p;
                                                        gVar = new g(i31111111111111110, i31111111111111111, i31111111111111112, i31111111111111113, i31111111111111113, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i3111111111111119;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar1110 = new p(oVar);
                                                e0 e0VarV1110 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV1110;
                                                e0VarV1110.b(pVar1110);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 31:
                                                str9 = "audio/eac3";
                                                dVar2 = dVar8;
                                                iW = -1;
                                                i13 = -1;
                                                list = null;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z11115 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i31111111111111114 = (z11115 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map1111 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i31111111111111115 = r9.A;
                                                        int i31111111111111116 = r9.C;
                                                        int i31111111111111117 = r9.B;
                                                        int i31111111111111118 = r9.f46587p;
                                                        gVar = new g(i31111111111111115, i31111111111111116, i31111111111111117, i31111111111111118, i31111111111111118, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i31111111111111114;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar1111 = new p(oVar);
                                                e0 e0VarV1111 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV1111;
                                                e0VarV1111.b(pVar1111);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case Consts.SP /* 32 */:
                                                listU = Collections.singletonList(r9.a(str8));
                                                str9 = "audio/flac";
                                                listSingletonList = listU;
                                                dVar2 = dVar8;
                                                iW = -1;
                                                i13 = -1;
                                                list = listSingletonList;
                                                str2 = null;
                                                list5 = list;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z11116 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i31111111111111119 = (z11116 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map1112 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i311111111111111110 = r9.A;
                                                        int i311111111111111111 = r9.C;
                                                        int i311111111111111112 = r9.B;
                                                        int i311111111111111113 = r9.f46587p;
                                                        gVar = new g(i311111111111111110, i311111111111111111, i311111111111111112, i311111111111111113, i311111111111111113, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i31111111111111119;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar1112 = new p(oVar);
                                                e0 e0VarV1112 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV1112;
                                                e0VarV1112.b(pVar1112);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            case 33:
                                                ArrayList arrayList3 = new ArrayList(3);
                                                arrayList3.add(r9.a(r9.f46575c));
                                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                                arrayList3.add(byteBufferAllocate.order(byteOrder).putLong(r9.T).array());
                                                arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r9.U).array());
                                                str9 = "audio/opus";
                                                dVar2 = dVar8;
                                                str2 = null;
                                                i13 = 5760;
                                                list3 = arrayList3;
                                                iW = -1;
                                                list5 = list3;
                                                if (r9.P != null) {
                                                    str2 = aVarA.f6641a;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z11117 = r9.X;
                                                if (r9.W) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = 0;
                                                }
                                                int i311111111111111114 = (z11117 ? 1 : 0) | i14;
                                                oVar = new y6.o();
                                                zK = d0.k(str9);
                                                Map map1113 = f46603k0;
                                                if (zK) {
                                                    oVar.E = r9.Q;
                                                    oVar.F = r9.S;
                                                    oVar.G = iW;
                                                    i15 = 1;
                                                } else if (d0.n(str9)) {
                                                    if (r9.f46590s == 0) {
                                                        i21 = r9.f46588q;
                                                        i16 = -1;
                                                        if (i21 == -1) {
                                                            i21 = r9.f46585n;
                                                        }
                                                        r9.f46588q = i21;
                                                        i22 = r9.f46589r;
                                                        if (i22 == -1) {
                                                            i22 = r9.f46586o;
                                                        }
                                                        r9.f46589r = i22;
                                                    } else {
                                                        i16 = -1;
                                                    }
                                                    i17 = r9.f46588q;
                                                    if (i17 != i16) {
                                                        f5 = -1.0f;
                                                    } else {
                                                        f5 = -1.0f;
                                                    }
                                                    if (r9.f46597z) {
                                                        if (r9.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i311111111111111115 = r9.A;
                                                        int i311111111111111116 = r9.C;
                                                        int i311111111111111117 = r9.B;
                                                        int i311111111111111118 = r9.f46587p;
                                                        gVar = new g(i311111111111111115, i311111111111111116, i311111111111111117, i311111111111111118, i311111111111111118, bArr);
                                                    } else {
                                                        gVar = null;
                                                    }
                                                    str4 = r9.f46574b;
                                                    if (str4 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r9.f46591t == 0) {
                                                        i18 = iIntValue;
                                                    } else {
                                                        i18 = iIntValue;
                                                    }
                                                    oVar.f57271t = r9.f46585n;
                                                    oVar.f57272u = r9.f46586o;
                                                    oVar.f57277z = f5;
                                                    oVar.f57276y = i18;
                                                    oVar.A = r9.f46595x;
                                                    oVar.B = r9.f46596y;
                                                    oVar.C = gVar;
                                                    i15 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str9)) {
                                                    }
                                                    i15 = 3;
                                                }
                                                str5 = r9.f46574b;
                                                if (str5 != null) {
                                                    oVar.f57254b = r9.f46574b;
                                                }
                                                oVar.f57253a = Integer.toString(i33);
                                                if (r9.f46572a) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = "video/x-matroska";
                                                }
                                                oVar.f57264l = d0.o(str6);
                                                oVar.m = d0.o(str9);
                                                oVar.f57265n = i13;
                                                oVar.f57256d = r9.Y;
                                                oVar.f57257e = i311111111111111114;
                                                oVar.f57267p = list5;
                                                oVar.f57262j = str2;
                                                oVar.f57268q = r9.m;
                                                p pVar1113 = new p(oVar);
                                                e0 e0VarV1113 = oVar2.v(r9.f46576d, i15);
                                                r9.Z = e0VarV1113;
                                                e0VarV1113.b(pVar1113);
                                                sparseArray.put(r9.f46576d, r9);
                                                dVar8 = dVar2;
                                                break;
                                            default:
                                                throw ParserException.a(null, "Unrecognized codec identifier.");
                                        }
                                    default:
                                        dVar8.f46631x = null;
                                        break;
                                }
                            } else {
                                if (i32 == 19899) {
                                    int i55 = dVar8.f46633z;
                                    if (i55 != i24) {
                                        long j17 = dVar8.A;
                                        if (j17 != -1) {
                                            if (i55 == 475249515) {
                                                dVar8.C = j17;
                                            }
                                        }
                                    }
                                    throw ParserException.a(null, "Mandatory element SeekID or SeekPosition not found");
                                }
                                if (i32 == 25152) {
                                    dVar8.b(i32);
                                    c cVar2 = dVar8.f46631x;
                                    if (cVar2.f46581i) {
                                        x7.d0 d0Var = cVar2.f46583k;
                                        if (d0Var == null) {
                                            throw ParserException.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                        }
                                        cVar2.m = new l(null, true, new k(y6.f.f57188a, null, str7, d0Var.f55870b));
                                    }
                                } else if (i32 == 28032) {
                                    dVar8.b(i32);
                                    c cVar3 = dVar8.f46631x;
                                    if (cVar3.f46581i && cVar3.f46582j != null) {
                                        throw ParserException.a(null, "Combining encryption and compression is not supported");
                                    }
                                } else if (i32 == 357149030) {
                                    if (dVar8.f46627t == -9223372036854775807L) {
                                        dVar8.f46627t = 1000000L;
                                    }
                                    long j18 = dVar8.f46628u;
                                    if (j18 != -9223372036854775807L) {
                                        dVar8.f46629v = dVar8.l(j18);
                                    }
                                } else if (i32 == 374648427) {
                                    if (sparseArray.size() == 0) {
                                        throw ParserException.a(null, "No valid tracks were found");
                                    }
                                    dVar8.f46613e0.o();
                                } else if (i32 == 475249515) {
                                    if (!dVar8.f46632y) {
                                        x7.o oVar3 = dVar8.f46613e0;
                                        o oVar4 = dVar8.F;
                                        o oVar5 = dVar8.G;
                                        if (dVar8.f46626s == -1 || dVar8.f46629v == -9223372036854775807L || oVar4 == null || (i23 = oVar4.f4013b) == 0 || oVar5 == null || oVar5.f4013b != i23) {
                                            qVar = new x7.q(dVar8.f46629v);
                                        } else {
                                            int[] iArrCopyOf = new int[i23];
                                            long[] jArrCopyOf = new long[i23];
                                            long[] jArrCopyOf2 = new long[i23];
                                            long[] jArrCopyOf3 = new long[i23];
                                            for (int i56 = 0; i56 < i23; i56++) {
                                                jArrCopyOf3[i56] = oVar4.d(i56);
                                                jArrCopyOf[i56] = oVar5.d(i56) + dVar8.f46626s;
                                            }
                                            int i57 = 0;
                                            while (true) {
                                                int i58 = i23 - 1;
                                                if (i57 < i58) {
                                                    int i59 = i57 + 1;
                                                    iArrCopyOf[i57] = (int) (jArrCopyOf[i59] - jArrCopyOf[i57]);
                                                    jArrCopyOf2[i57] = jArrCopyOf3[i59] - jArrCopyOf3[i57];
                                                    i57 = i59;
                                                } else {
                                                    int i60 = i58;
                                                    while (i60 > 0 && jArrCopyOf3[i60] > dVar8.f46629v) {
                                                        i60--;
                                                    }
                                                    iArrCopyOf[i60] = (int) ((dVar8.f46626s + dVar8.f46625r) - jArrCopyOf[i60]);
                                                    jArrCopyOf2[i60] = dVar8.f46629v - jArrCopyOf3[i60];
                                                    if (i60 < i58) {
                                                        b7.a.B("Discarding trailing cue points with timestamps greater than total duration");
                                                        int i61 = i60 + 1;
                                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i61);
                                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i61);
                                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i61);
                                                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i61);
                                                    }
                                                    qVar = new x7.i(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                                                }
                                            }
                                        }
                                        oVar3.q(qVar);
                                        dVar8.f46632y = true;
                                    }
                                    dVar8.F = null;
                                    dVar8.G = null;
                                }
                            }
                        } else {
                            if (dVar8.J == 2) {
                                c cVar4 = (c) sparseArray.get(dVar8.P);
                                cVar4.Z.getClass();
                                if (dVar8.U > 0 && "A_OPUS".equals(cVar4.f46575c)) {
                                    w wVar3 = dVar8.f46623p;
                                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(dVar8.U).array();
                                    wVar3.getClass();
                                    wVar3.G(bArrArray, bArrArray.length);
                                }
                                int i62 = 0;
                                for (int i63 = 0; i63 < dVar8.N; i63++) {
                                    i62 += dVar8.O[i63];
                                }
                                int i64 = 0;
                                while (i64 < dVar8.N) {
                                    long j19 = dVar8.K + ((long) ((cVar4.f46578f * i64) / 1000));
                                    int i65 = dVar8.R;
                                    if (i64 == 0 && !dVar8.T) {
                                        i65 |= 1;
                                    }
                                    int i66 = dVar8.O[i64];
                                    int i67 = i62 - i66;
                                    dVar8.d(cVar4, j19, i65, i66, i67);
                                    i64++;
                                    i62 = i67;
                                }
                                z13 = false;
                                dVar8.J = 0;
                            }
                            nVar2 = nVar;
                            z12 = z13;
                        }
                        z13 = false;
                        nVar2 = nVar;
                        z12 = z13;
                    }
                    z14 = true;
                }
                if (z14) {
                    long position2 = nVar2.getPosition();
                    dVar = this;
                    if (dVar.B) {
                        dVar.D = position2;
                        bVar.f38845a = dVar.C;
                        dVar.B = z12;
                        return 1;
                    }
                    if (dVar.f46632y) {
                        long j21 = dVar.D;
                        if (j21 != -1) {
                            bVar.f38845a = j21;
                            dVar.D = -1L;
                            return 1;
                        }
                    } else {
                        continue;
                    }
                } else {
                    dVar = this;
                }
                dVar4 = dVar;
            }
        }
        d dVar9 = dVar4;
        if (z14) {
            return 0;
        }
        int i68 = 0;
        while (true) {
            SparseArray sparseArray2 = dVar9.f46608c;
            if (i68 >= sparseArray2.size()) {
                return -1;
            }
            c cVar5 = (c) sparseArray2.valueAt(i68);
            cVar5.Z.getClass();
            x7.f0 f0Var = cVar5.V;
            if (f0Var != null) {
                f0Var.a(cVar5.Z, cVar5.f46583k);
            }
            i68++;
        }
    }
}
