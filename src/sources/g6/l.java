package g6;

import androidx.glance.appwidget.protobuf.y;
import androidx.glance.appwidget.protobuf.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum l implements y {
    DEFAULT_IDENTITY(0),
    BACKGROUND_NODE(1),
    UNRECOGNIZED(-1);

    public static final int BACKGROUND_NODE_VALUE = 1;
    public static final int DEFAULT_IDENTITY_VALUE = 0;
    private static final z internalValueMap = new p20.c(12);
    private final int value;

    l(int i11) {
        this.value = i11;
    }

    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
