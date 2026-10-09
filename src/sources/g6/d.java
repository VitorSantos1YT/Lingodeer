package g6;

import androidx.glance.appwidget.protobuf.y;
import androidx.glance.appwidget.protobuf.z;
import ay.k0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum d implements y {
    UNSPECIFIED_HORIZONTAL_ALIGNMENT(0),
    START(1),
    CENTER_HORIZONTALLY(2),
    END(3),
    UNRECOGNIZED(-1);

    public static final int CENTER_HORIZONTALLY_VALUE = 2;
    public static final int END_VALUE = 3;
    public static final int START_VALUE = 1;
    public static final int UNSPECIFIED_HORIZONTAL_ALIGNMENT_VALUE = 0;
    private static final z internalValueMap = new k0(12);
    private final int value;

    d(int i11) {
        this.value = i11;
    }

    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
