package gq;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f29595a;

    public i(Context context) {
        Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f29595a = (ConnectivityManager) systemService;
    }

    public final boolean a() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f29595a;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }
}
