package kb;

import android.net.ConnectivityManager;
import kotlin.jvm.internal.m;
import ob.p;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements lb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f38036a;

    public f(ConnectivityManager connectivityManager) {
        this.f38036a = connectivityManager;
    }

    @Override // lb.d
    public final uz.c a(fb.f constraints) {
        m.f(constraints, "constraints");
        return x0.g(new fr.c(25, constraints, this, (vy.d) null));
    }

    @Override // lb.d
    public final boolean b(p pVar) {
        if (c(pVar)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    @Override // lb.d
    public final boolean c(p workSpec) {
        m.f(workSpec, "workSpec");
        return workSpec.f44857j.a() != null;
    }
}
