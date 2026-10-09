package com.google.android.datatransport.runtime;

import b7.e0;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.proto.AtProtobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AutoProtoEncoderDoNotUseEncoder f7952a = new AutoProtoEncoderDoNotUseEncoder();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ClientMetricsEncoder implements ObjectEncoder<ClientMetrics> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ClientMetricsEncoder f7953a = new ClientMetricsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f7954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f7955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f7956d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f7957e;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("window");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f19643a = 1;
            f7954b = e0.h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("logSourceMetrics");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f19643a = 2;
            f7955c = e0.h(atProtobuf2, builder2);
            FieldDescriptor.Builder builder3 = new FieldDescriptor.Builder("globalMetrics");
            AtProtobuf atProtobuf3 = new AtProtobuf();
            atProtobuf3.f19643a = 3;
            f7956d = e0.h(atProtobuf3, builder3);
            FieldDescriptor.Builder builder4 = new FieldDescriptor.Builder("appNamespace");
            AtProtobuf atProtobuf4 = new AtProtobuf();
            atProtobuf4.f19643a = 4;
            f7957e = e0.h(atProtobuf4, builder4);
        }

        private ClientMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ClientMetrics clientMetrics = (ClientMetrics) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f7954b, clientMetrics.f8070a);
            objectEncoderContext.g(f7955c, clientMetrics.f8071b);
            objectEncoderContext.g(f7956d, clientMetrics.f8072c);
            objectEncoderContext.g(f7957e, clientMetrics.f8073d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class GlobalMetricsEncoder implements ObjectEncoder<GlobalMetrics> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GlobalMetricsEncoder f7958a = new GlobalMetricsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f7959b;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("storageMetrics");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f19643a = 1;
            f7959b = e0.h(atProtobuf, builder);
        }

        private GlobalMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).g(f7959b, ((GlobalMetrics) obj).f8079a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LogEventDroppedEncoder implements ObjectEncoder<LogEventDropped> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LogEventDroppedEncoder f7960a = new LogEventDroppedEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f7961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f7962c;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("eventsDroppedCount");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f19643a = 1;
            f7961b = e0.h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("reason");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f19643a = 3;
            f7962c = e0.h(atProtobuf2, builder2);
        }

        private LogEventDroppedEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            LogEventDropped logEventDropped = (LogEventDropped) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.b(f7961b, logEventDropped.f8082a);
            objectEncoderContext.g(f7962c, logEventDropped.f8083b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LogSourceMetricsEncoder implements ObjectEncoder<LogSourceMetrics> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LogSourceMetricsEncoder f7963a = new LogSourceMetricsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f7964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f7965c;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("logSource");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f19643a = 1;
            f7964b = e0.h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("logEventDropped");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f19643a = 2;
            f7965c = e0.h(atProtobuf2, builder2);
        }

        private LogSourceMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            LogSourceMetrics logSourceMetrics = (LogSourceMetrics) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f7964b, logSourceMetrics.f8087a);
            objectEncoderContext.g(f7965c, logSourceMetrics.f8088b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProtoEncoderDoNotUseEncoder f7966a = new ProtoEncoderDoNotUseEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f7967b = FieldDescriptor.a("clientMetrics");

        private ProtoEncoderDoNotUseEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).g(f7967b, ((ProtoEncoderDoNotUse) obj).a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class StorageMetricsEncoder implements ObjectEncoder<StorageMetrics> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StorageMetricsEncoder f7968a = new StorageMetricsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f7969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f7970c;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("currentCacheSizeBytes");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f19643a = 1;
            f7969b = e0.h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("maxCacheSizeBytes");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f19643a = 2;
            f7970c = e0.h(atProtobuf2, builder2);
        }

        private StorageMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            StorageMetrics storageMetrics = (StorageMetrics) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.b(f7969b, storageMetrics.f8092a);
            objectEncoderContext.b(f7970c, storageMetrics.f8093b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class TimeWindowEncoder implements ObjectEncoder<TimeWindow> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimeWindowEncoder f7971a = new TimeWindowEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f7972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f7973c;

        static {
            FieldDescriptor.Builder builder = new FieldDescriptor.Builder("startMs");
            AtProtobuf atProtobuf = new AtProtobuf();
            atProtobuf.f19643a = 1;
            f7972b = e0.h(atProtobuf, builder);
            FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("endMs");
            AtProtobuf atProtobuf2 = new AtProtobuf();
            atProtobuf2.f19643a = 2;
            f7973c = e0.h(atProtobuf2, builder2);
        }

        private TimeWindowEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            TimeWindow timeWindow = (TimeWindow) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.b(f7972b, timeWindow.f8097a);
            objectEncoderContext.b(f7973c, timeWindow.f8098b);
        }
    }

    private AutoProtoEncoderDoNotUseEncoder() {
    }
}
