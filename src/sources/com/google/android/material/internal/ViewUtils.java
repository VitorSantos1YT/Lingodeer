package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.WeakHashMap;
import z4.b2;
import z4.j0;
import z4.s0;
import z4.u;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ViewUtils {

    /* JADX INFO: renamed from: com.google.android.material.internal.ViewUtils$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass4 implements ViewOverlayImpl {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnApplyWindowInsetsListener {
        v1 a(View view, v1 v1Var, RelativePadding relativePadding);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class RelativePadding {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f14752d;
    }

    private ViewUtils() {
    }

    public static Rect a(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i13 = i11 - iArr2[0];
        int i14 = i12 - iArr2[1];
        return new Rect(i13, i14, view2.getWidth() + i13, view2.getHeight() + i14);
    }

    public static void b(View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        final RelativePadding relativePadding = new RelativePadding();
        relativePadding.f14749a = paddingStart;
        relativePadding.f14750b = paddingTop;
        relativePadding.f14751c = paddingEnd;
        relativePadding.f14752d = paddingBottom;
        u uVar = new u() { // from class: com.google.android.material.internal.ViewUtils.2
            @Override // z4.u
            public final v1 e(View view2, v1 v1Var) {
                RelativePadding relativePadding2 = new RelativePadding();
                RelativePadding relativePadding3 = relativePadding;
                relativePadding2.f14749a = relativePadding3.f14749a;
                relativePadding2.f14750b = relativePadding3.f14750b;
                relativePadding2.f14751c = relativePadding3.f14751c;
                relativePadding2.f14752d = relativePadding3.f14752d;
                return onApplyWindowInsetsListener.a(view2, v1Var, relativePadding2);
            }
        };
        WeakHashMap weakHashMap = s0.f58893a;
        j0.m(view, uVar);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.3
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    view2.requestApplyInsets();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                }
            });
        }
    }

    public static void c(BottomAppBar bottomAppBar, AttributeSet attributeSet, int i11, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        TypedArray typedArrayObtainStyledAttributes = bottomAppBar.getContext().obtainStyledAttributes(attributeSet, R.styleable.f13765x, i11, com.lingodeer.R.style.Widget_MaterialComponents_BottomAppBar);
        final boolean z11 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        final boolean z12 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        final boolean z13 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
        b(bottomAppBar, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public final v1 a(View view, v1 v1Var, RelativePadding relativePadding) {
                if (z11) {
                    relativePadding.f14752d = v1Var.a() + relativePadding.f14752d;
                }
                boolean zG = ViewUtils.g(view);
                if (z12) {
                    if (zG) {
                        relativePadding.f14751c = v1Var.b() + relativePadding.f14751c;
                    } else {
                        relativePadding.f14749a = v1Var.b() + relativePadding.f14749a;
                    }
                }
                if (z13) {
                    if (zG) {
                        relativePadding.f14749a = v1Var.c() + relativePadding.f14749a;
                    } else {
                        relativePadding.f14751c = v1Var.c() + relativePadding.f14751c;
                    }
                }
                view.setPaddingRelative(relativePadding.f14749a, relativePadding.f14750b, relativePadding.f14751c, relativePadding.f14752d);
                onApplyWindowInsetsListener.a(view, v1Var, relativePadding);
                return v1Var;
            }
        });
    }

    public static float d(Context context, int i11) {
        return TypedValue.applyDimension(1, i11, context.getResources().getDisplayMetrics());
    }

    public static ViewGroup e(View view) {
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static void f(View view, boolean z11) {
        b2 b2VarI;
        if (z11 && (b2VarI = s0.i(view)) != null) {
            b2VarI.f58814a.s();
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean g(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode h(int i11, PorterDuff.Mode mode) {
        if (i11 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i11 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i11 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i11) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
