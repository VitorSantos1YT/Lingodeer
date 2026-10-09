package vq;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends View.DragShadowBuilder {
    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        getView().draw(canvas);
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        int width = getView().getWidth();
        int height = getView().getHeight();
        point.set(width, height);
        point2.set(width / 2, (height / 2) + height);
    }
}
