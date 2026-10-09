package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgd extends zzdg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zza f10471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10472b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zza f10473b = new zza("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zza f10474c = new zza("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10475a;

        public zza(String str) {
            this.f10475a = str;
        }

        public final String toString() {
            return this.f10475a;
        }
    }

    public zzgd(zza zzaVar, int i11) {
        this.f10471a = zzaVar;
        this.f10472b = i11;
    }

    public static zzgd b(zza zzaVar, int i11) throws GeneralSecurityException {
        if (i11 < 8 || i11 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzgd(zzaVar, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final boolean a() {
        return this.f10471a != zza.f10474c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgd)) {
            return false;
        }
        zzgd zzgdVar = (zzgd) obj;
        return zzgdVar.f10471a == this.f10471a && zzgdVar.f10472b == this.f10472b;
    }

    public final int hashCode() {
        return Objects.hash(zzgd.class, this.f10471a, Integer.valueOf(this.f10472b));
    }

    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + String.valueOf(this.f10471a) + "salt_size_bytes: " + this.f10472b + ")";
    }
}
