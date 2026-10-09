package s2;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static long a(MotionEvent motionEvent, int i11) {
        float rawX = motionEvent.getRawX(i11);
        return (((long) Float.floatToRawIntBits(motionEvent.getRawY(i11))) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
    }
}
