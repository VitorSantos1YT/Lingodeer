package kv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f38803c;

    public p(String title, String str, a0 style) {
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(style, "style");
        this.f38801a = title;
        this.f38802b = str;
        this.f38803c = style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.f38801a, pVar.f38801a) && kotlin.jvm.internal.m.a(this.f38802b, pVar.f38802b) && this.f38803c == pVar.f38803c;
    }

    public final int hashCode() {
        int iHashCode = this.f38801a.hashCode() * 31;
        String str = this.f38802b;
        return this.f38803c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("Subtitle(title=", this.f38801a, ", number=", this.f38802b, ", style=");
        sbS.append(this.f38803c);
        sbS.append(")");
        return sbS.toString();
    }
}
