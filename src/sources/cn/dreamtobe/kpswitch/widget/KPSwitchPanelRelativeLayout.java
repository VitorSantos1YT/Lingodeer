package cn.dreamtobe.kpswitch.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import sb.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class KPSwitchPanelRelativeLayout extends RelativeLayout implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tb.a f7189a;

    public KPSwitchPanelRelativeLayout(Context context) {
        super(context);
        this.f7189a = new tb.a(this, null);
    }

    @Override // sb.a
    public final void a() {
        this.f7189a.getClass();
    }

    @Override // sb.a
    public final void b() {
        this.f7189a.f52119b = true;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int[] iArrC = this.f7189a.c(i11, i12);
        super.onMeasure(iArrC[0], iArrC[1]);
    }

    public void setIgnoreRecommendHeight(boolean z11) {
        this.f7189a.getClass();
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        tb.a aVar = this.f7189a;
        if (i11 == 0) {
            aVar.f52119b = false;
        }
        if (i11 == aVar.f52118a.getVisibility()) {
            return;
        }
        super.setVisibility(i11);
    }

    public KPSwitchPanelRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7189a = new tb.a(this, attributeSet);
    }

    public KPSwitchPanelRelativeLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f7189a = new tb.a(this, attributeSet);
    }
}
