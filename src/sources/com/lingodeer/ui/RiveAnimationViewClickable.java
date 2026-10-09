package com.lingodeer.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import app.rive.runtime.kotlin.RiveAnimationView;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RiveAnimationViewClickable extends RiveAnimationView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f22390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f22391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveAnimationViewClickable(Context context, boolean z11) {
        super(context, null, 2, null);
        m.f(context, "context");
        this.f22389a = z11;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        m.e(viewConfiguration, "get(...)");
        this.f22392d = viewConfiguration.getScaledTouchSlop();
    }

    @Override // app.rive.runtime.kotlin.RiveAnimationView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        m.f(event, "event");
        if (!this.f22389a) {
            return false;
        }
        event.getAction();
        if (event.getAction() == 0) {
            this.f22390b = event.getX();
            this.f22391c = event.getY();
        } else if (event.getAction() == 1) {
            float x11 = event.getX();
            float y10 = event.getY();
            float fAbs = Math.abs(x11 - this.f22390b);
            int i11 = this.f22392d;
            if (fAbs < i11 && Math.abs(y10 - this.f22391c) < i11) {
                performClick();
            }
        }
        return super.onTouchEvent(event);
    }

    public final void setInterceptTouchEvents(boolean z11) {
        this.f22389a = z11;
        setClickable(z11);
        setFocusable(z11);
    }
}
