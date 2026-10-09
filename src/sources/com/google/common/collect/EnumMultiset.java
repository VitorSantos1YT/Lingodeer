package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class EnumMultiset<E extends Enum<E>> extends AbstractMultiset<E> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Class f16709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Enum[] f16710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int[] f16711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f16712f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient long f16713t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public abstract class Itr<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16718a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16719b = -1;

        public Itr() {
        }

        public abstract Object a(int i11);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (true) {
                int i11 = this.f16718a;
                EnumMultiset enumMultiset = EnumMultiset.this;
                if (i11 >= enumMultiset.f16710d.length) {
                    return false;
                }
                if (enumMultiset.f16711e[i11] > 0) {
                    return true;
                }
                this.f16718a = i11 + 1;
            }
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objA = a(this.f16718a);
            int i11 = this.f16718a;
            this.f16719b = i11;
            this.f16718a = i11 + 1;
            return objA;
        }

        @Override // java.util.Iterator
        public final void remove() {
            CollectPreconditions.d(this.f16719b >= 0);
            EnumMultiset enumMultiset = EnumMultiset.this;
            int[] iArr = enumMultiset.f16711e;
            int i11 = this.f16719b;
            int i12 = iArr[i11];
            if (i12 > 0) {
                enumMultiset.f16712f--;
                enumMultiset.f16713t -= (long) i12;
                iArr[i11] = 0;
            }
            this.f16719b = -1;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        Class cls = (Class) object;
        this.f16709c = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f16710d = enumArr;
        this.f16711e = new int[enumArr.length];
        Serialization.d(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f16709c);
        Serialization.g(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(int i11, Object obj) {
        Enum r9 = (Enum) obj;
        h(r9);
        CollectPreconditions.b(i11, "occurrences");
        if (i11 == 0) {
            return q0(r9);
        }
        int iOrdinal = r9.ordinal();
        int i12 = this.f16711e[iOrdinal];
        long j11 = i11;
        long j12 = ((long) i12) + j11;
        Preconditions.d(j12, "too many occurrences: %s", j12 <= 2147483647L);
        this.f16711e[iOrdinal] = (int) j12;
        if (i12 == 0) {
            this.f16712f++;
        }
        this.f16713t += j11;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Arrays.fill(this.f16711e, 0);
        this.f16713t = 0L;
        this.f16712f = 0;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int e() {
        return this.f16712f;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator f() {
        return new EnumMultiset<Enum<Object>>.Itr<Enum<Object>>() { // from class: com.google.common.collect.EnumMultiset.1
            @Override // com.google.common.collect.EnumMultiset.Itr
            public final Object a(int i11) {
                return EnumMultiset.this.f16710d[i11];
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator g() {
        return new EnumMultiset<Enum<Object>>.Itr<Multiset.Entry<Enum<Object>>>() { // from class: com.google.common.collect.EnumMultiset.2
            @Override // com.google.common.collect.EnumMultiset.Itr
            public final Object a(final int i11) {
                return new Multisets.AbstractEntry<Enum<Object>>(this) { // from class: com.google.common.collect.EnumMultiset.2.1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AnonymousClass2 f16717b;

                    {
                        this.f16717b = this;
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public final Object a() {
                        return EnumMultiset.this.f16710d[i11];
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public final int getCount() {
                        return EnumMultiset.this.f16711e[i11];
                    }
                };
            }
        };
    }

    public final void h(Object obj) {
        obj.getClass();
        if (j(obj)) {
            return;
        }
        throw new ClassCastException("Expected an " + this.f16709c + " but got " + obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return Multisets.b(this);
    }

    public final boolean j(Object obj) {
        if (obj instanceof Enum) {
            Enum r9 = (Enum) obj;
            int iOrdinal = r9.ordinal();
            Enum[] enumArr = this.f16710d;
            if (iOrdinal < enumArr.length && enumArr[iOrdinal] == r9) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.Multiset
    public final int q0(Object obj) {
        if (obj == null || !j(obj)) {
            return 0;
        }
        return this.f16711e[((Enum) obj).ordinal()];
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return Ints.e(this.f16713t);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int u0(int i11, Object obj) {
        if (obj != null && j(obj)) {
            Enum r9 = (Enum) obj;
            CollectPreconditions.b(i11, "occurrences");
            if (i11 == 0) {
                return q0(obj);
            }
            int iOrdinal = r9.ordinal();
            int[] iArr = this.f16711e;
            int i12 = iArr[iOrdinal];
            if (i12 != 0) {
                if (i12 > i11) {
                    iArr[iOrdinal] = i12 - i11;
                    this.f16713t -= (long) i11;
                    return i12;
                }
                iArr[iOrdinal] = 0;
                this.f16712f--;
                this.f16713t -= (long) i12;
                return i12;
            }
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int w1(Object obj) {
        Enum r9 = (Enum) obj;
        h(r9);
        CollectPreconditions.b(0, "count");
        int iOrdinal = r9.ordinal();
        int[] iArr = this.f16711e;
        int i11 = iArr[iOrdinal];
        iArr[iOrdinal] = 0;
        this.f16713t += (long) (0 - i11);
        if (i11 > 0) {
            this.f16712f--;
        }
        return i11;
    }
}
