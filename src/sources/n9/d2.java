package n9;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d2 f43537d = new d2(0, ry.r.f50854a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f43538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f43539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43540c;

    public d2(int[] originalPageOffsets, List data, int i11) {
        kotlin.jvm.internal.m.f(originalPageOffsets, "originalPageOffsets");
        kotlin.jvm.internal.m.f(data, "data");
        this.f43538a = originalPageOffsets;
        this.f43539b = data;
        this.f43540c = i11;
        if (originalPageOffsets.length == 0) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d2.class != obj.getClass()) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return Arrays.equals(this.f43538a, d2Var.f43538a) && kotlin.jvm.internal.m.a(this.f43539b, d2Var.f43539b) && this.f43540c == d2Var.f43540c;
    }

    public final int hashCode() {
        return (hh.p0.b(Arrays.hashCode(this.f43538a) * 31, 31, this.f43539b) + this.f43540c) * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransformablePage(originalPageOffsets=");
        sb2.append(Arrays.toString(this.f43538a));
        sb2.append(", data=");
        sb2.append(this.f43539b);
        sb2.append(", hintOriginalPageOffset=");
        return hh.p0.i(this.f43540c, ", hintOriginalIndices=null)", sb2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d2(int i11, List data) {
        this(new int[]{i11}, data, i11);
        kotlin.jvm.internal.m.f(data, "data");
    }
}
