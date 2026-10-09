package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaba implements zzafd<zzahd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzadx f9781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzaad f9782b;

    public zzaba(zzaad zzaadVar, zzadx zzadxVar) {
        this.f9781a = zzadxVar;
        Objects.requireNonNull(zzaadVar);
        this.f9782b = zzaadVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        zzaiu zzaiuVar = new zzaiu(((zzahd) zzaelVar).f9959b);
        zzaen zzaenVar = this.f9782b.f9720a;
        zzabd zzabdVar = new zzabd(this, this.f9781a);
        zzaeg zzaegVar = zzaenVar.f9861b;
        zzafg.a(zzaegVar.a("/accounts/mfaEnrollment:withdraw", zzaenVar.f9865f), zzaiuVar, zzabdVar, new zzait(), zzaegVar.f9852b);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9781a.a(zzaq.a(str));
    }
}
