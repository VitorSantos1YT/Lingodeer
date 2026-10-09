package ui;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.fragment.app.p0;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.ObservableHorizonalScrollView;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.ObservableScrollView;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.t4;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class m0 extends bp.m implements aj.g {
    public int O;
    public j0 P;
    public aj.f Q;
    public ArrayList R;
    public ArrayList S;
    public ArrayList T;
    public bc.i U;
    public b7.c V;
    public fv.c W;
    public int X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f53002a0;

    public m0() {
        super(l0.f53001a, "AlphabetChart");
        this.X = 15;
        this.Y = 16;
        this.Z = 45;
    }

    @Override // ji.e
    public final void q() {
        bq.f fVar;
        aj.f fVar2 = this.Q;
        if (fVar2 != null) {
            fVar2.a();
            aj.f fVar3 = this.Q;
            kotlin.jvm.internal.m.c(fVar3);
            bc.i iVar = fVar3.f739b;
            if (iVar != null) {
                ((a9.i) iVar.f4126f).l();
            }
            b7.c cVar = fVar3.f740c;
            if (cVar != null && (fVar = (bq.f) cVar.f3962e) != null) {
                fVar.t();
                cVar.f3962e = null;
            }
            fv.c cVar2 = fVar3.f741d;
            if (cVar2 != null) {
                cVar2.a(fVar3.f750n);
            }
        }
        fv.c cVar3 = this.W;
        if (cVar3 != null) {
            cVar3.a(this.f53002a0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v61, types: [ui.j0] */
    /* JADX WARN: Type inference failed for: r1v62, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r1v64, types: [ui.j0] */
    /* JADX WARN: Type inference failed for: r2v53, types: [android.view.View, android.widget.TextView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.view.View, android.view.ViewGroup, android.widget.TableRow] */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.widget.TableLayout] */
    @Override // ji.e
    public final void v(Bundle bundle) {
        String[][] strArr;
        String string = getString(R.string.pinyin_table);
        kotlin.jvm.internal.m.e(string, "getString(...)");
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        View view = this.f36399e;
        kotlin.jvm.internal.m.c(view);
        ve.i.H(string, mVar, view);
        if (r().padStyle) {
            this.Y = 17;
            this.X = 16;
            this.Z = 55;
        } else {
            this.Y = 14;
            this.X = 14;
            this.Z = 50;
        }
        this.U = new bc.i(this.f36398d);
        this.V = new b7.c(r());
        this.W = new fv.c();
        this.T = new ArrayList();
        String[][] strArr2 = fv.f.f28197g;
        int length = strArr2.length;
        int i11 = 0;
        while (true) {
            int i12 = -1;
            if (i11 >= length) {
                break;
            }
            String[] strArr3 = strArr2[i11];
            int length2 = strArr3.length;
            int i13 = 0;
            while (i13 < length2) {
                String str = strArr3[i13];
                ?? tableRow = new TableRow(getContext());
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = this.T;
                kotlin.jvm.internal.m.c(arrayList2);
                arrayList2.add(arrayList);
                ta.a aVar = this.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ((t4) aVar).f33349j.addView(tableRow, new TableLayout.LayoutParams(i12, i12));
                String[][] strArr4 = fv.f.f28198h;
                int length3 = strArr4.length;
                int i14 = 0;
                while (i14 < length3) {
                    String[] strArr5 = strArr4[i14];
                    int length4 = strArr5.length;
                    String[][] strArr6 = strArr2;
                    int i15 = 0;
                    while (i15 < length4) {
                        int i16 = i15;
                        String str2 = strArr5[i16];
                        String[] strArr7 = strArr5;
                        int i17 = length;
                        ?? textView = new TextView(getContext());
                        textView.setTextSize(this.X);
                        textView.setWidth(ff.h.l(this.Z));
                        textView.setHeight(ff.h.l(this.Z));
                        Context contextRequireContext = requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                        int i18 = i11;
                        textView.setTextColor(contextRequireContext.getColor(R.color.primary_black));
                        textView.setGravity(17);
                        if (fv.f.f28200j.contains(fv.f.k(str, str2))) {
                            textView.setText(fv.f.l(this.O, str, str2));
                            textView.setTag(R.id.tag_shengmu, str);
                            textView.setTag(R.id.tag_yunmu, str2);
                            textView.setTag(R.id.tag_shengmu_array, strArr3);
                            textView.setTag(R.id.tag_shengmu_index, Integer.valueOf(i13));
                        } else {
                            textView.setText(BuildConfig.VERSION_NAME);
                            textView.setTag(R.id.tag_shengmu, BuildConfig.VERSION_NAME);
                            textView.setTag(R.id.tag_yunmu, BuildConfig.VERSION_NAME);
                            textView.setTag(R.id.tag_shengmu_index, Integer.valueOf(i13));
                        }
                        int i19 = length4;
                        if (kotlin.jvm.internal.m.a(strArr3[0], "-")) {
                            if (kotlin.jvm.internal.m.a(strArr7[0], "a") || kotlin.jvm.internal.m.a(strArr7[0], "u") || kotlin.jvm.internal.m.a(strArr7[0], "o")) {
                                textView.setBackgroundResource(R.drawable.pinyin_center_bg);
                            } else {
                                textView.setBackgroundResource(R.drawable.pinyin_center_light_bg);
                            }
                            strArr = strArr4;
                        } else {
                            strArr = strArr4;
                            if (kotlin.jvm.internal.m.a(strArr3[0], "b") || kotlin.jvm.internal.m.a(strArr3[0], "g") || kotlin.jvm.internal.m.a(strArr3[0], "zh")) {
                                if (kotlin.jvm.internal.m.a(strArr7[0], "a") || kotlin.jvm.internal.m.a(strArr7[0], "u") || kotlin.jvm.internal.m.a(strArr7[0], "o")) {
                                    textView.setBackgroundResource(R.drawable.pinyin_center_light_bg);
                                } else {
                                    textView.setBackgroundResource(R.drawable.pinyin_center_bg);
                                }
                            } else if (kotlin.jvm.internal.m.a(strArr7[0], "i") || kotlin.jvm.internal.m.a(strArr7[0], "e") || kotlin.jvm.internal.m.a(strArr7[0], "ü")) {
                                textView.setBackgroundResource(R.drawable.pinyin_center_light_bg);
                            } else {
                                textView.setBackgroundResource(R.drawable.pinyin_center_bg);
                            }
                        }
                        tableRow.addView(textView, new TableRow.LayoutParams(-2, -2));
                        arrayList.add(textView);
                        ?? r9 = this.P;
                        if (r9 == 0) {
                            final int i21 = 1;
                            r9 = new View.OnClickListener(this) { // from class: ui.j0

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ m0 f52996b;

                                {
                                    this.f52996b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i22 = i21;
                                    int i23 = 0;
                                    m0 m0Var = this.f52996b;
                                    switch (i22) {
                                        case 0:
                                            ta.a aVar2 = m0Var.f36400f;
                                            kotlin.jvm.internal.m.c(aVar2);
                                            ((t4) aVar2).f33341b.setImageResource(R.drawable.tone_nocheck_1);
                                            ta.a aVar3 = m0Var.f36400f;
                                            kotlin.jvm.internal.m.c(aVar3);
                                            ((t4) aVar3).f33342c.setImageResource(R.drawable.tone_nocheck_2);
                                            ta.a aVar4 = m0Var.f36400f;
                                            kotlin.jvm.internal.m.c(aVar4);
                                            ((t4) aVar4).f33343d.setImageResource(R.drawable.tone_nocheck_3);
                                            ta.a aVar5 = m0Var.f36400f;
                                            kotlin.jvm.internal.m.c(aVar5);
                                            ((t4) aVar5).f33344e.setImageResource(R.drawable.tone_nocheck_4);
                                            int id2 = view2.getId();
                                            if (id2 == R.id.pinyin_word1) {
                                                ta.a aVar6 = m0Var.f36400f;
                                                kotlin.jvm.internal.m.c(aVar6);
                                                ((t4) aVar6).f33341b.setImageResource(R.drawable.tone_checked_1);
                                            } else if (id2 == R.id.pinyin_word2) {
                                                ta.a aVar7 = m0Var.f36400f;
                                                kotlin.jvm.internal.m.c(aVar7);
                                                ((t4) aVar7).f33342c.setImageResource(R.drawable.tone_checked_2);
                                            } else if (id2 == R.id.pinyin_word3) {
                                                ta.a aVar8 = m0Var.f36400f;
                                                kotlin.jvm.internal.m.c(aVar8);
                                                ((t4) aVar8).f33343d.setImageResource(R.drawable.tone_checked_3);
                                            } else if (id2 == R.id.pinyin_word4) {
                                                ta.a aVar9 = m0Var.f36400f;
                                                kotlin.jvm.internal.m.c(aVar9);
                                                ((t4) aVar9).f33344e.setImageResource(R.drawable.tone_checked_4);
                                            }
                                            Object tag = view2.getTag();
                                            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type kotlin.Int");
                                            m0Var.O = ((Integer) tag).intValue();
                                            ArrayList arrayList3 = m0Var.T;
                                            kotlin.jvm.internal.m.c(arrayList3);
                                            int size = arrayList3.size();
                                            for (int i24 = 0; i24 < size; i24++) {
                                                ArrayList arrayList4 = m0Var.T;
                                                kotlin.jvm.internal.m.c(arrayList4);
                                                for (TextView textView2 : (List) arrayList4.get(i24)) {
                                                    Object tag2 = textView2.getTag(R.id.tag_shengmu);
                                                    kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type kotlin.String");
                                                    String str3 = (String) tag2;
                                                    Object tag3 = textView2.getTag(R.id.tag_yunmu);
                                                    kotlin.jvm.internal.m.d(tag3, "null cannot be cast to non-null type kotlin.String");
                                                    String str4 = (String) tag3;
                                                    if (!str3.equals(BuildConfig.VERSION_NAME) || !str4.equals(BuildConfig.VERSION_NAME)) {
                                                        qy.q qVar = fv.f.f28191a;
                                                        textView2.setText(fv.f.l(m0Var.O, str3, str4));
                                                    }
                                                }
                                            }
                                            ArrayList arrayList5 = m0Var.R;
                                            kotlin.jvm.internal.m.c(arrayList5);
                                            int size2 = arrayList5.size();
                                            while (i23 < size2) {
                                                Object obj = arrayList5.get(i23);
                                                i23++;
                                                TextView textView3 = (TextView) obj;
                                                Object tag4 = textView3.getTag(R.id.tag_yunmu);
                                                kotlin.jvm.internal.m.d(tag4, "null cannot be cast to non-null type kotlin.String");
                                                qy.q qVar2 = fv.f.f28191a;
                                                String strE = fv.g.E(m0Var.O, (String) tag4);
                                                kotlin.jvm.internal.m.e(strE, "yunmuVariationWithTone(...)");
                                                textView3.setText(strE);
                                            }
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.d(view2, "null cannot be cast to non-null type android.widget.TextView");
                                            TextView textView4 = (TextView) view2;
                                            if (!kotlin.jvm.internal.m.a(textView4.getText().toString(), BuildConfig.VERSION_NAME)) {
                                                aj.f fVar = m0Var.Q;
                                                if (fVar != null) {
                                                    lc.d dVar = fVar.m;
                                                    if (dVar != null ? dVar.isShowing() : false) {
                                                    }
                                                }
                                                if (m0Var.Q == null) {
                                                    l.m mVar2 = m0Var.f36398d;
                                                    kotlin.jvm.internal.m.c(mVar2);
                                                    m0Var.Q = new aj.f(mVar2, m0Var.r(), m0Var.U, m0Var.V, m0Var.W);
                                                }
                                                aj.f fVar2 = m0Var.Q;
                                                kotlin.jvm.internal.m.c(fVar2);
                                                int i25 = m0Var.O;
                                                Object tag5 = textView4.getTag(R.id.tag_shengmu);
                                                kotlin.jvm.internal.m.d(tag5, "null cannot be cast to non-null type kotlin.String");
                                                Object tag6 = textView4.getTag(R.id.tag_yunmu);
                                                kotlin.jvm.internal.m.d(tag6, "null cannot be cast to non-null type kotlin.String");
                                                fVar2.b(i25, (String) tag5, (String) tag6);
                                                aj.f fVar3 = m0Var.Q;
                                                kotlin.jvm.internal.m.c(fVar3);
                                                lc.d dVar2 = fVar3.m;
                                                kotlin.jvm.internal.m.c(dVar2);
                                                dVar2.show();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                            this.P = r9;
                        }
                        textView.setOnClickListener(r9);
                        i15 = i16 + 1;
                        strArr5 = strArr7;
                        length = i17;
                        i11 = i18;
                        length4 = i19;
                        strArr4 = strArr;
                    }
                    i14++;
                    strArr2 = strArr6;
                }
                i13++;
                i12 = -1;
            }
            i11++;
        }
        final int i22 = 0;
        this.R = new ArrayList();
        this.S = new ArrayList();
        View view2 = this.f36399e;
        kotlin.jvm.internal.m.c(view2);
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.ll_top);
        View view3 = this.f36399e;
        kotlin.jvm.internal.m.c(view3);
        LinearLayout linearLayout2 = (LinearLayout) view3.findViewById(R.id.ll_left);
        int length5 = fv.f.f28198h.length;
        for (int i23 = 0; i23 < length5; i23++) {
            String[] strArr8 = fv.f.f28198h[i23];
            int length6 = strArr8.length;
            for (int i24 = 0; i24 < length6; i24++) {
                TextView textView2 = new TextView(getContext());
                textView2.setTag(R.id.tag_yunmu, strArr8[i24]);
                textView2.setTextSize(this.Y);
                textView2.setWidth(ff.h.l(this.Z));
                textView2.setHeight(ff.h.l(this.Z));
                textView2.setGravity(17);
                Context contextRequireContext2 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                textView2.setTextColor(contextRequireContext2.getColor(R.color.primary_black));
                textView2.setText(strArr8[i24]);
                if (i23 % 2 == 0) {
                    textView2.setBackgroundResource(R.drawable.pinyin_round_bg);
                } else {
                    textView2.setBackgroundResource(R.drawable.pinyin_round_light_bg);
                }
                ArrayList arrayList3 = this.R;
                kotlin.jvm.internal.m.c(arrayList3);
                arrayList3.add(textView2);
                linearLayout.addView(textView2, new LinearLayout.LayoutParams(-2, -1));
            }
        }
        int length7 = fv.f.f28197g.length;
        for (int i25 = 0; i25 < length7; i25++) {
            for (String str3 : fv.f.f28197g[i25]) {
                TextView textView3 = new TextView(getActivity());
                textView3.setTextSize(this.Y);
                textView3.setWidth(ff.h.l(this.Z));
                textView3.setHeight(ff.h.l(this.Z));
                textView3.setGravity(17);
                Context contextRequireContext3 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                textView3.setTextColor(contextRequireContext3.getColor(R.color.primary_black));
                textView3.setText(str3);
                if (i25 % 2 == 0) {
                    textView3.setBackgroundResource(R.drawable.pinyin_round_bg);
                } else {
                    textView3.setBackgroundResource(R.drawable.pinyin_round_light_bg);
                }
                ArrayList arrayList4 = this.S;
                kotlin.jvm.internal.m.c(arrayList4);
                arrayList4.add(textView3);
                linearLayout2.addView(textView3, new LinearLayout.LayoutParams(-1, -1));
            }
        }
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((t4) aVar2).f33345f.setScrollViewListener(this);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ObservableHorizonalScrollView observableHorizonalScrollView = ((t4) aVar3).f33346g;
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        observableHorizonalScrollView.setScrollView(((t4) aVar4).f33348i);
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ObservableHorizonalScrollView observableHorizonalScrollView2 = ((t4) aVar5).f33348i;
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        observableHorizonalScrollView2.setScrollView(((t4) aVar6).f33346g);
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        ObservableScrollView observableScrollView = ((t4) aVar7).f33347h;
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        observableScrollView.setScrollView(((t4) aVar8).f33345f);
        View view4 = this.f36399e;
        kotlin.jvm.internal.m.c(view4);
        view4.setOnKeyListener(new View.OnKeyListener() { // from class: ui.k0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view5, int i26, KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() != 4) {
                    return false;
                }
                m0 m0Var = this.f52999a;
                aj.f fVar = m0Var.Q;
                if (fVar != null) {
                    lc.d dVar = fVar.m;
                    if (dVar != null ? dVar.isShowing() : false) {
                        aj.f fVar2 = m0Var.Q;
                        kotlin.jvm.internal.m.c(fVar2);
                        fVar2.a();
                        return true;
                    }
                }
                p0 activity = m0Var.getActivity();
                if (activity == null) {
                    return true;
                }
                activity.finish();
                return true;
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: ui.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f52996b;

            {
                this.f52996b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                int i26 = i22;
                int i27 = 0;
                m0 m0Var = this.f52996b;
                switch (i26) {
                    case 0:
                        ta.a aVar9 = m0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar9);
                        ((t4) aVar9).f33341b.setImageResource(R.drawable.tone_nocheck_1);
                        ta.a aVar10 = m0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar10);
                        ((t4) aVar10).f33342c.setImageResource(R.drawable.tone_nocheck_2);
                        ta.a aVar11 = m0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar11);
                        ((t4) aVar11).f33343d.setImageResource(R.drawable.tone_nocheck_3);
                        ta.a aVar12 = m0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar12);
                        ((t4) aVar12).f33344e.setImageResource(R.drawable.tone_nocheck_4);
                        int id2 = view5.getId();
                        if (id2 == R.id.pinyin_word1) {
                            ta.a aVar13 = m0Var.f36400f;
                            kotlin.jvm.internal.m.c(aVar13);
                            ((t4) aVar13).f33341b.setImageResource(R.drawable.tone_checked_1);
                        } else if (id2 == R.id.pinyin_word2) {
                            ta.a aVar14 = m0Var.f36400f;
                            kotlin.jvm.internal.m.c(aVar14);
                            ((t4) aVar14).f33342c.setImageResource(R.drawable.tone_checked_2);
                        } else if (id2 == R.id.pinyin_word3) {
                            ta.a aVar15 = m0Var.f36400f;
                            kotlin.jvm.internal.m.c(aVar15);
                            ((t4) aVar15).f33343d.setImageResource(R.drawable.tone_checked_3);
                        } else if (id2 == R.id.pinyin_word4) {
                            ta.a aVar16 = m0Var.f36400f;
                            kotlin.jvm.internal.m.c(aVar16);
                            ((t4) aVar16).f33344e.setImageResource(R.drawable.tone_checked_4);
                        }
                        Object tag = view5.getTag();
                        kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type kotlin.Int");
                        m0Var.O = ((Integer) tag).intValue();
                        ArrayList arrayList5 = m0Var.T;
                        kotlin.jvm.internal.m.c(arrayList5);
                        int size = arrayList5.size();
                        for (int i28 = 0; i28 < size; i28++) {
                            ArrayList arrayList6 = m0Var.T;
                            kotlin.jvm.internal.m.c(arrayList6);
                            for (TextView textView4 : (List) arrayList6.get(i28)) {
                                Object tag2 = textView4.getTag(R.id.tag_shengmu);
                                kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type kotlin.String");
                                String str4 = (String) tag2;
                                Object tag3 = textView4.getTag(R.id.tag_yunmu);
                                kotlin.jvm.internal.m.d(tag3, "null cannot be cast to non-null type kotlin.String");
                                String str5 = (String) tag3;
                                if (!str4.equals(BuildConfig.VERSION_NAME) || !str5.equals(BuildConfig.VERSION_NAME)) {
                                    qy.q qVar = fv.f.f28191a;
                                    textView4.setText(fv.f.l(m0Var.O, str4, str5));
                                }
                            }
                        }
                        ArrayList arrayList7 = m0Var.R;
                        kotlin.jvm.internal.m.c(arrayList7);
                        int size2 = arrayList7.size();
                        while (i27 < size2) {
                            Object obj = arrayList7.get(i27);
                            i27++;
                            TextView textView5 = (TextView) obj;
                            Object tag4 = textView5.getTag(R.id.tag_yunmu);
                            kotlin.jvm.internal.m.d(tag4, "null cannot be cast to non-null type kotlin.String");
                            qy.q qVar2 = fv.f.f28191a;
                            String strE = fv.g.E(m0Var.O, (String) tag4);
                            kotlin.jvm.internal.m.e(strE, "yunmuVariationWithTone(...)");
                            textView5.setText(strE);
                        }
                        break;
                    default:
                        kotlin.jvm.internal.m.d(view5, "null cannot be cast to non-null type android.widget.TextView");
                        TextView textView6 = (TextView) view5;
                        if (!kotlin.jvm.internal.m.a(textView6.getText().toString(), BuildConfig.VERSION_NAME)) {
                            aj.f fVar = m0Var.Q;
                            if (fVar != null) {
                                lc.d dVar = fVar.m;
                                if (dVar != null ? dVar.isShowing() : false) {
                                }
                            }
                            if (m0Var.Q == null) {
                                l.m mVar2 = m0Var.f36398d;
                                kotlin.jvm.internal.m.c(mVar2);
                                m0Var.Q = new aj.f(mVar2, m0Var.r(), m0Var.U, m0Var.V, m0Var.W);
                            }
                            aj.f fVar2 = m0Var.Q;
                            kotlin.jvm.internal.m.c(fVar2);
                            int i29 = m0Var.O;
                            Object tag5 = textView6.getTag(R.id.tag_shengmu);
                            kotlin.jvm.internal.m.d(tag5, "null cannot be cast to non-null type kotlin.String");
                            Object tag6 = textView6.getTag(R.id.tag_yunmu);
                            kotlin.jvm.internal.m.d(tag6, "null cannot be cast to non-null type kotlin.String");
                            fVar2.b(i29, (String) tag5, (String) tag6);
                            aj.f fVar3 = m0Var.Q;
                            kotlin.jvm.internal.m.c(fVar3);
                            lc.d dVar2 = fVar3.m;
                            kotlin.jvm.internal.m.c(dVar2);
                            dVar2.show();
                            break;
                        }
                        break;
                }
            }
        };
        ta.a aVar9 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar9);
        ((t4) aVar9).f33341b.setTag(1);
        ta.a aVar10 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar10);
        ((t4) aVar10).f33342c.setTag(2);
        ta.a aVar11 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar11);
        ((t4) aVar11).f33343d.setTag(3);
        ta.a aVar12 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar12);
        ((t4) aVar12).f33344e.setTag(4);
        ta.a aVar13 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar13);
        ((t4) aVar13).f33341b.setOnClickListener(onClickListener);
        ta.a aVar14 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar14);
        ((t4) aVar14).f33342c.setOnClickListener(onClickListener);
        ta.a aVar15 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar15);
        ((t4) aVar15).f33343d.setOnClickListener(onClickListener);
        ta.a aVar16 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar16);
        ((t4) aVar16).f33344e.setOnClickListener(onClickListener);
        qy.q qVar = fv.b.f28186a;
        String strE = fv.b.E(-1L);
        String strD = fv.b.D(-1L);
        fv.a aVar17 = new fv.a(0L, strE, strD);
        if (new File(defpackage.e.m(xt.b.a().b(), strD)).exists()) {
            return;
        }
        fv.c cVar = this.W;
        kotlin.jvm.internal.m.c(cVar);
        cVar.e(aVar17, true, new aj.e(this, 22));
    }
}
