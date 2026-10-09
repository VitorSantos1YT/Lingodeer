package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class TreeMultiset<E> extends AbstractSortedMultiset<E> implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f17271f = 0;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient GeneralRange f17272e;

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends Multisets.AbstractEntry<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AvlNode f17273a;

        public AnonymousClass1(TreeMultiset treeMultiset, AvlNode avlNode) {
            this.f17273a = avlNode;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final Object a() {
            return this.f17273a.f17281a;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            int i11 = this.f17273a.f17282b;
            if (i11 != 0) {
                return i11;
            }
            try {
                throw null;
            } catch (NullPointerException unused) {
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 implements Iterator<Multiset.Entry<Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AvlNode f17274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Multiset.Entry f17275b;

        public AnonymousClass2() {
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            AvlNode avlNode = this.f17274a;
            if (avlNode == null) {
                return false;
            }
            if (!TreeMultiset.this.f17272e.c(avlNode.f17281a)) {
                return true;
            }
            this.f17274a = null;
            return false;
        }

        @Override // java.util.Iterator
        public final Multiset.Entry<Object> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AvlNode avlNode = this.f17274a;
            Objects.requireNonNull(avlNode);
            int i11 = TreeMultiset.f17271f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(TreeMultiset.this, avlNode);
            this.f17275b = anonymousClass1;
            Objects.requireNonNull(this.f17274a.f17284d);
            AvlNode avlNode2 = this.f17274a.f17284d;
            Objects.requireNonNull(avlNode2);
            this.f17274a = avlNode2;
            return anonymousClass1;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Preconditions.p("no calls to next() since the last call to remove()", this.f17275b != null);
            TreeMultiset.this.w1(((AnonymousClass1) this.f17275b).f17273a.f17281a);
            this.f17275b = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 implements Iterator<Multiset.Entry<Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AvlNode f17277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Multiset.Entry f17278b;

        public AnonymousClass3() {
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            AvlNode avlNode = this.f17277a;
            if (avlNode == null) {
                return false;
            }
            if (!TreeMultiset.this.f17272e.d(avlNode.f17281a)) {
                return true;
            }
            this.f17277a = null;
            return false;
        }

        @Override // java.util.Iterator
        public final Multiset.Entry<Object> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Objects.requireNonNull(this.f17277a);
            AvlNode avlNode = this.f17277a;
            int i11 = TreeMultiset.f17271f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(TreeMultiset.this, avlNode);
            this.f17278b = anonymousClass1;
            Objects.requireNonNull(this.f17277a.f17283c);
            AvlNode avlNode2 = this.f17277a.f17283c;
            Objects.requireNonNull(avlNode2);
            this.f17277a = avlNode2;
            return anonymousClass1;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Preconditions.p("no calls to next() since the last call to remove()", this.f17278b != null);
            TreeMultiset.this.w1(((AnonymousClass1) this.f17278b).f17273a.f17281a);
            this.f17278b = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17280a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f17280a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17280a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum Aggregate {
        SIZE { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
        },
        DISTINCT { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AvlNode<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f17281a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17282b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AvlNode f17283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AvlNode f17284d;

        public final String toString() {
            return new Multisets.ImmutableEntry(this.f17281a, this.f17282b).toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Reference<T> {
        private Reference() {
        }

        public /* synthetic */ Reference(int i11) {
            this();
        }
    }

    public TreeMultiset(GeneralRange generalRange) {
        super(generalRange.f16731a);
        this.f17272e = generalRange;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        Comparator comparator = (Comparator) object;
        Serialization.a(AbstractSortedMultiset.class, "comparator").a(this, comparator);
        Serialization.FieldSetter fieldSetterA = Serialization.a(TreeMultiset.class, "range");
        BoundType boundType = BoundType.OPEN;
        fieldSetterA.a(this, new GeneralRange(comparator, false, null, boundType, false, null, boundType));
        Serialization.a(TreeMultiset.class, "rootReference").a(this, new Reference(0));
        AvlNode avlNode = new AvlNode();
        Serialization.a(TreeMultiset.class, "header").a(this, avlNode);
        avlNode.f17284d = avlNode;
        avlNode.f17283c = avlNode;
        Serialization.d(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(super.c().comparator());
        Serialization.g(this, objectOutputStream);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset E0(Object obj, BoundType boundType) {
        return new TreeMultiset(this.f17272e.b(new GeneralRange(this.f16616c, true, obj, boundType, false, null, BoundType.OPEN)));
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean J(int i11, Object obj) {
        CollectPreconditions.b(0, "newCount");
        CollectPreconditions.b(i11, "oldCount");
        Preconditions.g(this.f17272e.a(obj));
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(int i11, Object obj) {
        CollectPreconditions.b(i11, "occurrences");
        if (i11 == 0) {
            try {
                throw null;
            } catch (NullPointerException unused) {
                return 0;
            }
        }
        Preconditions.g(this.f17272e.a(obj));
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        GeneralRange generalRange = this.f17272e;
        if (!generalRange.f16732b && !generalRange.f16735e) {
            throw null;
        }
        new AnonymousClass2();
        throw null;
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator comparator() {
        return this.f16616c;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int e() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator f() {
        new AnonymousClass2();
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator g() {
        new AnonymousClass2();
        throw null;
    }

    @Override // com.google.common.collect.AbstractSortedMultiset
    public final Iterator h() {
        new AnonymousClass3();
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return Multisets.b(this);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset k0(Object obj, BoundType boundType) {
        return new TreeMultiset(this.f17272e.b(new GeneralRange(this.f16616c, false, null, BoundType.OPEN, true, obj, boundType)));
    }

    @Override // com.google.common.collect.Multiset
    public final int q0(Object obj) {
        try {
            throw null;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int u0(int i11, Object obj) {
        CollectPreconditions.b(i11, "occurrences");
        if (i11 != 0) {
            throw null;
        }
        try {
            throw null;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int w1(Object obj) {
        CollectPreconditions.b(0, "count");
        if (this.f17272e.a(obj)) {
            throw null;
        }
        return 0;
    }
}
