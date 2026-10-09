package com.google.android.recaptcha.internal;

import com.bumptech.glide.d;
import oz.x;
import qy.h;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzff {
    private final h zza;
    private final h zzb;
    private final h zzc;

    public zzff() {
        int i11 = zzav.zza;
        this.zza = d.v(zzfc.zza);
        this.zzb = d.v(zzfd.zza);
        this.zzc = d.v(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    public static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, vy.d dVar) throws Exception {
        try {
            String strZzl = zzscVar.zzl();
            String strZzM = zzscVar.zzM();
            zzaq zzaqVarZzf = zzffVar.zzf();
            String strZzb = null;
            if (zzaqVarZzf != null && zzaqVarZzf.zzd(strZzM)) {
                zzen zzenVarZzf = zzekVar.zzf(25);
                try {
                    String strZza = zzffVar.zzf().zza(strZzM);
                    if (strZza != null) {
                        zzenVarZzf.zza();
                        strZzb = strZza;
                    } else {
                        zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
                    }
                } catch (Exception e8) {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzR, e8.getMessage()));
                }
            }
            if (strZzb == null) {
                zzaq zzaqVarZzf2 = zzffVar.zzf();
                if (zzaqVarZzf2 != null) {
                    zzaqVarZzf2.zzb();
                }
                zzen zzenVarZzf2 = zzekVar.zzf(23);
                try {
                    strZzb = zzffVar.zzg().zzb(strZzl);
                    zzenVarZzf2.zza();
                    zzen zzenVarZzf3 = zzekVar.zzf(24);
                    try {
                        zzaq zzaqVarZzf3 = zzffVar.zzf();
                        if (zzaqVarZzf3 != null) {
                            zzaqVarZzf3.zzc(strZzM, strZzb);
                        }
                        zzenVarZzf3.zza();
                    } catch (Exception e10) {
                        zzenVarZzf3.zzb(new zzbd(zzbb.zzk, zzba.zzT, e10.getMessage()));
                    }
                } catch (zzbd e11) {
                    zzenVarZzf2.zzb(e11);
                    throw e11;
                }
            }
            return x.q0(zzscVar.zzk(), "JAVASCRIPT_TAG", strZzb);
        } catch (Exception e12) {
            if (e12 instanceof zzbd) {
                throw e12;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e12.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    public final Object zzc(String str, zzto zztoVar, vy.d dVar) {
        return e0.l(new zzfb(this, str, zztoVar, null), dVar);
    }

    public final Object zzd(zzsc zzscVar, zzek zzekVar, vy.d dVar) {
        return zze(this, zzscVar, zzekVar, dVar);
    }
}
