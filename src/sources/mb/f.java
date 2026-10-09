package mb;

import android.content.Context;
import android.net.ConnectivityManager;
import fb.l;
import j9.r;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f41111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fc.g f41112g;

    public f(Context context, qb.a aVar) {
        super(context, aVar);
        Object systemService = ((Context) this.f36246b).getSystemService("connectivity");
        m.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f41111f = (ConnectivityManager) systemService;
        this.f41112g = new fc.g(this, 3);
    }

    @Override // j9.r
    public final Object c() {
        return g.a(this.f41111f);
    }

    @Override // j9.r
    public final void e() {
        try {
            l lVarB = l.b();
            int i11 = g.f41113a;
            lVarB.getClass();
            ConnectivityManager connectivityManager = this.f41111f;
            fc.g networkCallback = this.f41112g;
            m.f(connectivityManager, "<this>");
            m.f(networkCallback, "networkCallback");
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
        } catch (IllegalArgumentException unused) {
            l lVarB2 = l.b();
            int i12 = g.f41113a;
            lVarB2.getClass();
        } catch (SecurityException unused2) {
            l lVarB3 = l.b();
            int i13 = g.f41113a;
            lVarB3.getClass();
        }
    }

    @Override // j9.r
    public final void f() {
        try {
            l lVarB = l.b();
            int i11 = g.f41113a;
            lVarB.getClass();
            ConnectivityManager connectivityManager = this.f41111f;
            fc.g networkCallback = this.f41112g;
            m.f(connectivityManager, "<this>");
            m.f(networkCallback, "networkCallback");
            connectivityManager.unregisterNetworkCallback(networkCallback);
        } catch (IllegalArgumentException unused) {
            l lVarB2 = l.b();
            int i12 = g.f41113a;
            lVarB2.getClass();
        } catch (SecurityException unused2) {
            l lVarB3 = l.b();
            int i13 = g.f41113a;
            lVarB3.getClass();
        }
    }
}
