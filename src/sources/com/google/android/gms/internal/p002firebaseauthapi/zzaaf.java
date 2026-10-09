package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaaf implements zzafd<zzahx> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzadx f9723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzaad f9724b;

    public zzaaf(zzaad zzaadVar, zzadx zzadxVar) {
        this.f9723a = zzadxVar;
        Objects.requireNonNull(zzaadVar);
        this.f9724b = zzaadVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        zzahx zzahxVar = (zzahx) zzaelVar;
        this.f9724b.d(new zzahd(zzahxVar.f9996b, zzahxVar.f9995a, Long.valueOf(zzahxVar.f9997c), "Bearer"), null, null, Boolean.TRUE, null, this.f9723a, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9723a.a(zzaq.a(str));
    }
}
