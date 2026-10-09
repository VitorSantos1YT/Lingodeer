package com.google.internal.firebase.inappmessaging.v1;

import com.google.firebase.inappmessaging.CommonTypesProto;
import com.google.firebase.inappmessaging.ExperimentPayloadProto;
import com.google.firebase.inappmessaging.MessagesProto;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CampaignProto {

    /* JADX INFO: renamed from: com.google.internal.firebase.inappmessaging.v1.CampaignProto$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21123a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21123a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21123a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21123a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21123a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21123a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21123a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21123a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ExperimentalCampaignPayload extends GeneratedMessageLite<ExperimentalCampaignPayload, Builder> implements ExperimentalCampaignPayloadOrBuilder {
        public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
        public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
        public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
        public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
        private static final ExperimentalCampaignPayload DEFAULT_INSTANCE;
        public static final int EXPERIMENT_PAYLOAD_FIELD_NUMBER = 2;
        private static volatile Parser<ExperimentalCampaignPayload> PARSER;
        private int bitField0_;
        private long campaignEndTimeMillis_;
        private String campaignId_ = BuildConfig.VERSION_NAME;
        private String campaignName_ = BuildConfig.VERSION_NAME;
        private long campaignStartTimeMillis_;
        private ExperimentPayloadProto.ExperimentPayload experimentPayload_;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder extends GeneratedMessageLite.Builder<ExperimentalCampaignPayload, Builder> implements ExperimentalCampaignPayloadOrBuilder {
            public /* synthetic */ Builder(int i11) {
                this();
            }

            private Builder() {
                super(ExperimentalCampaignPayload.DEFAULT_INSTANCE);
            }
        }

        static {
            ExperimentalCampaignPayload experimentalCampaignPayload = new ExperimentalCampaignPayload();
            DEFAULT_INSTANCE = experimentalCampaignPayload;
            GeneratedMessageLite.D(ExperimentalCampaignPayload.class, experimentalCampaignPayload);
        }

        private ExperimentalCampaignPayload() {
        }

        public static ExperimentalCampaignPayload J() {
            return DEFAULT_INSTANCE;
        }

        public final long F() {
            return this.campaignEndTimeMillis_;
        }

        public final String G() {
            return this.campaignId_;
        }

        public final String H() {
            return this.campaignName_;
        }

        public final long I() {
            return this.campaignStartTimeMillis_;
        }

        public final ExperimentPayloadProto.ExperimentPayload K() {
            ExperimentPayloadProto.ExperimentPayload experimentPayload = this.experimentPayload_;
            return experimentPayload == null ? ExperimentPayloadProto.ExperimentPayload.F() : experimentPayload;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object q(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (AnonymousClass1.f21123a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ExperimentalCampaignPayload();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.z(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"bitField0_", "campaignId_", "experimentPayload_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ExperimentalCampaignPayload> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ExperimentalCampaignPayload.class) {
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
    public interface ExperimentalCampaignPayloadOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ExperimentalCampaignRollout extends GeneratedMessageLite<ExperimentalCampaignRollout, Builder> implements ExperimentalCampaignRolloutOrBuilder {
        private static final ExperimentalCampaignRollout DEFAULT_INSTANCE;
        public static final int END_TIME_FIELD_NUMBER = 5;
        public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
        private static volatile Parser<ExperimentalCampaignRollout> PARSER = null;
        public static final int PRIORITY_FIELD_NUMBER = 3;
        public static final int SELECTED_VARIANT_INDEX_FIELD_NUMBER = 2;
        public static final int START_TIME_FIELD_NUMBER = 4;
        private int bitField0_;
        private CommonTypesProto.CampaignTime endTime_;
        private String experimentId_ = BuildConfig.VERSION_NAME;
        private CommonTypesProto.Priority priority_;
        private int selectedVariantIndex_;
        private CommonTypesProto.CampaignTime startTime_;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder extends GeneratedMessageLite.Builder<ExperimentalCampaignRollout, Builder> implements ExperimentalCampaignRolloutOrBuilder {
            public /* synthetic */ Builder(int i11) {
                this();
            }

            private Builder() {
                super(ExperimentalCampaignRollout.DEFAULT_INSTANCE);
            }
        }

        static {
            ExperimentalCampaignRollout experimentalCampaignRollout = new ExperimentalCampaignRollout();
            DEFAULT_INSTANCE = experimentalCampaignRollout;
            GeneratedMessageLite.D(ExperimentalCampaignRollout.class, experimentalCampaignRollout);
        }

        private ExperimentalCampaignRollout() {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object q(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (AnonymousClass1.f21123a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ExperimentalCampaignRollout();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.z(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "experimentId_", "selectedVariantIndex_", "priority_", "startTime_", "endTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ExperimentalCampaignRollout> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ExperimentalCampaignRollout.class) {
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
    public interface ExperimentalCampaignRolloutOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ThickContent extends GeneratedMessageLite<ThickContent, Builder> implements ThickContentOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 3;
        public static final int DATA_BUNDLE_FIELD_NUMBER = 8;
        private static final ThickContent DEFAULT_INSTANCE;
        public static final int EXPERIMENTAL_PAYLOAD_FIELD_NUMBER = 2;
        public static final int IS_TEST_CAMPAIGN_FIELD_NUMBER = 7;
        private static volatile Parser<ThickContent> PARSER = null;
        public static final int PRIORITY_FIELD_NUMBER = 4;
        public static final int TRIGGERING_CONDITIONS_FIELD_NUMBER = 5;
        public static final int VANILLA_PAYLOAD_FIELD_NUMBER = 1;
        private int bitField0_;
        private MessagesProto.Content content_;
        private boolean isTestCampaign_;
        private Object payload_;
        private CommonTypesProto.Priority priority_;
        private int payloadCase_ = 0;
        private MapFieldLite<String, String> dataBundle_ = MapFieldLite.f21317b;
        private Internal.ProtobufList<CommonTypesProto.TriggeringCondition> triggeringConditions_ = GeneratedMessageLite.t();

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder extends GeneratedMessageLite.Builder<ThickContent, Builder> implements ThickContentOrBuilder {
            public /* synthetic */ Builder(int i11) {
                this();
            }

            private Builder() {
                super(ThickContent.DEFAULT_INSTANCE);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class DataBundleDefaultEntryHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final MapEntryLite f21124a;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                f21124a = new MapEntryLite(fieldType, fieldType, BuildConfig.VERSION_NAME);
            }

            private DataBundleDefaultEntryHolder() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public enum PayloadCase {
            VANILLA_PAYLOAD(1),
            EXPERIMENTAL_PAYLOAD(2),
            PAYLOAD_NOT_SET(0);

            private final int value;

            PayloadCase(int i11) {
                this.value = i11;
            }
        }

        static {
            ThickContent thickContent = new ThickContent();
            DEFAULT_INSTANCE = thickContent;
            GeneratedMessageLite.D(ThickContent.class, thickContent);
        }

        private ThickContent() {
        }

        public final MessagesProto.Content F() {
            MessagesProto.Content content = this.content_;
            return content == null ? MessagesProto.Content.H() : content;
        }

        public final Map G() {
            return Collections.unmodifiableMap(this.dataBundle_);
        }

        public final ExperimentalCampaignPayload H() {
            return this.payloadCase_ == 2 ? (ExperimentalCampaignPayload) this.payload_ : ExperimentalCampaignPayload.J();
        }

        public final boolean I() {
            return this.isTestCampaign_;
        }

        public final PayloadCase J() {
            int i11 = this.payloadCase_;
            if (i11 == 0) {
                return PayloadCase.PAYLOAD_NOT_SET;
            }
            if (i11 == 1) {
                return PayloadCase.VANILLA_PAYLOAD;
            }
            if (i11 != 2) {
                return null;
            }
            return PayloadCase.EXPERIMENTAL_PAYLOAD;
        }

        public final CommonTypesProto.Priority K() {
            CommonTypesProto.Priority priority = this.priority_;
            return priority == null ? CommonTypesProto.Priority.F() : priority;
        }

        public final Internal.ProtobufList L() {
            return this.triggeringConditions_;
        }

        public final VanillaCampaignPayload M() {
            return this.payloadCase_ == 1 ? (VanillaCampaignPayload) this.payload_ : VanillaCampaignPayload.J();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object q(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (AnonymousClass1.f21123a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ThickContent();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.z(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\b\u0007\u0001\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u001b\u0007\u0007\b2", new Object[]{"payload_", "payloadCase_", "bitField0_", VanillaCampaignPayload.class, ExperimentalCampaignPayload.class, "content_", "priority_", "triggeringConditions_", CommonTypesProto.TriggeringCondition.class, "isTestCampaign_", "dataBundle_", DataBundleDefaultEntryHolder.f21124a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ThickContent> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ThickContent.class) {
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
    public interface ThickContentOrBuilder extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class VanillaCampaignPayload extends GeneratedMessageLite<VanillaCampaignPayload, Builder> implements VanillaCampaignPayloadOrBuilder {
        public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
        public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
        public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
        public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
        private static final VanillaCampaignPayload DEFAULT_INSTANCE;
        public static final int EXPERIMENTAL_CAMPAIGN_ID_FIELD_NUMBER = 2;
        private static volatile Parser<VanillaCampaignPayload> PARSER;
        private long campaignEndTimeMillis_;
        private long campaignStartTimeMillis_;
        private String campaignId_ = BuildConfig.VERSION_NAME;
        private String experimentalCampaignId_ = BuildConfig.VERSION_NAME;
        private String campaignName_ = BuildConfig.VERSION_NAME;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder extends GeneratedMessageLite.Builder<VanillaCampaignPayload, Builder> implements VanillaCampaignPayloadOrBuilder {
            public /* synthetic */ Builder(int i11) {
                this();
            }

            private Builder() {
                super(VanillaCampaignPayload.DEFAULT_INSTANCE);
            }
        }

        static {
            VanillaCampaignPayload vanillaCampaignPayload = new VanillaCampaignPayload();
            DEFAULT_INSTANCE = vanillaCampaignPayload;
            GeneratedMessageLite.D(VanillaCampaignPayload.class, vanillaCampaignPayload);
        }

        private VanillaCampaignPayload() {
        }

        public static VanillaCampaignPayload J() {
            return DEFAULT_INSTANCE;
        }

        public final long F() {
            return this.campaignEndTimeMillis_;
        }

        public final String G() {
            return this.campaignId_;
        }

        public final String H() {
            return this.campaignName_;
        }

        public final long I() {
            return this.campaignStartTimeMillis_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object q(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
            Parser defaultInstanceBasedParser;
            switch (AnonymousClass1.f21123a[methodToInvoke.ordinal()]) {
                case 1:
                    return new VanillaCampaignPayload();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.z(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"campaignId_", "experimentalCampaignId_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VanillaCampaignPayload> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (VanillaCampaignPayload.class) {
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
    public interface VanillaCampaignPayloadOrBuilder extends MessageLiteOrBuilder {
    }

    private CampaignProto() {
    }
}
