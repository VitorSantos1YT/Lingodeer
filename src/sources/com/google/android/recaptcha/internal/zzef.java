package com.google.android.recaptcha.internal;

import com.bumptech.glide.e;
import com.google.android.recaptcha.RecaptchaAction;
import kotlin.jvm.internal.m;
import vy.d;
import wy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzef implements zzcn {
    private final zzdt zza;
    private zzcm zzb = zzcm.zza;
    private zzsc zzc;

    public zzef(zzdt zzdtVar) {
        this.zza = zzdtVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j11, d dVar) throws zzbd {
        zzed zzedVar;
        String str2;
        RecaptchaAction recaptchaAction2;
        double d5;
        zzef zzefVar;
        String str3;
        zzef zzefVar2;
        if (dVar instanceof zzed) {
            zzedVar = (zzed) dVar;
            int i11 = zzedVar.zzd;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzedVar.zzd = i11 - Integer.MIN_VALUE;
            } else {
                zzedVar = new zzed(this, dVar);
            }
        } else {
            zzedVar = new zzed(this, dVar);
        }
        zzed zzedVar2 = zzedVar;
        Object objZzl = zzedVar2.zzb;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = zzedVar2.zzd;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    double d11 = zzedVar2.zza;
                    recaptchaAction2 = zzedVar2.zzg;
                    String str4 = zzedVar2.zzf;
                    zzef zzefVar3 = zzedVar2.zze;
                    e.F(objZzl);
                    d5 = d11;
                    zzefVar = zzefVar3;
                    str2 = str4;
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = zzedVar2.zzf;
                    zzefVar2 = zzedVar2.zze;
                    e.F(objZzl);
                }
                zzsr zzsrVar = (zzsr) objZzl;
                zzefVar2.zza.zzq(str3, zzsrVar);
                return zzsrVar.zzj();
            }
            e.F(objZzl);
            if (!m.a(this.zzb, zzcm.zzb)) {
                throw new zzbd(zzbb.zzb, zzba.zzar, null);
            }
            double d12 = j11;
            zzdt zzdtVar = this.zza;
            double d13 = 0.45d * d12;
            zzedVar2.zze = this;
            zzedVar2.zzf = str;
            zzedVar2.zzg = recaptchaAction;
            double d14 = d12 * 0.55d;
            zzedVar2.zza = d14;
            zzedVar2.zzd = 1;
            objZzl = zzdtVar.zzl(str, (long) d13, zzedVar2);
            if (objZzl != aVar) {
                str2 = str;
                recaptchaAction2 = recaptchaAction;
                d5 = d14;
                zzefVar = this;
            }
            return aVar;
            zzsi zzsiVar = (zzsi) objZzl;
            zzdt zzdtVar2 = zzefVar.zza;
            zzsc zzscVar = zzefVar.zzc;
            if (zzscVar == null) {
                zzscVar = null;
            }
            zzsp zzspVarZzi = zzdtVar2.zzi(recaptchaAction2, zzsiVar, zzscVar);
            zzedVar2.zze = zzefVar;
            zzedVar2.zzf = str2;
            zzedVar2.zzg = null;
            zzedVar2.zzd = 2;
            objZzl = zzefVar.zza.zzm(zzspVarZzi, str2, (long) d5, zzedVar2);
            if (objZzl != aVar) {
                str3 = str2;
                zzefVar2 = zzefVar;
                zzsr zzsrVar2 = (zzsr) objZzl;
                zzefVar2.zza.zzq(str3, zzsrVar2);
                return zzsrVar2.zzj();
            }
            return aVar;
        } catch (zzbd e8) {
            throw e8;
        } catch (Exception e10) {
            throw new zzbd(zzbb.zzb, zzba.zzaz, e10.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r13 != r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v9, types: [com.google.android.recaptcha.internal.zzef] */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzb(long r12, vy.d r14) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzee
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzee r0 = (com.google.android.recaptcha.internal.zzee) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzee r0 = new com.google.android.recaptcha.internal.zzee
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.zzb
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.zzd
            qy.b0 r3 = qy.b0.f48488a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            com.google.android.recaptcha.internal.zzef r12 = r0.zze
            com.bumptech.glide.e.F(r14)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            goto L9b
        L2f:
            r13 = move-exception
            goto La6
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3a:
            double r12 = r0.zza
            com.google.android.recaptcha.internal.zzef r2 = r0.zze
            com.bumptech.glide.e.F(r14)     // Catch: com.google.android.recaptcha.internal.zzbd -> L46
            r10 = r2
            r2 = r14
            r13 = r12
            r12 = r10
            goto L8a
        L46:
            r13 = move-exception
            r12 = r2
            goto La6
        L49:
            com.bumptech.glide.e.F(r14)
            com.google.android.recaptcha.internal.zzcm r14 = r11.zzb
            com.google.android.recaptcha.internal.zzcj r2 = com.google.android.recaptcha.internal.zzcm.zzb()
            boolean r14 = kotlin.jvm.internal.m.a(r14, r2)
            if (r14 != 0) goto Lad
            com.google.android.recaptcha.internal.zzcm r14 = r11.zzb
            com.google.android.recaptcha.internal.zzci r2 = com.google.android.recaptcha.internal.zzcm.zza()
            boolean r14 = kotlin.jvm.internal.m.a(r14, r2)
            if (r14 == 0) goto L65
            goto Lad
        L65:
            com.google.android.recaptcha.internal.zzck r14 = com.google.android.recaptcha.internal.zzcm.zzc()
            r11.zzb = r14
            double r12 = (double) r12
            com.google.android.recaptcha.internal.zzdt r14 = r11.zza     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            r6 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r6 = r6 * r12
            r0.zze = r11     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            r8 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r12 = r12 * r8
            r0.zza = r12     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            r0.zzd = r5     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            long r5 = (long) r6     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            java.lang.Object r14 = r14.zzo(r5, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            if (r14 == r1) goto La2
            r2 = r14
            r13 = r12
            r12 = r11
        L8a:
            com.google.android.recaptcha.internal.zzsc r2 = (com.google.android.recaptcha.internal.zzsc) r2     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            r12.zzc = r2     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            com.google.android.recaptcha.internal.zzdt r5 = r12.zza     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            long r13 = (long) r13     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            r0.zze = r12     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            r0.zzd = r4     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            java.lang.Object r13 = r5.zzn(r2, r13, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            if (r13 == r1) goto La2
        L9b:
            com.google.android.recaptcha.internal.zzcj r13 = com.google.android.recaptcha.internal.zzcm.zzb()     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            r12.zzb = r13     // Catch: com.google.android.recaptcha.internal.zzbd -> L2f
            return r3
        La2:
            return r1
        La3:
            r12 = move-exception
            r13 = r12
            r12 = r11
        La6:
            com.google.android.recaptcha.internal.zzci r14 = com.google.android.recaptcha.internal.zzcm.zza()
            r12.zzb = r14
            throw r13
        Lad:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzef.zzb(long, vy.d):java.lang.Object");
    }
}
