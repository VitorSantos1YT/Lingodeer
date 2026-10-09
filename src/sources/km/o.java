package km;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f38249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f38250c;

    public o(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f38248a = arrayList;
        this.f38249b = arrayList2;
        this.f38250c = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f38248a.equals(oVar.f38248a) && this.f38249b.equals(oVar.f38249b) && this.f38250c.equals(oVar.f38250c);
    }

    public final int hashCode() {
        return this.f38250c.hashCode() + nv.p.b(this.f38249b, this.f38248a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MainTableData(rowHeaders=" + this.f38248a + ", columnHeaders=" + this.f38249b + ", cells=" + this.f38250c + ")";
    }
}
