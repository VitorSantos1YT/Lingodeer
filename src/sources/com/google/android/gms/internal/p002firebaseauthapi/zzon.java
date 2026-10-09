package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzon {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzon f10809b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f10810a = new HashMap();

    static {
        zzno zznoVar = new zzno() { // from class: com.google.android.gms.internal.firebase-auth-api.zzom
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzno
            public final zzbt a(zzcq zzcqVar, Integer num) throws GeneralSecurityException {
                zzon zzonVar = zzon.f10809b;
                zzwn zzwnVar = ((zzod) zzcqVar).f10805a.f10844b;
                zznr zznrVar = zznr.f10791d;
                zzbw zzbwVarA = zznrVar.a(zzwnVar.E());
                if (!((Boolean) zznrVar.f10793b.get(zzwnVar.E())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                zzwj zzwjVarB = zzbwVarA.b(zzwnVar.D());
                return new zzoa(zzpx.a(zzwjVarB.D(), zzwjVarB.C(), zzwjVarB.z(), zzwnVar.C(), num), zzcw.f10287a);
            }
        };
        zzon zzonVar = new zzon();
        try {
            zzonVar.b(zznoVar, zzod.class);
            f10809b = zzonVar;
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException("unexpected error.", e8);
        }
    }

    public final zzbt a(zzcq zzcqVar, Integer num) {
        zzbt zzbtVarA;
        synchronized (this) {
            zzno zznoVar = (zzno) this.f10810a.get(zzcqVar.getClass());
            if (zznoVar == null) {
                throw new GeneralSecurityException("Cannot create a new key for parameters " + String.valueOf(zzcqVar) + ": no key creator for this class was registered.");
            }
            zzbtVarA = zznoVar.a(zzcqVar, num);
        }
        return zzbtVarA;
    }

    public final synchronized void b(zzno zznoVar, Class cls) {
        try {
            zzno zznoVar2 = (zzno) this.f10810a.get(cls);
            if (zznoVar2 != null && !zznoVar2.equals(zznoVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + String.valueOf(cls) + " already inserted");
            }
            this.f10810a.put(cls, zznoVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
