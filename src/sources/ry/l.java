package ry;

import b0.k2;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l extends md.a {
    public static List A(Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        kotlin.jvm.internal.m.e(listAsList, "asList(...)");
        return listAsList;
    }

    public static nz.l B(Object[] objArr) {
        return objArr.length == 0 ? nz.h.f44323a : new nz.o(objArr, 3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0017 A[RETURN] */
    public static boolean C(int[] iArr, int i11) {
        kotlin.jvm.internal.m.f(iArr, "<this>");
        int length = iArr.length;
        int i12 = 0;
        while (i12 < length) {
            if (i11 == iArr[i12]) {
                if (i12 >= 0) {
                    return true;
                }
                return false;
            }
            i12++;
        }
        i12 = -1;
        if (i12 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean D(Object[] objArr, Object obj) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        return Z(objArr, obj) >= 0;
    }

    public static boolean E(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                Object obj = objArr[i11];
                Object obj2 = objArr2[i11];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!E((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof qy.t) && (obj2 instanceof qy.t)) {
                            if (!Arrays.equals(((qy.t) obj).f48509a, ((qy.t) obj2).f48509a)) {
                            }
                        } else if ((obj instanceof qy.a0) && (obj2 instanceof qy.a0)) {
                            if (!Arrays.equals(((qy.a0) obj).f48484a, ((qy.a0) obj2).f48484a)) {
                            }
                        } else if ((obj instanceof qy.v) && (obj2 instanceof qy.v)) {
                            if (!Arrays.equals(((qy.v) obj).f48511a, ((qy.v) obj2).f48511a)) {
                            }
                        } else if ((obj instanceof qy.x) && (obj2 instanceof qy.x)) {
                            if (!Arrays.equals(((qy.x) obj).f48513a, ((qy.x) obj2).f48513a)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void F(int i11, int i12, int i13, byte[] bArr, byte[] destination) {
        kotlin.jvm.internal.m.f(bArr, "<this>");
        kotlin.jvm.internal.m.f(destination, "destination");
        System.arraycopy(bArr, i12, destination, i11, i13 - i12);
    }

    public static void G(int i11, int i12, int i13, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        kotlin.jvm.internal.m.f(destination, "destination");
        System.arraycopy(objArr, i12, destination, i11, i13 - i12);
    }

    public static void H(int i11, int i12, int[] iArr, int[] destination, int i13) {
        kotlin.jvm.internal.m.f(iArr, "<this>");
        kotlin.jvm.internal.m.f(destination, "destination");
        System.arraycopy(iArr, i12, destination, i11, i13 - i12);
    }

    public static void I(char[] cArr, char[] cArr2, int i11, int i12, int i13) {
        kotlin.jvm.internal.m.f(cArr, "<this>");
        System.arraycopy(cArr, i12, cArr2, i11, i13 - i12);
    }

    public static void J(long[] jArr, long[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.m.f(jArr, "<this>");
        kotlin.jvm.internal.m.f(destination, "destination");
        System.arraycopy(jArr, i12, destination, i11, i13 - i12);
    }

    public static /* synthetic */ void K(int i11, int i12, int i13, Object[] objArr, Object[] objArr2) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        G(0, i11, i12, objArr, objArr2);
    }

    public static /* synthetic */ void L(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        H(i11, 0, iArr, iArr2, i12);
    }

    public static byte[] M(byte[] bArr, int i11, int i12) {
        kotlin.jvm.internal.m.f(bArr, "<this>");
        md.a.d(i12, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i11, i12);
        kotlin.jvm.internal.m.e(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] N(int i11, int i12, Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        md.a.d(i12, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i11, i12);
        kotlin.jvm.internal.m.e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static List O(Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        int length = objArr.length - 2;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            throw new IllegalArgumentException(p0.h(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            return r.f50854a;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return k0(objArr);
        }
        if (length == 1) {
            return ns.o.K(objArr[length2 - 1]);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = length2 - length; i11 < length2; i11++) {
            arrayList.add(objArr[i11]);
        }
        return arrayList;
    }

    public static void P(int i11, int i12, Object obj, Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        Arrays.fill(objArr, i11, i12, obj);
    }

    public static void Q(int[] iArr, int i11) {
        int length = iArr.length;
        kotlin.jvm.internal.m.f(iArr, "<this>");
        Arrays.fill(iArr, 0, length, i11);
    }

    public static void R(long[] jArr, long j11) {
        int length = jArr.length;
        kotlin.jvm.internal.m.f(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j11);
    }

    public static ArrayList T(Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object U(Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static lz.g V(int[] iArr) {
        return new lz.g(0, iArr.length - 1, 1);
    }

    public static int W(long[] jArr) {
        kotlin.jvm.internal.m.f(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int X(Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Object Y(int i11, Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        if (i11 < 0 || i11 >= objArr.length) {
            return null;
        }
        return objArr[i11];
    }

    public static int Z(Object[] objArr, Object obj) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        int i11 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i11 < length) {
                if (objArr[i11] == null) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i11 < length2) {
            if (obj.equals(objArr[i11])) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static String a0(byte[] bArr, String str, k2 k2Var, int i11) {
        if ((i11 & 1) != 0) {
            str = ", ";
        }
        int i12 = i11 & 2;
        String str2 = BuildConfig.VERSION_NAME;
        String str3 = i12 != 0 ? BuildConfig.VERSION_NAME : "[";
        if ((i11 & 4) == 0) {
            str2 = "]";
        }
        int i13 = (i11 & 8) != 0 ? -1 : 32;
        if ((i11 & 32) != 0) {
            k2Var = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str3);
        int i14 = 0;
        for (byte b3 : bArr) {
            i14++;
            if (i14 > 1) {
                sb2.append((CharSequence) str);
            }
            if (i13 >= 0 && i14 > i13) {
                break;
            }
            if (k2Var != null) {
                sb2.append((CharSequence) k2Var.invoke(Byte.valueOf(b3)));
            } else {
                sb2.append((CharSequence) String.valueOf((int) b3));
            }
        }
        if (i13 >= 0 && i14 > i13) {
            sb2.append((CharSequence) "...");
        }
        sb2.append((CharSequence) str2);
        return sb2.toString();
    }

    public static String b0(Object[] objArr, String str, String str2, int i11) {
        String str3 = (i11 & 1) != 0 ? ", " : ",";
        if ((i11 & 2) != 0) {
            str = BuildConfig.VERSION_NAME;
        }
        if ((i11 & 4) != 0) {
            str2 = BuildConfig.VERSION_NAME;
        }
        kotlin.jvm.internal.m.f(objArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str);
        int i12 = 0;
        for (Object obj : objArr) {
            i12++;
            if (i12 > 1) {
                sb2.append((CharSequence) str3);
            }
            se.p.L(sb2, obj, null);
        }
        sb2.append((CharSequence) str2);
        return sb2.toString();
    }

    public static Integer c0(int[] iArr) {
        kotlin.jvm.internal.m.f(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i11 = iArr[0];
        int i12 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i13 = iArr[i12];
                if (i11 > i13) {
                    i11 = i13;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        return Integer.valueOf(i11);
    }

    public static Object d0(Object[] objArr) {
        jz.d dVar = jz.e.f37397a;
        if (objArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return objArr[jz.e.f37398b.d(objArr.length)];
    }

    public static char e0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static void f0(Comparator comparator, Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        kotlin.jvm.internal.m.f(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void g0(Object[] objArr, Comparator comparator, int i11, int i12) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        kotlin.jvm.internal.m.f(comparator, "comparator");
        Arrays.sort(objArr, i11, i12, comparator);
    }

    public static final void h0(Object[] objArr, HashSet hashSet) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static List i0(int[] iArr) {
        kotlin.jvm.internal.m.f(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return r.f50854a;
        }
        if (length == 1) {
            return ns.o.K(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i11 : iArr) {
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    public static List j0(long[] jArr) {
        kotlin.jvm.internal.m.f(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return r.f50854a;
        }
        if (length == 1) {
            return ns.o.K(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j11 : jArr) {
            arrayList.add(Long.valueOf(j11));
        }
        return arrayList;
    }

    public static List k0(Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? l0(objArr) : ns.o.K(objArr[0]);
        }
        return r.f50854a;
    }

    public static ArrayList l0(Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        return new ArrayList(new j(objArr, false));
    }

    public static Set m0(Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return t.f50856a;
        }
        if (length == 1) {
            return qx.b.H(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(x.W(objArr.length));
        h0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Integer[] n0(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            numArr[i11] = Integer.valueOf(iArr[i11]);
        }
        return numArr;
    }
}
