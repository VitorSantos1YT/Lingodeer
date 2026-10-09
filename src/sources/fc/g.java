package fc;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import fb.l;
import kb.k;
import pe.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f27140c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f27142b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f27141a = i11;
        this.f27142b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f27141a) {
            case 0:
                xq.c.l((xq.c) this.f27142b, network, true);
                break;
            case 1:
                m.f().post(new h9.b(this, true, 1));
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        int i11 = this.f27141a;
        Object obj = this.f27142b;
        switch (i11) {
            case 2:
                kotlin.jvm.internal.m.f(network, "network");
                kotlin.jvm.internal.m.f(networkCapabilities, "networkCapabilities");
                l lVarB = l.b();
                int i12 = k.f38047a;
                lVarB.getClass();
                ((a0.e) obj).invoke(kb.a.f38028a);
                break;
            case 3:
                kotlin.jvm.internal.m.f(network, "network");
                kotlin.jvm.internal.m.f(networkCapabilities, "capabilities");
                l lVarB2 = l.b();
                int i13 = mb.g.f41113a;
                networkCapabilities.toString();
                lVarB2.getClass();
                mb.f fVar = (mb.f) obj;
                fVar.d(Build.VERSION.SDK_INT >= 28 ? new kb.g(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)) : mb.g.a(fVar.f41111f));
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i11 = this.f27141a;
        Object obj = this.f27142b;
        switch (i11) {
            case 0:
                xq.c.l((xq.c) obj, network, false);
                break;
            case 1:
                m.f().post(new h9.b(this, false, 1));
                break;
            case 2:
                kotlin.jvm.internal.m.f(network, "network");
                l lVarB = l.b();
                int i12 = k.f38047a;
                lVarB.getClass();
                ((a0.e) obj).invoke(new kb.b(7));
                break;
            default:
                kotlin.jvm.internal.m.f(network, "network");
                l lVarB2 = l.b();
                int i13 = mb.g.f41113a;
                lVarB2.getClass();
                mb.f fVar = (mb.f) obj;
                fVar.d(mb.g.a(fVar.f41111f));
                break;
        }
    }

    public g(a0.e eVar) {
        this.f27141a = 2;
        this.f27142b = eVar;
    }
}
