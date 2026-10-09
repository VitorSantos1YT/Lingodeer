package com.google.firebase.inappmessaging;

import com.google.android.gms.tasks.Task;
import com.google.firebase.inappmessaging.model.Action;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface FirebaseInAppMessagingDisplayCallbacks {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class InAppMessagingDismissType {
        private static final /* synthetic */ InAppMessagingDismissType[] $VALUES;
        public static final InAppMessagingDismissType AUTO;
        public static final InAppMessagingDismissType CLICK;
        public static final InAppMessagingDismissType SWIPE;
        public static final InAppMessagingDismissType UNKNOWN_DISMISS_TYPE;

        static {
            InAppMessagingDismissType inAppMessagingDismissType = new InAppMessagingDismissType("UNKNOWN_DISMISS_TYPE", 0);
            UNKNOWN_DISMISS_TYPE = inAppMessagingDismissType;
            InAppMessagingDismissType inAppMessagingDismissType2 = new InAppMessagingDismissType("AUTO", 1);
            AUTO = inAppMessagingDismissType2;
            InAppMessagingDismissType inAppMessagingDismissType3 = new InAppMessagingDismissType("CLICK", 2);
            CLICK = inAppMessagingDismissType3;
            InAppMessagingDismissType inAppMessagingDismissType4 = new InAppMessagingDismissType("SWIPE", 3);
            SWIPE = inAppMessagingDismissType4;
            $VALUES = new InAppMessagingDismissType[]{inAppMessagingDismissType, inAppMessagingDismissType2, inAppMessagingDismissType3, inAppMessagingDismissType4};
        }

        public static InAppMessagingDismissType valueOf(String str) {
            return (InAppMessagingDismissType) Enum.valueOf(InAppMessagingDismissType.class, str);
        }

        public static InAppMessagingDismissType[] values() {
            return (InAppMessagingDismissType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class InAppMessagingErrorReason {
        private static final /* synthetic */ InAppMessagingErrorReason[] $VALUES;
        public static final InAppMessagingErrorReason IMAGE_DISPLAY_ERROR;
        public static final InAppMessagingErrorReason IMAGE_FETCH_ERROR;
        public static final InAppMessagingErrorReason IMAGE_UNSUPPORTED_FORMAT;
        public static final InAppMessagingErrorReason UNSPECIFIED_RENDER_ERROR;

        static {
            InAppMessagingErrorReason inAppMessagingErrorReason = new InAppMessagingErrorReason("UNSPECIFIED_RENDER_ERROR", 0);
            UNSPECIFIED_RENDER_ERROR = inAppMessagingErrorReason;
            InAppMessagingErrorReason inAppMessagingErrorReason2 = new InAppMessagingErrorReason("IMAGE_FETCH_ERROR", 1);
            IMAGE_FETCH_ERROR = inAppMessagingErrorReason2;
            InAppMessagingErrorReason inAppMessagingErrorReason3 = new InAppMessagingErrorReason("IMAGE_DISPLAY_ERROR", 2);
            IMAGE_DISPLAY_ERROR = inAppMessagingErrorReason3;
            InAppMessagingErrorReason inAppMessagingErrorReason4 = new InAppMessagingErrorReason("IMAGE_UNSUPPORTED_FORMAT", 3);
            IMAGE_UNSUPPORTED_FORMAT = inAppMessagingErrorReason4;
            $VALUES = new InAppMessagingErrorReason[]{inAppMessagingErrorReason, inAppMessagingErrorReason2, inAppMessagingErrorReason3, inAppMessagingErrorReason4};
        }

        public static InAppMessagingErrorReason valueOf(String str) {
            return (InAppMessagingErrorReason) Enum.valueOf(InAppMessagingErrorReason.class, str);
        }

        public static InAppMessagingErrorReason[] values() {
            return (InAppMessagingErrorReason[]) $VALUES.clone();
        }
    }

    Task a(Action action);

    Task b(InAppMessagingErrorReason inAppMessagingErrorReason);

    Task c(InAppMessagingDismissType inAppMessagingDismissType);

    Task d();
}
