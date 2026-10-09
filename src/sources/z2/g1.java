package z2;

import h1.y4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1.c3 f58540a = new l1.c3(h0.H);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l1.c3 f58541b = new l1.c3(h0.K);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l1.c3 f58542c = new l1.c3(h0.M);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l1.c3 f58543d = new l1.c3(h0.L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l1.c3 f58544e = new l1.c3(h0.O);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l1.c3 f58545f = new l1.c3(h0.N);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l1.c3 f58546g = new l1.c3(h0.U);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l1.c3 f58547h = new l1.c3(h0.Q);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l1.c3 f58548i = new l1.c3(h0.R);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l1.c3 f58549j = new l1.c3(h0.T);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l1.c3 f58550k = new l1.c3(h0.S);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l1.c3 f58551l = new l1.c3(h0.V);
    public static final l1.c3 m = new l1.c3(h0.W);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l1.c3 f58552n = new l1.c3(h0.X);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l1.c3 f58553o = new l1.c3(h0.f58571b0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final l1.c3 f58554p = new l1.c3(h0.f58569a0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final l1.c3 f58555q = new l1.c3(h0.f58573c0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l1.c3 f58556r = new l1.c3(h0.f58575d0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l1.c3 f58557s = new l1.c3(h0.f58577e0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l1.c3 f58558t = new l1.c3(h0.f58579f0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final l1.c3 f58559u = new l1.c3(h0.Y);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l1.d0 f58560v = new l1.d0(h0.Z);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final l1.c3 f58561w = new l1.c3(h0.P);

    public static final void a(y2.t1 t1Var, r0 r0Var, fz.e eVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1925803616);
        int i12 = i11 | (sVar.f(t1Var) ? 4 : 2) | (sVar.f(r0Var) ? 32 : 16) | (sVar.h(eVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            l1.w1 w1VarA = f58540a.a(t1Var.getAccessibilityManager());
            l1.w1 w1VarA2 = f58541b.a(t1Var.getAutofill());
            l1.w1 w1VarA3 = f58543d.a(t1Var.getAutofillManager());
            l1.w1 w1VarA4 = f58542c.a(t1Var.getAutofillTree());
            l1.w1 w1VarA5 = f58544e.a(t1Var.getClipboardManager());
            l1.w1 w1VarA6 = f58545f.a(t1Var.getClipboard());
            l1.w1 w1VarA7 = f58547h.a(t1Var.getDensity());
            l1.w1 w1VarA8 = f58548i.a(t1Var.getFocusOwner());
            l1.w1 w1VarA9 = f58549j.a(t1Var.getFontLoader());
            w1VarA9.f39493f = false;
            l1.w1 w1VarA10 = f58550k.a(t1Var.getFontFamilyResolver());
            w1VarA10.f39493f = false;
            l1.t.b(new l1.w1[]{w1VarA, w1VarA2, w1VarA3, w1VarA4, w1VarA5, w1VarA6, w1VarA7, w1VarA8, w1VarA9, w1VarA10, f58551l.a(t1Var.getHapticFeedBack()), m.a(t1Var.getInputModeManager()), f58552n.a(t1Var.getLayoutDirection()), f58553o.a(t1Var.getTextInputService()), f58554p.a(t1Var.getSoftwareKeyboardController()), f58555q.a(t1Var.getTextToolbar()), f58556r.a(r0Var), f58557s.a(t1Var.getViewConfiguration()), f58558t.a(t1Var.getWindowInfo()), f58559u.a(t1Var.getPointerIconService()), f58546g.a(t1Var.getGraphicsContext()), u1.b.f52721a.a(t1Var.getRetainedValuesStore())}, eVar, sVar, ((i12 >> 3) & 112) | 8);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y4(t1Var, r0Var, eVar, i11, 5);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
