package ry;

import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.r3;
import hh.p0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m extends p {
    public static Object A0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return nv.p.g(1, list);
    }

    public static Comparable B0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable C0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static float D0(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return fFloatValue;
    }

    public static Object E0(List list, Comparator comparator) {
        kotlin.jvm.internal.m.f(list, "<this>");
        kotlin.jvm.internal.m.f(comparator, "comparator");
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static ArrayList F0(List list, Object obj) {
        kotlin.jvm.internal.m.f(list, "<this>");
        ArrayList arrayList = new ArrayList(n.W(list, 10));
        boolean z11 = false;
        for (Object obj2 : list) {
            boolean z12 = true;
            if (!z11 && kotlin.jvm.internal.m.a(obj2, obj)) {
                z11 = true;
                z12 = false;
            }
            if (z12) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList G0(Object obj, Collection collection) {
        kotlin.jvm.internal.m.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList H0(Collection collection, Iterable elements) {
        kotlin.jvm.internal.m.f(collection, "<this>");
        kotlin.jvm.internal.m.f(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            d0(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static Object I0(Collection collection) {
        jz.d dVar = jz.e.f37397a;
        kotlin.jvm.internal.m.f(collection, "<this>");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return m0(jz.e.f37398b.d(collection.size()), collection);
    }

    public static Object J0(List list) {
        jz.d dVar = jz.e.f37397a;
        kotlin.jvm.internal.m.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return m0(jz.e.f37398b.d(list.size()), list);
    }

    public static void K0(List list, fz.c predicate) {
        int iA;
        kotlin.jvm.internal.m.f(list, "<this>");
        kotlin.jvm.internal.m.f(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            if (!(list instanceof gz.a) || (list instanceof gz.b)) {
                n0(list, predicate, true);
                return;
            } else {
                kotlin.jvm.internal.c0.f(list, "kotlin.collections.MutableIterable");
                throw null;
            }
        }
        int iA2 = ns.o.A(list);
        int i11 = 0;
        if (iA2 >= 0) {
            int i12 = 0;
            while (true) {
                Object obj = list.get(i11);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i12 != i11) {
                        list.set(i12, obj);
                    }
                    i12++;
                }
                if (i11 == iA2) {
                    break;
                } else {
                    i11++;
                }
            }
            i11 = i12;
        }
        if (i11 >= list.size() || i11 > (iA = ns.o.A(list))) {
            return;
        }
        while (true) {
            list.remove(iA);
            if (iA == i11) {
                return;
            } else {
                iA--;
            }
        }
    }

    public static Object L0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }

    public static Object M0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(ns.o.A(list));
    }

    public static Object N0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(ns.o.A(list));
    }

    public static List O0(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return a1(iterable);
        }
        List listD1 = d1(iterable);
        Collections.reverse(listD1);
        return listD1;
    }

    public static Object P0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object Q0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List R0(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listD1 = d1(iterable);
            p.Y(listD1);
            return listD1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return a1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        kotlin.jvm.internal.m.f(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return l.A(array);
    }

    public static List S0(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listD1 = d1(iterable);
            p.Z(listD1, comparator);
            return listD1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return a1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        l.f0(comparator, array);
        return l.A(array);
    }

    public static Set T0(Iterable iterable, Iterable other) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        kotlin.jvm.internal.m.f(other, "other");
        Set setE1 = e1(iterable);
        setE1.removeAll(other instanceof Collection ? (Collection) other : a1(other));
        return setE1;
    }

    public static List U0(Iterable iterable, int i11) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(p0.h(i11, "Requested element count ", " is less than zero.").toString());
        }
        if (i11 == 0) {
            return r.f50854a;
        }
        if (iterable instanceof Collection) {
            if (i11 >= ((Collection) iterable).size()) {
                return a1(iterable);
            }
            if (i11 == 1) {
                return ns.o.K(p0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i11);
        Iterator it = iterable.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return ns.o.P(arrayList);
    }

    public static List V0(int i11, List list) {
        if (i11 < 0) {
            throw new IllegalArgumentException(p0.h(i11, "Requested element count ", " is less than zero.").toString());
        }
        if (i11 == 0) {
            return r.f50854a;
        }
        int size = list.size();
        if (i11 >= size) {
            return a1(list);
        }
        if (i11 == 1) {
            return ns.o.K(z0(list));
        }
        ArrayList arrayList = new ArrayList(i11);
        if (list instanceof RandomAccess) {
            for (int i12 = size - i11; i12 < size; i12++) {
                arrayList.add(list.get(i12));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i11);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static byte[] W0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            bArr[i11] = ((Number) obj).byteValue();
            i11++;
        }
        return bArr;
    }

    public static void X0(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static HashSet Y0(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        HashSet hashSet = new HashSet(x.W(n.W(iterable, 12)));
        X0(iterable, hashSet);
        return hashSet;
    }

    public static int[] Z0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Number) it.next()).intValue();
            i11++;
        }
        return iArr;
    }

    public static final int a0(int i11, List list) {
        if (i11 >= 0 && i11 <= ns.o.A(list)) {
            return ns.o.A(list) - i11;
        }
        StringBuilder sbI = w4.c.i(i11, "Element index ", " must be in range [");
        sbI.append(new lz.g(0, ns.o.A(list), 1));
        sbI.append("].");
        throw new IndexOutOfBoundsException(sbI.toString());
    }

    public static List a1(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return ns.o.P(d1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return r.f50854a;
        }
        if (size != 1) {
            return c1(collection);
        }
        return ns.o.K(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final int b0(int i11, List list) {
        if (i11 >= 0 && i11 <= list.size()) {
            return list.size() - i11;
        }
        StringBuilder sbI = w4.c.i(i11, "Position index ", " must be in range [");
        sbI.append(new lz.g(0, list.size(), 1));
        sbI.append("].");
        throw new IndexOutOfBoundsException(sbI.toString());
    }

    public static long[] b1(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = ((Number) it.next()).longValue();
            i11++;
        }
        return jArr;
    }

    public static void c0(ArrayList arrayList, nz.l elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
    }

    public static ArrayList c1(Collection collection) {
        kotlin.jvm.internal.m.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static void d0(Collection collection, Iterable elements) {
        kotlin.jvm.internal.m.f(collection, "<this>");
        kotlin.jvm.internal.m.f(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final List d1(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return c1((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        X0(iterable, arrayList);
        return arrayList;
    }

    public static void e0(Collection collection, Object[] elements) {
        kotlin.jvm.internal.m.f(collection, "<this>");
        kotlin.jvm.internal.m.f(elements, "elements");
        collection.addAll(l.A(elements));
    }

    public static Set e1(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        X0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static oz.j f0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        return new oz.j(list);
    }

    public static Set f1(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return qx.b.H(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(x.W(collection.size()));
                X0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            X0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : qx.b.H(linkedHashSet2.iterator().next());
            }
        }
        return t.f50856a;
    }

    public static nz.o g0(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        return new nz.o(iterable, 4);
    }

    public static ArrayList g1(Iterable iterable, int i11, int i12) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (i11 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException((i11 != i12 ? p0.l("Both size ", i11, " and step ", i12, " must be greater than zero.") : p0.h(i11, "size ", " must be greater than zero.")).toString());
        }
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = iterable.iterator();
            kotlin.jvm.internal.m.f(iterator, "iterator");
            Iterator itB = !iterator.hasNext() ? q.f50853a : v10.c.B(new c0(i11, i12, iterator, null));
            while (itB.hasNext()) {
                arrayList.add((List) itB.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i12) + (size % i12 == 0 ? 0 : 1));
        int i13 = 0;
        while (i13 >= 0 && i13 < size) {
            int i14 = size - i13;
            if (i11 <= i14) {
                i14 = i11;
            }
            ArrayList arrayList3 = new ArrayList(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                arrayList3.add(list.get(i15 + i13));
            }
            arrayList2.add(arrayList3);
            i13 += i12;
        }
        return arrayList2;
    }

    public static ArrayList h0(Iterable iterable, int i11) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        return g1(iterable, i11, i11);
    }

    public static boolean i0(Iterable iterable, Object obj) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return u0(iterable, obj) >= 0;
    }

    public static List j0(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        return a1(e1(iterable));
    }

    public static final Object m0(int i11, Collection collection) {
        kotlin.jvm.internal.m.f(collection, "<this>");
        boolean z11 = collection instanceof List;
        if (z11) {
            return ((List) collection).get(i11);
        }
        r3 r3Var = new r3(i11, 7);
        if (z11) {
            List list = (List) collection;
            if (i11 >= 0 && i11 < list.size()) {
                return list.get(i11);
            }
            r3Var.invoke(Integer.valueOf(i11));
            throw null;
        }
        if (i11 < 0) {
            r3Var.invoke(Integer.valueOf(i11));
            throw null;
        }
        int i12 = 0;
        for (Object obj : collection) {
            int i13 = i12 + 1;
            if (i11 == i12) {
                return obj;
            }
            i12 = i13;
        }
        r3Var.invoke(Integer.valueOf(i11));
        throw null;
    }

    public static final boolean n0(Iterable iterable, fz.c cVar, boolean z11) {
        Iterator it = iterable.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            if (((Boolean) cVar.invoke(it.next())).booleanValue() == z11) {
                it.remove();
                z12 = true;
            }
        }
        return z12;
    }

    public static ArrayList o0(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object p0(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (iterable instanceof List) {
            return q0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object q0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object r0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object s0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object t0(int i11, List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        if (i11 < 0 || i11 >= list.size()) {
            return null;
        }
        return list.get(i11);
    }

    public static int u0(Iterable iterable, Object obj) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i11 = 0;
        for (Object obj2 : iterable) {
            if (i11 < 0) {
                ns.o.V();
                throw null;
            }
            if (kotlin.jvm.internal.m.a(obj, obj2)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static Set v0(Iterable iterable, Iterable other) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        kotlin.jvm.internal.m.f(other, "other");
        Set setE1 = e1(iterable);
        setE1.retainAll(other instanceof Collection ? (Collection) other : a1(other));
        return setE1;
    }

    public static final void w0(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, fz.c cVar) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        sb2.append(charSequence2);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                sb2.append(charSequence);
            }
            se.p.L(sb2, obj, cVar);
        }
        sb2.append(charSequence3);
    }

    public static /* synthetic */ void x0(List list, StringBuilder sb2, String str, fz.c cVar, int i11) {
        if ((i11 & 64) != 0) {
            cVar = null;
        }
        w0(list, sb2, str, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "...", cVar);
    }

    public static String y0(Iterable iterable, String str, String str2, String str3, fz.c cVar, int i11) {
        if ((i11 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String prefix = (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str2;
        String str5 = (i11 & 4) != 0 ? BuildConfig.VERSION_NAME : str3;
        if ((i11 & 32) != 0) {
            cVar = null;
        }
        kotlin.jvm.internal.m.f(iterable, "<this>");
        kotlin.jvm.internal.m.f(prefix, "prefix");
        StringBuilder sb2 = new StringBuilder();
        w0(iterable, sb2, str4, prefix, str5, "...", cVar);
        return sb2.toString();
    }

    public static Object z0(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(ns.o.A(list));
    }

    public static List k0(Iterable iterable, int i11) {
        ArrayList arrayList;
        Object objZ0;
        kotlin.jvm.internal.m.f(iterable, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(p0.h(i11, xTCJ.PQBtCxTuIw, " is less than zero.").toString());
        }
        if (i11 == 0) {
            return a1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i11;
            if (size <= 0) {
                return r.f50854a;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    objZ0 = z0((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    objZ0 = next;
                }
                return ns.o.K(objZ0);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i11 < size2) {
                        arrayList.add(list.get(i11));
                        i11++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i11);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i12 = 0;
        for (Object obj : iterable) {
            if (i12 >= i11) {
                arrayList.add(obj);
            } else {
                i12++;
            }
        }
        return ns.o.P(arrayList);
    }

    public static List l0(int i11, List list) {
        if (i11 < 0) {
            throw new IllegalArgumentException(p0.h(i11, OCBJEWZHh.QtGxUsEVi, " is less than zero.").toString());
        }
        int size = list.size() - i11;
        if (size < 0) {
            size = 0;
        }
        return U0(list, size);
    }
}
