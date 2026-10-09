package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
public interface MessageLite extends MessageLiteOrBuilder {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite O0();
    }

    GeneratedMessageLite.Builder a();

    void d(CodedOutputStream codedOutputStream);

    ByteString g();

    int h();

    GeneratedMessageLite.Builder i();

    Parser j();
}
