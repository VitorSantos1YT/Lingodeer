package b;

import b0.f0;
import b0.n2;
import b0.s;
import b0.z;
import b7.w;
import dm.c;
import fz.e;
import java.io.InputStream;
import l1.d;
import l1.u;
import o3.p;
import r8.b;
import s0.u1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n2, d, b, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3415c;

    public /* synthetic */ a(int i11, int i12, Object obj) {
        this.f3413a = i11;
        this.f3414b = i12;
        this.f3415c = obj;
    }

    public static void t(short[] sArr) {
        for (int i11 = 0; i11 < sArr.length; i11++) {
            sArr[i11] = 1024;
        }
    }

    @Override // l1.d
    public void A(Object obj, e eVar) {
        ((d) this.f3415c).A(obj, eVar);
    }

    @Override // r8.b
    public int a() {
        return this.f3413a;
    }

    @Override // l1.d
    public void b(int i11, Object obj) {
        ((d) this.f3415c).b(i11 + (this.f3414b == 0 ? this.f3413a : 0), obj);
    }

    @Override // l1.d
    public void d(Object obj) {
        this.f3414b++;
        ((d) this.f3415c).d(obj);
    }

    @Override // o3.p
    public int f(int i11) {
        int iF = ((p) this.f3415c).f(i11);
        if (i11 >= 0 && i11 <= this.f3414b) {
            u1.c(iF, this.f3413a, i11);
        }
        return iF;
    }

    @Override // l1.d
    public void h() {
        ((d) this.f3415c).h();
    }

    @Override // b0.l2
    public s i(long j11, s sVar, s sVar2, s sVar3) {
        return ((c) this.f3415c).i(j11, sVar, sVar2, sVar3);
    }

    @Override // r8.b
    public int j() {
        return this.f3414b;
    }

    @Override // l1.d
    public void k(int i11, int i12, int i13) {
        int i14 = this.f3414b == 0 ? this.f3413a : 0;
        ((d) this.f3415c).k(i11 + i14, i12 + i14, i13);
    }

    @Override // l1.d
    public void l(int i11, int i12) {
        ((d) this.f3415c).l(i11 + (this.f3414b == 0 ? this.f3413a : 0), i12);
    }

    @Override // b0.l2
    public s m(long j11, s sVar, s sVar2, s sVar3) {
        return ((c) this.f3415c).m(j11, sVar, sVar2, sVar3);
    }

    @Override // b0.n2
    public int n() {
        return this.f3414b;
    }

    @Override // r8.b
    public int o() {
        int i11 = this.f3413a;
        return i11 == -1 ? ((w) this.f3415c).A() : i11;
    }

    public int p(short[] sArr, int i11) {
        short s3 = sArr[i11];
        int i12 = this.f3413a;
        int i13 = (i12 >>> 11) * s3;
        int i14 = this.f3414b;
        if ((i14 ^ Integer.MIN_VALUE) < (Integer.MIN_VALUE ^ i13)) {
            this.f3413a = i13;
            sArr[i11] = (short) (s3 + ((2048 - s3) >>> 5));
            if ((i13 & (-16777216)) != 0) {
                return 0;
            }
            this.f3414b = (i14 << 8) | ((InputStream) this.f3415c).read();
            this.f3413a <<= 8;
            return 0;
        }
        int i15 = i12 - i13;
        this.f3413a = i15;
        int i16 = i14 - i13;
        this.f3414b = i16;
        sArr[i11] = (short) (s3 - (s3 >>> 5));
        if ((i15 & (-16777216)) != 0) {
            return 1;
        }
        this.f3414b = (i16 << 8) | ((InputStream) this.f3415c).read();
        this.f3413a <<= 8;
        return 1;
    }

    @Override // l1.d
    public void q() {
        if (!(this.f3414b > 0)) {
            u.a("OffsetApplier up called with no corresponding down");
        }
        this.f3414b--;
        ((d) this.f3415c).q();
    }

    @Override // b0.n2
    public int r() {
        return this.f3413a;
    }

    @Override // o3.p
    public int s(int i11) {
        int iS = ((p) this.f3415c).s(i11);
        if (i11 >= 0 && i11 <= this.f3413a) {
            u1.b(iS, this.f3414b, i11);
        }
        return iS;
    }

    @Override // l1.d
    public void v(int i11, Object obj) {
        ((d) this.f3415c).v(i11 + (this.f3414b == 0 ? this.f3413a : 0), obj);
    }

    @Override // l1.d
    public Object x() {
        return ((d) this.f3415c).x();
    }

    public /* synthetic */ a(Object obj, int i11, int i12) {
        this.f3415c = obj;
        this.f3413a = i11;
        this.f3414b = i12;
    }

    public a() {
        this.f3415c = new a[256];
        this.f3413a = 0;
        this.f3414b = 0;
    }

    public a(int i11, int i12, z zVar) {
        this.f3413a = i11;
        this.f3414b = i12;
        this.f3415c = new c(new f0(i11, i12, zVar));
    }
}
