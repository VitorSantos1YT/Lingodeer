package kv;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f38784c;

    public n(List list, String title, String content) {
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(content, "content");
        this.f38782a = title;
        this.f38783b = content;
        this.f38784c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.m.a(this.f38782a, nVar.f38782a) && kotlin.jvm.internal.m.a(this.f38783b, nVar.f38783b) && kotlin.jvm.internal.m.a(this.f38784c, nVar.f38784c);
    }

    public final int hashCode() {
        return this.f38784c.hashCode() + defpackage.e.d(this.f38782a.hashCode() * 31, 31, this.f38783b);
    }

    public final String toString() {
        return b7.e0.n(defpackage.e.s("Note(title=", this.f38782a, ", content=", this.f38783b, ", readingChanges="), this.f38784c, ")");
    }
}
