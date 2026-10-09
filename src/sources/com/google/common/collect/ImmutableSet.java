package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f16842c = 0;
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient ImmutableList f16843b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object[] f16844d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16845e;

        public Builder() {
            super(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Builder c(Object obj) {
            obj.getClass();
            if (this.f16844d != null) {
                int iK = ImmutableSet.k(this.f16763b);
                Object[] objArr = this.f16844d;
                if (iK <= objArr.length) {
                    Objects.requireNonNull(objArr);
                    int length = this.f16844d.length - 1;
                    int iHashCode = obj.hashCode();
                    int iB = Hashing.b(iHashCode);
                    while (true) {
                        int i11 = iB & length;
                        Object[] objArr2 = this.f16844d;
                        Object obj2 = objArr2[i11];
                        if (obj2 == null) {
                            objArr2[i11] = obj;
                            this.f16845e += iHashCode;
                            super.c(obj);
                            return this;
                        }
                        if (obj2.equals(obj)) {
                            return this;
                        }
                        iB = i11 + 1;
                    }
                }
            }
            this.f16844d = null;
            super.c(obj);
            return this;
        }

        public Builder i(Object... objArr) {
            if (this.f16844d == null) {
                d(objArr.length, objArr);
                return this;
            }
            for (Object obj : objArr) {
                a(obj);
            }
            return this;
        }

        public Builder j(Iterable iterable) {
            iterable.getClass();
            if (this.f16844d == null) {
                e(iterable);
                return this;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public ImmutableSet k() {
            ImmutableSet immutableSetL;
            int i11 = this.f16763b;
            if (i11 == 0) {
                int i12 = ImmutableSet.f16842c;
                return RegularImmutableSet.L;
            }
            if (i11 == 1) {
                Object obj = this.f16762a[0];
                Objects.requireNonNull(obj);
                int i13 = ImmutableSet.f16842c;
                return new SingletonImmutableSet(obj);
            }
            if (this.f16844d == null || ImmutableSet.k(i11) != this.f16844d.length) {
                immutableSetL = ImmutableSet.l(this.f16763b, this.f16762a);
                this.f16763b = immutableSetL.size();
            } else {
                int i14 = this.f16763b;
                Object[] objArrCopyOf = this.f16762a;
                int length = objArrCopyOf.length;
                if (i14 < (length >> 1) + (length >> 2)) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i14);
                }
                int i15 = this.f16845e;
                Object[] objArr = this.f16844d;
                immutableSetL = new RegularImmutableSet(i15, objArr.length - 1, this.f16763b, objArrCopyOf, objArr);
            }
            this.f16764c = true;
            this.f16844d = null;
            return immutableSetL;
        }

        public Builder l(Builder builder) {
            if (this.f16844d == null) {
                d(builder.f16763b, builder.f16762a);
                return this;
            }
            for (int i11 = 0; i11 < builder.f16763b; i11++) {
                Object obj = builder.f16762a[i11];
                Objects.requireNonNull(obj);
                a(obj);
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f16846a;

        public SerializedForm(Object[] objArr) {
            this.f16846a = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.n(this.f16846a);
        }
    }

    public static int k(int i11) {
        int iMax = Math.max(i11, 2);
        if (iMax >= 751619276) {
            Preconditions.e("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static ImmutableSet l(int i11, Object... objArr) {
        if (i11 == 0) {
            return RegularImmutableSet.L;
        }
        if (i11 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new SingletonImmutableSet(obj);
        }
        int iK = k(i11);
        Object[] objArr2 = new Object[iK];
        int i12 = iK - 1;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            Object obj2 = objArr[i15];
            if (obj2 == null) {
                throw new NullPointerException(p.j(i15, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iB = Hashing.b(iHashCode);
            while (true) {
                int i16 = iB & i12;
                Object obj3 = objArr2[i16];
                if (obj3 == null) {
                    objArr[i14] = obj2;
                    objArr2[i16] = obj2;
                    i13 += iHashCode;
                    i14++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i14, i11, (Object) null);
        if (i14 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new SingletonImmutableSet(obj4);
        }
        if (k(i14) < iK / 2) {
            return l(i14, objArr);
        }
        int length = objArr.length;
        if (i14 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i14);
        }
        return new RegularImmutableSet(i13, i12, i14, objArr, objArr2);
    }

    public static ImmutableSet m(Collection collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) collection;
            if (!immutableSet.h()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return l(array.length, array);
    }

    public static ImmutableSet n(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? l(objArr.length, (Object[]) objArr.clone()) : new SingletonImmutableSet(objArr[0]);
        }
        return RegularImmutableSet.L;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ImmutableSet s() {
        return RegularImmutableSet.L;
    }

    public static ImmutableSet t(String str) {
        return new SingletonImmutableSet(str);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList b() {
        ImmutableList immutableList = this.f16843b;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList immutableListO = o();
        this.f16843b = immutableListO;
        return immutableListO;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && r() && ((ImmutableSet) obj).r() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.e(this);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public ImmutableList o() {
        Object[] array = toArray(ImmutableCollection.f16761a);
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        return ImmutableList.k(array.length, array);
    }

    public boolean r() {
        return this instanceof EmptyContiguousSet;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray(ImmutableCollection.f16761a));
    }
}
