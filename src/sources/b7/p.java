package b7;

import com.tbruyelle.rxpermissions3.BuildConfig;
import j3.x0;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements r8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4015a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f4020f;

    public /* synthetic */ p() {
    }

    @Override // r8.b
    public int a() {
        return -1;
    }

    public void b(int i11, int i12) {
        long jB = j3.t.b(i11, i12);
        ((ar.f) this.f4020f).r(i11, i12, BuildConfig.VERSION_NAME);
        long jK = com.bumptech.glide.f.K(j3.t.b(this.f4016b, this.f4017c), jB);
        k(x0.f(jK));
        i(x0.e(jK));
        int i13 = this.f4018d;
        if (i13 != -1) {
            long jK2 = com.bumptech.glide.f.K(j3.t.b(i13, this.f4019e), jB);
            if (x0.c(jK2)) {
                this.f4018d = -1;
                this.f4019e = -1;
            } else {
                this.f4018d = x0.f(jK2);
                this.f4019e = x0.e(jK2);
            }
        }
    }

    public char c(int i11) {
        ar.f fVar = (ar.f) this.f4020f;
        d1.t tVar = (d1.t) fVar.f2849e;
        if (tVar == null) {
            return ((String) fVar.f2848d).charAt(i11);
        }
        if (i11 < fVar.f2846b) {
            return ((String) fVar.f2848d).charAt(i11);
        }
        int iC = tVar.f22991b - tVar.c();
        int i12 = fVar.f2846b;
        if (i11 >= iC + i12) {
            return ((String) fVar.f2848d).charAt(i11 - ((iC - fVar.f2847c) + i12));
        }
        int i13 = i11 - i12;
        int i14 = tVar.f22992c;
        return i13 < i14 ? ((char[]) tVar.f22994e)[i13] : ((char[]) tVar.f22994e)[(i13 - i14) + tVar.f22993d];
    }

    public x0 d() {
        int i11 = this.f4018d;
        if (i11 != -1) {
            return new x0(j3.t.b(i11, this.f4019e));
        }
        return null;
    }

    public long e() {
        int i11 = this.f4018d;
        if (i11 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.f4020f;
        int i12 = this.f4016b;
        long j11 = jArr[i12];
        this.f4016b = this.f4019e & (i12 + 1);
        this.f4018d = i11 - 1;
        return j11;
    }

    public void f(int i11, int i12, String str) {
        ar.f fVar = (ar.f) this.f4020f;
        if (i11 < 0 || i11 > fVar.e()) {
            StringBuilder sbI = w4.c.i(i11, "start (", ") offset is outside of text region ");
            sbI.append(fVar.e());
            throw new IndexOutOfBoundsException(sbI.toString());
        }
        if (i12 < 0 || i12 > fVar.e()) {
            StringBuilder sbI2 = w4.c.i(i12, "end (", ") offset is outside of text region ");
            sbI2.append(fVar.e());
            throw new IndexOutOfBoundsException(sbI2.toString());
        }
        if (i11 > i12) {
            throw new IllegalArgumentException(nv.p.p("Do not set reversed range: ", i11, i12, " > "));
        }
        fVar.r(i11, i12, str);
        k(str.length() + i11);
        i(str.length() + i11);
        this.f4018d = -1;
        this.f4019e = -1;
    }

    public void g(int i11, int i12) {
        ar.f fVar = (ar.f) this.f4020f;
        if (i11 < 0 || i11 > fVar.e()) {
            StringBuilder sbI = w4.c.i(i11, "start (", ") offset is outside of text region ");
            sbI.append(fVar.e());
            throw new IndexOutOfBoundsException(sbI.toString());
        }
        if (i12 < 0 || i12 > fVar.e()) {
            StringBuilder sbI2 = w4.c.i(i12, "end (", ") offset is outside of text region ");
            sbI2.append(fVar.e());
            throw new IndexOutOfBoundsException(sbI2.toString());
        }
        if (i11 >= i12) {
            throw new IllegalArgumentException(nv.p.p("Do not set reversed or empty range: ", i11, i12, " > "));
        }
        this.f4018d = i11;
        this.f4019e = i12;
    }

    public void h(int i11, int i12) {
        ar.f fVar = (ar.f) this.f4020f;
        if (i11 < 0 || i11 > fVar.e()) {
            StringBuilder sbI = w4.c.i(i11, "start (", ") offset is outside of text region ");
            sbI.append(fVar.e());
            throw new IndexOutOfBoundsException(sbI.toString());
        }
        if (i12 < 0 || i12 > fVar.e()) {
            StringBuilder sbI2 = w4.c.i(i12, "end (", ") offset is outside of text region ");
            sbI2.append(fVar.e());
            throw new IndexOutOfBoundsException(sbI2.toString());
        }
        if (i11 > i12) {
            throw new IllegalArgumentException(nv.p.p("Do not set reversed range: ", i11, i12, " > "));
        }
        k(i11);
        i(i12);
    }

    public void i(int i11) {
        if (!(i11 >= 0)) {
            p3.a.a("Cannot set selectionEnd to a negative value: " + i11);
        }
        this.f4017c = i11;
    }

    @Override // r8.b
    public int j() {
        return this.f4016b;
    }

    public void k(int i11) {
        if (!(i11 >= 0)) {
            p3.a.a("Cannot set selectionStart to a negative value: " + i11);
        }
        this.f4016b = i11;
    }

    @Override // r8.b
    public int o() {
        w wVar = (w) this.f4020f;
        int i11 = this.f4017c;
        if (i11 == 8) {
            return wVar.w();
        }
        if (i11 == 16) {
            return wVar.C();
        }
        int i12 = this.f4018d;
        this.f4018d = i12 + 1;
        if (i12 % 2 != 0) {
            return this.f4019e & 15;
        }
        int iW = wVar.w();
        this.f4019e = iW;
        return (iW & 240) >> 4;
    }

    public String toString() {
        switch (this.f4015a) {
            case 2:
                return ((ar.f) this.f4020f).toString();
            default:
                return super.toString();
        }
    }

    public p(j3.h hVar, long j11) {
        String str = hVar.f35700b;
        ar.f fVar = new ar.f(4, (byte) 0);
        fVar.f2848d = str;
        fVar.f2846b = -1;
        fVar.f2847c = -1;
        this.f4020f = fVar;
        this.f4016b = x0.f(j11);
        this.f4017c = x0.e(j11);
        this.f4018d = -1;
        this.f4019e = -1;
        int iF = x0.f(j11);
        int iE = x0.e(j11);
        if (iF < 0 || iF > str.length()) {
            StringBuilder sbI = w4.c.i(iF, "start (", ") offset is outside of text region ");
            sbI.append(str.length());
            throw new IndexOutOfBoundsException(sbI.toString());
        }
        if (iE < 0 || iE > str.length()) {
            StringBuilder sbI2 = w4.c.i(iE, "end (", ") offset is outside of text region ");
            sbI2.append(str.length());
            throw new IndexOutOfBoundsException(sbI2.toString());
        }
        if (iF > iE) {
            throw new IllegalArgumentException(nv.p.p("Do not set reversed range: ", iF, iE, " > "));
        }
    }

    public p(int i11, int i12, int i13, int i14, int i15, byte[] bArr) {
        this.f4016b = i12;
        this.f4017c = i13;
        this.f4018d = i14;
        this.f4019e = i15;
        this.f4020f = bArr;
    }

    public p(c7.e eVar) {
        w wVar = eVar.f6650c;
        this.f4020f = wVar;
        wVar.I(12);
        this.f4017c = wVar.A() & 255;
        this.f4016b = wVar.A();
    }
}
