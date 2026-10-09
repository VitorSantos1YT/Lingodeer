package f9;

import androidx.media3.common.ParserException;
import b7.w;
import x7.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f27022a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f27023b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(n nVar) {
        w wVar = new w(8);
        int i11 = e.a(nVar, wVar).f27021b;
        if (i11 != 1380533830 && i11 != 1380333108) {
            return false;
        }
        nVar.A(wVar.f4039a, 0, 4);
        wVar.I(0);
        int iJ = wVar.j();
        if (iJ == 1463899717) {
            return true;
        }
        b7.a.o("Unsupported form type: " + iJ);
        return false;
    }

    public static e b(int i11, n nVar, w wVar) {
        e eVarA = e.a(nVar, wVar);
        while (true) {
            int i12 = eVarA.f27021b;
            if (i12 == i11) {
                return eVarA;
            }
            defpackage.e.y(i12, "Ignoring unknown WAV chunk: ");
            long j11 = eVarA.f27020a;
            long j12 = 8 + j11;
            if (j11 % 2 != 0) {
                j12 = 9 + j11;
            }
            if (j12 > 2147483647L) {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + i12);
            }
            nVar.s((int) j12);
            eVarA = e.a(nVar, wVar);
        }
    }
}
