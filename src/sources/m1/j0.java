package m1;

import com.tbruyelle.rxpermissions3.BuildConfig;
import l1.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40794b;

    public j0(int i11, int i12) {
        this.f40793a = i11;
        this.f40794b = i12;
    }

    public abstract void a(d1.t tVar, l1.d dVar, p2 p2Var, t1.j jVar, k0 k0Var);

    public l1.b b(d1.t tVar) {
        return null;
    }

    public final String toString() {
        String strG = kotlin.jvm.internal.z.a(getClass()).g();
        return strG == null ? BuildConfig.VERSION_NAME : strG;
    }

    public /* synthetic */ j0(int i11, int i12, int i13) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
    }
}
