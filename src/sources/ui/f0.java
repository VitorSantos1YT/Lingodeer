package ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.lingo.lingoskill.chineseskill.ui.pinyin.PinyinLearnActivity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dl.ExOZ.xItStCyvVEZ;
import hj.s4;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends bp.m implements a {
    public a9.i O;
    public xi.c P;
    public bq.e Q;

    public f0() {
        super(e0.f52986a, BuildConfig.VERSION_NAME);
    }

    @Override // ui.a
    public final HashMap k(xi.c pinyinLesson) {
        kotlin.jvm.internal.m.f(pinyinLesson, "pinyinLesson");
        HashMap map = new HashMap();
        map.put(fv.f.f(1, "a"), fv.f.g(1, "a"));
        map.put(fv.f.f(2, "a"), fv.f.g(2, "a"));
        map.put(fv.f.f(3, "a"), fv.f.g(3, "a"));
        map.put(fv.f.f(4, "a"), fv.f.g(4, "a"));
        return map;
    }

    @Override // ji.e
    public final void q() {
        a9.i iVar = this.O;
        if (iVar != null) {
            kotlin.jvm.internal.m.c(iVar);
            iVar.l();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        xi.c cVar = (xi.c) requireArguments().getParcelable(xItStCyvVEZ.wbsjZNWsbCpV);
        this.P = cVar;
        this.O = new a9.i(1);
        kotlin.jvm.internal.m.c(cVar);
        String str = cVar.f56096b;
        kotlin.jvm.internal.m.e(str, "getLessonName(...)");
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        View view = this.f36399e;
        kotlin.jvm.internal.m.c(view);
        ve.i.H(str, mVar, view);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        final int i11 = 0;
        bq.z.b(((s4) aVar).f33271b, new fz.c(this) { // from class: ui.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f52979b;

            {
                this.f52979b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                final int i13 = 2;
                final int i14 = 1;
                final int i15 = 4;
                final int i16 = 3;
                final int i17 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                final f0 f0Var = this.f52979b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = f0Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        int i18 = PinyinLearnActivity.R;
                        l.m mVar3 = f0Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar3);
                        xi.c cVar2 = f0Var.P;
                        kotlin.jvm.internal.m.c(cVar2);
                        f0Var.startActivity(cf.x.A(mVar3, cVar2, 0));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar = f0Var.Q;
                        if (eVar != null) {
                            eVar.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i13) {
                                    case 0:
                                        ta.a aVar2 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar2);
                                        ImageView imageView = ((s4) aVar2).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar3 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar3);
                                        ImageView imageView2 = ((s4) aVar3).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar4 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar4);
                                        ImageView imageView3 = ((s4) aVar4).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar5 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar5);
                                        ImageView imageView4 = ((s4) aVar5).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar6 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar6);
                                        ImageView imageView5 = ((s4) aVar6).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        iVar.f521e = f0Var.Q;
                        a9.i iVar2 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        iVar2.v(com.bumptech.glide.f.r(1, "a"));
                        ta.a aVar2 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar2);
                        android.support.v4.media.session.a.K(((s4) aVar2).f33272c.getBackground());
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar2 = f0Var.Q;
                        if (eVar2 != null) {
                            eVar2.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i15) {
                                    case 0:
                                        ta.a aVar3 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar3);
                                        ImageView imageView = ((s4) aVar3).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar4 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar4);
                                        ImageView imageView2 = ((s4) aVar4).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar5 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar5);
                                        ImageView imageView3 = ((s4) aVar5).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar6 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar6);
                                        ImageView imageView4 = ((s4) aVar6).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar7 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar7);
                                        ImageView imageView5 = ((s4) aVar7).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar3 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        iVar3.f521e = f0Var.Q;
                        a9.i iVar4 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(2, "a"));
                        ta.a aVar3 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar3);
                        android.support.v4.media.session.a.K(((s4) aVar3).f33273d.getBackground());
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar3 = f0Var.Q;
                        if (eVar3 != null) {
                            eVar3.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i14) {
                                    case 0:
                                        ta.a aVar4 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar4);
                                        ImageView imageView = ((s4) aVar4).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar5 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar5);
                                        ImageView imageView2 = ((s4) aVar5).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar6 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar6);
                                        ImageView imageView3 = ((s4) aVar6).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar7 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar7);
                                        ImageView imageView4 = ((s4) aVar7).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar8 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar8);
                                        ImageView imageView5 = ((s4) aVar8).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar5 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.f521e = f0Var.Q;
                        a9.i iVar6 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(3, "a"));
                        ta.a aVar4 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar4);
                        android.support.v4.media.session.a.K(((s4) aVar4).f33274e.getBackground());
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar4 = f0Var.Q;
                        if (eVar4 != null) {
                            eVar4.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i17) {
                                    case 0:
                                        ta.a aVar5 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar5);
                                        ImageView imageView = ((s4) aVar5).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar6 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar6);
                                        ImageView imageView2 = ((s4) aVar6).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar7 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar7);
                                        ImageView imageView3 = ((s4) aVar7).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar8 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar8);
                                        ImageView imageView4 = ((s4) aVar8).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView5 = ((s4) aVar9).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar7 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.f521e = f0Var.Q;
                        a9.i iVar8 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(4, "a"));
                        ta.a aVar5 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar5);
                        android.support.v4.media.session.a.K(((s4) aVar5).f33275f.getBackground());
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar5 = f0Var.Q;
                        if (eVar5 != null) {
                            eVar5.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i16) {
                                    case 0:
                                        ta.a aVar6 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar6);
                                        ImageView imageView = ((s4) aVar6).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar7 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar7);
                                        ImageView imageView2 = ((s4) aVar7).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar8 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar8);
                                        ImageView imageView3 = ((s4) aVar8).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView4 = ((s4) aVar9).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView5 = ((s4) aVar10).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar9 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.f521e = f0Var.Q;
                        a9.i iVar10 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        iVar10.v(com.bumptech.glide.f.r(0, "a"));
                        ta.a aVar6 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar6);
                        android.support.v4.media.session.a.K(((s4) aVar6).f33276g.getBackground());
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        final int i12 = 1;
        bq.z.b(((s4) aVar2).f33272c, new fz.c(this) { // from class: ui.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f52979b;

            {
                this.f52979b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = i12;
                final int i14 = 2;
                final int i15 = 1;
                final int i16 = 4;
                final int i17 = 3;
                final int i18 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                final f0 f0Var = this.f52979b;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = f0Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        int i19 = PinyinLearnActivity.R;
                        l.m mVar3 = f0Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar3);
                        xi.c cVar2 = f0Var.P;
                        kotlin.jvm.internal.m.c(cVar2);
                        f0Var.startActivity(cf.x.A(mVar3, cVar2, 0));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar = f0Var.Q;
                        if (eVar != null) {
                            eVar.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i14) {
                                    case 0:
                                        ta.a aVar6 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar6);
                                        ImageView imageView = ((s4) aVar6).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar7 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar7);
                                        ImageView imageView2 = ((s4) aVar7).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar8 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar8);
                                        ImageView imageView3 = ((s4) aVar8).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView4 = ((s4) aVar9).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView5 = ((s4) aVar10).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        iVar.f521e = f0Var.Q;
                        a9.i iVar2 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        iVar2.v(com.bumptech.glide.f.r(1, "a"));
                        ta.a aVar3 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar3);
                        android.support.v4.media.session.a.K(((s4) aVar3).f33272c.getBackground());
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar2 = f0Var.Q;
                        if (eVar2 != null) {
                            eVar2.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i16) {
                                    case 0:
                                        ta.a aVar6 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar6);
                                        ImageView imageView = ((s4) aVar6).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar7 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar7);
                                        ImageView imageView2 = ((s4) aVar7).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar8 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar8);
                                        ImageView imageView3 = ((s4) aVar8).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView4 = ((s4) aVar9).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView5 = ((s4) aVar10).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar3 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        iVar3.f521e = f0Var.Q;
                        a9.i iVar4 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(2, "a"));
                        ta.a aVar4 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar4);
                        android.support.v4.media.session.a.K(((s4) aVar4).f33273d.getBackground());
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar3 = f0Var.Q;
                        if (eVar3 != null) {
                            eVar3.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i15) {
                                    case 0:
                                        ta.a aVar6 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar6);
                                        ImageView imageView = ((s4) aVar6).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar7 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar7);
                                        ImageView imageView2 = ((s4) aVar7).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar8 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar8);
                                        ImageView imageView3 = ((s4) aVar8).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView4 = ((s4) aVar9).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView5 = ((s4) aVar10).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar5 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.f521e = f0Var.Q;
                        a9.i iVar6 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(3, "a"));
                        ta.a aVar5 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar5);
                        android.support.v4.media.session.a.K(((s4) aVar5).f33274e.getBackground());
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar4 = f0Var.Q;
                        if (eVar4 != null) {
                            eVar4.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i18) {
                                    case 0:
                                        ta.a aVar6 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar6);
                                        ImageView imageView = ((s4) aVar6).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar7 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar7);
                                        ImageView imageView2 = ((s4) aVar7).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar8 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar8);
                                        ImageView imageView3 = ((s4) aVar8).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView4 = ((s4) aVar9).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView5 = ((s4) aVar10).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar7 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.f521e = f0Var.Q;
                        a9.i iVar8 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(4, "a"));
                        ta.a aVar6 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar6);
                        android.support.v4.media.session.a.K(((s4) aVar6).f33275f.getBackground());
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar5 = f0Var.Q;
                        if (eVar5 != null) {
                            eVar5.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i17) {
                                    case 0:
                                        ta.a aVar7 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar7);
                                        ImageView imageView = ((s4) aVar7).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar8 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar8);
                                        ImageView imageView2 = ((s4) aVar8).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView3 = ((s4) aVar9).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView4 = ((s4) aVar10).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView5 = ((s4) aVar11).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar9 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.f521e = f0Var.Q;
                        a9.i iVar10 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        iVar10.v(com.bumptech.glide.f.r(0, "a"));
                        ta.a aVar7 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar7);
                        android.support.v4.media.session.a.K(((s4) aVar7).f33276g.getBackground());
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        final int i13 = 2;
        bq.z.b(((s4) aVar3).f33273d, new fz.c(this) { // from class: ui.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f52979b;

            {
                this.f52979b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i14 = i13;
                final int i15 = 2;
                final int i16 = 1;
                final int i17 = 4;
                final int i18 = 3;
                final int i19 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                final f0 f0Var = this.f52979b;
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = f0Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        int i110 = PinyinLearnActivity.R;
                        l.m mVar3 = f0Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar3);
                        xi.c cVar2 = f0Var.P;
                        kotlin.jvm.internal.m.c(cVar2);
                        f0Var.startActivity(cf.x.A(mVar3, cVar2, 0));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar = f0Var.Q;
                        if (eVar != null) {
                            eVar.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i15) {
                                    case 0:
                                        ta.a aVar7 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar7);
                                        ImageView imageView = ((s4) aVar7).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar8 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar8);
                                        ImageView imageView2 = ((s4) aVar8).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView3 = ((s4) aVar9).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView4 = ((s4) aVar10).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView5 = ((s4) aVar11).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        iVar.f521e = f0Var.Q;
                        a9.i iVar2 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        iVar2.v(com.bumptech.glide.f.r(1, "a"));
                        ta.a aVar4 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar4);
                        android.support.v4.media.session.a.K(((s4) aVar4).f33272c.getBackground());
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar2 = f0Var.Q;
                        if (eVar2 != null) {
                            eVar2.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i17) {
                                    case 0:
                                        ta.a aVar7 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar7);
                                        ImageView imageView = ((s4) aVar7).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar8 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar8);
                                        ImageView imageView2 = ((s4) aVar8).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView3 = ((s4) aVar9).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView4 = ((s4) aVar10).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView5 = ((s4) aVar11).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar3 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        iVar3.f521e = f0Var.Q;
                        a9.i iVar4 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(2, "a"));
                        ta.a aVar5 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar5);
                        android.support.v4.media.session.a.K(((s4) aVar5).f33273d.getBackground());
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar3 = f0Var.Q;
                        if (eVar3 != null) {
                            eVar3.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i16) {
                                    case 0:
                                        ta.a aVar7 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar7);
                                        ImageView imageView = ((s4) aVar7).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar8 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar8);
                                        ImageView imageView2 = ((s4) aVar8).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView3 = ((s4) aVar9).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView4 = ((s4) aVar10).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView5 = ((s4) aVar11).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar5 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.f521e = f0Var.Q;
                        a9.i iVar6 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(3, "a"));
                        ta.a aVar6 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar6);
                        android.support.v4.media.session.a.K(((s4) aVar6).f33274e.getBackground());
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar4 = f0Var.Q;
                        if (eVar4 != null) {
                            eVar4.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i19) {
                                    case 0:
                                        ta.a aVar7 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar7);
                                        ImageView imageView = ((s4) aVar7).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar8 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar8);
                                        ImageView imageView2 = ((s4) aVar8).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView3 = ((s4) aVar9).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView4 = ((s4) aVar10).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView5 = ((s4) aVar11).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar7 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.f521e = f0Var.Q;
                        a9.i iVar8 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(4, "a"));
                        ta.a aVar7 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar7);
                        android.support.v4.media.session.a.K(((s4) aVar7).f33275f.getBackground());
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar5 = f0Var.Q;
                        if (eVar5 != null) {
                            eVar5.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i18) {
                                    case 0:
                                        ta.a aVar8 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar8);
                                        ImageView imageView = ((s4) aVar8).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView2 = ((s4) aVar9).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView3 = ((s4) aVar10).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView4 = ((s4) aVar11).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar12 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar12);
                                        ImageView imageView5 = ((s4) aVar12).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar9 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.f521e = f0Var.Q;
                        a9.i iVar10 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        iVar10.v(com.bumptech.glide.f.r(0, "a"));
                        ta.a aVar8 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar8);
                        android.support.v4.media.session.a.K(((s4) aVar8).f33276g.getBackground());
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        final int i14 = 3;
        bq.z.b(((s4) aVar4).f33274e, new fz.c(this) { // from class: ui.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f52979b;

            {
                this.f52979b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i15 = i14;
                final int i16 = 2;
                final int i17 = 1;
                final int i18 = 4;
                final int i19 = 3;
                final int i110 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                final f0 f0Var = this.f52979b;
                View it = (View) obj;
                switch (i15) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = f0Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        int i111 = PinyinLearnActivity.R;
                        l.m mVar3 = f0Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar3);
                        xi.c cVar2 = f0Var.P;
                        kotlin.jvm.internal.m.c(cVar2);
                        f0Var.startActivity(cf.x.A(mVar3, cVar2, 0));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar = f0Var.Q;
                        if (eVar != null) {
                            eVar.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i16) {
                                    case 0:
                                        ta.a aVar8 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar8);
                                        ImageView imageView = ((s4) aVar8).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView2 = ((s4) aVar9).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView3 = ((s4) aVar10).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView4 = ((s4) aVar11).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar12 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar12);
                                        ImageView imageView5 = ((s4) aVar12).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        iVar.f521e = f0Var.Q;
                        a9.i iVar2 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        iVar2.v(com.bumptech.glide.f.r(1, "a"));
                        ta.a aVar5 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar5);
                        android.support.v4.media.session.a.K(((s4) aVar5).f33272c.getBackground());
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar2 = f0Var.Q;
                        if (eVar2 != null) {
                            eVar2.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i18) {
                                    case 0:
                                        ta.a aVar8 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar8);
                                        ImageView imageView = ((s4) aVar8).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView2 = ((s4) aVar9).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView3 = ((s4) aVar10).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView4 = ((s4) aVar11).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar12 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar12);
                                        ImageView imageView5 = ((s4) aVar12).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar3 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        iVar3.f521e = f0Var.Q;
                        a9.i iVar4 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(2, "a"));
                        ta.a aVar6 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar6);
                        android.support.v4.media.session.a.K(((s4) aVar6).f33273d.getBackground());
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar3 = f0Var.Q;
                        if (eVar3 != null) {
                            eVar3.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i17) {
                                    case 0:
                                        ta.a aVar8 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar8);
                                        ImageView imageView = ((s4) aVar8).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView2 = ((s4) aVar9).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView3 = ((s4) aVar10).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView4 = ((s4) aVar11).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar12 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar12);
                                        ImageView imageView5 = ((s4) aVar12).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar5 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.f521e = f0Var.Q;
                        a9.i iVar6 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(3, "a"));
                        ta.a aVar7 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar7);
                        android.support.v4.media.session.a.K(((s4) aVar7).f33274e.getBackground());
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar4 = f0Var.Q;
                        if (eVar4 != null) {
                            eVar4.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i110) {
                                    case 0:
                                        ta.a aVar8 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar8);
                                        ImageView imageView = ((s4) aVar8).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView2 = ((s4) aVar9).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView3 = ((s4) aVar10).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView4 = ((s4) aVar11).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar12 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar12);
                                        ImageView imageView5 = ((s4) aVar12).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar7 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.f521e = f0Var.Q;
                        a9.i iVar8 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(4, "a"));
                        ta.a aVar8 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar8);
                        android.support.v4.media.session.a.K(((s4) aVar8).f33275f.getBackground());
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar5 = f0Var.Q;
                        if (eVar5 != null) {
                            eVar5.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i19) {
                                    case 0:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView = ((s4) aVar9).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView2 = ((s4) aVar10).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView3 = ((s4) aVar11).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar12 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar12);
                                        ImageView imageView4 = ((s4) aVar12).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar13 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar13);
                                        ImageView imageView5 = ((s4) aVar13).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar9 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.f521e = f0Var.Q;
                        a9.i iVar10 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        iVar10.v(com.bumptech.glide.f.r(0, "a"));
                        ta.a aVar9 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar9);
                        android.support.v4.media.session.a.K(((s4) aVar9).f33276g.getBackground());
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        final int i15 = 4;
        bq.z.b(((s4) aVar5).f33275f, new fz.c(this) { // from class: ui.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f52979b;

            {
                this.f52979b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i16 = i15;
                final int i17 = 2;
                final int i18 = 1;
                final int i19 = 4;
                final int i110 = 3;
                final int i111 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                final f0 f0Var = this.f52979b;
                View it = (View) obj;
                switch (i16) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = f0Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        int i112 = PinyinLearnActivity.R;
                        l.m mVar3 = f0Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar3);
                        xi.c cVar2 = f0Var.P;
                        kotlin.jvm.internal.m.c(cVar2);
                        f0Var.startActivity(cf.x.A(mVar3, cVar2, 0));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar = f0Var.Q;
                        if (eVar != null) {
                            eVar.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i17) {
                                    case 0:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView = ((s4) aVar9).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView2 = ((s4) aVar10).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView3 = ((s4) aVar11).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar12 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar12);
                                        ImageView imageView4 = ((s4) aVar12).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar13 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar13);
                                        ImageView imageView5 = ((s4) aVar13).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        iVar.f521e = f0Var.Q;
                        a9.i iVar2 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        iVar2.v(com.bumptech.glide.f.r(1, "a"));
                        ta.a aVar6 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar6);
                        android.support.v4.media.session.a.K(((s4) aVar6).f33272c.getBackground());
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar2 = f0Var.Q;
                        if (eVar2 != null) {
                            eVar2.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i19) {
                                    case 0:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView = ((s4) aVar9).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView2 = ((s4) aVar10).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView3 = ((s4) aVar11).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar12 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar12);
                                        ImageView imageView4 = ((s4) aVar12).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar13 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar13);
                                        ImageView imageView5 = ((s4) aVar13).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar3 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        iVar3.f521e = f0Var.Q;
                        a9.i iVar4 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(2, "a"));
                        ta.a aVar7 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar7);
                        android.support.v4.media.session.a.K(((s4) aVar7).f33273d.getBackground());
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar3 = f0Var.Q;
                        if (eVar3 != null) {
                            eVar3.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i18) {
                                    case 0:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView = ((s4) aVar9).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView2 = ((s4) aVar10).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView3 = ((s4) aVar11).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar12 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar12);
                                        ImageView imageView4 = ((s4) aVar12).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar13 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar13);
                                        ImageView imageView5 = ((s4) aVar13).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar5 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.f521e = f0Var.Q;
                        a9.i iVar6 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(3, "a"));
                        ta.a aVar8 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar8);
                        android.support.v4.media.session.a.K(((s4) aVar8).f33274e.getBackground());
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar4 = f0Var.Q;
                        if (eVar4 != null) {
                            eVar4.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i111) {
                                    case 0:
                                        ta.a aVar9 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar9);
                                        ImageView imageView = ((s4) aVar9).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView2 = ((s4) aVar10).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView3 = ((s4) aVar11).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar12 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar12);
                                        ImageView imageView4 = ((s4) aVar12).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar13 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar13);
                                        ImageView imageView5 = ((s4) aVar13).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar7 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.f521e = f0Var.Q;
                        a9.i iVar8 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(4, "a"));
                        ta.a aVar9 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar9);
                        android.support.v4.media.session.a.K(((s4) aVar9).f33275f.getBackground());
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar5 = f0Var.Q;
                        if (eVar5 != null) {
                            eVar5.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i110) {
                                    case 0:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView = ((s4) aVar10).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView2 = ((s4) aVar11).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar12 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar12);
                                        ImageView imageView3 = ((s4) aVar12).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar13 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar13);
                                        ImageView imageView4 = ((s4) aVar13).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar14 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar14);
                                        ImageView imageView5 = ((s4) aVar14).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar9 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.f521e = f0Var.Q;
                        a9.i iVar10 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        iVar10.v(com.bumptech.glide.f.r(0, "a"));
                        ta.a aVar10 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar10);
                        android.support.v4.media.session.a.K(((s4) aVar10).f33276g.getBackground());
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        final int i16 = 5;
        bq.z.b(((s4) aVar6).f33276g, new fz.c(this) { // from class: ui.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f52979b;

            {
                this.f52979b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i17 = i16;
                final int i18 = 2;
                final int i19 = 1;
                final int i110 = 4;
                final int i111 = 3;
                final int i112 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                final f0 f0Var = this.f52979b;
                View it = (View) obj;
                switch (i17) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = f0Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        int i113 = PinyinLearnActivity.R;
                        l.m mVar3 = f0Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar3);
                        xi.c cVar2 = f0Var.P;
                        kotlin.jvm.internal.m.c(cVar2);
                        f0Var.startActivity(cf.x.A(mVar3, cVar2, 0));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar = f0Var.Q;
                        if (eVar != null) {
                            eVar.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i18) {
                                    case 0:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView = ((s4) aVar10).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView2 = ((s4) aVar11).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar12 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar12);
                                        ImageView imageView3 = ((s4) aVar12).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar13 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar13);
                                        ImageView imageView4 = ((s4) aVar13).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar14 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar14);
                                        ImageView imageView5 = ((s4) aVar14).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        iVar.f521e = f0Var.Q;
                        a9.i iVar2 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        iVar2.v(com.bumptech.glide.f.r(1, "a"));
                        ta.a aVar7 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar7);
                        android.support.v4.media.session.a.K(((s4) aVar7).f33272c.getBackground());
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar2 = f0Var.Q;
                        if (eVar2 != null) {
                            eVar2.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i110) {
                                    case 0:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView = ((s4) aVar10).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView2 = ((s4) aVar11).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar12 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar12);
                                        ImageView imageView3 = ((s4) aVar12).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar13 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar13);
                                        ImageView imageView4 = ((s4) aVar13).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar14 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar14);
                                        ImageView imageView5 = ((s4) aVar14).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar3 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        iVar3.f521e = f0Var.Q;
                        a9.i iVar4 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(2, "a"));
                        ta.a aVar8 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar8);
                        android.support.v4.media.session.a.K(((s4) aVar8).f33273d.getBackground());
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar3 = f0Var.Q;
                        if (eVar3 != null) {
                            eVar3.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i19) {
                                    case 0:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView = ((s4) aVar10).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView2 = ((s4) aVar11).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar12 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar12);
                                        ImageView imageView3 = ((s4) aVar12).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar13 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar13);
                                        ImageView imageView4 = ((s4) aVar13).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar14 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar14);
                                        ImageView imageView5 = ((s4) aVar14).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar5 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.f521e = f0Var.Q;
                        a9.i iVar6 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(3, "a"));
                        ta.a aVar9 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar9);
                        android.support.v4.media.session.a.K(((s4) aVar9).f33274e.getBackground());
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar4 = f0Var.Q;
                        if (eVar4 != null) {
                            eVar4.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i112) {
                                    case 0:
                                        ta.a aVar10 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar10);
                                        ImageView imageView = ((s4) aVar10).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView2 = ((s4) aVar11).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar12 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar12);
                                        ImageView imageView3 = ((s4) aVar12).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar13 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar13);
                                        ImageView imageView4 = ((s4) aVar13).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar14 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar14);
                                        ImageView imageView5 = ((s4) aVar14).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar7 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.f521e = f0Var.Q;
                        a9.i iVar8 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(4, "a"));
                        ta.a aVar10 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar10);
                        android.support.v4.media.session.a.K(((s4) aVar10).f33275f.getBackground());
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        bq.e eVar5 = f0Var.Q;
                        if (eVar5 != null) {
                            eVar5.a();
                        }
                        f0Var.Q = new bq.e() { // from class: ui.d0
                            @Override // bq.e
                            public final void a() {
                                switch (i111) {
                                    case 0:
                                        ta.a aVar11 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar11);
                                        ImageView imageView = ((s4) aVar11).f33275f;
                                        kotlin.jvm.internal.m.c(imageView);
                                        android.support.v4.media.session.a.H(imageView.getBackground());
                                        break;
                                    case 1:
                                        ta.a aVar12 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar12);
                                        ImageView imageView2 = ((s4) aVar12).f33274e;
                                        kotlin.jvm.internal.m.c(imageView2);
                                        android.support.v4.media.session.a.H(imageView2.getBackground());
                                        break;
                                    case 2:
                                        ta.a aVar13 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar13);
                                        ImageView imageView3 = ((s4) aVar13).f33272c;
                                        kotlin.jvm.internal.m.c(imageView3);
                                        android.support.v4.media.session.a.H(imageView3.getBackground());
                                        break;
                                    case 3:
                                        ta.a aVar14 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar14);
                                        ImageView imageView4 = ((s4) aVar14).f33276g;
                                        kotlin.jvm.internal.m.c(imageView4);
                                        android.support.v4.media.session.a.H(imageView4.getBackground());
                                        break;
                                    default:
                                        ta.a aVar15 = f0Var.f36400f;
                                        kotlin.jvm.internal.m.c(aVar15);
                                        ImageView imageView5 = ((s4) aVar15).f33273d;
                                        kotlin.jvm.internal.m.c(imageView5);
                                        android.support.v4.media.session.a.H(imageView5.getBackground());
                                        break;
                                }
                            }
                        };
                        a9.i iVar9 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.f521e = f0Var.Q;
                        a9.i iVar10 = f0Var.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        iVar10.v(com.bumptech.glide.f.r(0, "a"));
                        ta.a aVar11 = f0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar11);
                        android.support.v4.media.session.a.K(((s4) aVar11).f33276g.getBackground());
                        break;
                }
                return b0Var;
            }
        });
    }
}
