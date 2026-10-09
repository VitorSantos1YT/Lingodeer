package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractBaseGraph<N> implements BaseGraph<N> {

    /* JADX INFO: renamed from: com.google.common.graph.AbstractBaseGraph$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends AbstractSet<EndpointPair<Object>> {
        public AnonymousClass1() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj instanceof EndpointPair) {
                EndpointPair endpointPair = (EndpointPair) obj;
                Object obj2 = endpointPair.f17328a;
                boolean zB = endpointPair.b();
                AbstractBaseGraph abstractBaseGraph = AbstractBaseGraph.this;
                if (zB == abstractBaseGraph.b() && abstractBaseGraph.d().contains(obj2) && abstractBaseGraph.k(obj2).contains(endpointPair.f17329b)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            AbstractBaseGraph abstractBaseGraph = AbstractBaseGraph.this;
            if (abstractBaseGraph.b()) {
                return new EndpointPairIterator.Directed(abstractBaseGraph);
            }
            EndpointPairIterator.Undirected undirected = new EndpointPairIterator.Undirected(abstractBaseGraph);
            undirected.f17334t = new HashSet(Maps.c(abstractBaseGraph.d().size() + 1));
            return undirected;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return Ints.e(AbstractBaseGraph.this.n());
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.AbstractBaseGraph$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends IncidentEdgeSet<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f17325a = 0;

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }
    }

    @Override // com.google.common.graph.BaseGraph
    public int f() {
        return b() ? k(null).size() : m(null);
    }

    @Override // com.google.common.graph.BaseGraph
    public int g() {
        return b() ? j(null).size() : m(null);
    }

    public int m(Object obj) {
        if (b()) {
            return Ints.e(((long) j(obj).size()) + ((long) k(obj).size()));
        }
        Set setL = l(obj);
        return Ints.e(((long) setL.size()) + ((long) ((c() && setL.contains(obj)) ? 1 : 0)));
    }

    public long n() {
        Iterator it = d().iterator();
        long jM = 0;
        while (it.hasNext()) {
            jM += (long) m(it.next());
        }
        Preconditions.r((1 & jM) == 0);
        return jM >>> 1;
    }
}
