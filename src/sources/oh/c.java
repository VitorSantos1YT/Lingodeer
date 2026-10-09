package oh;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f44915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44916b;

    public c(Map map, boolean z11) {
        this.f44915a = map;
        this.f44916b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f44915a.equals(cVar.f44915a) && this.f44916b == cVar.f44916b;
    }

    public final int hashCode() {
        return defpackage.e.e(defpackage.e.e(this.f44915a.hashCode() * 31, 31, this.f44916b), 31, false);
    }

    public final String toString() {
        return "Success(groupedLessons=" + this.f44915a + ", isEmpty=" + this.f44916b + ", isRefreshing=false, errorMessage=null)";
    }
}
