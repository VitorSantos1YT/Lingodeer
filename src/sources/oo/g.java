package oo;

import a5.f;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import cf.x;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.speak.object.PodSentence;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dy.j;
import fb.g0;
import hj.j6;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import oo.g;
import qx.d;
import qy.b0;
import th.e;
import zx.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f45657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f45658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f45659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f45661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LifecycleOwner f45662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j6 f45663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f45664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public FlexboxLayout f45665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final th.e f45666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45667l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ey.a f45668n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ey.a f45669o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ey.a f45670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public cj.c f45671q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f45672r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f45673s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45674t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f45675u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public xx.f f45676v;

    public g(Context context, FrameLayout frameLayout, String[] strArr, List mSentences, int i11, boolean z11, LifecycleOwner owner) {
        kotlin.jvm.internal.m.f(mSentences, "mSentences");
        kotlin.jvm.internal.m.f(owner, "owner");
        this.f45656a = context;
        this.f45657b = frameLayout;
        this.f45658c = strArr;
        this.f45659d = mSentences;
        this.f45660e = i11;
        this.f45661f = z11;
        this.f45662g = owner;
        this.f45663h = j6.a(frameLayout);
        this.f45674t = 14;
        this.f45666k = new th.e(context);
        frameLayout.postDelayed(new b2.c(4, frameLayout, new hh.o(this, 27)), 0L);
    }

    public final void a() {
        th.e eVar = this.f45666k;
        if (eVar != null) {
            c();
            eVar.b();
        }
        ey.a aVar = this.f45668n;
        if (aVar != null) {
            fy.c.a(aVar);
        }
        ey.a aVar2 = this.f45669o;
        if (aVar2 != null) {
            fy.c.a(aVar2);
        }
        ey.a aVar3 = this.f45670p;
        if (aVar3 != null) {
            fy.c.a(aVar3);
        }
    }

    public final void b(ArrayList arrayList) {
        int i11;
        this.f45673s = new ArrayList();
        final int i12 = 0;
        if (arrayList != null) {
            int size = arrayList.size();
            i11 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                int[] iArr = bq.r.f4959a;
                long jB = bq.m.B((String) obj);
                i11 += (int) jB;
                ArrayList arrayList2 = this.f45673s;
                kotlin.jvm.internal.m.c(arrayList2);
                arrayList2.add(Long.valueOf(jB));
            }
        } else {
            i11 = 0;
            for (PodSentence podSentence : this.f45659d) {
                String strO = xt.b.a().o();
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                String strM = md.a.m(cf.x.n(), this.f45660e, podSentence.getSid());
                kotlin.jvm.internal.m.c(strM);
                String strM2 = defpackage.e.m(strO, strM);
                int[] iArr2 = bq.r.f4959a;
                long jB2 = bq.m.B(strM2);
                i11 += (int) jB2;
                ArrayList arrayList3 = this.f45673s;
                kotlin.jvm.internal.m.c(arrayList3);
                arrayList3.add(Long.valueOf(jB2));
            }
        }
        j6 j6Var = this.f45663h;
        ProgressBar progressBar = (ProgressBar) j6Var.f32795d;
        ImageView imageView = j6Var.f32793b;
        progressBar.setMax(i11);
        this.f45672r = arrayList;
        th.e eVar = this.f45666k;
        if (eVar != null) {
            eVar.f52417d = new hd.d(this, 25);
        }
        bq.z.b(imageView, new fz.c(this) { // from class: ko.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f38336b;

            {
                this.f38336b = this;
            }

            /* JADX WARN: Code duplicated, block: B:14:0x003d  */
            /* JADX WARN: Code duplicated, block: B:16:0x0041  */
            /* JADX WARN: Code duplicated, block: B:19:0x0048  */
            /* JADX WARN: Code duplicated, block: B:20:0x004c  */
            /* JADX WARN: Code duplicated, block: B:22:0x0052  */
            /* JADX WARN: Code duplicated, block: B:25:0x0066  */
            /* JADX WARN: Code duplicated, block: B:27:0x0071  */
            /* JADX WARN: Code duplicated, block: B:28:0x0075  */
            @Override // fz.c
            public final Object invoke(Object obj2) {
                ey.a aVar;
                j6 j6Var2;
                ey.a aVar2;
                e eVar2;
                int i14 = i12;
                b0 b0Var = b0.f48488a;
                g gVar = this.f38336b;
                View it = (View) obj2;
                switch (i14) {
                    case 0:
                        m.f(it, "it");
                        j6 j6Var3 = gVar.f45663h;
                        e eVar3 = gVar.f45666k;
                        FrameLayout frameLayout = (FrameLayout) j6Var3.f32797f;
                        FrameLayout frameLayout2 = (FrameLayout) j6Var3.f32800i;
                        if (frameLayout.getVisibility() != 8) {
                            m.c(eVar3);
                            if (eVar3.f()) {
                                ey.a aVar3 = gVar.f45668n;
                                if (aVar3 != null && !aVar3.b()) {
                                    ey.a aVar4 = gVar.f45668n;
                                    m.c(aVar4);
                                    fy.c.a(aVar4);
                                }
                                frameLayout.setVisibility(8);
                                frameLayout2.setVisibility(8);
                            }
                        } else {
                            ImageView imageView2 = j6Var3.f32794c;
                            frameLayout.setVisibility(0);
                            frameLayout2.setVisibility(0);
                            m.c(eVar3);
                            if (!eVar3.f()) {
                                imageView2.setImageResource(R.drawable.ic_video_play);
                            } else {
                                imageView2.setImageResource(R.drawable.ic_video_pause);
                                ey.a aVar5 = gVar.f45668n;
                                if (aVar5 != null && !aVar5.b()) {
                                    ey.a aVar6 = gVar.f45668n;
                                    m.c(aVar6);
                                    fy.c.a(aVar6);
                                }
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                j jVar = ky.e.f38937b;
                                int i15 = d.f48466a;
                                Objects.requireNonNull(timeUnit, "unit is null");
                                Objects.requireNonNull(jVar, "scheduler is null");
                                gVar.f45668n = (ey.a) new u(Math.max(0L, 2000L), jVar).b(px.b.a()).c(new f(gVar, 21), c.f38338c);
                            }
                        }
                        break;
                    default:
                        m.f(it, "it");
                        boolean z11 = gVar.f45661f;
                        int i16 = gVar.f45660e;
                        if (z11 || i16 == 1) {
                            aVar = gVar.f45670p;
                            if (aVar != null) {
                                fy.c.a(aVar);
                            }
                            if (gVar.f45667l) {
                                j6Var2 = gVar.f45663h;
                                aVar2 = gVar.f45669o;
                                if (aVar2 != null) {
                                    fy.c.a(aVar2);
                                }
                                gVar.f45667l = false;
                                j6Var2.f32794c.setImageResource(R.drawable.ic_video_pause);
                                if (gVar.m < gVar.f45659d.size()) {
                                    eVar2 = gVar.f45666k;
                                    m.c(eVar2);
                                    if (!eVar2.l()) {
                                        gVar.d();
                                    }
                                } else {
                                    gVar.m = 0;
                                    gVar.d();
                                    ((ProgressBar) j6Var2.f32795d).setProgress(0);
                                }
                                ((FrameLayout) j6Var2.f32797f).setVisibility(8);
                                ((FrameLayout) j6Var2.f32800i).setVisibility(8);
                                gVar.e();
                            } else {
                                gVar.c();
                            }
                        } else {
                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                            if (x.n().keyLanguage == 3 && i16 == x.n().enFreesUnitSortIndex) {
                                aVar = gVar.f45670p;
                                if (aVar != null) {
                                    fy.c.a(aVar);
                                }
                                if (gVar.f45667l) {
                                    gVar.c();
                                } else {
                                    j6Var2 = gVar.f45663h;
                                    aVar2 = gVar.f45669o;
                                    if (aVar2 != null) {
                                        fy.c.a(aVar2);
                                    }
                                    gVar.f45667l = false;
                                    j6Var2.f32794c.setImageResource(R.drawable.ic_video_pause);
                                    if (gVar.m < gVar.f45659d.size()) {
                                        eVar2 = gVar.f45666k;
                                        m.c(eVar2);
                                        if (!eVar2.l()) {
                                            gVar.d();
                                        }
                                    } else {
                                        gVar.m = 0;
                                        gVar.d();
                                        ((ProgressBar) j6Var2.f32795d).setProgress(0);
                                    }
                                    ((FrameLayout) j6Var2.f32797f).setVisibility(8);
                                    ((FrameLayout) j6Var2.f32800i).setVisibility(8);
                                    gVar.e();
                                }
                            } else {
                                g0.w(gVar.f45656a, gVar.f45662g, BuildConfig.VERSION_NAME);
                            }
                        }
                        break;
                }
                return b0Var;
            }
        });
        final int i14 = 1;
        bq.z.b((FrameLayout) j6Var.f32797f, new fz.c(this) { // from class: ko.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f38336b;

            {
                this.f38336b = this;
            }

            /* JADX WARN: Code duplicated, block: B:14:0x003d  */
            /* JADX WARN: Code duplicated, block: B:16:0x0041  */
            /* JADX WARN: Code duplicated, block: B:19:0x0048  */
            /* JADX WARN: Code duplicated, block: B:20:0x004c  */
            /* JADX WARN: Code duplicated, block: B:22:0x0052  */
            /* JADX WARN: Code duplicated, block: B:25:0x0066  */
            /* JADX WARN: Code duplicated, block: B:27:0x0071  */
            /* JADX WARN: Code duplicated, block: B:28:0x0075  */
            @Override // fz.c
            public final Object invoke(Object obj2) {
                ey.a aVar;
                j6 j6Var2;
                ey.a aVar2;
                e eVar2;
                int i15 = i14;
                b0 b0Var = b0.f48488a;
                g gVar = this.f38336b;
                View it = (View) obj2;
                switch (i15) {
                    case 0:
                        m.f(it, "it");
                        j6 j6Var3 = gVar.f45663h;
                        e eVar3 = gVar.f45666k;
                        FrameLayout frameLayout = (FrameLayout) j6Var3.f32797f;
                        FrameLayout frameLayout2 = (FrameLayout) j6Var3.f32800i;
                        if (frameLayout.getVisibility() != 8) {
                            m.c(eVar3);
                            if (eVar3.f()) {
                                ey.a aVar3 = gVar.f45668n;
                                if (aVar3 != null && !aVar3.b()) {
                                    ey.a aVar4 = gVar.f45668n;
                                    m.c(aVar4);
                                    fy.c.a(aVar4);
                                }
                                frameLayout.setVisibility(8);
                                frameLayout2.setVisibility(8);
                            }
                        } else {
                            ImageView imageView2 = j6Var3.f32794c;
                            frameLayout.setVisibility(0);
                            frameLayout2.setVisibility(0);
                            m.c(eVar3);
                            if (!eVar3.f()) {
                                imageView2.setImageResource(R.drawable.ic_video_play);
                            } else {
                                imageView2.setImageResource(R.drawable.ic_video_pause);
                                ey.a aVar5 = gVar.f45668n;
                                if (aVar5 != null && !aVar5.b()) {
                                    ey.a aVar6 = gVar.f45668n;
                                    m.c(aVar6);
                                    fy.c.a(aVar6);
                                }
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                j jVar = ky.e.f38937b;
                                int i16 = d.f48466a;
                                Objects.requireNonNull(timeUnit, "unit is null");
                                Objects.requireNonNull(jVar, "scheduler is null");
                                gVar.f45668n = (ey.a) new u(Math.max(0L, 2000L), jVar).b(px.b.a()).c(new f(gVar, 21), c.f38338c);
                            }
                        }
                        break;
                    default:
                        m.f(it, "it");
                        boolean z11 = gVar.f45661f;
                        int i17 = gVar.f45660e;
                        if (z11 || i17 == 1) {
                            aVar = gVar.f45670p;
                            if (aVar != null) {
                                fy.c.a(aVar);
                            }
                            if (gVar.f45667l) {
                                j6Var2 = gVar.f45663h;
                                aVar2 = gVar.f45669o;
                                if (aVar2 != null) {
                                    fy.c.a(aVar2);
                                }
                                gVar.f45667l = false;
                                j6Var2.f32794c.setImageResource(R.drawable.ic_video_pause);
                                if (gVar.m < gVar.f45659d.size()) {
                                    eVar2 = gVar.f45666k;
                                    m.c(eVar2);
                                    if (!eVar2.l()) {
                                        gVar.d();
                                    }
                                } else {
                                    gVar.m = 0;
                                    gVar.d();
                                    ((ProgressBar) j6Var2.f32795d).setProgress(0);
                                }
                                ((FrameLayout) j6Var2.f32797f).setVisibility(8);
                                ((FrameLayout) j6Var2.f32800i).setVisibility(8);
                                gVar.e();
                            } else {
                                gVar.c();
                            }
                        } else {
                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                            if (x.n().keyLanguage == 3 && i17 == x.n().enFreesUnitSortIndex) {
                                aVar = gVar.f45670p;
                                if (aVar != null) {
                                    fy.c.a(aVar);
                                }
                                if (gVar.f45667l) {
                                    gVar.c();
                                } else {
                                    j6Var2 = gVar.f45663h;
                                    aVar2 = gVar.f45669o;
                                    if (aVar2 != null) {
                                        fy.c.a(aVar2);
                                    }
                                    gVar.f45667l = false;
                                    j6Var2.f32794c.setImageResource(R.drawable.ic_video_pause);
                                    if (gVar.m < gVar.f45659d.size()) {
                                        eVar2 = gVar.f45666k;
                                        m.c(eVar2);
                                        if (!eVar2.l()) {
                                            gVar.d();
                                        }
                                    } else {
                                        gVar.m = 0;
                                        gVar.d();
                                        ((ProgressBar) j6Var2.f32795d).setProgress(0);
                                    }
                                    ((FrameLayout) j6Var2.f32797f).setVisibility(8);
                                    ((FrameLayout) j6Var2.f32800i).setVisibility(8);
                                    gVar.e();
                                }
                            } else {
                                g0.w(gVar.f45656a, gVar.f45662g, BuildConfig.VERSION_NAME);
                            }
                        }
                        break;
                }
                return b0Var;
            }
        });
        c();
        com.bumptech.glide.c.e(this.f45656a).k(this.f45658c[this.m]).x(imageView);
        if (this.f45664i != null) {
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            if (cf.x.n().showStoryTrans) {
                TextView textView = this.f45664i;
                kotlin.jvm.internal.m.c(textView);
                textView.setVisibility(0);
            } else {
                TextView textView2 = this.f45664i;
                kotlin.jvm.internal.m.c(textView2);
                textView2.setVisibility(4);
            }
        }
    }

    public final void c() {
        ey.a aVar = this.f45669o;
        if (aVar != null && !aVar.b()) {
            ey.a aVar2 = this.f45669o;
            kotlin.jvm.internal.m.c(aVar2);
            fy.c.a(aVar2);
        }
        ey.a aVar3 = this.f45668n;
        if (aVar3 != null && !aVar3.b()) {
            ey.a aVar4 = this.f45668n;
            kotlin.jvm.internal.m.c(aVar4);
            fy.c.a(aVar4);
        }
        this.f45667l = true;
        th.e eVar = this.f45666k;
        kotlin.jvm.internal.m.c(eVar);
        eVar.g();
        j6 j6Var = this.f45663h;
        j6Var.f32794c.setImageResource(R.drawable.ic_video_play);
        ((FrameLayout) j6Var.f32797f).setVisibility(0);
        ((FrameLayout) j6Var.f32800i).setVisibility(0);
    }

    public final void d() {
        PodSentence podSentence = (PodSentence) this.f45659d.get(this.m);
        List list = this.f45672r;
        th.e eVar = this.f45666k;
        if (list != null) {
            kotlin.jvm.internal.m.c(eVar);
            List list2 = this.f45672r;
            kotlin.jvm.internal.m.c(list2);
            eVar.h((String) list2.get(this.m));
        } else {
            String strO = xt.b.a().o();
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            String strM = md.a.m(cf.x.n(), this.f45660e, podSentence.getSid());
            kotlin.jvm.internal.m.c(strM);
            String strM2 = defpackage.e.m(strO, strM);
            if (eVar != null) {
                eVar.m(cf.x.n().audioSpeed / 100.0f, false);
            }
            kotlin.jvm.internal.m.c(eVar);
            eVar.h(strM2);
        }
        Context context = this.f45656a;
        com.bumptech.glide.n nVarK = com.bumptech.glide.c.e(context).k(this.f45658c[this.m]);
        ee.d dVar = new ee.d();
        dVar.f7700a = new dm.a(29, false);
        com.bumptech.glide.n nVarA = nVarK.A(dVar);
        j6 j6Var = this.f45663h;
        nVarA.x(j6Var.f32793b);
        if (this.f45665j == null) {
            this.f45665j = (FlexboxLayout) j6Var.f32798g;
        }
        List words = podSentence.getWords();
        FlexboxLayout flexboxLayout = this.f45665j;
        kotlin.jvm.internal.m.c(flexboxLayout);
        this.f45671q = new cj.c(this, context, words, flexboxLayout);
        int[] iArr = bq.r.f4959a;
        if (bq.m.F()) {
            cj.c cVar = this.f45671q;
            kotlin.jvm.internal.m.c(cVar);
            cVar.f59274j = 2;
        } else {
            cj.c cVar2 = this.f45671q;
            kotlin.jvm.internal.m.c(cVar2);
            cVar2.f59274j = ff.h.l(2.0f);
        }
        cj.c cVar3 = this.f45671q;
        kotlin.jvm.internal.m.c(cVar3);
        int i11 = this.f45674t;
        cVar3.f59268d = 0;
        cVar3.f59269e = i11;
        cVar3.f59270f = 0;
        if (this.f45675u) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dy.j jVar = ky.e.f38937b;
            this.f45676v = qx.h.d(150L, 150L, timeUnit, jVar).k(jVar).g(px.b.a()).h(new ob.u(17, this, podSentence), ko.c.f38339d);
        } else {
            cj.c cVar4 = this.f45671q;
            kotlin.jvm.internal.m.c(cVar4);
            int color = context.getColor(R.color.white);
            int color2 = context.getColor(R.color.white);
            int color3 = context.getColor(R.color.white);
            cVar4.f59271g = color;
            cVar4.f59272h = color2;
            cVar4.f59273i = color3;
            cj.c cVar5 = this.f45671q;
            kotlin.jvm.internal.m.c(cVar5);
            cVar5.f59280q = context.getColor(R.color.primary_black);
            cj.c cVar6 = this.f45671q;
            kotlin.jvm.internal.m.c(cVar6);
            cVar6.f59281r = true;
        }
        cj.c cVar7 = this.f45671q;
        kotlin.jvm.internal.m.c(cVar7);
        cVar7.f59278o = false;
        cj.c cVar8 = this.f45671q;
        kotlin.jvm.internal.m.c(cVar8);
        cVar8.f59277n = true;
        cj.c cVar9 = this.f45671q;
        kotlin.jvm.internal.m.c(cVar9);
        cVar9.d();
        TextView textView = this.f45664i;
        if (textView != null) {
            textView.setText(podSentence.getTrans().getTrans());
        }
    }

    public final void e() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dy.j jVar = ky.e.f38937b;
        int i11 = qx.d.f48466a;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(jVar, "scheduler is null");
        this.f45670p = (ey.a) new zx.g(Math.max(0L, 300L), Math.max(0L, 300L), jVar).f(jVar).b(px.b.a()).c(new a5.j(this, 26), ko.c.f38340e);
    }
}
