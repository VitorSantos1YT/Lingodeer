package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class zzoc extends zzof {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile long f11770e;

    @Override // com.google.android.gms.internal.measurement.zznw
    public final /* synthetic */ void a(Object obj) {
        this.f11770e = ((Long) obj).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    public final /* synthetic */ Object d(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    public final /* synthetic */ Object e(Object obj) {
        return (Long) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final /* synthetic */ Object zze() {
        return Long.valueOf(this.f11770e);
    }
}
