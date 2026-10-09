package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
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
final class zzacr extends zzaeq<AuthResult, zzj> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zzaij f9820s;

    public zzacr(AuthCredential authCredential, String str) {
        super(2);
        Preconditions.h(authCredential, "credential cannot be null");
        zzaij zzaijVarA = zzm.a(authCredential, str);
        zzaijVarA.L = false;
        this.f9820s = zzaijVarA;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final void a(TaskCompletionSource taskCompletionSource, zzadw zzadwVar) {
        this.f9873g = new zzaex(this, taskCompletionSource);
        zzadwVar.b(this.f9820s, this.f9868b);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq
    public final void g() {
        zzad zzadVarI = zzaby.i(this.f9869c, this.f9876j);
        if (!this.f9870d.G1().equalsIgnoreCase(zzadVarI.f17934b.f18035a)) {
            b(new Status(17024, null, null, null));
        } else {
            ((zzj) this.f9871e).b(this.f9875i, zzadVarI);
            h(new zzx(zzadVarI));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final String zza() {
        return "reauthenticateWithCredentialWithData";
    }
}
