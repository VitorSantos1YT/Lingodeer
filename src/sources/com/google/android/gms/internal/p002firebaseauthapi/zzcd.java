package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcd implements zzck {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zzcg f10276h = new zzcf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcg
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcf
        public final void a(zzcd zzcdVar) {
            zzcg zzcgVar = zzcd.f10276h;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzbt f10277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzwk f10278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzbv f10279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzcf f10283g;

    public zzcd(zzbt zzbtVar, zzwk zzwkVar, int i11, boolean z11, boolean z12, zzcf zzcfVar) {
        this.f10277a = zzbtVar;
        this.f10278b = zzwkVar;
        int i12 = zzbz.f10269a[zzwkVar.ordinal()];
        this.f10279c = i12 != 1 ? i12 != 2 ? zzbv.f10262c : zzbv.f10263d : zzbv.f10261b;
        this.f10280d = i11;
        this.f10281e = z11;
        this.f10282f = z12;
        this.f10283g = zzcfVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzck
    public final zzbt zzb() {
        this.f10283g.a(this);
        return this.f10277a;
    }
}
