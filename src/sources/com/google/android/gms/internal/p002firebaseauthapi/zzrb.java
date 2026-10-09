package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzrb {
    static {
        int i11 = zzxk.f10993a;
        try {
            a();
        } catch (GeneralSecurityException e8) {
            throw new ExceptionInInitializerError(e8);
        }
    }

    public static void a() throws GeneralSecurityException {
        zzrg zzrgVar = zzrg.f10918a;
        zzov zzovVar = zzov.f10820b;
        zzovVar.b(zzrg.f10918a);
        zzovVar.a(zzrg.f10919b);
        zzovVar.b(zzqr.f10886a);
        zzjb.zza zzaVar = zzqu.f10898f;
        if (!zzaVar.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        zznk zznkVar = zzrt.f10928a;
        zzou zzouVar = zzou.f10818b;
        zzouVar.h(zzrt.f10930c);
        zzouVar.g(zzrt.f10931d);
        zzouVar.f(zzrt.f10932e);
        zzouVar.e(zzrt.f10933f);
        zzovVar.a(zzqu.f10893a);
        zzovVar.a(zzqu.f10894b);
        zzos zzosVar = zzos.f10816b;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", zzri.f10920a);
        zzra.zza zzaVarB = zzra.b();
        zzaVarB.f10903a = 32;
        zzaVarB.f10904b = 16;
        zzra.zzb zzbVar = zzra.zzb.f10910e;
        zzaVarB.f10906d = zzbVar;
        zzra.zzc zzcVar = zzra.zzc.f10914d;
        zzaVarB.f10905c = zzcVar;
        map.put("HMAC_SHA256_128BITTAG_RAW", zzaVarB.a());
        zzra.zza zzaVarB2 = zzra.b();
        zzaVarB2.f10903a = 32;
        zzaVarB2.f10904b = 32;
        zzra.zzb zzbVar2 = zzra.zzb.f10907b;
        zzaVarB2.f10906d = zzbVar2;
        zzaVarB2.f10905c = zzcVar;
        map.put("HMAC_SHA256_256BITTAG", zzaVarB2.a());
        zzra.zza zzaVarB3 = zzra.b();
        zzaVarB3.f10903a = 32;
        zzaVarB3.f10904b = 32;
        zzaVarB3.f10906d = zzbVar;
        zzaVarB3.f10905c = zzcVar;
        map.put("HMAC_SHA256_256BITTAG_RAW", zzaVarB3.a());
        zzra.zza zzaVarB4 = zzra.b();
        zzaVarB4.f10903a = 64;
        zzaVarB4.f10904b = 16;
        zzaVarB4.f10906d = zzbVar2;
        zzra.zzc zzcVar2 = zzra.zzc.f10916f;
        zzaVarB4.f10905c = zzcVar2;
        map.put("HMAC_SHA512_128BITTAG", zzaVarB4.a());
        zzra.zza zzaVarB5 = zzra.b();
        zzaVarB5.f10903a = 64;
        zzaVarB5.f10904b = 16;
        zzaVarB5.f10906d = zzbVar;
        zzaVarB5.f10905c = zzcVar2;
        map.put("HMAC_SHA512_128BITTAG_RAW", zzaVarB5.a());
        zzra.zza zzaVarB6 = zzra.b();
        zzaVarB6.f10903a = 64;
        zzaVarB6.f10904b = 32;
        zzaVarB6.f10906d = zzbVar2;
        zzaVarB6.f10905c = zzcVar2;
        map.put("HMAC_SHA512_256BITTAG", zzaVarB6.a());
        zzra.zza zzaVarB7 = zzra.b();
        zzaVarB7.f10903a = 64;
        zzaVarB7.f10904b = 32;
        zzaVarB7.f10906d = zzbVar;
        zzaVarB7.f10905c = zzcVar2;
        map.put("HMAC_SHA512_256BITTAG_RAW", zzaVarB7.a());
        map.put("HMAC_SHA512_512BITTAG", zzri.f10921b);
        zzra.zza zzaVarB8 = zzra.b();
        zzaVarB8.f10903a = 64;
        zzaVarB8.f10904b = 64;
        zzaVarB8.f10906d = zzbVar;
        zzaVarB8.f10905c = zzcVar2;
        map.put("HMAC_SHA512_512BITTAG_RAW", zzaVarB8.a());
        zzosVar.b(Collections.unmodifiableMap(map));
        zzon zzonVar = zzon.f10809b;
        zzonVar.b(zzqu.f10897e, zzra.class);
        zzop.f10811b.a(zzqu.f10896d, zzra.class);
        zznr zznrVar = zznr.f10791d;
        zznrVar.b(zzqu.f10895c, zzaVar, true);
        if (zzjb.a()) {
            return;
        }
        zzql zzqlVar = zzqm.f10871a;
        if (!zzjb.zza.zza.a()) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        zzouVar.h(zzro.f10923a);
        zzouVar.g(zzro.f10924b);
        zzouVar.f(zzro.f10925c);
        zzouVar.e(zzro.f10926d);
        zzonVar.b(zzqm.f10871a, zzqp.class);
        zzovVar.a(zzqm.f10872b);
        zzovVar.a(zzqm.f10873c);
        HashMap map2 = new HashMap();
        zzqp zzqpVar = zzri.f10922c;
        map2.put("AES_CMAC", zzqpVar);
        map2.put("AES256_CMAC", zzqpVar);
        zzqp.zza zzaVar2 = new zzqp.zza(0);
        zzaVar2.b(32);
        zzaVar2.c(16);
        zzaVar2.f10880c = zzqp.zzb.f10884e;
        map2.put("AES256_CMAC_RAW", zzaVar2.a());
        zzosVar.b(Collections.unmodifiableMap(map2));
        zznrVar.c(zzqm.f10874d, true);
    }
}
