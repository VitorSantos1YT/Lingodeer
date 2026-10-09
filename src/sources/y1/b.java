package y1;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f56813b;

    public b(int i11, jh.h hVar, Integer num) {
        this.f56812a = i11;
        this.f56813b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f56812a == bVar.f56812a && m.a(null, null) && m.a(this.f56813b, bVar.f56813b);
    }

    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f56812a) * 31) + 0) * 31;
        Integer num = this.f56813b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f56812a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f56813b + ')';
    }
}
