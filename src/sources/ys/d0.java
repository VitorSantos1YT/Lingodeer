package ys;

import aj.uZCn.evRpcb;
import android.graphics.Bitmap;
import android.view.View;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import qp.m4;
import rt.f9;
import rt.g9;
import rt.h9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fz.e f57958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f57959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.e f57960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h9 f57961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ av.n f57962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f57963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ av.n f57964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fz.a f57965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fz.a f57966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fz.c f57967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ vt.n0 f57968k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ot.j1 f57969l;
    public final /* synthetic */ rz.b0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zs.f f57970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ View f57971o;

    public d0(fz.e eVar, fz.e eVar2, fz.e eVar3, h9 h9Var, av.n nVar, kotlin.jvm.internal.y yVar, av.n nVar2, fz.a aVar, fz.a aVar2, fz.c cVar, vt.n0 n0Var, ot.j1 j1Var, rz.b0 b0Var, zs.f fVar, View view) {
        this.f57958a = eVar;
        this.f57959b = eVar2;
        this.f57960c = eVar3;
        this.f57961d = h9Var;
        this.f57962e = nVar;
        this.f57963f = yVar;
        this.f57964g = nVar2;
        this.f57965h = aVar;
        this.f57966i = aVar2;
        this.f57967j = cVar;
        this.f57968k = n0Var;
        this.f57969l = j1Var;
        this.m = b0Var;
        this.f57970n = fVar;
        this.f57971o = view;
    }

    public static void e(d0 d0Var, String str, fz.c cVar, int i11) {
        if ((i11 & 2) != 0) {
            cVar = new ct.a(1, null);
        }
        d0Var.d(str, cVar, 1.0f);
    }

    public final int a() {
        return ((Number) this.f57966i.invoke()).intValue();
    }

    public final void b(boolean z11, boolean z12) {
        this.f57960c.invoke(Boolean.valueOf(z11), Boolean.valueOf(z12));
        f9 f9Var = f9.f49754a;
        h9 h9Var = this.f57961d;
        if (kotlin.jvm.internal.m.a(h9Var, f9Var)) {
            return;
        }
        if (!(h9Var instanceof g9)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((g9) h9Var).f49787b.f50786e) {
            av.n nVar = this.f57962e;
            if (z11) {
                nVar.k(R.raw.correct_sound);
            } else {
                nVar.k(R.raw.wrong_sound);
            }
        }
    }

    public final void c(zs.a aVar) {
        View rootView = this.f57971o;
        kotlin.jvm.internal.m.f(rootView, "rootView");
        Bitmap bitmapB = ks.e.b(rootView, rootView.getContext().getResources().getConfiguration().smallestScreenWidthDp >= 600 ? 1200 : 720);
        uz.i1 i1Var = this.f57970n.f59368d;
        i1Var.l(null, zs.c.a((zs.c) i1Var.getValue(), bitmapB, false, BuildConfig.VERSION_NAME, false, true, false, null, false, aVar, 68));
    }

    public final void d(String audioPath, fz.c onComplete, float f5) {
        kotlin.jvm.internal.m.f(audioPath, "audioPath");
        kotlin.jvm.internal.m.f(onComplete, "onComplete");
        kotlin.jvm.internal.y yVar = this.f57963f;
        rz.g1 g1Var = (rz.g1) yVar.f38361a;
        if (g1Var != null) {
            g1Var.cancel(null);
        }
        av.n nVar = this.f57964g;
        nVar.a();
        nVar.f3172c = new m4(yVar, this.m, onComplete, 10);
        if (f5 == 1.0f) {
            nVar.m(((fr.o0) this.f57968k).f27733a.audioSpeed / 100.0f, false);
        } else {
            nVar.m(f5, false);
        }
        ht.o oVarA = this.f57969l.a();
        try {
            int i11 = oVarA.f33753a;
            int i12 = oVarA.f33755c;
            long j11 = oVarA.f33754b;
            if (i11 != 4) {
                String name = new File(audioPath).getName();
                Pattern patternCompile = Pattern.compile("^(\\w+)-[mf]-w-(\\d+)\\.mp3$");
                kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                kotlin.jvm.internal.m.c(name);
                Matcher matcher = patternCompile.matcher(name);
                kotlin.jvm.internal.m.e(matcher, "matcher(...)");
                oz.l lVarE = se.k.e(matcher, 0, name);
                if (lVarE != null) {
                    long j12 = Long.parseLong((String) ((oz.j) lVarE.a()).get(2));
                    qy.q qVar = fv.b.f28186a;
                    audioPath = fv.b.Y(j12, Long.valueOf(j11), Integer.valueOf(i12));
                } else {
                    Pattern patternCompile2 = Pattern.compile("^(\\w+)-[mf]-s-(\\d+)\\.mp3$");
                    kotlin.jvm.internal.m.e(patternCompile2, "compile(...)");
                    Matcher matcher2 = patternCompile2.matcher(name);
                    kotlin.jvm.internal.m.e(matcher2, "matcher(...)");
                    oz.l lVarE2 = se.k.e(matcher2, 0, name);
                    if (lVarE2 != null) {
                        long j13 = Long.parseLong((String) ((oz.j) lVarE2.a()).get(2));
                        qy.q qVar2 = fv.b.f28186a;
                        audioPath = fv.b.G(j13, Long.valueOf(j11), Integer.valueOf(i12));
                    } else {
                        Pattern patternCompile3 = Pattern.compile("^(\\w+)-[mf]-p-(\\d+)\\.mp3$");
                        kotlin.jvm.internal.m.e(patternCompile3, "compile(...)");
                        Matcher matcher3 = patternCompile3.matcher(name);
                        kotlin.jvm.internal.m.e(matcher3, "matcher(...)");
                        oz.l lVarE3 = se.k.e(matcher3, 0, name);
                        if (lVarE3 != null) {
                            long j14 = Long.parseLong((String) ((oz.j) lVarE3.a()).get(2));
                            qy.q qVar3 = fv.b.f28186a;
                            audioPath = fv.b.x(j14, Long.valueOf(j11), Integer.valueOf(i12));
                        } else {
                            Pattern patternCompile4 = Pattern.compile("^(\\w+)-[mf]-zy-(.+)\\.mp3$");
                            kotlin.jvm.internal.m.e(patternCompile4, "compile(...)");
                            Matcher matcher4 = patternCompile4.matcher(name);
                            kotlin.jvm.internal.m.e(matcher4, "matcher(...)");
                            oz.l lVarE4 = se.k.e(matcher4, 0, name);
                            if (lVarE4 != null) {
                                String str = (String) ((oz.j) lVarE4.a()).get(2);
                                qy.q qVar4 = fv.b.f28186a;
                                audioPath = fv.b.c(str, Long.valueOf(j11), Integer.valueOf(i12));
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        nVar.h(audioPath);
    }

    public final void f() {
        rz.g1 g1Var = (rz.g1) this.f57963f.f38361a;
        if (g1Var != null) {
            g1Var.cancel(null);
        }
        av.n nVar = this.f57964g;
        nVar.a();
        nVar.n();
        this.f57965h.invoke();
    }

    public final void h() {
        av.n nVar = this.f57964g;
        nVar.a();
        nVar.n();
    }

    public final void g(ht.o oVar) {
        kotlin.jvm.internal.m.f(oVar, evRpcb.rFBZCklMoui);
        rz.g1 g1Var = (rz.g1) this.f57963f.f38361a;
        if (g1Var != null) {
            g1Var.cancel(null);
        }
        av.n nVar = this.f57964g;
        nVar.a();
        nVar.n();
        this.f57967j.invoke(oVar);
    }
}
