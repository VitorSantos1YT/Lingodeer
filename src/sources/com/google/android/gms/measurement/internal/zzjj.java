package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public enum zzjj {
    STORAGE(zzjk.AD_STORAGE, zzjk.ANALYTICS_STORAGE),
    DMA(zzjk.AD_USER_DATA);

    private final zzjk[] zzc;

    zzjj(zzjk... zzjkVarArr) {
        this.zzc = zzjkVarArr;
    }

    public final zzjk[] a() {
        return this.zzc;
    }

    public final /* synthetic */ zzjk[] b() {
        return this.zzc;
    }
}
