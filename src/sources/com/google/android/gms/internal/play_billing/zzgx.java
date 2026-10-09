package com.google.android.gms.internal.play_billing;

import b7.e0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzhj f12429a;

    static {
        zzgs zzgsVar = zzgs.f12418c;
        f12429a = new zzhj();
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfj)) {
            int iC = 0;
            while (i11 < size) {
                iC += zzep.c(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iC;
        }
        zzfj zzfjVar = (zzfj) list;
        int iC2 = 0;
        while (i11 < size) {
            iC2 += zzep.c(zzfjVar.b(i11));
            i11++;
        }
        return iC2;
    }

    public static int c(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzep.b(i11 << 3) + 4) * size;
    }

    public static int d(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzep.b(i11 << 3) + 8) * size;
    }

    public static int e(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfj)) {
            int iC = 0;
            while (i11 < size) {
                iC += zzep.c(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iC;
        }
        zzfj zzfjVar = (zzfj) list;
        int iC2 = 0;
        while (i11 < size) {
            iC2 += zzep.c(zzfjVar.b(i11));
            i11++;
        }
        return iC2;
    }

    public static int f(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzga)) {
            int iC = 0;
            while (i11 < size) {
                iC += zzep.c(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iC;
        }
        zzga zzgaVar = (zzga) list;
        int iC2 = 0;
        while (i11 < size) {
            iC2 += zzep.c(zzgaVar.b(i11));
            i11++;
        }
        return iC2;
    }

    public static int g(int i11, Object obj, zzgv zzgvVar) {
        int i12 = i11 << 3;
        if (obj instanceof zzfw) {
            int iB = zzep.b(i12);
            int iA = ((zzfw) obj).a();
            return e0.D(iA, iA, iB);
        }
        int iB2 = zzep.b(i12);
        int iD = ((zzds) ((zzgl) obj)).d(zzgvVar);
        return e0.D(iD, iD, iB2);
    }

    public static int h(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfj)) {
            int iB = 0;
            while (i11 < size) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                iB += zzep.b((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i11++;
            }
            return iB;
        }
        zzfj zzfjVar = (zzfj) list;
        int iB2 = 0;
        while (i11 < size) {
            int iB3 = zzfjVar.b(i11);
            iB2 += zzep.b((iB3 >> 31) ^ (iB3 + iB3));
            i11++;
        }
        return iB2;
    }

    public static int i(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzga)) {
            int iC = 0;
            while (i11 < size) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                iC += zzep.c((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return iC;
        }
        zzga zzgaVar = (zzga) list;
        int iC2 = 0;
        while (i11 < size) {
            long jB = zzgaVar.b(i11);
            iC2 += zzep.c((jB >> 63) ^ (jB + jB));
            i11++;
        }
        return iC2;
    }

    public static int j(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfj)) {
            int iB = 0;
            while (i11 < size) {
                iB += zzep.b(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iB;
        }
        zzfj zzfjVar = (zzfj) list;
        int iB2 = 0;
        while (i11 < size) {
            iB2 += zzep.b(zzfjVar.b(i11));
            i11++;
        }
        return iB2;
    }

    public static int k(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzga)) {
            int iC = 0;
            while (i11 < size) {
                iC += zzep.c(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iC;
        }
        zzga zzgaVar = (zzga) list;
        int iC2 = 0;
        while (i11 < size) {
            iC2 += zzep.c(zzgaVar.b(i11));
            i11++;
        }
        return iC2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void l(Object obj, Object obj2) {
        zzfi zzfiVar = (zzfi) obj;
        zzhi zzhiVar = zzfiVar.zzc;
        zzhi zzhiVar2 = ((zzfi) obj2).zzc;
        zzhi zzhiVar3 = zzhi.f12449f;
        if (!zzhiVar3.equals(zzhiVar2)) {
            if (zzhiVar3.equals(zzhiVar)) {
                int i11 = zzhiVar.f12450a + zzhiVar2.f12450a;
                int[] iArrCopyOf = Arrays.copyOf(zzhiVar.f12451b, i11);
                System.arraycopy(zzhiVar2.f12451b, 0, iArrCopyOf, zzhiVar.f12450a, zzhiVar2.f12450a);
                Object[] objArrCopyOf = Arrays.copyOf(zzhiVar.f12452c, i11);
                System.arraycopy(zzhiVar2.f12452c, 0, objArrCopyOf, zzhiVar.f12450a, zzhiVar2.f12450a);
                zzhiVar = new zzhi(i11, iArrCopyOf, objArrCopyOf, true);
            } else {
                zzhiVar.getClass();
                if (!zzhiVar2.equals(zzhiVar3)) {
                    if (!zzhiVar.f12454e) {
                        throw new UnsupportedOperationException();
                    }
                    int i12 = zzhiVar.f12450a + zzhiVar2.f12450a;
                    zzhiVar.e(i12);
                    System.arraycopy(zzhiVar2.f12451b, 0, zzhiVar.f12451b, zzhiVar.f12450a, zzhiVar2.f12450a);
                    System.arraycopy(zzhiVar2.f12452c, 0, zzhiVar.f12452c, zzhiVar.f12450a, zzhiVar2.f12450a);
                    zzhiVar.f12450a = i12;
                }
            }
        }
        zzfiVar.zzc = zzhiVar;
    }
}
