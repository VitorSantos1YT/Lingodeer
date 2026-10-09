package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.SignInMethodQueryResult;
import com.google.firebase.auth.internal.zzap;
import com.google.firebase.auth.internal.zzj;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzace extends zzaeq<SignInMethodQueryResult, zzj> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final void a(TaskCompletionSource taskCompletionSource, zzadw zzadwVar) {
        this.f9873g = new zzaex(this, taskCompletionSource);
        zzadwVar.getClass();
        Preconditions.d(null);
        zzaad zzaadVar = zzadwVar.f9836a;
        zzadx zzadxVar = new zzadx(this.f9868b, zzadw.f9835c);
        zzaadVar.getClass();
        Preconditions.d(null);
        zzage zzageVar = new zzage();
        Preconditions.d(null);
        zzageVar.f9920a = "http://localhost";
        zzaen zzaenVar = zzaadVar.f9720a;
        zzaak zzaakVar = new zzaak(zzaadVar, zzadxVar);
        zzaeh zzaehVar = zzaenVar.f9860a;
        zzafg.a(zzaehVar.a("/createAuthUri", zzaenVar.f9865f), zzageVar, zzaakVar, new zzagd(), zzaehVar.f9852b);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq
    public final void g() {
        List list = this.f9877k.f9919a;
        if (list == null) {
            zzaz zzazVar = zzah.f9955b;
            list = zzas.f10242e;
        }
        h(new zzap(list));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }
}
