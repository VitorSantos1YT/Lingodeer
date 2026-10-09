package q7;

import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends d {
    public final long L;
    public final long M;
    public final long N;
    public ob.c O;
    public int[] P;

    public a(d7.f fVar, d7.h hVar, p pVar, int i11, Object obj, long j11, long j12, long j13, long j14, long j15) {
        super(fVar, hVar, 1, pVar, i11, obj, j11, j12);
        pVar.getClass();
        this.L = j15;
        this.M = j13;
        this.N = j14;
    }

    public final int a(int i11) {
        int[] iArr = this.P;
        b7.a.k(iArr);
        return iArr[i11];
    }

    public long b() {
        long j11 = this.L;
        if (j11 != -1) {
            return j11 + 1;
        }
        return -1L;
    }

    public abstract boolean c();
}
