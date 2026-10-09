package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.internal.zzaq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzabu implements zzafd<zzahd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzadx f9806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzaad f9807b;

    public zzabu(zzaad zzaadVar, zzadx zzadxVar) {
        this.f9806a = zzadxVar;
        Objects.requireNonNull(zzaadVar);
        this.f9807b = zzaadVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        zzahd zzahdVar = (zzahd) zzaelVar;
        String str = zzahdVar.f9959b;
        zzaht zzahtVar = new zzaht();
        Preconditions.d(str);
        zzahtVar.f9986a = str;
        zzahtVar.f9987b.f10009a.add("PASSWORD");
        zzaad.b(this.f9807b, this.f9806a, this, zzahdVar, zzahtVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9806a.a(zzaq.a(str));
    }
}
