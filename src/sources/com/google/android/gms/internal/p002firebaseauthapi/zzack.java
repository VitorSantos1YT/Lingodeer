package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzj;
import com.google.firebase.auth.internal.zzx;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzack extends zzaeq<AuthResult, zzj> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final EmailAuthCredential f9814s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f9815t;

    public zzack(EmailAuthCredential emailAuthCredential, String str) {
        super(2);
        Preconditions.h(emailAuthCredential, "credential cannot be null");
        this.f9814s = emailAuthCredential;
        Preconditions.e(emailAuthCredential.f17872a, "email cannot be null");
        Preconditions.e(emailAuthCredential.f17873b, "password cannot be null");
        this.f9815t = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final void a(TaskCompletionSource taskCompletionSource, zzadw zzadwVar) {
        this.f9873g = new zzaex(this, taskCompletionSource);
        EmailAuthCredential emailAuthCredential = this.f9814s;
        String str = emailAuthCredential.f17872a;
        String str2 = emailAuthCredential.f17873b;
        Preconditions.d(str2);
        String strZze = this.f9870d.zze();
        String strF1 = this.f9870d.F1();
        zzadwVar.getClass();
        Preconditions.d(str);
        Preconditions.d(str2);
        Preconditions.d(strZze);
        zzaes zzaesVar = this.f9868b;
        Preconditions.g(zzaesVar);
        zzaad zzaadVar = zzadwVar.f9836a;
        zzadx zzadxVar = new zzadx(zzaesVar, zzadw.f9835c);
        zzaadVar.getClass();
        Preconditions.d(str);
        Preconditions.d(str2);
        Preconditions.d(strZze);
        zzaadVar.e(strZze, new zzaat(zzaadVar, str, str2, strF1, this.f9815t, zzadxVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq
    public final void g() {
        zzad zzadVarI = zzaby.i(this.f9869c, this.f9876j);
        ((zzj) this.f9871e).b(this.f9875i, zzadVarI);
        h(new zzx(zzadVarI));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final String zza() {
        return "linkEmailAuthCredential";
    }
}
