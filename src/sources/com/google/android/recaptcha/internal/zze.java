package com.google.android.recaptcha.internal;

import com.bumptech.glide.e;
import qy.b0;
import qy.o;
import rz.e0;
import vy.d;
import wy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zze {
    private boolean zza;

    public zzen zza(String str) {
        throw null;
    }

    public zzen zzb() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object zzc(String str, long j11, d dVar) {
        zza zzaVar;
        zzen zzenVarZza;
        Exception exc;
        long j12;
        zzen zzenVar;
        zze zzeVar;
        zze zzeVar2;
        zzbd zzbdVarZza;
        String str2;
        zze zzeVar3;
        String str3;
        long j13;
        Exception e8;
        Object objZzd;
        String str4 = str;
        long j14 = j11;
        if (dVar instanceof zza) {
            zzaVar = (zza) dVar;
            int i11 = zzaVar.zze;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzaVar.zze = i11 - Integer.MIN_VALUE;
            } else {
                zzaVar = new zza(this, dVar);
            }
        } else {
            zzaVar = new zza(this, dVar);
        }
        zza zzaVar2 = zzaVar;
        Object objN = zzaVar2.zzc;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = zzaVar2.zze;
        if (i12 == 0) {
            e.F(objN);
            zzenVarZza = zza(str);
            try {
                zzb zzbVar = new zzb(this, str4, null);
                zzaVar2.zza = this;
                zzaVar2.zzf = str4;
                zzaVar2.zzg = zzenVarZza;
                zzaVar2.zzb = j14;
                zzaVar2.zze = 1;
                objN = e0.N(j14, zzbVar, zzaVar2);
                if (objN != aVar) {
                    zzeVar2 = this;
                }
            } catch (Exception e10) {
                exc = e10;
                j12 = j14;
                zzenVar = zzenVarZza;
                zzeVar = this;
                zzbdVarZza = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
                if (zzenVar != null) {
                    zzenVar.zzb(zzbdVarZza);
                }
                zzaVar2.zza = zzeVar;
                zzaVar2.zzf = str4;
                zzaVar2.zzg = null;
                zzaVar2.zze = 2;
                str2 = str4;
                if (zzeVar.zzi(str2, j12, exc, zzaVar2) != aVar) {
                    zzeVar3 = zzeVar;
                    str3 = str2;
                    zzaVar2.zza = null;
                    zzaVar2.zzf = null;
                    zzaVar2.zze = 3;
                    objZzd = zzeVar3.zzd(str3, zzaVar2);
                    if (objZzd != aVar) {
                        return objZzd;
                    }
                }
            }
            return aVar;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.F(objN);
                return objN;
            }
            str3 = zzaVar2.zzf;
            zzeVar3 = (zze) zzaVar2.zza;
            e.F(objN);
            zzaVar2.zza = null;
            zzaVar2.zzf = null;
            zzaVar2.zze = 3;
            objZzd = zzeVar3.zzd(str3, zzaVar2);
            if (objZzd != aVar) {
                return aVar;
            }
            return objZzd;
        }
        long j15 = zzaVar2.zzb;
        zzenVar = zzaVar2.zzg;
        String str5 = zzaVar2.zzf;
        zzeVar2 = (zze) zzaVar2.zza;
        try {
            e.F(objN);
            zzenVarZza = zzenVar;
            j14 = j15;
            str4 = str5;
        } catch (Exception e11) {
            e8 = e11;
            j13 = j15;
            str4 = str5;
            zzeVar = zzeVar2;
            j12 = j13;
            exc = e8;
            zzbdVarZza = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVarZza);
            }
            zzaVar2.zza = zzeVar;
            zzaVar2.zzf = str4;
            zzaVar2.zzg = null;
            zzaVar2.zze = 2;
            str2 = str4;
            if (zzeVar.zzi(str2, j12, exc, zzaVar2) != aVar) {
                zzeVar3 = zzeVar;
                str3 = str2;
                zzaVar2.zza = null;
                zzaVar2.zzf = null;
                zzaVar2.zze = 3;
                objZzd = zzeVar3.zzd(str3, zzaVar2);
                if (objZzd != aVar) {
                    return objZzd;
                }
            }
            return aVar;
        }
        try {
            Object obj = ((o) objN).f48498a;
            e.F(obj);
            zzsi zzsiVar = (zzsi) obj;
            if (zzenVarZza == null) {
                return zzsiVar;
            }
            zzenVarZza.zza();
            return zzsiVar;
        } catch (Exception e12) {
            e8 = e12;
            j13 = j14;
            zzenVar = zzenVarZza;
            zzeVar = zzeVar2;
            j12 = j13;
            exc = e8;
            zzbdVarZza = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVarZza);
            }
            zzaVar2.zza = zzeVar;
            zzaVar2.zzf = str4;
            zzaVar2.zzg = null;
            zzaVar2.zze = 2;
            str2 = str4;
            if (zzeVar.zzi(str2, j12, exc, zzaVar2) != aVar) {
                zzeVar3 = zzeVar;
                str3 = str2;
                zzaVar2.zza = null;
                zzaVar2.zzf = null;
                zzaVar2.zze = 3;
                objZzd = zzeVar3.zzd(str3, zzaVar2);
                if (objZzd != aVar) {
                    return objZzd;
                }
            }
            return aVar;
        }
    }

    public abstract Object zzd(String str, d dVar);

    /* JADX WARN: Code duplicated, block: B:37:0x0099 A[PHI: r9 r10 r12
      0x0099: PHI (r9v8 com.google.android.recaptcha.internal.zzen) = (r9v5 com.google.android.recaptcha.internal.zzen), (r9v14 com.google.android.recaptcha.internal.zzen) binds: [B:36:0x0097, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r10v6 com.google.android.recaptcha.internal.zze) = (r10v3 com.google.android.recaptcha.internal.zze), (r10v10 com.google.android.recaptcha.internal.zze) binds: [B:36:0x0097, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r12v8 java.lang.Object) = (r12v5 java.lang.Object), (r12v1 java.lang.Object) binds: [B:36:0x0097, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zze(long j11, zzsc zzscVar, d dVar) {
        zzc zzcVar;
        Exception e8;
        zze zzeVar;
        zzen zzenVar;
        zzbd zzbdVar;
        zzbd zzbdVar2;
        if (dVar instanceof zzc) {
            zzcVar = (zzc) dVar;
            int i11 = zzcVar.zzd;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzcVar.zzd = i11 - Integer.MIN_VALUE;
            } else {
                zzcVar = new zzc(this, dVar);
            }
        } else {
            zzcVar = new zzc(this, dVar);
        }
        Object objZzj = zzcVar.zzb;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = zzcVar.zzd;
        b0 b0Var = b0.f48488a;
        if (i12 == 0) {
            e.F(objZzj);
            zzen zzenVarZzb = zzb();
            if (this.zza) {
                zzenVarZzb.zza();
                return b0Var;
            }
            try {
                zzd zzdVar = new zzd(this, zzscVar, null);
                zzcVar.zza = this;
                zzcVar.zze = zzenVarZzb;
                zzcVar.zzd = 1;
                Object objN = e0.N(j11, zzdVar, zzcVar);
                if (objN != aVar) {
                    objZzj = objN;
                    zzenVar = zzenVarZzb;
                    zzeVar = this;
                }
            } catch (Exception e10) {
                e8 = e10;
                zzeVar = this;
                zzenVar = zzenVarZzb;
                zzeVar.zza = false;
                zzcVar.zza = zzeVar;
                zzcVar.zze = zzenVar;
                zzcVar.zzd = 2;
                objZzj = zzeVar.zzj(e8, zzcVar);
                if (objZzj != aVar) {
                    zzbdVar = (zzbd) objZzj;
                    if (zzenVar != null) {
                        zzenVar.zzb(zzbdVar);
                    }
                    zzcVar.zza = zzbdVar;
                    zzcVar.zze = null;
                    zzcVar.zzd = 3;
                    if (zzeVar.zzg(zzbdVar, zzcVar) != aVar) {
                        zzbdVar2 = zzbdVar;
                        return e.l(zzbdVar2);
                    }
                }
            }
            return aVar;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                zzenVar = zzcVar.zze;
                zzeVar = (zze) zzcVar.zza;
                e.F(objZzj);
                zzbdVar = (zzbd) objZzj;
                if (zzenVar != null) {
                    zzenVar.zzb(zzbdVar);
                }
                zzcVar.zza = zzbdVar;
                zzcVar.zze = null;
                zzcVar.zzd = 3;
                if (zzeVar.zzg(zzbdVar, zzcVar) != aVar) {
                    zzbdVar2 = zzbdVar;
                }
                return aVar;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzbdVar2 = (zzbd) zzcVar.zza;
            e.F(objZzj);
            return e.l(zzbdVar2);
        }
        zzenVar = zzcVar.zze;
        zzeVar = (zze) zzcVar.zza;
        try {
            e.F(objZzj);
        } catch (Exception e11) {
            e8 = e11;
            zzeVar.zza = false;
            zzcVar.zza = zzeVar;
            zzcVar.zze = zzenVar;
            zzcVar.zzd = 2;
            objZzj = zzeVar.zzj(e8, zzcVar);
            if (objZzj != aVar) {
                zzbdVar = (zzbd) objZzj;
                if (zzenVar != null) {
                    zzenVar.zzb(zzbdVar);
                }
                zzcVar.zza = zzbdVar;
                zzcVar.zze = null;
                zzcVar.zzd = 3;
                if (zzeVar.zzg(zzbdVar, zzcVar) != aVar) {
                    zzbdVar2 = zzbdVar;
                    return e.l(zzbdVar2);
                }
            }
            return aVar;
        }
        e.F(((o) objZzj).f48498a);
        zzeVar.zza = true;
        if (zzenVar != null) {
            zzenVar.zza();
        }
        return b0Var;
    }

    public abstract Object zzf(String str, d dVar);

    public Object zzg(zzbd zzbdVar, d dVar) {
        return b0.f48488a;
    }

    public abstract Object zzh(zzsc zzscVar, d dVar);

    public Object zzi(String str, long j11, Exception exc, d dVar) {
        return b0.f48488a;
    }

    public Object zzj(Exception exc, d dVar) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    public final boolean zzl() {
        return this.zza;
    }

    public void zzk(zzsr zzsrVar) {
    }
}
