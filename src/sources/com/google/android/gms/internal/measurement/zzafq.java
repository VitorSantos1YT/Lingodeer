package com.google.android.gms.internal.measurement;

import b7.e0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzafq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzagb f11328a;

    static {
        int i11 = zzacf.f11197a;
        f11328a = new zzagb();
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
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
    public static void b(Object obj, Object obj2) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVar = zzaduVar.zzc;
        zzaga zzagaVar2 = ((zzadu) obj2).zzc;
        zzaga zzagaVar3 = zzaga.f11345f;
        if (!zzagaVar3.equals(zzagaVar2)) {
            if (zzagaVar3.equals(zzagaVar)) {
                int i11 = zzagaVar.f11346a + zzagaVar2.f11346a;
                int[] iArrCopyOf = Arrays.copyOf(zzagaVar.f11347b, i11);
                System.arraycopy(zzagaVar2.f11347b, 0, iArrCopyOf, zzagaVar.f11346a, zzagaVar2.f11346a);
                Object[] objArrCopyOf = Arrays.copyOf(zzagaVar.f11348c, i11);
                System.arraycopy(zzagaVar2.f11348c, 0, objArrCopyOf, zzagaVar.f11346a, zzagaVar2.f11346a);
                zzagaVar = new zzaga(i11, iArrCopyOf, objArrCopyOf, true);
            } else {
                zzagaVar.getClass();
                if (!zzagaVar2.equals(zzagaVar3)) {
                    if (!zzagaVar.f11350e) {
                        throw new UnsupportedOperationException();
                    }
                    int i12 = zzagaVar.f11346a + zzagaVar2.f11346a;
                    zzagaVar.e(i12);
                    System.arraycopy(zzagaVar2.f11347b, 0, zzagaVar.f11347b, zzagaVar.f11346a, zzagaVar2.f11346a);
                    System.arraycopy(zzagaVar2.f11348c, 0, zzagaVar.f11348c, zzagaVar.f11346a, zzagaVar2.f11346a);
                    zzagaVar.f11346a = i12;
                }
            }
        }
        zzaduVar.zzc = zzagaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object c(Object obj, int i11, zzaef zzaefVar, zzadz zzadzVar, Object obj2, zzafz zzafzVar) {
        if (zzadzVar == null) {
            return obj2;
        }
        if (zzaefVar == null) {
            Iterator<E> it = zzaefVar.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzadzVar.zza(iIntValue)) {
                    if (obj2 == null) {
                        obj2 = zzafzVar.h(obj);
                    }
                    zzafzVar.a(iIntValue, obj2, i11);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = zzaefVar.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Integer num = (Integer) zzaefVar.get(i13);
            int iIntValue2 = num.intValue();
            if (zzadzVar.zza(iIntValue2)) {
                if (i13 != i12) {
                    zzaefVar.set(i12, num);
                }
                i12++;
            } else {
                if (obj2 == null) {
                    obj2 = zzafzVar.h(obj);
                }
                zzafzVar.a(iIntValue2, obj2, i11);
            }
        }
        if (i12 != size) {
            zzaefVar.subList(i12, size).clear();
        }
        return obj2;
    }

    public static int d(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaeq)) {
            int iC = 0;
            while (i11 < size) {
                iC += zzada.c(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iC;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        int iC2 = 0;
        while (i11 < size) {
            iC2 += zzada.c(zzaeqVar.p(i11));
            i11++;
        }
        return iC2;
    }

    public static int e(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaeq)) {
            int iC = 0;
            while (i11 < size) {
                iC += zzada.c(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iC;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        int iC2 = 0;
        while (i11 < size) {
            iC2 += zzada.c(zzaeqVar.p(i11));
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
        if (!(list instanceof zzaeq)) {
            int iC = 0;
            while (i11 < size) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                iC += zzada.c((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return iC;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        int iC2 = 0;
        while (i11 < size) {
            long jP = zzaeqVar.p(i11);
            iC2 += zzada.c((jP >> 63) ^ (jP + jP));
            i11++;
        }
        return iC2;
    }

    public static int g(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzadv)) {
            int iC = 0;
            while (i11 < size) {
                iC += zzada.c(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iC;
        }
        zzadv zzadvVar = (zzadv) list;
        int iC2 = 0;
        while (i11 < size) {
            iC2 += zzada.c(zzadvVar.U(i11));
            i11++;
        }
        return iC2;
    }

    public static int h(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzadv)) {
            int iC = 0;
            while (i11 < size) {
                iC += zzada.c(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iC;
        }
        zzadv zzadvVar = (zzadv) list;
        int iC2 = 0;
        while (i11 < size) {
            iC2 += zzada.c(zzadvVar.U(i11));
            i11++;
        }
        return iC2;
    }

    public static int i(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzadv)) {
            int iB = 0;
            while (i11 < size) {
                iB += zzada.b(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iB;
        }
        zzadv zzadvVar = (zzadv) list;
        int iB2 = 0;
        while (i11 < size) {
            iB2 += zzada.b(zzadvVar.U(i11));
            i11++;
        }
        return iB2;
    }

    public static int j(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzadv)) {
            int iB = 0;
            while (i11 < size) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                iB += zzada.b((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i11++;
            }
            return iB;
        }
        zzadv zzadvVar = (zzadv) list;
        int iB2 = 0;
        while (i11 < size) {
            int iU = zzadvVar.U(i11);
            iB2 += zzada.b((iU >> 31) ^ (iU + iU));
            i11++;
        }
        return iB2;
    }

    public static int k(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzada.b(i11 << 3) + 4) * size;
    }

    public static int l(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzada.b(i11 << 3) + 8) * size;
    }

    public static int m(int i11, Object obj, zzafp zzafpVar) {
        int i12 = i11 << 3;
        if (obj instanceof zzaem) {
            int iB = zzada.b(i12);
            int iA = ((zzaem) obj).a();
            return e0.C(iA, iA, iB);
        }
        int iB2 = zzada.b(i12);
        int iE = ((zzacb) obj).e(zzafpVar);
        return e0.C(iE, iE, iB2);
    }
}
