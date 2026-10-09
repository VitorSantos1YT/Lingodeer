package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzez extends zzdg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zza f10420b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zza f10421b = new zza("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zza f10422c = new zza("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10423a;

        public zza(String str) {
            this.f10423a = str;
        }

        public final String toString() {
            return this.f10423a;
        }
    }

    public zzez(String str, zza zzaVar) {
        this.f10419a = str;
        this.f10420b = zzaVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final boolean a() {
        return this.f10420b != zza.f10422c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzez)) {
            return false;
        }
        zzez zzezVar = (zzez) obj;
        return zzezVar.f10419a.equals(this.f10419a) && zzezVar.f10420b.equals(this.f10420b);
    }

    public final int hashCode() {
        return Objects.hash(zzez.class, this.f10419a, this.f10420b);
    }

    public final String toString() {
        return a.h("LegacyKmsAead Parameters (keyUri: ", this.f10419a, ", variant: ", String.valueOf(this.f10420b), ")");
    }
}
