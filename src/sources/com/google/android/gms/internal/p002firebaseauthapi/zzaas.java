package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaas implements zzafd<zzahx> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzadx f9754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzafe f9755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzaad f9756c;

    public zzaas(zzaad zzaadVar, zzadx zzadxVar, zzafe zzafeVar) {
        this.f9754a = zzadxVar;
        this.f9755b = zzafeVar;
        Objects.requireNonNull(zzaadVar);
        this.f9756c = zzaadVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        zzahx zzahxVar = (zzahx) zzaelVar;
        this.f9756c.d(new zzahd(zzahxVar.f9996b, zzahxVar.f9995a, Long.valueOf(zzahxVar.f9997c), "Bearer"), null, "password", Boolean.FALSE, null, this.f9754a, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        ((zzaat) this.f9755b).zza(str);
    }
}
