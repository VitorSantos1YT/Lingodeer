package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaat implements zzafd<zzahd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f9760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzadx f9761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzaad f9762f;

    public zzaat(zzaad zzaadVar, String str, String str2, String str3, String str4, zzadx zzadxVar) {
        this.f9757a = str;
        this.f9758b = str2;
        this.f9759c = str3;
        this.f9760d = str4;
        this.f9761e = zzadxVar;
        Objects.requireNonNull(zzaadVar);
        this.f9762f = zzaadVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        zzahy zzahyVar = new zzahy(this.f9757a, this.f9758b, this.f9759c, this.f9760d, ((zzahd) zzaelVar).f9959b);
        zzaad zzaadVar = this.f9762f;
        zzaadVar.f9720a.d(zzahyVar, new zzaas(zzaadVar, this.f9761e, this));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9761e.a(zzaq.a(str));
    }
}
