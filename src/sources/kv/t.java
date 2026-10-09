package kv;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f38815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f38816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f38817c;

    public t(x0 x0Var, x0 x0Var2, List list) {
        this.f38815a = x0Var;
        this.f38816b = x0Var2;
        this.f38817c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.m.a(this.f38815a, tVar.f38815a) && kotlin.jvm.internal.m.a(this.f38816b, tVar.f38816b) && kotlin.jvm.internal.m.a(this.f38817c, tVar.f38817c);
    }

    public final int hashCode() {
        return this.f38817c.hashCode() + ((this.f38816b.hashCode() + (this.f38815a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Note(title=");
        sb2.append(this.f38815a);
        sb2.append(", content=");
        sb2.append(this.f38816b);
        sb2.append(", readingChanges=");
        return b7.e0.n(sb2, this.f38817c, ")");
    }
}
