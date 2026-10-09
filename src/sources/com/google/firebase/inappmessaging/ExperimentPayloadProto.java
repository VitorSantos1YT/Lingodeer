package com.google.firebase.inappmessaging;

import androidx.drawerlayout.widget.ktFt.FpIL;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ExperimentPayloadProto {

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.ExperimentPayloadProto$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19699a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19699a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19699a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19699a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19699a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19699a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19699a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19699a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ExperimentLite extends GeneratedMessageLite<ExperimentLite, Builder> implements ExperimentLiteOrBuilder {
        private static final ExperimentLite DEFAULT_INSTANCE;
        public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
        private static volatile Parser<ExperimentLite> PARSER;
        private String experimentId_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder extends GeneratedMessageLite.Builder<ExperimentLite, Builder> implements ExperimentLiteOrBuilder {
            public /* synthetic */ Builder(int i11) {
                this();
            }

            private Builder() {
                super(ExperimentLite.DEFAULT_INSTANCE);
            }
        }

        static {
            ExperimentLite experimentLite = new ExperimentLite();
            DEFAULT_INSTANCE = experimentLite;
            GeneratedMessageLite.D(ExperimentLite.class, experimentLite);
        }

        private ExperimentLite() {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object q(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (AnonymousClass1.f19699a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ExperimentLite();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.z(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"experimentId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ExperimentLite> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ExperimentLite.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ExperimentLiteOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ExperimentPayload extends GeneratedMessageLite<ExperimentPayload, Builder> implements ExperimentPayloadOrBuilder {
        public static final int ACTIVATE_EVENT_TO_LOG_FIELD_NUMBER = 8;
        public static final int CLEAR_EVENT_TO_LOG_FIELD_NUMBER = 9;
        private static final ExperimentPayload DEFAULT_INSTANCE;
        public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
        public static final int EXPERIMENT_START_TIME_MILLIS_FIELD_NUMBER = 3;
        public static final int ONGOING_EXPERIMENTS_FIELD_NUMBER = 13;
        public static final int OVERFLOW_POLICY_FIELD_NUMBER = 12;
        private static volatile Parser<ExperimentPayload> PARSER = null;
        public static final int SET_EVENT_TO_LOG_FIELD_NUMBER = 7;
        public static final int TIMEOUT_EVENT_TO_LOG_FIELD_NUMBER = 10;
        public static final int TIME_TO_LIVE_MILLIS_FIELD_NUMBER = 6;
        public static final int TRIGGER_EVENT_FIELD_NUMBER = 4;
        public static final int TRIGGER_TIMEOUT_MILLIS_FIELD_NUMBER = 5;
        public static final int TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER = 11;
        public static final int VARIANT_ID_FIELD_NUMBER = 2;
        private long experimentStartTimeMillis_;
        private int overflowPolicy_;
        private long timeToLiveMillis_;
        private long triggerTimeoutMillis_;
        private String experimentId_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        private String variantId_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        private String triggerEvent_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        private String setEventToLog_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        private String activateEventToLog_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        private String clearEventToLog_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        private String timeoutEventToLog_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        private String ttlExpiryEventToLog_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        private Internal.ProtobufList<ExperimentLite> ongoingExperiments_ = GeneratedMessageLite.t();

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder extends GeneratedMessageLite.Builder<ExperimentPayload, Builder> implements ExperimentPayloadOrBuilder {
            public /* synthetic */ Builder(int i11) {
                this();
            }

            private Builder() {
                super(ExperimentPayload.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public enum ExperimentOverflowPolicy implements Internal.EnumLite {
            POLICY_UNSPECIFIED(0),
            DISCARD_OLDEST(1),
            IGNORE_NEWEST(2),
            UNRECOGNIZED(-1);

            public static final int DISCARD_OLDEST_VALUE = 1;
            public static final int IGNORE_NEWEST_VALUE = 2;
            public static final int POLICY_UNSPECIFIED_VALUE = 0;
            private static final Internal.EnumLiteMap<ExperimentOverflowPolicy> internalValueMap = new Internal.EnumLiteMap<ExperimentOverflowPolicy>() { // from class: com.google.firebase.inappmessaging.ExperimentPayloadProto.ExperimentPayload.ExperimentOverflowPolicy.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite a(int i11) {
                    if (i11 == 0) {
                        return ExperimentOverflowPolicy.POLICY_UNSPECIFIED;
                    }
                    if (i11 == 1) {
                        return ExperimentOverflowPolicy.DISCARD_OLDEST;
                    }
                    if (i11 == 2) {
                        return ExperimentOverflowPolicy.IGNORE_NEWEST;
                    }
                    ExperimentOverflowPolicy experimentOverflowPolicy = ExperimentOverflowPolicy.POLICY_UNSPECIFIED;
                    return null;
                }
            };
            private final int value;

            /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
            public static final class ExperimentOverflowPolicyVerifier implements Internal.EnumVerifier {
                static {
                    new ExperimentOverflowPolicyVerifier();
                }

                private ExperimentOverflowPolicyVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean a(int i11) {
                    ExperimentOverflowPolicy experimentOverflowPolicy;
                    if (i11 == 0) {
                        experimentOverflowPolicy = ExperimentOverflowPolicy.POLICY_UNSPECIFIED;
                    } else if (i11 == 1) {
                        experimentOverflowPolicy = ExperimentOverflowPolicy.DISCARD_OLDEST;
                    } else if (i11 != 2) {
                        ExperimentOverflowPolicy experimentOverflowPolicy2 = ExperimentOverflowPolicy.POLICY_UNSPECIFIED;
                        experimentOverflowPolicy = null;
                    } else {
                        experimentOverflowPolicy = ExperimentOverflowPolicy.IGNORE_NEWEST;
                    }
                    return experimentOverflowPolicy != null;
                }
            }

            ExperimentOverflowPolicy(int i11) {
                this.value = i11;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int d() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException(FpIL.XTFOUod);
            }
        }

        static {
            ExperimentPayload experimentPayload = new ExperimentPayload();
            DEFAULT_INSTANCE = experimentPayload;
            GeneratedMessageLite.D(ExperimentPayload.class, experimentPayload);
        }

        private ExperimentPayload() {
        }

        public static ExperimentPayload F() {
            return DEFAULT_INSTANCE;
        }

        public final String G() {
            return this.experimentId_;
        }

        public final long H() {
            return this.experimentStartTimeMillis_;
        }

        public final long I() {
            return this.timeToLiveMillis_;
        }

        public final String J() {
            return this.triggerEvent_;
        }

        public final long K() {
            return this.triggerTimeoutMillis_;
        }

        public final String L() {
            return this.variantId_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object q(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (AnonymousClass1.f19699a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ExperimentPayload();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.z(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005\u0002\u0006\u0002\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\f\f\r\u001b", new Object[]{"experimentId_", "variantId_", "experimentStartTimeMillis_", "triggerEvent_", "triggerTimeoutMillis_", "timeToLiveMillis_", "setEventToLog_", "activateEventToLog_", "clearEventToLog_", "timeoutEventToLog_", "ttlExpiryEventToLog_", "overflowPolicy_", "ongoingExperiments_", ExperimentLite.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ExperimentPayload> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ExperimentPayload.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ExperimentPayloadOrBuilder extends MessageLiteOrBuilder {
    }

    private ExperimentPayloadProto() {
    }
}
