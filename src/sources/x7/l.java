package x7;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f55912a = new byte[4096];

    @Override // x7.e0
    public final void a(b7.w wVar, int i11, int i12) {
        wVar.J(i11);
    }

    @Override // x7.e0
    public final int c(y6.h hVar, int i11, boolean z11) throws EOFException {
        byte[] bArr = this.f55912a;
        int i12 = hVar.read(bArr, 0, Math.min(bArr.length, i11));
        if (i12 != -1) {
            return i12;
        }
        if (z11) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // x7.e0
    public final void b(y6.p pVar) {
    }

    @Override // x7.e0
    public final void d(long j11, int i11, int i12, int i13, d0 d0Var) {
    }
}
