package com.google.android.recaptcha.internal;

import com.google.android.material.datepicker.d;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzoy {
    public static final /* synthetic */ int zza = 0;
    private static final zzpl zzb;

    static {
        int i11 = zzos.zza;
        zzb = new zzpn();
    }

    public static void zzA(int i11, List list, zzpy zzpyVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzA(i11, list, z11);
    }

    public static void zzB(int i11, List list, zzpy zzpyVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzC(i11, list, z11);
    }

    public static void zzC(int i11, List list, zzpy zzpyVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzE(i11, list, z11);
    }

    public static void zzD(int i11, List list, zzpy zzpyVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzJ(i11, list, z11);
    }

    public static void zzE(int i11, List list, zzpy zzpyVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzL(i11, list, z11);
    }

    public static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzne)) {
            int iZzB = 0;
            while (i11 < size) {
                iZzB += zzln.zzB(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iZzB;
        }
        zzne zzneVar = (zzne) list;
        int iZzB2 = 0;
        while (i11 < size) {
            iZzB2 += zzln.zzB(zzneVar.zze(i11));
            i11++;
        }
        return iZzB2;
    }

    public static int zzb(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzln.zzA(i11 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzln.zzA(i11 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzne)) {
            int iZzB = 0;
            while (i11 < size) {
                iZzB += zzln.zzB(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iZzB;
        }
        zzne zzneVar = (zzne) list;
        int iZzB2 = 0;
        while (i11 < size) {
            iZzB2 += zzln.zzB(zzneVar.zze(i11));
            i11++;
        }
        return iZzB2;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zznx)) {
            int iZzB = 0;
            while (i11 < size) {
                iZzB += zzln.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iZzB;
        }
        zznx zznxVar = (zznx) list;
        int iZzB2 = 0;
        while (i11 < size) {
            iZzB2 += zzln.zzB(zznxVar.zze(i11));
            i11++;
        }
        return iZzB2;
    }

    public static int zzh(int i11, Object obj, zzow zzowVar) {
        int i12 = i11 << 3;
        if (!(obj instanceof zznt)) {
            return zzln.zzy((zzoi) obj, zzowVar) + zzln.zzA(i12);
        }
        int iZzA = zzln.zzA(i12);
        int iZza = ((zznt) obj).zza();
        return d.a(iZza, iZza, iZzA);
    }

    public static int zzi(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzne)) {
            int iZzA = 0;
            while (i11 < size) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                iZzA += zzln.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i11++;
            }
            return iZzA;
        }
        zzne zzneVar = (zzne) list;
        int iZzA2 = 0;
        while (i11 < size) {
            int iZze = zzneVar.zze(i11);
            iZzA2 += zzln.zzA((iZze >> 31) ^ (iZze + iZze));
            i11++;
        }
        return iZzA2;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zznx)) {
            int iZzB = 0;
            while (i11 < size) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                iZzB += zzln.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return iZzB;
        }
        zznx zznxVar = (zznx) list;
        int iZzB2 = 0;
        while (i11 < size) {
            long jZze = zznxVar.zze(i11);
            iZzB2 += zzln.zzB((jZze >> 63) ^ (jZze + jZze));
            i11++;
        }
        return iZzB2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzne)) {
            int iZzA = 0;
            while (i11 < size) {
                iZzA += zzln.zzA(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iZzA;
        }
        zzne zzneVar = (zzne) list;
        int iZzA2 = 0;
        while (i11 < size) {
            iZzA2 += zzln.zzA(zzneVar.zze(i11));
            i11++;
        }
        return iZzA2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zznx)) {
            int iZzB = 0;
            while (i11 < size) {
                iZzB += zzln.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iZzB;
        }
        zznx zznxVar = (zznx) list;
        int iZzB2 = 0;
        while (i11 < size) {
            iZzB2 += zzln.zzB(zznxVar.zze(i11));
            i11++;
        }
        return iZzB2;
    }

    public static zzpl zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i11, List list, zznh zznhVar, Object obj2, zzpl zzplVar) {
        if (zznhVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zznhVar.zza(iIntValue)) {
                    obj2 = zzo(obj, i11, iIntValue, obj2, zzplVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Integer num = (Integer) list.get(i13);
            int iIntValue2 = num.intValue();
            if (zznhVar.zza(iIntValue2)) {
                if (i13 != i12) {
                    list.set(i12, num);
                }
                i12++;
            } else {
                obj2 = zzo(obj, i11, iIntValue2, obj2, zzplVar);
            }
        }
        if (i12 != size) {
            list.subList(i12, size).clear();
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i11, int i12, Object obj2, zzpl zzplVar) {
        if (obj2 == null) {
            obj2 = zzplVar.zza(obj);
        }
        zzplVar.zzh(obj2, i11, i12);
        return obj2;
    }

    public static void zzp(zzmp zzmpVar, Object obj, Object obj2) {
        zzmt zzmtVar = ((zzna) obj2).zzb;
        if (zzmtVar.zza.isEmpty()) {
            return;
        }
        ((zzna) obj).zzi().zzh(zzmtVar);
    }

    public static void zzq(zzpl zzplVar, Object obj, Object obj2) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVarZze = zzndVar.zzc;
        zzpm zzpmVar = ((zznd) obj2).zzc;
        if (!zzpm.zzc().equals(zzpmVar)) {
            if (zzpm.zzc().equals(zzpmVarZze)) {
                zzpmVarZze = zzpm.zze(zzpmVarZze, zzpmVar);
            } else {
                zzpmVarZze.zzd(zzpmVar);
            }
        }
        zzndVar.zzc = zzpmVarZze;
    }

    public static void zzr(int i11, List list, zzpy zzpyVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzc(i11, list, z11);
    }

    public static void zzs(int i11, List list, zzpy zzpyVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzg(i11, list, z11);
    }

    public static void zzt(int i11, List list, zzpy zzpyVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzj(i11, list, z11);
    }

    public static void zzu(int i11, List list, zzpy zzpyVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzl(i11, list, z11);
    }

    public static void zzv(int i11, List list, zzpy zzpyVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzn(i11, list, z11);
    }

    public static void zzw(int i11, List list, zzpy zzpyVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzp(i11, list, z11);
    }

    public static void zzx(int i11, List list, zzpy zzpyVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzs(i11, list, z11);
    }

    public static void zzy(int i11, List list, zzpy zzpyVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzu(i11, list, z11);
    }

    public static void zzz(int i11, List list, zzpy zzpyVar, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzy(i11, list, z11);
    }
}
