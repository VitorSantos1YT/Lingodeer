package pb;

import android.net.NetworkRequest;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static int[] a(NetworkRequest request) {
        kotlin.jvm.internal.m.f(request, "request");
        int[] capabilities = request.getCapabilities();
        kotlin.jvm.internal.m.e(capabilities, "request.capabilities");
        return capabilities;
    }

    public static int[] b(NetworkRequest request) {
        kotlin.jvm.internal.m.f(request, "request");
        int[] transportTypes = request.getTransportTypes();
        kotlin.jvm.internal.m.e(transportTypes, "request.transportTypes");
        return transportTypes;
    }
}
