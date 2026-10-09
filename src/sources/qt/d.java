package qt;

import hh.p0;
import java.util.ArrayList;
import java.util.List;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f48321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f48323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f48324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f48325e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(c cVar, long j11, f fVar, List list, ArrayList arrayList, int i11) {
        int i12 = i11 & 8;
        r rVar = r.f50854a;
        this(cVar, j11, fVar, i12 != 0 ? rVar : list, (i11 & 16) != 0 ? rVar : arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f48321a == dVar.f48321a && this.f48322b == dVar.f48322b && this.f48323c == dVar.f48323c && kotlin.jvm.internal.m.a(this.f48324d, dVar.f48324d) && kotlin.jvm.internal.m.a(this.f48325e, dVar.f48325e);
    }

    public final int hashCode() {
        return this.f48325e.hashCode() + p0.b((this.f48323c.hashCode() + defpackage.e.f(this.f48322b, this.f48321a.hashCode() * 31, 31)) * 31, 31, this.f48324d);
    }

    public final String toString() {
        return "EnhancedTestModel(elemType=" + this.f48321a + ", elemId=" + this.f48322b + ", modelType=" + this.f48323c + ", optionIds=" + this.f48324d + ", typeList=" + this.f48325e + ")";
    }

    public d(c elemType, long j11, f modelType, List optionIds, List typeList) {
        kotlin.jvm.internal.m.f(elemType, "elemType");
        kotlin.jvm.internal.m.f(modelType, "modelType");
        kotlin.jvm.internal.m.f(optionIds, "optionIds");
        kotlin.jvm.internal.m.f(typeList, "typeList");
        this.f48321a = elemType;
        this.f48322b = j11;
        this.f48323c = modelType;
        this.f48324d = optionIds;
        this.f48325e = typeList;
    }
}
