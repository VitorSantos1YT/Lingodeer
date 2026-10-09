package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.lingodeer.R;
import kotlin.jvm.internal.m;
import lc.d;
import vc.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseSubLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f7410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f7412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7413d;

    public BaseSubLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f7410a = paint;
        Context context2 = getContext();
        m.b(context2, "context");
        this.f7411b = context2.getResources().getDimensionPixelSize(R.dimen.md_divider_height);
        setWillNotDraw(false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.md_divider_height));
        paint.setAntiAlias(true);
    }

    private final int getDividerColor() {
        d dVar = this.f7412c;
        if (dVar == null) {
            m.n("dialog");
            throw null;
        }
        Context context = dVar.getContext();
        m.b(context, "dialog.context");
        return c.c(context, null, Integer.valueOf(R.attr.md_divider_color), null, 10);
    }

    public final Paint a() {
        int dividerColor = getDividerColor();
        Paint paint = this.f7410a;
        paint.setColor(dividerColor);
        return paint;
    }

    public final d getDialog() {
        d dVar = this.f7412c;
        if (dVar != null) {
            return dVar;
        }
        m.n("dialog");
        throw null;
    }

    public final int getDividerHeight() {
        return this.f7411b;
    }

    public final boolean getDrawDivider() {
        return this.f7413d;
    }

    public final void setDialog(d dVar) {
        this.f7412c = dVar;
    }

    public final void setDrawDivider(boolean z11) {
        this.f7413d = z11;
        invalidate();
    }
}
