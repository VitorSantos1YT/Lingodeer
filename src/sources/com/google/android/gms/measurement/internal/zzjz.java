package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzjz implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzlj f13237a;

    public zzjz(zzlj zzljVar) {
        this.f13237a = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzx zzxVar = this.f13237a.f13337q;
        zzic zzicVar = zzxVar.f13674a;
        zzhz zzhzVar = zzicVar.f13100g;
        zzlj zzljVar = zzicVar.m;
        zzhh zzhhVar = zzicVar.f13098e;
        zzic.m(zzhzVar);
        zzhzVar.g();
        if (zzxVar.c()) {
            if (zzxVar.b()) {
                zzic.k(zzhhVar);
                zzhhVar.f13039w.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString(Constants.MEDIUM, "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                zzic.l(zzljVar);
                zzljVar.n(bjXGJ.NMbjDDjL, "_cmpx", bundle);
            } else {
                zzic.k(zzhhVar);
                zzhg zzhgVar = zzhhVar.f13039w;
                String strA = zzhgVar.a();
                if (TextUtils.isEmpty(strA)) {
                    zzgu zzguVar = zzicVar.f13099f;
                    zzic.m(zzguVar);
                    zzguVar.f12943g.a("Cache still valid but referrer not found");
                } else {
                    long jA = zzhhVar.f13040x.a() / 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jA - 1) * 3600000);
                    Object obj = pair.first;
                    String str2 = obj == null ? "app" : (String) obj;
                    zzic.l(zzljVar);
                    zzljVar.n(str2, "_cmp", (Bundle) pair.second);
                }
                zzhgVar.b(null);
            }
            zzic.k(zzhhVar);
            zzhhVar.f13040x.b(0L);
        }
    }
}
