package r;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f48551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f48552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f48553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f48554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f48556f;

    public e2(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f48555e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f48552b = rect3;
        Rect rect4 = new Rect();
        this.f48554d = rect4;
        Rect rect5 = new Rect();
        this.f48553c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i11 = -scaledTouchSlop;
        rect4.inset(i11, i11);
        rect5.set(rect2);
        this.f48551a = view;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        int x11 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z13 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z12 = this.f48556f;
                if (z12 && !this.f48554d.contains(x11, y10)) {
                    z13 = z12;
                    z11 = false;
                }
            } else if (action != 3) {
                z11 = true;
                z13 = false;
            } else {
                z12 = this.f48556f;
                this.f48556f = false;
            }
            z13 = z12;
            z11 = true;
        } else if (this.f48552b.contains(x11, y10)) {
            this.f48556f = true;
            z11 = true;
        } else {
            z11 = true;
            z13 = false;
        }
        if (!z13) {
            return false;
        }
        Rect rect = this.f48553c;
        View view = this.f48551a;
        if (!z11 || rect.contains(x11, y10)) {
            motionEvent.setLocation(x11 - rect.left, y10 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
