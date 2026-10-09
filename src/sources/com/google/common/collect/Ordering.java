package com.google.common.collect;

import com.google.common.base.Function;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class Ordering<T> implements Comparator<T> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ArbitraryOrdering extends Ordering<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f17132a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractMap f17133b;

        public ArbitraryOrdering() {
            MapMaker mapMaker = new MapMaker();
            mapMaker.b(MapMakerInternalMap.Strength.WEAK);
            this.f17133b = (AbstractMap) mapMaker.a();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractMap, java.util.Map, java.util.concurrent.ConcurrentMap] */
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int iIdentityHashCode = System.identityHashCode(obj);
            int iIdentityHashCode2 = System.identityHashCode(obj2);
            if (iIdentityHashCode != iIdentityHashCode2) {
                return iIdentityHashCode < iIdentityHashCode2 ? -1 : 1;
            }
            ?? r9 = this.f17133b;
            Integer numValueOf = (Integer) r9.get(obj);
            AtomicInteger atomicInteger = this.f17132a;
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(atomicInteger.getAndIncrement());
                Integer num = (Integer) r9.putIfAbsent(obj, numValueOf);
                if (num != null) {
                    numValueOf = num;
                }
            }
            Integer numValueOf2 = (Integer) r9.get(obj2);
            if (numValueOf2 == null) {
                numValueOf2 = Integer.valueOf(atomicInteger.getAndIncrement());
                Integer num2 = (Integer) r9.putIfAbsent(obj2, numValueOf2);
                if (num2 != null) {
                    numValueOf2 = num2;
                }
            }
            int iCompareTo = numValueOf.compareTo(numValueOf2);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            throw new AssertionError();
        }

        public final String toString() {
            return "Ordering.arbitrary()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ArbitraryOrderingHolder {
        static {
            new ArbitraryOrdering();
        }

        private ArbitraryOrderingHolder() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class IncomparableValueException extends ClassCastException {
        private static final long serialVersionUID = 0;
    }

    public static Ordering b(Comparator comparator) {
        return comparator instanceof Ordering ? (Ordering) comparator : new ComparatorOrdering(comparator);
    }

    public static Ordering c() {
        return NaturalOrdering.f17113c;
    }

    public final Ordering a(Comparator comparator) {
        return new CompoundOrdering(this, comparator);
    }

    public Ordering d() {
        return new NullsFirstOrdering(this);
    }

    public Ordering e() {
        return new NullsLastOrdering(this);
    }

    public final Ordering f(Function function) {
        return new ByFunctionOrdering(function, this);
    }

    public Ordering g() {
        return new ReverseOrdering(this);
    }
}
