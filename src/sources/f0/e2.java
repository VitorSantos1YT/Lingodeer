package f0;

import androidx.compose.foundation.gestures.FlingCancellationException;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f26254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2 f26255b;

    public e2(i2 i2Var, g2 g2Var) {
        this.f26254a = i2Var;
        this.f26255b = g2Var;
    }

    @Override // f0.n1
    public final float a(float f5) {
        i2 i2Var = this.f26254a;
        boolean zBooleanValue = ((Boolean) i2Var.f26312h.invoke()).booleanValue();
        if (Math.abs(f5) != CropImageView.DEFAULT_ASPECT_RATIO && !zBooleanValue) {
            throw new FlingCancellationException();
        }
        return i2Var.d(i2Var.g(this.f26255b.a(2, i2Var.e(i2Var.h(f5)))));
    }
}
