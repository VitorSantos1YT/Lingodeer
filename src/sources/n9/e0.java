package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f43546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f43547b;

    public e0(x xVar, x xVar2) {
        this.f43546a = xVar;
        this.f43547b = xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.m.a(this.f43546a, e0Var.f43546a) && kotlin.jvm.internal.m.a(this.f43547b, e0Var.f43547b);
    }

    public final int hashCode() {
        int iHashCode = this.f43546a.hashCode() * 31;
        x xVar = this.f43547b;
        return iHashCode + (xVar == null ? 0 : xVar.hashCode());
    }

    public final String toString() {
        String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.f43546a + "\n                    ";
        x xVar = this.f43547b;
        if (xVar != null) {
            str = str + "|   mediatorLoadStates: " + xVar + '\n';
        }
        return oz.r.h0(str + "|)");
    }
}
