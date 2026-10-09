package com.google.android.gms.internal.measurement;

import com.google.android.material.datepicker.d;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbx extends zzcd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11483d;

    public /* synthetic */ zzbx(String str, int i11, int i12) {
        this.f11481b = str;
        this.f11482c = i11;
        this.f11483d = i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzcd
    public final String a() {
        return this.f11481b;
    }

    @Override // com.google.android.gms.internal.measurement.zzcd
    public final int b() {
        return this.f11482c;
    }

    @Override // com.google.android.gms.internal.measurement.zzcd
    public final int c() {
        return this.f11483d;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof zzcd)) {
                return false;
            }
            zzcd zzcdVar = (zzcd) obj;
            if (!this.f11481b.equals(zzcdVar.a())) {
                return false;
            }
            int iB = zzcdVar.b();
            int i11 = this.f11482c;
            if (i11 == 0) {
                throw null;
            }
            if (i11 != iB) {
                return false;
            }
            int iC = zzcdVar.c();
            if (this.f11483d == 0) {
                throw null;
            }
            if (iC != 1) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f11481b.hashCode() ^ 1000003;
        int i11 = this.f11482c;
        if (i11 == 0) {
            throw null;
        }
        int i12 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i11;
        if (this.f11483d != 0) {
            return (i12 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i11 = this.f11482c;
        if (i11 == 1) {
            str = "ALL_CHECKS";
        } else if (i11 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i11 != 3) {
            str = i11 != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        String str2 = this.f11483d == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.f11481b;
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + String.valueOf(str3).length() + 73 + 52 + 1);
        d.w(sb2, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
        return p.u(sb2, ", multipleProductIdGroupsResolver=null, filePurpose=", str2, "}");
    }
}
