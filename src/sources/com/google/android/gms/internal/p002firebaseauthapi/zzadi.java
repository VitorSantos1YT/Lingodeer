package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzadi extends zzaeq<zzahz, Void> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final void a(TaskCompletionSource taskCompletionSource, zzadw zzadwVar) {
        this.f9873g = new zzaex(this, taskCompletionSource);
        zzadwVar.getClass();
        zzaes zzaesVar = this.f9868b;
        Preconditions.g(zzaesVar);
        new zzadx(zzaesVar, zzadw.f9835c);
        zzadwVar.f9836a.getClass();
        Preconditions.g(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq
    public final void g() {
        h(this.f9882q);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final String zza() {
        return "startMfaEnrollment";
    }
}
