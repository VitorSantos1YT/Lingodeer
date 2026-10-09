package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzacg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzadf f11201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11202e;

    public zzacg() {
        zzadf zzadfVar = zzadf.f11253b;
        int i11 = zzacf.f11197a;
        this.f11201d = zzadf.f11254c;
    }

    public static /* synthetic */ String a(int i11, int i12, byte b3, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + b3 + String.valueOf(i11).length());
        sb2.append(str);
        sb2.append(i12);
        sb2.append(str2);
        sb2.append(i11);
        return sb2.toString();
    }

    public zzacg(zzadf zzadfVar) {
        zzadfVar.getClass();
        this.f11201d = zzadfVar;
    }
}
