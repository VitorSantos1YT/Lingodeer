package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaaj implements zzafd<zzagt> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzafd f9736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzadx f9737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzahd f9738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzaht f9739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzaad f9740e;

    public zzaaj(zzaad zzaadVar, zzadx zzadxVar, zzafd zzafdVar, zzahd zzahdVar, zzaht zzahtVar) {
        this.f9736a = zzafdVar;
        this.f9737b = zzadxVar;
        this.f9738c = zzahdVar;
        this.f9739d = zzahtVar;
        Objects.requireNonNull(zzaadVar);
        this.f9740e = zzaadVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        List list = ((zzagt) zzaelVar).f9939a.f9941a;
        zzafd zzafdVar = this.f9736a;
        if (list == null || list.isEmpty()) {
            zzafdVar.zza("No users");
            return;
        }
        zzaad.a(this.f9740e, this.f9737b, zzafdVar, (zzagw) list.get(0), this.f9738c, this.f9739d);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9736a.zza(str);
    }
}
