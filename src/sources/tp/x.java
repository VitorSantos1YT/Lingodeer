package tp;

import android.os.Bundle;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.object.ReviewNewDao;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import com.youth.banner.config.BannerConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends ji.e {
    public int N;
    public int O;
    public int P;
    public final qy.q Q;
    public final qy.q R;
    public ij.d S;
    public final qy.q T;
    public hh.i U;

    public x() {
        super(w.f52504a, "FlashcardFinish");
        final int i11 = 0;
        this.Q = com.bumptech.glide.d.v(new fz.a(this) { // from class: tp.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f52503b;

            {
                this.f52503b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return Boolean.valueOf(this.f52503b.requireArguments().getBoolean(INTENTS.EXTRA_BOOLEAN, false));
                    case 1:
                        return this.f52503b.requireArguments().getString(INTENTS.EXTRA_STRING, BuildConfig.VERSION_NAME);
                    default:
                        return Integer.valueOf(this.f52503b.requireArguments().getInt(xTCJ.xzVM, 0));
                }
            }
        });
        final int i12 = 1;
        this.R = com.bumptech.glide.d.v(new fz.a(this) { // from class: tp.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f52503b;

            {
                this.f52503b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return Boolean.valueOf(this.f52503b.requireArguments().getBoolean(INTENTS.EXTRA_BOOLEAN, false));
                    case 1:
                        return this.f52503b.requireArguments().getString(INTENTS.EXTRA_STRING, BuildConfig.VERSION_NAME);
                    default:
                        return Integer.valueOf(this.f52503b.requireArguments().getInt(xTCJ.xzVM, 0));
                }
            }
        });
        final int i13 = 2;
        this.T = com.bumptech.glide.d.v(new fz.a(this) { // from class: tp.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f52503b;

            {
                this.f52503b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return Boolean.valueOf(this.f52503b.requireArguments().getBoolean(INTENTS.EXTRA_BOOLEAN, false));
                    case 1:
                        return this.f52503b.requireArguments().getString(INTENTS.EXTRA_STRING, BuildConfig.VERSION_NAME);
                    default:
                        return Integer.valueOf(this.f52503b.requireArguments().getInt(xTCJ.xzVM, 0));
                }
            }
        });
    }

    @Override // ji.e, androidx.fragment.app.k0
    public final void onDestroy() {
        super.onDestroy();
        ij.d dVar = this.S;
        if (dVar != null) {
            kotlin.jvm.internal.m.c(dVar);
            dVar.d();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        ArrayList arrayListC1;
        List listK;
        Collection collectionT;
        if (((String) this.R.getValue()) != null) {
            String str = (String) this.R.getValue();
            kotlin.jvm.internal.m.e(str, "<get-result>(...)");
            Pattern patternCompile = Pattern.compile(";");
            kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
            oz.q.U0(0);
            Matcher matcher = patternCompile.matcher(str);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iC = 0;
                do {
                    iC = nv.p.c(matcher, str, iC, arrayList);
                } while (matcher.find());
                nv.p.B(iC, str, arrayList);
                listK = arrayList;
            } else {
                listK = ns.o.K(str.toString());
            }
            if (listK.isEmpty()) {
                collectionT = ry.r.f50854a;
                break;
            }
            ListIterator listIterator = listK.listIterator(listK.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionT = b7.e0.t(listIterator, 1, listK);
                        break;
                    }
                } else {
                    collectionT = ry.r.f50854a;
                    break;
                }
            }
            String[] strArr = (String[]) collectionT.toArray(new String[0]);
            Integer numValueOf = Integer.valueOf(strArr[2]);
            kotlin.jvm.internal.m.e(numValueOf, "valueOf(...)");
            this.N = numValueOf.intValue();
            Integer numValueOf2 = Integer.valueOf(strArr[1]);
            kotlin.jvm.internal.m.e(numValueOf2, "valueOf(...)");
            this.O = numValueOf2.intValue();
            Integer numValueOf3 = Integer.valueOf(strArr[0]);
            kotlin.jvm.internal.m.e(numValueOf3, "valueOf(...)");
            this.P = numValueOf3.intValue();
        }
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        bq.z.b(((hj.s) aVar).f33247b, new s0.a(this, 9));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.s) aVar2).f33252g.setText(String.valueOf(this.N));
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.s) aVar3).f33251f.setText(String.valueOf(this.O));
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.s) aVar4).f33250e.setText(String.valueOf(this.P));
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ((ImageView) ((hj.s) aVar5).f33248c.f33392d).setScaleX(0.5f);
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        ((ImageView) ((hj.s) aVar6).f33248c.f33392d).setScaleY(0.5f);
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        ((ImageView) ((hj.s) aVar7).f33248c.f33392d).setAlpha(0.5f);
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        ((ImageView) ((hj.s) aVar8).f33248c.f33393e).setScaleX(CropImageView.DEFAULT_ASPECT_RATIO);
        ta.a aVar9 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar9);
        ((ImageView) ((hj.s) aVar9).f33248c.f33393e).setScaleX(CropImageView.DEFAULT_ASPECT_RATIO);
        ij.d dVar = new ij.d(23);
        ta.a aVar10 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar10);
        dVar.f34423d = (ImageView) ((hj.s) aVar10).f33248c.f33394f;
        dVar.f34421b = BannerConfig.LOOP_TIME;
        this.S = dVar;
        dVar.E();
        ta.a aVar11 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar11);
        w0 w0VarB = s0.b((ImageView) ((hj.s) aVar11).f33248c.f33392d);
        w0VarB.c(1.0f);
        w0VarB.d(1.0f);
        w0VarB.a(1.0f);
        w0VarB.e(1200L);
        w0VarB.f(new BounceInterpolator());
        w0VarB.i();
        ta.a aVar12 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar12);
        w0 w0VarB2 = s0.b((ImageView) ((hj.s) aVar12).f33248c.f33393e);
        w0VarB2.c(1.0f);
        w0VarB2.d(1.0f);
        w0VarB2.e(1200L);
        w0VarB2.f(new BounceInterpolator());
        w0VarB2.i();
        if (((Boolean) this.Q.getValue()).booleanValue()) {
            if (ij.i.f34434b == null) {
                synchronized (ij.i.class) {
                    if (ij.i.f34434b == null) {
                        ij.i.f34434b = new ij.i();
                    }
                }
            }
            ij.i iVar = ij.i.f34434b;
            kotlin.jvm.internal.m.c(iVar);
            ij.n nVar = iVar.f34435a;
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (cf.x.n().keyLanguage == 0) {
                k10.g gVarQueryBuilder = nVar.f34448h.queryBuilder();
                k10.h hVarD = ReviewNewDao.Properties.Status.d("A", "B");
                k10.h hVarE = ReviewNewDao.Properties.CwsId.e(xt.d.p(cf.x.n().keyLanguage).concat("%"));
                k10.h hVarD2 = ReviewNewDao.Properties.ElemType.d(0, 1, 2);
                org.greenrobot.greendao.d dVar2 = ReviewNewDao.Properties.Unit;
                Long[] lArrS = se.p.S();
                gVarQueryBuilder.f(hVarD, hVarE, hVarD2, dVar2.d(Arrays.copyOf(lArrS, lArrS.length)));
                List listD = gVarQueryBuilder.d();
                ArrayList arrayListR = b7.e0.r("list(...)", listD);
                for (Object obj : listD) {
                    String cwsId = ((ReviewNew) obj).getCwsId();
                    kotlin.jvm.internal.m.e(cwsId, "getCwsId(...)");
                    Object obj2 = oz.q.W0(cwsId, new String[]{"_"}, 0, 6).get(0);
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    if (kotlin.jvm.internal.m.a(obj2, oz.x.q0(xt.d.p(cf.x.n().keyLanguage), "_", BuildConfig.VERSION_NAME))) {
                        arrayListR.add(obj);
                    }
                }
                arrayListC1 = ry.m.c1(arrayListR);
            } else {
                k10.g gVarQueryBuilder2 = nVar.f34448h.queryBuilder();
                k10.h hVarD3 = ReviewNewDao.Properties.Status.d("A", "B");
                k10.h hVarE2 = ReviewNewDao.Properties.CwsId.e(xt.d.p(cf.x.n().keyLanguage).concat("%"));
                k10.h hVarD4 = ReviewNewDao.Properties.ElemType.d(0, 1);
                org.greenrobot.greendao.d dVar3 = ReviewNewDao.Properties.Unit;
                Long[] lArrS2 = se.p.S();
                gVarQueryBuilder2.f(hVarD3, hVarE2, hVarD4, dVar3.d(Arrays.copyOf(lArrS2, lArrS2.length)));
                List listD2 = gVarQueryBuilder2.d();
                ArrayList arrayListR2 = b7.e0.r("list(...)", listD2);
                for (Object obj3 : listD2) {
                    String cwsId2 = ((ReviewNew) obj3).getCwsId();
                    kotlin.jvm.internal.m.e(cwsId2, "getCwsId(...)");
                    Object obj4 = oz.q.W0(cwsId2, new String[]{"_"}, 0, 6).get(0);
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    if (kotlin.jvm.internal.m.a(obj4, oz.x.q0(xt.d.p(cf.x.n().keyLanguage), "_", BuildConfig.VERSION_NAME))) {
                        arrayListR2.add(obj3);
                    }
                }
                arrayListC1 = ry.m.c1(arrayListR2);
            }
            Collections.shuffle(arrayListC1);
            Collections.sort(arrayListC1, new com.google.android.material.button.a(new dt.g(17), 4));
            if (arrayListC1.isEmpty()) {
                ta.a aVar13 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar13);
                ((hj.s) aVar13).f33253h.setVisibility(0);
                ta.a aVar14 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar14);
                ((hj.s) aVar14).f33249d.setVisibility(8);
            }
        }
        String string = getString(R.string._plus_s_xp, String.valueOf(((Number) this.T.getValue()).intValue()));
        kotlin.jvm.internal.m.e(string, "getString(...)");
        ta.a aVar15 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar15);
        ((hj.s) aVar15).f33248c.f33390b.setText(string);
    }
}
