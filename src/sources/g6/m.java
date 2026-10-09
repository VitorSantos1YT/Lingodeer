package g6;

import androidx.glance.appwidget.protobuf.y;
import androidx.glance.appwidget.protobuf.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum m implements y {
    UNSPECIFIED_VERTICAL_ALIGNMENT(0),
    TOP(1),
    CENTER_VERTICALLY(2),
    BOTTOM(3),
    UNRECOGNIZED(-1);

    public static final int BOTTOM_VALUE = 3;
    public static final int CENTER_VERTICALLY_VALUE = 2;
    public static final int TOP_VALUE = 1;
    public static final int UNSPECIFIED_VERTICAL_ALIGNMENT_VALUE = 0;
    private static final z internalValueMap = new tw.c(12);
    private final int value;

    m(int i11) {
        this.value = i11;
    }

    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
