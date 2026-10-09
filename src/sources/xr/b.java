package xr;

import com.lingodeer.data.model.CourseCharacterGroup;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseCharacterGroup f56211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56212b;

    public b(CourseCharacterGroup group, int i11) {
        m.f(group, "group");
        this.f56211a = group;
        this.f56212b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f56211a, bVar.f56211a) && this.f56212b == bVar.f56212b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f56212b) + (this.f56211a.hashCode() * 31);
    }

    public final String toString() {
        return "RadicalItem(group=" + this.f56211a + ", count=" + this.f56212b + ")";
    }
}
