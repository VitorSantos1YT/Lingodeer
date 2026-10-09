package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzj;
import com.google.firebase.auth.internal.zzx;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzade extends zzaeq<AuthResult, zzj> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f9828s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f9829t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f9830u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f9831v;

    public zzade(String str, String str2, String str3, String str4) {
        super(2);
        Preconditions.e(str, "email cannot be null or empty");
        Preconditions.e(str2, "password cannot be null or empty");
        this.f9828s = str;
        this.f9829t = str2;
        this.f9830u = str3;
        this.f9831v = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final void a(TaskCompletionSource taskCompletionSource, zzadw zzadwVar) {
        this.f9873g = new zzaex(this, taskCompletionSource);
        zzadwVar.d(this.f9828s, this.f9829t, this.f9830u, this.f9831v, this.f9868b);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq
    public final void g() {
        zzad zzadVarI = zzaby.i(this.f9869c, this.f9876j);
        ((zzj) this.f9871e).b(this.f9875i, zzadVarI);
        h(new zzx(zzadVarI));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final String zza() {
        return "signInWithEmailAndPassword";
    }
}
