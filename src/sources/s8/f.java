package s8;

import androidx.media3.common.ParserException;
import b7.w;
import java.io.EOFException;
import x7.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f51493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f51497f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f51498g = new w(255);

    public final boolean a(n nVar, boolean z11) throws ParserException, EOFException {
        boolean zF;
        boolean zF2;
        this.f51492a = 0;
        this.f51493b = 0L;
        this.f51494c = 0;
        this.f51495d = 0;
        this.f51496e = 0;
        w wVar = this.f51498g;
        wVar.F(27);
        try {
            zF = nVar.f(wVar.f4039a, 0, 27, z11);
        } catch (EOFException e8) {
            if (!z11) {
                throw e8;
            }
            zF = false;
        }
        if (zF && wVar.y() == 1332176723) {
            if (wVar.w() == 0) {
                this.f51492a = wVar.w();
                this.f51493b = wVar.m();
                wVar.n();
                wVar.n();
                wVar.n();
                int iW = wVar.w();
                this.f51494c = iW;
                this.f51495d = iW + 27;
                wVar.F(iW);
                try {
                    zF2 = nVar.f(wVar.f4039a, 0, this.f51494c, z11);
                } catch (EOFException e10) {
                    if (!z11) {
                        throw e10;
                    }
                    zF2 = false;
                }
                if (zF2) {
                    for (int i11 = 0; i11 < this.f51494c; i11++) {
                        int iW2 = wVar.w();
                        this.f51497f[i11] = iW2;
                        this.f51496e += iW2;
                    }
                    return true;
                }
            } else if (!z11) {
                throw ParserException.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(n nVar, long j11) {
        boolean zF;
        b7.a.d(nVar.getPosition() == nVar.i());
        w wVar = this.f51498g;
        wVar.F(4);
        while (true) {
            if (j11 != -1 && nVar.getPosition() + 4 >= j11) {
                break;
            }
            try {
                zF = nVar.f(wVar.f4039a, 0, 4, true);
            } catch (EOFException unused) {
                zF = false;
            }
            if (!zF) {
                break;
            }
            wVar.I(0);
            if (wVar.y() == 1332176723) {
                nVar.r();
                return true;
            }
            nVar.s(1);
        }
        do {
            if (j11 != -1 && nVar.getPosition() >= j11) {
                break;
            }
        } while (nVar.m(1) != -1);
        return false;
    }
}
