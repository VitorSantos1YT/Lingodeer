package js;

import androidx.lifecycle.livedata.HeRS.DytezVyM;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f36738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36739c;

    public b(long j11, List list, boolean z11) {
        this.f36737a = list;
        this.f36738b = z11;
        this.f36739c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.m.a(this.f36737a, bVar.f36737a) && this.f36738b == bVar.f36738b && this.f36739c == bVar.f36739c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f36739c) + defpackage.e.e(this.f36737a.hashCode() * 31, 31, this.f36738b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(levels=");
        sb2.append(this.f36737a);
        sb2.append(", isEmpty=");
        sb2.append(this.f36738b);
        sb2.append(DytezVyM.YLdYOS);
        return defpackage.e.i(this.f36739c, ")", sb2);
    }
}
