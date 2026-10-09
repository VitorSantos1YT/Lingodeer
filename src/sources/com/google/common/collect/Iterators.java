package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.primitives.Ints;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Iterators {

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$10, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass10 implements Enumeration<Object> {
        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            throw null;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 implements Iterator<Object> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass4 extends UnmodifiableIterator<List<Object>> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass6 extends TransformedIterator<Object, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function f16893b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Iterator it, Function function) {
            super(it);
            this.f16893b = function;
        }

        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return this.f16893b.apply(obj);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass7 implements Iterator<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16894a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f16894a++;
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$8, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass8 extends UnmodifiableIterator<Object> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }

        public final String toString() {
            return "Iterators.consumingIterator(...)";
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass9 extends UnmodifiableIterator<Object> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ArrayItr<T> extends AbstractIndexedListIterator<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final UnmodifiableListIterator f16895d = new ArrayItr(new Object[0]);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object[] f16896c;

        public ArrayItr(Object[] objArr) {
            super(objArr.length, 0);
            this.f16896c = objArr;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        public final Object a(int i11) {
            return this.f16896c[i11];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ConcatenatedIterator<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator f16897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator f16898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator f16899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayDeque f16900d;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator it;
            while (true) {
                Iterator it2 = this.f16898b;
                it2.getClass();
                if (it2.hasNext()) {
                    return true;
                }
                while (true) {
                    Iterator it3 = this.f16899c;
                    if (it3 != null && it3.hasNext()) {
                        it = this.f16899c;
                        break;
                    }
                    ArrayDeque arrayDeque = this.f16900d;
                    if (arrayDeque == null || arrayDeque.isEmpty()) {
                        it = null;
                        break;
                    }
                    this.f16899c = (Iterator) this.f16900d.removeFirst();
                }
                this.f16899c = it;
                if (it == null) {
                    return false;
                }
                Iterator it4 = (Iterator) it.next();
                this.f16898b = it4;
                if (it4 instanceof ConcatenatedIterator) {
                    ConcatenatedIterator concatenatedIterator = (ConcatenatedIterator) it4;
                    this.f16898b = concatenatedIterator.f16898b;
                    if (this.f16900d == null) {
                        this.f16900d = new ArrayDeque();
                    }
                    this.f16900d.addFirst(this.f16899c);
                    if (concatenatedIterator.f16900d != null) {
                        while (!concatenatedIterator.f16900d.isEmpty()) {
                            this.f16900d.addFirst((Iterator) concatenatedIterator.f16900d.removeLast());
                        }
                    }
                    this.f16899c = concatenatedIterator.f16899c;
                }
            }
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator it = this.f16898b;
            this.f16897a = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            Iterator it = this.f16897a;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.f16897a = null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class EmptyModifiableIterator implements Iterator<Object> {
        private static final /* synthetic */ EmptyModifiableIterator[] $VALUES;
        public static final EmptyModifiableIterator INSTANCE;

        static {
            EmptyModifiableIterator emptyModifiableIterator = new EmptyModifiableIterator("INSTANCE", 0);
            INSTANCE = emptyModifiableIterator;
            $VALUES = new EmptyModifiableIterator[]{emptyModifiableIterator};
        }

        public static EmptyModifiableIterator valueOf(String str) {
            return (EmptyModifiableIterator) Enum.valueOf(EmptyModifiableIterator.class, str);
        }

        public static EmptyModifiableIterator[] values() {
            return (EmptyModifiableIterator[]) $VALUES.clone();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            CollectPreconditions.d(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class MergingIterator<T> extends UnmodifiableIterator<T> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class PeekingImpl<E> implements PeekingIterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f16901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f16902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f16903c;

        public PeekingImpl(Iterator it) {
            it.getClass();
            this.f16901a = it;
        }

        public final Object a() {
            if (!this.f16902b) {
                this.f16903c = this.f16901a.next();
                this.f16902b = true;
            }
            return this.f16903c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f16902b || this.f16901a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.f16902b) {
                return this.f16901a.next();
            }
            Object obj = this.f16903c;
            this.f16902b = false;
            this.f16903c = null;
            return obj;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Preconditions.p("Can't remove after you've peeked at next", !this.f16902b);
            this.f16901a.remove();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SingletonIterator<T> extends UnmodifiableIterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f16904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f16905b;

        public SingletonIterator(Object obj) {
            this.f16904a = obj;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f16905b;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f16905b) {
                throw new NoSuchElementException();
            }
            this.f16905b = true;
            return this.f16904a;
        }
    }

    private Iterators() {
    }

    public static boolean a(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static void b(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static Iterator c(Iterator it, Iterator it2) {
        final Iterator[] itArr = {it, it2};
        UnmodifiableIterator<Iterator<?>> unmodifiableIterator = new UnmodifiableIterator<Iterator<?>>() { // from class: com.google.common.collect.Iterators.3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f16889a = 0;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f16889a < itArr.length;
            }

            @Override // java.util.Iterator
            public final Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i11 = this.f16889a;
                Iterator[] itArr2 = itArr;
                Iterator it3 = itArr2[i11];
                Objects.requireNonNull(it3);
                Iterator it4 = it3;
                int i12 = this.f16889a;
                itArr2[i12] = null;
                this.f16889a = i12 + 1;
                return it4;
            }
        };
        ConcatenatedIterator concatenatedIterator = new ConcatenatedIterator();
        concatenatedIterator.f16898b = ArrayItr.f16895d;
        concatenatedIterator.f16899c = unmodifiableIterator;
        return concatenatedIterator;
    }

    public static boolean d(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static UnmodifiableIterator e(final Iterator it, final Predicate predicate) {
        it.getClass();
        predicate.getClass();
        return new AbstractIterator<Object>() { // from class: com.google.common.collect.Iterators.5
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                Object next;
                do {
                    Iterator it2 = it;
                    if (!it2.hasNext()) {
                        this.f16559a = AbstractIterator.State.DONE;
                        return null;
                    }
                    next = it2.next();
                } while (!predicate.apply(next));
                return next;
            }
        };
    }

    public static Object f(Iterator it, Predicate predicate) {
        it.getClass();
        predicate.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return null;
    }

    public static UnmodifiableIterator g(Object... objArr) {
        if (objArr.length != 0) {
            return new ArrayItr(objArr);
        }
        Preconditions.l(0, objArr.length);
        return ArrayItr.f16895d;
    }

    public static Object h(Iterator it, String str) {
        return it.hasNext() ? it.next() : str;
    }

    public static PeekingIterator i(Iterator it) {
        return it instanceof PeekingImpl ? (PeekingImpl) it : new PeekingImpl(it);
    }

    public static Object j(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean k(Collection collection, Iterator it) {
        collection.getClass();
        boolean z11 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static int l(Iterator it) {
        long j11 = 0;
        while (it.hasNext()) {
            it.next();
            j11++;
        }
        return Ints.e(j11);
    }

    public static Iterator m(Iterator it, Function function) {
        function.getClass();
        return new AnonymousClass6(it, function);
    }

    public static UnmodifiableIterator n(final Iterator it) {
        it.getClass();
        return it instanceof UnmodifiableIterator ? (UnmodifiableIterator) it : new UnmodifiableIterator<Object>() { // from class: com.google.common.collect.Iterators.1
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return it.next();
            }
        };
    }
}
