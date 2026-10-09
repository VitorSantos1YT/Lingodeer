package com.google.api;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ClientProto {
    static {
        DescriptorProtos.MethodOptions methodOptionsF = DescriptorProtos.MethodOptions.F();
        WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
        GeneratedMessageLite.B(methodOptionsF, null, null, 1051, fieldType, false);
        GeneratedMessageLite.C(DescriptorProtos.ServiceOptions.F(), BuildConfig.VERSION_NAME, null, 1049, fieldType);
        GeneratedMessageLite.C(DescriptorProtos.ServiceOptions.F(), BuildConfig.VERSION_NAME, null, 1050, fieldType);
    }

    private ClientProto() {
    }
}
