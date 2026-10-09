package zu;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f59429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f59430b;

    public h0(ArrayList arrayList, List list) {
        this.f59429a = list;
        this.f59430b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f59429a.equals(h0Var.f59429a) && this.f59430b.equals(h0Var.f59430b);
    }

    public final int hashCode() {
        return this.f59430b.hashCode() + (this.f59429a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(followingUsers=" + this.f59429a + ", followerUsers=" + this.f59430b + ")";
    }
}
