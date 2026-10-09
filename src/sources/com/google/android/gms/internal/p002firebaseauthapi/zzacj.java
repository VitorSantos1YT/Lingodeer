package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.internal.zzbg;
import com.google.firebase.auth.internal.zzj;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzacj extends zzaeq<GetTokenResult, zzj> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f9813s;

    public zzacj(String str) {
        super(1);
        Preconditions.e(str, "refresh token cannot be null");
        this.f9813s = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final void a(TaskCompletionSource taskCompletionSource, zzadw zzadwVar) {
        this.f9873g = new zzaex(this, taskCompletionSource);
        zzadwVar.getClass();
        String str = this.f9813s;
        Preconditions.d(str);
        zzaes zzaesVar = this.f9868b;
        Preconditions.g(zzaesVar);
        zzaad zzaadVar = zzadwVar.f9836a;
        zzadx zzadxVar = new zzadx(zzaesVar, zzadw.f9835c);
        zzaadVar.getClass();
        Preconditions.d(str);
        zzaadVar.f9720a.a(new zzagr(str), new zzaac(zzaadVar, zzadxVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq
    public final void g() {
        if (TextUtils.isEmpty(this.f9875i.f9958a)) {
            zzahd zzahdVar = this.f9875i;
            zzahdVar.getClass();
            String str = this.f9813s;
            Preconditions.d(str);
            zzahdVar.f9958a = str;
        }
        ((zzj) this.f9871e).b(this.f9875i, this.f9870d);
        h(zzbg.a(this.f9875i.f9959b));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final String zza() {
        return "getAccessToken";
    }
}
