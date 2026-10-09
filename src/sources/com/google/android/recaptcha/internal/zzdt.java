package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.TimeoutCancellationException;
import nz.l;
import nz.n;
import qy.b0;
import qy.h;
import qy.o;
import ry.m;
import ry.x;
import rz.e0;
import rz.g1;
import rz.z;
import wy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdt {
    private final String zza;
    private final zzek zzb;
    private final zzl zzc;
    private final h zzd;
    private final h zze;
    private final h zzf;
    private final h zzg;
    private final h zzh;
    private final zzbi zzi;

    public zzdt(String str, zzbi zzbiVar, zzek zzekVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i11 = zzav.zza;
        this.zzd = d.v(zzdm.zza);
        this.zze = d.v(zzdn.zza);
        this.zzf = d.v(zzdo.zza);
        this.zzg = d.v(zzdp.zza);
        this.zzh = d.v(zzdq.zza);
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        return !zzx() ? new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage()) : zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zzekVarZza = this.zzb.zza();
        zzekVarZza.zzc(str);
        return zzekVarZza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object zzv(zzsc zzscVar, long j11, vy.d dVar) throws Throwable {
        zzdj zzdjVar;
        Object objZzc;
        zzdt zzdtVar;
        l children;
        if (dVar instanceof zzdj) {
            zzdjVar = (zzdj) dVar;
            int i11 = zzdjVar.zzd;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzdjVar.zzd = i11 - Integer.MIN_VALUE;
            } else {
                zzdjVar = new zzdj(this, dVar);
            }
        } else {
            zzdjVar = new zzdj(this, dVar);
        }
        zzdj zzdjVar2 = zzdjVar;
        Object obj = zzdjVar2.zzb;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = zzdjVar2.zzd;
        if (i12 == 0) {
            e.F(obj);
            zzy(zzscVar.zzO());
            Iterator it = zzw().iterator();
            while (it.hasNext()) {
                this.zzc.zzf((zze) it.next());
            }
            zzl zzlVar = this.zzc;
            zzek zzekVar = this.zzb;
            zzdjVar2.zza = this;
            zzdjVar2.zzd = 1;
            objZzc = zzlVar.zzc(j11, zzscVar, zzekVar, zzdjVar2);
            if (objZzc != aVar) {
                zzdtVar = this;
            }
            return aVar;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Throwable th2 = (Throwable) zzdjVar2.zza;
            e.F(obj);
            throw th2;
        }
        zzdtVar = (zzdt) zzdjVar2.zza;
        e.F(obj);
        objZzc = ((o) obj).f48498a;
        Throwable thA = o.a(objZzc);
        if (thA == null) {
            return b0.f48488a;
        }
        g1 g1Var = (g1) zzdtVar.zzi.zzd().getCoroutineContext().get(z.f50978b);
        if (g1Var != null && (children = g1Var.getChildren()) != null) {
            Iterator it2 = children.iterator();
            while (it2.hasNext()) {
                ((g1) it2.next()).cancel(null);
            }
        }
        List listZ = n.Z(e0.s(zzdtVar.zzi.zzd().getCoroutineContext()).getChildren());
        zzdjVar2.zza = thA;
        zzdjVar2.zzd = 2;
        if (e0.y(listZ, zzdjVar2) != aVar) {
            throw thA;
        }
        return aVar;
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return m.a1(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i11 = zzav.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16)) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) throws zzbd {
        try {
            zzrv zzrvVarZzj = zzrv.zzj(zzbt.zza(str));
            int i11 = zzav.zza;
            ((zzfu) d.v(zzde.zza).getValue()).zza(zzrvVarZzj);
        } catch (Exception e8) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e8.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsiVar, zzsc zzscVar) {
        zzso zzsoVarZzf = zzsp.zzf();
        zzsoVarZzf.zzs(this.zza);
        zzsoVarZzf.zze(recaptchaAction.getAction());
        zzsoVarZzf.zzf(zzscVar.zzN());
        zzsoVarZzf.zzq(zzscVar.zzM());
        zzsoVarZzf.zzr(zzsiVar);
        return (zzsp) zzsoVarZzf.zzk();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzl(String str, long j11, vy.d dVar) throws zzbd {
        zzdd zzddVar;
        Exception e8;
        zzen zzenVar;
        TimeoutCancellationException e10;
        zzbd e11;
        if (dVar instanceof zzdd) {
            zzddVar = (zzdd) dVar;
            int i11 = zzddVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzddVar.zzc = i11 - Integer.MIN_VALUE;
            } else {
                zzddVar = new zzdd(this, dVar);
            }
        } else {
            zzddVar = new zzdd(this, dVar);
        }
        Object obj = zzddVar.zza;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = zzddVar.zzc;
        if (i12 == 0) {
            e.F(obj);
            zzen zzenVarZzf = zzu(str).zzf(27);
            try {
                zzl zzlVar = this.zzc;
                zzddVar.zzd = zzenVarZzf;
                zzddVar.zzc = 1;
                Object objZzb = zzlVar.zzb(str, j11, zzddVar);
                if (objZzb == aVar) {
                    return aVar;
                }
                obj = objZzb;
                zzenVar = zzenVarZzf;
            } catch (zzbd e12) {
                e11 = e12;
                zzenVar = zzenVarZzf;
                zzenVar.zzb(e11);
                throw e11;
            } catch (TimeoutCancellationException e13) {
                e10 = e13;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzb, e10.getMessage());
                zzenVar.zzb(zzbdVar);
                throw zzbdVar;
            } catch (Exception e14) {
                e8 = e14;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzaa, e8.getMessage());
                zzenVar.zzb(zzbdVar2);
                throw zzbdVar2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzenVar = zzddVar.zzd;
            try {
                e.F(obj);
            } catch (zzbd e15) {
                e11 = e15;
                zzenVar.zzb(e11);
                throw e11;
            } catch (TimeoutCancellationException e16) {
                e10 = e16;
                zzbd zzbdVar3 = new zzbd(zzbb.zzb, zzba.zzb, e10.getMessage());
                zzenVar.zzb(zzbdVar3);
                throw zzbdVar3;
            } catch (Exception e17) {
                e8 = e17;
                zzbd zzbdVar4 = new zzbd(zzbb.zzb, zzba.zzaa, e8.getMessage());
                zzenVar.zzb(zzbdVar4);
                throw zzbdVar4;
            }
        }
        zzsi zzsiVar = (zzsi) obj;
        zzenVar.zza();
        return zzsiVar;
    }

    public final Object zzm(zzsp zzspVar, String str, long j11, vy.d dVar) {
        return e0.M(this.zzi.zza().getCoroutineContext(), new zzdg(this, str, j11, zzspVar, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzn(zzsc zzscVar, long j11, vy.d dVar) throws zzbd {
        zzdk zzdkVar;
        if (dVar instanceof zzdk) {
            zzdkVar = (zzdk) dVar;
            int i11 = zzdkVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzdkVar.zzc = i11 - Integer.MIN_VALUE;
            } else {
                zzdkVar = new zzdk(this, dVar);
            }
        } else {
            zzdkVar = new zzdk(this, dVar);
        }
        Object obj = zzdkVar.zza;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = zzdkVar.zzc;
        try {
            if (i12 == 0) {
                e.F(obj);
                zzdl zzdlVar = new zzdl(this, zzscVar, j11, null);
                zzdkVar.zzc = 1;
                if (e0.N(j11, zzdlVar, zzdkVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.F(obj);
            }
            return b0.f48488a;
        } catch (zzbd e8) {
            throw e8;
        } catch (TimeoutCancellationException e10) {
            throw new zzbd(zzbb.zzb, zzba.zzb, e10.getMessage());
        } catch (Exception e11) {
            throw new zzbd(zzbb.zzb, zzba.zzap, e11.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzo(long j11, vy.d dVar) throws zzbd {
        zzdr zzdrVar;
        Exception e8;
        zzen zzenVar;
        zzdt zzdtVar;
        TimeoutCancellationException e10;
        zzbd e11;
        if (dVar instanceof zzdr) {
            zzdrVar = (zzdr) dVar;
            int i11 = zzdrVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzdrVar.zzc = i11 - Integer.MIN_VALUE;
            } else {
                zzdrVar = new zzdr(this, dVar);
            }
        } else {
            zzdrVar = new zzdr(this, dVar);
        }
        Object obj = zzdrVar.zza;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = zzdrVar.zzc;
        if (i12 == 0) {
            e.F(obj);
            zzen zzenVarZzf = this.zzb.zzf(22);
            try {
                zzds zzdsVar = new zzds(this, zzenVarZzf, null);
                zzdrVar.zzd = this;
                zzdrVar.zze = zzenVarZzf;
                zzdrVar.zzc = 1;
                Object objN = e0.N(j11, zzdsVar, zzdrVar);
                if (objN == aVar) {
                    return aVar;
                }
                obj = objN;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
            } catch (zzbd e12) {
                e11 = e12;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
                if (kotlin.jvm.internal.m.a(e11.zzb(), zzbb.zzc)) {
                    e11 = zzdtVar.zzs(e11, e11);
                }
                zzenVar.zzb(e11);
                throw e11;
            } catch (TimeoutCancellationException e13) {
                e10 = e13;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
                zzbd zzbdVarZzs = zzdtVar.zzs(e10, new zzbd(zzbb.zzc, zzba.zzb, e10.getMessage()));
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (Exception e14) {
                e8 = e14;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
                zzbd zzbdVarZzs2 = zzdtVar.zzs(e8, new zzbd(zzbb.zzc, zzba.zzaw, e8.getMessage()));
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzenVar = zzdrVar.zze;
            zzdtVar = zzdrVar.zzd;
            try {
                e.F(obj);
            } catch (zzbd e15) {
                e11 = e15;
                if (kotlin.jvm.internal.m.a(e11.zzb(), zzbb.zzc)) {
                    e11 = zzdtVar.zzs(e11, e11);
                }
                zzenVar.zzb(e11);
                throw e11;
            } catch (TimeoutCancellationException e16) {
                e10 = e16;
                zzbd zzbdVarZzs3 = zzdtVar.zzs(e10, new zzbd(zzbb.zzc, zzba.zzb, e10.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            } catch (Exception e17) {
                e8 = e17;
                zzbd zzbdVarZzs4 = zzdtVar.zzs(e8, new zzbd(zzbb.zzc, zzba.zzaw, e8.getMessage()));
                zzenVar.zzb(zzbdVarZzs4);
                throw zzbdVarZzs4;
            }
        }
        return (zzsc) obj;
    }

    public final void zzq(String str, zzsr zzsrVar) {
        zzen zzenVarZzf = zzu(str).zzf(29);
        try {
            List<zzst> listZzk = zzsrVar.zzk();
            int iW = x.W(ry.n.W(listZzk, 10));
            if (iW < 16) {
                iW = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
            for (zzst zzstVar : listZzk) {
                linkedHashMap.put(zzstVar.zzg(), zzstVar.zzi());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzenVarZzf.zza();
        } catch (zzbd e8) {
            zzenVarZzf.zzb(e8);
        } catch (Exception e10) {
            zzenVarZzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e10.getMessage()));
        }
    }
}
