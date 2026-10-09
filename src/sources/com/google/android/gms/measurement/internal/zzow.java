package com.google.android.gms.measurement.internal;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzow implements zzgw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f13569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzpg f13570c;

    public zzow(zzpg zzpgVar, String str, ArrayList arrayList) {
        this.f13568a = str;
        this.f13569b = arrayList;
        this.f13570c = zzpgVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final void a(String str, int i11, Throwable th2, byte[] bArr, Map map) {
        this.f13570c.z(true, i11, th2, bArr, this.f13568a, this.f13569b, map);
    }
}
