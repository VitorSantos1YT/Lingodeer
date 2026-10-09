package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzabf implements zzafd<zzahz> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzaia f9791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzadx f9792b;

    public zzabf(zzaad zzaadVar, zzaia zzaiaVar, zzadx zzadxVar) {
        this.f9791a = zzaiaVar;
        this.f9792b = zzadxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final /* synthetic */ void a(zzael zzaelVar) {
        zzahz zzahzVar = (zzahz) zzaelVar;
        zzaia zzaiaVar = this.f9791a;
        boolean z11 = zzaiaVar instanceof zzaie;
        zzadx zzadxVar = this.f9792b;
        if (z11) {
            zzadxVar.zzb(zzahzVar.a());
        } else {
            if (!(zzaiaVar instanceof zzaig)) {
                throw new IllegalArgumentException(a.g("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was ", zzaiaVar.getClass().getName(), "."));
            }
            zzadxVar.c(zzahzVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9792b.a(zzaq.a(str));
    }
}
