package com.google.android.recaptcha.internal;

import com.bumptech.glide.e;
import com.google.android.recaptcha.RecaptchaAction;
import fz.c;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import qy.b0;
import rz.e0;
import rz.s;
import rz.t;
import vy.d;
import wy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzec implements zzcn {
    private final zzdt zza;
    private final zzek zzb;
    private zzbd zzd;
    private zzsc zze;
    private final zzbi zzg;
    private s zzc = e0.b();
    private zzcm zzf = zzcm.zza;

    public zzec(zzdt zzdtVar, zzbi zzbiVar, zzek zzekVar, zzbo zzboVar) {
        this.zza = zzdtVar;
        this.zzg = zzbiVar;
        this.zzb = zzekVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzl(c cVar, d dVar) {
        zzdv zzdvVar;
        zzbn zzbnVar;
        if (dVar instanceof zzdv) {
            zzdvVar = (zzdv) dVar;
            int i11 = zzdvVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzdvVar.zzc = i11 - Integer.MIN_VALUE;
            } else {
                zzdvVar = new zzdv(this, dVar);
            }
        } else {
            zzdvVar = new zzdv(this, dVar);
        }
        Object obj = zzdvVar.zza;
        Object obj2 = a.COROUTINE_SUSPENDED;
        int i12 = zzdvVar.zzc;
        if (i12 == 0) {
            e.F(obj);
            zzbn zzbnVar2 = new zzbn();
            zzdvVar.zzd = zzbnVar2;
            zzdvVar.zzc = 1;
            if (cVar.invoke(zzdvVar) == obj2) {
                return obj2;
            }
            zzbnVar = zzbnVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzbnVar = zzdvVar.zzd;
            e.F(obj);
        }
        zzbnVar.zzc();
        return new Long(zzbnVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[Catch: Exception -> 0x002f, TRY_ENTER, TryCatch #1 {Exception -> 0x002f, blocks: (B:13:0x002b, B:26:0x0063, B:31:0x0076, B:32:0x007f), top: B:53:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzm(long j11, d dVar) throws zzbd {
        zzdw zzdwVar;
        zzec zzecVar;
        zzec zzecVar2;
        zzbd zzbdVar;
        zzbd zzbdVar2;
        long jLongValue;
        if (dVar instanceof zzdw) {
            zzdwVar = (zzdw) dVar;
            int i11 = zzdwVar.zzd;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzdwVar.zzd = i11 - Integer.MIN_VALUE;
            } else {
                zzdwVar = new zzdw(this, dVar);
            }
        } else {
            zzdwVar = new zzdw(this, dVar);
        }
        Object objZzl = zzdwVar.zzb;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = zzdwVar.zzd;
        try {
            if (i12 == 0) {
                e.F(objZzl);
                zzdwVar.zze = this;
                zzdwVar.zza = j11;
                zzdwVar.zzd = 1;
                if (zzn(j11, zzdwVar) != aVar) {
                    zzecVar = this;
                }
                return aVar;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = zzdwVar.zza;
                zzecVar2 = zzdwVar.zze;
                try {
                    e.F(objZzl);
                    jLongValue = j11 - ((Number) objZzl).longValue();
                    if (jLongValue >= 500) {
                        return new Long(jLongValue);
                    }
                    throw new zzbd(zzbb.zzc, zzba.zzar, null);
                } catch (Exception e8) {
                    e = e8;
                    zzbdVar = e instanceof zzbd ? (zzbd) e : null;
                    if (zzbdVar == null) {
                        zzbdVar = new zzbd(zzbb.zzc, zzba.zzar, e.getMessage());
                    }
                    if (m.a(zzecVar2.zzf, zzcm.zzd)) {
                    }
                    throw zzbdVar2;
                }
            }
            j11 = zzdwVar.zza;
            zzecVar = zzdwVar.zze;
            e.F(objZzl);
            zzdy zzdyVar = new zzdy(j11, zzecVar, null);
            zzdwVar.zze = zzecVar;
            zzdwVar.zza = j11;
            zzdwVar.zzd = 2;
            objZzl = zzecVar.zzl(zzdyVar, zzdwVar);
            if (objZzl != aVar) {
                zzecVar2 = zzecVar;
                jLongValue = j11 - ((Number) objZzl).longValue();
                if (jLongValue >= 500) {
                    return new Long(jLongValue);
                }
                throw new zzbd(zzbb.zzc, zzba.zzar, null);
            }
            return aVar;
        } catch (Exception e10) {
            e = e10;
            zzecVar2 = zzecVar;
            if (e instanceof zzbd) {
            }
            if (zzbdVar == null) {
                zzbdVar = new zzbd(zzbb.zzc, zzba.zzar, e.getMessage());
            }
            if ((!m.a(zzecVar2.zzf, zzcm.zzd) || m.a(zzecVar2.zzf, zzcm.zzc)) && (zzbdVar2 = zzecVar2.zzd) != null) {
                throw zzbdVar2;
            }
            throw zzbdVar;
        }
    }

    private final Object zzn(long j11, d dVar) {
        boolean zA = m.a(this.zzf, zzcm.zzb);
        b0 b0Var = b0.f48488a;
        if (!zA && !m.a(this.zzf, zzcm.zzc) && (!m.a(this.zzf, zzcm.zzd) || zzo(this.zzd))) {
            this.zzf = zzcm.zzc;
            t tVarB = e0.b();
            this.zzc = tVarB;
            e0.B(this.zzg.zza(), null, null, new zzeb(this, tVarB, j11, null), 3);
        }
        return b0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzo(Exception exc) {
        if (!(exc instanceof zzbd)) {
            return true;
        }
        zzbd zzbdVar = (zzbd) exc;
        return (m.a(zzbdVar.zzb(), zzbb.zzd) || m.a(zzbdVar.zzb(), zzbb.zze) || m.a(zzbdVar.zzb(), zzbb.zzf)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j11, d dVar) throws zzbd {
        zzdu zzduVar;
        String str2;
        RecaptchaAction recaptchaAction2;
        Object objZzm;
        zzec zzecVar;
        String str3;
        double d5;
        zzec zzecVar2;
        zzsc zzscVar;
        String str4;
        String str5;
        zzec zzecVar3;
        if (dVar instanceof zzdu) {
            zzduVar = (zzdu) dVar;
            int i11 = zzduVar.zzd;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzduVar.zzd = i11 - Integer.MIN_VALUE;
            } else {
                zzduVar = new zzdu(this, dVar);
            }
        } else {
            zzduVar = new zzdu(this, dVar);
        }
        zzdu zzduVar2 = zzduVar;
        Object objZzm2 = zzduVar2.zzb;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = zzduVar2.zzd;
        try {
            if (i12 == 0) {
                e.F(objZzm2);
                zzduVar2.zze = this;
                str2 = str;
                zzduVar2.zzf = str2;
                recaptchaAction2 = recaptchaAction;
                zzduVar2.zzg = recaptchaAction2;
                zzduVar2.zzd = 1;
                objZzm = zzm(j11, zzduVar2);
                if (objZzm != aVar) {
                    zzecVar = this;
                }
                return aVar;
            }
            if (i12 == 1) {
                recaptchaAction2 = zzduVar2.zzg;
                String str6 = zzduVar2.zzf;
                zzecVar = zzduVar2.zze;
                e.F(objZzm2);
                objZzm = objZzm2;
                str2 = str6;
            } else {
                if (i12 == 2) {
                    d5 = zzduVar2.zza;
                    recaptchaAction2 = zzduVar2.zzg;
                    str3 = zzduVar2.zzf;
                    zzecVar2 = zzduVar2.zze;
                    e.F(objZzm2);
                    zzsi zzsiVar = (zzsi) objZzm2;
                    zzdt zzdtVar = zzecVar2.zza;
                    zzscVar = zzecVar2.zze;
                    if (zzscVar == null) {
                        zzscVar = null;
                    }
                    zzsp zzspVarZzi = zzdtVar.zzi(recaptchaAction2, zzsiVar, zzscVar);
                    zzdt zzdtVar2 = zzecVar2.zza;
                    long j12 = (long) d5;
                    zzduVar2.zze = zzecVar2;
                    zzduVar2.zzf = str3;
                    zzduVar2.zzg = null;
                    zzduVar2.zzd = 3;
                    str4 = str3;
                    objZzm2 = zzdtVar2.zzm(zzspVarZzi, str4, j12, zzduVar2);
                    if (objZzm2 != aVar) {
                        str5 = str4;
                        zzecVar3 = zzecVar2;
                    }
                    return aVar;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = zzduVar2.zzf;
                zzecVar3 = zzduVar2.zze;
                e.F(objZzm2);
            }
            zzsr zzsrVar = (zzsr) objZzm2;
            zzecVar3.zza.zzq(str5, zzsrVar);
            return zzsrVar.zzj();
            double dLongValue = ((Number) objZzm).longValue();
            zzdt zzdtVar3 = zzecVar.zza;
            double d11 = 0.45d * dLongValue;
            zzduVar2.zze = zzecVar;
            zzduVar2.zzf = str2;
            zzduVar2.zzg = recaptchaAction2;
            double d12 = dLongValue * 0.55d;
            zzduVar2.zza = d12;
            zzduVar2.zzd = 2;
            Object objZzl = zzdtVar3.zzl(str2, (long) d11, zzduVar2);
            if (objZzl != aVar) {
                zzec zzecVar4 = zzecVar;
                str3 = str2;
                objZzm2 = objZzl;
                d5 = d12;
                zzecVar2 = zzecVar4;
                zzsi zzsiVar2 = (zzsi) objZzm2;
                zzdt zzdtVar4 = zzecVar2.zza;
                zzscVar = zzecVar2.zze;
                if (zzscVar == null) {
                    zzscVar = null;
                }
                zzsp zzspVarZzi2 = zzdtVar4.zzi(recaptchaAction2, zzsiVar2, zzscVar);
                zzdt zzdtVar5 = zzecVar2.zza;
                long j13 = (long) d5;
                zzduVar2.zze = zzecVar2;
                zzduVar2.zzf = str3;
                zzduVar2.zzg = null;
                zzduVar2.zzd = 3;
                str4 = str3;
                objZzm2 = zzdtVar5.zzm(zzspVarZzi2, str4, j13, zzduVar2);
                if (objZzm2 != aVar) {
                    str5 = str4;
                    zzecVar3 = zzecVar2;
                    zzsr zzsrVar2 = (zzsr) objZzm2;
                    zzecVar3.zza.zzq(str5, zzsrVar2);
                    return zzsrVar2.zzj();
                }
            }
            return aVar;
        } catch (zzbd e8) {
            throw e8;
        } catch (Exception e10) {
            throw new zzbd(zzbb.zzb, zzba.zzay, e10.getMessage());
        }
    }

    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zzb(long j11, d dVar) {
        Object objZzn = zzn(j11, dVar);
        return objZzn == a.COROUTINE_SUSPENDED ? objZzn : b0.f48488a;
    }
}
