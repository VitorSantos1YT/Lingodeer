package mw;

import com.google.common.base.MoreObjects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f1 extends lw.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lw.f f42419d;

    public f1(lw.f fVar) {
        this.f42419d = fVar;
    }

    @Override // lw.f
    public String e() {
        return this.f42419d.e();
    }

    @Override // lw.f
    public final void j() {
        this.f42419d.j();
    }

    @Override // lw.f
    public void n() {
        this.f42419d.n();
    }

    @Override // lw.f
    public void o(lw.y yVar) {
        this.f42419d.o(yVar);
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f42419d, "delegate");
        return toStringHelperB.toString();
    }
}
