package n9;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f43556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43558e;

    public f1(int i11, ArrayList arrayList, int i12, int i13) {
        this.f43555b = i11;
        this.f43556c = arrayList;
        this.f43557d = i12;
        this.f43558e = i13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return this.f43555b == f1Var.f43555b && this.f43556c.equals(f1Var.f43556c) && this.f43557d == f1Var.f43557d && this.f43558e == f1Var.f43558e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43558e) + Integer.hashCode(this.f43557d) + this.f43556c.hashCode() + Integer.hashCode(this.f43555b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PagingDataEvent.Append loaded ");
        ArrayList arrayList = this.f43556c;
        sb2.append(arrayList.size());
        sb2.append(" items (\n                    |   startIndex: ");
        sb2.append(this.f43555b);
        sb2.append("\n                    |   first item: ");
        sb2.append(ry.m.s0(arrayList));
        sb2.append("\n                    |   last item: ");
        sb2.append(ry.m.A0(arrayList));
        sb2.append("\n                    |   newPlaceholdersBefore: ");
        sb2.append(this.f43557d);
        sb2.append("\n                    |   oldPlaceholdersBefore: ");
        sb2.append(this.f43558e);
        sb2.append("\n                    |)\n                    |");
        return oz.r.h0(sb2.toString());
    }
}
