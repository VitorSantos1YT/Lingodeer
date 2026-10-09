package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzh {
    public static void a(int i11, String str, List list) {
        if (list.size() == i11) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i11 + " parameters found " + list.size());
    }

    public static void b(int i11, String str, List list) {
        if (list.size() >= i11) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i11 + " parameters found " + list.size());
    }

    public static void c(int i11, String str, ArrayList arrayList) {
        if (arrayList.size() <= i11) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i11 + " parameters found " + arrayList.size());
    }

    public static boolean d(zzao zzaoVar) {
        if (zzaoVar == null) {
            return false;
        }
        Double dZzd = zzaoVar.zzd();
        return !dZzd.isNaN() && dZzd.doubleValue() >= 0.0d && dZzd.equals(Double.valueOf(Math.floor(dZzd.doubleValue())));
    }

    public static zzbk e(String str) {
        zzbk zzbkVarA = null;
        if (str != null && !str.isEmpty()) {
            zzbkVarA = zzbk.a(Integer.parseInt(str));
        }
        if (zzbkVarA != null) {
            return zzbkVarA;
        }
        throw new IllegalArgumentException(a.e("Unsupported commandId ", str));
    }

    public static boolean f(zzao zzaoVar, zzao zzaoVar2) {
        if (!zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            return false;
        }
        if ((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) {
            return true;
        }
        if (zzaoVar instanceof zzah) {
            if (Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue())) {
                return false;
            }
            return zzaoVar.zzd().equals(zzaoVar2.zzd());
        }
        if (zzaoVar instanceof zzas) {
            return zzaoVar.zzc().equals(zzaoVar2.zzc());
        }
        if (zzaoVar instanceof zzaf) {
            return zzaoVar.zze().equals(zzaoVar2.zze());
        }
        return zzaoVar == zzaoVar2;
    }

    public static int g(double d5) {
        if (Double.isNaN(d5) || Double.isInfinite(d5) || d5 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d5 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d5))) % 4.294967296E9d);
    }

    public static double h(double d5) {
        if (Double.isNaN(d5)) {
            return 0.0d;
        }
        if (Double.isInfinite(d5) || d5 == 0.0d || d5 == 0.0d) {
            return d5;
        }
        return ((double) (d5 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d5));
    }

    public static Object i(zzao zzaoVar) {
        if (zzao.f11446k.equals(zzaoVar)) {
            return null;
        }
        if (zzao.f11445j.equals(zzaoVar)) {
            return BuildConfig.VERSION_NAME;
        }
        if (zzaoVar instanceof zzal) {
            return j((zzal) zzaoVar);
        }
        if (!(zzaoVar instanceof zzae)) {
            return !zzaoVar.zzd().isNaN() ? zzaoVar.zzd() : zzaoVar.zzc();
        }
        ArrayList arrayList = new ArrayList();
        zzad zzadVar = new zzad((zzae) zzaoVar);
        while (zzadVar.hasNext()) {
            Object objI = i((zzao) zzadVar.next());
            if (objI != null) {
                arrayList.add(objI);
            }
        }
        return arrayList;
    }

    public static HashMap j(zzal zzalVar) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(zzalVar.f11441a.keySet());
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            String str = (String) obj;
            Object objI = i(zzalVar.d(str));
            if (objI != null) {
                map.put(str, objI);
            }
        }
        return map;
    }

    public static void k(zzg zzgVar) {
        int iG = g(zzgVar.g("runtime.counter").zzd().doubleValue() + 1.0d);
        if (iG > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        zzgVar.e("runtime.counter", new zzah(Double.valueOf(iG)));
    }
}
