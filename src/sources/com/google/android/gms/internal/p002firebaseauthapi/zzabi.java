package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzabi implements zzafd<zzahe> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzadx f9793a;

    public zzabi(zzaad zzaadVar, zzadx zzadxVar) {
        this.f9793a = zzadxVar;
        Objects.requireNonNull(zzaadVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final /* synthetic */ void a(zzael zzaelVar) {
        this.f9793a.g((zzahe) zzaelVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9793a.a(zzaq.a(str));
    }
}
