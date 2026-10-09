package gq;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f29593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tz.t f29594b;

    public h(i iVar, tz.t tVar) {
        this.f29593a = iVar;
        this.f29594b = tVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        kotlin.jvm.internal.m.f(network, "network");
        boolean zA = this.f29593a.a();
        network.toString();
        ((tz.s) this.f29594b).i(Boolean.valueOf(zA));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        kotlin.jvm.internal.m.f(network, "network");
        kotlin.jvm.internal.m.f(networkCapabilities, "networkCapabilities");
        boolean z11 = networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
        network.toString();
        ((tz.s) this.f29594b).i(Boolean.valueOf(z11));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        kotlin.jvm.internal.m.f(network, "network");
        boolean zA = this.f29593a.a();
        network.toString();
        ((tz.s) this.f29594b).i(Boolean.valueOf(zA));
    }
}
