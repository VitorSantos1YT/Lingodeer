package y6;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0 f57369b = new v0(ImmutableList.s());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList f57370a;

    static {
        b7.f0.G(0);
    }

    public v0(List list) {
        this.f57370a = ImmutableList.n(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(int i11) {
        int i12 = 0;
        while (true) {
            ImmutableList immutableList = this.f57370a;
            if (i12 >= immutableList.size()) {
                return false;
            }
            u0 u0Var = (u0) immutableList.get(i12);
            for (boolean z11 : u0Var.f57367e) {
                if (z11) {
                    if (u0Var.f57364b.f57306c != i11) {
                        break;
                    }
                    return true;
                }
            }
            i12++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        return this.f57370a.equals(((v0) obj).f57370a);
    }

    public final int hashCode() {
        return this.f57370a.hashCode();
    }
}
