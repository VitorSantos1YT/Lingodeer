package rt;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f49521a = 0;

    static {
        ry.l.m0(new x8[]{x8.CHARACTER, x8.WORD, x8.SENTENCE});
    }

    public static final rs.a a(x8 x8Var, Set set) {
        int i11 = a7.f49445a[x8Var.ordinal()];
        if (i11 == 1) {
            return new rs.a(null, null, set, 3);
        }
        if (i11 == 2) {
            return new rs.a(set, null, null, 6);
        }
        if (i11 == 3) {
            return new rs.a(null, set, null, 5);
        }
        if (i11 == 4) {
            return new rs.a(null, null, null, 7);
        }
        throw new NoWhenBranchMatchedException();
    }
}
