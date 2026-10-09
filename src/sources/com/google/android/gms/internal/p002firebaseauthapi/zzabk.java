package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzabk implements zzafd<zzahd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzadx f9794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzaad f9795b;

    public zzabk(zzaad zzaadVar, zzadx zzadxVar) {
        this.f9794a = zzadxVar;
        Objects.requireNonNull(zzaadVar);
        this.f9795b = zzaadVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        zzahd zzahdVar = (zzahd) zzaelVar;
        this.f9795b.f9720a.b(new zzagu(zzahdVar.f9959b), new zzabn(this, this, this.f9794a, zzahdVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9794a.a(zzaq.a(str));
    }
}
