package h9;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f32093b;

    public /* synthetic */ s(w wVar, int i11) {
        this.f32092a = i11;
        this.f32093b = wVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be A[LOOP:3: B:37:0x00b8->B:39:0x00be, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32092a) {
            case 0:
                this.f32093b.k();
                break;
            case 1:
                w wVar = this.f32093b;
                View view = wVar.f32110j;
                ViewGroup viewGroup = wVar.f32105e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(wVar.A ? 0 : 4);
                }
                if (view != null) {
                    int dimensionPixelSize = wVar.f32101a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (wVar.A) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof DefaultTimeBar) {
                        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                        Rect rect = defaultTimeBar.f2164a;
                        ValueAnimator valueAnimator = defaultTimeBar.f2179j0;
                        if (wVar.A) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            defaultTimeBar.f2181l0 = true;
                            defaultTimeBar.f2180k0 = CropImageView.DEFAULT_ASPECT_RATIO;
                            defaultTimeBar.invalidate(rect);
                        } else {
                            int i11 = wVar.f32125z;
                            if (i11 == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                defaultTimeBar.f2181l0 = false;
                                defaultTimeBar.f2180k0 = CropImageView.DEFAULT_ASPECT_RATIO;
                                defaultTimeBar.invalidate(rect);
                            } else if (i11 != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                defaultTimeBar.f2181l0 = false;
                                defaultTimeBar.f2180k0 = 1.0f;
                                defaultTimeBar.invalidate(rect);
                            }
                        }
                    }
                }
                ArrayList arrayList = wVar.f32124y;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    View view2 = (View) obj;
                    view2.setVisibility((wVar.A && w.j(view2)) ? 4 : 0);
                }
                break;
            case 2:
                w wVar2 = this.f32093b;
                ValueAnimator valueAnimator2 = wVar2.f32117r;
                View view3 = wVar2.f32111k;
                PlayerControlView playerControlView = wVar2.f32101a;
                ViewGroup viewGroup2 = wVar2.f32107g;
                ViewGroup viewGroup3 = wVar2.f32106f;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (playerControlView.getWidth() - playerControlView.getPaddingLeft()) - playerControlView.getPaddingRight();
                    while (true) {
                        if (viewGroup2.getChildCount() <= 1) {
                            if (view3 != null) {
                                view3.setVisibility(8);
                            }
                            int iC = w.c(wVar2.f32109i);
                            int childCount = viewGroup3.getChildCount() - 1;
                            for (int i13 = 0; i13 < childCount; i13++) {
                                iC += w.c(viewGroup3.getChildAt(i13));
                            }
                            if (iC > width) {
                                if (view3 != null) {
                                    view3.setVisibility(0);
                                    iC += w.c(view3);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (int i14 = 0; i14 < childCount; i14++) {
                                    View childAt = viewGroup3.getChildAt(i14);
                                    iC -= w.c(childAt);
                                    arrayList2.add(childAt);
                                    if (iC <= width) {
                                        if (!arrayList2.isEmpty()) {
                                            viewGroup3.removeViews(0, arrayList2.size());
                                            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                                                viewGroup2.addView((View) arrayList2.get(i15), viewGroup2.getChildCount() - 1);
                                            }
                                        }
                                    }
                                    break;
                                }
                                if (!arrayList2.isEmpty()) {
                                    viewGroup3.removeViews(0, arrayList2.size());
                                    while (i15 < arrayList2.size()) {
                                        viewGroup2.addView((View) arrayList2.get(i15), viewGroup2.getChildCount() - 1);
                                    }
                                }
                                break;
                            } else {
                                ViewGroup viewGroup4 = wVar2.f32108h;
                                if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && !valueAnimator2.isStarted()) {
                                    wVar2.f32116q.cancel();
                                    valueAnimator2.start();
                                    break;
                                }
                            }
                        } else {
                            int childCount2 = viewGroup2.getChildCount() - 2;
                            View childAt2 = viewGroup2.getChildAt(childCount2);
                            viewGroup2.removeViewAt(childCount2);
                            viewGroup3.addView(childAt2, 0);
                        }
                    }
                }
                break;
            case 3:
                this.f32093b.f32113n.start();
                break;
            case 4:
                this.f32093b.m.start();
                break;
            case 5:
                w wVar3 = this.f32093b;
                wVar3.f32112l.start();
                wVar3.e(wVar3.f32120u, 2000L);
                break;
            default:
                this.f32093b.i(2);
                break;
        }
    }
}
