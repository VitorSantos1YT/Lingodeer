package s2;

import y2.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f51336a;

    public n(a aVar) {
        this.f51336a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f51336a.equals(((n) obj).f51336a);
    }

    @Override // y2.d1
    public final z1.q f() {
        return new o(this.f51336a, null);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f51336a.f51281b * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        o oVar = (o) qVar;
        a aVar = oVar.R;
        a aVar2 = this.f51336a;
        if (kotlin.jvm.internal.m.a(aVar, aVar2)) {
            return;
        }
        oVar.R = aVar2;
        if (oVar.S) {
            oVar.V0();
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f51336a + ", overrideDescendants=false)";
    }
}
