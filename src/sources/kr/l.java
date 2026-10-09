package kr;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f38515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f38517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f38518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f38519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f38521g;

    public l(n nVar, List users, List sentences, List list, j showType, int i11, float f5) {
        kotlin.jvm.internal.m.f(users, "users");
        kotlin.jvm.internal.m.f(sentences, "sentences");
        kotlin.jvm.internal.m.f(showType, "showType");
        this.f38515a = nVar;
        this.f38516b = users;
        this.f38517c = sentences;
        this.f38518d = list;
        this.f38519e = showType;
        this.f38520f = i11;
        this.f38521g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.m.a(this.f38515a, lVar.f38515a) && kotlin.jvm.internal.m.a(this.f38516b, lVar.f38516b) && kotlin.jvm.internal.m.a(this.f38517c, lVar.f38517c) && kotlin.jvm.internal.m.a(this.f38518d, lVar.f38518d) && this.f38519e == lVar.f38519e && this.f38520f == lVar.f38520f && Float.compare(this.f38521g, lVar.f38521g) == 0;
    }

    public final int hashCode() {
        n nVar = this.f38515a;
        return Float.hashCode(this.f38521g) + defpackage.e.b(this.f38520f, (this.f38519e.hashCode() + hh.p0.b(hh.p0.b(hh.p0.b((nVar == null ? 0 : nVar.hashCode()) * 31, 31, this.f38516b), 31, this.f38517c), 31, this.f38518d)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(currentUser=");
        sb2.append(this.f38515a);
        sb2.append(", users=");
        sb2.append(this.f38516b);
        sb2.append(", sentences=");
        sb2.append(this.f38517c);
        sb2.append(", picPaths=");
        sb2.append(this.f38518d);
        sb2.append(", showType=");
        sb2.append(this.f38519e);
        sb2.append(", currentSentenceIndex=");
        sb2.append(this.f38520f);
        sb2.append(", progress=");
        return nv.p.h(this.f38521g, ")", sb2);
    }
}
