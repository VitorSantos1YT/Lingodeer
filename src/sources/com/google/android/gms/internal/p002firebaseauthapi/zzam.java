package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzam extends zzah {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f10157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f10158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzah f10159e;

    public zzam(zzah zzahVar, int i11, int i12) {
        this.f10159e = zzahVar;
        this.f10157c = i11;
        this.f10158d = i12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int b() {
        return this.f10159e.e() + this.f10157c + this.f10158d;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int e() {
        return this.f10159e.e() + this.f10157c;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final Object[] g() {
        return this.f10159e.g();
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzu.a(i11, this.f10158d);
        return this.f10159e.get(i11 + this.f10157c);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzah, java.util.List
    /* JADX INFO: renamed from: h */
    public final zzah subList(int i11, int i12) {
        zzu.b(i11, i12, this.f10158d);
        int i13 = this.f10157c;
        return (zzah) this.f10159e.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10158d;
    }
}
