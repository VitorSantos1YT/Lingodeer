package e3;

import kotlin.jvm.internal.m;
import l2.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f24772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24773b;

    public a(e eVar, int i11) {
        this.f24772a = eVar;
        this.f24773b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f24772a, aVar.f24772a) && this.f24773b == aVar.f24773b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24773b) + (this.f24772a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb2.append(this.f24772a);
        sb2.append(", configFlags=");
        return ep.a.j(sb2, this.f24773b, ')');
    }
}
