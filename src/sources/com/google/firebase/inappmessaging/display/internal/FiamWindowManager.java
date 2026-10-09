package com.google.firebase.inappmessaging.display.internal;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.WindowManager;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.BannerBindingWrapper;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FiamWindowManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BindingWrapper f19769a;

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.internal.FiamWindowManager$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements SwipeDismissTouchListener.DismissCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BindingWrapper f19770a;

        public AnonymousClass1(BindingWrapper bindingWrapper) {
            this.f19770a = bindingWrapper;
        }
    }

    public static Rect a(Activity activity) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
        Point point = new Point();
        ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        rect.top = rect2.top;
        rect.left = rect2.left;
        rect.right = point.x - rect2.right;
        rect.bottom = point.y - rect2.bottom;
        return rect;
    }

    public final void b(BindingWrapper bindingWrapper, Activity activity) {
        final BindingWrapper bindingWrapper2;
        SwipeDismissTouchListener swipeDismissTouchListener;
        BindingWrapper bindingWrapper3 = this.f19769a;
        if ((bindingWrapper3 == null ? false : bindingWrapper3.e().isShown()) || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        InAppMessageLayoutConfig inAppMessageLayoutConfigA = bindingWrapper.a();
        final WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(inAppMessageLayoutConfigA.f19780g.intValue(), inAppMessageLayoutConfigA.f19781h.intValue(), 1003, inAppMessageLayoutConfigA.f19778e.intValue(), -3);
        Rect rectA = a(activity);
        if ((inAppMessageLayoutConfigA.f19779f.intValue() & 48) == 48) {
            layoutParams.y = rectA.top;
        }
        layoutParams.dimAmount = 0.3f;
        layoutParams.gravity = inAppMessageLayoutConfigA.f19779f.intValue();
        layoutParams.windowAnimations = 0;
        final WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        windowManager.addView(bindingWrapper.e(), layoutParams);
        a(activity);
        if (bindingWrapper instanceof BannerBindingWrapper) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bindingWrapper);
            if (inAppMessageLayoutConfigA.f19780g.intValue() == -1) {
                swipeDismissTouchListener = new SwipeDismissTouchListener(bindingWrapper.b(), anonymousClass1);
                bindingWrapper2 = bindingWrapper;
            } else {
                bindingWrapper2 = bindingWrapper;
                swipeDismissTouchListener = new SwipeDismissTouchListener(bindingWrapper.b(), anonymousClass1) { // from class: com.google.firebase.inappmessaging.display.internal.FiamWindowManager.2
                    @Override // com.google.firebase.inappmessaging.display.internal.SwipeDismissTouchListener
                    public final float h() {
                        return layoutParams.x;
                    }

                    @Override // com.google.firebase.inappmessaging.display.internal.SwipeDismissTouchListener
                    public final void i(float f5) {
                        WindowManager.LayoutParams layoutParams2 = layoutParams;
                        layoutParams2.x = (int) f5;
                        windowManager.updateViewLayout(bindingWrapper2.e(), layoutParams2);
                    }
                };
            }
            bindingWrapper2.b().setOnTouchListener(swipeDismissTouchListener);
        } else {
            bindingWrapper2 = bindingWrapper;
        }
        this.f19769a = bindingWrapper2;
    }
}
