package pb;

import android.app.Application;
import android.net.NetworkRequest;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static f a(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i11 : iArr) {
            try {
                builder.addCapability(i11);
            } catch (IllegalArgumentException unused) {
                fb.l lVarB = fb.l.b();
                int i12 = f.f46736b;
                int i13 = f.f46736b;
                lVarB.getClass();
            }
        }
        for (int i14 = 0; i14 < 3; i14++) {
            int i15 = g.f46738a[i14];
            if (!ry.l.C(iArr, i15)) {
                try {
                    builder.removeCapability(i15);
                } catch (IllegalArgumentException unused2) {
                    fb.l lVarB2 = fb.l.b();
                    int i16 = f.f46736b;
                    int i17 = f.f46736b;
                    lVarB2.getClass();
                }
            }
        }
        for (int i18 : iArr2) {
            builder.addTransportType(i18);
        }
        NetworkRequest networkRequestBuild = builder.build();
        kotlin.jvm.internal.m.e(networkRequestBuild, "networkRequest.build()");
        return new f(networkRequestBuild);
    }

    public static String b() {
        String processName = Application.getProcessName();
        kotlin.jvm.internal.m.e(processName, "getProcessName()");
        return processName;
    }

    public static boolean c(NetworkRequest request, int i11) {
        kotlin.jvm.internal.m.f(request, "request");
        return request.hasCapability(i11);
    }

    public static boolean d(NetworkRequest request, int i11) {
        kotlin.jvm.internal.m.f(request, "request");
        return request.hasTransport(i11);
    }
}
