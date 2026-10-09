package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;
import qy.l;
import ry.t;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbe {
    public zzbe() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            m.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzqi.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzqi.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzqi.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzqi.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzqi.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return t.f50856a;
        }
    }

    private static final Map zzb() {
        LinkedHashMap linkedHashMapA0 = x.a0(new l(0, zzqi.NET_CAPABILITY_MMS), new l(1, zzqi.NET_CAPABILITY_SUPL), new l(2, zzqi.NET_CAPABILITY_DUN), new l(3, zzqi.NET_CAPABILITY_FOTA), new l(4, zzqi.NET_CAPABILITY_IMS), new l(5, zzqi.NET_CAPABILITY_CBS), new l(6, zzqi.NET_CAPABILITY_WIFI_P2P), new l(7, zzqi.NET_CAPABILITY_IA), new l(8, zzqi.NET_CAPABILITY_RCS), new l(9, zzqi.NET_CAPABILITY_XCAP), new l(10, zzqi.NET_CAPABILITY_EIMS), new l(11, zzqi.zzm), new l(12, zzqi.NET_CAPABILITY_INTERNET), new l(13, zzqi.NET_CAPABILITY_NOT_RESTRICTED), new l(14, zzqi.NET_CAPABILITY_TRUSTED), new l(15, zzqi.NET_CAPABILITY_NOT_VPN));
        int i11 = Build.VERSION.SDK_INT;
        linkedHashMapA0.put(17, zzqi.NET_CAPABILITY_CAPTIVE_PORTAL);
        linkedHashMapA0.put(16, zzqi.NET_CAPABILITY_VALIDATED);
        if (i11 >= 28) {
            linkedHashMapA0.put(18, zzqi.NET_CAPABILITY_NOT_ROAMING);
            linkedHashMapA0.put(19, zzqi.NET_CAPABILITY_FOREGROUND);
            linkedHashMapA0.put(20, zzqi.NET_CAPABILITY_NOT_CONGESTED);
            linkedHashMapA0.put(21, zzqi.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i11 >= 29) {
            linkedHashMapA0.put(23, zzqi.NET_CAPABILITY_MCX);
        }
        if (i11 >= 30) {
            linkedHashMapA0.put(25, zzqi.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i11 >= 31) {
            linkedHashMapA0.put(32, zzqi.NET_CAPABILITY_HEAD_UNIT);
            linkedHashMapA0.put(29, zzqi.NET_CAPABILITY_ENTERPRISE);
        }
        if (i11 >= 33) {
            linkedHashMapA0.put(35, zzqi.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            linkedHashMapA0.put(34, zzqi.NET_CAPABILITY_PRIORITIZE_LATENCY);
            linkedHashMapA0.put(33, zzqi.NET_CAPABILITY_MMTEL);
        }
        return linkedHashMapA0;
    }
}
