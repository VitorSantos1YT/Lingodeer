package g4;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f28765k;

    @Override // g4.q
    public final boolean d(float f5, long j11, View view, c4.e eVar) {
        Method method;
        p pVar;
        if (view instanceof MotionLayout) {
            float fB = b(f5, j11, view, eVar);
            pVar = this;
            ((MotionLayout) view).setProgress(fB);
        } else {
            if (this.f28765k) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f28765k = true;
                method = null;
            }
            if (method != null) {
                try {
                    float fB2 = b(f5, j11, view, eVar);
                    pVar = this;
                    try {
                        method.invoke(view, Float.valueOf(fB2));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                    pVar = this;
                }
            } else {
                pVar = this;
            }
        }
        return pVar.f28773h;
    }
}
