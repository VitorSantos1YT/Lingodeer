package fw;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import hj.i1;
import hj.j1;
import hj.j6;
import hj.k1;
import hj.l1;
import hj.o1;
import hj.p1;
import hj.q1;
import hj.r1;
import hj.s1;
import kotlin.jvm.internal.m;
import pi.h;
import qp.b0;
import qp.f0;
import qp.i0;
import qp.j;
import qp.l0;
import qp.n;
import qp.v0;
import xs.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28227b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f28226a = i11;
        this.f28227b = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f28226a) {
            case 0:
                com.plattysoft.leonids.a aVar = (com.plattysoft.leonids.a) this.f28227b;
                ViewGroup viewGroup = aVar.f22395a;
                viewGroup.removeView(aVar.f22398d);
                aVar.f22398d = null;
                viewGroup.postInvalidate();
                aVar.f22399e.addAll(aVar.f22400f);
                break;
            case 1:
                m.f(animation, "animation");
                break;
            case 2:
                m.f(animation, "p0");
                break;
            case 3:
                m.f(animation, "p0");
                break;
            case 4:
                m.f(animation, "p0");
                break;
            case 5:
                m.f(animation, "p0");
                break;
            case 6:
                m.f(animation, "p0");
                break;
            case 7:
                m.f(animation, "p0");
                break;
            case 8:
                m.f(animation, "p0");
                break;
            case 9:
                m.f(animation, "p0");
                break;
            case 10:
                m.f(animation, "p0");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f28226a) {
            case 0:
                com.plattysoft.leonids.a aVar = (com.plattysoft.leonids.a) this.f28227b;
                ViewGroup viewGroup = aVar.f22395a;
                viewGroup.removeView(aVar.f22398d);
                aVar.f22398d = null;
                viewGroup.postInvalidate();
                aVar.f22399e.addAll(aVar.f22400f);
                break;
            case 1:
                m.f(animation, "animation");
                h hVar = (h) this.f28227b;
                j6 j6Var = hVar.W;
                if (j6Var != null) {
                    m.c(j6Var);
                    ((LottieAnimationView) j6Var.f32797f).setFrame(0);
                    j6 j6Var2 = hVar.W;
                    m.c(j6Var2);
                    ((ImageView) j6Var2.f32798g).setEnabled(true);
                    j6 j6Var3 = hVar.W;
                    m.c(j6Var3);
                    ((ImageView) j6Var3.f32798g).setImageTintList(null);
                    if (hVar.T) {
                        hVar.v();
                    }
                    break;
                }
                break;
            case 2:
                m.f(animation, "p0");
                j jVar = (j) this.f28227b;
                ta.a aVar2 = jVar.f47886f;
                m.c(aVar2);
                ((LottieAnimationView) ((k1) aVar2).f32807b.f32360f).setVisibility(4);
                ta.a aVar3 = jVar.f47886f;
                m.c(aVar3);
                ((LottieAnimationView) ((k1) aVar3).f32807b.f32359e).setVisibility(0);
                ta.a aVar4 = jVar.f47886f;
                m.c(aVar4);
                ((LottieAnimationView) ((k1) aVar4).f32807b.f32359e).h();
                break;
            case 3:
                m.f(animation, "p0");
                n nVar = (n) this.f28227b;
                ta.a aVar5 = nVar.f47886f;
                m.c(aVar5);
                ((LottieAnimationView) ((l1) aVar5).f32837b.f32360f).setVisibility(4);
                ta.a aVar6 = nVar.f47886f;
                m.c(aVar6);
                ((LottieAnimationView) ((l1) aVar6).f32837b.f32359e).setVisibility(0);
                ta.a aVar7 = nVar.f47886f;
                m.c(aVar7);
                ((LottieAnimationView) ((l1) aVar7).f32837b.f32359e).h();
                break;
            case 4:
                m.f(animation, "p0");
                b0 b0Var = (b0) this.f28227b;
                ta.a aVar8 = b0Var.f47886f;
                m.c(aVar8);
                ((LottieAnimationView) ((i1) aVar8).f32680c.f32360f).setVisibility(4);
                ta.a aVar9 = b0Var.f47886f;
                m.c(aVar9);
                ((LottieAnimationView) ((i1) aVar9).f32680c.f32359e).setVisibility(0);
                ta.a aVar10 = b0Var.f47886f;
                m.c(aVar10);
                ((LottieAnimationView) ((i1) aVar10).f32680c.f32359e).h();
                break;
            case 5:
                m.f(animation, "p0");
                f0 f0Var = (f0) this.f28227b;
                ta.a aVar11 = f0Var.f47886f;
                m.c(aVar11);
                ((LottieAnimationView) ((j1) aVar11).f32748b.f33677e).setVisibility(4);
                ta.a aVar12 = f0Var.f47886f;
                m.c(aVar12);
                ((LottieAnimationView) ((j1) aVar12).f32748b.f33676d).setVisibility(0);
                ta.a aVar13 = f0Var.f47886f;
                m.c(aVar13);
                ((LottieAnimationView) ((j1) aVar13).f32748b.f33676d).h();
                break;
            case 6:
                m.f(animation, "p0");
                i0 i0Var = (i0) this.f28227b;
                ta.a aVar14 = i0Var.f47886f;
                m.c(aVar14);
                ((LottieAnimationView) ((q1) aVar14).f33135c.f33677e).setVisibility(4);
                ta.a aVar15 = i0Var.f47886f;
                m.c(aVar15);
                ((LottieAnimationView) ((q1) aVar15).f33135c.f33676d).setVisibility(0);
                ta.a aVar16 = i0Var.f47886f;
                m.c(aVar16);
                ((LottieAnimationView) ((q1) aVar16).f33135c.f33676d).h();
                break;
            case 7:
                m.f(animation, "p0");
                l0 l0Var = (l0) this.f28227b;
                ta.a aVar17 = l0Var.f47886f;
                m.c(aVar17);
                ((LottieAnimationView) ((r1) aVar17).f33206b.f33677e).setVisibility(4);
                ta.a aVar18 = l0Var.f47886f;
                m.c(aVar18);
                ((LottieAnimationView) ((r1) aVar18).f33206b.f33676d).setVisibility(0);
                ta.a aVar19 = l0Var.f47886f;
                m.c(aVar19);
                ((LottieAnimationView) ((r1) aVar19).f33206b.f33676d).h();
                break;
            case 8:
                m.f(animation, "p0");
                l0 l0Var2 = (l0) this.f28227b;
                ta.a aVar20 = l0Var2.f47886f;
                m.c(aVar20);
                ((LottieAnimationView) ((s1) aVar20).f33257b.f32360f).setVisibility(4);
                ta.a aVar21 = l0Var2.f47886f;
                m.c(aVar21);
                ((LottieAnimationView) ((s1) aVar21).f33257b.f32359e).setVisibility(0);
                ta.a aVar22 = l0Var2.f47886f;
                m.c(aVar22);
                ((LottieAnimationView) ((s1) aVar22).f33257b.f32359e).h();
                break;
            case 9:
                m.f(animation, "p0");
                i0 i0Var2 = (i0) this.f28227b;
                ta.a aVar23 = i0Var2.f47886f;
                m.c(aVar23);
                ((LottieAnimationView) ((o1) aVar23).f33010b.f32360f).setVisibility(4);
                ta.a aVar24 = i0Var2.f47886f;
                m.c(aVar24);
                ((LottieAnimationView) ((o1) aVar24).f33010b.f32359e).setVisibility(0);
                ta.a aVar25 = i0Var2.f47886f;
                m.c(aVar25);
                ((LottieAnimationView) ((o1) aVar25).f33010b.f32359e).h();
                break;
            case 10:
                m.f(animation, "p0");
                v0 v0Var = (v0) this.f28227b;
                ta.a aVar26 = v0Var.f47886f;
                m.c(aVar26);
                ((LottieAnimationView) ((p1) aVar26).f33080b.f32360f).setVisibility(4);
                ta.a aVar27 = v0Var.f47886f;
                m.c(aVar27);
                ((LottieAnimationView) ((p1) aVar27).f33080b.f32359e).setVisibility(0);
                ta.a aVar28 = v0Var.f47886f;
                m.c(aVar28);
                ((LottieAnimationView) ((p1) aVar28).f33080b.f32359e).h();
                break;
            case 11:
                ws.b bVar = (ws.b) this.f28227b;
                if (bVar.f55200d) {
                    bVar.c(bVar.f55201e);
                    break;
                }
                break;
            case 12:
                xs.b bVar2 = (xs.b) this.f28227b;
                HwView hwView = bVar2.f56222h;
                if (bVar2.f56219e) {
                    int i11 = bVar2.f56220f + 1;
                    bVar2.f56220f = i11;
                    if (i11 >= hwView.K.size()) {
                        bVar2.f56219e = false;
                        hwView.invalidate();
                        xs.a aVar29 = bVar2.f56216b;
                        if (aVar29 != null) {
                            aVar29.a();
                        }
                    } else {
                        bVar2.b();
                        hwView.postDelayed(new py.b(this, 12), 500L);
                    }
                    break;
                }
                break;
            default:
                i iVar = (i) this.f28227b;
                if (iVar.R) {
                    iVar.R = false;
                    iVar.f56249c.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        String str;
        switch (this.f28226a) {
            case 0:
                return;
            case 1:
                str = "animation";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "p0";
                break;
            case 11:
            case 12:
            default:
                return;
        }
        m.f(animator, str);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        switch (this.f28226a) {
            case 1:
                m.f(animation, "animation");
                h hVar = (h) this.f28227b;
                j6 j6Var = hVar.W;
                if (j6Var != null) {
                    m.c(j6Var);
                    ((ImageView) j6Var.f32798g).setEnabled(false);
                    j6 j6Var2 = hVar.W;
                    m.c(j6Var2);
                    ImageView imageView = (ImageView) j6Var2.f32798g;
                    Context contextRequireContext = hVar.requireContext();
                    m.e(contextRequireContext, "requireContext(...)");
                    imageView.setImageTintList(ColorStateList.valueOf(contextRequireContext.getColor(R.color.second_black)));
                    break;
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                m.f(animation, "p0");
                break;
        }
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }
}
