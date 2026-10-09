package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzj;
import com.google.firebase.auth.internal.zzx;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzadf extends zzaeq<AuthResult, zzj> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zzaio f9832s;

    public zzadf(String str, String str2) {
        super(2);
        Preconditions.e(str, "token cannot be null or empty");
        zzaio zzaioVar = new zzaio();
        Preconditions.d(str);
        zzaioVar.f10028a = str;
        zzaioVar.f10029b = str2;
        this.f9832s = zzaioVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final void a(TaskCompletionSource taskCompletionSource, zzadw zzadwVar) {
        this.f9873g = new zzaex(this, taskCompletionSource);
        zzadwVar.getClass();
        zzaio zzaioVar = this.f9832s;
        Preconditions.g(zzaioVar);
        zzaes zzaesVar = this.f9868b;
        Preconditions.g(zzaesVar);
        zzaad zzaadVar = zzadwVar.f9836a;
        zzadx zzadxVar = new zzadx(zzaesVar, zzadw.f9835c);
        zzaadVar.getClass();
        zzaen zzaenVar = zzaadVar.f9720a;
        zzaap zzaapVar = new zzaap(zzaadVar, zzadxVar);
        zzaenVar.getClass();
        zzaeh zzaehVar = zzaenVar.f9860a;
        zzafg.a(zzaehVar.a("/verifyCustomToken", zzaenVar.f9865f), zzaioVar, zzaapVar, new zzain(), zzaehVar.f9852b);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq
    public final void g() {
        zzad zzadVarI = zzaby.i(this.f9869c, this.f9876j);
        ((zzj) this.f9871e).b(this.f9875i, zzadVarI);
        h(new zzx(zzadVarI));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final String zza() {
        return "signInWithCustomToken";
    }
}
