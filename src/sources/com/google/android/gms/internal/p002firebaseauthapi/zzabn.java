package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzabn implements zzafd<zzagt> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzafd f9799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzadx f9800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzahd f9801c;

    public zzabn(zzabk zzabkVar, zzafd zzafdVar, zzadx zzadxVar, zzahd zzahdVar) {
        this.f9799a = zzafdVar;
        this.f9800b = zzadxVar;
        this.f9801c = zzahdVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        List list = ((zzagt) zzaelVar).f9939a.f9941a;
        if (list == null || list.isEmpty()) {
            ((zzabk) this.f9799a).zza("No users");
        } else {
            this.f9800b.m(this.f9801c, (zzagw) list.get(0));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        ((zzabk) this.f9799a).zza(str);
    }
}
