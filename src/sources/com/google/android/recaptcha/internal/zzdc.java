package com.google.android.recaptcha.internal;

import com.bumptech.glide.e;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.UUID;
import oz.o;
import rz.e0;
import vy.d;
import wy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdc implements RecaptchaClient, RecaptchaTasksClient {
    private static final o zza = new o("^[a-zA-Z0-9/_]{0,100}$");
    private final zzcn zzb;
    private final String zzc;
    private final zzek zzd;
    private final zzbi zze;

    public zzdc(zzcn zzcnVar, String str, zzbi zzbiVar, zzek zzekVar) {
        this.zzb = zzcnVar;
        this.zzc = str;
        this.zze = zzbiVar;
        this.zzd = zzekVar;
    }

    public static final /* synthetic */ void zze(zzdc zzdcVar, long j11, RecaptchaAction recaptchaAction) throws zzbd {
        zzbd zzbdVar = !zza.f(recaptchaAction.getAction()) ? new zzbd(zzbb.zzg, zzba.zzh, null) : null;
        if (j11 < 5000) {
            zzbdVar = new zzbd(zzbb.zzb, zzba.zzI, null);
        }
        if (zzbdVar != null) {
            throw zzbdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzf(RecaptchaAction recaptchaAction, long j11, d dVar) {
        zzcy zzcyVar;
        zzbd zzbdVar;
        if (dVar instanceof zzcy) {
            zzcyVar = (zzcy) dVar;
            int i11 = zzcyVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzcyVar.zzc = i11 - Integer.MIN_VALUE;
            } else {
                zzcyVar = new zzcy(this, dVar);
            }
        } else {
            zzcyVar = new zzcy(this, dVar);
        }
        Object objZzg = zzcyVar.zza;
        Object obj = a.COROUTINE_SUSPENDED;
        int i12 = zzcyVar.zzc;
        if (i12 == 0) {
            e.F(objZzg);
            try {
                String string = UUID.randomUUID().toString();
                try {
                    fz.e zzczVar = new zzcz(this, j11, recaptchaAction, string, null);
                    zzcyVar.zzc = 1;
                    objZzg = zzg(string, zzczVar, zzcyVar);
                    if (objZzg == obj) {
                        return obj;
                    }
                } catch (zzbd e8) {
                    e = e8;
                    zzbdVar = e;
                    return e.l(zzbdVar.zzc());
                }
            } catch (zzbd e10) {
                e = e10;
                zzbdVar = e;
                return e.l(zzbdVar.zzc());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                e.F(objZzg);
            } catch (zzbd e11) {
                zzbdVar = e11;
                return e.l(zzbdVar.zzc());
            }
        }
        return ((qy.o) objZzg).f48498a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Object zzg(String str, fz.e eVar, d dVar) throws zzbd {
        zzdb zzdbVar;
        if (dVar instanceof zzdb) {
            zzdbVar = (zzdb) dVar;
            int i11 = zzdbVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzdbVar.zzc = i11 - Integer.MIN_VALUE;
            } else {
                zzdbVar = new zzdb(this, dVar);
            }
        } else {
            zzdbVar = new zzdb(this, dVar);
        }
        Object objInvoke = zzdbVar.zza;
        Object obj = a.COROUTINE_SUSPENDED;
        int i12 = zzdbVar.zzc;
        try {
            if (i12 == 0) {
                e.F(objInvoke);
                zzek zzekVarZza = this.zzd.zza();
                zzekVarZza.zzc(str);
                zzen zzenVarZzf = zzekVarZza.zzf(9);
                zzdbVar.zzd = zzenVarZzf;
                zzdbVar.zzc = 1;
                objInvoke = eVar.invoke(zzekVarZza, zzdbVar);
                str = zzenVarZzf;
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zzen zzenVar = zzdbVar.zzd;
                e.F(objInvoke);
                str = zzenVar;
            }
            str.zza();
            return objInvoke;
        } catch (zzbd e8) {
            str.zzb(e8);
            throw e8;
        } catch (Exception e10) {
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzX, e10.getMessage());
            str.zzb(zzbdVar);
            throw zzbdVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-0E7RQCE */
    public final Object mo207execute0E7RQCE(RecaptchaAction recaptchaAction, long j11, d<? super qy.o> dVar) {
        zzcw zzcwVar;
        if (dVar instanceof zzcw) {
            zzcwVar = (zzcw) dVar;
            int i11 = zzcwVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzcwVar.zzc = i11 - Integer.MIN_VALUE;
            } else {
                zzcwVar = new zzcw(this, dVar);
            }
        } else {
            zzcwVar = new zzcw(this, dVar);
        }
        Object obj = zzcwVar.zza;
        Object obj2 = a.COROUTINE_SUSPENDED;
        int i12 = zzcwVar.zzc;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.F(obj);
            return ((qy.o) obj).f48498a;
        }
        e.F(obj);
        zzcwVar.zzc = 1;
        Object objZzf = zzf(recaptchaAction, j11, zzcwVar);
        return objZzf == obj2 ? obj2 : objZzf;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-gIAlu-s */
    public final Object mo208executegIAlus(RecaptchaAction recaptchaAction, d<? super qy.o> dVar) {
        zzcx zzcxVar;
        if (dVar instanceof zzcx) {
            zzcxVar = (zzcx) dVar;
            int i11 = zzcxVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzcxVar.zzc = i11 - Integer.MIN_VALUE;
            } else {
                zzcxVar = new zzcx(this, dVar);
            }
        } else {
            zzcxVar = new zzcx(this, dVar);
        }
        Object obj = zzcxVar.zza;
        Object obj2 = a.COROUTINE_SUSPENDED;
        int i12 = zzcxVar.zzc;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.F(obj);
            return ((qy.o) obj).f48498a;
        }
        e.F(obj);
        zzcxVar.zzc = 1;
        Object objMo207execute0E7RQCE = mo207execute0E7RQCE(recaptchaAction, 10000L, zzcxVar);
        return objMo207execute0E7RQCE == obj2 ? obj2 : objMo207execute0E7RQCE;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzas.zza(e0.f(this.zze.zzb(), null, null, new zzda(this, recaptchaAction, 10000L, null), 3));
    }

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j11) {
        return zzas.zza(e0.f(this.zze.zzb(), null, null, new zzda(this, recaptchaAction, j11, null), 3));
    }
}
