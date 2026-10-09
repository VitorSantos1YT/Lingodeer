package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.lingodeer.R;
import com.youth.banner.config.BannerConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    public static final int[] B = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public boolean A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AccessibilityManager f15495z;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Callback extends BaseTransientBottomBar.BaseCallback<Snackbar> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context) {
            super(context, null);
        }
    }

    public Snackbar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f15495z = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:? A[LOOP:0: B:3:0x000a->B:33:?, LOOP_END, SYNTHETIC] */
    public static Snackbar h(View view, int i11) {
        ViewGroup viewGroup;
        Object parent;
        CharSequence text = view.getResources().getText(i11);
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (!(view instanceof FrameLayout)) {
                parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
                parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(B);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) snackbar.f15461i.getChildAt(0)).getMessageView().setText(text);
        snackbar.f15463k = BannerConfig.LOOP_TIME;
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final void a() {
        b(3);
    }

    public final void i(View.OnClickListener onClickListener) {
        CharSequence text = this.f15460h.getText(R.string.settings);
        Button actionView = ((SnackbarContentLayout) this.f15461i.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(text)) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.A = false;
        } else {
            this.A = true;
            actionView.setVisibility(0);
            actionView.setText(text);
            actionView.setOnClickListener(new a(0, this, onClickListener));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    public final void j() {
        SnackbarManager snackbarManagerB = SnackbarManager.b();
        AccessibilityManager accessibilityManager = this.f15495z;
        int recommendedTimeoutMillis = this.f15463k;
        boolean z11 = false;
        if (recommendedTimeoutMillis == -2) {
            recommendedTimeoutMillis = -2;
        } else if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(recommendedTimeoutMillis, (this.A ? 4 : 0) | 3);
        } else if (this.A && accessibilityManager.isTouchExplorationEnabled()) {
            recommendedTimeoutMillis = -2;
        }
        BaseTransientBottomBar.AnonymousClass5 anonymousClass5 = this.f15471t;
        synchronized (snackbarManagerB.f15501a) {
            try {
                if (snackbarManagerB.c(anonymousClass5)) {
                    SnackbarManager.SnackbarRecord snackbarRecord = snackbarManagerB.f15503c;
                    snackbarRecord.f15507b = recommendedTimeoutMillis;
                    snackbarManagerB.f15502b.removeCallbacksAndMessages(snackbarRecord);
                    snackbarManagerB.f(snackbarManagerB.f15503c);
                    return;
                }
                SnackbarManager.SnackbarRecord snackbarRecord2 = snackbarManagerB.f15504d;
                if (snackbarRecord2 != null && snackbarRecord2.f15506a.get() == anonymousClass5) {
                    z11 = true;
                }
                if (z11) {
                    snackbarManagerB.f15504d.f15507b = recommendedTimeoutMillis;
                } else {
                    snackbarManagerB.f15504d = new SnackbarManager.SnackbarRecord(recommendedTimeoutMillis, anonymousClass5);
                }
                SnackbarManager.SnackbarRecord snackbarRecord3 = snackbarManagerB.f15503c;
                if (snackbarRecord3 == null || !snackbarManagerB.a(snackbarRecord3, 4)) {
                    snackbarManagerB.f15503c = null;
                    SnackbarManager.SnackbarRecord snackbarRecord4 = snackbarManagerB.f15504d;
                    if (snackbarRecord4 != null) {
                        snackbarManagerB.f15503c = snackbarRecord4;
                        snackbarManagerB.f15504d = null;
                        SnackbarManager.Callback callback = (SnackbarManager.Callback) snackbarRecord4.f15506a.get();
                        if (callback != null) {
                            callback.a();
                        } else {
                            snackbarManagerB.f15503c = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
