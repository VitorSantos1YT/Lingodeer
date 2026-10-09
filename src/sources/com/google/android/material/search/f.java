package com.google.android.material.search;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15168a;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f15168a) {
            case 0:
                int i11 = SearchView.f15117j0;
                return true;
            case 1:
                return true;
            case 3:
                if (!view.hasFocus()) {
                    view.requestFocus();
                    break;
                }
            case 2:
                return false;
            case 4:
                view.getParent().requestDisallowInterceptTouchEvent(false);
                view.onTouchEvent(motionEvent);
                return true;
            default:
                view.getParent().requestDisallowInterceptTouchEvent(false);
                view.onTouchEvent(motionEvent);
                return true;
        }
    }
}
