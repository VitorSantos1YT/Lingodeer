package com.google.firebase.database.core.view;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface Event {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class EventType {
        private static final /* synthetic */ EventType[] $VALUES;
        public static final EventType CHILD_ADDED;
        public static final EventType CHILD_CHANGED;
        public static final EventType CHILD_MOVED;
        public static final EventType CHILD_REMOVED;
        public static final EventType VALUE;

        static {
            EventType eventType = new EventType("CHILD_REMOVED", 0);
            CHILD_REMOVED = eventType;
            EventType eventType2 = new EventType("CHILD_ADDED", 1);
            CHILD_ADDED = eventType2;
            EventType eventType3 = new EventType("CHILD_MOVED", 2);
            CHILD_MOVED = eventType3;
            EventType eventType4 = new EventType("CHILD_CHANGED", 3);
            CHILD_CHANGED = eventType4;
            EventType eventType5 = new EventType("VALUE", 4);
            VALUE = eventType5;
            $VALUES = new EventType[]{eventType, eventType2, eventType3, eventType4, eventType5};
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    void a();

    String toString();
}
