package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzir implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbh f13159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzr f13160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzjd f13161c;

    public zzir(zzjd zzjdVar, zzbh zzbhVar, zzr zzrVar) {
        this.f13159a = zzbhVar;
        this.f13160b = zzrVar;
        this.f13161c = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzjd zzjdVar = this.f13161c;
        zzjdVar.getClass();
        zzpg zzpgVar = zzjdVar.f13199a;
        zzbh zzbhVar = this.f13159a;
        if ("_cmp".equals(zzbhVar.f12702a) && (zzbfVar = zzbhVar.f12703b) != null) {
            Bundle bundle = zzbfVar.f12701a;
            if (bundle.size() != 0) {
                String string = bundle.getString("_cis");
                if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                    zzpgVar.b().f12948l.b(zzbhVar.toString(), txBUGYhC.CocUCxK);
                    zzbhVar = new zzbh("_cmpx", zzbfVar, zzbhVar.f12704c, zzbhVar.f12705d, zzbhVar.f12706e);
                }
            }
        }
        String str = zzbhVar.f12702a;
        zzht zzhtVar = zzpgVar.f13595a;
        zzpk zzpkVar = zzpgVar.f13601g;
        zzpg.U(zzhtVar);
        zzr zzrVar = this.f13160b;
        String str2 = zzrVar.f13655a;
        com.google.android.gms.internal.measurement.zzc zzcVar = TextUtils.isEmpty(str2) ? null : (com.google.android.gms.internal.measurement.zzc) zzhtVar.f13066k.j(str2);
        if (zzcVar == null) {
            zzpgVar.b().f12949n.b(zzrVar.f13655a, "EES not loaded for");
            zzpgVar.W();
            zzpgVar.j(zzbhVar, zzrVar);
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzab zzabVar = zzcVar.f11487c;
            zzpg.U(zzpkVar);
            HashMap mapU = zzpk.U(zzbhVar.f12703b.G1(), true);
            String strB = zzlt.b(str, zzjm.f13212f, zzjm.f13207a);
            if (strB == null) {
                strB = str;
            }
            if (zzcVar.a(new com.google.android.gms.internal.measurement.zzaa(strB, zzbhVar.f12705d, mapU))) {
                if (zzabVar.f11164b.equals(zzabVar.f11163a)) {
                    zzpgVar.W();
                    zzpgVar.j(zzbhVar, zzrVar);
                } else {
                    zzpgVar.b().f12949n.b(str, "EES edited event");
                    zzpg.U(zzpkVar);
                    zzbh zzbhVarK = zzpk.k(zzabVar.f11164b);
                    zzpgVar.W();
                    zzpgVar.j(zzbhVarK, zzrVar);
                }
                if (zzabVar.f11165c.isEmpty()) {
                    return;
                }
                ArrayList arrayList = zzabVar.f11165c;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    com.google.android.gms.internal.measurement.zzaa zzaaVar = (com.google.android.gms.internal.measurement.zzaa) obj;
                    zzpgVar.b().f12949n.b(zzaaVar.f11125a, "EES logging created event");
                    zzpg.U(zzpkVar);
                    zzbh zzbhVarK2 = zzpk.k(zzaaVar);
                    zzpgVar.W();
                    zzpgVar.j(zzbhVarK2, zzrVar);
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            zzpgVar.b().f12942f.c(zzrVar.f13657b, str, "EES error. appId, eventName");
        }
        zzpgVar.b().f12949n.b(str, "EES was not applied to event");
        zzpgVar.W();
        zzpgVar.j(zzbhVar, zzrVar);
    }
}
