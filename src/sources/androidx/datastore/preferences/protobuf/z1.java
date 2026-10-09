package androidx.datastore.preferences.protobuf;

import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum z1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(BuildConfig.VERSION_NAME),
    BYTE_STRING(i.f1484b),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    z1(Serializable serializable) {
        this.defaultDefault = serializable;
    }
}
