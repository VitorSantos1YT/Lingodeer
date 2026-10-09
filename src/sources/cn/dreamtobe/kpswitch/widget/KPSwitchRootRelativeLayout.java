package cn.dreamtobe.kpswitch.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import s8.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class KPSwitchRootRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f7192a;

    public KPSwitchRootRelativeLayout(Context context) {
        super(context);
        this.f7192a = new e(this);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        View.MeasureSpec.getSize(i11);
        this.f7192a.c(View.MeasureSpec.getSize(i12));
        super.onMeasure(i11, i12);
    }

    public KPSwitchRootRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7192a = new e(this);
    }

    public KPSwitchRootRelativeLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f7192a = new e(this);
    }
}
