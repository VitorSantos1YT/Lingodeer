package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
interface Writer {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class FieldOrder {
        private static final /* synthetic */ FieldOrder[] $VALUES;
        public static final FieldOrder ASCENDING;
        public static final FieldOrder DESCENDING;

        static {
            FieldOrder fieldOrder = new FieldOrder("ASCENDING", 0);
            ASCENDING = fieldOrder;
            FieldOrder fieldOrder2 = new FieldOrder("DESCENDING", 1);
            DESCENDING = fieldOrder2;
            $VALUES = new FieldOrder[]{fieldOrder, fieldOrder2};
        }

        public static FieldOrder valueOf(String str) {
            return (FieldOrder) java.lang.Enum.valueOf(FieldOrder.class, str);
        }

        public static FieldOrder[] values() {
            return (FieldOrder[]) $VALUES.clone();
        }
    }

    void A(int i11, long j11);

    void B(int i11, List list, boolean z11);

    void C(int i11, List list, boolean z11);

    void D(int i11, MapEntryLite.Metadata metadata, Map map);

    void E(int i11, List list, boolean z11);

    void F(int i11, List list, boolean z11);

    void G(int i11, long j11);

    void H(int i11, float f5);

    void I(int i11);

    void J(int i11, List list, boolean z11);

    void K(int i11, int i12);

    void L(int i11, List list, boolean z11);

    void M(int i11, List list, boolean z11);

    void N(int i11, List list, boolean z11);

    void O(int i11, int i12);

    void P(int i11, List list);

    void a(int i11, List list, Schema schema);

    void b(int i11, List list, Schema schema);

    void c(int i11, List list, boolean z11);

    void d(int i11, int i12);

    void e(int i11, Object obj);

    void f(int i11, int i12);

    void g(int i11, double d5);

    void h(int i11, List list, boolean z11);

    void i(int i11, List list, boolean z11);

    void j(int i11, Object obj, Schema schema);

    void k(int i11, long j11);

    FieldOrder l();

    void m(int i11, List list);

    void n(int i11, String str);

    void o(int i11, long j11);

    void p(int i11, Object obj);

    void q(int i11, List list, boolean z11);

    void r(int i11, long j11);

    void s(int i11, boolean z11);

    void t(int i11, Object obj, Schema schema);

    void u(int i11, int i12);

    void v(int i11);

    void w(int i11, ByteString byteString);

    void x(int i11, int i12);

    void y(int i11, List list, boolean z11);

    void z(int i11, List list, boolean z11);
}
