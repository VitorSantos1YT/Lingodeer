package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzki implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f13263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzlj f13264b;

    public zzki(zzlj zzljVar, Bundle bundle) {
        this.f13263a = bundle;
        this.f13264b = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlj zzljVar = this.f13264b;
        zzljVar.g();
        zzljVar.h();
        Bundle bundle = this.f13263a;
        String string = bundle.getString("name");
        String string2 = bundle.getString(OSSHeaders.ORIGIN);
        Preconditions.d(string);
        Preconditions.d(string2);
        Preconditions.g(bundle.get("value"));
        zzic zzicVar = zzljVar.f13202a;
        if (!zzicVar.d()) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12949n.a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzpl zzplVar = new zzpl(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
        try {
            zzpp zzppVar = zzicVar.f13102i;
            zzic.k(zzppVar);
            bundle.getString("app_id");
            zzbh zzbhVarO = zzppVar.O(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
            zzic.k(zzppVar);
            bundle.getString("app_id");
            zzbh zzbhVarO2 = zzppVar.O(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
            bundle.getString("app_id");
            zzicVar.p().z(new zzah(bundle.getString("app_id"), string2, zzplVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), zzbhVarO2, bundle.getLong("trigger_timeout"), zzbhVarO, bundle.getLong("time_to_live"), zzppVar.O(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
