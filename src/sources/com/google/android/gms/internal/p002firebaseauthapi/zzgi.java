package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgi extends zzdg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zza f10484a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zza f10485b = new zza("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zza f10486c = new zza("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zza f10487d = new zza("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10488a;

        public zza(String str) {
            this.f10488a = str;
        }

        public final String toString() {
            return this.f10488a;
        }
    }

    public zzgi(zza zzaVar) {
        this.f10484a = zzaVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final boolean a() {
        return this.f10484a != zza.f10487d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgi) && ((zzgi) obj).f10484a == this.f10484a;
    }

    public final int hashCode() {
        return Objects.hash(zzgi.class, this.f10484a);
    }

    public final String toString() {
        return a.g("XChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.f10484a), ")");
    }
}
