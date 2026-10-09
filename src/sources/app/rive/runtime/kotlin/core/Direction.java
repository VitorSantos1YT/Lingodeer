package app.rive.runtime.kotlin.core;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.f;
import ry.n;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum Direction {
    BACKWARDS(-1),
    FORWARDS(1),
    AUTO(0);

    private static final Map<Integer, Direction> map;
    private final int value;
    private static final /* synthetic */ yy.a $ENTRIES = ub.a.U(values());
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final Direction fromInt(int i11) {
            return (Direction) Direction.map.get(Integer.valueOf(i11));
        }

        private Companion() {
        }
    }

    static {
        yy.a entries = getEntries();
        int iW = x.W(n.W(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW < 16 ? 16 : iW);
        for (Object obj : entries) {
            linkedHashMap.put(Integer.valueOf(((Direction) obj).value), obj);
        }
        map = linkedHashMap;
    }

    Direction(int i11) {
        this.value = i11;
    }

    public static yy.a getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
