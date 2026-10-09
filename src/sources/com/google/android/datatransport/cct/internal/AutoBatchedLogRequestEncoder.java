package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AutoBatchedLogRequestEncoder implements Configurator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AutoBatchedLogRequestEncoder f7825a = new AutoBatchedLogRequestEncoder();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AndroidClientInfoEncoder implements ObjectEncoder<AndroidClientInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AndroidClientInfoEncoder f7826a = new AndroidClientInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f7827b = FieldDescriptor.a("sdkVersion");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f7828c = FieldDescriptor.a("model");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f7829d = FieldDescriptor.a("hardware");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f7830e = FieldDescriptor.a("device");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f7831f = FieldDescriptor.a("product");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f7832g = FieldDescriptor.a("osBuild");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f7833h = FieldDescriptor.a("manufacturer");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f7834i = FieldDescriptor.a("fingerprint");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final FieldDescriptor f7835j = FieldDescriptor.a("locale");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final FieldDescriptor f7836k = FieldDescriptor.a("country");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final FieldDescriptor f7837l = FieldDescriptor.a("mccMnc");
        public static final FieldDescriptor m = FieldDescriptor.a("applicationBuild");

        private AndroidClientInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f7827b, androidClientInfo.m());
            objectEncoderContext.g(f7828c, androidClientInfo.j());
            objectEncoderContext.g(f7829d, androidClientInfo.f());
            objectEncoderContext.g(f7830e, androidClientInfo.d());
            objectEncoderContext.g(f7831f, androidClientInfo.l());
            objectEncoderContext.g(f7832g, androidClientInfo.k());
            objectEncoderContext.g(f7833h, androidClientInfo.h());
            objectEncoderContext.g(f7834i, androidClientInfo.e());
            objectEncoderContext.g(f7835j, androidClientInfo.g());
            objectEncoderContext.g(f7836k, androidClientInfo.c());
            objectEncoderContext.g(f7837l, androidClientInfo.i());
            objectEncoderContext.g(m, androidClientInfo.b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class BatchedLogRequestEncoder implements ObjectEncoder<BatchedLogRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BatchedLogRequestEncoder f7838a = new BatchedLogRequestEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f7839b = FieldDescriptor.a("logRequest");

        private BatchedLogRequestEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).g(f7839b, ((BatchedLogRequest) obj).b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ClientInfoEncoder implements ObjectEncoder<ClientInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ClientInfoEncoder f7840a = new ClientInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f7841b = FieldDescriptor.a("clientType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f7842c = FieldDescriptor.a("androidClientInfo");

        private ClientInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ClientInfo clientInfo = (ClientInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f7841b, clientInfo.c());
            objectEncoderContext.g(f7842c, clientInfo.b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ComplianceDataEncoder implements ObjectEncoder<ComplianceData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ComplianceDataEncoder f7843a = new ComplianceDataEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f7844b = FieldDescriptor.a("privacyContext");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f7845c = FieldDescriptor.a("productIdOrigin");

        private ComplianceDataEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ComplianceData complianceData = (ComplianceData) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f7844b, complianceData.b());
            objectEncoderContext.g(f7845c, complianceData.c());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ExperimentIdsEncoder implements ObjectEncoder<ExperimentIds> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExperimentIdsEncoder f7846a = new ExperimentIdsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f7847b = FieldDescriptor.a("clearBlob");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f7848c = FieldDescriptor.a("encryptedBlob");

        private ExperimentIdsEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ExperimentIds experimentIds = (ExperimentIds) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f7847b, experimentIds.b());
            objectEncoderContext.g(f7848c, experimentIds.c());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ExternalPRequestContextEncoder implements ObjectEncoder<ExternalPRequestContext> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExternalPRequestContextEncoder f7849a = new ExternalPRequestContextEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f7850b = FieldDescriptor.a("originAssociatedProductId");

        private ExternalPRequestContextEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).g(f7850b, ((ExternalPRequestContext) obj).b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ExternalPrivacyContextEncoder implements ObjectEncoder<ExternalPrivacyContext> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExternalPrivacyContextEncoder f7851a = new ExternalPrivacyContextEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f7852b = FieldDescriptor.a("prequest");

        private ExternalPrivacyContextEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).g(f7852b, ((ExternalPrivacyContext) obj).b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LogEventEncoder implements ObjectEncoder<LogEvent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LogEventEncoder f7853a = new LogEventEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f7854b = FieldDescriptor.a("eventTimeMs");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f7855c = FieldDescriptor.a("eventCode");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f7856d = FieldDescriptor.a("complianceData");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f7857e = FieldDescriptor.a("eventUptimeMs");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f7858f = FieldDescriptor.a("sourceExtension");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f7859g = FieldDescriptor.a("sourceExtensionJsonProto3");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f7860h = FieldDescriptor.a("timezoneOffsetSeconds");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f7861i = FieldDescriptor.a("networkConnectionInfo");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final FieldDescriptor f7862j = FieldDescriptor.a("experimentIds");

        private LogEventEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            LogEvent logEvent = (LogEvent) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.b(f7854b, logEvent.c());
            objectEncoderContext.g(f7855c, logEvent.b());
            objectEncoderContext.g(f7856d, logEvent.a());
            objectEncoderContext.b(f7857e, logEvent.d());
            objectEncoderContext.g(f7858f, logEvent.g());
            objectEncoderContext.g(f7859g, logEvent.h());
            objectEncoderContext.b(f7860h, logEvent.i());
            objectEncoderContext.g(f7861i, logEvent.f());
            objectEncoderContext.g(f7862j, logEvent.e());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LogRequestEncoder implements ObjectEncoder<LogRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LogRequestEncoder f7863a = new LogRequestEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f7864b = FieldDescriptor.a("requestTimeMs");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f7865c = FieldDescriptor.a("requestUptimeMs");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f7866d = FieldDescriptor.a("clientInfo");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f7867e = FieldDescriptor.a("logSource");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f7868f = FieldDescriptor.a("logSourceName");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f7869g = FieldDescriptor.a("logEvent");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f7870h = FieldDescriptor.a("qosTier");

        private LogRequestEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            LogRequest logRequest = (LogRequest) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.b(f7864b, logRequest.g());
            objectEncoderContext.b(f7865c, logRequest.h());
            objectEncoderContext.g(f7866d, logRequest.b());
            objectEncoderContext.g(f7867e, logRequest.d());
            objectEncoderContext.g(f7868f, logRequest.e());
            objectEncoderContext.g(f7869g, logRequest.c());
            objectEncoderContext.g(f7870h, logRequest.f());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class NetworkConnectionInfoEncoder implements ObjectEncoder<NetworkConnectionInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NetworkConnectionInfoEncoder f7871a = new NetworkConnectionInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f7872b = FieldDescriptor.a("networkType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f7873c = FieldDescriptor.a("mobileSubtype");

        private NetworkConnectionInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f7872b, networkConnectionInfo.c());
            objectEncoderContext.g(f7873c, networkConnectionInfo.b());
        }
    }

    private AutoBatchedLogRequestEncoder() {
    }

    public final void a(EncoderConfig encoderConfig) {
        BatchedLogRequestEncoder batchedLogRequestEncoder = BatchedLogRequestEncoder.f7838a;
        JsonDataEncoderBuilder jsonDataEncoderBuilder = (JsonDataEncoderBuilder) encoderConfig;
        jsonDataEncoderBuilder.b(BatchedLogRequest.class, batchedLogRequestEncoder);
        jsonDataEncoderBuilder.b(AutoValue_BatchedLogRequest.class, batchedLogRequestEncoder);
        LogRequestEncoder logRequestEncoder = LogRequestEncoder.f7863a;
        jsonDataEncoderBuilder.b(LogRequest.class, logRequestEncoder);
        jsonDataEncoderBuilder.b(AutoValue_LogRequest.class, logRequestEncoder);
        ClientInfoEncoder clientInfoEncoder = ClientInfoEncoder.f7840a;
        jsonDataEncoderBuilder.b(ClientInfo.class, clientInfoEncoder);
        jsonDataEncoderBuilder.b(AutoValue_ClientInfo.class, clientInfoEncoder);
        AndroidClientInfoEncoder androidClientInfoEncoder = AndroidClientInfoEncoder.f7826a;
        jsonDataEncoderBuilder.b(AndroidClientInfo.class, androidClientInfoEncoder);
        jsonDataEncoderBuilder.b(AutoValue_AndroidClientInfo.class, androidClientInfoEncoder);
        LogEventEncoder logEventEncoder = LogEventEncoder.f7853a;
        jsonDataEncoderBuilder.b(LogEvent.class, logEventEncoder);
        jsonDataEncoderBuilder.b(AutoValue_LogEvent.class, logEventEncoder);
        ComplianceDataEncoder complianceDataEncoder = ComplianceDataEncoder.f7843a;
        jsonDataEncoderBuilder.b(ComplianceData.class, complianceDataEncoder);
        jsonDataEncoderBuilder.b(AutoValue_ComplianceData.class, complianceDataEncoder);
        ExternalPrivacyContextEncoder externalPrivacyContextEncoder = ExternalPrivacyContextEncoder.f7851a;
        jsonDataEncoderBuilder.b(ExternalPrivacyContext.class, externalPrivacyContextEncoder);
        jsonDataEncoderBuilder.b(AutoValue_ExternalPrivacyContext.class, externalPrivacyContextEncoder);
        ExternalPRequestContextEncoder externalPRequestContextEncoder = ExternalPRequestContextEncoder.f7849a;
        jsonDataEncoderBuilder.b(ExternalPRequestContext.class, externalPRequestContextEncoder);
        jsonDataEncoderBuilder.b(AutoValue_ExternalPRequestContext.class, externalPRequestContextEncoder);
        NetworkConnectionInfoEncoder networkConnectionInfoEncoder = NetworkConnectionInfoEncoder.f7871a;
        jsonDataEncoderBuilder.b(NetworkConnectionInfo.class, networkConnectionInfoEncoder);
        jsonDataEncoderBuilder.b(AutoValue_NetworkConnectionInfo.class, networkConnectionInfoEncoder);
        ExperimentIdsEncoder experimentIdsEncoder = ExperimentIdsEncoder.f7846a;
        jsonDataEncoderBuilder.b(ExperimentIds.class, experimentIdsEncoder);
        jsonDataEncoderBuilder.b(AutoValue_ExperimentIds.class, experimentIdsEncoder);
    }
}
