package x2;

import l1.k1;
import l1.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ve.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f55761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f55762e = t.B(null);

    public i(h hVar) {
        this.f55761d = hVar;
    }

    @Override // ve.i
    public final boolean n(h hVar) {
        return hVar == this.f55761d;
    }

    @Override // ve.i
    public final Object q(h hVar) {
        if (hVar != this.f55761d) {
            v2.a.b("Check failed.");
        }
        Object value = this.f55762e.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
