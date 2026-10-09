package tg;

import j0.t1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f52249d = new a0(null, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f52250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.f f52251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.f f52252c;

    public a0(t1 t1Var, fz.f fVar, fz.f fVar2) {
        this.f52250a = t1Var;
        this.f52251b = fVar;
        this.f52252c = fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.m.a(this.f52250a, a0Var.f52250a) && kotlin.jvm.internal.m.a(this.f52251b, a0Var.f52251b) && kotlin.jvm.internal.m.a(this.f52252c, a0Var.f52252c);
    }

    public final int hashCode() {
        t1 t1Var = this.f52250a;
        int iHashCode = (t1Var == null ? 0 : t1Var.hashCode()) * 31;
        fz.f fVar = this.f52251b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        fz.f fVar2 = this.f52252c;
        return iHashCode2 + (fVar2 != null ? fVar2.hashCode() : 0);
    }

    public final String toString() {
        return "InfoPanelStyle(contentPadding=" + this.f52250a + ", background=" + this.f52251b + ", textStyle=" + this.f52252c + ")";
    }
}
