package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzer extends zzeo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f11565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f11566f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzey f11567t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzey zzeyVar, Bundle bundle, Activity activity) {
        super(zzeyVar.f11581a, true);
        this.f11565e = bundle;
        this.f11566f = activity;
        this.f11567t = zzeyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void a() {
        Bundle bundle;
        Bundle bundle2 = this.f11565e;
        if (bundle2 != null) {
            bundle = new Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        zzcp zzcpVar = this.f11567t.f11581a.f11589g;
        Preconditions.g(zzcpVar);
        Activity activity = this.f11566f;
        zzcpVar.onActivityCreatedByScionActivityInfo(zzdd.D1(activity), bundle, this.f11561b);
    }
}
