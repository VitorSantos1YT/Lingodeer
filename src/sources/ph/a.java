package ph;

import hh.p0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f46838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f46839d;

    public a(String difficulty, boolean z11, List selectedTags, List selectedStatusTags) {
        kotlin.jvm.internal.m.f(difficulty, "difficulty");
        kotlin.jvm.internal.m.f(selectedTags, "selectedTags");
        kotlin.jvm.internal.m.f(selectedStatusTags, "selectedStatusTags");
        this.f46836a = difficulty;
        this.f46837b = z11;
        this.f46838c = selectedTags;
        this.f46839d = selectedStatusTags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.f46836a, aVar.f46836a) && this.f46837b == aVar.f46837b && kotlin.jvm.internal.m.a(this.f46838c, aVar.f46838c) && kotlin.jvm.internal.m.a(this.f46839d, aVar.f46839d);
    }

    public final int hashCode() {
        return this.f46839d.hashCode() + p0.b(defpackage.e.e(this.f46836a.hashCode() * 31, 31, this.f46837b), 31, this.f46838c);
    }

    public final String toString() {
        return "CategoryDetailParams(difficulty=" + this.f46836a + ", hasPurchased=" + this.f46837b + ", selectedTags=" + this.f46838c + ", selectedStatusTags=" + this.f46839d + ")";
    }
}
