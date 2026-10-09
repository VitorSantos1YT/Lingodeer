package com.google.common.collect;

import com.google.common.base.Function;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractTable<R, C, V> implements Table<R, C, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Set f16619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Collection f16620b;

    /* JADX INFO: renamed from: com.google.common.collect.AbstractTable$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends TransformedIterator<Table.Cell<Object, Object, Object>, Object> {
        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return ((Table.Cell) obj).getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class CellSet extends AbstractSet<Table.Cell<R, C, V>> {
        public CellSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            AbstractTable.this.b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Map map = (Map) Maps.g(cell.b(), AbstractTable.this.f());
            if (map != null) {
                return Collections2.c(new ImmutableEntry(cell.a(), cell.getValue()), map.entrySet());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return AbstractTable.this.a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            boolean zRemove;
            if (obj instanceof Table.Cell) {
                Table.Cell cell = (Table.Cell) obj;
                Map map = (Map) Maps.g(cell.b(), AbstractTable.this.f());
                if (map != null) {
                    Set setEntrySet = map.entrySet();
                    ImmutableEntry immutableEntry = new ImmutableEntry(cell.a(), cell.getValue());
                    Set set = setEntrySet;
                    set.getClass();
                    try {
                        zRemove = set.remove(immutableEntry);
                    } catch (ClassCastException | NullPointerException unused) {
                        zRemove = false;
                    }
                    if (zRemove) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return AbstractTable.this.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            AbstractTable.this.b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return AbstractTable.this.c(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return AbstractTable.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return AbstractTable.this.size();
        }
    }

    @Override // com.google.common.collect.Table
    public Set A() {
        Set set = this.f16619a;
        if (set != null) {
            return set;
        }
        Set setD = d();
        this.f16619a = setD;
        return setD;
    }

    public abstract Iterator a();

    public void b() {
        Iterators.b(A().iterator());
    }

    public boolean c(Object obj) {
        Iterator<V> it = f().values().iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    public Set d() {
        return new CellSet();
    }

    public Collection e() {
        return new Values();
    }

    @Override // com.google.common.collect.Table
    public boolean equals(Object obj) {
        Function function = Tables.f17261a;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Table) {
            return A().equals(((Table) obj).A());
        }
        return false;
    }

    public Collection g() {
        Collection collection = this.f16620b;
        if (collection != null) {
            return collection;
        }
        Collection collectionE = e();
        this.f16620b = collectionE;
        return collectionE;
    }

    public Iterator h() {
        return new AnonymousClass1(A().iterator());
    }

    @Override // com.google.common.collect.Table
    public int hashCode() {
        return A().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
