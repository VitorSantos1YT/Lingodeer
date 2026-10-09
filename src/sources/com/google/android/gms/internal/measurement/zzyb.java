package com.google.android.gms.internal.measurement;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzyb extends zzyc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12174e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12171b = "com/google/android/libraries/phenotype/client/Phlogger";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12172c = "logInternal";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12173d = "Phlogger.java";

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String a() {
        return this.f12171b.replace('/', '.');
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String b() {
        return this.f12172c;
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final int c() {
        return 44;
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String d() {
        char c11 = File.separatorChar;
        String str = this.f12173d;
        return str.substring(str.lastIndexOf(c11) + 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String e() {
        return this.f12173d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzyb) {
            zzyb zzybVar = (zzyb) obj;
            if (this.f12172c.equals(zzybVar.f12172c)) {
                String str = zzybVar.f12171b;
                String str2 = this.f12171b;
                if (str2 != str) {
                    if (str2.length() == str.length()) {
                        for (int i11 = 0; i11 < str2.length(); i11++) {
                            char cCharAt = str2.charAt(i11);
                            char cCharAt2 = str.charAt(i11);
                            if (cCharAt == cCharAt2 || ((cCharAt & (-2)) == 46 && (cCharAt ^ cCharAt2) == 1)) {
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f12174e;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((this.f12172c.hashCode() + 4867) * 31) + 44;
        this.f12174e = iHashCode;
        return iHashCode;
    }
}
