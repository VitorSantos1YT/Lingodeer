package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Tables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Function f17261a = new Function<Map<Object, Object>, Map<Object, Object>>() { // from class: com.google.common.collect.Tables.1
        @Override // com.google.common.base.Function
        public final Map<Object, Object> apply(Map<Object, Object> map) {
            return Collections.unmodifiableMap(map);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class AbstractCell<R, C, V> implements Table.Cell<R, C, V> {
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Table.Cell) {
                Table.Cell cell = (Table.Cell) obj;
                if (Objects.a(b(), cell.b()) && Objects.a(a(), cell.a()) && Objects.a(getValue(), cell.getValue())) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{b(), a(), getValue()});
        }

        public final String toString() {
            return "(" + b() + "," + a() + ")=" + getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ImmutableCell<R, C, V> extends AbstractCell<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f17262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f17263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f17264c;

        public ImmutableCell(Object obj, Object obj2, Object obj3) {
            this.f17262a = obj;
            this.f17263b = obj2;
            this.f17264c = obj3;
        }

        @Override // com.google.common.collect.Table.Cell
        public final Object a() {
            return this.f17263b;
        }

        @Override // com.google.common.collect.Table.Cell
        public final Object b() {
            return this.f17262a;
        }

        @Override // com.google.common.collect.Table.Cell
        public final Object getValue() {
            return this.f17264c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class TransformedTable<R, C, V1, V2> extends AbstractTable<R, C, V2> {

        /* JADX INFO: renamed from: com.google.common.collect.Tables$TransformedTable$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 implements Function<Table.Cell<Object, Object, Object>, Table.Cell<Object, Object, Object>> {
            @Override // com.google.common.base.Function
            public final Table.Cell<Object, Object, Object> apply(Table.Cell<Object, Object, Object> cell) {
                Table.Cell<Object, Object, Object> cell2 = cell;
                cell2.b();
                cell2.a();
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.Tables$TransformedTable$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass2 implements Function<Map<Object, Object>, Map<Object, Object>> {
            @Override // com.google.common.base.Function
            public final Map<Object, Object> apply(Map<Object, Object> map) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.Tables$TransformedTable$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass3 implements Function<Map<Object, Object>, Map<Object, Object>> {
            @Override // com.google.common.base.Function
            public final Map<Object, Object> apply(Map<Object, Object> map) {
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractTable
        public final Iterator a() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractTable
        public final void b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractTable
        public final Collection e() {
            throw null;
        }

        @Override // com.google.common.collect.Table
        public final Map f() {
            throw null;
        }

        @Override // com.google.common.collect.Table
        public final int size() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class TransposeTable<C, R, V> extends AbstractTable<C, R, V> {
        @Override // com.google.common.collect.AbstractTable
        public final Iterator a() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractTable
        public final void b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractTable
        public final boolean c(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Table
        public final Map f() {
            throw null;
        }

        @Override // com.google.common.collect.Table
        public final int size() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class UnmodifiableTable<R, C, V> extends ForwardingTable<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public final Set A() {
            return Collections.unmodifiableSet(super.A());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map f() {
            return Collections.unmodifiableMap(Maps.i(super.f(), Tables.f17261a));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: j0 */
        public /* bridge */ /* synthetic */ Object o0() {
            return null;
        }
    }

    private Tables() {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class UnmodifiableRowSortedMap<R, C, V> extends UnmodifiableTable<R, C, V> implements RowSortedTable<R, C, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public final Map f() {
            Function function = Tables.f17261a;
            throw null;
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: j0 */
        public final /* bridge */ /* synthetic */ Object o0() {
            return null;
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public final SortedMap f() {
            Function function = Tables.f17261a;
            throw null;
        }
    }
}
