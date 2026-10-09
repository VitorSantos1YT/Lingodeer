package com.google.android.material.dialog;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class InsetDialogOnTouchListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dialog f14440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14443d;

    public InsetDialogOnTouchListener(Dialog dialog, Rect rect) {
        this.f14440a = dialog;
        this.f14441b = rect.left;
        this.f14442c = rect.top;
        this.f14443d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f14441b;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.f14442c;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i11 = this.f14443d;
            motionEventObtain.setLocation((-i11) - 1, (-i11) - 1);
        }
        view.performClick();
        return this.f14440a.onTouchEvent(motionEventObtain);
    }
}
