package km;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.japanskill.ui.syllable.adapter.FiftySoundTipAdapter4;
import com.lingo.lingoskill.japanskill.ui.syllable.adapter.FiftySoundTipAdapter5;
import com.lingo.lingoskill.object.BaseYintuIntel;
import com.lingo.lingoskill.object.YinTu;
import com.lingo.lingoskill.object.YinTuDao;
import com.lingo.lingoskill.object.YouYin;
import com.lingo.lingoskill.object.YouYinDao;
import com.lingo.lingoskill.object.ZhuoYinDao;
import com.lingodeer.R;
import com.lingodeer.data.model.LearnType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import hj.j5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends bp.m {
    public a9.i O;

    public j1() {
        super(l0.f38235a, BuildConfig.VERSION_NAME);
        LearnType learnType = LearnType.LEARN;
    }

    @Override // ji.e, androidx.fragment.app.k0
    public final void onDestroy() {
        super.onDestroy();
        a9.i iVar = this.O;
        if (iVar != null) {
            iVar.y();
            a9.i iVar2 = this.O;
            kotlin.jvm.internal.m.c(iVar2);
            iVar2.l();
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onStop() {
        super.onStop();
        a9.i iVar = this.O;
        if (iVar != null) {
            iVar.y();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        vy.d dVar;
        final int i11;
        List listK;
        Collection collectionT;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        String strY = ff.h.y(contextRequireContext, R.string.introduction);
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        View view = this.f36399e;
        kotlin.jvm.internal.m.c(view);
        ve.i.H(strY, mVar, view);
        getContext();
        this.O = new a9.i(1);
        View view2 = this.f36399e;
        kotlin.jvm.internal.m.c(view2);
        FlexboxLayout flexboxLayout = (FlexboxLayout) view2.findViewById(R.id.flex_fifty_sound_left);
        View view3 = this.f36399e;
        kotlin.jvm.internal.m.c(view3);
        FlexboxLayout flexboxLayout2 = (FlexboxLayout) view3.findViewById(R.id.flex_fifty_sound_top);
        View view4 = this.f36399e;
        kotlin.jvm.internal.m.c(view4);
        RecyclerView recyclerView = (RecyclerView) view4.findViewById(R.id.recycler_fifty_sound_main);
        int[] iArr = {1, 6, 11, 16, 21, 26, 31, 36, 41, 46};
        kotlin.jvm.internal.m.c(flexboxLayout);
        z(flexboxLayout);
        int i12 = 0;
        for (int i13 = 10; i12 < i13; i13 = 10) {
            int i14 = iArr[i12];
            if (dm.a.f23483c == null) {
                synchronized (dm.a.class) {
                    if (dm.a.f23483c == null) {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication);
                        dm.a.f23483c = new dm.a(lingoSkillApplication);
                    }
                }
            }
            dm.a aVar = dm.a.f23483c;
            kotlin.jvm.internal.m.c(aVar);
            YinTu yinTu = (YinTu) aVar.o().load(Long.valueOf(i14));
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.item_recycler_fifty_sound_double_left, (ViewGroup) flexboxLayout, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_top);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_bottom);
            textView.setText(yinTu.getPing());
            Context contextRequireContext2 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
            textView2.setText(ff.h.y(contextRequireContext2, R.string.row));
            flexboxLayout.addView(viewInflate);
            i12++;
        }
        z(flexboxLayout);
        int[] iArr2 = {1, 2, 3, 4, 5};
        int i15 = 0;
        for (int i16 = 5; i15 < i16; i16 = 5) {
            int i17 = iArr2[i15];
            if (dm.a.f23483c == null) {
                synchronized (dm.a.class) {
                    if (dm.a.f23483c == null) {
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication2);
                        dm.a.f23483c = new dm.a(lingoSkillApplication2);
                    }
                }
            }
            dm.a aVar2 = dm.a.f23483c;
            kotlin.jvm.internal.m.c(aVar2);
            YinTu yinTu2 = (YinTu) aVar2.o().load(Long.valueOf(i17));
            View viewInflate2 = LayoutInflater.from(getContext()).inflate(R.layout.item_recycler_fifty_sound_double_tv, (ViewGroup) flexboxLayout2, false);
            TextView textView3 = (TextView) viewInflate2.findViewById(R.id.tv_top);
            TextView textView4 = (TextView) viewInflate2.findViewById(R.id.tv_bottom);
            textView3.setText(yinTu2.getPing());
            Context contextRequireContext3 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
            textView4.setText(ff.h.y(contextRequireContext3, R.string.column));
            Context contextRequireContext4 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
            textView3.setTextColor(contextRequireContext4.getColor(R.color.colorAccent));
            Context contextRequireContext5 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext5, "requireContext(...)");
            textView4.setTextColor(contextRequireContext5.getColor(R.color.colorAccent));
            flexboxLayout2.addView(viewInflate2);
            i15++;
        }
        if (dm.a.f23483c == null) {
            synchronized (dm.a.class) {
                if (dm.a.f23483c == null) {
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication3);
                    dm.a.f23483c = new dm.a(lingoSkillApplication3);
                }
            }
        }
        dm.a aVar3 = dm.a.f23483c;
        kotlin.jvm.internal.m.c(aVar3);
        final List<Object> listLoadAll = aVar3.o().loadAll();
        FiftySoundTipAdapter5 fiftySoundTipAdapter5 = new FiftySoundTipAdapter5(R.layout.item_recycler_fifty_sound_double_tv, listLoadAll);
        getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(5));
        recyclerView.setAdapter(fiftySoundTipAdapter5);
        final int i18 = 0;
        fiftySoundTipAdapter5.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: km.h0
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view5, int i19) {
                int i21 = i18;
                j1 j1Var = this;
                List list = listLoadAll;
                switch (i21) {
                    case 0:
                        qy.q qVar = fv.b.f28186a;
                        String luoMa = ((YinTu) list.get(i19)).getLuoMa();
                        kotlin.jvm.internal.m.e(luoMa, "getLuoMa(...)");
                        String strC = fv.b.c(luoMa, null, null);
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        iVar.v(strC);
                        break;
                    default:
                        qy.q qVar2 = fv.b.f28186a;
                        String luoMa2 = ((YinTu) list.get(i19)).getLuoMa();
                        kotlin.jvm.internal.m.e(luoMa2, "getLuoMa(...)");
                        String strC2 = fv.b.c(luoMa2, null, null);
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        iVar2.v(strC2);
                        break;
                }
            }
        });
        ArrayList arrayList = new ArrayList();
        String string = getString(R.string.row);
        String string2 = getString(R.string.kurei_shiki);
        String string3 = getString(R.string.hepburn);
        StringBuilder sbS = defpackage.e.s("た-", string, "#", string2, "#");
        sbS.append(string3);
        arrayList.add(sbS.toString());
        arrayList.add("た#ta#ta");
        arrayList.add("ち#ti#chi");
        arrayList.add("つ#tu#tsu");
        arrayList.add("て#te#te");
        arrayList.add("と#to#to");
        FiftySoundTipAdapter4 fiftySoundTipAdapter4 = new FiftySoundTipAdapter4(R.layout.item_recycler_fifty_sound_single_tv, arrayList);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        RecyclerView recyclerView2 = ((j5) aVar4).f32788i;
        getContext();
        recyclerView2.setLayoutManager(new GridLayoutManager(6));
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ((j5) aVar5).f32788i.setAdapter(fiftySoundTipAdapter4);
        fiftySoundTipAdapter4.setOnItemChildClickListener(new j0(arrayList, this, 1));
        if (dm.a.f23483c == null) {
            synchronized (dm.a.class) {
                if (dm.a.f23483c == null) {
                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                    dm.a.f23483c = new dm.a(lingoSkillApplication4);
                }
            }
        }
        dm.a aVar6 = dm.a.f23483c;
        kotlin.jvm.internal.m.c(aVar6);
        k10.g gVarQueryBuilder = aVar6.o().queryBuilder();
        org.greenrobot.greendao.d dVar2 = YinTuDao.Properties.Id;
        gVarQueryBuilder.f(dVar2.a(41, 45), new k10.h[0]);
        final List listD = gVarQueryBuilder.d();
        listD.add(0, new YinTu(0L, "ら", BuildConfig.VERSION_NAME, getString(R.string.row)));
        FiftySoundTipAdapter5 fiftySoundTipAdapter6 = new FiftySoundTipAdapter5(R.layout.item_recycler_fifty_sound_double_tv, listD);
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        RecyclerView recyclerView3 = ((j5) aVar7).f32789j;
        getContext();
        recyclerView3.setLayoutManager(new GridLayoutManager(6));
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        ((j5) aVar8).f32789j.setAdapter(fiftySoundTipAdapter6);
        final int i19 = 1;
        fiftySoundTipAdapter6.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: km.h0
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view5, int i110) {
                int i21 = i19;
                j1 j1Var = this;
                List list = listD;
                switch (i21) {
                    case 0:
                        qy.q qVar = fv.b.f28186a;
                        String luoMa = ((YinTu) list.get(i110)).getLuoMa();
                        kotlin.jvm.internal.m.e(luoMa, "getLuoMa(...)");
                        String strC = fv.b.c(luoMa, null, null);
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        iVar.v(strC);
                        break;
                    default:
                        qy.q qVar2 = fv.b.f28186a;
                        String luoMa2 = ((YinTu) list.get(i110)).getLuoMa();
                        kotlin.jvm.internal.m.e(luoMa2, "getLuoMa(...)");
                        String strC2 = fv.b.c(luoMa2, null, null);
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        iVar2.v(strC2);
                        break;
                }
            }
        });
        ArrayList arrayList2 = new ArrayList();
        k10.g gVarQueryBuilder2 = j3.J().o().queryBuilder();
        gVarQueryBuilder2.f(dVar2.a(36, 40), new k10.h[0]);
        List listD2 = gVarQueryBuilder2.d();
        arrayList2.add(new YinTu(0L, "や", BuildConfig.VERSION_NAME, getString(R.string.row)));
        arrayList2.addAll(listD2);
        k10.g gVarQueryBuilder3 = j3.J().o().queryBuilder();
        gVarQueryBuilder3.f(dVar2.a(46, 50), new k10.h[0]);
        List listD3 = gVarQueryBuilder3.d();
        arrayList2.add(new YinTu(0L, "わ", BuildConfig.VERSION_NAME, getString(R.string.row)));
        arrayList2.addAll(listD3);
        FiftySoundTipAdapter5 fiftySoundTipAdapter7 = new FiftySoundTipAdapter5(R.layout.item_recycler_fifty_sound_double_tv, arrayList2);
        ta.a aVar9 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar9);
        RecyclerView recyclerView4 = ((j5) aVar9).f32790k;
        getContext();
        recyclerView4.setLayoutManager(new GridLayoutManager(6));
        ta.a aVar10 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar10);
        ((j5) aVar10).f32790k.setAdapter(fiftySoundTipAdapter7);
        fiftySoundTipAdapter7.setOnItemClickListener(new j0(arrayList2, this, 0));
        ArrayList arrayList3 = new ArrayList();
        if (dm.a.f23483c == null) {
            synchronized (dm.a.class) {
                if (dm.a.f23483c == null) {
                    LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication5);
                    dm.a.f23483c = new dm.a(lingoSkillApplication5);
                }
            }
        }
        dm.a aVar11 = dm.a.f23483c;
        kotlin.jvm.internal.m.c(aVar11);
        arrayList3.add(aVar11.o().load(51L));
        FiftySoundTipAdapter5 fiftySoundTipAdapter8 = new FiftySoundTipAdapter5(R.layout.item_recycler_fifty_sound_double_tv, arrayList3);
        ta.a aVar12 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar12);
        RecyclerView recyclerView5 = ((j5) aVar12).f32791l;
        getContext();
        recyclerView5.setLayoutManager(new GridLayoutManager(6));
        ta.a aVar13 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar13);
        ((j5) aVar13).f32791l.setAdapter(fiftySoundTipAdapter8);
        fiftySoundTipAdapter8.setOnItemClickListener(new j0(arrayList3, this, 2));
        View view5 = this.f36399e;
        kotlin.jvm.internal.m.c(view5);
        FlexboxLayout flexboxLayout3 = (FlexboxLayout) view5.findViewById(R.id.flex_voiced_1);
        View view6 = this.f36399e;
        kotlin.jvm.internal.m.c(view6);
        FlexboxLayout flexboxLayout4 = (FlexboxLayout) view6.findViewById(R.id.flex_voiced_2);
        View view7 = this.f36399e;
        kotlin.jvm.internal.m.c(view7);
        FlexboxLayout flexboxLayout5 = (FlexboxLayout) view7.findViewById(R.id.flex_voiced_3);
        View view8 = this.f36399e;
        kotlin.jvm.internal.m.c(view8);
        FlexboxLayout flexboxLayout6 = (FlexboxLayout) view8.findViewById(R.id.flex_voiced_4);
        View view9 = this.f36399e;
        kotlin.jvm.internal.m.c(view9);
        FlexboxLayout flexboxLayout7 = (FlexboxLayout) view9.findViewById(R.id.flex_voiced_5);
        View view10 = this.f36399e;
        kotlin.jvm.internal.m.c(view10);
        FlexboxLayout flexboxLayout8 = (FlexboxLayout) view10.findViewById(R.id.flex_voiced_6);
        View view11 = this.f36399e;
        kotlin.jvm.internal.m.c(view11);
        FlexboxLayout flexboxLayout9 = (FlexboxLayout) view11.findViewById(R.id.flex_voiced_7);
        View view12 = this.f36399e;
        kotlin.jvm.internal.m.c(view12);
        int i21 = 6;
        FlexboxLayout flexboxLayout10 = (FlexboxLayout) view12.findViewById(R.id.flex_voiced_8);
        View view13 = this.f36399e;
        kotlin.jvm.internal.m.c(view13);
        FlexboxLayout flexboxLayout11 = (FlexboxLayout) view13.findViewById(R.id.flex_voiced_9);
        k10.g gVarQueryBuilder4 = j3.J().o().queryBuilder();
        gVarQueryBuilder4.f(dVar2.a(6, 10), new k10.h[0]);
        List listD4 = gVarQueryBuilder4.d();
        kotlin.jvm.internal.m.c(flexboxLayout3);
        kotlin.jvm.internal.m.c(listD4);
        x(flexboxLayout3, "( k )", listD4, 0);
        k10.g gVarQueryBuilder5 = j3.J().t().queryBuilder();
        org.greenrobot.greendao.d dVar3 = ZhuoYinDao.Properties.Id;
        gVarQueryBuilder5.f(dVar3.a(1, 5), new k10.h[0]);
        List listD5 = gVarQueryBuilder5.d();
        kotlin.jvm.internal.m.c(flexboxLayout4);
        kotlin.jvm.internal.m.c(listD5);
        x(flexboxLayout4, "( g )", listD5, 1);
        k10.g gVarQueryBuilder6 = j3.J().o().queryBuilder();
        gVarQueryBuilder6.f(dVar2.a(11, 15), new k10.h[0]);
        List listD6 = gVarQueryBuilder6.d();
        kotlin.jvm.internal.m.c(flexboxLayout5);
        kotlin.jvm.internal.m.c(listD6);
        x(flexboxLayout5, "( s )", listD6, 0);
        k10.g gVarQueryBuilder7 = j3.J().t().queryBuilder();
        gVarQueryBuilder7.f(dVar3.a(6, 10), new k10.h[0]);
        List listD7 = gVarQueryBuilder7.d();
        kotlin.jvm.internal.m.c(flexboxLayout6);
        kotlin.jvm.internal.m.c(listD7);
        x(flexboxLayout6, "( z )", listD7, 1);
        k10.g gVarQueryBuilder8 = j3.J().o().queryBuilder();
        gVarQueryBuilder8.f(dVar2.a(16, 20), new k10.h[0]);
        List listD8 = gVarQueryBuilder8.d();
        kotlin.jvm.internal.m.c(flexboxLayout7);
        kotlin.jvm.internal.m.c(listD8);
        x(flexboxLayout7, "( t )", listD8, 0);
        k10.g gVarQueryBuilder9 = j3.J().t().queryBuilder();
        gVarQueryBuilder9.f(dVar3.a(11, 15), new k10.h[0]);
        List listD9 = gVarQueryBuilder9.d();
        kotlin.jvm.internal.m.c(flexboxLayout8);
        kotlin.jvm.internal.m.c(listD9);
        x(flexboxLayout8, "( d )", listD9, 1);
        k10.g gVarQueryBuilder10 = j3.J().o().queryBuilder();
        gVarQueryBuilder10.f(dVar2.a(26, 30), new k10.h[0]);
        List listD10 = gVarQueryBuilder10.d();
        kotlin.jvm.internal.m.c(flexboxLayout9);
        kotlin.jvm.internal.m.c(listD10);
        x(flexboxLayout9, "( h )", listD10, 0);
        k10.g gVarQueryBuilder11 = j3.J().t().queryBuilder();
        gVarQueryBuilder11.f(dVar3.a(16, 20), new k10.h[0]);
        List listD11 = gVarQueryBuilder11.d();
        kotlin.jvm.internal.m.c(flexboxLayout10);
        kotlin.jvm.internal.m.c(listD11);
        x(flexboxLayout10, "( b )", listD11, 1);
        k10.g gVarQueryBuilder12 = j3.J().t().queryBuilder();
        gVarQueryBuilder12.f(dVar3.a(21, 25), new k10.h[0]);
        List listD12 = gVarQueryBuilder12.d();
        kotlin.jvm.internal.m.c(flexboxLayout11);
        kotlin.jvm.internal.m.c(listD12);
        x(flexboxLayout11, "( p )", listD12, 1);
        View view14 = this.f36399e;
        kotlin.jvm.internal.m.c(view14);
        FlexboxLayout flexboxLayout12 = (FlexboxLayout) view14.findViewById(R.id.flex_yoon_1);
        View view15 = this.f36399e;
        kotlin.jvm.internal.m.c(view15);
        FlexboxLayout flexboxLayout13 = (FlexboxLayout) view15.findViewById(R.id.flex_yoon_2);
        View view16 = this.f36399e;
        kotlin.jvm.internal.m.c(view16);
        FlexboxLayout flexboxLayout14 = (FlexboxLayout) view16.findViewById(R.id.flex_yoon_3);
        k10.g gVarQueryBuilder13 = j3.J().o().queryBuilder();
        final int i22 = 7;
        gVarQueryBuilder13.f(dVar2.d(7, 12, 17, 22, 27, 32, 42), new k10.h[0]);
        List listD13 = gVarQueryBuilder13.d();
        kotlin.jvm.internal.m.c(flexboxLayout12);
        kotlin.jvm.internal.m.c(listD13);
        y(flexboxLayout12, listD13);
        k10.g gVarQueryBuilder14 = j3.J().t().queryBuilder();
        gVarQueryBuilder14.f(dVar3.d(7, 17, 22), new k10.h[0]);
        List listD14 = gVarQueryBuilder14.d();
        kotlin.jvm.internal.m.c(listD14);
        y(flexboxLayout12, listD14);
        k10.g gVarQueryBuilder15 = j3.J().o().queryBuilder();
        gVarQueryBuilder15.f(dVar2.d(36, 38, 40), new k10.h[0]);
        for (final YinTu yinTu3 : gVarQueryBuilder15.d()) {
            final int i23 = 0;
            View viewInflate3 = LayoutInflater.from(getContext()).inflate(R.layout.item_flex_yoon_2, (ViewGroup) flexboxLayout13, false);
            ((TextView) viewInflate3.findViewById(R.id.f22244tv)).setText(yinTu3.getPing());
            bq.z.b(viewInflate3, new fz.c(this) { // from class: km.i0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j1 f38213b;

                {
                    this.f38213b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    int i24 = i23;
                    qy.b0 b0Var = qy.b0.f48488a;
                    YinTu yinTu4 = yinTu3;
                    j1 j1Var = this.f38213b;
                    View it = (View) obj;
                    switch (i24) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            a9.i iVar = j1Var.O;
                            kotlin.jvm.internal.m.c(iVar);
                            qy.q qVar = fv.b.f28186a;
                            String luoMa = yinTu4.getLuoMa();
                            kotlin.jvm.internal.m.e(luoMa, "getLuoMa(...)");
                            iVar.v(fv.b.c(luoMa, null, null));
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            a9.i iVar2 = j1Var.O;
                            kotlin.jvm.internal.m.c(iVar2);
                            qy.q qVar2 = fv.b.f28186a;
                            String luoMa2 = yinTu4.getLuoMa();
                            kotlin.jvm.internal.m.e(luoMa2, "getLuoMa(...)");
                            iVar2.v(fv.b.c(luoMa2, null, null));
                            break;
                    }
                    return b0Var;
                }
            });
            flexboxLayout13.addView(viewInflate3);
        }
        if (dm.a.f23483c == null) {
            synchronized (dm.a.class) {
                if (dm.a.f23483c == null) {
                    LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication6);
                    dm.a.f23483c = new dm.a(lingoSkillApplication6);
                }
            }
        }
        dm.a aVar14 = dm.a.f23483c;
        kotlin.jvm.internal.m.c(aVar14);
        k10.g gVarQueryBuilder16 = aVar14.s().queryBuilder();
        gVarQueryBuilder16.f(YouYinDao.Properties.Id.d(10, 2, 15), new k10.h[0]);
        for (YouYin youYin : gVarQueryBuilder16.d()) {
            View viewInflate4 = LayoutInflater.from(getContext()).inflate(R.layout.item_flex_yoon_3, (ViewGroup) flexboxLayout14, false);
            TextView textView5 = (TextView) viewInflate4.findViewById(R.id.tv_top);
            TextView textView6 = (TextView) viewInflate4.findViewById(R.id.tv_bottom);
            textView5.setText(youYin.getPing());
            textView6.setText(youYin.getLuoMa());
            Context contextRequireContext6 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext6, "requireContext(...)");
            textView5.setTextColor(contextRequireContext6.getColor(R.color.colorAccent));
            Context contextRequireContext7 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext7, "requireContext(...)");
            textView6.setTextColor(contextRequireContext7.getColor(R.color.colorAccent));
            bq.z.b(viewInflate4, new j9.h(i21, this, youYin));
            flexboxLayout14.addView(viewInflate4);
            i21 = 6;
        }
        final int i24 = 17;
        View viewInflate5 = LayoutInflater.from(getContext()).inflate(R.layout.item_flex_yoon_3, (ViewGroup) flexboxLayout14, false);
        TextView textView7 = (TextView) viewInflate5.findViewById(R.id.tv_top);
        TextView textView8 = (TextView) viewInflate5.findViewById(R.id.tv_bottom);
        textView7.setText("...");
        textView8.setText(BuildConfig.VERSION_NAME);
        Context contextRequireContext8 = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext8, "requireContext(...)");
        textView7.setTextColor(contextRequireContext8.getColor(R.color.colorAccent));
        ep.a.z(requireContext(), "requireContext(...)", R.color.colorAccent, textView8);
        flexboxLayout14.addView(viewInflate5);
        int[] iArr3 = {17, 2108, 2501};
        int i25 = 0;
        while (true) {
            dVar = null;
            if (i25 >= 3) {
                break;
            }
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new bp.h2(iArr3[i25], this, dVar, i22), 3);
            i25++;
        }
        View view17 = this.f36399e;
        kotlin.jvm.internal.m.c(view17);
        FlexboxLayout flexboxLayout15 = (FlexboxLayout) view17.findViewById(R.id.flex_long_vowels_1);
        View view18 = this.f36399e;
        kotlin.jvm.internal.m.c(view18);
        FlexboxLayout flexboxLayout16 = (FlexboxLayout) view18.findViewById(R.id.flex_long_vowels_2);
        View view19 = this.f36399e;
        kotlin.jvm.internal.m.c(view19);
        FlexboxLayout flexboxLayout17 = (FlexboxLayout) view19.findViewById(R.id.flex_long_vowels_3);
        String[] strArr = {ep.a.g("あ/a-", getString(R.string.column), "\nあ・か・さ・た…"), ep.a.g("い/i-", getString(R.string.column), "\nい・き・し・ち…"), ep.a.g("う/u-", getString(R.string.column), "\nう・く・す・つ…"), ep.a.g("え/e-", getString(R.string.column), "\nえ・け・せ・て…"), ep.a.g("お/o-", getString(R.string.column), "\nお・こ・そ・と…")};
        for (int i26 = 0; i26 < 5; i26++) {
            String str = strArr[i26];
            Matcher matcher = b7.e0.u(0, "\n", "compile(...)", str, "input").matcher(str);
            if (matcher.find()) {
                ArrayList arrayList4 = new ArrayList(10);
                int iC = 0;
                do {
                    iC = nv.p.c(matcher, str, iC, arrayList4);
                } while (matcher.find());
                nv.p.B(iC, str, arrayList4);
                listK = arrayList4;
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
            String[] strArr2 = (String[]) collectionT.toArray(new String[0]);
            View viewInflate6 = LayoutInflater.from(getContext()).inflate(R.layout.item_long_vowels_table_1, (ViewGroup) flexboxLayout15, false);
            TextView textView9 = (TextView) viewInflate6.findViewById(R.id.tv_top);
            TextView textView10 = (TextView) viewInflate6.findViewById(R.id.tv_btm);
            textView9.setText(strArr2[0]);
            textView10.setText(strArr2[1]);
            flexboxLayout15.addView(viewInflate6);
        }
        int[] iArr4 = {1, 2, 3, 4, 5, 2, 3};
        for (int i27 = 0; i27 < 7; i27++) {
            if (dm.a.f23483c == null) {
                synchronized (dm.a.class) {
                    if (dm.a.f23483c == null) {
                        LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication7);
                        dm.a.f23483c = new dm.a(lingoSkillApplication7);
                    }
                }
            }
            dm.a aVar15 = dm.a.f23483c;
            kotlin.jvm.internal.m.c(aVar15);
            final YinTu yinTu4 = (YinTu) aVar15.o().load(Long.valueOf(iArr4[i27]));
            View viewInflate7 = LayoutInflater.from(getContext()).inflate(R.layout.item_long_vowels_table_2, (ViewGroup) flexboxLayout16, false);
            ((TextView) viewInflate7.findViewById(R.id.tv_top)).setText(yinTu4.getPing());
            if (i27 == 5) {
                FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(ff.h.l(60.0f), ff.h.l(60.0f));
                i11 = 1;
                layoutParams.L = true;
                viewInflate7.setLayoutParams(layoutParams);
            } else {
                i11 = 1;
            }
            bq.z.b(viewInflate7, new fz.c(this) { // from class: km.i0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j1 f38213b;

                {
                    this.f38213b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    int i28 = i11;
                    qy.b0 b0Var = qy.b0.f48488a;
                    YinTu yinTu5 = yinTu4;
                    j1 j1Var = this.f38213b;
                    View it = (View) obj;
                    switch (i28) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            a9.i iVar = j1Var.O;
                            kotlin.jvm.internal.m.c(iVar);
                            qy.q qVar = fv.b.f28186a;
                            String luoMa = yinTu5.getLuoMa();
                            kotlin.jvm.internal.m.e(luoMa, "getLuoMa(...)");
                            iVar.v(fv.b.c(luoMa, null, null));
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            a9.i iVar2 = j1Var.O;
                            kotlin.jvm.internal.m.c(iVar2);
                            qy.q qVar2 = fv.b.f28186a;
                            String luoMa2 = yinTu5.getLuoMa();
                            kotlin.jvm.internal.m.e(luoMa2, "getLuoMa(...)");
                            iVar2.v(fv.b.c(luoMa2, null, null));
                            break;
                    }
                    return b0Var;
                }
            });
            flexboxLayout16.addView(viewInflate7);
        }
        int[] iArr5 = {2662, 158, 30, 718, 159};
        for (int i28 = 0; i28 < 5; i28++) {
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new o0(iArr5[i28], this, flexboxLayout17, dVar, 0), 3);
        }
        View view20 = this.f36399e;
        kotlin.jvm.internal.m.c(view20);
        FlexboxLayout flexboxLayout18 = (FlexboxLayout) view20.findViewById(R.id.flex_sokuon_3);
        int[] iArr6 = {231, 431, 1443};
        for (int i29 = 0; i29 < 3; i29++) {
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new o0(iArr6[i29], this, flexboxLayout18, dVar, 1), 3);
        }
        ta.a aVar16 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar16);
        final int i30 = 16;
        bq.z.b(((j5) aVar16).f32785f.f32581f, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i31 = i30;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i31) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar17 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar17);
        final int i31 = 3;
        bq.z.b((TextView) ((j5) aVar17).f32783d.f33392d, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i32 = i31;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i32) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar18 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar18);
        final int i32 = 8;
        bq.z.b(((j5) aVar18).f32786g.f32634c, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i33 = i32;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i33) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar19 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar19);
        final int i33 = 9;
        bq.z.b((LinearLayout) ((j5) aVar19).f32784e.f32407c, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i34 = i33;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i34) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar20 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar20);
        final int i34 = 10;
        bq.z.b(((j5) aVar20).f32785f.f32582g, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i35 = i34;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i35) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar21 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar21);
        final int i35 = 11;
        bq.z.b(((j5) aVar21).f32785f.f32578c, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i36 = i35;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i36) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar22 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar22);
        final int i36 = 12;
        bq.z.b(((j5) aVar22).f32785f.f32583h, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i37 = i36;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i37) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar23 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar23);
        final int i37 = 13;
        bq.z.b(((j5) aVar23).f32785f.f32580e, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i38 = i37;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i38) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar24 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar24);
        final int i38 = 14;
        bq.z.b(((j5) aVar24).f32787h.f32636e, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i39 = i38;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i39) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar25 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar25);
        final int i39 = 15;
        bq.z.b((TextView) ((j5) aVar25).f32783d.f33393e, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i310 = i39;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i310) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar26 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar26);
        bq.z.b(((j5) aVar26).f32783d.f33390b, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i310 = i24;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i310) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar27 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar27);
        final int i40 = 18;
        bq.z.b((TextView) ((j5) aVar27).f32783d.f33394f, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i310 = i40;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i310) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar28 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar28);
        final int i41 = 19;
        bq.z.b(((j5) aVar28).f32787h.f32635d, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i310 = i41;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i310) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar29 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar29);
        final int i42 = 20;
        bq.z.b(((j5) aVar29).f32787h.f32634c, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i310 = i42;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i310) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar30 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar30);
        final int i43 = 21;
        bq.z.b(((j5) aVar30).f32786g.f32635d, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i310 = i43;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i310) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar31 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar31);
        final int i44 = 22;
        bq.z.b((LinearLayout) ((j5) aVar31).f32784e.f32408d, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i310 = i44;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i310) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar32 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar32);
        final int i45 = 23;
        bq.z.b(((j5) aVar32).f32786g.f32636e, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i310 = i45;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i310) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar33 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar33);
        final int i46 = 0;
        bq.z.b((LinearLayout) ((j5) aVar33).f32784e.f32409e, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i310 = i46;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i310) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar34 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar34);
        final int i47 = 1;
        bq.z.b(((j5) aVar34).f32782c.f32356b, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i310 = i47;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i310) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar35 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar35);
        final int i48 = 2;
        bq.z.b((TextView) ((j5) aVar35).f32782c.f32362h, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i310 = i48;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i310) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar36 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar36);
        final int i49 = 4;
        bq.z.b((TextView) ((j5) aVar36).f32782c.f32361g, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i310 = i49;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i310) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar37 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar37);
        final int i50 = 5;
        bq.z.b((LinearLayout) ((j5) aVar37).f32782c.f32358d, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i310 = i50;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i310) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar38 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar38);
        final int i51 = 6;
        bq.z.b((LinearLayout) ((j5) aVar38).f32782c.f32360f, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i310 = i51;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i310) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar39 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar39);
        bq.z.b((LinearLayout) ((j5) aVar39).f32782c.f32359e, new fz.c(this) { // from class: km.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j1 f38194b;

            {
                this.f38194b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i310 = i22;
                qy.b0 b0Var = qy.b0.f48488a;
                j1 j1Var = this.f38194b;
                switch (i310) {
                    case 0:
                        View it = (View) obj;
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                    case 1:
                        View it2 = (View) obj;
                        kotlin.jvm.internal.m.f(it2, "it");
                        a9.i iVar = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        View it3 = (View) obj;
                        kotlin.jvm.internal.m.f(it3, "it");
                        a9.i iVar2 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        View it4 = (View) obj;
                        kotlin.jvm.internal.m.f(it4, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 4:
                        View it5 = (View) obj;
                        kotlin.jvm.internal.m.f(it5, "it");
                        a9.i iVar3 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 5:
                        View it6 = (View) obj;
                        kotlin.jvm.internal.m.f(it6, "it");
                        a9.i iVar4 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 6:
                        View it7 = (View) obj;
                        kotlin.jvm.internal.m.f(it7, "it");
                        a9.i iVar5 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    case 7:
                        View it8 = (View) obj;
                        kotlin.jvm.internal.m.f(it8, "it");
                        a9.i iVar6 = j1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                    case 8:
                        View it9 = (View) obj;
                        kotlin.jvm.internal.m.f(it9, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 9:
                        View it10 = (View) obj;
                        kotlin.jvm.internal.m.f(it10, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 10:
                        View it11 = (View) obj;
                        kotlin.jvm.internal.m.f(it11, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 11:
                        View it12 = (View) obj;
                        kotlin.jvm.internal.m.f(it12, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 12:
                        View it13 = (View) obj;
                        kotlin.jvm.internal.m.f(it13, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 13:
                        View it14 = (View) obj;
                        kotlin.jvm.internal.m.f(it14, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 14:
                        View it15 = (View) obj;
                        kotlin.jvm.internal.m.f(it15, "it");
                        hh.p0.y(j1Var.O, 435L, null, null);
                        break;
                    case 15:
                        View it16 = (View) obj;
                        kotlin.jvm.internal.m.f(it16, "it");
                        hh.p0.y(j1Var.O, 457L, null, null);
                        break;
                    case 16:
                        View it17 = (View) obj;
                        kotlin.jvm.internal.m.f(it17, "it");
                        hh.p0.y(j1Var.O, 6L, null, null);
                        break;
                    case 17:
                        View it18 = (View) obj;
                        kotlin.jvm.internal.m.f(it18, "it");
                        hh.p0.y(j1Var.O, 1378L, null, null);
                        break;
                    case 18:
                        View it19 = (View) obj;
                        kotlin.jvm.internal.m.f(it19, "it");
                        hh.p0.y(j1Var.O, 316L, null, null);
                        break;
                    case 19:
                        View it20 = (View) obj;
                        kotlin.jvm.internal.m.f(it20, "it");
                        hh.p0.y(j1Var.O, 572L, null, null);
                        break;
                    case 20:
                        View it21 = (View) obj;
                        kotlin.jvm.internal.m.f(it21, "it");
                        hh.p0.y(j1Var.O, 1195L, null, null);
                        break;
                    case 21:
                        View it22 = (View) obj;
                        kotlin.jvm.internal.m.f(it22, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    case 22:
                        View it23 = (View) obj;
                        kotlin.jvm.internal.m.f(it23, "it");
                        hh.p0.y(j1Var.O, 788L, null, null);
                        break;
                    default:
                        View it24 = (View) obj;
                        kotlin.jvm.internal.m.f(it24, "it");
                        hh.p0.y(j1Var.O, 178L, null, null);
                        break;
                }
                return b0Var;
            }
        });
    }

    public final void x(FlexboxLayout flexboxLayout, String str, List list, int i11) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.item_recycler_fifty_sound_double_tv_pre, (ViewGroup) flexboxLayout, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_top);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_arrow_btm);
        textView.setText(str);
        if (i11 == 0) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
            textView.setTextColor(contextRequireContext.getColor(R.color.color_65A8FC));
            imageView.setVisibility(0);
        } else {
            Context contextRequireContext2 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
            textView.setTextColor(contextRequireContext2.getColor(R.color.colorAccent));
            imageView.setVisibility(8);
        }
        flexboxLayout.addView(viewInflate);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BaseYintuIntel baseYintuIntel = (BaseYintuIntel) it.next();
            View viewInflate2 = LayoutInflater.from(getContext()).inflate(R.layout.item_recycler_fifty_sound_double_tv, (ViewGroup) flexboxLayout, false);
            TextView textView2 = (TextView) viewInflate2.findViewById(R.id.tv_top);
            TextView textView3 = (TextView) viewInflate2.findViewById(R.id.tv_bottom);
            textView2.setText(baseYintuIntel.getPing());
            textView3.setText(baseYintuIntel.getPian() + " " + baseYintuIntel.getLuoMa());
            bq.z.b(viewInflate2, new k0(this, baseYintuIntel, 0));
            flexboxLayout.addView(viewInflate2);
        }
    }

    public final void y(FlexboxLayout flexboxLayout, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BaseYintuIntel baseYintuIntel = (BaseYintuIntel) it.next();
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.item_flex_yoon_1, (ViewGroup) flexboxLayout, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_left);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_right);
            textView.setText(baseYintuIntel.getPing());
            textView2.setText(baseYintuIntel.getLuoMa());
            if (flexboxLayout.getChildCount() % 2 == 0) {
                Context contextRequireContext = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                viewInflate.setBackgroundColor(contextRequireContext.getColor(R.color.color_FFF0CB));
            } else {
                Context contextRequireContext2 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                viewInflate.setBackgroundColor(contextRequireContext2.getColor(R.color.white));
            }
            bq.z.b(viewInflate, new k0(this, baseYintuIntel, 1));
            flexboxLayout.addView(viewInflate);
        }
    }

    public final void z(FlexboxLayout flexboxLayout) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.item_recycler_fifty_sound_double_left, (ViewGroup) flexboxLayout, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_bottom);
        textView.setText(BuildConfig.VERSION_NAME);
        textView2.setText(BuildConfig.VERSION_NAME);
        flexboxLayout.addView(viewInflate);
    }
}
