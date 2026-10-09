package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzafn implements zzaez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzafc f11324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f11326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11327d;

    public zzafn(zzafc zzafcVar, String str, Object[] objArr) {
        this.f11324a = zzafcVar;
        this.f11325b = str;
        this.f11326c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f11327d = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 1;
        int i13 = 13;
        while (true) {
            int i14 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f11327d = i11 | (cCharAt2 << i13);
                return;
            } else {
                i11 |= (cCharAt2 & 8191) << i13;
                i13 += 13;
                i12 = i14;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaez
    public final boolean zza() {
        return (this.f11327d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzaez
    public final zzafc zzb() {
        return this.f11324a;
    }

    @Override // com.google.android.gms.internal.measurement.zzaez
    public final int zzc() {
        int i11 = this.f11327d;
        if ((i11 & 1) != 0) {
            return 1;
        }
        return (i11 & 4) == 4 ? 3 : 2;
    }
}
