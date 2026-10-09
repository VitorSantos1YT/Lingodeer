package mf;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f41132b;

    public a(String name, boolean z11) {
        m.f(name, "name");
        this.f41131a = name;
        this.f41132b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f41131a, aVar.f41131a) && this.f41132b == aVar.f41132b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f41131a.hashCode() * 31;
        boolean z11 = this.f41132b;
        ?? r9 = z11;
        if (z11) {
            r9 = 1;
        }
        return iHashCode + r9;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GateKeeper(name=");
        sb2.append(this.f41131a);
        sb2.append(", value=");
        return ep.a.l(sb2, this.f41132b, ')');
    }
}
