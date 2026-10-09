package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import kotlin.NoWhenBranchMatchedException;
import ry.m;
import rz.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzes implements zzeo {
    private static Timer zza;
    private final Context zzb;
    private final zzet zzc;
    private final b0 zzd;
    private final zzei zze;

    /* JADX WARN: Multi-variable type inference failed */
    public zzes(Context context, zzet zzetVar, b0 b0Var) {
        this.zzb = context;
        this.zzc = zzetVar;
        this.zzd = b0Var;
        zzei zzeiVar = null;
        Object[] objArr = 0;
        try {
            zzei zzeiVar2 = zzei.zzd;
            zzeiVar2 = zzeiVar2 == null ? new zzei(context, objArr == true ? 1 : 0) : zzeiVar2;
            zzei.zzd = zzeiVar2;
            zzeiVar = zzeiVar2;
        } catch (Exception unused) {
        }
        this.zze = zzeiVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        zzei zzeiVar;
        zzei zzeiVar2 = this.zze;
        if (zzeiVar2 != null) {
            ArrayList arrayListG1 = m.g1(zzeiVar2.zzd(), 20, 20);
            int size = arrayListG1.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListG1.get(i11);
                i11++;
                zzrd zzrdVarZzi = zzrf.zzi();
                ArrayList arrayList = new ArrayList();
                for (zzej zzejVar : (List) obj) {
                    try {
                        zztx zztxVarZzk = zztx.zzk(zzkh.zzg().zzj(zzejVar.zzc()));
                        int iZzN = zztxVarZzk.zzN();
                        int i12 = iZzN - 1;
                        if (iZzN == 0) {
                            throw null;
                        }
                        if (i12 == 0) {
                            zzrdVarZzi.zzq(zztxVarZzk.zzf());
                        } else if (i12 == 1) {
                            zzrdVarZzi.zzr(zztxVarZzk.zzg());
                        } else if (i12 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList.add(zzejVar);
                    } catch (Exception unused) {
                        zzei zzeiVar3 = this.zze;
                        if (zzeiVar3 != null) {
                            zzeiVar3.zzf(zzejVar);
                        }
                    }
                }
                if (zzrdVarZzi.zzf() + zzrdVarZzi.zze() != 0) {
                    if (this.zzc.zza(((zzrf) zzrdVarZzi.zzk()).zzd()) && (zzeiVar = this.zze) != null) {
                        zzeiVar.zza(arrayList);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzep(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeo
    public final void zza(zztx zztxVar) {
        e0.B(this.zzd, null, null, new zzer(this, zztxVar, null), 3);
        zzh();
    }
}
