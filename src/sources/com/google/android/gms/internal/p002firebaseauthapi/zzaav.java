package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaav implements zzafd<zzahd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzais f9766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzadx f9767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzaad f9768c;

    public zzaav(zzaad zzaadVar, zzais zzaisVar, zzadx zzadxVar) {
        this.f9766a = zzaisVar;
        this.f9767b = zzadxVar;
        Objects.requireNonNull(zzaadVar);
        this.f9768c = zzaadVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        String str = ((zzahd) zzaelVar).f9959b;
        zzais zzaisVar = this.f9766a;
        zzaisVar.f10050e = str;
        this.f9768c.f9720a.f(zzaisVar, new zzaau(this, this.f9767b, this));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9767b.a(zzaq.a(str));
    }
}
