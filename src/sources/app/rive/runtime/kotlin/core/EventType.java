package app.rive.runtime.kotlin.core;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.f;
import ry.n;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum EventType {
    OpenURLEvent(131),
    GeneralEvent(128);

    private static final Map<Short, EventType> map;
    private final short value;
    private static final /* synthetic */ yy.a $ENTRIES = ub.a.U(values());
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final EventType fromInt(short s3) {
            return (EventType) EventType.map.get(Short.valueOf(s3));
        }

        private Companion() {
        }
    }

    static {
        yy.a entries = getEntries();
        int iW = x.W(n.W(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW < 16 ? 16 : iW);
        for (Object obj : entries) {
            linkedHashMap.put(Short.valueOf(((EventType) obj).value), obj);
        }
        map = linkedHashMap;
    }

    EventType(short s3) {
        this.value = s3;
    }

    public static yy.a getEntries() {
        return $ENTRIES;
    }

    public final short getValue() {
        return this.value;
    }
}
