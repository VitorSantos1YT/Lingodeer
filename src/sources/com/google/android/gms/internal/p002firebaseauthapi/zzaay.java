package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaay implements zzafd<zzahd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzadx f9775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzaad f9776b;

    public zzaay(zzaad zzaadVar, zzadx zzadxVar) {
        this.f9775a = zzadxVar;
        Objects.requireNonNull(zzaadVar);
        this.f9776b = zzaadVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        zzahd zzahdVar = (zzahd) zzaelVar;
        this.f9776b.f9720a.b(new zzagu(zzahdVar.f9959b), new zzabb(this, this, zzahdVar, this.f9775a));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9775a.a(zzaq.a(str));
    }
}
