package com.google.common.graph;

import com.google.common.collect.Iterators;
import com.google.errorprone.annotations.Immutable;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
public abstract class EndpointPair<N> implements Iterable<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17329b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Ordered<N> extends EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public final boolean b() {
            return true;
        }

        @Override // com.google.common.graph.EndpointPair
        public final Object d() {
            return this.f17328a;
        }

        @Override // com.google.common.graph.EndpointPair
        public final Object e() {
            return this.f17329b;
        }

        public final boolean equals(Object obj) {
            if (obj != this) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair endpointPair = (EndpointPair) obj;
                if (true != endpointPair.b() || !this.f17328a.equals(endpointPair.d()) || !this.f17329b.equals(endpointPair.e())) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f17328a, this.f17329b});
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public final Iterator iterator() {
            return Iterators.g(this.f17328a, this.f17329b);
        }

        public final String toString() {
            return "<" + this.f17328a + " -> " + this.f17329b + ">";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Unordered<N> extends EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public final boolean b() {
            return false;
        }

        @Override // com.google.common.graph.EndpointPair
        public final Object d() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        @Override // com.google.common.graph.EndpointPair
        public final Object e() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            Object obj2 = endpointPair.f17329b;
            Object obj3 = endpointPair.f17328a;
            if (endpointPair.b()) {
                return false;
            }
            Object obj4 = this.f17328a;
            boolean zEquals = obj4.equals(obj3);
            Object obj5 = this.f17329b;
            if (zEquals) {
                return obj5.equals(obj2);
            }
            return obj4.equals(obj2) && obj5.equals(obj3);
        }

        public final int hashCode() {
            return this.f17329b.hashCode() + this.f17328a.hashCode();
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public final Iterator iterator() {
            return Iterators.g(this.f17328a, this.f17329b);
        }

        public final String toString() {
            return "[" + this.f17328a + ", " + this.f17329b + OCBJEWZHh.fOYcwX;
        }
    }

    public EndpointPair(Object obj, Object obj2) {
        obj.getClass();
        this.f17328a = obj;
        obj2.getClass();
        this.f17329b = obj2;
    }

    public abstract boolean b();

    public abstract Object d();

    public abstract Object e();

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return Iterators.g(this.f17328a, this.f17329b);
    }
}
