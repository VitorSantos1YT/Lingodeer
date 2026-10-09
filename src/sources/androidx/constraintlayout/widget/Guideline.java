package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import j4.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1369a;

    public Guideline(Context context) {
        super(context);
        this.f1369a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z11) {
        this.f1369a = z11;
    }

    public void setGuidelineBegin(int i11) {
        e eVar = (e) getLayoutParams();
        if (this.f1369a && eVar.f35848a == i11) {
            return;
        }
        eVar.f35848a = i11;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i11) {
        e eVar = (e) getLayoutParams();
        if (this.f1369a && eVar.f35850b == i11) {
            return;
        }
        eVar.f35850b = i11;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f5) {
        e eVar = (e) getLayoutParams();
        if (this.f1369a && eVar.f35852c == f5) {
            return;
        }
        eVar.f35852c = f5;
        setLayoutParams(eVar);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1369a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1369a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
    }
}
