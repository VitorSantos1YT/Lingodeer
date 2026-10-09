package g6;

import androidx.glance.appwidget.protobuf.y;
import androidx.glance.appwidget.protobuf.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum b implements y {
    UNSPECIFIED_CONTENT_SCALE(0),
    FIT(1),
    CROP(2),
    FILL_BOUNDS(3),
    UNRECOGNIZED(-1);

    public static final int CROP_VALUE = 2;
    public static final int FILL_BOUNDS_VALUE = 3;
    public static final int FIT_VALUE = 1;
    public static final int UNSPECIFIED_CONTENT_SCALE_VALUE = 0;
    private static final z internalValueMap = new p20.c(11);
    private final int value;

    b(int i11) {
        this.value = i11;
    }

    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
