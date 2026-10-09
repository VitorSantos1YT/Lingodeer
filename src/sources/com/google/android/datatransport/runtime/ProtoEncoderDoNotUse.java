package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Encodable
public abstract class ProtoEncoderDoNotUse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProtobufEncoder f8021a;

    static {
        ProtobufEncoder.Builder builder = new ProtobufEncoder.Builder();
        AutoProtoEncoderDoNotUseEncoder.f7952a.getClass();
        builder.a(ProtoEncoderDoNotUse.class, AutoProtoEncoderDoNotUseEncoder.ProtoEncoderDoNotUseEncoder.f7966a);
        builder.a(ClientMetrics.class, AutoProtoEncoderDoNotUseEncoder.ClientMetricsEncoder.f7953a);
        builder.a(TimeWindow.class, AutoProtoEncoderDoNotUseEncoder.TimeWindowEncoder.f7971a);
        builder.a(LogSourceMetrics.class, AutoProtoEncoderDoNotUseEncoder.LogSourceMetricsEncoder.f7963a);
        builder.a(LogEventDropped.class, AutoProtoEncoderDoNotUseEncoder.LogEventDroppedEncoder.f7960a);
        builder.a(GlobalMetrics.class, AutoProtoEncoderDoNotUseEncoder.GlobalMetricsEncoder.f7958a);
        builder.a(StorageMetrics.class, AutoProtoEncoderDoNotUseEncoder.StorageMetricsEncoder.f7968a);
        f8021a = new ProtobufEncoder(new HashMap(builder.f19662a), new HashMap(builder.f19663b), builder.f19664c);
    }

    private ProtoEncoderDoNotUse() {
    }

    public abstract ClientMetrics a();
}
