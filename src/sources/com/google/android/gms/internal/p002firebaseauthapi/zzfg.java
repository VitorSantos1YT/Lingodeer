package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.e;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfg extends zzdg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzc f10429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zza f10431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzdg f10432d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zza f10433b = new zza("ASSUME_AES_GCM");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zza f10434c = new zza("ASSUME_XCHACHA20POLY1305");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zza f10435d = new zza("ASSUME_CHACHA20POLY1305");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final zza f10436e = new zza("ASSUME_AES_CTR_HMAC");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final zza f10437f = new zza("ASSUME_AES_EAX");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final zza f10438g = new zza("ASSUME_AES_GCM_SIV");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10439a;

        public zza(String str) {
            this.f10439a = str;
        }

        public final String toString() {
            return this.f10439a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class zzb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public zzc f10440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public zza f10442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public zzdg f10443d;

        private zzb() {
        }

        public /* synthetic */ zzb(int i11) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzc {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zzc f10444b = new zzc("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zzc f10445c = new zzc("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10446a;

        public zzc(String str) {
            this.f10446a = str;
        }

        public final String toString() {
            return this.f10446a;
        }
    }

    public zzfg(zzc zzcVar, String str, zza zzaVar, zzdg zzdgVar) {
        this.f10429a = zzcVar;
        this.f10430b = str;
        this.f10431c = zzaVar;
        this.f10432d = zzdgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final boolean a() {
        return this.f10429a != zzc.f10445c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfg)) {
            return false;
        }
        zzfg zzfgVar = (zzfg) obj;
        return zzfgVar.f10431c.equals(this.f10431c) && zzfgVar.f10432d.equals(this.f10432d) && zzfgVar.f10430b.equals(this.f10430b) && zzfgVar.f10429a.equals(this.f10429a);
    }

    public final int hashCode() {
        return Objects.hash(zzfg.class, this.f10430b, this.f10431c, this.f10432d, this.f10429a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f10431c);
        return e.p(e.s("LegacyKmsEnvelopeAead Parameters (kekUri: ", this.f10430b, ", dekParsingStrategy: ", strValueOf, ", dekParametersForNewKeys: "), String.valueOf(this.f10432d), ", variant: ", String.valueOf(this.f10429a), ")");
    }
}
