package kc;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gc.c f38055a = new gc.c();

    public static final boolean a(gc.i iVar) {
        int i11 = e.f38054a[iVar.f29022e.ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            return true;
        }
        if (i11 == 3) {
            return iVar.f29041y.f28993a == null && (iVar.f29038v instanceof hc.c);
        }
        throw new NoWhenBranchMatchedException();
    }
}
