package p0;

import kotlin.jvm.internal.m;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends q {
    public c Q;

    @Override // z1.q
    public final boolean I0() {
        return false;
    }

    @Override // z1.q
    public final void L0() {
        c cVar = this.Q;
        if (cVar != null) {
            cVar.f46246a.k(this);
        }
        if (cVar != null) {
            cVar.f46246a.c(this);
        }
        this.Q = cVar;
    }

    @Override // z1.q
    public final void M0() {
        c cVar = this.Q;
        if (cVar != null) {
            m.d(cVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            cVar.f46246a.k(this);
        }
    }
}
