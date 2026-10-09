package sw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import lw.m0;
import lw.o0;
import mw.b4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f51910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f51911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51912c;

    public y(ArrayList arrayList, AtomicInteger atomicInteger) {
        Preconditions.e("empty list", !arrayList.isEmpty());
        this.f51910a = arrayList;
        Preconditions.k(atomicInteger, "index");
        this.f51911b = atomicInteger;
        int size = arrayList.size();
        int iHashCode = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            iHashCode += ((o0) obj).hashCode();
        }
        this.f51912c = iHashCode;
    }

    @Override // lw.o0
    public final m0 a(b4 b4Var) {
        int andIncrement = this.f51911b.getAndIncrement() & Integer.MAX_VALUE;
        ArrayList arrayList = this.f51910a;
        return ((o0) arrayList.get(andIncrement % arrayList.size())).a(b4Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        ArrayList arrayList = yVar.f51910a;
        if (yVar == this) {
            return true;
        }
        if (this.f51912c != yVar.f51912c || this.f51911b != yVar.f51911b) {
            return false;
        }
        ArrayList arrayList2 = this.f51910a;
        return arrayList2.size() == arrayList.size() && new HashSet(arrayList2).containsAll(arrayList);
    }

    public final int hashCode() {
        return this.f51912c;
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper(y.class.getSimpleName());
        toStringHelper.c(this.f51910a, "subchannelPickers");
        return toStringHelper.toString();
    }
}
