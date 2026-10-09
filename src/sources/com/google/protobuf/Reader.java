package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
interface Reader {
    Object A(Class cls, ExtensionRegistryLite extensionRegistryLite);

    int B();

    void C(List list);

    void D(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    void E(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite);

    void F(List list);

    ByteString G();

    void H(List list);

    int I();

    boolean J();

    int K();

    void L(List list);

    void M(List list);

    long N();

    String O();

    void P(List list);

    void a(List list);

    long b();

    long c();

    void d(List list);

    void e(List list);

    void f(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    void g(List list);

    Object h(Class cls, ExtensionRegistryLite extensionRegistryLite);

    void i(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    int j();

    boolean k();

    void l(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    long m();

    void n(List list);

    int o();

    void p(List list);

    void q(List list);

    void r(List list);

    double readDouble();

    float readFloat();

    void s(List list);

    int t();

    int u();

    void v(List list);

    int w();

    long x();

    void y(List list);

    String z();
}
