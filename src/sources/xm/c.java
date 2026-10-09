package xm;

import hh.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f56113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f56114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f56115c;

    public c(ArrayList arrayList, List list, ArrayList arrayList2) {
        this.f56113a = arrayList;
        this.f56114b = list;
        this.f56115c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f56113a.equals(cVar.f56113a) && this.f56114b.equals(cVar.f56114b) && this.f56115c.equals(cVar.f56115c);
    }

    public final int hashCode() {
        return this.f56115c.hashCode() + p0.b(this.f56113a.hashCode() * 31, 31, this.f56114b);
    }

    public final String toString() {
        return "KOAlphabetTableData(rowHeaders=" + this.f56113a + ", columnHeaders=" + this.f56114b + ", data=" + this.f56115c + ")";
    }
}
