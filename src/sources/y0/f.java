package y0;

import kotlin.KotlinNothingValueException;
import w2.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements z0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f56795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f56796b;

    public f(g gVar, long j11) {
        this.f56796b = gVar;
        this.f56795a = j11;
    }

    @Override // z0.d
    public final v0.c R() {
        return h.b(this.f56796b);
    }

    @Override // z0.d
    public final long h0(x xVar) {
        x xVar2 = (x) this.f56796b.T.getValue();
        if (xVar2 != null) {
            return xVar.f(xVar2, this.f56795a);
        }
        i0.a.d("Tried to open context menu before the anchor was placed.");
        throw new KotlinNothingValueException();
    }

    @Override // z0.d
    public final f2.c l0(x xVar) {
        return com.bumptech.glide.e.e(h0(xVar), 0L);
    }
}
