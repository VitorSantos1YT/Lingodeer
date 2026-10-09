package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Iterables {

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.FluentIterable
        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends FluentIterable<List<Object>> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 extends FluentIterable<List<Object>> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass7 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$8, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass8 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.FluentIterable
        public final String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass9 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            Iterables.h(null, new e(2));
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class UnmodifiableIterable<T> extends FluentIterable<T> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.FluentIterable
        public final String toString() {
            throw null;
        }
    }

    private Iterables() {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0025 A[RETURN] */
    public static boolean a(Iterable iterable, Predicate predicate) {
        Iterator it = iterable.iterator();
        Preconditions.k(predicate, "predicate");
        int i11 = 0;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                if (i11 != -1) {
                    return true;
                }
                return false;
            }
            i11++;
        }
        i11 = -1;
        if (i11 != -1) {
            return true;
        }
        return false;
    }

    public static Iterable b(final Iterable iterable, final Predicate predicate) {
        iterable.getClass();
        predicate.getClass();
        return new FluentIterable<Object>() { // from class: com.google.common.collect.Iterables.4
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return Iterators.e(iterable.iterator(), predicate);
            }
        };
    }

    public static Object c(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return p.g(1, list);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object e(Iterable iterable, Predicate predicate) {
        predicate.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (predicate.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static boolean f(Iterable iterable, Predicate predicate) {
        boolean z11 = false;
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            predicate.getClass();
            while (it.hasNext()) {
                if (predicate.apply(it.next())) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }
        List list = (List) iterable;
        predicate.getClass();
        int i11 = 0;
        int i12 = 0;
        while (i11 < list.size()) {
            Object obj = list.get(i11);
            if (!predicate.apply(obj)) {
                if (i11 > i12) {
                    try {
                        list.set(i12, obj);
                    } catch (IllegalArgumentException unused) {
                        g(list, predicate, i12, i11);
                    } catch (UnsupportedOperationException unused2) {
                        g(list, predicate, i12, i11);
                    }
                }
                i12++;
            }
            i11++;
        }
        list.subList(i12, list.size()).clear();
        return i11 != i12;
    }

    public static void g(List list, Predicate predicate, int i11, int i12) {
        for (int size = list.size() - 1; size > i12; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            list.remove(i13);
        }
    }

    public static Iterable h(final Collection collection, final Function function) {
        collection.getClass();
        return new FluentIterable<Object>() { // from class: com.google.common.collect.Iterables.5
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return Iterators.m(collection.iterator(), function);
            }
        };
    }

    public static Object d(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder("expected one element but was: <");
        sb2.append(next);
        for (int i11 = 0; i11 < 4 && it.hasNext(); i11++) {
            sb2.append(xTCJ.yIz);
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }
}
