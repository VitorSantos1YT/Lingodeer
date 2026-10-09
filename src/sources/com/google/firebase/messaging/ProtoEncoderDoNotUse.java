package com.google.firebase.messaging;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Encodable
public abstract class ProtoEncoderDoNotUse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProtobufEncoder f20503a;

    static {
        ProtobufEncoder.Builder builder = new ProtobufEncoder.Builder();
        AutoProtoEncoderDoNotUseEncoder.f20429a.getClass();
        builder.a(ProtoEncoderDoNotUse.class, AutoProtoEncoderDoNotUseEncoder.ProtoEncoderDoNotUseEncoder.f20447a);
        builder.a(MessagingClientEventExtension.class, AutoProtoEncoderDoNotUseEncoder.MessagingClientEventExtensionEncoder.f20445a);
        builder.a(MessagingClientEvent.class, AutoProtoEncoderDoNotUseEncoder.MessagingClientEventEncoder.f20430a);
        f20503a = new ProtobufEncoder(new HashMap(builder.f19662a), new HashMap(builder.f19663b), builder.f19664c);
    }

    private ProtoEncoderDoNotUse() {
    }

    public abstract MessagingClientEventExtension a();
}
