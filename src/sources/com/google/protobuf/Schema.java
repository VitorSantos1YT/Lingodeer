package com.google.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
public interface Schema<T> {
    void a(Object obj, Object obj2);

    void b(Object obj);

    boolean c(Object obj);

    Object d();

    void e(Object obj, Writer writer);

    void f(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite);

    int g(GeneratedMessageLite generatedMessageLite);

    boolean h(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2);

    int i(AbstractMessageLite abstractMessageLite);
}
