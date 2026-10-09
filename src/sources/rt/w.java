package rt;

import java.util.ArrayList;
import java.util.List;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f50558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f50559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f50560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f50561d;

    public w(ArrayList arrayList, ArrayList arrayList2, List list, List list2) {
        this.f50558a = arrayList;
        this.f50559b = arrayList2;
        this.f50560c = list;
        this.f50561d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f50558a.equals(wVar.f50558a) && this.f50559b.equals(wVar.f50559b) && this.f50560c.equals(wVar.f50560c) && this.f50561d.equals(wVar.f50561d);
    }

    public final int hashCode() {
        return this.f50561d.hashCode() + hh.p0.b(nv.p.b(this.f50559b, this.f50558a.hashCode() * 31, 31), 31, this.f50560c);
    }

    public final String toString() {
        return "Success(allACKs=" + this.f50558a + ", starredACKs=" + this.f50559b + ", allUnitItems=" + this.f50560c + aYZzTH.pzFekJBMtLSUbj + this.f50561d + ")";
    }
}
