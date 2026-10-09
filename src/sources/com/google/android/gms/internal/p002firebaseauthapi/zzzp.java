package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzzp extends ThreadLocal<Mac> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzzm f11058a;

    public zzzp(zzzm zzzmVar) {
        this.f11058a = zzzmVar;
    }

    @Override // java.lang.ThreadLocal
    public final Mac initialValue() {
        zzzm zzzmVar = this.f11058a;
        try {
            zzyv zzyvVar = zzyv.f11040c;
            Mac mac = (Mac) zzyvVar.f11044a.zza(zzzmVar.f11051b);
            mac.init(zzzmVar.f11052c);
            return mac;
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }
}
