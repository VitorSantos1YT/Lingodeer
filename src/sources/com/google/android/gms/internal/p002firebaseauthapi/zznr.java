package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zznr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f10790c = Logger.getLogger(zznr.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zznr f10791d = new zznr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f10792a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10793b = new ConcurrentHashMap();

    public final zzbw a(String str) {
        zzbw zzbwVar;
        synchronized (this) {
            if (!this.f10792a.containsKey(str)) {
                throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
            }
            zzbwVar = (zzbw) this.f10792a.get(str);
        }
        return zzbwVar;
    }

    public final synchronized void b(zzbw zzbwVar, zzjb.zza zzaVar, boolean z11) {
        if (!zzaVar.a()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        d(zzbwVar, z11);
    }

    public final synchronized void c(zzbw zzbwVar, boolean z11) {
        b(zzbwVar, zzjb.zza.zza, z11);
    }

    public final synchronized void d(zzbw zzbwVar, boolean z11) {
        try {
            String strZza = zzbwVar.zza();
            if (z11 && this.f10793b.containsKey(strZza) && !((Boolean) this.f10793b.get(strZza)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + strZza);
            }
            zzbw zzbwVar2 = (zzbw) this.f10792a.get(strZza);
            if (zzbwVar2 != null && !zzbwVar2.getClass().equals(zzbwVar.getClass())) {
                f10790c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + strZza);
                throw new GeneralSecurityException("typeUrl (" + strZza + ") is already registered with " + zzbwVar2.getClass().getName() + ", cannot be re-registered with " + zzbwVar.getClass().getName());
            }
            this.f10792a.putIfAbsent(strZza, zzbwVar);
            this.f10793b.put(strZza, Boolean.valueOf(z11));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
