package kb;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import fb.l;
import h1.t5;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f38041a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f38042b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f38043c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static NetworkCapabilities f38044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f38045e;

    public final t5 a(ConnectivityManager connectivityManager, NetworkRequest networkRequest, a0.e eVar) {
        NetworkCapabilities networkCapabilities;
        synchronized (f38042b) {
            try {
                LinkedHashMap linkedHashMap = f38043c;
                boolean zIsEmpty = linkedHashMap.isEmpty();
                linkedHashMap.put(eVar, networkRequest);
                if (zIsEmpty) {
                    l lVarB = l.b();
                    int i11 = k.f38047a;
                    lVarB.getClass();
                    connectivityManager.registerDefaultNetworkCallback(this);
                }
                l lVarB2 = l.b();
                int i12 = k.f38047a;
                lVarB2.getClass();
                f38041a.getClass();
                if (f38045e) {
                    networkCapabilities = f38044d;
                } else {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    f38044d = networkCapabilities;
                    f38045e = true;
                }
                eVar.invoke(networkRequest.canBeSatisfiedBy(networkCapabilities) ? a.f38028a : new b(7));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new t5(eVar, connectivityManager, this, 3);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        m.f(network, "network");
        m.f(networkCapabilities, "networkCapabilities");
        l lVarB = l.b();
        int i11 = k.f38047a;
        lVarB.getClass();
        synchronized (f38042b) {
            try {
                f38044d = networkCapabilities;
                for (Map.Entry entry : f38043c.entrySet()) {
                    ((fz.c) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? a.f38028a : new b(7));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        m.f(network, "network");
        l lVarB = l.b();
        int i11 = k.f38047a;
        lVarB.getClass();
        synchronized (f38042b) {
            f38044d = null;
            Iterator it = f38043c.keySet().iterator();
            while (it.hasNext()) {
                ((fz.c) it.next()).invoke(new b(7));
            }
        }
    }
}
