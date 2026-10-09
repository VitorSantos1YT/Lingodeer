package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
abstract class ListFieldSchema {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ListFieldSchemaFull f21300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ListFieldSchemaLite f21301b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ListFieldSchemaFull extends ListFieldSchema {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class f21302c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private ListFieldSchemaFull() {
            super(0);
        }

        public static List d(long j11, Object obj, int i11) {
            List listA;
            List list = (List) UnsafeUtil.f21417c.m(j11, obj);
            if (list.isEmpty()) {
                if (list instanceof LazyStringList) {
                    listA = new LazyStringArrayList(i11);
                } else {
                    listA = ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).a(i11) : new ArrayList(i11);
                }
                UnsafeUtil.r(obj, j11, listA);
                return listA;
            }
            if (f21302c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i11);
                arrayList.addAll(list);
                UnsafeUtil.r(obj, j11, arrayList);
                return arrayList;
            }
            if (list instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(list.size() + i11);
                lazyStringArrayList.addAll((UnmodifiableLazyStringList) list);
                UnsafeUtil.r(obj, j11, lazyStringArrayList);
                return lazyStringArrayList;
            }
            if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (!protobufList.y1()) {
                    Internal.ProtobufList protobufListA = protobufList.a(list.size() + i11);
                    UnsafeUtil.r(obj, j11, protobufListA);
                    return protobufListA;
                }
            }
            return list;
        }

        @Override // com.google.protobuf.ListFieldSchema
        public final void a(long j11, Object obj) {
            Object objUnmodifiableList;
            List list = (List) UnsafeUtil.f21417c.m(j11, obj);
            if (list instanceof LazyStringList) {
                objUnmodifiableList = ((LazyStringList) list).X0();
            } else {
                if (f21302c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.y1()) {
                        protobufList.B();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            UnsafeUtil.r(obj, j11, objUnmodifiableList);
        }

        @Override // com.google.protobuf.ListFieldSchema
        public final void b(Object obj, long j11, Object obj2) {
            List list = (List) UnsafeUtil.f21417c.m(j11, obj2);
            List listD = d(j11, obj, list.size());
            int size = listD.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listD.addAll(list);
            }
            if (size > 0) {
                list = listD;
            }
            UnsafeUtil.r(obj, j11, list);
        }

        @Override // com.google.protobuf.ListFieldSchema
        public final List c(long j11, Object obj) {
            return d(j11, obj, 10);
        }

        public /* synthetic */ ListFieldSchemaFull(int i11) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ListFieldSchemaLite extends ListFieldSchema {
        private ListFieldSchemaLite() {
            super(0);
        }

        @Override // com.google.protobuf.ListFieldSchema
        public final void a(long j11, Object obj) {
            ((Internal.ProtobufList) UnsafeUtil.f21417c.m(j11, obj)).B();
        }

        @Override // com.google.protobuf.ListFieldSchema
        public final void b(Object obj, long j11, Object obj2) {
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f21417c;
            Internal.ProtobufList protobufListA = (Internal.ProtobufList) memoryAccessor.m(j11, obj);
            Internal.ProtobufList protobufList = (Internal.ProtobufList) memoryAccessor.m(j11, obj2);
            int size = protobufListA.size();
            int size2 = protobufList.size();
            if (size > 0 && size2 > 0) {
                if (!protobufListA.y1()) {
                    protobufListA = protobufListA.a(size2 + size);
                }
                protobufListA.addAll(protobufList);
            }
            if (size > 0) {
                protobufList = protobufListA;
            }
            UnsafeUtil.r(obj, j11, protobufList);
        }

        @Override // com.google.protobuf.ListFieldSchema
        public final List c(long j11, Object obj) {
            Internal.ProtobufList protobufList = (Internal.ProtobufList) UnsafeUtil.f21417c.m(j11, obj);
            if (protobufList.y1()) {
                return protobufList;
            }
            int size = protobufList.size();
            Internal.ProtobufList protobufListA = protobufList.a(size == 0 ? 10 : size * 2);
            UnsafeUtil.r(obj, j11, protobufListA);
            return protobufListA;
        }

        public /* synthetic */ ListFieldSchemaLite(int i11) {
            this();
        }
    }

    static {
        int i11 = 0;
        f21300a = new ListFieldSchemaFull(i11);
        f21301b = new ListFieldSchemaLite(i11);
    }

    public /* synthetic */ ListFieldSchema(int i11) {
        this();
    }

    public abstract void a(long j11, Object obj);

    public abstract void b(Object obj, long j11, Object obj2);

    public abstract List c(long j11, Object obj);

    private ListFieldSchema() {
    }
}
