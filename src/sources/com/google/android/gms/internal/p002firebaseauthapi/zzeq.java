package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeq extends zzdg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zza f10405a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zza f10406b = new zza("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zza f10407c = new zza("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zza f10408d = new zza("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10409a;

        public zza(String str) {
            this.f10409a = str;
        }

        public final String toString() {
            return this.f10409a;
        }
    }

    public zzeq(zza zzaVar) {
        this.f10405a = zzaVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final boolean a() {
        return this.f10405a != zza.f10408d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzeq) && ((zzeq) obj).f10405a == this.f10405a;
    }

    public final int hashCode() {
        return Objects.hash(zzeq.class, this.f10405a);
    }

    public final String toString() {
        return a.g("ChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.f10405a), ")");
    }
}
