package t2;

import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f52010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f52011b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f52010a == aVar.f52010a && Float.compare(this.f52011b, aVar.f52011b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f52011b) + (Long.hashCode(this.f52010a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f52010a);
        sb2.append(", dataPoint=");
        return e.o(sb2, this.f52011b, ')');
    }
}
