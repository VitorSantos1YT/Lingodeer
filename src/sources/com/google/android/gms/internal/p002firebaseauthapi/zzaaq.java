package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaaq implements zzafd<zzair> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzadx f9752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzaad f9753b;

    public zzaaq(zzaad zzaadVar, zzadx zzadxVar) {
        this.f9752a = zzadxVar;
        Objects.requireNonNull(zzaadVar);
        this.f9753b = zzaadVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        zzair zzairVar = (zzair) zzaelVar;
        this.f9753b.d(new zzahd(zzairVar.f10041b, zzairVar.f10040a, Long.valueOf(zzairVar.f10042c), "Bearer"), null, null, Boolean.valueOf(zzairVar.f10043d), null, this.f9752a, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9752a.a(zzaq.a(str));
    }
}
