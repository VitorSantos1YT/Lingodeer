package o20;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends m00.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44620a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f44621b;

    public /* synthetic */ y(m00.i0 i0Var) {
        super(i0Var);
    }

    @Override // m00.r, m00.i0
    public final long read(m00.i iVar, long j11) throws Exception {
        switch (this.f44620a) {
            case 0:
                try {
                    return super.read(iVar, j11);
                } catch (IOException e8) {
                    ((z) this.f44621b).f44625c = e8;
                    throw e8;
                }
            default:
                try {
                    return super.read(iVar, j11);
                } catch (Exception e10) {
                    this.f44621b = e10;
                    throw e10;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, m00.k kVar) {
        super(kVar);
        this.f44621b = zVar;
    }
}
