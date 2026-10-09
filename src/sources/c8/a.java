package c8;

import b7.w;
import x7.g;
import x7.h;
import x7.n;
import x7.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f6717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kw.b f6719c = new kw.b();

    public a(r rVar, int i11) {
        this.f6717a = rVar;
        this.f6718b = i11;
    }

    public final long a(n nVar) {
        kw.b bVar;
        r rVar;
        int iN;
        while (true) {
            long jI = nVar.i();
            long length = nVar.getLength() - 6;
            bVar = this.f6719c;
            rVar = this.f6717a;
            if (jI >= length) {
                break;
            }
            long jI2 = nVar.i();
            byte[] bArr = new byte[2];
            int i11 = 0;
            boolean zB = false;
            nVar.A(bArr, 0, 2);
            int i12 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i13 = this.f6718b;
            if (i12 != i13) {
                nVar.r();
                nVar.k((int) (jI2 - nVar.getPosition()));
            } else {
                w wVar = new w(16);
                System.arraycopy(bArr, 0, wVar.f4039a, 0, 2);
                byte[] bArr2 = wVar.f4039a;
                while (i11 < 14 && (iN = nVar.n(bArr2, 2 + i11, 14 - i11)) != -1) {
                    i11 += iN;
                }
                wVar.H(i11);
                nVar.r();
                nVar.k((int) (jI2 - nVar.getPosition()));
                zB = x7.a.b(wVar, rVar, i13, bVar);
            }
            if (zB) {
                break;
            }
            nVar.k(1);
        }
        if (nVar.i() < nVar.getLength() - 6) {
            return bVar.f38845a;
        }
        nVar.k((int) (nVar.getLength() - nVar.i()));
        return rVar.f55925j;
    }

    @Override // x7.h
    public final g k(n nVar, long j11) {
        long position = nVar.getPosition();
        long jA = a(nVar);
        long jI = nVar.i();
        nVar.k(Math.max(6, this.f6717a.f55918c));
        long jA2 = a(nVar);
        long jI2 = nVar.i();
        if (jA > j11 || jA2 <= j11) {
            return jA2 <= j11 ? new g(jA2, -2, jI2) : new g(jA, -1, position);
        }
        return new g(-9223372036854775807L, 0, jI);
    }
}
