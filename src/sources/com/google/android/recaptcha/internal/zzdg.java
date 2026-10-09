package com.google.android.recaptcha.internal;

import fz.e;
import kotlinx.coroutines.TimeoutCancellationException;
import rz.b0;
import rz.e0;
import vy.d;
import wy.a;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdg extends i implements e {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdt zzdtVar, String str, long j11, zzsp zzspVar, d dVar) {
        super(2, dVar);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j11;
        this.zzf = zzspVar;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // fz.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzen zzenVar;
        Exception e8;
        TimeoutCancellationException e10;
        zzbd e11;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                com.bumptech.glide.e.F(obj);
            } catch (zzbd e12) {
                e11 = e12;
                zzbd zzbdVarZzs = this.zzc.zzs(e11, e11);
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (TimeoutCancellationException e13) {
                e10 = e13;
                zzbd zzbdVarZzs2 = this.zzc.zzs(e10, new zzbd(zzbb.zzc, zzba.zzb, e10.getMessage()));
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            } catch (Exception e14) {
                e8 = e14;
                zzbd zzbdVarZzs3 = this.zzc.zzs(e8, new zzbd(zzbb.zzc, zzba.zzZ, e8.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            }
        } else {
            com.bumptech.glide.e.F(obj);
            zzen zzenVarZzf = this.zzc.zzu(this.zzd).zzf(28);
            try {
                long j11 = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzenVarZzf, null);
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objN = e0.N(j11, zzdfVar, this);
                if (objN == aVar) {
                    return aVar;
                }
                zzenVar = zzenVarZzf;
                obj = objN;
            } catch (zzbd e15) {
                zzenVar = zzenVarZzf;
                e11 = e15;
                zzbd zzbdVarZzs4 = this.zzc.zzs(e11, e11);
                zzenVar.zzb(zzbdVarZzs4);
                throw zzbdVarZzs4;
            } catch (TimeoutCancellationException e16) {
                zzenVar = zzenVarZzf;
                e10 = e16;
                zzbd zzbdVarZzs5 = this.zzc.zzs(e10, new zzbd(zzbb.zzc, zzba.zzb, e10.getMessage()));
                zzenVar.zzb(zzbdVarZzs5);
                throw zzbdVarZzs5;
            } catch (Exception e17) {
                zzenVar = zzenVarZzf;
                e8 = e17;
                zzbd zzbdVarZzs6 = this.zzc.zzs(e8, new zzbd(zzbb.zzc, zzba.zzZ, e8.getMessage()));
                zzenVar.zzb(zzbdVarZzs6);
                throw zzbdVarZzs6;
            }
        }
        return (zzsr) obj;
    }
}
