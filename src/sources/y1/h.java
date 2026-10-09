package y1;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f56819b;

    public h(int i11, Integer num) {
        this.f56818a = i11;
        this.f56819b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f56818a == hVar.f56818a && m.a(this.f56819b, hVar.f56819b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f56818a) * 31;
        Integer num = this.f56819b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f56818a + ", dataOffset=" + this.f56819b + ')';
    }
}
