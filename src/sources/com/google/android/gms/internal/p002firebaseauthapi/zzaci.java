package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaci extends zzaeq<zzagz, Void> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zzaha f9812s;

    public zzaci() {
        super(11);
        this.f9812s = new zzaha();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final void a(TaskCompletionSource taskCompletionSource, zzadw zzadwVar) {
        this.f9873g = new zzaex(this, taskCompletionSource);
        zzadwVar.getClass();
        Preconditions.g(this.f9812s);
        zzaad zzaadVar = zzadwVar.f9836a;
        zzadx zzadxVar = new zzadx(this.f9868b, zzadw.f9835c);
        zzaadVar.getClass();
        zzaen zzaenVar = zzaadVar.f9720a;
        zzabl zzablVar = new zzabl(zzaadVar, zzadxVar);
        zzaenVar.getClass();
        zzaeh zzaehVar = zzaenVar.f9860a;
        zzafg.b(zzaehVar.a("/getRecaptchaParam", zzaenVar.f9865f), zzablVar, new zzagz(), zzaehVar.f9852b);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq
    public final void g() {
        h(this.f9881p);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final String zza() {
        return "getRecaptchaParam";
    }
}
