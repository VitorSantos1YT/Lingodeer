package jp;

import am.rVFB.LwKl;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import hj.x3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f36501b;

    public /* synthetic */ j0(p0 p0Var, int i11) {
        this.f36500a = i11;
        this.f36501b = p0Var;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0197  */
    /* JADX WARN: Code duplicated, block: B:51:0x019d  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:57:0x022b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0231  */
    @Override // fz.c
    public final Object invoke(Object obj) {
        FrameLayout frameLayout;
        TextView textView;
        TextView textView2;
        int i11 = this.f36500a;
        int i12 = 2;
        int i13 = 1;
        vy.d dVar = null;
        qy.b0 b0Var = qy.b0.f48488a;
        p0 p0Var = this.f36501b;
        switch (i11) {
            case 0:
                View it = (View) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ta.a aVar = p0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ((x3) aVar).f33581o.setOnClickListener(null);
                ii.a aVar2 = p0Var.N;
                kotlin.jvm.internal.m.c(aVar2);
                ((mp.a) aVar2).z(true);
                p0Var.X();
                if (p0Var.r().handWriteLanguage != -1) {
                    b7.e0.A(p0Var.t(), "jxz_cr_learn_click_skip");
                }
                break;
            case 1:
                View it2 = (View) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                ta.a aVar3 = p0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ((x3) aVar3).f33570c.setEnabled(false);
                int[] iArr = bq.r.f4959a;
                androidx.fragment.app.p0 p0VarRequireActivity = p0Var.requireActivity();
                kotlin.jvm.internal.m.e(p0VarRequireActivity, "requireActivity(...)");
                bq.m.E(p0VarRequireActivity);
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(p0Var), null, null, new n0(p0Var, dVar, i12), 3);
                break;
            case 2:
                View it3 = (View) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                ta.a aVar4 = p0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ((x3) aVar4).f33570c.setEnabled(false);
                ii.a aVar5 = p0Var.N;
                kotlin.jvm.internal.m.c(aVar5);
                ((mp.a) aVar5).z(false);
                p0Var.X();
                break;
            case 3:
                View it4 = (View) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                ta.a aVar6 = p0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                ((x3) aVar6).f33581o.setOnClickListener(null);
                ii.a aVar7 = p0Var.N;
                kotlin.jvm.internal.m.c(aVar7);
                ((mp.a) aVar7).z(true);
                p0Var.X();
                b7.e0.A(p0Var.t(), "jxz_m13_learn_click_skip");
                break;
            case 4:
                View it5 = (View) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                ta.a aVar8 = p0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                ((x3) aVar8).f33576i.f32666e.setOnClickListener(null);
                p0Var.X();
                break;
            case 5:
                View it6 = (View) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                p0Var.K();
                break;
            default:
                View it7 = (View) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                if (!p0Var.r().hasClickedSettings) {
                    p0Var.r().hasClickedSettings = true;
                    p0Var.r().updateEntry("hasClickedSettings");
                    ta.a aVar9 = p0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar9);
                    ((x3) aVar9).f33575h.f32794c.setImageResource(R.drawable.ic_lesson_test_setting_ls);
                }
                int i14 = 5;
                if (!p0Var.W && !p0Var.Q && p0Var.f36534j0.length() > 0) {
                    p0Var.t().c("jxz_main_click_in_lesson_settings", new i0(p0Var, i14));
                }
                dm.c cVar = p0Var.Y;
                kotlin.jvm.internal.m.c(cVar);
                Context context = (Context) cVar.f23490b;
                Env env = (Env) cVar.f23491c;
                int i15 = env.keyLanguage;
                String str = LwKl.ARQLCBo;
                if (i15 == 0) {
                    if (((View) cVar.f23492d) == null) {
                        cVar.f23492d = LayoutInflater.from(context).inflate(R.layout.layout_cs_lesson_test_setting_dialog, (ViewGroup) null, false);
                    }
                    View view = (View) cVar.f23492d;
                    kotlin.jvm.internal.m.c(view);
                    RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.rg_chinese_display);
                    radioGroup.setOnCheckedChangeListener(new lp.d(cVar, 6));
                    View childAt = radioGroup.getChildAt(env.csDisplay);
                    kotlin.jvm.internal.m.d(childAt, str);
                    ((RadioButton) childAt).setChecked(true);
                    cVar.k();
                } else if (i15 == 1) {
                    if (((View) cVar.f23492d) == null) {
                        cVar.f23492d = LayoutInflater.from(context).inflate(R.layout.layout_js_lesson_test_setting_dialog, (ViewGroup) null, false);
                    }
                    View view2 = (View) cVar.f23492d;
                    kotlin.jvm.internal.m.c(view2);
                    RadioGroup radioGroup2 = (RadioGroup) view2.findViewById(R.id.rg_chinese_display);
                    radioGroup2.setOnCheckedChangeListener(new lp.d(cVar, 3));
                    View childAt2 = radioGroup2.getChildAt(env.jsDisPlay);
                    kotlin.jvm.internal.m.d(childAt2, str);
                    ((RadioButton) childAt2).setChecked(true);
                    cVar.k();
                } else if (i15 == 2) {
                    if (((View) cVar.f23492d) == null) {
                        cVar.f23492d = LayoutInflater.from(context).inflate(R.layout.layout_ko_lesson_test_setting_dialog, (ViewGroup) null, false);
                    }
                    View view3 = (View) cVar.f23492d;
                    kotlin.jvm.internal.m.c(view3);
                    RadioGroup radioGroup3 = (RadioGroup) view3.findViewById(R.id.rg_chinese_display);
                    radioGroup3.setOnCheckedChangeListener(new lp.d(cVar, 1));
                    View childAt3 = radioGroup3.getChildAt(env.koDisPlay);
                    kotlin.jvm.internal.m.d(childAt3, str);
                    ((RadioButton) childAt3).setChecked(true);
                    cVar.k();
                    View view4 = (View) cVar.f23492d;
                    kotlin.jvm.internal.m.c(view4);
                    Switch r9 = (Switch) view4.findViewById(R.id.switch_ingore_space);
                    kotlin.jvm.internal.m.c(r9);
                    bq.z.b(r9, new lp.f(cVar, r9, 0));
                    r9.setChecked(env.ignoreSpace);
                } else if (i15 == 51 || i15 == 55) {
                    if (((View) cVar.f23492d) == null) {
                        cVar.f23492d = LayoutInflater.from(context).inflate(R.layout.layout_ar_lesson_test_setting_dialog, (ViewGroup) null, false);
                    }
                    View view5 = (View) cVar.f23492d;
                    kotlin.jvm.internal.m.c(view5);
                    RadioGroup radioGroup4 = (RadioGroup) view5.findViewById(R.id.rg_chinese_display);
                    radioGroup4.setOnCheckedChangeListener(new lp.d(cVar, 2));
                    View childAt4 = radioGroup4.getChildAt(env.arDisPlay);
                    kotlin.jvm.internal.m.d(childAt4, str);
                    ((RadioButton) childAt4).setChecked(true);
                    cVar.k();
                } else if (i15 == 57) {
                    if (((View) cVar.f23492d) == null) {
                        cVar.f23492d = LayoutInflater.from(context).inflate(R.layout.layout_thai_lesson_test_setting_dialog, (ViewGroup) null, false);
                    }
                    View view6 = (View) cVar.f23492d;
                    kotlin.jvm.internal.m.c(view6);
                    RadioGroup radioGroup5 = (RadioGroup) view6.findViewById(R.id.rg_chinese_display);
                    radioGroup5.setOnCheckedChangeListener(new lp.d(cVar, 5));
                    View childAt5 = radioGroup5.getChildAt(env.thaiDisPlay);
                    kotlin.jvm.internal.m.d(childAt5, str);
                    ((RadioButton) childAt5).setChecked(true);
                    cVar.k();
                } else if (i15 == 61) {
                    if (((View) cVar.f23492d) == null) {
                        cVar.f23492d = LayoutInflater.from(context).inflate(R.layout.layout_hindi_lesson_test_setting_dialog, (ViewGroup) null, false);
                    }
                    View view7 = (View) cVar.f23492d;
                    kotlin.jvm.internal.m.c(view7);
                    RadioGroup radioGroup6 = (RadioGroup) view7.findViewById(R.id.rg_chinese_display);
                    radioGroup6.setOnCheckedChangeListener(new lp.d(cVar, 0));
                    View childAt6 = radioGroup6.getChildAt(env.hindiDisPlay);
                    kotlin.jvm.internal.m.d(childAt6, str);
                    ((RadioButton) childAt6).setChecked(true);
                    cVar.k();
                } else if (i15 != 65) {
                    switch (i15) {
                        case 11:
                            if (((View) cVar.f23492d) == null) {
                                cVar.f23492d = LayoutInflater.from(context).inflate(R.layout.layout_cs_lesson_test_setting_dialog, (ViewGroup) null, false);
                            }
                            View view8 = (View) cVar.f23492d;
                            kotlin.jvm.internal.m.c(view8);
                            RadioGroup radioGroup7 = (RadioGroup) view8.findViewById(R.id.rg_chinese_display);
                            radioGroup7.setOnCheckedChangeListener(new lp.d(cVar, 6));
                            View childAt7 = radioGroup7.getChildAt(env.csDisplay);
                            kotlin.jvm.internal.m.d(childAt7, str);
                            ((RadioButton) childAt7).setChecked(true);
                            cVar.k();
                            break;
                        case 12:
                            if (((View) cVar.f23492d) == null) {
                                cVar.f23492d = LayoutInflater.from(context).inflate(R.layout.layout_js_lesson_test_setting_dialog, (ViewGroup) null, false);
                            }
                            View view9 = (View) cVar.f23492d;
                            kotlin.jvm.internal.m.c(view9);
                            RadioGroup radioGroup8 = (RadioGroup) view9.findViewById(R.id.rg_chinese_display);
                            radioGroup8.setOnCheckedChangeListener(new lp.d(cVar, 3));
                            View childAt8 = radioGroup8.getChildAt(env.jsDisPlay);
                            kotlin.jvm.internal.m.d(childAt8, str);
                            ((RadioButton) childAt8).setChecked(true);
                            cVar.k();
                            break;
                        case 13:
                            if (((View) cVar.f23492d) == null) {
                                cVar.f23492d = LayoutInflater.from(context).inflate(R.layout.layout_ko_lesson_test_setting_dialog, (ViewGroup) null, false);
                            }
                            View view10 = (View) cVar.f23492d;
                            kotlin.jvm.internal.m.c(view10);
                            RadioGroup radioGroup9 = (RadioGroup) view10.findViewById(R.id.rg_chinese_display);
                            radioGroup9.setOnCheckedChangeListener(new lp.d(cVar, 1));
                            View childAt9 = radioGroup9.getChildAt(env.koDisPlay);
                            kotlin.jvm.internal.m.d(childAt9, str);
                            ((RadioButton) childAt9).setChecked(true);
                            cVar.k();
                            View view11 = (View) cVar.f23492d;
                            kotlin.jvm.internal.m.c(view11);
                            Switch r11 = (Switch) view11.findViewById(R.id.switch_ingore_space);
                            kotlin.jvm.internal.m.c(r11);
                            bq.z.b(r11, new lp.f(cVar, r11, 0));
                            r11.setChecked(env.ignoreSpace);
                            break;
                        default:
                            if (((View) cVar.f23492d) == null) {
                                cVar.f23492d = LayoutInflater.from(context).inflate(R.layout.layout_lesson_test_setting_dialog_sound_effect, (ViewGroup) null, false);
                            }
                            cVar.k();
                            break;
                    }
                } else {
                    if (((View) cVar.f23492d) == null) {
                        cVar.f23492d = LayoutInflater.from(context).inflate(R.layout.layout_gre_lesson_test_setting_dialog, (ViewGroup) null, false);
                    }
                    View view12 = (View) cVar.f23492d;
                    kotlin.jvm.internal.m.c(view12);
                    RadioGroup radioGroup10 = (RadioGroup) view12.findViewById(R.id.rg_chinese_display);
                    radioGroup10.setOnCheckedChangeListener(new lp.d(cVar, 4));
                    View childAt10 = radioGroup10.getChildAt(env.grkDisPlay);
                    kotlin.jvm.internal.m.d(childAt10, str);
                    ((RadioButton) childAt10).setChecked(true);
                    cVar.k();
                }
                View view13 = (View) cVar.f23492d;
                if (view13 != null && (frameLayout = (FrameLayout) view13.findViewById(R.id.fl_theme)) != null) {
                    if ((context.getResources().getConfiguration().uiMode & 48) == 16) {
                        frameLayout.setVisibility(0);
                        View view14 = (View) cVar.f23492d;
                        if (view14 != null && (textView2 = (TextView) view14.findViewById(R.id.tv_background)) != null) {
                            textView2.setVisibility(0);
                        }
                    } else {
                        frameLayout.setVisibility(8);
                        View view15 = (View) cVar.f23492d;
                        if (view15 != null && (textView = (TextView) view15.findViewById(R.id.tv_background)) != null) {
                            textView.setVisibility(8);
                        }
                    }
                }
                lc.d dVar2 = (lc.d) cVar.f23493e;
                if (dVar2 == null) {
                    lc.d dVar3 = new lc.d(context);
                    hz.b.t(dVar3, null, (View) cVar.f23492d, true, 41);
                    lc.d.e(dVar3, Integer.valueOf(R.string.f22251ok), null, null, 6);
                    dVar3.show();
                    cVar.f23493e = dVar3;
                } else {
                    dVar2.show();
                }
                lc.d dVar4 = (lc.d) cVar.f23493e;
                kotlin.jvm.internal.m.c(dVar4);
                dVar4.setOnDismissListener(new bq.t(p0Var, i13));
                break;
        }
        return b0Var;
    }
}
