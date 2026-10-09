package e9;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements x7.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f25162a = new b(null, 0, 1, "audio/ac4");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7.w f25163b = new b7.w(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25164c;

    @Override // x7.m
    public final boolean c(x7.n nVar) throws EOFException, InterruptedIOException {
        x7.j jVar;
        int i11;
        b7.w wVar = new b7.w(10);
        int i12 = 0;
        while (true) {
            jVar = (x7.j) nVar;
            jVar.f(wVar.f4039a, 0, 10, false);
            wVar.I(0);
            if (wVar.z() != 4801587) {
                break;
            }
            wVar.J(3);
            int iV = wVar.v();
            i12 += iV + 10;
            jVar.b(iV, false);
        }
        jVar.f55903f = 0;
        jVar.b(i12, false);
        int i13 = 0;
        int i14 = i12;
        while (true) {
            int i15 = 7;
            jVar.f(wVar.f4039a, 0, 7, false);
            wVar.I(0);
            int iC = wVar.C();
            if (iC == 44096 || iC == 44097) {
                i13++;
                if (i13 >= 4) {
                    return true;
                }
                byte[] bArr = wVar.f4039a;
                if (bArr.length < 7) {
                    i11 = -1;
                } else {
                    int i16 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i16 == 65535) {
                        i16 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i15 = 4;
                    }
                    if (iC == 44097) {
                        i15 += 2;
                    }
                    i11 = i16 + i15;
                }
                if (i11 == -1) {
                    break;
                }
                jVar.b(i11 - 7, false);
            } else {
                jVar.f55903f = 0;
                i14++;
                if (i14 - i12 >= 8192) {
                    break;
                }
                jVar.b(i14, false);
                i13 = 0;
            }
        }
        return false;
    }

    @Override // x7.m
    public final void e(x7.o oVar) {
        this.f25162a.d(oVar, new b10.b(0, 1));
        oVar.o();
        oVar.q(new x7.q(-9223372036854775807L));
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        this.f25164c = false;
        this.f25162a.a();
    }

    @Override // x7.m
    public final int g(x7.n nVar, kw.b bVar) {
        b7.w wVar = this.f25163b;
        int i11 = nVar.read(wVar.f4039a, 0, 16384);
        if (i11 == -1) {
            return -1;
        }
        wVar.I(0);
        wVar.H(i11);
        boolean z11 = this.f25164c;
        b bVar2 = this.f25162a;
        if (!z11) {
            bVar2.f25161o = 0L;
            this.f25164c = true;
        }
        bVar2.c(wVar);
        return 0;
    }

    @Override // x7.m
    public final void release() {
    }
}
