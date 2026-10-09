package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzt extends zzai {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzr f11962c;

    public zzt(zzr zzrVar) {
        super("internal.logger");
        this.f11962c = zzrVar;
        this.f11407b.put("log", new zzs(this, false, true));
        this.f11407b.put("silent", new zzp("silent"));
        ((zzai) this.f11407b.get("silent")).e("log", new zzs(this, true, true));
        this.f11407b.put("unmonitored", new zzq("unmonitored"));
        ((zzai) this.f11407b.get("unmonitored")).e("log", new zzs(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao a(zzg zzgVar, List list) {
        return zzao.f11445j;
    }
}
