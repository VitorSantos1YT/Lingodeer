package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import na.b;
import o3.b0;
import re.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // na.b
    public final Object create(Context context) {
        Choreographer.getInstance().postFrameCallback(new b0(this, context.getApplicationContext()));
        return new g0(4);
    }

    @Override // na.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
