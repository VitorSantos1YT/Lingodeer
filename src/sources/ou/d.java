package ou;

import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46078b;

    public d(int i11, List strokeIndices) {
        m.f(strokeIndices, "strokeIndices");
        this.f46077a = i11;
        this.f46078b = strokeIndices;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f46077a == dVar.f46077a && m.a(this.f46078b, dVar.f46078b);
    }

    public final int hashCode() {
        return this.f46078b.hashCode() + (Integer.hashCode(this.f46077a) * 31);
    }

    public final String toString() {
        return "HanziStrokeGroup(medianIndex=" + this.f46077a + ", strokeIndices=" + this.f46078b + ")";
    }
}
