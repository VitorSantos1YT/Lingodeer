package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzho implements com.google.android.gms.internal.measurement.zzo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzht f13051b;

    public zzho(zzht zzhtVar, String str) {
        this.f13050a = str;
        this.f13051b = zzhtVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map = (Map) this.f13051b.f13059d.get(this.f13050a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
