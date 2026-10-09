package e9;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements x7.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f25134a = new b("audio/ac3");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7.w f25135b = new b7.w(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25136c;

    @Override // x7.m
    public final boolean c(x7.n nVar) throws EOFException, InterruptedIOException {
        x7.j jVar;
        int iF;
        b7.w wVar = new b7.w(10);
        int i11 = 0;
        while (true) {
            jVar = (x7.j) nVar;
            jVar.f(wVar.f4039a, 0, 10, false);
            wVar.I(0);
            if (wVar.z() != 4801587) {
                break;
            }
            wVar.J(3);
            int iV = wVar.v();
            i11 += iV + 10;
            jVar.b(iV, false);
        }
        jVar.f55903f = 0;
        jVar.b(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            jVar.f(wVar.f4039a, 0, 6, false);
            wVar.I(0);
            if (wVar.C() != 2935) {
                jVar.f55903f = 0;
                i13++;
                if (i13 - i11 >= 8192) {
                    break;
                }
                jVar.b(i13, false);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = wVar.f4039a;
                if (bArr.length < 6) {
                    iF = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iF = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b3 = bArr[4];
                    iF = x7.a.f((b3 & 192) >> 6, b3 & 63);
                }
                if (iF == -1) {
                    break;
                }
                jVar.b(iF - 6, false);
            }
        }
        return false;
    }

    @Override // x7.m
    public final void e(x7.o oVar) {
        this.f25134a.d(oVar, new b10.b(0, 1));
        oVar.o();
        oVar.q(new x7.q(-9223372036854775807L));
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        this.f25136c = false;
        this.f25134a.a();
    }

    @Override // x7.m
    public final int g(x7.n nVar, kw.b bVar) {
        b7.w wVar = this.f25135b;
        int i11 = nVar.read(wVar.f4039a, 0, 2786);
        if (i11 == -1) {
            return -1;
        }
        wVar.I(0);
        wVar.H(i11);
        boolean z11 = this.f25136c;
        b bVar2 = this.f25134a;
        if (!z11) {
            bVar2.f25161o = 0L;
            this.f25136c = true;
        }
        bVar2.c(wVar);
        return 0;
    }

    @Override // x7.m
    public final void release() {
    }
}
