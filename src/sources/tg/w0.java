package tg;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f52389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f52390b;

    public w0(ArrayList arrayList, ArrayList arrayList2) {
        this.f52389a = arrayList;
        this.f52390b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f52389a.equals(w0Var.f52389a) && this.f52390b.equals(w0Var.f52390b);
    }

    public final int hashCode() {
        return this.f52390b.hashCode() + (this.f52389a.hashCode() * 31);
    }

    public final String toString() {
        return "TableLayoutResult(rowOffsets=" + this.f52389a + ", columnOffsets=" + this.f52390b + ")";
    }
}
