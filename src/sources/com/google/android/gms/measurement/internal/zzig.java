package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzig implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f13128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzjd f13129e;

    public zzig(zzjd zzjdVar, String str, String str2, String str3, long j11) {
        this.f13125a = str;
        this.f13126b = str2;
        this.f13127c = str3;
        this.f13128d = j11;
        this.f13129e = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f13126b;
        zzjd zzjdVar = this.f13129e;
        String str2 = this.f13125a;
        if (str2 == null) {
            zzpg zzpgVar = zzjdVar.f13199a;
            zzpgVar.e().g();
            String str3 = zzpgVar.G;
            if (str3 == null || str3.equals(str)) {
                zzpgVar.G = str;
                zzpgVar.F = null;
                return;
            }
            return;
        }
        zzlu zzluVar = new zzlu(this.f13127c, str2, this.f13128d);
        zzpg zzpgVar2 = zzjdVar.f13199a;
        zzpgVar2.e().g();
        String str4 = zzpgVar2.G;
        if (str4 != null) {
            str4.equals(str);
        }
        zzpgVar2.G = str;
        zzpgVar2.F = zzluVar;
    }
}
