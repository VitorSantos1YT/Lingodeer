package g6;

import androidx.glance.appwidget.protobuf.y;
import androidx.glance.appwidget.protobuf.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum c implements y {
    UNKNOWN_DIMENSION_TYPE(0),
    EXACT(1),
    WRAP(2),
    FILL(3),
    EXPAND(4),
    UNRECOGNIZED(-1);

    public static final int EXACT_VALUE = 1;
    public static final int EXPAND_VALUE = 4;
    public static final int FILL_VALUE = 3;
    public static final int UNKNOWN_DIMENSION_TYPE_VALUE = 0;
    public static final int WRAP_VALUE = 2;
    private static final z internalValueMap = new tw.c(11);
    private final int value;

    c(int i11) {
        this.value = i11;
    }

    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
