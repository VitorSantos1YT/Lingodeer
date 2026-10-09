package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.internal.zzaq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaax implements zzafd<zzahd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzaij f9772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzadx f9773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzaad f9774c;

    public zzaax(zzaad zzaadVar, zzaij zzaijVar, zzadx zzadxVar) {
        this.f9772a = zzaijVar;
        this.f9773b = zzadxVar;
        Objects.requireNonNull(zzaadVar);
        this.f9774c = zzaadVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        zzaij zzaijVar = this.f9772a;
        zzaijVar.Q = true;
        String str = ((zzahd) zzaelVar).f9959b;
        Preconditions.d(str);
        zzaijVar.f10011b = str;
        this.f9774c.f9720a.e(zzaijVar, new zzaaw(this, this.f9773b, this));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9773b.a(zzaq.a(str));
    }
}
