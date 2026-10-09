package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgz extends zzos {
    public final boolean k() {
        h();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f13202a.f13094a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void l(String str, zzot zzotVar, com.google.android.gms.internal.measurement.zzib zzibVar, zzgw zzgwVar) {
        String str2;
        String str3 = zzotVar.f13563a;
        zzic zzicVar = this.f13202a;
        g();
        h();
        try {
            URL url = new URI(str3).toURL();
            this.f13552b.k0();
            byte[] bArrB = zzibVar.b();
            zzhz zzhzVar = zzicVar.f13100g;
            zzic.m(zzhzVar);
            Map map = zzotVar.f13564b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                zzhzVar.s(new zzgy(this, str2, url, bArrB, map, zzgwVar));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                zzgu zzguVar = zzicVar.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12942f.c(zzgu.o(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final void j() {
    }
}
