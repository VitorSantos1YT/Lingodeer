package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzda {
    static {
        int i11 = zzxk.f10993a;
        try {
            a();
        } catch (GeneralSecurityException e8) {
            throw new ExceptionInInitializerError(e8);
        }
    }

    public static void a() throws GeneralSecurityException {
        zzdf zzdfVar = zzdf.f10295a;
        zzov zzovVar = zzov.f10820b;
        zzovVar.b(zzdf.f10295a);
        zzovVar.a(zzdf.f10296b);
        zzrb.a();
        zzjb.zza zzaVar = zzdl.f10310e;
        if (!zzaVar.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzpc zzpcVar = zzgk.f10489a;
        zzou zzouVar = zzou.f10818b;
        zzouVar.h(zzgk.f10489a);
        zzouVar.g(zzgk.f10490b);
        zzouVar.f(zzgk.f10491c);
        zzouVar.e(zzgk.f10492d);
        zzovVar.a(zzdl.f10306a);
        zzos zzosVar = zzos.f10816b;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzfq.f10459e);
        zzdo.zza zzaVarB = zzdo.b();
        zzaVarB.b(16);
        zzaVarB.c(32);
        zzaVarB.e(16);
        zzaVarB.d(16);
        zzdo.zzc zzcVar = zzdo.zzc.f10329d;
        zzaVarB.f10321e = zzcVar;
        zzdo.zzb zzbVar = zzdo.zzb.f10325d;
        zzaVarB.f10322f = zzbVar;
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzaVarB.a());
        map.put("AES256_CTR_HMAC_SHA256", zzfq.f10460f);
        zzdo.zza zzaVarB2 = zzdo.b();
        zzaVarB2.b(32);
        zzaVarB2.c(32);
        zzaVarB2.e(32);
        zzaVarB2.d(16);
        zzaVarB2.f10321e = zzcVar;
        zzaVarB2.f10322f = zzbVar;
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzaVarB2.a());
        zzosVar.b(Collections.unmodifiableMap(map));
        zzop zzopVar = zzop.f10811b;
        zzopVar.a(zzdl.f10308c, zzdo.class);
        zzon zzonVar = zzon.f10809b;
        zzonVar.b(zzdl.f10309d, zzdo.class);
        zznr zznrVar = zznr.f10791d;
        zznrVar.b(zzdl.f10307b, zzaVar, true);
        zzjb.zza zzaVar2 = zzea.f10366e;
        if (!zzaVar2.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzouVar.h(zzgx.f10501a);
        zzouVar.g(zzgx.f10502b);
        zzouVar.f(zzgx.f10503c);
        zzouVar.e(zzgx.f10504d);
        zzovVar.a(zzea.f10362a);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", zzfq.f10455a);
        zzed.zza zzaVarB3 = zzed.b();
        zzaVarB3.b();
        zzaVarB3.c(16);
        zzaVarB3.d();
        zzed.zzb zzbVar2 = zzed.zzb.f10377d;
        zzaVarB3.f10374d = zzbVar2;
        map2.put("AES128_GCM_RAW", zzaVarB3.a());
        map2.put("AES256_GCM", zzfq.f10456b);
        zzed.zza zzaVarB4 = zzed.b();
        zzaVarB4.b();
        zzaVarB4.c(32);
        zzaVarB4.d();
        zzaVarB4.f10374d = zzbVar2;
        map2.put("AES256_GCM_RAW", zzaVarB4.a());
        zzosVar.b(Collections.unmodifiableMap(map2));
        zzopVar.a(zzea.f10364c, zzed.class);
        zzonVar.b(zzea.f10365d, zzed.class);
        zznrVar.b(zzea.f10363b, zzaVar2, true);
        if (zzjb.a()) {
            return;
        }
        zzpn zzpnVar = zzdt.f10340a;
        zzjb.zza zzaVar3 = zzjb.zza.zza;
        if (!zzaVar3.a()) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        zzouVar.h(zzgp.f10493a);
        zzouVar.g(zzgp.f10494b);
        zzouVar.f(zzgp.f10495c);
        zzouVar.e(zzgp.f10496d);
        zzovVar.a(zzdt.f10340a);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", zzfq.f10457c);
        zzdu.zzb zzbVarB = zzdu.b();
        zzbVarB.b(16);
        zzbVarB.c(16);
        zzbVarB.d();
        zzdu.zza zzaVar4 = zzdu.zza.f10349d;
        zzbVarB.f10354d = zzaVar4;
        map3.put("AES128_EAX_RAW", zzbVarB.a());
        map3.put("AES256_EAX", zzfq.f10458d);
        zzdu.zzb zzbVarB2 = zzdu.b();
        zzbVarB2.b(16);
        zzbVarB2.c(32);
        zzbVarB2.d();
        zzbVarB2.f10354d = zzaVar4;
        map3.put("AES256_EAX_RAW", zzbVarB2.a());
        zzosVar.b(Collections.unmodifiableMap(map3));
        zzonVar.b(zzdt.f10342c, zzdu.class);
        zznrVar.c(zzdt.f10341b, true);
        zzpn zzpnVar2 = zzeg.f10386a;
        if (!zzaVar3.a()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        zzouVar.h(zzhf.f10515a);
        zzouVar.g(zzhf.f10516b);
        zzouVar.f(zzhf.f10517c);
        zzouVar.e(zzhf.f10518d);
        HashMap map4 = new HashMap();
        zzek.zzb zzbVarB3 = zzek.b();
        zzbVarB3.b(16);
        zzek.zza zzaVar5 = zzek.zza.f10392b;
        zzbVarB3.f10397b = zzaVar5;
        map4.put("AES128_GCM_SIV", zzbVarB3.a());
        zzek.zzb zzbVarB4 = zzek.b();
        zzbVarB4.b(16);
        zzek.zza zzaVar6 = zzek.zza.f10394d;
        zzbVarB4.f10397b = zzaVar6;
        map4.put("AES128_GCM_SIV_RAW", zzbVarB4.a());
        zzek.zzb zzbVarB5 = zzek.b();
        zzbVarB5.b(32);
        zzbVarB5.f10397b = zzaVar5;
        map4.put("AES256_GCM_SIV", zzbVarB5.a());
        zzek.zzb zzbVarB6 = zzek.b();
        zzbVarB6.b(32);
        zzbVarB6.f10397b = zzaVar6;
        map4.put("AES256_GCM_SIV_RAW", zzbVarB6.a());
        zzosVar.b(Collections.unmodifiableMap(map4));
        zzopVar.a(zzeg.f10388c, zzek.class);
        zzonVar.b(zzeg.f10387b, zzek.class);
        zzovVar.a(zzeg.f10386a);
        zznrVar.c(zzeg.f10389d, true);
        zzpn zzpnVar3 = zzep.f10402a;
        if (!zzaVar3.a()) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        zzouVar.h(zzho.f10527a);
        zzouVar.g(zzho.f10528b);
        zzouVar.f(zzho.f10529c);
        zzouVar.e(zzho.f10530d);
        zzovVar.a(zzep.f10402a);
        zzonVar.b(zzep.f10403b, zzeq.class);
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new zzeq(zzeq.zza.f10406b));
        map5.put("CHACHA20_POLY1305_RAW", new zzeq(zzeq.zza.f10408d));
        zzosVar.b(Collections.unmodifiableMap(map5));
        zznrVar.c(zzep.f10404c, true);
        zzpn zzpnVar4 = zzes.f10410a;
        if (!zzaVar3.a()) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        zzouVar.h(zzfb.f10424a);
        zzouVar.g(zzfb.f10425b);
        zzouVar.f(zzfb.f10426c);
        zzouVar.e(zzfb.f10427d);
        zzovVar.a(zzes.f10410a);
        zzonVar.b(zzes.f10412c, zzez.class);
        zznrVar.c(zzes.f10411b, true);
        zzny zznyVar = zzew.f10413a;
        if (!zzaVar3.a()) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        zzouVar.h(zzfk.f10450a);
        zzouVar.g(zzfk.f10451b);
        zzouVar.f(zzfk.f10452c);
        zzouVar.e(zzfk.f10453d);
        zzonVar.b(zzew.f10414b, zzfg.class);
        zzovVar.a(zzew.f10415c);
        zznrVar.c(zzew.f10413a, true);
        zzpn zzpnVar5 = zzge.f10476a;
        if (!zzaVar3.a()) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        zzouVar.h(zziq.f10560a);
        zzouVar.g(zziq.f10561b);
        zzouVar.f(zziq.f10562c);
        zzouVar.e(zziq.f10563d);
        zzovVar.a(zzge.f10476a);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new zzgi(zzgi.zza.f10485b));
        map6.put("XCHACHA20_POLY1305_RAW", new zzgi(zzgi.zza.f10487d));
        zzosVar.b(Collections.unmodifiableMap(map6));
        zzonVar.b(zzge.f10479d, zzgi.class);
        zzopVar.a(zzge.f10478c, zzgi.class);
        zznrVar.c(zzge.f10477b, true);
        zzgc zzgcVar = zzfz.f10465a;
        zzouVar.h(zzih.f10548a);
        zzouVar.g(zzih.f10549b);
        zzouVar.f(zzih.f10550c);
        zzouVar.e(zzih.f10551d);
        HashMap map7 = new HashMap();
        map7.put("XAES_256_GCM_192_BIT_NONCE", zzfq.f10461g);
        map7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzfq.f10462h);
        map7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzfq.f10463i);
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzfq.f10464j);
        zzosVar.b(Collections.unmodifiableMap(map7));
        zzovVar.a(zzfz.f10466b);
        zzonVar.b(zzfz.f10465a, zzgd.class);
    }
}
