package cn.dreamtobe.kpswitch.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import sb.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class KPSwitchPanelLinearLayout extends LinearLayout implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tb.a f7188a;

    public KPSwitchPanelLinearLayout(Context context) {
        super(context);
        this.f7188a = new tb.a(this, null);
    }

    @Override // sb.a
    public final void a() {
        this.f7188a.getClass();
    }

    @Override // sb.a
    public final void b() {
        this.f7188a.f52119b = true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int[] iArrC = this.f7188a.c(i11, i12);
        super.onMeasure(iArrC[0], iArrC[1]);
    }

    public void setIgnoreRecommendHeight(boolean z11) {
        this.f7188a.getClass();
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        tb.a aVar = this.f7188a;
        if (i11 == 0) {
            aVar.f52119b = false;
        }
        if (i11 == aVar.f52118a.getVisibility()) {
            return;
        }
        super.setVisibility(i11);
    }

    public KPSwitchPanelLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7188a = new tb.a(this, attributeSet);
    }

    public KPSwitchPanelLinearLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f7188a = new tb.a(this, attributeSet);
    }
}
