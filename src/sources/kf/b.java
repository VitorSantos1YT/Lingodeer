package kf;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.util.HashMap;
import kotlin.jvm.internal.m;
import lf.e0;
import lf.f1;
import lf.h0;
import oz.x;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f38144a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f38145b = new HashMap();

    public static final void a(String str) {
        if (qf.a.b(b.class)) {
            return;
        }
        try {
            b bVar = f38144a;
            HashMap map = f38145b;
            if (qf.a.b(bVar)) {
                return;
            }
            try {
                NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) map.get(str);
                if (registrationListener != null) {
                    Object systemService = s.a().getSystemService("servicediscovery");
                    m.d(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
                    try {
                        ((NsdManager) systemService).unregisterService(registrationListener);
                    } catch (IllegalArgumentException unused) {
                        s sVar = s.f49201a;
                    }
                    map.remove(str);
                    return;
                }
                return;
            } catch (Throwable th2) {
                qf.a.a(bVar, th2);
                return;
            }
            qf.a.a(b.class, th);
        } catch (Throwable th3) {
            qf.a.a(b.class, th3);
        }
    }

    public static final boolean b() {
        if (qf.a.b(b.class)) {
            return false;
        }
        try {
            e0 e0VarB = h0.b(s.b());
            return e0VarB != null && e0VarB.f40001e.contains(f1.Enabled);
        } catch (Throwable th2) {
            qf.a.a(b.class, th2);
            return false;
        }
    }

    public final boolean c(String str) {
        if (qf.a.b(this)) {
            return false;
        }
        try {
            HashMap map = f38145b;
            if (map.containsKey(str)) {
                return true;
            }
            s sVar = s.f49201a;
            String str2 = "fbsdk_" + "android-".concat(x.p0("18.1.3", '.', '|')) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = s.a().getSystemService("servicediscovery");
            m.d(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
            a aVar = new a(str2, str);
            map.put(str, aVar);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, aVar);
            return true;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return false;
        }
    }
}
