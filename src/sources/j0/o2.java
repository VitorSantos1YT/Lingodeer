package j0;

import android.view.View;
import com.lingodeer.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final WeakHashMap f35353v = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f35354a = b.c(4, "captionBar");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f35355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f35356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f35357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f35358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f35359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f35360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f35361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f35362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k2 f35363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g2 f35364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k2 f35365l;
    public final k2 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k2 f35366n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k2 f35367o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k2 f35368p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k2 f35369q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k2 f35370r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f35371s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35372t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x0 f35373u;

    public o2(View view) {
        a aVarC = b.c(128, "displayCutout");
        this.f35355b = aVarC;
        a aVarC2 = b.c(8, "ime");
        this.f35356c = aVarC2;
        a aVarC3 = b.c(32, "mandatorySystemGestures");
        this.f35357d = aVarC3;
        this.f35358e = b.c(2, "navigationBars");
        this.f35359f = b.c(1, "statusBars");
        a aVarC4 = b.c(519, "systemBars");
        this.f35360g = aVarC4;
        a aVarC5 = b.c(16, "systemGestures");
        this.f35361h = aVarC5;
        a aVarC6 = b.c(64, "tappableElement");
        this.f35362i = aVarC6;
        k2 k2Var = new k2(new b1(0, 0, 0, 0), "waterfall");
        this.f35363j = k2Var;
        this.f35364k = new g2(new g2(aVarC4, aVarC2), aVarC);
        new g2(new g2(new g2(aVarC6, aVarC3), aVarC5), k2Var);
        this.f35365l = b.d(4, "captionBarIgnoringVisibility");
        this.m = b.d(2, "navigationBarsIgnoringVisibility");
        this.f35366n = b.d(1, "statusBarsIgnoringVisibility");
        this.f35367o = b.d(519, "systemBarsIgnoringVisibility");
        this.f35368p = b.d(64, "tappableElementIgnoringVisibility");
        this.f35369q = b.d(8, "imeAnimationTarget");
        this.f35370r = b.d(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f35371s = bool != null ? bool.booleanValue() : false;
        this.f35373u = new x0(this);
    }

    public static void a(o2 o2Var, z4.v1 v1Var) {
        boolean z11 = false;
        o2Var.f35354a.f(v1Var, 0);
        o2Var.f35356c.f(v1Var, 0);
        o2Var.f35355b.f(v1Var, 0);
        o2Var.f35358e.f(v1Var, 0);
        o2Var.f35359f.f(v1Var, 0);
        o2Var.f35360g.f(v1Var, 0);
        o2Var.f35361h.f(v1Var, 0);
        o2Var.f35362i.f(v1Var, 0);
        o2Var.f35357d.f(v1Var, 0);
        o2Var.f35365l.f(c.H(v1Var.f58905a.h(4)));
        o2Var.m.f(c.H(v1Var.f58905a.h(2)));
        o2Var.f35366n.f(c.H(v1Var.f58905a.h(1)));
        o2Var.f35367o.f(c.H(v1Var.f58905a.h(519)));
        o2Var.f35368p.f(c.H(v1Var.f58905a.h(64)));
        z4.j jVarF = v1Var.f58905a.f();
        if (jVarF != null) {
            o2Var.f35363j.f(c.H(jVarF.a()));
        }
        synchronized (x1.l.f55691c) {
            y.j0 j0Var = x1.l.f55698j.f55643h;
            if (j0Var != null && j0Var.h()) {
                z11 = true;
            }
        }
        if (z11) {
            x1.l.a();
        }
    }
}
