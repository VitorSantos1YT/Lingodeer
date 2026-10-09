package com.google.firebase.inappmessaging;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public enum EventType implements Internal.EnumLite {
    UNKNOWN_EVENT_TYPE(0),
    IMPRESSION_EVENT_TYPE(1),
    CLICK_EVENT_TYPE(2);

    public static final int CLICK_EVENT_TYPE_VALUE = 2;
    public static final int IMPRESSION_EVENT_TYPE_VALUE = 1;
    public static final int UNKNOWN_EVENT_TYPE_VALUE = 0;
    private static final Internal.EnumLiteMap<EventType> internalValueMap = new Internal.EnumLiteMap<EventType>() { // from class: com.google.firebase.inappmessaging.EventType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i11) {
            if (i11 == 0) {
                return EventType.UNKNOWN_EVENT_TYPE;
            }
            if (i11 == 1) {
                return EventType.IMPRESSION_EVENT_TYPE;
            }
            if (i11 == 2) {
                return EventType.CLICK_EVENT_TYPE;
            }
            EventType eventType = EventType.UNKNOWN_EVENT_TYPE;
            return null;
        }
    };
    private final int value;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class EventTypeVerifier implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f19698a = new EventTypeVerifier();

        private EventTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i11) {
            EventType eventType;
            if (i11 == 0) {
                eventType = EventType.UNKNOWN_EVENT_TYPE;
            } else if (i11 == 1) {
                eventType = EventType.IMPRESSION_EVENT_TYPE;
            } else if (i11 != 2) {
                EventType eventType2 = EventType.UNKNOWN_EVENT_TYPE;
                eventType = null;
            } else {
                eventType = EventType.CLICK_EVENT_TYPE;
            }
            return eventType != null;
        }
    }

    EventType(int i11) {
        this.value = i11;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int d() {
        return this.value;
    }
}
