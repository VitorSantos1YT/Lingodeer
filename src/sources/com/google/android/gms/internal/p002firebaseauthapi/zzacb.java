package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzj;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzacb extends zzaeq<Void, zzj> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final void a(TaskCompletionSource taskCompletionSource, zzadw zzadwVar) {
        this.f9873g = new zzaex(this, taskCompletionSource);
        zzadwVar.getClass();
        Preconditions.d(null);
        zzaes zzaesVar = this.f9868b;
        Preconditions.g(zzaesVar);
        zzaad zzaadVar = zzadwVar.f9836a;
        zzadx zzadxVar = new zzadx(zzaesVar, zzadw.f9835c);
        zzaadVar.getClass();
        Preconditions.d(null);
        zzaht zzahtVar = new zzaht();
        Preconditions.d(null);
        zzaadVar.f9720a.c(zzahtVar, new zzabx(zzaadVar, zzadxVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq
    public final void g() {
        h(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final String zza() {
        return "applyActionCode";
    }
}
