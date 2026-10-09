package com.google.android.recaptcha.internal;

import a00.a;
import a00.e;
import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Timer;
import kotlin.jvm.internal.m;
import rz.b0;
import rz.e0;
import rz.h0;
import rz.s;
import vy.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzan {
    public s zza;
    private final b0 zzb;
    private final zzek zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzao zze = zzao.zza;
    private final a zzg = new e();

    public zzan(Context context, b0 b0Var, zzek zzekVar, StandardIntegrityManager standardIntegrityManager, long j11) {
        this.zzb = b0Var;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzi(d dVar) {
        zzag zzagVar;
        if (dVar instanceof zzag) {
            zzagVar = (zzag) dVar;
            int i11 = zzagVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzagVar.zzc = i11 - Integer.MIN_VALUE;
            } else {
                zzagVar = new zzag(this, dVar);
            }
        } else {
            zzagVar = new zzag(this, dVar);
        }
        Object obj = zzagVar.zza;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = zzagVar.zzc;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return obj;
        }
        com.bumptech.glide.e.F(obj);
        h0 h0VarZza = zzbx.zza(this.zzd.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zzf).build()));
        zzagVar.zzc = 1;
        Object objAwait = h0VarZza.await(zzagVar);
        return objAwait == aVar ? aVar : objAwait;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r7 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzj(java.lang.String r6, vy.d r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzah
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzah r0 = (com.google.android.recaptcha.internal.zzah) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzah r0 = new com.google.android.recaptcha.internal.zzah
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.bumptech.glide.e.F(r7)
            goto L6d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.zzd
            com.bumptech.glide.e.F(r7)
            goto L4b
        L38:
            com.bumptech.glide.e.F(r7)
            rz.s r7 = r5.zzf()
            r0.zzd = r6
            r0.zzc = r4
            rz.t r7 = (rz.t) r7
            java.lang.Object r7 = r7.o(r0)
            if (r7 == r1) goto L74
        L4b:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r7
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r2 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = r2.setRequestHash(r6)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r6 = r6.build()
            com.google.android.gms.tasks.Task r6 = r7.request(r6)
            rz.h0 r6 = com.google.android.recaptcha.internal.zzbx.zza(r6)
            r7 = 0
            r0.zzd = r7
            r0.zzc = r3
            java.lang.Object r7 = r6.await(r0)
            if (r7 != r1) goto L6d
            goto L74
        L6d:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r7
            java.lang.String r6 = r7.token()
            return r6
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzj(java.lang.String, vy.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0067 A[PHI: r2 r7
      0x0067: PHI (r2v6 com.google.android.recaptcha.internal.zzan) = (r2v3 com.google.android.recaptcha.internal.zzan), (r2v8 com.google.android.recaptcha.internal.zzan) binds: [B:29:0x0064, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r7v4 java.lang.String) = (r7v1 java.lang.String), (r7v6 java.lang.String) binds: [B:29:0x0064, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r8 != r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzc(java.lang.String r7, vy.d r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzaf
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzaf r0 = (com.google.android.recaptcha.internal.zzaf) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.bumptech.glide.e.F(r8)
            goto L74
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            com.bumptech.glide.e.F(r8)
            goto L67
        L3d:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            com.bumptech.glide.e.F(r8)     // Catch: java.lang.Exception -> L5a
            goto L56
        L45:
            com.bumptech.glide.e.F(r8)
            r0.zzd = r6     // Catch: java.lang.Exception -> L59
            r0.zze = r7     // Catch: java.lang.Exception -> L59
            r0.zzc = r5     // Catch: java.lang.Exception -> L59
            java.lang.Object r8 = r6.zzj(r7, r0)     // Catch: java.lang.Exception -> L59
            if (r8 != r1) goto L55
            goto L77
        L55:
            r2 = r6
        L56:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L5a
            return r8
        L59:
            r2 = r6
        L5a:
            r0.zzd = r2
            r0.zze = r7
            r0.zzc = r4
            java.lang.Object r8 = r2.zze(r0)
            if (r8 != r1) goto L67
            goto L77
        L67:
            r8 = 0
            r0.zzd = r8
            r0.zze = r8
            r0.zzc = r3
            java.lang.Object r8 = r2.zzj(r7, r0)
            if (r8 == r1) goto L77
        L74:
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzc(java.lang.String, vy.d):java.lang.Object");
    }

    public final Object zzd(long j11, d dVar) {
        this.zzf = j11;
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zze(d dVar) {
        zzak zzakVar;
        a aVar;
        zzan zzanVar;
        if (dVar instanceof zzak) {
            zzakVar = (zzak) dVar;
            int i11 = zzakVar.zzd;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzakVar.zzd = i11 - Integer.MIN_VALUE;
            } else {
                zzakVar = new zzak(this, dVar);
            }
        } else {
            zzakVar = new zzak(this, dVar);
        }
        Object obj = zzakVar.zzb;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = zzakVar.zzd;
        qy.b0 b0Var = qy.b0.f48488a;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                aVar = this.zzg;
                zzakVar.zze = this;
                zzakVar.zza = aVar;
                zzakVar.zzd = 1;
                if (aVar.b(zzakVar) != aVar2) {
                    zzanVar = this;
                }
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return b0Var;
            }
            aVar = (a) zzakVar.zza;
            zzanVar = zzakVar.zze;
            com.bumptech.glide.e.F(obj);
            if (!m.a(zzanVar.zze, zzao.zza)) {
                aVar.a(null);
                return b0Var;
            }
            zzanVar.zze = zzao.zzb;
            aVar.a(null);
            zzek zzekVar = zzanVar.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzekVar.zzb(2);
            zzen zzenVarZzf = zzekVar.zzf(38);
            zzanVar.zza = e0.b();
            e0.B(zzanVar.zzb, null, null, new zzam(zzanVar, zzenVarZzf, null), 3);
            zzakVar.zze = null;
            zzakVar.zza = null;
            zzakVar.zzd = 2;
            if (!zzanVar.zzh) {
                new Timer().schedule(new zzai(zzanVar), 28800000L, 28800000L);
                zzanVar.zzh = true;
            }
            return b0Var == aVar2 ? aVar2 : b0Var;
        } catch (Throwable th2) {
            aVar.a(null);
            throw th2;
        }
    }

    public final s zzf() {
        s sVar = this.zza;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }
}
