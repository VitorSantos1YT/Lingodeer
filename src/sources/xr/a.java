package xr;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f56210b;

    public a(int i11, ArrayList arrayList) {
        this.f56209a = i11;
        this.f56210b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f56209a == aVar.f56209a && this.f56210b.equals(aVar.f56210b);
    }

    public final int hashCode() {
        return this.f56210b.hashCode() + (Integer.hashCode(this.f56209a) * 31);
    }

    public final String toString() {
        return "HskLevelSection(level=" + this.f56209a + ", decks=" + this.f56210b + ")";
    }
}
