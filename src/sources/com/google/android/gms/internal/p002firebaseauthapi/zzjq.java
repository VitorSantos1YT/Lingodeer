package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjq {
    static {
        int i11 = zzxk.f10993a;
        try {
            a();
        } catch (GeneralSecurityException e8) {
            throw new ExceptionInInitializerError(e8);
        }
    }

    public static void a() throws GeneralSecurityException {
        zzjr zzjrVar = zzjr.f10590a;
        zzov zzovVar = zzov.f10820b;
        zzovVar.b(zzjr.f10590a);
        zzovVar.a(zzjr.f10591b);
        if (zzjb.a()) {
            return;
        }
        zzpn zzpnVar = zzjk.f10578a;
        if (!zzjb.zza.zza.a()) {
            throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        zzpc zzpcVar = zzjv.f10593a;
        zzou zzouVar = zzou.f10818b;
        zzouVar.h(zzjv.f10593a);
        zzouVar.g(zzjv.f10594b);
        zzouVar.f(zzjv.f10595c);
        zzouVar.e(zzjv.f10596d);
        zzovVar.a(zzjk.f10578a);
        zzos zzosVar = zzos.f10816b;
        HashMap map = new HashMap();
        map.put("AES256_SIV", zzjt.f10592a);
        zzjn.zza zzaVar = new zzjn.zza(0);
        zzaVar.b(64);
        zzaVar.f10585b = zzjn.zzb.f10588d;
        map.put("AES256_SIV_RAW", zzaVar.a());
        zzosVar.b(Collections.unmodifiableMap(map));
        zzop.f10811b.a(zzjk.f10580c, zzjn.class);
        zzon.f10809b.b(zzjk.f10581d, zzjn.class);
        zznr.f10791d.c(zzjk.f10579b, true);
    }
}
