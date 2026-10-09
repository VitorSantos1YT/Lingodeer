package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzamq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzanh f10194a = new zzanh();

    public static Object a(Object obj, int i11, List list, zzaky zzakyVar, Object obj2, zzanf zzanfVar) {
        if (zzakyVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzakyVar.zza()) {
                    if (obj2 == null) {
                        obj2 = zzanfVar.n(obj);
                    }
                    zzanfVar.k(iIntValue, obj2, i11);
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
            if (zzakyVar.zza()) {
                if (i13 != i12) {
                    list.set(i12, num);
                }
                i12++;
            } else {
                if (obj2 == null) {
                    obj2 = zzanfVar.n(obj);
                }
                zzanfVar.k(iIntValue2, obj2, i11);
            }
        }
        if (i12 != size) {
            list.subList(i12, size).clear();
        }
        return obj2;
    }

    public static void b(zzakl zzaklVar, Object obj, Object obj2) {
        zzakm zzakmVarB = zzaklVar.b(obj2);
        if (zzakmVarB.f10120a.isEmpty()) {
            return;
        }
        zzakm zzakmVarI = zzaklVar.i(obj);
        zzakmVarI.getClass();
        zzams zzamsVar = zzakmVarB.f10120a;
        if (zzamsVar.f10197b > 0) {
            zzakmVarI.b(zzamsVar.c(0));
            throw null;
        }
        Iterator it = zzamsVar.f().iterator();
        if (it.hasNext()) {
            zzakmVarI.b((Map.Entry) it.next());
            throw null;
        }
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int d(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakx)) {
            int iU = 0;
            while (i11 < size) {
                iU += zzakb.u(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iU;
        }
        zzakx zzakxVar = (zzakx) list;
        int iU2 = 0;
        while (i11 < size) {
            iU2 += zzakb.u(zzakxVar.b(i11));
            i11++;
        }
        return iU2;
    }

    public static int e(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakx)) {
            int iU = 0;
            while (i11 < size) {
                iU += zzakb.u(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iU;
        }
        zzakx zzakxVar = (zzakx) list;
        int iU2 = 0;
        while (i11 < size) {
            iU2 += zzakb.u(zzakxVar.b(i11));
            i11++;
        }
        return iU2;
    }

    public static int f(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaln)) {
            int iU = 0;
            while (i11 < size) {
                iU += zzakb.u(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iU;
        }
        zzaln zzalnVar = (zzaln) list;
        int iU2 = 0;
        while (i11 < size) {
            iU2 += zzakb.u(zzalnVar.d(i11));
            i11++;
        }
        return iU2;
    }

    public static int g(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakx)) {
            int iX = 0;
            while (i11 < size) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                iX += zzakb.x((iIntValue >> 31) ^ (iIntValue << 1));
                i11++;
            }
            return iX;
        }
        zzakx zzakxVar = (zzakx) list;
        int iX2 = 0;
        while (i11 < size) {
            int iB = zzakxVar.b(i11);
            iX2 += zzakb.x((iB >> 31) ^ (iB << 1));
            i11++;
        }
        return iX2;
    }

    public static int h(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaln)) {
            int iU = 0;
            while (i11 < size) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                iU += zzakb.u((jLongValue >> 63) ^ (jLongValue << 1));
                i11++;
            }
            return iU;
        }
        zzaln zzalnVar = (zzaln) list;
        int iU2 = 0;
        while (i11 < size) {
            long jD = zzalnVar.d(i11);
            iU2 += zzakb.u((jD >> 63) ^ (jD << 1));
            i11++;
        }
        return iU2;
    }

    public static int i(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakx)) {
            int iX = 0;
            while (i11 < size) {
                iX += zzakb.x(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iX;
        }
        zzakx zzakxVar = (zzakx) list;
        int iX2 = 0;
        while (i11 < size) {
            iX2 += zzakb.x(zzakxVar.b(i11));
            i11++;
        }
        return iX2;
    }

    public static int j(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaln)) {
            int iU = 0;
            while (i11 < size) {
                iU += zzakb.u(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iU;
        }
        zzaln zzalnVar = (zzaln) list;
        int iU2 = 0;
        while (i11 < size) {
            iU2 += zzakb.u(zzalnVar.d(i11));
            i11++;
        }
        return iU2;
    }
}
