package com.google.common.collect;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMultiset<E> extends ForwardingCollection<E> implements Multiset<E> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class StandardElementSet extends Multisets.ElementSet<E> {
        @Override // com.google.common.collect.Multisets.ElementSet
        public final Multiset f() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }
    }

    @Override // com.google.common.collect.Multiset
    public boolean J(int i11, Object obj) {
        return j0().J(i11, obj);
    }

    @Override // com.google.common.collect.Multiset
    public int add(int i11, Object obj) {
        return j0().add(i11, obj);
    }

    public Set c() {
        return j0().c();
    }

    public Set entrySet() {
        return j0().entrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(Object obj) {
        return obj == this || j0().equals(obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
        return j0().hashCode();
    }

    @Override // com.google.common.collect.Multiset
    public final int q0(Object obj) {
        return j0().q0(obj);
    }

    @Override // com.google.common.collect.Multiset
    public int u0(int i11, Object obj) {
        return j0().u0(i11, obj);
    }

    @Override // com.google.common.collect.ForwardingCollection
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public abstract Multiset o0();

    @Override // com.google.common.collect.Multiset
    public int w1(Object obj) {
        return j0().w1(obj);
    }
}
