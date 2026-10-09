package com.google.firebase.auth.internal;

import defpackage.e;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzl extends zzh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18015c;

    public zzl(String str, String str2, String str3) {
        this.f18013a = str;
        this.f18014b = str2;
        this.f18015c = str3;
    }

    @Override // com.google.firebase.auth.internal.zzh
    public final String a() {
        return this.f18014b;
    }

    @Override // com.google.firebase.auth.internal.zzh
    public final String b() {
        return this.f18015c;
    }

    @Override // com.google.firebase.auth.internal.zzh
    public final String c() {
        return this.f18013a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        String str = this.f18013a;
        if (str == null) {
            if (zzhVar.c() != null) {
                return false;
            }
        } else if (!str.equals(zzhVar.c())) {
            return false;
        }
        String str2 = this.f18014b;
        if (str2 == null) {
            if (zzhVar.a() != null) {
                return false;
            }
        } else if (!str2.equals(zzhVar.a())) {
            return false;
        }
        String str3 = this.f18015c;
        if (str3 == null) {
            return zzhVar.b() == null;
        }
        return str3.equals(zzhVar.b());
    }

    public final int hashCode() {
        String str = this.f18013a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f18014b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f18015c;
        return (str3 != null ? str3.hashCode() : 0) ^ iHashCode2;
    }

    public final String toString() {
        return a.k(e.s("AttestationResult{recaptchaV2Token=", this.f18013a, ", playIntegrityToken=", this.f18014b, ", recaptchaEnterpriseToken="), this.f18015c, "}");
    }
}
