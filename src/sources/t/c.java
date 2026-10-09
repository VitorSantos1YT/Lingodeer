package t;

import java.util.Map;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f51967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f51968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f51969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f51970d;

    public c(Object obj, Object obj2) {
        this.f51967a = obj;
        this.f51968b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f51967a.equals(cVar.f51967a) && this.f51968b.equals(cVar.f51968b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f51967a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f51968b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f51967a.hashCode() ^ this.f51968b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f51967a + PQgum.kLiJKDA + this.f51968b;
    }
}
