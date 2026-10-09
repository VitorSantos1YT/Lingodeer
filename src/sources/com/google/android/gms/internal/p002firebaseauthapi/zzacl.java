package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.e;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzacl extends zzaeq<zzahe, Void> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zzahb f9816s;

    public zzacl(String str) {
        super(10);
        Preconditions.d("RECAPTCHA_ENTERPRISE");
        this.f9816s = new zzahb(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final void a(TaskCompletionSource taskCompletionSource, zzadw zzadwVar) {
        this.f9873g = new zzaex(this, taskCompletionSource);
        zzadwVar.getClass();
        zzahb zzahbVar = this.f9816s;
        Preconditions.g(zzahbVar);
        zzaad zzaadVar = zzadwVar.f9836a;
        zzadx zzadxVar = new zzadx(this.f9868b, zzadw.f9835c);
        zzaadVar.getClass();
        zzaen zzaenVar = zzaadVar.f9720a;
        zzabi zzabiVar = new zzabi(zzaadVar, zzadxVar);
        zzaenVar.getClass();
        zzaeg zzaegVar = zzaenVar.f9861b;
        String strM = e.m(zzaegVar.a("/recaptchaConfig", zzaenVar.f9865f), "&clientType=CLIENT_TYPE_ANDROID&version=RECAPTCHA_ENTERPRISE");
        String str = zzahbVar.f9956a;
        if (!zzp.a(str)) {
            strM = a.D(strM, "&tenantId=", str);
        }
        zzafg.b(strM, zzabiVar, new zzahe(), zzaegVar.f9852b);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeq
    public final void g() {
        h(this.f9880o);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafc
    public final String zza() {
        return "getRecaptchaConfig";
    }
}
