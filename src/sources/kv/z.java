package kv;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f38836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38837b;

    public z(x0 x0Var, List list) {
        this.f38836a = x0Var;
        this.f38837b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.m.a(this.f38836a, zVar.f38836a) && kotlin.jvm.internal.m.a(this.f38837b, zVar.f38837b);
    }

    public final int hashCode() {
        return this.f38837b.hashCode() + (this.f38836a.hashCode() * 31);
    }

    public final String toString() {
        return "JPIntroSectionContent(title=" + this.f38836a + ", blocks=" + this.f38837b + ")";
    }
}
