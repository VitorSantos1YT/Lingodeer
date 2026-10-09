package app.rive.runtime.kotlin.core;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class RiveEvent extends NativeObject {
    public static final int $stable = 0;
    private final float delay;

    public RiveEvent(long j11, float f5) {
        super(j11);
        this.delay = f5;
    }

    private final native HashMap<String, Object> cppData(long j11);

    private final native String cppName(long j11);

    private final native HashMap<String, Object> cppProperties(long j11);

    private final native short cppType(long j11);

    private final short getTypeCode() {
        return cppType(getCppPointer());
    }

    public final HashMap<String, Object> getData() {
        return cppData(getCppPointer());
    }

    public final float getDelay() {
        return this.delay;
    }

    public final String getName() {
        return cppName(getCppPointer());
    }

    public final HashMap<String, Object> getProperties() {
        return cppProperties(getCppPointer());
    }

    public final EventType getType() {
        EventType eventTypeFromInt = EventType.Companion.fromInt(getTypeCode());
        return eventTypeFromInt == null ? EventType.GeneralEvent : eventTypeFromInt;
    }

    public String toString() {
        return "RiveEvent " + getData();
    }
}
