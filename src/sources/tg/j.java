package tg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f52293e = new j(null, null, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.y0 f52294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1.r f52295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v3.o f52296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f52297d;

    public j(j3.y0 y0Var, z1.r rVar, v3.o oVar, Boolean bool) {
        this.f52294a = y0Var;
        this.f52295b = rVar;
        this.f52296c = oVar;
        this.f52297d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.f52294a, jVar.f52294a) && kotlin.jvm.internal.m.a(this.f52295b, jVar.f52295b) && kotlin.jvm.internal.m.a(this.f52296c, jVar.f52296c) && kotlin.jvm.internal.m.a(this.f52297d, jVar.f52297d);
    }

    public final int hashCode() {
        j3.y0 y0Var = this.f52294a;
        int iHashCode = (y0Var == null ? 0 : y0Var.hashCode()) * 31;
        z1.r rVar = this.f52295b;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        v3.o oVar = this.f52296c;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : Long.hashCode(oVar.f53502a))) * 31;
        Boolean bool = this.f52297d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CodeBlockStyle(textStyle=" + this.f52294a + ", modifier=" + this.f52295b + ", padding=" + this.f52296c + ", wordWrap=" + this.f52297d + ")";
    }
}
