package kv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f38823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f38825c;

    public v(x0 x0Var, String str, a0 style) {
        kotlin.jvm.internal.m.f(style, "style");
        this.f38823a = x0Var;
        this.f38824b = str;
        this.f38825c = style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.m.a(this.f38823a, vVar.f38823a) && kotlin.jvm.internal.m.a(this.f38824b, vVar.f38824b) && this.f38825c == vVar.f38825c;
    }

    public final int hashCode() {
        int iHashCode = this.f38823a.hashCode() * 31;
        String str = this.f38824b;
        return this.f38825c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Subtitle(title=" + this.f38823a + ", number=" + this.f38824b + ", style=" + this.f38825c + ")";
    }
}
