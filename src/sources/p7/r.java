package p7;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements d7.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7.f f46453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f46455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f46456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46457e;

    public r(d7.f fVar, int i11, p0 p0Var) {
        b7.a.d(i11 > 0);
        this.f46453a = fVar;
        this.f46454b = i11;
        this.f46455c = p0Var;
        this.f46456d = new byte[1];
        this.f46457e = i11;
    }

    @Override // d7.f
    public final void c(d7.q qVar) {
        qVar.getClass();
        this.f46453a.c(qVar);
    }

    @Override // d7.f
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // d7.f
    public final Map p() {
        return this.f46453a.p();
    }

    @Override // y6.h
    public final int read(byte[] bArr, int i11, int i12) {
        int i13 = this.f46457e;
        d7.f fVar = this.f46453a;
        if (i13 == 0) {
            byte[] bArr2 = this.f46456d;
            if (fVar.read(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    int i16 = 0;
                    while (i15 > 0) {
                        int i17 = fVar.read(bArr3, i16, i15);
                        if (i17 != -1) {
                            i16 += i17;
                            i15 -= i17;
                        }
                    }
                    while (i14 > 0 && bArr3[i14 - 1] == 0) {
                        i14--;
                    }
                    if (i14 > 0) {
                        b7.w wVar = new b7.w(bArr3, i14);
                        p0 p0Var = this.f46455c;
                        long jMax = !p0Var.N ? p0Var.K : Math.max(p0Var.O.m(true), p0Var.K);
                        int iA = wVar.a();
                        x7.e0 e0Var = p0Var.M;
                        e0Var.getClass();
                        e0Var.a(wVar, iA, 0);
                        e0Var.d(jMax, 1, iA, 0, null);
                        p0Var.N = true;
                    }
                }
                this.f46457e = this.f46454b;
            }
            return -1;
        }
        int i18 = fVar.read(bArr, i11, Math.min(this.f46457e, i12));
        if (i18 != -1) {
            this.f46457e -= i18;
        }
        return i18;
    }

    @Override // d7.f
    public final long u(d7.h hVar) {
        throw new UnsupportedOperationException();
    }

    @Override // d7.f
    public final Uri x() {
        return this.f46453a.x();
    }
}
