package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzj;
import com.google.firebase.auth.internal.zzm;
import com.google.firebase.auth.internal.zzx;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzacn extends zzaeq<AuthResult, zzj> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zzaij f9818s;

    public zzacn(AuthCredential authCredential) {
        super(2);
        Preconditions.h(authCredential, "credential cannot be null");
        this.f9818s = zzm.a(authCredential, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final void a(TaskCompletionSource taskCompletionSource, zzadw zzadwVar) {
        this.f9873g = new zzaex(this, taskCompletionSource);
        String strZze = this.f9870d.zze();
        zzadwVar.getClass();
        Preconditions.d(strZze);
        zzaij zzaijVar = this.f9818s;
        Preconditions.g(zzaijVar);
        zzaes zzaesVar = this.f9868b;
        Preconditions.g(zzaesVar);
        zzaad zzaadVar = zzadwVar.f9836a;
        zzadx zzadxVar = new zzadx(zzaesVar, zzadw.f9835c);
        zzaadVar.getClass();
        Preconditions.d(strZze);
        zzaadVar.e(strZze, new zzaax(zzaadVar, zzaijVar, zzadxVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq
    public final void g() {
        zzad zzadVarI = zzaby.i(this.f9869c, this.f9876j);
        ((zzj) this.f9871e).b(this.f9875i, zzadVarI);
        h(new zzx(zzadVarI));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final String zza() {
        return "linkFederatedCredential";
    }
}
