package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaap implements zzafd<zzain> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzadx f9750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzaad f9751b;

    public zzaap(zzaad zzaadVar, zzadx zzadxVar) {
        this.f9750a = zzadxVar;
        Objects.requireNonNull(zzaadVar);
        this.f9751b = zzaadVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        zzain zzainVar = (zzain) zzaelVar;
        this.f9751b.d(new zzahd(zzainVar.f10025b, zzainVar.f10024a, Long.valueOf(zzainVar.f10026c), "Bearer"), null, null, Boolean.valueOf(zzainVar.f10027d), null, this.f9750a, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9750a.a(zzaq.a(str));
    }
}
