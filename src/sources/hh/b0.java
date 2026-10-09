package hh;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f32208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32209c;

    public /* synthetic */ b0(View view, View view2, int i11) {
        this.f32207a = i11;
        this.f32208b = view;
        this.f32209c = view2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i11 = this.f32207a;
        View view = this.f32209c;
        View view2 = this.f32208b;
        final int i12 = 0;
        switch (i11) {
            case 0:
                view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ImageView imageView = (ImageView) view2.findViewById(R.id.img_popup_anchor);
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                imageView.getLocationOnScreen(iArr2);
                view.getLocationOnScreen(iArr);
                imageView.animate().translationXBy(com.google.android.material.datepicker.d.c(view, 2, iArr[0]) - ((imageView.getWidth() / 2) + iArr2[0])).setDuration(0L).start();
                break;
            case 1:
                view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                view2.getLocationOnScreen(iArr4);
                view.getLocationOnScreen(iArr3);
                ImageView imageView2 = (ImageView) view2.findViewById(R.id.img_popup_anchor);
                int measuredWidth = (((view.getMeasuredWidth() / 2) + iArr3[0]) - iArr4[0]) - (imageView2.getMeasuredWidth() / 2);
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                kotlin.jvm.internal.m.d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams).setMarginStart(measuredWidth);
                imageView2.setLayoutParams(layoutParams);
                imageView2.setVisibility(0);
                break;
            case 2:
                view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ImageView imageView3 = (ImageView) view2.findViewById(R.id.img_popup_anchor);
                int[] iArr5 = new int[2];
                int[] iArr6 = new int[2];
                imageView3.getLocationOnScreen(iArr6);
                view.getLocationOnScreen(iArr5);
                int measuredWidth2 = (((view.getMeasuredWidth() / 2) + iArr5[0]) - iArr6[0]) - (imageView3.getMeasuredWidth() / 2);
                ViewGroup.LayoutParams layoutParams2 = imageView3.getLayoutParams();
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
                    kotlin.jvm.internal.m.d(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ((j4.e) layoutParams2).setMarginStart(-measuredWidth2);
                } else {
                    kotlin.jvm.internal.m.d(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ((j4.e) layoutParams2).setMarginStart(measuredWidth2);
                }
                imageView3.setLayoutParams(layoutParams2);
                imageView3.setVisibility(0);
                break;
            case 3:
                view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int[] iArr7 = new int[2];
                int[] iArr8 = new int[2];
                view2.getLocationOnScreen(iArr8);
                view.getLocationOnScreen(iArr7);
                final ImageView imageView4 = (ImageView) view2.findViewById(R.id.img_popup_anchor);
                int measuredWidth3 = (((view.getMeasuredWidth() / 2) + iArr7[0]) - iArr8[0]) - (imageView4.getMeasuredWidth() / 2);
                ViewGroup.LayoutParams layoutParams3 = imageView4.getLayoutParams();
                kotlin.jvm.internal.m.d(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams3).leftMargin = measuredWidth3;
                imageView4.setLayoutParams(layoutParams3);
                imageView4.postDelayed(new b2.c(4, imageView4, new fz.a() { // from class: sp.d
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                imageView4.setVisibility(0);
                                break;
                            default:
                                imageView4.setVisibility(0);
                                break;
                        }
                        return b0.f48488a;
                    }
                }), 0L);
                break;
            default:
                view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int[] iArr9 = new int[2];
                int[] iArr10 = new int[2];
                view2.getLocationOnScreen(iArr10);
                view.getLocationOnScreen(iArr9);
                final ImageView imageView5 = (ImageView) view2.findViewById(R.id.img_popup_anchor);
                int measuredWidth4 = (((view.getMeasuredWidth() / 2) + iArr9[0]) - iArr10[0]) - (imageView5.getMeasuredWidth() / 2);
                ViewGroup.LayoutParams layoutParams4 = imageView5.getLayoutParams();
                kotlin.jvm.internal.m.d(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((ViewGroup.MarginLayoutParams) ((j4.e) layoutParams4)).leftMargin = measuredWidth4;
                imageView5.setLayoutParams(layoutParams4);
                final int i13 = 1;
                imageView5.postDelayed(new b2.c(4, imageView5, new fz.a() { // from class: sp.d
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                imageView5.setVisibility(0);
                                break;
                            default:
                                imageView5.setVisibility(0);
                                break;
                        }
                        return b0.f48488a;
                    }
                }), 0L);
                break;
        }
    }
}
