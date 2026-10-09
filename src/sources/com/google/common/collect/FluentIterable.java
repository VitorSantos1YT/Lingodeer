package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class FluentIterable<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Optional f16728a;

    /* JADX INFO: renamed from: com.google.common.collect.FluentIterable$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.FluentIterable$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 extends FluentIterable<Object> {

        /* JADX INFO: renamed from: com.google.common.collect.FluentIterable$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends AbstractIndexedListIterator<Iterator<Object>> {
            public AnonymousClass1(int i11) {
                super(i11, 0);
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            public final Object a(int i11) {
                throw null;
            }
        }

        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class FromIterableFunction<E> implements Function<Iterable<E>, FluentIterable<E>> {
        private FromIterableFunction() {
        }

        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return FluentIterable.b((Iterable) obj);
        }
    }

    public FluentIterable() {
        this.f16728a = Optional.a();
    }

    public static FluentIterable b(final Iterable iterable) {
        return iterable instanceof FluentIterable ? (FluentIterable) iterable : new FluentIterable<Object>(iterable) { // from class: com.google.common.collect.FluentIterable.1
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return iterable.iterator();
            }
        };
    }

    public final Iterable d() {
        return (Iterable) this.f16728a.f(this);
    }

    public final ImmutableSet e() {
        Iterable iterableD = d();
        int i11 = ImmutableSet.f16842c;
        if (iterableD instanceof Collection) {
            return ImmutableSet.m((Collection) iterableD);
        }
        Iterator it = iterableD.iterator();
        if (!it.hasNext()) {
            return RegularImmutableSet.L;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return new SingletonImmutableSet(next);
        }
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.a(next);
        while (it.hasNext()) {
            builder.a(it.next());
        }
        return builder.k();
    }

    public String toString() {
        Iterator it = d().iterator();
        StringBuilder sb2 = new StringBuilder("[");
        boolean z11 = true;
        while (it.hasNext()) {
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z11 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }

    public FluentIterable(Iterable iterable) {
        this.f16728a = Optional.d(iterable);
    }
}
