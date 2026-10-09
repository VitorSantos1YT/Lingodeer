package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzamp implements zzalw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzaly f10190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f10192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10193d;

    public zzamp(zzaly zzalyVar, String str, Object[] objArr) {
        this.f10190a = zzalyVar;
        this.f10191b = str;
        this.f10192c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f10193d = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 13;
        int i13 = 1;
        while (true) {
            int i14 = i13 + 1;
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 < 55296) {
                this.f10193d = i11 | (cCharAt2 << i12);
                return;
            } else {
                i11 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i13 = i14;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalw
    public final zzaly zza() {
        return this.f10190a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalw
    public final zzamk zzb() {
        int i11 = this.f10193d;
        if ((i11 & 1) != 0) {
            return zzamk.zza;
        }
        return (i11 & 4) == 4 ? zzamk.zzc : zzamk.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalw
    public final boolean zzc() {
        return (this.f10193d & 2) == 2;
    }
}
