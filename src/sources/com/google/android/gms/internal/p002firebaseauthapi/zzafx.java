package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzafx extends zzahl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9916b;

    public zzafx(String str, String str2) {
        this.f9915a = str;
        this.f9916b = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahl
    public final String a() {
        return this.f9916b;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahl
    public final String b() {
        return this.f9915a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzahl)) {
            return false;
        }
        zzahl zzahlVar = (zzahl) obj;
        String str = this.f9915a;
        if (str == null) {
            if (zzahlVar.b() != null) {
                return false;
            }
        } else if (!str.equals(zzahlVar.b())) {
            return false;
        }
        String str2 = this.f9916b;
        if (str2 == null) {
            return zzahlVar.a() == null;
        }
        return str2.equals(zzahlVar.a());
    }

    public final int hashCode() {
        String str = this.f9915a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f9916b;
        return (str2 != null ? str2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return a.h("RecaptchaEnforcementState{provider=", this.f9915a, ", enforcementState=", this.f9916b, "}");
    }
}
