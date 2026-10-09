package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f13265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzlj f13266b;

    public zzkj(zzlj zzljVar, Bundle bundle) {
        this.f13265a = bundle;
        this.f13266b = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlj zzljVar = this.f13266b;
        zzljVar.g();
        zzljVar.h();
        Bundle bundle = this.f13265a;
        String string = bundle.getString("name");
        Preconditions.d(string);
        zzic zzicVar = zzljVar.f13202a;
        if (!zzicVar.d()) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12949n.a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzpl zzplVar = new zzpl(0L, null, string, BuildConfig.VERSION_NAME);
        try {
            zzpp zzppVar = zzicVar.f13102i;
            zzic.k(zzppVar);
            bundle.getString("app_id");
            zzicVar.p().z(new zzah(bundle.getString("app_id"), BuildConfig.VERSION_NAME, zzplVar, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), zzppVar.O(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), BuildConfig.VERSION_NAME, bundle.getLong("creation_timestamp"), 0L, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
