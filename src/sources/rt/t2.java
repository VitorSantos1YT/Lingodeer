package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50417c;

    public t2(String str, String title, String subtitle) {
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(subtitle, "subtitle");
        this.f50415a = str;
        this.f50416b = title;
        this.f50417c = subtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return kotlin.jvm.internal.m.a(this.f50415a, t2Var.f50415a) && kotlin.jvm.internal.m.a(this.f50416b, t2Var.f50416b) && kotlin.jvm.internal.m.a(this.f50417c, t2Var.f50417c);
    }

    public final int hashCode() {
        return this.f50417c.hashCode() + defpackage.e.d(this.f50415a.hashCode() * 31, 31, this.f50416b);
    }

    public final String toString() {
        return ep.a.k(defpackage.e.s("SuggestionContent(unitName=", this.f50415a, ", title=", this.f50416b, ", subtitle="), this.f50417c, ")");
    }
}
