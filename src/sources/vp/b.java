package vp;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f54079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f54082d;

    public b(ArrayList arrayList, boolean z11, boolean z12, boolean z13) {
        this.f54079a = arrayList;
        this.f54080b = z11;
        this.f54081c = z12;
        this.f54082d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f54079a.equals(bVar.f54079a) && this.f54080b == bVar.f54080b && this.f54081c == bVar.f54081c && this.f54082d == bVar.f54082d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54082d) + defpackage.e.e(defpackage.e.e(this.f54079a.hashCode() * 31, 31, this.f54080b), 31, this.f54081c);
    }

    public final String toString() {
        return "Success(reviews=" + this.f54079a + ", flashCardIsLearnChar=" + this.f54080b + ", flashCardIsLearnWord=" + this.f54081c + ", flashCardIsLearnSent=" + this.f54082d + ")";
    }
}
