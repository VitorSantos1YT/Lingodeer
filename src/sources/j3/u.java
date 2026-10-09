package j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f35795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uu.e f35796c;

    public u(String str, v0 v0Var, uu.e eVar) {
        this.f35794a = str;
        this.f35795b = v0Var;
        this.f35796c = eVar;
    }

    @Override // j3.w
    public final uu.e a() {
        return this.f35796c;
    }

    @Override // j3.w
    public final v0 b() {
        return this.f35795b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.m.a(this.f35794a, uVar.f35794a) && kotlin.jvm.internal.m.a(this.f35795b, uVar.f35795b) && kotlin.jvm.internal.m.a(this.f35796c, uVar.f35796c);
    }

    public final int hashCode() {
        int iHashCode = this.f35794a.hashCode() * 31;
        v0 v0Var = this.f35795b;
        int iHashCode2 = (iHashCode + (v0Var != null ? v0Var.hashCode() : 0)) * 31;
        uu.e eVar = this.f35796c;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return hh.p0.o(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f35794a, ')');
    }
}
