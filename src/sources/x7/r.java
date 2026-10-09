package x7;

import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f55920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f55921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f55922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f55923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f55924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f55925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qp.b f55926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y6.c0 f55927l;

    public r(byte[] bArr, int i11) {
        b7.v vVar = new b7.v(bArr, bArr.length);
        vVar.q(i11 * 8);
        this.f55916a = vVar.i(16);
        this.f55917b = vVar.i(16);
        this.f55918c = vVar.i(24);
        this.f55919d = vVar.i(24);
        int i12 = vVar.i(20);
        this.f55920e = i12;
        this.f55921f = d(i12);
        this.f55922g = vVar.i(3) + 1;
        int i13 = vVar.i(5) + 1;
        this.f55923h = i13;
        this.f55924i = a(i13);
        this.f55925j = vVar.k(36);
        this.f55926k = null;
        this.f55927l = null;
    }

    public static int a(int i11) {
        if (i11 == 8) {
            return 1;
        }
        if (i11 == 12) {
            return 2;
        }
        if (i11 == 16) {
            return 4;
        }
        if (i11 == 20) {
            return 5;
        }
        if (i11 != 24) {
            return i11 != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i11) {
        switch (i11) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j11 = this.f55925j;
        if (j11 == 0) {
            return -9223372036854775807L;
        }
        return (j11 * 1000000) / ((long) this.f55920e);
    }

    public final y6.p c(byte[] bArr, y6.c0 c0Var) {
        bArr[4] = -128;
        int i11 = this.f55919d;
        if (i11 <= 0) {
            i11 = -1;
        }
        y6.c0 c0Var2 = this.f55927l;
        if (c0Var2 != null) {
            c0Var = c0Var2.b(c0Var);
        }
        y6.o oVar = new y6.o();
        oVar.m = y6.d0.o("audio/flac");
        oVar.f57265n = i11;
        oVar.E = this.f55922g;
        oVar.F = this.f55920e;
        String str = b7.f0.f3975a;
        oVar.G = b7.f0.w(this.f55923h, ByteOrder.LITTLE_ENDIAN);
        oVar.f57267p = Collections.singletonList(bArr);
        oVar.f57263k = c0Var;
        return new y6.p(oVar);
    }

    public r(int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, qp.b bVar, y6.c0 c0Var) {
        this.f55916a = i11;
        this.f55917b = i12;
        this.f55918c = i13;
        this.f55919d = i14;
        this.f55920e = i15;
        this.f55921f = d(i15);
        this.f55922g = i16;
        this.f55923h = i17;
        this.f55924i = a(i17);
        this.f55925j = j11;
        this.f55926k = bVar;
        this.f55927l = c0Var;
    }
}
