package z2;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f58734a = new z1();

    public final boolean a(MotionEvent motionEvent, int i11) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i11)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i11)) & Integer.MAX_VALUE) < 2139095040;
    }
}
