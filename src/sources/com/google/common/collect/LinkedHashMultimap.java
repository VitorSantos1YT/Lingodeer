package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {
    private static final long serialVersionUID = 1;
    public transient ValueEntry H;

    /* JADX INFO: renamed from: com.google.common.collect.LinkedHashMultimap$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements Iterator<Map.Entry<Object, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ValueEntry f16906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ValueEntry f16907b;

        public AnonymousClass1() {
            ValueEntry valueEntry = LinkedHashMultimap.this.H.H;
            Objects.requireNonNull(valueEntry);
            this.f16906a = valueEntry;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f16906a != LinkedHashMultimap.this.H;
        }

        @Override // java.util.Iterator
        public final Map.Entry<Object, Object> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            ValueEntry valueEntry = this.f16906a;
            this.f16907b = valueEntry;
            ValueEntry valueEntry2 = valueEntry.H;
            Objects.requireNonNull(valueEntry2);
            this.f16906a = valueEntry2;
            return valueEntry;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Preconditions.p("no calls to next() since the last call to remove()", this.f16907b != null);
            ValueEntry valueEntry = this.f16907b;
            LinkedHashMultimap.this.remove(valueEntry.f16765a, valueEntry.f16766b);
            this.f16907b = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements ValueSetLink<K, V> {
        public ValueEntry H;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f16909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ValueEntry f16910d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ValueSetLink f16911e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ValueSetLink f16912f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ValueEntry f16913t;

        public ValueEntry(Object obj, Object obj2, int i11, ValueEntry valueEntry) {
            super(obj, obj2);
            this.f16909c = i11;
            this.f16910d = valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final void b(ValueSetLink valueSetLink) {
            this.f16912f = valueSetLink;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final ValueSetLink d() {
            ValueSetLink valueSetLink = this.f16912f;
            Objects.requireNonNull(valueSetLink);
            return valueSetLink;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final void e(ValueSetLink valueSetLink) {
            this.f16911e = valueSetLink;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class ValueSet extends Sets.ImprovedAbstractSet<V> implements ValueSetLink<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f16914a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16916c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16917d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ValueSetLink f16918e = this;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ValueSetLink f16919f = this;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ValueEntry[] f16915b = new ValueEntry[Hashing.a(2, 1.0d)];

        public ValueSet(Object obj) {
            this.f16914a = obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            int iC = Hashing.c(obj);
            ValueEntry[] valueEntryArr = this.f16915b;
            int length = (valueEntryArr.length - 1) & iC;
            ValueEntry valueEntry = valueEntryArr[length];
            for (ValueEntry valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.f16910d) {
                if (valueEntry2.f16909c == iC && com.google.common.base.Objects.a(valueEntry2.f16766b, obj)) {
                    return false;
                }
            }
            ValueEntry valueEntry3 = new ValueEntry(this.f16914a, obj, iC, valueEntry);
            ValueSetLink valueSetLink = this.f16919f;
            valueSetLink.b(valueEntry3);
            valueEntry3.e(valueSetLink);
            valueEntry3.b(this);
            e(valueEntry3);
            LinkedHashMultimap linkedHashMultimap = LinkedHashMultimap.this;
            ValueEntry valueEntry4 = linkedHashMultimap.H.f16913t;
            Objects.requireNonNull(valueEntry4);
            valueEntry4.H = valueEntry3;
            valueEntry3.f16913t = valueEntry4;
            ValueEntry valueEntry5 = linkedHashMultimap.H;
            valueEntry3.H = valueEntry5;
            valueEntry5.f16913t = valueEntry3;
            ValueEntry[] valueEntryArr2 = this.f16915b;
            valueEntryArr2[length] = valueEntry3;
            int i11 = this.f16916c + 1;
            this.f16916c = i11;
            this.f16917d++;
            int length2 = valueEntryArr2.length;
            if (i11 > 1.0d * ((double) length2) && length2 < 1073741824) {
                int length3 = valueEntryArr2.length * 2;
                ValueEntry[] valueEntryArr3 = new ValueEntry[length3];
                this.f16915b = valueEntryArr3;
                int i12 = length3 - 1;
                for (ValueSetLink valueSetLinkD = this.f16918e; valueSetLinkD != this; valueSetLinkD = valueSetLinkD.d()) {
                    ValueEntry valueEntry6 = (ValueEntry) valueSetLinkD;
                    int i13 = valueEntry6.f16909c & i12;
                    valueEntry6.f16910d = valueEntryArr3[i13];
                    valueEntryArr3[i13] = valueEntry6;
                }
            }
            return true;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final void b(ValueSetLink valueSetLink) {
            this.f16918e = valueSetLink;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Arrays.fill(this.f16915b, (Object) null);
            this.f16916c = 0;
            for (ValueSetLink valueSetLinkD = this.f16918e; valueSetLinkD != this; valueSetLinkD = valueSetLinkD.d()) {
                ValueEntry valueEntry = (ValueEntry) valueSetLinkD;
                ValueEntry valueEntry2 = valueEntry.f16913t;
                Objects.requireNonNull(valueEntry2);
                ValueEntry valueEntry3 = valueEntry.H;
                Objects.requireNonNull(valueEntry3);
                valueEntry2.H = valueEntry3;
                valueEntry3.f16913t = valueEntry2;
            }
            b(this);
            e(this);
            this.f16917d++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            int iC = Hashing.c(obj);
            ValueEntry[] valueEntryArr = this.f16915b;
            for (ValueEntry valueEntry = valueEntryArr[(valueEntryArr.length - 1) & iC]; valueEntry != null; valueEntry = valueEntry.f16910d) {
                if (valueEntry.f16909c == iC && com.google.common.base.Objects.a(valueEntry.f16766b, obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final ValueSetLink d() {
            return this.f16918e;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final void e(ValueSetLink valueSetLink) {
            this.f16919f = valueSetLink;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new Iterator<Object>() { // from class: com.google.common.collect.LinkedHashMultimap.ValueSet.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public ValueSetLink f16921a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public ValueEntry f16922b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f16923c;

                {
                    this.f16921a = ValueSet.this.f16918e;
                    this.f16923c = ValueSet.this.f16917d;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    ValueSet valueSet = ValueSet.this;
                    if (valueSet.f16917d == this.f16923c) {
                        return this.f16921a != valueSet;
                    }
                    throw new ConcurrentModificationException();
                }

                @Override // java.util.Iterator
                public final Object next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    ValueEntry valueEntry = (ValueEntry) this.f16921a;
                    Object obj = valueEntry.f16766b;
                    this.f16922b = valueEntry;
                    this.f16921a = valueEntry.d();
                    return obj;
                }

                @Override // java.util.Iterator
                public final void remove() {
                    ValueSet valueSet = ValueSet.this;
                    if (valueSet.f16917d != this.f16923c) {
                        throw new ConcurrentModificationException();
                    }
                    Preconditions.p(xTCJ.gEAvkRISHQsK, this.f16922b != null);
                    valueSet.remove(this.f16922b.f16766b);
                    this.f16923c = valueSet.f16917d;
                    this.f16922b = null;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int iC = Hashing.c(obj);
            ValueEntry[] valueEntryArr = this.f16915b;
            int length = (valueEntryArr.length - 1) & iC;
            ValueEntry valueEntry = null;
            for (ValueEntry valueEntry2 = valueEntryArr[length]; valueEntry2 != null; valueEntry2 = valueEntry2.f16910d) {
                if (valueEntry2.f16909c == iC && com.google.common.base.Objects.a(valueEntry2.f16766b, obj)) {
                    if (valueEntry == null) {
                        this.f16915b[length] = valueEntry2.f16910d;
                    } else {
                        valueEntry.f16910d = valueEntry2.f16910d;
                    }
                    ValueSetLink valueSetLink = valueEntry2.f16911e;
                    Objects.requireNonNull(valueSetLink);
                    ValueSetLink valueSetLinkD = valueEntry2.d();
                    valueSetLink.b(valueSetLinkD);
                    valueSetLinkD.e(valueSetLink);
                    ValueEntry valueEntry3 = valueEntry2.f16913t;
                    Objects.requireNonNull(valueEntry3);
                    ValueEntry valueEntry4 = valueEntry2.H;
                    Objects.requireNonNull(valueEntry4);
                    valueEntry3.H = valueEntry4;
                    valueEntry4.f16913t = valueEntry3;
                    this.f16916c--;
                    this.f16917d++;
                    return true;
                }
                valueEntry = valueEntry2;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f16916c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ValueSetLink<K, V> {
        void b(ValueSetLink valueSetLink);

        ValueSetLink d();

        void e(ValueSetLink valueSetLink);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        ValueEntry valueEntry = new ValueEntry(null, null, 0, null);
        this.H = valueEntry;
        valueEntry.H = valueEntry;
        valueEntry.f16913t = valueEntry;
        int i11 = objectInputStream.readInt();
        CompactLinkedHashMap compactLinkedHashMap = new CompactLinkedHashMap(12);
        for (int i12 = 0; i12 < i11; i12++) {
            Object object = objectInputStream.readObject();
            compactLinkedHashMap.put(object, new ValueSet(object));
        }
        int i13 = objectInputStream.readInt();
        for (int i14 = 0; i14 < i13; i14++) {
            Object object2 = objectInputStream.readObject();
            Object object3 = objectInputStream.readObject();
            Collection collection = (Collection) compactLinkedHashMap.get(object2);
            Objects.requireNonNull(collection);
            collection.add(object3);
        }
        o(compactLinkedHashMap);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(super.keySet().size());
        Iterator it = super.keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeInt(this.f16562t);
        for (Map.Entry entry : super.e()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final void clear() {
        super.clear();
        ValueEntry valueEntry = this.H;
        valueEntry.H = valueEntry;
        valueEntry.f16913t = valueEntry;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        return this.f16561f.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Collection e() {
        return super.e();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    public final Iterator i() {
        return new AnonymousClass1();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Collection k(Object obj) {
        return new ValueSet(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Iterator q() {
        return new Maps.AnonymousClass2(new AnonymousClass1());
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: s */
    public final Set j() {
        return new CompactLinkedHashSet(2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final int size() {
        return this.f16562t;
    }
}
