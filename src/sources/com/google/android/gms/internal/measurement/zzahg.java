package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahg implements zzahf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzom f11379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzom f11380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzom f11381c;

    static {
        zzph zzphVar = zzagr.f11362d.f11775a;
        f11379a = new zzod("45761323", zzphVar, BuildConfig.VERSION_NAME);
        f11380b = new zzod("45762029", zzphVar, BuildConfig.VERSION_NAME);
        f11381c = new zzod("45762030", zzphVar, BuildConfig.VERSION_NAME);
    }

    @Override // com.google.android.gms.internal.measurement.zzahf
    public final String zza() {
        return (String) ((zznp) f11379a).get();
    }

    @Override // com.google.android.gms.internal.measurement.zzahf
    public final String zzb() {
        return (String) ((zznp) f11380b).get();
    }

    @Override // com.google.android.gms.internal.measurement.zzahf
    public final String zzc() {
        return (String) ((zznp) f11381c).get();
    }
}
