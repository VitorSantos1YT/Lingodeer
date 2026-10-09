package n9;

import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f43591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43593d;

    public i1(ArrayList arrayList, int i11, int i12) {
        this.f43591b = arrayList;
        this.f43592c = i11;
        this.f43593d = i12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return this.f43591b.equals(i1Var.f43591b) && this.f43592c == i1Var.f43592c && this.f43593d == i1Var.f43593d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43593d) + Integer.hashCode(this.f43592c) + this.f43591b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PagingDataEvent.Prepend loaded ");
        ArrayList arrayList = this.f43591b;
        sb2.append(arrayList.size());
        sb2.append(" items (\n                    |   first item: ");
        sb2.append(ry.m.s0(arrayList));
        sb2.append(scqhIrGXy.PVLGBD);
        sb2.append(ry.m.A0(arrayList));
        sb2.append("\n                    |   newPlaceholdersBefore: ");
        sb2.append(this.f43592c);
        sb2.append("\n                    |   oldPlaceholdersBefore: ");
        sb2.append(this.f43593d);
        sb2.append("\n                    |)\n                    |");
        return oz.r.h0(sb2.toString());
    }
}
