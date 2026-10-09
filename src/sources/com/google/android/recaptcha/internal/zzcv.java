package com.google.android.recaptcha.internal;

import a00.a;
import a00.e;
import android.app.Application;
import com.google.android.recaptcha.RecaptchaException;
import java.util.UUID;
import kotlin.jvm.internal.m;
import o4.c;
import vy.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcv {
    private final Application zza;
    private zzdc zzc;
    private final zzl zze;
    private final a zzb = new e();
    private final String zzd = UUID.randomUUID().toString();
    private zzbi zzf = new zzbi();

    /* JADX WARN: Multi-variable type inference failed */
    public zzcv(Application application) {
        this.zza = application;
        int i11 = 1;
        this.zze = new zzl(null, i11, 0 == true ? 1 : 0);
        int i12 = zzav.zza;
        zzaw[] zzawVarArr = {new zzaw(915034652, new zzaz(null, 1, null)), new zzaw(915034802, new zzfu()), new zzaw(915034662, new zzbe()), new zzaw(915034909, new zzjd()), new zzaw(915034675, new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(915034774, new zzex(0 == true ? 1 : 0, i11, 0 == true ? 1 : 0)), new zzaw(915034792, new zzfk(true)), new zzaw(735120228, application), new zzaw(915034663, new zzbf(application)), new zzaw(915034791, new zzfj()), new zzaw(915034643, new zzbm(application)), new zzaw(915034775, new zzfa()), new zzaw(915034787, new zzff())};
        for (int i13 = 0; i13 < 13; i13++) {
            zzaw zzawVar = zzawVarArr[i13];
            if (!zzav.zzc.containsKey(Integer.valueOf(zzawVar.zza()))) {
                zzav.zzc.put(Integer.valueOf(zzawVar.zza()), zzawVar);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcvVar, String str) throws zzbd {
        zzdc zzdcVar = zzcvVar.zzc;
        if (zzdcVar == null) {
            return null;
        }
        if (m.a(zzdcVar.zzd(), str)) {
            return zzdcVar;
        }
        throw new zzbd(zzbb.zzd, zzba.zzam, null);
    }

    public static final /* synthetic */ void zzc(zzcv zzcvVar, long j11) throws zzbd {
        if (j11 < 5000) {
            throw new zzbd(zzbb.zzj, zzba.zzI, null);
        }
        if (c.a(zzcvVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzbd(zzbb.zzc, zzba.zzao, null);
        }
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcvVar, String str, zzbi zzbiVar, zzch zzchVar, zzek zzekVar) {
        zzdt zzdtVar = new zzdt(str, zzbiVar, zzekVar, zzcvVar.zze);
        return m.a(zzchVar, zzch.zza) ? new zzef(zzdtVar) : new zzec(zzdtVar, zzbiVar, zzekVar, new zzbo());
    }

    public static /* synthetic */ Object zzh(zzcv zzcvVar, String str, long j11, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, d dVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            zzbiVar = zzcvVar.zzf;
        }
        zzbi zzbiVar2 = zzbiVar;
        if ((i11 & 16) != 0) {
            zzchVar = zzch.zza;
        }
        zzch zzchVar2 = zzchVar;
        if ((i11 & 2) != 0) {
            j11 = 10000;
        }
        return zzcvVar.zzg(str, j11, null, zzbiVar2, zzchVar2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzj(String str, int i11, fz.e eVar, d dVar) throws RecaptchaException {
        zzcu zzcuVar;
        Exception e8;
        zzen zzenVar;
        zzbd e10;
        if (dVar instanceof zzcu) {
            zzcuVar = (zzcu) dVar;
            int i12 = zzcuVar.zzc;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                zzcuVar.zzc = i12 - Integer.MIN_VALUE;
            } else {
                zzcuVar = new zzcu(this, dVar);
            }
        } else {
            zzcuVar = new zzcu(this, dVar);
        }
        Object objInvoke = zzcuVar.zza;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i13 = zzcuVar.zzc;
        if (i13 == 0) {
            com.bumptech.glide.e.F(objInvoke);
            zzek zzekVarZzk = zzk(str, this.zzf, i11);
            zzen zzenVarZzf = zzekVarZzk.zzf(6);
            try {
                zzcuVar.zzd = zzenVarZzf;
                zzcuVar.zzc = 1;
                objInvoke = eVar.invoke(zzekVarZzk, zzcuVar);
                if (objInvoke == obj) {
                    return obj;
                }
                zzenVar = zzenVarZzf;
            } catch (zzbd e11) {
                e10 = e11;
                zzenVar = zzenVarZzf;
                zzenVar.zzb(e10);
                throw e10.zzc();
            } catch (Exception e12) {
                e8 = e12;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zza, e8.getMessage());
                zzenVar.zzb(zzbdVar);
                throw zzbdVar.zzc();
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzenVar = zzcuVar.zzd;
            try {
                com.bumptech.glide.e.F(objInvoke);
            } catch (zzbd e13) {
                e10 = e13;
                zzenVar.zzb(e10);
                throw e10.zzc();
            } catch (Exception e14) {
                e8 = e14;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zza, e8.getMessage());
                zzenVar.zzb(zzbdVar2);
                throw zzbdVar2.zzc();
            }
        }
        zzenVar.zza();
        return objInvoke;
    }

    private final zzek zzk(String str, zzbi zzbiVar, int i11) {
        String string = UUID.randomUUID().toString();
        int i12 = zzav.zza;
        zzes zzesVar = new zzes(this.zza, new zzeu(((zzbr) com.bumptech.glide.d.v(zzcr.zza).getValue()).zzc()), zzbiVar.zza());
        zzek zzekVar = new zzek(str, this.zzd, string, i11, this.zza, zzesVar, null);
        zzekVar.zzc(string);
        return zzekVar;
    }

    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object zzg(String str, long j11, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, d dVar) throws Throwable {
        zzcs zzcsVar;
        zzbi zzbiVar2;
        zzch zzchVar2;
        long j12;
        zzcv zzcvVar;
        String str2;
        a aVar;
        a aVar2;
        int i11;
        if (dVar instanceof zzcs) {
            zzcsVar = (zzcs) dVar;
            int i12 = zzcsVar.zzg;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                zzcsVar.zzg = i12 - Integer.MIN_VALUE;
            } else {
                zzcsVar = new zzcs(this, dVar);
            }
        } else {
            zzcsVar = new zzcs(this, dVar);
        }
        Object objZzj = zzcsVar.zze;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i13 = zzcsVar.zzg;
        try {
            if (i13 == 0) {
                com.bumptech.glide.e.F(objZzj);
                a aVar4 = this.zzb;
                zzcsVar.zza = this;
                zzcsVar.zzh = str;
                zzcsVar.zzb = null;
                zzcsVar.zzj = zzbiVar;
                zzcsVar.zzi = zzchVar;
                zzcsVar.zzc = aVar4;
                zzcsVar.zzd = j11;
                zzcsVar.zzg = 1;
                if (aVar4.b(zzcsVar) != aVar3) {
                    zzbiVar2 = zzbiVar;
                    zzchVar2 = zzchVar;
                    j12 = j11;
                    zzcvVar = this;
                    str2 = str;
                    aVar = aVar4;
                }
                return aVar3;
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (a) zzcsVar.zza;
                try {
                    com.bumptech.glide.e.F(objZzj);
                    zzdc zzdcVar = (zzdc) objZzj;
                    aVar2.a(null);
                    return zzdcVar;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.a(null);
                    throw th;
                }
            }
            long j13 = zzcsVar.zzd;
            a aVar5 = (a) zzcsVar.zzc;
            zzch zzchVar3 = zzcsVar.zzi;
            zzbi zzbiVar3 = zzcsVar.zzj;
            String str3 = zzcsVar.zzh;
            zzcv zzcvVar2 = (zzcv) zzcsVar.zza;
            com.bumptech.glide.e.F(objZzj);
            zzchVar2 = zzchVar3;
            zzbiVar2 = zzbiVar3;
            str2 = str3;
            zzcvVar = zzcvVar2;
            j12 = j13;
            aVar = aVar5;
            if (m.a(zzchVar2, zzch.zza)) {
                i11 = 3;
            } else {
                i11 = m.a(zzchVar2, zzch.zzb) ? 4 : 2;
            }
            zzct zzctVar = new zzct(zzcvVar, str2, j12, null, zzbiVar2, zzchVar2, null);
            zzcsVar.zza = aVar;
            zzcsVar.zzh = null;
            zzcsVar.zzb = null;
            zzcsVar.zzj = null;
            zzcsVar.zzi = null;
            zzcsVar.zzc = null;
            zzcsVar.zzg = 2;
            objZzj = zzcvVar.zzj(str2, i11, zzctVar, zzcsVar);
            if (objZzj != aVar3) {
                aVar2 = aVar;
                zzdc zzdcVar2 = (zzdc) objZzj;
                aVar2.a(null);
                return zzdcVar2;
            }
            return aVar3;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.a(null);
            throw th;
        }
    }
}
