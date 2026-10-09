package com.google.firebase.inappmessaging;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CampaignAnalytics extends GeneratedMessageLite<CampaignAnalytics, Builder> implements CampaignAnalyticsOrBuilder {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 2;
    public static final int CLIENT_APP_FIELD_NUMBER = 3;
    public static final int CLIENT_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    private static final CampaignAnalytics DEFAULT_INSTANCE;
    public static final int DISMISS_TYPE_FIELD_NUMBER = 6;
    public static final int ENGAGEMENTMETRICS_DELIVERY_RETRY_COUNT_FIELD_NUMBER = 10;
    public static final int EVENT_TYPE_FIELD_NUMBER = 5;
    public static final int FETCH_ERROR_REASON_FIELD_NUMBER = 8;
    public static final int FIAM_SDK_VERSION_FIELD_NUMBER = 9;
    private static volatile Parser<CampaignAnalytics> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int RENDER_ERROR_REASON_FIELD_NUMBER = 7;
    private int bitField0_;
    private ClientAppInfo clientApp_;
    private long clientTimestampMillis_;
    private int engagementMetricsDeliveryRetryCount_;
    private Object event_;
    private int eventCase_ = 0;
    private String projectNumber_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
    private String campaignId_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
    private String fiamSdkVersion_ = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.CampaignAnalytics$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19694a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19694a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19694a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19694a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19694a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19694a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19694a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19694a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends GeneratedMessageLite.Builder<CampaignAnalytics, Builder> implements CampaignAnalyticsOrBuilder {
        public /* synthetic */ Builder(int i11) {
            this();
        }

        private Builder() {
            super(CampaignAnalytics.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum EventCase {
        EVENT_TYPE(5),
        DISMISS_TYPE(6),
        RENDER_ERROR_REASON(7),
        FETCH_ERROR_REASON(8),
        EVENT_NOT_SET(0);

        private final int value;

        EventCase(int i11) {
            this.value = i11;
        }
    }

    static {
        CampaignAnalytics campaignAnalytics = new CampaignAnalytics();
        DEFAULT_INSTANCE = campaignAnalytics;
        GeneratedMessageLite.D(CampaignAnalytics.class, campaignAnalytics);
    }

    private CampaignAnalytics() {
    }

    public static void F(CampaignAnalytics campaignAnalytics, long j11) {
        campaignAnalytics.bitField0_ |= 8;
        campaignAnalytics.clientTimestampMillis_ = j11;
    }

    public static void G(CampaignAnalytics campaignAnalytics, EventType eventType) {
        campaignAnalytics.getClass();
        campaignAnalytics.event_ = Integer.valueOf(eventType.d());
        campaignAnalytics.eventCase_ = 5;
    }

    public static void H(CampaignAnalytics campaignAnalytics, DismissType dismissType) {
        campaignAnalytics.getClass();
        campaignAnalytics.event_ = Integer.valueOf(dismissType.d());
        campaignAnalytics.eventCase_ = 6;
    }

    public static void I(CampaignAnalytics campaignAnalytics, RenderErrorReason renderErrorReason) {
        campaignAnalytics.getClass();
        campaignAnalytics.event_ = Integer.valueOf(renderErrorReason.d());
        campaignAnalytics.eventCase_ = 7;
    }

    public static void J(CampaignAnalytics campaignAnalytics, String str) {
        campaignAnalytics.getClass();
        str.getClass();
        campaignAnalytics.bitField0_ |= 1;
        campaignAnalytics.projectNumber_ = str;
    }

    public static void K(CampaignAnalytics campaignAnalytics) {
        campaignAnalytics.getClass();
        campaignAnalytics.bitField0_ |= 16;
        campaignAnalytics.fiamSdkVersion_ = "22.0.3";
    }

    public static void L(CampaignAnalytics campaignAnalytics, String str) {
        campaignAnalytics.getClass();
        str.getClass();
        campaignAnalytics.bitField0_ |= 2;
        campaignAnalytics.campaignId_ = str;
    }

    public static void M(CampaignAnalytics campaignAnalytics, ClientAppInfo clientAppInfo) {
        campaignAnalytics.getClass();
        campaignAnalytics.clientApp_ = clientAppInfo;
        campaignAnalytics.bitField0_ |= 4;
    }

    public static Builder N() {
        return (Builder) DEFAULT_INSTANCE.p();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object q(GeneratedMessageLite.MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite) {
        Parser defaultInstanceBasedParser;
        switch (AnonymousClass1.f19694a[methodToInvoke.ordinal()]) {
            case 1:
                return new CampaignAnalytics();
            case 2:
                return new Builder(0);
            case 3:
                EventType eventType = EventType.UNKNOWN_EVENT_TYPE;
                Internal.EnumVerifier enumVerifier = EventType.EventTypeVerifier.f19698a;
                DismissType dismissType = DismissType.UNKNOWN_DISMISS_TYPE;
                Internal.EnumVerifier enumVerifier2 = DismissType.DismissTypeVerifier.f19697a;
                RenderErrorReason renderErrorReason = RenderErrorReason.UNSPECIFIED_RENDER_ERROR;
                Internal.EnumVerifier enumVerifier3 = RenderErrorReason.RenderErrorReasonVerifier.f19714a;
                FetchErrorReason fetchErrorReason = FetchErrorReason.UNSPECIFIED_FETCH_ERROR;
                return GeneratedMessageLite.z(DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005\u083f\u0000\u0006\u083f\u0000\u0007\u083f\u0000\b\u083f\u0000\tဈ\u0004\nင\u0005", new Object[]{"event_", "eventCase_", "bitField0_", "projectNumber_", "campaignId_", "clientApp_", "clientTimestampMillis_", enumVerifier, enumVerifier2, enumVerifier3, FetchErrorReason.FetchErrorReasonVerifier.f19700a, "fiamSdkVersion_", "engagementMetricsDeliveryRetryCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CampaignAnalytics> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CampaignAnalytics.class) {
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
