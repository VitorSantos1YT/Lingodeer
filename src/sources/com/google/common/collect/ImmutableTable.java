package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = 912559;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @DoNotMock
    public static final class Builder<R, C, V> {
        public Builder() {
            new ArrayList();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f16874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object[] f16875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object[] f16876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f16877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f16878e;

        public SerializedForm(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.f16874a = objArr;
            this.f16875b = objArr2;
            this.f16876c = objArr3;
            this.f16877d = iArr;
            this.f16878e = iArr2;
        }

        public static SerializedForm a(ImmutableTable immutableTable, int[] iArr, int[] iArr2) {
            ImmutableSet immutableSetKeySet = immutableTable.f().keySet();
            Object[] objArr = ImmutableCollection.f16761a;
            return new SerializedForm(immutableSetKeySet.toArray(objArr), immutableTable.k().keySet().toArray(objArr), immutableTable.p().toArray(objArr), iArr, iArr2);
        }

        public Object readResolve() {
            Object[] objArr = this.f16876c;
            if (objArr.length == 0) {
                return SparseImmutableTable.f17202t;
            }
            int length = objArr.length;
            Object[] objArr2 = this.f16875b;
            Object[] objArr3 = this.f16874a;
            if (length == 1) {
                return new SingletonImmutableTable(objArr3[0], objArr2[0], objArr[0]);
            }
            ImmutableList.Builder builder = new ImmutableList.Builder(objArr.length);
            for (int i11 = 0; i11 < objArr.length; i11++) {
                builder.h(ImmutableTable.i(objArr3[this.f16877d[i11]], objArr2[this.f16878e[i11]], objArr[i11]));
            }
            ImmutableList immutableListJ = builder.j();
            ImmutableSet immutableSetN = ImmutableSet.n(objArr3);
            ImmutableSet immutableSetN2 = ImmutableSet.n(objArr2);
            return ((long) ((RegularImmutableList) immutableListJ).f17149d) > (((long) immutableSetN.size()) * ((long) immutableSetN2.size())) / 2 ? new DenseImmutableTable(immutableListJ, immutableSetN, immutableSetN2) : new SparseImmutableTable(immutableListJ, immutableSetN, immutableSetN2);
        }
    }

    public static Table.Cell i(Object obj, Object obj2, Object obj3) {
        Preconditions.k(obj, "rowKey");
        Preconditions.k(obj2, "columnKey");
        Preconditions.k(obj3, "value");
        Function function = Tables.f17261a;
        return new Tables.ImmutableCell(obj, obj2, obj3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public final Set A() {
        return (ImmutableSet) super.A();
    }

    @Override // com.google.common.collect.AbstractTable
    public final Iterator a() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractTable
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable
    public final boolean c(Object obj) {
        return ((ImmutableCollection) super.g()).contains(obj);
    }

    @Override // com.google.common.collect.AbstractTable
    public final Iterator h() {
        throw new AssertionError("should never be called");
    }

    public final ImmutableSet j() {
        return (ImmutableSet) super.A();
    }

    public abstract ImmutableMap k();

    @Override // com.google.common.collect.AbstractTable
    /* JADX INFO: renamed from: l */
    public abstract ImmutableSet d();

    @Override // com.google.common.collect.AbstractTable
    /* JADX INFO: renamed from: m */
    public abstract ImmutableCollection e();

    public Object n(Object obj, Object obj2) {
        Map map = (Map) Maps.g(obj, f());
        if (map == null) {
            return null;
        }
        try {
            return map.get(obj2);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.common.collect.Table
    /* JADX INFO: renamed from: o */
    public abstract ImmutableMap f();

    public final ImmutableCollection p() {
        return (ImmutableCollection) super.g();
    }

    public abstract Object writeReplace();
}
