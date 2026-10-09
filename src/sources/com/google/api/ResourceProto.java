package com.google.api;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ResourceProto {
    static {
        DescriptorProtos.FieldOptions fieldOptionsF = DescriptorProtos.FieldOptions.F();
        ResourceReference resourceReferenceF = ResourceReference.F();
        ResourceReference resourceReferenceF2 = ResourceReference.F();
        WireFormat.FieldType fieldType = WireFormat.FieldType.MESSAGE;
        GeneratedMessageLite.C(fieldOptionsF, resourceReferenceF, resourceReferenceF2, 1055, fieldType);
        GeneratedMessageLite.B(DescriptorProtos.FileOptions.F(), ResourceDescriptor.F(), null, 1053, fieldType, false);
        GeneratedMessageLite.C(DescriptorProtos.MessageOptions.F(), ResourceDescriptor.F(), ResourceDescriptor.F(), 1053, fieldType);
    }

    private ResourceProto() {
    }
}
