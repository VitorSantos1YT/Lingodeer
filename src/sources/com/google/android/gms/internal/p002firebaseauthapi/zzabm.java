package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.internal.zzaq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzabm implements zzafd<zzahd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzadx f9797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzaad f9798b;

    public zzabm(zzaad zzaadVar, zzadx zzadxVar) {
        this.f9797a = zzadxVar;
        Objects.requireNonNull(zzaadVar);
        this.f9798b = zzaadVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        String str = ((zzahd) zzaelVar).f9959b;
        zzagg zzaggVar = new zzagg();
        Preconditions.d(str);
        zzaggVar.f9926a = str;
        zzaen zzaenVar = this.f9798b.f9720a;
        zzabp zzabpVar = new zzabp(this, this.f9797a, this);
        zzaeh zzaehVar = zzaenVar.f9860a;
        zzafg.a(zzaehVar.a("/deleteAccount", zzaenVar.f9865f), zzaggVar, zzabpVar, null, zzaehVar.f9852b);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9797a.a(zzaq.a(str));
    }
}
