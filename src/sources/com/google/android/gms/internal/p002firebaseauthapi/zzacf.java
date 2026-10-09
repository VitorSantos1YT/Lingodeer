package com.google.android.gms.internal.p002firebaseauthapi;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzat;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzacf extends zzaeq<Void, zzat> {
    public zzacf() {
        super(5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final void a(TaskCompletionSource taskCompletionSource, zzadw zzadwVar) {
        this.f9873g = new zzaex(this, taskCompletionSource);
        String strZze = this.f9870d.zze();
        zzadwVar.getClass();
        Preconditions.d(strZze);
        zzaes zzaesVar = this.f9868b;
        Preconditions.g(zzaesVar);
        zzaad zzaadVar = zzadwVar.f9836a;
        zzadx zzadxVar = new zzadx(zzaesVar, zzadw.f9835c);
        zzaadVar.getClass();
        Preconditions.d(strZze);
        zzaadVar.e(strZze, new zzabm(zzaadVar, zzadxVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq
    public final void g() {
        ((zzat) this.f9871e).zza();
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final String zza() {
        return RequestParameters.SUBRESOURCE_DELETE;
    }
}
