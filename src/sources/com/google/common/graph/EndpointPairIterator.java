package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class EndpointPairIterator<N> extends AbstractIterator<EndpointPair<N>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BaseGraph f17330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f17331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f17332e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f17333f = ImmutableSet.s().iterator();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Directed<N> extends EndpointPairIterator<N> {
        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            while (!this.f17333f.hasNext()) {
                if (!c()) {
                    b();
                    return null;
                }
            }
            Object obj = this.f17332e;
            Objects.requireNonNull(obj);
            return new EndpointPair.Ordered(obj, this.f17333f.next());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Undirected<N> extends EndpointPairIterator<N> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public HashSet f17334t;

        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            do {
                Objects.requireNonNull(this.f17334t);
                while (this.f17333f.hasNext()) {
                    Object next = this.f17333f.next();
                    if (!this.f17334t.contains(next)) {
                        Object obj = this.f17332e;
                        Objects.requireNonNull(obj);
                        return new EndpointPair.Unordered(next, obj);
                    }
                }
                this.f17334t.add(this.f17332e);
            } while (c());
            this.f17334t = null;
            b();
            return null;
        }
    }

    public EndpointPairIterator(BaseGraph baseGraph) {
        this.f17330c = baseGraph;
        this.f17331d = baseGraph.d().iterator();
    }

    public final boolean c() {
        Preconditions.r(!this.f17333f.hasNext());
        Iterator it = this.f17331d;
        if (!it.hasNext()) {
            return false;
        }
        Object next = it.next();
        this.f17332e = next;
        this.f17333f = this.f17330c.k(next).iterator();
        return true;
    }
}
