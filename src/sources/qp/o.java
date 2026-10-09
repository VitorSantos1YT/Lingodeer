package qp;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.yalantis.ucrop.view.CropImageView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f48089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f48090c;

    public /* synthetic */ o(int i11, Object obj, Object obj2) {
        this.f48088a = i11;
        this.f48089b = obj;
        this.f48090c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v11, MotionEvent event) {
        ViewParent parent;
        switch (this.f48088a) {
            case 0:
                s sVar = (s) this.f48089b;
                RelativeLayout relativeLayout = (RelativeLayout) this.f48090c;
                kotlin.jvm.internal.m.f(v11, "v");
                kotlin.jvm.internal.m.f(event, "event");
                sVar.f48166u = true;
                if (event.getAction() == 0) {
                    xx.f fVar = sVar.f48164s;
                    if (fVar != null) {
                        ux.b.a(fVar);
                    }
                    sVar.f48164s = qx.h.m(200L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new qh.z(1, sVar, v11), vx.b.f54316e);
                    sVar.f48159n = System.currentTimeMillis();
                    sVar.f48160o = 0L;
                }
                if (event.getAction() == 1) {
                    sVar.f48160o = System.currentTimeMillis();
                    xx.f fVar2 = sVar.f48164s;
                    if (fVar2 != null) {
                        ux.b.a(fVar2);
                    }
                    if (sVar.f48160o - sVar.f48159n < 200) {
                        relativeLayout.performClick();
                        sVar.f48166u = false;
                    }
                    sVar.f48159n = 0L;
                    sVar.f48160o = 0L;
                }
                return true;
            case 1:
                s sVar2 = (s) this.f48089b;
                FrameLayout frameLayout = (FrameLayout) this.f48090c;
                kotlin.jvm.internal.m.f(event, "event");
                if (event.getAction() == 0) {
                    sVar2.f48167v = true;
                    xx.f fVar3 = sVar2.f48164s;
                    if (fVar3 != null) {
                        ux.b.a(fVar3);
                    }
                    sVar2.f48164s = qx.h.m(200L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new r(0, v11, sVar2), vx.b.f54316e);
                    sVar2.f48159n = System.currentTimeMillis();
                    sVar2.f48160o = 0L;
                }
                if (event.getAction() == 1) {
                    sVar2.f48160o = System.currentTimeMillis();
                    xx.f fVar4 = sVar2.f48164s;
                    if (fVar4 != null) {
                        ux.b.a(fVar4);
                    }
                    if (sVar2.f48160o - sVar2.f48159n < 200) {
                        frameLayout.performClick();
                        sVar2.f48167v = false;
                    }
                    sVar2.f48159n = 0L;
                    sVar2.f48160o = 0L;
                }
                return true;
            case 2:
                b2 b2Var = (b2) this.f48089b;
                RelativeLayout relativeLayout2 = (RelativeLayout) this.f48090c;
                kotlin.jvm.internal.m.f(v11, "v");
                kotlin.jvm.internal.m.f(event, "event");
                b2Var.f47854u = true;
                if (event.getAction() == 0) {
                    xx.f fVar5 = b2Var.f47852s;
                    if (fVar5 != null) {
                        ux.b.a(fVar5);
                    }
                    b2Var.f47852s = qx.h.m(200L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new qh.d(2, b2Var, v11), vx.b.f54316e);
                    b2Var.f47847n = System.currentTimeMillis();
                    b2Var.f47848o = 0L;
                }
                if (event.getAction() == 1) {
                    b2Var.f47848o = System.currentTimeMillis();
                    xx.f fVar6 = b2Var.f47852s;
                    if (fVar6 != null) {
                        ux.b.a(fVar6);
                    }
                    if (b2Var.f47848o - b2Var.f47847n < 200) {
                        relativeLayout2.performClick();
                        b2Var.f47854u = false;
                    }
                    b2Var.f47847n = 0L;
                    b2Var.f47848o = 0L;
                }
                return true;
            case 3:
                b2 b2Var2 = (b2) this.f48089b;
                FrameLayout frameLayout2 = (FrameLayout) this.f48090c;
                kotlin.jvm.internal.m.f(event, "event");
                if (event.getAction() == 0) {
                    b2Var2.f47855v = true;
                    xx.f fVar7 = b2Var2.f47852s;
                    if (fVar7 != null) {
                        ux.b.a(fVar7);
                    }
                    b2Var2.f47852s = qx.h.m(200L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new qh.z(2, v11, b2Var2), vx.b.f54316e);
                    b2Var2.f47847n = System.currentTimeMillis();
                    b2Var2.f47848o = 0L;
                }
                if (event.getAction() == 1) {
                    b2Var2.f47848o = System.currentTimeMillis();
                    xx.f fVar8 = b2Var2.f47852s;
                    if (fVar8 != null) {
                        ux.b.a(fVar8);
                    }
                    if (b2Var2.f47848o - b2Var2.f47847n < 200) {
                        frameLayout2.performClick();
                        b2Var2.f47855v = false;
                    }
                    b2Var2.f47847n = 0L;
                    b2Var2.f47848o = 0L;
                }
                return true;
            case 4:
                z4 z4Var = (z4) this.f48089b;
                CardView cardView = (CardView) this.f48090c;
                kotlin.jvm.internal.m.f(v11, "<unused var>");
                kotlin.jvm.internal.m.f(event, "<unused var>");
                View view = (View) z4Var.f47818j;
                if (view != null) {
                    z4Var.r(view);
                }
                z4Var.f47818j = cardView;
                if (cardView != null) {
                    z4Var.s(cardView);
                }
                ((jp.p0) z4Var.f47881a).O(4);
                return false;
            default:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.f48089b;
                l1.b1 b1Var = (l1.b1) this.f48090c;
                int actionMasked = event.getActionMasked();
                if (actionMasked == 0) {
                    vVar.f38358a = event.getY();
                    ViewParent parent2 = v11.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    ys.j3.f(b1Var, true);
                } else if (actionMasked == 1) {
                    parent = v11.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(false);
                    }
                } else if (actionMasked == 2) {
                    float y10 = event.getY() - vVar.f38358a;
                    ViewParent parent3 = v11.getParent();
                    if (parent3 != null) {
                        parent3.requestDisallowInterceptTouchEvent(y10 <= CropImageView.DEFAULT_ASPECT_RATIO || v11.canScrollVertically(-1));
                    }
                    vVar.f38358a = event.getY();
                    ys.j3.f(b1Var, true);
                } else if (actionMasked == 3) {
                    parent = v11.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(false);
                    }
                }
                return false;
        }
    }
}
