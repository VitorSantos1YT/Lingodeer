package com.lingo.lingoskill.ui.base;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import androidx.lifecycle.LifecycleOwnerKt;
import b0.k2;
import bp.p5;
import bp.s5;
import bq.z;
import com.adjust.sdk.Constants;
import com.google.api.Service;
import com.google.firebase.messaging.FirebaseMessaging;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.base.refill.h;
import com.lingo.lingoskill.http.oss.OssTestActivity;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.LanCustomInfo;
import com.lingo.lingoskill.object.Unit;
import com.lingo.lingoskill.ui.base.AdFinishActivity;
import com.lingo.lingoskill.ui.base.PicTestIndexActivity;
import com.lingo.lingoskill.ui.base.RemoteUrlActivity;
import com.lingo.lingoskill.ui.base.TestUiJsonActivity;
import com.lingo.lingoskill.ui.base.UpdateLessonActivity;
import com.lingo.lingoskill.ui.learn.DebugTestActivity;
import com.lingo.lingoskill.ui.learn.DebugTestIndexActivity;
import com.lingo.lingoskill.ui.learn.GenFilterSentenceIdActivity;
import com.lingo.lingoskill.unity.convert.MP3Activity;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.INTENTS;
import fr.o0;
import fz.c;
import hj.c1;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import ji.b;
import kotlin.jvm.internal.m;
import lc.d;
import lt.AJC.PQgum;
import ns.o;
import qy.j;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class UpdateLessonActivity extends b {
    public static final /* synthetic */ int W = 0;
    public d P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public static final void u(UpdateLessonActivity updateLessonActivity, String str, String str2) {
        updateLessonActivity.getClass();
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        m.c(lingoSkillApplication);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(lingoSkillApplication.getFilesDir() + "/" + str2);
            try {
                Charset charsetForName = Charset.forName(Constants.ENCODING);
                m.e(charsetForName, "forName(...)");
                byte[] bytes = str.getBytes(charsetForName);
                m.e(bytes, "getBytes(...)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    o.m(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        final int i11 = 0;
        z.b(((c1) j()).f32441y, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = 12;
                int i13 = 8;
                int i14 = 2;
                int i15 = 4;
                int i16 = 6;
                int i17 = 3;
                int i18 = 0;
                vy.d dVar = null;
                int i19 = 1;
                switch (i11) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i21 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i22 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i23 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i24 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i25 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i14)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i26 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i15)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i27 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i28 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i17)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i29 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i12), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i32 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i33 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i16);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i19));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i13));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i34 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i35 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i18), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i36 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i39 = cf.x.n().keyLanguage;
                        if (i39 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i39 == 1 || i39 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i19), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i17), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i15), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i12 = 2;
        z.b(((c1) j()).f32438v, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = 12;
                int i14 = 8;
                int i15 = 2;
                int i16 = 4;
                int i17 = 6;
                int i18 = 3;
                int i19 = 0;
                vy.d dVar = null;
                int i110 = 1;
                switch (i12) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i21 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i22 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i23 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i24 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i25 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i15)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i26 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i16)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i27 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i28 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i18)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i29 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i13), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i32 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i33 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i17);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i110));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i14));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i34 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i35 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i19), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i36 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i39 = cf.x.n().keyLanguage;
                        if (i39 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i39 == 1 || i39 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i110), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i18), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i16), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i13 = 13;
        z.b(((c1) j()).f32439w, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i14 = 12;
                int i15 = 8;
                int i16 = 2;
                int i17 = 4;
                int i18 = 6;
                int i19 = 3;
                int i110 = 0;
                vy.d dVar = null;
                int i111 = 1;
                switch (i13) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i21 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i22 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i23 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i24 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i25 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i16)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i26 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i17)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i27 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i28 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i19)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i29 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i14), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i32 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i33 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i18);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i111));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i15));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i34 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i35 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i110), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i36 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i39 = cf.x.n().keyLanguage;
                        if (i39 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i39 == 1 || i39 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i111), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i19), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i17), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i14 = 23;
        z.b(((c1) j()).f32440x, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i15 = 12;
                int i16 = 8;
                int i17 = 2;
                int i18 = 4;
                int i19 = 6;
                int i110 = 3;
                int i111 = 0;
                vy.d dVar = null;
                int i112 = 1;
                switch (i14) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i21 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i22 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i23 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i24 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i25 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i17)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i26 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i18)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i27 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i28 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i110)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i29 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i15), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i32 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i33 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i19);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i112));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i16));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i34 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i35 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i111), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i36 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i39 = cf.x.n().keyLanguage;
                        if (i39 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i39 == 1 || i39 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i112), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i110), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i18), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i15 = 26;
        z.b(((c1) j()).f32434r, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i16 = 12;
                int i17 = 8;
                int i18 = 2;
                int i19 = 4;
                int i110 = 6;
                int i111 = 3;
                int i112 = 0;
                vy.d dVar = null;
                int i113 = 1;
                switch (i15) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i21 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i22 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i23 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i24 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i25 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i18)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i26 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i19)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i27 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i28 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i111)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i29 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i16), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i32 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i33 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i110);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i113));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i17));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i34 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i35 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i112), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i36 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i39 = cf.x.n().keyLanguage;
                        if (i39 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i39 == 1 || i39 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i113), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i111), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i19), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i16 = 27;
        z.b(((c1) j()).f32423f, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i17 = 12;
                int i18 = 8;
                int i19 = 2;
                int i110 = 4;
                int i111 = 6;
                int i112 = 3;
                int i113 = 0;
                vy.d dVar = null;
                int i114 = 1;
                switch (i16) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i21 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i22 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i23 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i24 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i25 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i19)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i26 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i110)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i27 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i28 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i29 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i17), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i32 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i33 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i111);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i114));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i18));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i34 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i35 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i113), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i36 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i39 = cf.x.n().keyLanguage;
                        if (i39 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i39 == 1 || i39 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i114), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i112), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i110), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i17 = 28;
        z.b(((c1) j()).D, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i18 = 12;
                int i19 = 8;
                int i110 = 2;
                int i111 = 4;
                int i112 = 6;
                int i113 = 3;
                int i114 = 0;
                vy.d dVar = null;
                int i115 = 1;
                switch (i17) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i21 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i22 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i23 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i24 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i25 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i110)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i26 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i111)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i27 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i28 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i29 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i18), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i32 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i33 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i112);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i115));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i19));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i34 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i35 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i114), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i36 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i39 = cf.x.n().keyLanguage;
                        if (i39 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i39 == 1 || i39 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i115), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i113), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i111), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i18 = 29;
        z.b(((c1) j()).L, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i19 = 12;
                int i110 = 8;
                int i111 = 2;
                int i112 = 4;
                int i113 = 6;
                int i114 = 3;
                int i115 = 0;
                vy.d dVar = null;
                int i116 = 1;
                switch (i18) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i21 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i22 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i23 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i24 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i25 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i111)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i26 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i27 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i28 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i114)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i29 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i19), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i32 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i33 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i113);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i116));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i110));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i34 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i35 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i115), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i36 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i39 = cf.x.n().keyLanguage;
                        if (i39 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i39 == 1 || i39 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i116), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i114), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i112), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i19 = 1;
        z.b(((c1) j()).I, new c(this) { // from class: bp.n5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4727b;

            {
                this.f4727b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i21 = i19;
                int i22 = 1;
                int i23 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                UpdateLessonActivity updateLessonActivity = this.f4727b;
                View it = (View) obj;
                switch (i21) {
                    case 0:
                        int i24 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.startActivity(new Intent(updateLessonActivity, (Class<?>) MP3Activity.class));
                        break;
                    case 1:
                        int i25 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        lc.d dVar = new lc.d(updateLessonActivity);
                        lc.d.g(dVar, null, "更新课程", 1);
                        hz.b.t(dVar, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar.a();
                        updateLessonActivity.P = dVar;
                        break;
                    case 2:
                        int i26 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.getClass();
                        break;
                    case 3:
                        int i27 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.startActivity(new Intent(updateLessonActivity, (Class<?>) AdFinishActivity.class));
                        break;
                    case 4:
                        int i28 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayListB = ij.c.b();
                        int size = arrayListB.size();
                        int i29 = 0;
                        while (i29 < size) {
                            Object obj2 = arrayListB.get(i29);
                            i29++;
                            Unit unit = (Unit) obj2;
                            String unitName = unit.getUnitName();
                            kotlin.jvm.internal.m.e(unitName, "getUnitName(...)");
                            if (!oz.x.s0(unitName, "TESTOUT", false)) {
                                arrayList.add(unit.getUnitName());
                            }
                        }
                        lc.d dVar2 = updateLessonActivity.P;
                        if (dVar2 != null && dVar2.isShowing()) {
                            lc.d dVar3 = updateLessonActivity.P;
                            if (dVar3 != null) {
                                dVar3.dismiss();
                            }
                        } else {
                            lc.d dVar4 = new lc.d(updateLessonActivity);
                            lc.d.g(dVar4, Integer.valueOf(R.string.fix_my_progress), null, 2);
                            android.support.v4.media.session.a.C(dVar4, arrayList, 0, new at.p(i22, updateLessonActivity, arrayList), AchievementLevelType.DAY_STREAK_LV_7);
                            dVar4.show();
                            updateLessonActivity.P = dVar4;
                        }
                        break;
                    case 5:
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.getClass();
                        break;
                    default:
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        List listL = ns.o.L("F_1", "S_D_1", "S_D_2", "default");
                        lc.d dVar5 = new lc.d(updateLessonActivity);
                        android.support.v4.media.session.a.C(dVar5, listL, 0, new o5(i23, listL), AchievementLevelType.DAY_STREAK_LV_7);
                        dVar5.show();
                        break;
                }
                return b0Var;
            }
        });
        final int i21 = 2;
        z.b(((c1) j()).H, new c(this) { // from class: bp.n5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4727b;

            {
                this.f4727b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i22 = i21;
                int i23 = 1;
                int i24 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                UpdateLessonActivity updateLessonActivity = this.f4727b;
                View it = (View) obj;
                switch (i22) {
                    case 0:
                        int i25 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.startActivity(new Intent(updateLessonActivity, (Class<?>) MP3Activity.class));
                        break;
                    case 1:
                        int i26 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        lc.d dVar = new lc.d(updateLessonActivity);
                        lc.d.g(dVar, null, "更新课程", 1);
                        hz.b.t(dVar, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar.a();
                        updateLessonActivity.P = dVar;
                        break;
                    case 2:
                        int i27 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.getClass();
                        break;
                    case 3:
                        int i28 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.startActivity(new Intent(updateLessonActivity, (Class<?>) AdFinishActivity.class));
                        break;
                    case 4:
                        int i29 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayListB = ij.c.b();
                        int size = arrayListB.size();
                        int i210 = 0;
                        while (i210 < size) {
                            Object obj2 = arrayListB.get(i210);
                            i210++;
                            Unit unit = (Unit) obj2;
                            String unitName = unit.getUnitName();
                            kotlin.jvm.internal.m.e(unitName, "getUnitName(...)");
                            if (!oz.x.s0(unitName, "TESTOUT", false)) {
                                arrayList.add(unit.getUnitName());
                            }
                        }
                        lc.d dVar2 = updateLessonActivity.P;
                        if (dVar2 != null && dVar2.isShowing()) {
                            lc.d dVar3 = updateLessonActivity.P;
                            if (dVar3 != null) {
                                dVar3.dismiss();
                            }
                        } else {
                            lc.d dVar4 = new lc.d(updateLessonActivity);
                            lc.d.g(dVar4, Integer.valueOf(R.string.fix_my_progress), null, 2);
                            android.support.v4.media.session.a.C(dVar4, arrayList, 0, new at.p(i23, updateLessonActivity, arrayList), AchievementLevelType.DAY_STREAK_LV_7);
                            dVar4.show();
                            updateLessonActivity.P = dVar4;
                        }
                        break;
                    case 5:
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.getClass();
                        break;
                    default:
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        List listL = ns.o.L("F_1", "S_D_1", "S_D_2", "default");
                        lc.d dVar5 = new lc.d(updateLessonActivity);
                        android.support.v4.media.session.a.C(dVar5, listL, 0, new o5(i24, listL), AchievementLevelType.DAY_STREAK_LV_7);
                        dVar5.show();
                        break;
                }
                return b0Var;
            }
        });
        final int i22 = 10;
        z.b(((c1) j()).F, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i22) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i23 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i24 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i25 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i26 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i27 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i28 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i29 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i32 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i33 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i34 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i35 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i36 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i39 = cf.x.n().keyLanguage;
                        if (i39 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i39 == 1 || i39 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i23 = 20;
        z.b(((c1) j()).G, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i23) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i24 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i25 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i26 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i27 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i28 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i29 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i32 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i33 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i34 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i35 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i36 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i39 = cf.x.n().keyLanguage;
                        if (i39 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i39 == 1 || i39 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i24 = 0;
        z.b(((c1) j()).f32429l, new c(this) { // from class: bp.n5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4727b;

            {
                this.f4727b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i25 = i24;
                int i26 = 1;
                int i27 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                UpdateLessonActivity updateLessonActivity = this.f4727b;
                View it = (View) obj;
                switch (i25) {
                    case 0:
                        int i28 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.startActivity(new Intent(updateLessonActivity, (Class<?>) MP3Activity.class));
                        break;
                    case 1:
                        int i29 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        lc.d dVar = new lc.d(updateLessonActivity);
                        lc.d.g(dVar, null, "更新课程", 1);
                        hz.b.t(dVar, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar.a();
                        updateLessonActivity.P = dVar;
                        break;
                    case 2:
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.getClass();
                        break;
                    case 3:
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.startActivity(new Intent(updateLessonActivity, (Class<?>) AdFinishActivity.class));
                        break;
                    case 4:
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayListB = ij.c.b();
                        int size = arrayListB.size();
                        int i213 = 0;
                        while (i213 < size) {
                            Object obj2 = arrayListB.get(i213);
                            i213++;
                            Unit unit = (Unit) obj2;
                            String unitName = unit.getUnitName();
                            kotlin.jvm.internal.m.e(unitName, "getUnitName(...)");
                            if (!oz.x.s0(unitName, "TESTOUT", false)) {
                                arrayList.add(unit.getUnitName());
                            }
                        }
                        lc.d dVar2 = updateLessonActivity.P;
                        if (dVar2 != null && dVar2.isShowing()) {
                            lc.d dVar3 = updateLessonActivity.P;
                            if (dVar3 != null) {
                                dVar3.dismiss();
                            }
                        } else {
                            lc.d dVar4 = new lc.d(updateLessonActivity);
                            lc.d.g(dVar4, Integer.valueOf(R.string.fix_my_progress), null, 2);
                            android.support.v4.media.session.a.C(dVar4, arrayList, 0, new at.p(i26, updateLessonActivity, arrayList), AchievementLevelType.DAY_STREAK_LV_7);
                            dVar4.show();
                            updateLessonActivity.P = dVar4;
                        }
                        break;
                    case 5:
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.getClass();
                        break;
                    default:
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        List listL = ns.o.L("F_1", "S_D_1", "S_D_2", "default");
                        lc.d dVar5 = new lc.d(updateLessonActivity);
                        android.support.v4.media.session.a.C(dVar5, listL, 0, new o5(i27, listL), AchievementLevelType.DAY_STREAK_LV_7);
                        dVar5.show();
                        break;
                }
                return b0Var;
            }
        });
        final int i25 = 3;
        z.b(((c1) j()).f32419b, new c(this) { // from class: bp.n5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4727b;

            {
                this.f4727b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i26 = i25;
                int i27 = 1;
                int i28 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                UpdateLessonActivity updateLessonActivity = this.f4727b;
                View it = (View) obj;
                switch (i26) {
                    case 0:
                        int i29 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.startActivity(new Intent(updateLessonActivity, (Class<?>) MP3Activity.class));
                        break;
                    case 1:
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        lc.d dVar = new lc.d(updateLessonActivity);
                        lc.d.g(dVar, null, "更新课程", 1);
                        hz.b.t(dVar, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar.a();
                        updateLessonActivity.P = dVar;
                        break;
                    case 2:
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.getClass();
                        break;
                    case 3:
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.startActivity(new Intent(updateLessonActivity, (Class<?>) AdFinishActivity.class));
                        break;
                    case 4:
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayListB = ij.c.b();
                        int size = arrayListB.size();
                        int i214 = 0;
                        while (i214 < size) {
                            Object obj2 = arrayListB.get(i214);
                            i214++;
                            Unit unit = (Unit) obj2;
                            String unitName = unit.getUnitName();
                            kotlin.jvm.internal.m.e(unitName, "getUnitName(...)");
                            if (!oz.x.s0(unitName, "TESTOUT", false)) {
                                arrayList.add(unit.getUnitName());
                            }
                        }
                        lc.d dVar2 = updateLessonActivity.P;
                        if (dVar2 != null && dVar2.isShowing()) {
                            lc.d dVar3 = updateLessonActivity.P;
                            if (dVar3 != null) {
                                dVar3.dismiss();
                            }
                        } else {
                            lc.d dVar4 = new lc.d(updateLessonActivity);
                            lc.d.g(dVar4, Integer.valueOf(R.string.fix_my_progress), null, 2);
                            android.support.v4.media.session.a.C(dVar4, arrayList, 0, new at.p(i27, updateLessonActivity, arrayList), AchievementLevelType.DAY_STREAK_LV_7);
                            dVar4.show();
                            updateLessonActivity.P = dVar4;
                        }
                        break;
                    case 5:
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.getClass();
                        break;
                    default:
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        List listL = ns.o.L("F_1", "S_D_1", "S_D_2", "default");
                        lc.d dVar5 = new lc.d(updateLessonActivity);
                        android.support.v4.media.session.a.C(dVar5, listL, 0, new o5(i28, listL), AchievementLevelType.DAY_STREAK_LV_7);
                        dVar5.show();
                        break;
                }
                return b0Var;
            }
        });
        final int i26 = 4;
        z.b(((c1) j()).f32431o, new c(this) { // from class: bp.n5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4727b;

            {
                this.f4727b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i27 = i26;
                int i28 = 1;
                int i29 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                UpdateLessonActivity updateLessonActivity = this.f4727b;
                View it = (View) obj;
                switch (i27) {
                    case 0:
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.startActivity(new Intent(updateLessonActivity, (Class<?>) MP3Activity.class));
                        break;
                    case 1:
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        lc.d dVar = new lc.d(updateLessonActivity);
                        lc.d.g(dVar, null, "更新课程", 1);
                        hz.b.t(dVar, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar.a();
                        updateLessonActivity.P = dVar;
                        break;
                    case 2:
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.getClass();
                        break;
                    case 3:
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.startActivity(new Intent(updateLessonActivity, (Class<?>) AdFinishActivity.class));
                        break;
                    case 4:
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayListB = ij.c.b();
                        int size = arrayListB.size();
                        int i215 = 0;
                        while (i215 < size) {
                            Object obj2 = arrayListB.get(i215);
                            i215++;
                            Unit unit = (Unit) obj2;
                            String unitName = unit.getUnitName();
                            kotlin.jvm.internal.m.e(unitName, "getUnitName(...)");
                            if (!oz.x.s0(unitName, "TESTOUT", false)) {
                                arrayList.add(unit.getUnitName());
                            }
                        }
                        lc.d dVar2 = updateLessonActivity.P;
                        if (dVar2 != null && dVar2.isShowing()) {
                            lc.d dVar3 = updateLessonActivity.P;
                            if (dVar3 != null) {
                                dVar3.dismiss();
                            }
                        } else {
                            lc.d dVar4 = new lc.d(updateLessonActivity);
                            lc.d.g(dVar4, Integer.valueOf(R.string.fix_my_progress), null, 2);
                            android.support.v4.media.session.a.C(dVar4, arrayList, 0, new at.p(i28, updateLessonActivity, arrayList), AchievementLevelType.DAY_STREAK_LV_7);
                            dVar4.show();
                            updateLessonActivity.P = dVar4;
                        }
                        break;
                    case 5:
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.getClass();
                        break;
                    default:
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        List listL = ns.o.L("F_1", "S_D_1", "S_D_2", "default");
                        lc.d dVar5 = new lc.d(updateLessonActivity);
                        android.support.v4.media.session.a.C(dVar5, listL, 0, new o5(i29, listL), AchievementLevelType.DAY_STREAK_LV_7);
                        dVar5.show();
                        break;
                }
                return b0Var;
            }
        });
        final int i27 = 5;
        z.b(((c1) j()).f32433q, new c(this) { // from class: bp.n5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4727b;

            {
                this.f4727b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i28 = i27;
                int i29 = 1;
                int i210 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                UpdateLessonActivity updateLessonActivity = this.f4727b;
                View it = (View) obj;
                switch (i28) {
                    case 0:
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.startActivity(new Intent(updateLessonActivity, (Class<?>) MP3Activity.class));
                        break;
                    case 1:
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        lc.d dVar = new lc.d(updateLessonActivity);
                        lc.d.g(dVar, null, "更新课程", 1);
                        hz.b.t(dVar, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar.a();
                        updateLessonActivity.P = dVar;
                        break;
                    case 2:
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.getClass();
                        break;
                    case 3:
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.startActivity(new Intent(updateLessonActivity, (Class<?>) AdFinishActivity.class));
                        break;
                    case 4:
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayListB = ij.c.b();
                        int size = arrayListB.size();
                        int i216 = 0;
                        while (i216 < size) {
                            Object obj2 = arrayListB.get(i216);
                            i216++;
                            Unit unit = (Unit) obj2;
                            String unitName = unit.getUnitName();
                            kotlin.jvm.internal.m.e(unitName, "getUnitName(...)");
                            if (!oz.x.s0(unitName, "TESTOUT", false)) {
                                arrayList.add(unit.getUnitName());
                            }
                        }
                        lc.d dVar2 = updateLessonActivity.P;
                        if (dVar2 != null && dVar2.isShowing()) {
                            lc.d dVar3 = updateLessonActivity.P;
                            if (dVar3 != null) {
                                dVar3.dismiss();
                            }
                        } else {
                            lc.d dVar4 = new lc.d(updateLessonActivity);
                            lc.d.g(dVar4, Integer.valueOf(R.string.fix_my_progress), null, 2);
                            android.support.v4.media.session.a.C(dVar4, arrayList, 0, new at.p(i29, updateLessonActivity, arrayList), AchievementLevelType.DAY_STREAK_LV_7);
                            dVar4.show();
                            updateLessonActivity.P = dVar4;
                        }
                        break;
                    case 5:
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.getClass();
                        break;
                    default:
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        List listL = ns.o.L("F_1", "S_D_1", "S_D_2", "default");
                        lc.d dVar5 = new lc.d(updateLessonActivity);
                        android.support.v4.media.session.a.C(dVar5, listL, 0, new o5(i210, listL), AchievementLevelType.DAY_STREAK_LV_7);
                        dVar5.show();
                        break;
                }
                return b0Var;
            }
        });
        final int i28 = 6;
        z.b(((c1) j()).f32421d, new c(this) { // from class: bp.n5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4727b;

            {
                this.f4727b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i29 = i28;
                int i210 = 1;
                int i211 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                UpdateLessonActivity updateLessonActivity = this.f4727b;
                View it = (View) obj;
                switch (i29) {
                    case 0:
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.startActivity(new Intent(updateLessonActivity, (Class<?>) MP3Activity.class));
                        break;
                    case 1:
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        lc.d dVar = new lc.d(updateLessonActivity);
                        lc.d.g(dVar, null, "更新课程", 1);
                        hz.b.t(dVar, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar.a();
                        updateLessonActivity.P = dVar;
                        break;
                    case 2:
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.getClass();
                        break;
                    case 3:
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.startActivity(new Intent(updateLessonActivity, (Class<?>) AdFinishActivity.class));
                        break;
                    case 4:
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayListB = ij.c.b();
                        int size = arrayListB.size();
                        int i217 = 0;
                        while (i217 < size) {
                            Object obj2 = arrayListB.get(i217);
                            i217++;
                            Unit unit = (Unit) obj2;
                            String unitName = unit.getUnitName();
                            kotlin.jvm.internal.m.e(unitName, "getUnitName(...)");
                            if (!oz.x.s0(unitName, "TESTOUT", false)) {
                                arrayList.add(unit.getUnitName());
                            }
                        }
                        lc.d dVar2 = updateLessonActivity.P;
                        if (dVar2 != null && dVar2.isShowing()) {
                            lc.d dVar3 = updateLessonActivity.P;
                            if (dVar3 != null) {
                                dVar3.dismiss();
                            }
                        } else {
                            lc.d dVar4 = new lc.d(updateLessonActivity);
                            lc.d.g(dVar4, Integer.valueOf(R.string.fix_my_progress), null, 2);
                            android.support.v4.media.session.a.C(dVar4, arrayList, 0, new at.p(i210, updateLessonActivity, arrayList), AchievementLevelType.DAY_STREAK_LV_7);
                            dVar4.show();
                            updateLessonActivity.P = dVar4;
                        }
                        break;
                    case 5:
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.getClass();
                        break;
                    default:
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        List listL = ns.o.L("F_1", "S_D_1", "S_D_2", "default");
                        lc.d dVar5 = new lc.d(updateLessonActivity);
                        android.support.v4.media.session.a.C(dVar5, listL, 0, new o5(i211, listL), AchievementLevelType.DAY_STREAK_LV_7);
                        dVar5.show();
                        break;
                }
                return b0Var;
            }
        });
        z.b(((c1) j()).f32430n, new k2(26));
        z.b(((c1) j()).f32437u, new k2(27));
        final int i29 = 1;
        z.b(((c1) j()).f32435s, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i29) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i30 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i32 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i33 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i34 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i35 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i36 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i39 = cf.x.n().keyLanguage;
                        if (i39 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i39 == 1 || i39 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i30 = 3;
        z.b(((c1) j()).f32442z, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i30) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i31 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i32 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i33 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i34 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i35 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i36 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i39 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i310 = cf.x.n().keyLanguage;
                        if (i310 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i310 == 1 || i310 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i31 = 4;
        z.b(((c1) j()).A, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i31) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i32 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i33 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i34 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i35 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i36 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i39 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i311 = cf.x.n().keyLanguage;
                        if (i311 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i311 == 1 || i311 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i32 = 5;
        z.b(((c1) j()).B, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i32) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i33 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i34 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i35 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i36 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i39 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i311 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i312 = cf.x.n().keyLanguage;
                        if (i312 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i312 == 1 || i312 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i33 = 6;
        z.b(((c1) j()).R, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i33) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i34 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i35 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i36 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i39 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i311 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i312 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i313 = cf.x.n().keyLanguage;
                        if (i313 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i313 == 1 || i313 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i34 = 7;
        z.b(((c1) j()).Q, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i34) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i35 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i36 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i39 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i311 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i312 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i313 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i314 = cf.x.n().keyLanguage;
                        if (i314 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i314 == 1 || i314 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        z.b(((c1) j()).C, new k2(23));
        final int i35 = 8;
        z.b(((c1) j()).E, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i35) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i36 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i39 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i311 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i312 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i313 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i314 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i315 = cf.x.n().keyLanguage;
                        if (i315 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i315 == 1 || i315 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i36 = 9;
        z.b(((c1) j()).M, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i36) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i37 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i39 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i311 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i312 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i313 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i314 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i315 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i316 = cf.x.n().keyLanguage;
                        if (i316 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i316 == 1 || i316 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i37 = 11;
        z.b(((c1) j()).m, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i37) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i38 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i39 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i311 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i312 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i313 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i314 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i315 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i316 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i317 = cf.x.n().keyLanguage;
                        if (i317 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i317 == 1 || i317 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i38 = 12;
        z.b(((c1) j()).f32436t, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i38) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i39 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i311 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i312 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i313 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i314 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i315 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i316 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i317 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i318 = cf.x.n().keyLanguage;
                        if (i318 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i318 == 1 || i318 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i39 = 14;
        z.b(((c1) j()).f32420c, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i39) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i311 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i312 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i313 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i314 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i315 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i316 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i317 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i318 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i319 = cf.x.n().keyLanguage;
                        if (i319 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i319 == 1 || i319 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i40 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i40 = 15;
        z.b(((c1) j()).f32425h, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i40) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i311 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i312 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i313 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i314 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i315 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i316 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i317 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i318 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i319 = cf.x.n().keyLanguage;
                        if (i319 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i319 == 1 || i319 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i41 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i410 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ((c1) j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
        final int i41 = 16;
        z.b(((c1) j()).f32427j, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i41) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i311 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i312 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i313 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i314 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i315 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i316 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i317 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i318 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i319 = cf.x.n().keyLanguage;
                        if (i319 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i319 == 1 || i319 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i42 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i410 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i411 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i42 = 17;
        z.b(((c1) j()).f32432p, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i42) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i311 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i312 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i313 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i314 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i315 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i316 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i317 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i318 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i319 = cf.x.n().keyLanguage;
                        if (i319 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i319 == 1 || i319 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i43 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i410 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i411 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i412 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i43 = 18;
        z.b(((c1) j()).f32428k, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i43) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i311 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i312 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i313 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i314 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i315 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i316 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i317 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i318 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i319 = cf.x.n().keyLanguage;
                        if (i319 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i319 == 1 || i319 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i44 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i410 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i411 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i412 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i413 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i44 = 0;
        ((c1) j()).P.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: bp.m5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                switch (i44) {
                    case 0:
                        int i45 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(compoundButton, "compoundButton");
                        xt.b.f56279a = z11;
                        break;
                    default:
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(compoundButton, "compoundButton");
                        xt.b.f56280b = z11;
                        break;
                }
            }
        });
        final int i45 = 19;
        z.b(((c1) j()).K, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i45) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i311 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i312 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i313 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i314 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i315 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i316 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i317 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i318 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i319 = cf.x.n().keyLanguage;
                        if (i319 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i319 == 1 || i319 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i46 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i410 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i411 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i412 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i413 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i414 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i415 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ((c1) j()).P.setChecked(xt.b.f56279a);
        final int i46 = 1;
        ((c1) j()).O.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: bp.m5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                switch (i46) {
                    case 0:
                        int i47 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(compoundButton, "compoundButton");
                        xt.b.f56279a = z11;
                        break;
                    default:
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(compoundButton, "compoundButton");
                        xt.b.f56280b = z11;
                        break;
                }
            }
        });
        final int i47 = 21;
        z.b(((c1) j()).J, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i47) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i311 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i312 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i313 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i314 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i315 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i316 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i317 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i318 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i319 = cf.x.n().keyLanguage;
                        if (i319 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i319 == 1 || i319 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i48 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i410 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i411 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i412 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i413 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i414 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i415 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i416 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i417 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ((c1) j()).O.setChecked(xt.b.f56280b);
        final int i48 = 22;
        z.b(((c1) j()).f32424g, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i48) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i311 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i312 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i313 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i314 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i315 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i316 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i317 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i318 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i319 = cf.x.n().keyLanguage;
                        if (i319 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i319 == 1 || i319 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i49 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i410 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i411 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i412 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i413 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i414 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i415 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i416 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i417 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i418 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i49 = 24;
        z.b(((c1) j()).f32426i, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i49) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i311 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i312 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i313 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i314 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i315 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i316 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i317 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i318 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i319 = cf.x.n().keyLanguage;
                        if (i319 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i319 == 1 || i319 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i410 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i411 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i412 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i413 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i414 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i415 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i416 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i417 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i418 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i419 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i50 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i50 = 25;
        z.b(((c1) j()).f32422e, new c(this) { // from class: bp.l5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdateLessonActivity f4697b;

            {
                this.f4697b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = 12;
                int i111 = 8;
                int i112 = 2;
                int i113 = 4;
                int i114 = 6;
                int i115 = 3;
                int i116 = 0;
                vy.d dVar = null;
                int i117 = 1;
                switch (i50) {
                    case 0:
                        UpdateLessonActivity updateLessonActivity = this.f4697b;
                        View it = (View) obj;
                        int i210 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it, "it");
                        updateLessonActivity.v();
                        break;
                    case 1:
                        UpdateLessonActivity context = this.f4697b;
                        View it2 = (View) obj;
                        int i211 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it2, "it");
                        kotlin.jvm.internal.m.f(context, "context");
                        Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                        intent.putExtra(PQgum.HAjHKCWydt, "https://docs.google.com/forms/d/e/1FAIpQLScuMHirtHH-u7dLJO7nNnVQzBXKSDMOwvZo6KcIr2O3oQOcaQ/viewform?usp=sf_link");
                        intent.putExtra(INTENTS.EXTRA_STRING_2, "Member Survey");
                        context.startActivity(intent);
                        break;
                    case 2:
                        UpdateLessonActivity updateLessonActivity2 = this.f4697b;
                        View it3 = (View) obj;
                        int i212 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it3, "it");
                        lc.d dVar2 = new lc.d(updateLessonActivity2);
                        lc.d.g(dVar2, null, "更新课程", 1);
                        hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar2.a();
                        updateLessonActivity2.P = dVar2;
                        dVar2.show();
                        if (oi.c.f44924t == null) {
                            synchronized (oi.c.class) {
                                if (oi.c.f44924t == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    oi.c.f44924t = new oi.c(lingoSkillApplication);
                                }
                            }
                        }
                        oi.c cVar = oi.c.f44924t;
                        kotlin.jvm.internal.m.c(cVar);
                        DaoSession daoSessionF = cVar.f();
                        lc.d dVar3 = updateLessonActivity2.P;
                        kotlin.jvm.internal.m.c(dVar3);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity2, daoSessionF, dVar3, 0).b();
                        break;
                    case 3:
                        UpdateLessonActivity updateLessonActivity3 = this.f4697b;
                        View it4 = (View) obj;
                        int i213 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it4, "it");
                        updateLessonActivity3.startActivity(new Intent(updateLessonActivity3, (Class<?>) PicTestIndexActivity.class));
                        break;
                    case 4:
                        UpdateLessonActivity updateLessonActivity4 = this.f4697b;
                        View it5 = (View) obj;
                        int i214 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it5, "it");
                        th.j.a(new ay.x(new g(i112)).k(ky.e.f38937b).g(px.b.a()).h(h.H, h.K), updateLessonActivity4.f36391f);
                        break;
                    case 5:
                        UpdateLessonActivity updateLessonActivity5 = this.f4697b;
                        View it6 = (View) obj;
                        int i215 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it6, "it");
                        th.j.a(new ay.x(new g(i113)).k(ky.e.f38937b).g(px.b.a()).h(h.L, h.M), updateLessonActivity5.f36391f);
                        break;
                    case 6:
                        UpdateLessonActivity updateLessonActivity6 = this.f4697b;
                        View it7 = (View) obj;
                        int i216 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it7, "it");
                        updateLessonActivity6.startActivity(new Intent(updateLessonActivity6, (Class<?>) TestUiJsonActivity.class));
                        break;
                    case 7:
                        UpdateLessonActivity updateLessonActivity7 = this.f4697b;
                        View it8 = (View) obj;
                        int i217 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it8, "it");
                        th.j.a(new ay.x(new g(i115)).k(ky.e.f38937b).g(px.b.a()).h(h.N, vx.b.f54316e), updateLessonActivity7.f36391f);
                        break;
                    case 8:
                        UpdateLessonActivity updateLessonActivity8 = this.f4697b;
                        View it9 = (View) obj;
                        int i218 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it9, "it");
                        FirebaseMessaging.c().e().addOnCompleteListener(new app.rive.runtime.kotlin.core.a(updateLessonActivity8, 11));
                        break;
                    case 9:
                        UpdateLessonActivity updateLessonActivity9 = this.f4697b;
                        View it10 = (View) obj;
                        int i310 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it10, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity9), null, null, new b1.c(updateLessonActivity9, dVar, i110), 3);
                        break;
                    case 10:
                        UpdateLessonActivity updateLessonActivity10 = this.f4697b;
                        View it11 = (View) obj;
                        int i311 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it11, "it");
                        updateLessonActivity10.getClass();
                        break;
                    case 11:
                        UpdateLessonActivity updateLessonActivity11 = this.f4697b;
                        View it12 = (View) obj;
                        int i312 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it12, "it");
                        if (xt.b.f56281c) {
                            xt.b.f56281c = false;
                            Toast.makeText(updateLessonActivity11, "已关闭无登录模式", 0).show();
                        } else {
                            xt.b.f56281c = true;
                            Toast.makeText(updateLessonActivity11, "已开启无登录模式", 0).show();
                        }
                        return qy.b0.f48488a;
                    case 12:
                        UpdateLessonActivity updateLessonActivity12 = this.f4697b;
                        View it13 = (View) obj;
                        int i313 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it13, "it");
                        lc.d dVar4 = new lc.d(updateLessonActivity12);
                        lc.d.g(dVar4, null, "输入测试URL", 1);
                        androidx.lifecycle.viewmodel.compose.a aVar = new androidx.lifecycle.viewmodel.compose.a(updateLessonActivity12, i114);
                        Context context2 = dVar4.O;
                        hz.b.t(dVar4, Integer.valueOf(R.layout.md_dialog_stub_input), null, false, 62);
                        dVar4.H.add(new oc.a(dVar4, i117));
                        if (!android.support.v4.media.session.a.z(dVar4)) {
                            lc.d.e(dVar4, Integer.valueOf(android.R.string.ok), null, null, 6);
                        }
                        lc.d.e(dVar4, null, null, new a0.e(21, dVar4, aVar), 3);
                        context2.getResources();
                        vc.a.k(dVar4);
                        android.support.v4.media.session.a.r(dVar4, lc.h.POSITIVE).setEnabled(false);
                        context2.getResources();
                        EditText editTextK = vc.a.k(dVar4);
                        vc.a.l(dVar4).setHint((CharSequence) null);
                        editTextK.setInputType(1);
                        vc.c.b(editTextK, context2, Integer.valueOf(R.attr.md_color_content), Integer.valueOf(R.attr.md_color_hint));
                        Typeface typeface = dVar4.f39881d;
                        if (typeface != null) {
                            editTextK.setTypeface(typeface);
                        }
                        vc.a.k(dVar4).addTextChangedListener(new hh.s(new oc.a(dVar4, aVar), i111));
                        lc.d.e(dVar4, Integer.valueOf(R.string.confirm), null, null, 6);
                        dVar4.show();
                        break;
                    case 13:
                        UpdateLessonActivity updateLessonActivity13 = this.f4697b;
                        View it14 = (View) obj;
                        int i314 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it14, "it");
                        lc.d dVar5 = new lc.d(updateLessonActivity13);
                        lc.d.g(dVar5, null, "更新课程", 1);
                        hz.b.t(dVar5, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar5.a();
                        updateLessonActivity13.P = dVar5;
                        dVar5.show();
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
                        DaoSession daoSession = (DaoSession) aVar2.f23485b;
                        lc.d dVar6 = updateLessonActivity13.P;
                        kotlin.jvm.internal.m.c(dVar6);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity13, daoSession, dVar6, 1).b();
                        break;
                    case 14:
                        UpdateLessonActivity updateLessonActivity14 = this.f4697b;
                        View it15 = (View) obj;
                        int i315 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it15, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity14), null, null, new r5(updateLessonActivity14, dVar, i116), 3);
                        break;
                    case 15:
                        UpdateLessonActivity updateLessonActivity15 = this.f4697b;
                        View it16 = (View) obj;
                        int i316 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it16, "it");
                        LingoSkillApplication.f21670t = !LingoSkillApplication.f21670t;
                        ((hj.c1) updateLessonActivity15.j()).f32425h.setText("Debug Story: " + LingoSkillApplication.f21670t);
                        break;
                    case 16:
                        UpdateLessonActivity updateLessonActivity16 = this.f4697b;
                        View it17 = (View) obj;
                        int i317 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it17, "it");
                        updateLessonActivity16.startActivity(new Intent(updateLessonActivity16, (Class<?>) GenFilterSentenceIdActivity.class));
                        break;
                    case 17:
                        UpdateLessonActivity updateLessonActivity17 = this.f4697b;
                        View it18 = (View) obj;
                        int i318 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it18, "it");
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        int i319 = cf.x.n().keyLanguage;
                        if (i319 == 0) {
                            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
                            lanCustomInfoB.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                        } else if (i319 == 1 || i319 == 12) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity17), null, null, new r5(updateLessonActivity17, dVar, i117), 3);
                        } else {
                            LanCustomInfo lanCustomInfoB2 = ub.a.Z().b(51);
                            lanCustomInfoB2.setPronun(8);
                            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB2);
                        }
                        return qy.b0.f48488a;
                    case 18:
                        UpdateLessonActivity updateLessonActivity18 = this.f4697b;
                        View it19 = (View) obj;
                        int i410 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it19, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity18), null, null, new a0.e0(updateLessonActivity18, (vy.d) null, 6), 3);
                        break;
                    case 19:
                        UpdateLessonActivity updateLessonActivity19 = this.f4697b;
                        View it20 = (View) obj;
                        int i411 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it20, "it");
                        ((hj.c1) updateLessonActivity19.j()).P.setChecked(!((hj.c1) updateLessonActivity19.j()).P.isChecked());
                        break;
                    case 20:
                        UpdateLessonActivity updateLessonActivity20 = this.f4697b;
                        View it21 = (View) obj;
                        int i412 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it21, "it");
                        updateLessonActivity20.getClass();
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
                        intent2.putExtra("android.intent.extra.TEXT", "https://c85vz.app.goo.gl/eJMg");
                        updateLessonActivity20.startActivity(Intent.createChooser(intent2, "Share URL"));
                        break;
                    case 21:
                        UpdateLessonActivity updateLessonActivity21 = this.f4697b;
                        View it22 = (View) obj;
                        int i413 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it22, "it");
                        ((hj.c1) updateLessonActivity21.j()).O.setChecked(!((hj.c1) updateLessonActivity21.j()).O.isChecked());
                        break;
                    case 22:
                        UpdateLessonActivity context3 = this.f4697b;
                        View it23 = (View) obj;
                        int i414 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it23, "it");
                        kotlin.jvm.internal.m.f(context3, "context");
                        Intent intent3 = new Intent(context3, (Class<?>) DebugTestActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, "1:1888:0#1:1888:1#1:1888:2#1:1888:3#1:1888:4#1:1888:5#1:1888:6#1:1888:7#1:1801:8#1:1888:10#1:1888:13");
                        context3.startActivity(intent3);
                        break;
                    case 23:
                        UpdateLessonActivity updateLessonActivity22 = this.f4697b;
                        View it24 = (View) obj;
                        int i415 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it24, "it");
                        lc.d dVar7 = new lc.d(updateLessonActivity22);
                        lc.d.g(dVar7, null, "更新课程", 1);
                        hz.b.t(dVar7, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                        dVar7.a();
                        updateLessonActivity22.P = dVar7;
                        dVar7.show();
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication4);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication4);
                                }
                            }
                        }
                        wm.a aVar3 = wm.a.f55177e;
                        kotlin.jvm.internal.m.c(aVar3);
                        DaoSession daoSession2 = aVar3.f55178a;
                        lc.d dVar8 = updateLessonActivity22.P;
                        kotlin.jvm.internal.m.c(dVar8);
                        new com.lingo.lingoskill.base.refill.c(updateLessonActivity22, daoSession2, dVar8, 2).b();
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        UpdateLessonActivity context4 = this.f4697b;
                        View it25 = (View) obj;
                        int i416 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it25, "it");
                        kotlin.jvm.internal.m.f(context4, "context");
                        Intent intent4 = new Intent(context4, (Class<?>) DebugTestActivity.class);
                        intent4.putExtra(INTENTS.EXTRA_STRING, "0:17:1#0:17:2#0:17:3#0:17:4#0:17:5#0:17:8#0:17:9#0:17:10#0:17:11");
                        context4.startActivity(intent4);
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        UpdateLessonActivity updateLessonActivity23 = this.f4697b;
                        View it26 = (View) obj;
                        int i417 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it26, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity23), null, null, new r5(updateLessonActivity23, dVar, i115), 3);
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        UpdateLessonActivity updateLessonActivity24 = this.f4697b;
                        View it27 = (View) obj;
                        int i418 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it27, "it");
                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(updateLessonActivity24), null, null, new r5(updateLessonActivity24, dVar, i113), 3);
                        break;
                    case 27:
                        UpdateLessonActivity updateLessonActivity25 = this.f4697b;
                        View it28 = (View) obj;
                        int i419 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it28, "it");
                        updateLessonActivity25.startActivity(new Intent(updateLessonActivity25, (Class<?>) DebugTestIndexActivity.class));
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        UpdateLessonActivity updateLessonActivity26 = this.f4697b;
                        View it29 = (View) obj;
                        int i51 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it29, "it");
                        xt.a aVarA = xt.b.a();
                        String strE = xt.b.a().e();
                        aVarA.getClass();
                        xt.a.a(strE);
                        Toast.makeText(updateLessonActivity26, "清除当前语种音频文件成功!", 0).show();
                        break;
                    default:
                        UpdateLessonActivity updateLessonActivity27 = this.f4697b;
                        View it30 = (View) obj;
                        int i52 = UpdateLessonActivity.W;
                        kotlin.jvm.internal.m.f(it30, "it");
                        updateLessonActivity27.startActivity(new Intent(updateLessonActivity27, (Class<?>) OssTestActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:303:0x0477  */
    /* JADX WARN: Code duplicated, block: B:305:0x0483  */
    /* JADX WARN: Code duplicated, block: B:309:0x048a A[Catch: all -> 0x0497, TRY_LEAVE, TryCatch #37 {, blocks: (B:307:0x0486, B:309:0x048a), top: B:779:0x0486 }] */
    /* JADX WARN: Code duplicated, block: B:335:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:337:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:341:0x0502 A[Catch: all -> 0x050f, TRY_LEAVE, TryCatch #31 {, blocks: (B:339:0x04fe, B:341:0x0502), top: B:767:0x04fe }] */
    /* JADX WARN: Code duplicated, block: B:351:0x052b  */
    /* JADX WARN: Code duplicated, block: B:353:0x0537  */
    /* JADX WARN: Code duplicated, block: B:355:0x0543  */
    /* JADX WARN: Code duplicated, block: B:359:0x054a A[Catch: all -> 0x0557, TRY_LEAVE, TryCatch #36 {, blocks: (B:357:0x0546, B:359:0x054a), top: B:777:0x0546 }] */
    /* JADX WARN: Code duplicated, block: B:369:0x0573  */
    /* JADX WARN: Code duplicated, block: B:371:0x057b  */
    /* JADX WARN: Code duplicated, block: B:375:0x0582 A[Catch: all -> 0x058f, TRY_LEAVE, TryCatch #30 {, blocks: (B:373:0x057e, B:375:0x0582), top: B:765:0x057e }] */
    /* JADX WARN: Code duplicated, block: B:385:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:387:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:389:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:393:0x05c9 A[Catch: all -> 0x05d6, TRY_LEAVE, TryCatch #35 {, blocks: (B:391:0x05c5, B:393:0x05c9), top: B:775:0x05c5 }] */
    /* JADX WARN: Code duplicated, block: B:403:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:405:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:409:0x0601 A[Catch: all -> 0x060e, TRY_LEAVE, TryCatch #29 {, blocks: (B:407:0x05fd, B:409:0x0601), top: B:763:0x05fd }] */
    /* JADX WARN: Code duplicated, block: B:763:0x05fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:0x057e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:0x04fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:0x05c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:0x0546 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:0x0486 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void v() {
        d dVar = new d(this);
        d.g(dVar, null, "更新课程", 1);
        hz.b.t(dVar, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
        dVar.a();
        this.P = dVar;
        dVar.show();
        int i11 = ((o0) l()).f27733a.keyLanguage;
        if (i11 != 40) {
            if (i11 == 57) {
                if (((o0) l()).f27733a.scLanguage == -1) {
                    if (ij.d.f34419e == null) {
                        synchronized (ij.d.class) {
                            if (ij.d.f34419e == null) {
                                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                m.c(lingoSkillApplication);
                                ij.d.f34419e = new ij.d(lingoSkillApplication);
                            }
                        }
                    }
                    ij.d dVar2 = ij.d.f34419e;
                    m.c(dVar2);
                    DaoSession daoSession = (DaoSession) dVar2.f34423d;
                    d dVar3 = this.P;
                    m.c(dVar3);
                    new h(this, "http://192.168.31.31:1313/AdminZG/", "uicon_112.png\nuicon_146.png\nuicon_43.png\nuicon_56.png\nuicon_92.png\nuicon_5.png\nuicon_30.png\nuicon_16.png\nuicon_65.png\nuicon_133.png\nuicon_25.png\nuicon_83.png\nuicon_10.png\nuicon_148.png\nuicon_32.png\nuicon_120.png\nuicon_153.png\nuicon_68.png\nuicon_73.png\nuicon_70.png\nuicon_61.png\nuicon_36.png\nuicon_103.png\nuicon_139.png\nuicon_35.png\nuicon_22.png\nuicon_89.png\nuicon_55.png\nuicon_8.png\nuicon_2.png\nuicon_7.png\nuicon_93.png\nuicon_137.png\nuicon_107.png\nuicon_37.png\nuicon_20.png\nuicon_124.png\nuicon_6.png\nuicon_34.png\nuicon_19.png\nuicon_122.png\nuicon_42.png\nuicon_81.png\nuicon_134.png\nuicon_33.png\nuicon_142.png\nuicon_44.png\nuicon_141.png\nuicon_67.png\nuicon_94.png\nuicon_82.png\nuicon_26.png\nuicon_31.png\nuicon_116.png\nuicon_18.png\nuicon_106.png\nuicon_136.png\nuicon_28.png\nuicon_110.png\nuicon_21.png\nuicon_149.png\nuicon_99.png", "ubg_31.png\nubg_14.png\nubg_9.png\nubg_41.png\nubg_23.png\nubg_32.png\nubg_44.png\nubg_39.png\nubg_18.png\nubg_2.png\nubg_43.png\nubg_37.png\nubg_34.png\nubg_42.png\nubg_4.png\nubg_34.png\nubg_8.png\nubg_27.png\nubg_31.png\nubg_10.png\nubg_40.png\nubg_11.png\nubg_24.png\nubg_26.png\nubg_45.png\nubg_25.png\nubg_7.png\nubg_38.png\nubg_37.png\nubg_13.png\nubg_14.png\nubg_17.png\nubg_29.png\nubg_12.png\nubg_6.png\nubg_11.png\nubg_38.png\nubg_32.png\nubg_9.png\nubg_43.png\nubg_33.png\nubg_21.png\nubg_10.png\nubg_13.png\nubg_30.png\nubg_15.png\nubg_27.png\nubg_3.png\nubg_22.png\nubg_6.png\nubg_33.png\nubg_41.png\nubg_8.png\nubg_23.png\nubg_17.png\nubg_29.png\nubg_28.png\nubg_19.png\nubg_24.png\nubg_2.png\nubg_21.png\nubg_40.png", daoSession, dVar3).d();
                    return;
                }
                if (dj.b.f23431e == null) {
                    synchronized (dj.b.class) {
                        if (dj.b.f23431e == null) {
                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication2);
                            dj.b.f23431e = new dj.b(lingoSkillApplication2);
                        }
                    }
                }
                dj.b bVar = dj.b.f23431e;
                m.c(bVar);
                DaoSession daoSessionB = bVar.b();
                d dVar4 = this.P;
                m.c(dVar4);
                new com.lingo.lingoskill.base.refill.m(this, "http://192.168.31.31:1313/AdminZG/", daoSessionB, dVar4).b();
                return;
            }
            if (i11 == 61) {
                if (((o0) l()).f27733a.scLanguage == -1) {
                    if (ij.d.f34419e == null) {
                        synchronized (ij.d.class) {
                            if (ij.d.f34419e == null) {
                                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                                m.c(lingoSkillApplication3);
                                ij.d.f34419e = new ij.d(lingoSkillApplication3);
                            }
                        }
                    }
                    ij.d dVar5 = ij.d.f34419e;
                    m.c(dVar5);
                    DaoSession daoSession2 = (DaoSession) dVar5.f34423d;
                    d dVar6 = this.P;
                    m.c(dVar6);
                    new h(this, "http://192.168.31.31:2626/AdminZG/", "uicon_112.png\nuicon_19.png\nuicon_5.png\nuicon_90.png\nuicon_146.png\nuicon_61.png\nuicon_32.png\nuicon_36.png\nuicon_66.png\nuicon_44.png\nuicon_92.png\nuicon_16.png\nuicon_30.png\nuicon_93.png\nuicon_56.png\nuicon_80.png\nuicon_55.png\nuicon_8.png\nuicon_1.png\nuicon_83.png\nuicon_2.png\nuicon_35.png\nuicon_106.png\nuicon_103.png\nuicon_24.png\nuicon_22.png\nuicon_73.png\nuicon_119.png\nuicon_33.png\nuicon_117.png", "ubg_31.png\nubg_9.png\nubg_32.png\nubg_12.png\nubg_14.png\nubg_28.png\nubg_4.png\nubg_11.png\nubg_14.png\nubg_27.png\nubg_2.png\nubg_7.png\nubg_44.png\nubg_17.png\nubg_9.png\nubg_40.png\nubg_22.png\nubg_37.png\nubg_26.png\nubg_2.png\nubg_13.png\nubg_45.png\nubg_8.png\nubg_24.png\nubg_18.png\nubg_43.png\nubg_8.png\nubg_12.png\nubg_25.png\nubg_1.png", daoSession2, dVar6).d();
                    return;
                }
                if (dj.b.f23431e == null) {
                    synchronized (dj.b.class) {
                        if (dj.b.f23431e == null) {
                            LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication4);
                            dj.b.f23431e = new dj.b(lingoSkillApplication4);
                        }
                    }
                }
                dj.b bVar2 = dj.b.f23431e;
                m.c(bVar2);
                DaoSession daoSessionB2 = bVar2.b();
                d dVar7 = this.P;
                m.c(dVar7);
                new com.lingo.lingoskill.base.refill.m(this, "http://192.168.31.31:2626/AdminZG/", daoSessionB2, dVar7).b();
                return;
            }
            if (i11 == 63) {
                if (((o0) l()).f27733a.scLanguage == -1) {
                    if (ij.d.f34419e == null) {
                        synchronized (ij.d.class) {
                            if (ij.d.f34419e == null) {
                                LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                                m.c(lingoSkillApplication5);
                                ij.d.f34419e = new ij.d(lingoSkillApplication5);
                            }
                        }
                    }
                    ij.d dVar8 = ij.d.f34419e;
                    m.c(dVar8);
                    DaoSession daoSession3 = (DaoSession) dVar8.f34423d;
                    d dVar9 = this.P;
                    m.c(dVar9);
                    new h(this, "http://192.168.31.31:2727/AdminZG/", "uicon_112.png\nuicon_90.png\nuicon_56.png\nuicon_146.png\nuicon_32.png\nuicon_35.png\nuicon_2.png\nuicon_36.png\nuicon_117.png\nuicon_100.png\nuicon_19.png\nuicon_66.png\nuicon_89.png\nuicon_17.png\nuicon_1.png\nuicon_89.png\nuicon_30.png\nuicon_93.png\nuicon_73.png\nuicon_103.png\nuicon_5.png\nuicon_80.png\nuicon_105.png\nuicon_21.png\nuicon_120.png\nuicon_23.png\nuicon_33.png\nuicon_55.png\nuicon_8.png\nuicon_43.png", "ubg_31.png\nubg_39.png\nubg_9.png\nubg_14.png\nubg_4.png\nubg_3.png\nubg_13.png\nubg_11.png\nubg_1.png\nubg_34.png\nubg_23.png\nubg_45.png\nubg_7.png\nubg_2.png\nubg_26.png\nubg_32.png\nubg_44.png\nubg_17.png\nubg_42.png\nubg_24.png\nubg_33.png\nubg_10.png\nubg_43.png\nubg_17.png\nubg_23.png\nubg_41.png\nubg_6.png\nubg_22.png\nubg_37.png\nubg_29.png", daoSession3, dVar9).d();
                    return;
                }
                if (dj.b.f23431e == null) {
                    synchronized (dj.b.class) {
                        if (dj.b.f23431e == null) {
                            LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication6);
                            dj.b.f23431e = new dj.b(lingoSkillApplication6);
                        }
                    }
                }
                dj.b bVar3 = dj.b.f23431e;
                m.c(bVar3);
                DaoSession daoSessionB3 = bVar3.b();
                d dVar10 = this.P;
                m.c(dVar10);
                new com.lingo.lingoskill.base.refill.m(this, "http://192.168.31.31:2727/AdminZG/", daoSessionB3, dVar10).b();
                return;
            }
            if (i11 == 65) {
                if (((o0) l()).f27733a.scLanguage == -1) {
                    if (ij.d.f34419e == null) {
                        synchronized (ij.d.class) {
                            if (ij.d.f34419e == null) {
                                LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                                m.c(lingoSkillApplication7);
                                ij.d.f34419e = new ij.d(lingoSkillApplication7);
                            }
                        }
                    }
                    ij.d dVar11 = ij.d.f34419e;
                    m.c(dVar11);
                    DaoSession daoSession4 = (DaoSession) dVar11.f34423d;
                    d dVar12 = this.P;
                    m.c(dVar12);
                    new h(this, "http://192.168.31.31:2828/AdminZG/", "uicon_112.png\nuicon_16.png\nuicon_61.png\nuicon_146.png\nuicon_6.png\nuicon_56.png\nuicon_139.png\nuicon_5.png\nuicon_66.png\nuicon_19.png\nuicon_141.png\nuicon_89.png\nuicon_44.png\nuicon_148.png\nuicon_32.png\nuicon_70.png\nuicon_36.png\nuicon_35.png\nuicon_18.png\nuicon_103.png\nuicon_22.png\nuicon_55.png\nuicon_8.png\nuicon_121.png\nuicon_33.png\nuicon_120.png\nuicon_2.png\nuicon_43.png\nuicon_20.png\nuicon_30.png", "ubg_31.png\nubg_19.png\nubg_27.png\nubg_14.png\nubg_9.png\nubg_41.png\nubg_26.png\nubg_32.png\nubg_39.png\nubg_9.png\nubg_3.png\nubg_32.png\nubg_27.png\nubg_42.png\nubg_4.png\nubg_10.png\nubg_11.png\nubg_45.png\nubg_17.png\nubg_24.png\nubg_25.png\nubg_38.png\nubg_37.png\nubg_29.png\nubg_12.png\nubg_34.png\nubg_13.png\nubg_42.png\nubg_11.png\nubg_44.png", daoSession4, dVar12).d();
                    return;
                }
                if (dj.b.f23431e == null) {
                    synchronized (dj.b.class) {
                        if (dj.b.f23431e == null) {
                            LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication8);
                            dj.b.f23431e = new dj.b(lingoSkillApplication8);
                        }
                    }
                }
                dj.b bVar4 = dj.b.f23431e;
                m.c(bVar4);
                DaoSession daoSessionB4 = bVar4.b();
                d dVar13 = this.P;
                m.c(dVar13);
                new com.lingo.lingoskill.base.refill.m(this, "http://192.168.31.31:2828/AdminZG/", daoSessionB4, dVar13).b();
                return;
            }
            if (i11 == 69) {
                if (((o0) l()).f27733a.scLanguage == -1) {
                    if (ij.d.f34419e == null) {
                        synchronized (ij.d.class) {
                            if (ij.d.f34419e == null) {
                                LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                                m.c(lingoSkillApplication9);
                                ij.d.f34419e = new ij.d(lingoSkillApplication9);
                            }
                        }
                    }
                    ij.d dVar14 = ij.d.f34419e;
                    m.c(dVar14);
                    DaoSession daoSession5 = (DaoSession) dVar14.f34423d;
                    d dVar15 = this.P;
                    m.c(dVar15);
                    new h(this, "http://192.168.31.31:3232/AdminZG/", "uicon_112.png\nuicon_92.png\nuicon_56.png\nuicon_146.png\nuicon_5.png\nuicon_139.png\nuicon_2.png\nuicon_61.png\nuicon_6.png\nuicon_141.png\nuicon_66.png\nuicon_93.png\nuicon_59.png\nuicon_77.png\nuicon_70.png\nuicon_103.png\nuicon_22.png\nuicon_55.png\nuicon_8.png\nuicon_138.png\nuicon_149.png\nuicon_44.png\nuicon_89.png\nuicon_35.png\nuicon_45.png\nuicon_68.png\nuicon_97.png\nuicon_121.png\nuicon_18.png\nuicon_19.png\nuicon_136.png\nuicon_81.png\nuicon_82.png", "ubg_31.png\nubg_23.png\nubg_41.png\nubg_14.png\nubg_32.png\nubg_26.png\nubg_13.png\nubg_27.png\nubg_9.png\nubg_3.png\nubg_39.png\nubg_17.png\nubg_17.png\nubg_8.png\nubg_10.png\nubg_24.png\nubg_25.png\nubg_21.png\nubg_37.png\nubg_38.png\nubg_42.png\nubg_27.png\nubg_32.png\nubg_45.png\nubg_31.png\nubg_27.png\nubg_28.png\nubg_29.png\nubg_17.png\nubg_9.png\nubg_14.png\nubg_21.png\nubg_13.png", daoSession5, dVar15).d();
                    return;
                }
                if (dj.b.f23431e == null) {
                    synchronized (dj.b.class) {
                        if (dj.b.f23431e == null) {
                            LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication10);
                            dj.b.f23431e = new dj.b(lingoSkillApplication10);
                        }
                    }
                }
                dj.b bVar5 = dj.b.f23431e;
                m.c(bVar5);
                DaoSession daoSessionB5 = bVar5.b();
                d dVar16 = this.P;
                m.c(dVar16);
                new com.lingo.lingoskill.base.refill.m(this, "http://192.168.31.31:3232/AdminZG/", daoSessionB5, dVar16).b();
                return;
            }
            switch (i11) {
                case 0:
                    if (ij.d.f34419e == null) {
                        synchronized (ij.d.class) {
                            if (ij.d.f34419e == null) {
                                LingoSkillApplication lingoSkillApplication11 = LingoSkillApplication.f21665b;
                                m.c(lingoSkillApplication11);
                                ij.d.f34419e = new ij.d(lingoSkillApplication11);
                            }
                            break;
                        }
                    }
                    ij.d dVar17 = ij.d.f34419e;
                    m.c(dVar17);
                    DaoSession daoSession6 = (DaoSession) dVar17.f34423d;
                    d dVar18 = this.P;
                    m.c(dVar18);
                    new h(this, "http://192.168.31.31:1515/AdminZG/", "uicon_81.png\nuicon_82.png\nuicon_83.png\nuicon_8.png\nuicon_5.png\nuicon_6.png\nuicon_84.png\nuicon_67.png\nuicon_9.png\nuicon_10.png\nuicon_24.png\nuicon_25.png\nuicon_5.png\nuicon_7.png\nuicon_10.png\nuicon_18.png\nuicon_55.png\nuicon_20.png\nuicon_73.png\nuicon_14.png\nuicon_32.png\nuicon_9.png\nuicon_44.png\nuicon_26.png\nuicon_58.png\nuicon_6.png\nuicon_21.png\nuicon_85.png\nuicon_15.png\nuicon_12.png\nuicon_57.png\nuicon_31.png\nuicon_27.png\nuicon_45.png\nuicon_44.png\nuicon_39.png\nuicon_12.png\nuicon_57.png\nuicon_86.png\nuicon_35.png\nuicon_87.png\nuicon_88.png\nuicon_89.png\nuicon_39.png\nuicon_12.png", "ubg_42.png\nubg_41.png\nubg_43.png\nubg_37.png\nubg_32.png\nubg_9.png\nubg_2.png\nubg_6.png\nubg_1.png\nubg_12.png\nubg_18.png\nubg_28.png\nubg_32.png\nubg_26.png\nubg_12.png\nubg_13.png\nubg_22.png\nubg_11.png\nubg_13.png\nubg_35.png\nubg_4.png\nubg_1.png\nubg_17.png\nubg_10.png\nubg_9.png\nubg_9.png\nubg_28.png\nubg_7.png\nubg_45.png\nubg_20.png\nubg_16.png\nubg_8.png\nubg_24.png\nubg_3.png\nubg_17.png\nubg_19.png\nubg_42.png\nubg_16.png\nubg_3.png\nubg_3.png\nubg_15.png\nubg_32.png\nubg_7.png\nubg_14.png\nubg_5.png", daoSession6, dVar18).d();
                    return;
                case 1:
                    if (((o0) l()).f27733a.scLanguage == -1) {
                        if (ij.d.f34419e == null) {
                            synchronized (ij.d.class) {
                                if (ij.d.f34419e == null) {
                                    LingoSkillApplication lingoSkillApplication12 = LingoSkillApplication.f21665b;
                                    m.c(lingoSkillApplication12);
                                    ij.d.f34419e = new ij.d(lingoSkillApplication12);
                                }
                                break;
                            }
                        }
                        ij.d dVar19 = ij.d.f34419e;
                        m.c(dVar19);
                        DaoSession daoSession7 = (DaoSession) dVar19.f34423d;
                        d dVar20 = this.P;
                        m.c(dVar20);
                        new h(this, "http://192.168.31.31:1818/AdminZG/", "uicon_14.png\nuicon_15.png\nuicon_61.png\nuicon_118.png\nuicon_62.png\nuicon_63.png\nuicon_32.png\nuicon_64.png\nuicon_65.png\nuicon_57.png\nuicon_66.png\nuicon_67.png\nuicon_68.png\nuicon_69.png\nuicon_67.png\nuicon_138.png\nuicon_9.png\nuicon_5.png\nuicon_24.png\nuicon_25.png\nuicon_70.png\nuicon_20.png\nuicon_2.png\nuicon_22.png\nuicon_71.png\nuicon_7.png\nuicon_139.png\nuicon_8.png\nuicon_55.png\nuicon_140.png\nuicon_98.png\nuicon_99.png\nuicon_100.png\nuicon_101.png\nuicon_102.png\nuicon_73.png\nuicon_19.png\nuicon_37.png\nuicon_44.png\nuicon_28.png\nuicon_103.png\nuicon_74.png\nuicon_75.png\nuicon_76.png\nuicon_77.png\nuicon_27.png\nuicon_78.png\nuicon_104.png\nuicon_38.png\nuicon_72.png\nuicon_105.png\nuicon_106.png\nuicon_30.png\nuicon_79.png\nuicon_107.png\nuicon_108.png\nuicon_109.png\nuicon_110.png\nuicon_111.png\nuicon_112.png\nuicon_113.png\nuicon_23.png\nuicon_46.png\nuicon_80.png", "ubg_14.png\nubg_45.png\nubg_30.png\nubg_34.png\nubg_33.png\nubg_13.png\nubg_4.png\nubg_27.png\nubg_29.png\nubg_16.png\nubg_7.png\nubg_14.png\nubg_26.png\nubg_19.png\nubg_14.png\nubg_26.png\nubg_1.png\nubg_32.png\nubg_18.png\nubg_18.png\nubg_42.png\nubg_11.png\nubg_13.png\nubg_25.png\nubg_6.png\nubg_26.png\nubg_26.png\nubg_37.png\nubg_22.png\nubg_4.png\nubg_4.png\nubg_4.png\nubg_4.png\nubg_4.png\nubg_4.png\nubg_29.png\nubg_9.png\nubg_16.png\nubg_17.png\nubg_1.png\nubg_38.png\nubg_40.png\nubg_39.png\nubg_15.png\nubg_12.png\nubg_24.png\nubg_2.png\nubg_21.png\nubg_45.png\nubg_4.png\nubg_4.png\nubg_4.png\nubg_44.png\nubg_1.png\nubg_4.png\nubg_4.png\nubg_4.png\nubg_4.png\nubg_4.png\nubg_4.png\nubg_4.png\nubg_39.png\nubg_16.png\nubg_40.png", daoSession7, dVar20).d();
                        return;
                    }
                    if (dj.b.f23431e == null) {
                        synchronized (dj.b.class) {
                            if (dj.b.f23431e == null) {
                                LingoSkillApplication lingoSkillApplication13 = LingoSkillApplication.f21665b;
                                m.c(lingoSkillApplication13);
                                dj.b.f23431e = new dj.b(lingoSkillApplication13);
                            }
                            break;
                        }
                    }
                    dj.b bVar6 = dj.b.f23431e;
                    m.c(bVar6);
                    DaoSession daoSessionB6 = bVar6.b();
                    d dVar21 = this.P;
                    m.c(dVar21);
                    new com.lingo.lingoskill.base.refill.m(this, "http://192.168.31.31:1818/AdminZG/", daoSessionB6, dVar21).b();
                    return;
                case 2:
                    if (((o0) l()).f27733a.scLanguage == -1) {
                        if (ij.d.f34419e == null) {
                            synchronized (ij.d.class) {
                                if (ij.d.f34419e == null) {
                                    LingoSkillApplication lingoSkillApplication14 = LingoSkillApplication.f21665b;
                                    m.c(lingoSkillApplication14);
                                    ij.d.f34419e = new ij.d(lingoSkillApplication14);
                                }
                                break;
                            }
                        }
                        ij.d dVar22 = ij.d.f34419e;
                        m.c(dVar22);
                        DaoSession daoSession8 = (DaoSession) dVar22.f34423d;
                        d dVar23 = this.P;
                        m.c(dVar23);
                        new h(this, "http://192.168.31.31:1717/AdminZG/", "uicon_14.png\nuicon_30.png\nuicon_13.png\nuicon_3.png\nuicon_9.png\nuicon_10.png\nuicon_16.png\nuicon_8.png\nuicon_90.png\nuicon_69.png\nuicon_13.png\nuicon_114.png\nuicon_18.png\nuicon_5.png\nuicon_89.png\nuicon_115.png\nuicon_116.png\nuicon_25.png\nuicon_99.png\nuicon_117.png\nuicon_119.png\nuicon_10.png\nuicon_120.png\nuicon_85.png\nuicon_66.png\nuicon_121.png\nuicon_27.png\nuicon_103.png\nuicon_22.png\nuicon_7.png\nuicon_12.png\nuicon_67.png\nuicon_92.png\nuicon_122.png\nuicon_42.png\nuicon_102.png\nuicon_123.png\nuicon_124.png\nuicon_125.png\nuicon_55.png\nuicon_126.png\nuicon_127.png\nuicon_101.png\nuicon_33.png\nuicon_128.png\nuicon_129.png\nuicon_130.png\nuicon_43.png\nuicon_6.png\nuicon_131.png\nuicon_93.png\nuicon_30.png\nuicon_14.png\nuicon_35.png\nuicon_32.png\nuicon_132.png\nuicon_133.png\nuicon_134.png\nuicon_44.png\nuicon_46.png\nuicon_21.png\nuicon_9.png\nuicon_94.png\nuicon_135.png\nuicon_136.png\nuicon_137.png\nuicon_95.png\nuicon_75.png\nuicon_86.png", "ubg_14.png\nubg_44.png\nubg_40.png\nubg_31.png\nubg_1.png\nubg_12.png\nubg_14.png\nubg_37.png\nubg_39.png\nubg_19.png\nubg_38.png\nubg_4.png\nubg_13.png\nubg_16.png\nubg_11.png\nubg_4.png\nubg_4.png\nubg_18.png\nubg_4.png\nubg_1.png\nubg_1.png\nubg_12.png\nubg_12.png\nubg_27.png\nubg_7.png\nubg_3.png\nubg_21.png\nubg_20.png\nubg_6.png\nubg_26.png\nubg_29.png\nubg_6.png\nubg_23.png\nubg_12.png\nubg_31.png\nubg_4.png\nubg_4.png\nubg_4.png\nubg_4.png\nubg_22.png\nubg_4.png\nubg_4.png\nubg_4.png\nubg_5.png\nubg_4.png\nubg_4.png\nubg_4.png\nubg_21.png\nubg_9.png\nubg_23.png\nubg_20.png\nubg_19.png\nubg_35.png\nubg_19.png\nubg_4.png\nubg_4.png\nubg_4.png\nubg_4.png\nubg_17.png\nubg_16.png\nubg_25.png\nubg_1.png\nubg_45.png\nubg_4.png\nubg_4.png\nubg_4.png\nubg_19.png\nubg_39.png\nubg_38.png", daoSession8, dVar23).d();
                        return;
                    }
                    if (dj.b.f23431e == null) {
                        synchronized (dj.b.class) {
                            if (dj.b.f23431e == null) {
                                LingoSkillApplication lingoSkillApplication15 = LingoSkillApplication.f21665b;
                                m.c(lingoSkillApplication15);
                                dj.b.f23431e = new dj.b(lingoSkillApplication15);
                            }
                            break;
                        }
                    }
                    dj.b bVar7 = dj.b.f23431e;
                    m.c(bVar7);
                    DaoSession daoSessionB7 = bVar7.b();
                    d dVar24 = this.P;
                    m.c(dVar24);
                    new com.lingo.lingoskill.base.refill.m(this, "http://192.168.31.31:1717/AdminZG/", daoSessionB7, dVar24).b();
                    return;
                case 3:
                    if (ij.d.f34419e == null) {
                        synchronized (ij.d.class) {
                            if (ij.d.f34419e == null) {
                                LingoSkillApplication lingoSkillApplication16 = LingoSkillApplication.f21665b;
                                m.c(lingoSkillApplication16);
                                ij.d.f34419e = new ij.d(lingoSkillApplication16);
                            }
                            break;
                        }
                    }
                    ij.d dVar25 = ij.d.f34419e;
                    m.c(dVar25);
                    DaoSession daoSession9 = (DaoSession) dVar25.f34423d;
                    d dVar26 = this.P;
                    m.c(dVar26);
                    new h(this, "http://192.168.31.31:1616/AdminZG/", "uicon_1.png\nuicon_2.png\nuicon_3.png\nuicon_4.png\nuicon_5.png\nuicon_6.png\nuicon_7.png\nuicon_8.png\nuicon_9.png\nuicon_10.png\nuicon_11.png\nuicon_10.png\nuicon_5.png\nuicon_99.png\nuicon_101.png\nuicon_12.png\nuicon_13.png\nuicon_14.png\nuicon_15.png\nuicon_16.png\nuicon_17.png\nuicon_18.png\nuicon_19.png\nuicon_100.png\nuicon_110.png\nuicon_20.png\nuicon_21.png\nuicon_22.png\nuicon_103.png\nuicon_23.png\nuicon_24.png\nuicon_25.png\nuicon_26.png\nuicon_27.png\nuicon_28.png\nuicon_29.png\nuicon_31.png\nuicon_30.png\nuicon_32.png\nuicon_33.png\nuicon_34.png\nuicon_35.png\nuicon_36.png\nuicon_37.png\nuicon_11.png\nuicon_38.png\nuicon_39.png\nuicon_40.png\nuicon_134.png\nuicon_41.png\nuicon_102.png\nuicon_125.png\nuicon_116.png\nuicon_133.png\nuicon_123.png\nuicon_115.png\nuicon_124.png\nuicon_140.png\nuicon_118.png\nuicon_137.png\nuicon_135.png\nuicon_104.png\nuicon_71.png\nuicon_129.png\nuicon_42.png\nuicon_43.png\nuicon_44.png\nuicon_11.png\nuicon_117.png\nuicon_136.png\nuicon_104.png\nuicon_112.png\nuicon_44.png\nuicon_45.png\nuicon_45.png\nuicon_11.png\nuicon_46.png\nuicon_130.png\nuicon_123.png\nuicon_121.png\nuicon_47.png\nuicon_120.png\nuicon_48.png", "ubg_26.png\nubg_13.png\nubg_31.png\nubg_37.png\nubg_32.png\nubg_9.png\nubg_26.png\nubg_37.png\nubg_1.png\nubg_12.png\nubg_4.png\nubg_19.png\nubg_16.png\nubg_20.png\nubg_6.png\nubg_29.png\nubg_6.png\nubg_35.png\nubg_15.png\nubg_19.png\nubg_39.png\nubg_5.png\nubg_9.png\nubg_4.png\nubg_17.png\nubg_11.png\nubg_27.png\nubg_43.png\nubg_4.png\nubg_34.png\nubg_18.png\nubg_45.png\nubg_10.png\nubg_24.png\nubg_44.png\nubg_1.png\nubg_18.png\nubg_19.png\nubg_4.png\nubg_29.png\nubg_42.png\nubg_1.png\nubg_9.png\nubg_32.png\nubg_25.png\nubg_34.png\nubg_35.png\nubg_30.png\nubg_20.png\nubg_15.png\nubg_42.png\nubg_41.png\nubg_38.png\nubg_34.png\nubg_24.png\nubg_21.png\nubg_37.png\nubg_2.png\nubg_4.png\nubg_23.png\nubg_45.png\nubg_13.png\nubg_33.png\nubg_44.png\nubg_31.png\nubg_37.png\nubg_19.png\nubg_17.png\nubg_2.png\nubg_22.png\nubg_40.png\nubg_27.png\nubg_21.png\nubg_3.png\nubg_4.png\nubg_11.png\nubg_18.png\nubg_43.png\nubg_45.png\nubg_4.png\nubg_7.png\nubg_6.png\nubg_39.png", daoSession9, dVar26).d();
                    return;
                case 4:
                    if (((o0) l()).f27733a.scLanguage == -1) {
                        if (ij.d.f34419e == null) {
                            synchronized (ij.d.class) {
                                if (ij.d.f34419e == null) {
                                    LingoSkillApplication lingoSkillApplication17 = LingoSkillApplication.f21665b;
                                    m.c(lingoSkillApplication17);
                                    ij.d.f34419e = new ij.d(lingoSkillApplication17);
                                }
                                break;
                            }
                        }
                        ij.d dVar27 = ij.d.f34419e;
                        m.c(dVar27);
                        DaoSession daoSession10 = (DaoSession) dVar27.f34423d;
                        d dVar28 = this.P;
                        m.c(dVar28);
                        new h(this, "http://192.168.31.31:2121/AdminZG/", "uicon_81.png\nuicon_36.png\nuicon_10.png\nuicon_83.png\nuicon_5.png\nuicon_3.png\nuicon_4.png\nuicon_8.png\nuicon_116.png\nuicon_7.png\nuicon_138.png\nuicon_99.png\nuicon_100.png\nuicon_101.png\nuicon_84.png\nuicon_77.png\nuicon_14.png\nuicon_25.png\nuicon_115.png\nuicon_24.png\nuicon_2.png\nuicon_15.png\nuicon_55.png\nuicon_18.png\nuicon_89.png\nuicon_16.png\nuicon_21.png\nuicon_22.png\nuicon_90.png\nuicon_76.png\nuicon_43.png\nuicon_93.png\nuicon_67.png\nuicon_105.png\nuicon_38.png\nuicon_13.png\nuicon_98.png\nuicon_132.png\nuicon_32.png\nuicon_45.png\nuicon_19.png\nuicon_108.png\nuicon_44.png\nuicon_40.png\nuicon_128.png\nuicon_121.png\nuicon_129.png\nuicon_23.png\nuicon_28.png\nuicon_46.png\nuicon_102.png\nuicon_64.png\nuicon_42.png\nuicon_12.png\nuicon_118.png\nuicon_17.png\nuicon_124.png\nuicon_137.png\nuicon_104.png\nuicon_68.png\nuicon_58.png\nuicon_136.png\nuicon_106.png\nuicon_98.png\nuicon_133.png\nuicon_134.png\nuicon_111.png\nuicon_95.png\nuicon_75.png\nuicon_135.png", "ubg_42.png\nubg_9.png\nubg_12.png\nubg_2.png\nubg_32.png\nubg_31.png\nubg_35.png\nubg_37.png\nubg_19.png\nubg_26.png\nubg_21.png\nubg_6.png\nubg_24.png\nubg_29.png\nubg_13.png\nubg_33.png\nubg_35.png\nubg_18.png\nubg_32.png\nubg_18.png\nubg_13.png\nubg_45.png\nubg_22.png\nubg_13.png\nubg_7.png\nubg_39.png\nubg_34.png\nubg_25.png\nubg_20.png\nubg_43.png\nubg_8.png\nubg_40.png\nubg_18.png\nubg_45.png\nubg_28.png\nubg_22.png\nubg_38.png\nubg_4.png\nubg_23.png\nubg_2.png\nubg_9.png\nubg_36.png\nubg_17.png\nubg_40.png\nubg_34.png\nubg_3.png\nubg_12.png\nubg_14.png\nubg_14.png\nubg_36.png\nubg_25.png\nubg_41.png\nubg_11.png\nubg_23.png\nubg_30.png\nubg_2.png\nubg_23.png\nubg_22.png\nubg_40.png\nubg_30.png\nubg_9.png\nubg_38.png\nubg_26.png\nubg_43.png\nubg_18.png\nubg_38.png\nubg_44.png\nubg_34.png\nubg_18.png\nubg_12.png", daoSession10, dVar28).d();
                        return;
                    }
                    if (dj.b.f23431e == null) {
                        synchronized (dj.b.class) {
                            if (dj.b.f23431e == null) {
                                LingoSkillApplication lingoSkillApplication18 = LingoSkillApplication.f21665b;
                                m.c(lingoSkillApplication18);
                                dj.b.f23431e = new dj.b(lingoSkillApplication18);
                            }
                            break;
                        }
                    }
                    dj.b bVar8 = dj.b.f23431e;
                    m.c(bVar8);
                    DaoSession daoSessionB8 = bVar8.b();
                    d dVar29 = this.P;
                    m.c(dVar29);
                    new com.lingo.lingoskill.base.refill.m(this, "http://192.168.31.31:2121/AdminZG/", daoSessionB8, dVar29).b();
                    return;
                case 5:
                    if (((o0) l()).f27733a.scLanguage == -1) {
                        if (ij.d.f34419e == null) {
                            synchronized (ij.d.class) {
                                if (ij.d.f34419e == null) {
                                    LingoSkillApplication lingoSkillApplication19 = LingoSkillApplication.f21665b;
                                    m.c(lingoSkillApplication19);
                                    ij.d.f34419e = new ij.d(lingoSkillApplication19);
                                }
                                break;
                            }
                        }
                        ij.d dVar30 = ij.d.f34419e;
                        m.c(dVar30);
                        DaoSession daoSession11 = (DaoSession) dVar30.f34423d;
                        d dVar31 = this.P;
                        m.c(dVar31);
                        new h(this, "http://192.168.31.31:2323/AdminZG/", "uicon_49.png\nuicon_83.png\nuicon_5.png\nuicon_3.png\nuicon_36.png\nuicon_36.png\nuicon_10.png\nuicon_10.png\nuicon_4.png\nuicon_8.png\nuicon_7.png\nuicon_68.png\nuicon_16.png\nuicon_99.png\nuicon_99.png\nuicon_99.png\nuicon_16.png\nuicon_81.png\nuicon_25.png\nuicon_5.png\nuicon_24.png\nuicon_2.png\nuicon_3.png\nuicon_15.png\nuicon_55.png\nuicon_20.png\nuicon_5.png\nuicon_18.png\nuicon_98.png\nuicon_22.png\nuicon_26.png\nuicon_103.png\nuicon_28.png\nuicon_134.png\nuicon_12.png\nuicon_94.png\nuicon_38.png\nuicon_108.png\nuicon_21.png\nuicon_75.png\nuicon_75.png\nuicon_123.png\nuicon_86.png\nuicon_135.png\nuicon_104.png\nuicon_43.png\nuicon_12.png\nuicon_81.png\nuicon_46.png\nuicon_86.png\nuicon_18.png\nuicon_117.png\nuicon_135.png\nuicon_118.png\nuicon_81.png\nuicon_35.png\nuicon_135.png\nuicon_46.png\nuicon_81.png\nuicon_9.png\nuicon_135.png\nuicon_33.png\nuicon_46.png\nuicon_119.png\nuicon_10.png\nuicon_44.png\nuicon_44.png\nuicon_19.png\nuicon_43.png\nuicon_43.png\nuicon_3.png", "ubg_42.png\nubg_4.png\nubg_32.png\nubg_31.png\nubg_9.png\nubg_21.png\nubg_12.png\nubg_39.png\nubg_29.png\nubg_37.png\nubg_26.png\nubg_30.png\nubg_44.png\nubg_20.png\nubg_40.png\nubg_24.png\nubg_39.png\nubg_4.png\nubg_18.png\nubg_16.png\nubg_18.png\nubg_13.png\nubg_31.png\nubg_7.png\nubg_22.png\nubg_43.png\nubg_29.png\nubg_5.png\nubg_38.png\nubg_25.png\nubg_18.png\nubg_21.png\nubg_17.png\nubg_21.png\nubg_20.png\nubg_45.png\nubg_34.png\nubg_4.png\nubg_25.png\nubg_40.png\nubg_36.png\nubg_14.png\nubg_10.png\nubg_42.png\nubg_44.png\nubg_17.png\nubg_8.png\nubg_45.png\nubg_5.png\nubg_6.png\nubg_7.png\nubg_1.png\nubg_28.png\nubg_30.png\nubg_4.png\nubg_18.png\nubg_19.png\nubg_13.png\nubg_41.png\nubg_1.png\nubg_12.png\nubg_43.png\nubg_27.png\nubg_19.png\nubg_39.png\nubg_20.png\nubg_17.png\nubg_9.png\nubg_36.png\nubg_43.png\nubg_33.png", daoSession11, dVar31).d();
                        return;
                    }
                    if (dj.b.f23431e == null) {
                        synchronized (dj.b.class) {
                            if (dj.b.f23431e == null) {
                                LingoSkillApplication lingoSkillApplication20 = LingoSkillApplication.f21665b;
                                m.c(lingoSkillApplication20);
                                dj.b.f23431e = new dj.b(lingoSkillApplication20);
                            }
                            break;
                        }
                    }
                    dj.b bVar9 = dj.b.f23431e;
                    m.c(bVar9);
                    DaoSession daoSessionB9 = bVar9.b();
                    d dVar32 = this.P;
                    m.c(dVar32);
                    new com.lingo.lingoskill.base.refill.m(this, "http://192.168.31.31:2323/AdminZG/", daoSessionB9, dVar32).b();
                    return;
                case 6:
                    if (ij.d.f34419e == null) {
                        synchronized (ij.d.class) {
                            if (ij.d.f34419e == null) {
                                LingoSkillApplication lingoSkillApplication21 = LingoSkillApplication.f21665b;
                                m.c(lingoSkillApplication21);
                                ij.d.f34419e = new ij.d(lingoSkillApplication21);
                            }
                            break;
                        }
                    }
                    ij.d dVar33 = ij.d.f34419e;
                    m.c(dVar33);
                    DaoSession daoSession12 = (DaoSession) dVar33.f34423d;
                    d dVar34 = this.P;
                    m.c(dVar34);
                    new h(this, "http://192.168.31.31:1212/AdminZG/", "uicon_81.png\nuicon_36.png\nuicon_83.png\nuicon_3.png\nuicon_9.png\nuicon_4.png\nuicon_10.png\nuicon_5.png\nuicon_24.png\nuicon_18.png\nuicon_99.png\nuicon_66.png\nuicon_37.png\nuicon_8.png\nuicon_7.png\nuicon_55.png\nuicon_20.png\nuicon_68.png\nuicon_35.png\nuicon_25.png\nuicon_71.png\nuicon_16.png\nuicon_2.png\nuicon_15.png\nuicon_140.png\nuicon_38.png\nuicon_67.png\nuicon_12.png\nuicon_13.png\nuicon_121.png\nuicon_119.png\nuicon_29.png\nuicon_21.png\nuicon_19.png\nuicon_27.png\nuicon_77.png\nuicon_17.png\nuicon_28.png\nuicon_69.png\nuicon_114.png\nuicon_80.png\nuicon_108.png\nuicon_22.png\nuicon_105.png\nuicon_33.png\nuicon_47.png\nuicon_32.png\nuicon_134.png\nuicon_95.png\nuicon_116.png\nuicon_118.png\nuicon_76.png\nuicon_78.png\nuicon_115.png\nuicon_26.png\nuicon_102.png\nuicon_44.png\nuicon_135.png\nuicon_136.png\nuicon_112.png\nuicon_137.png\nuicon_46.png\nuicon_43.png\nuicon_40.png", "ubg_36.png\nubg_9.png\nubg_13.png\nubg_31.png\nubg_30.png\nubg_11.png\nubg_19.png\nubg_32.png\nubg_18.png\nubg_29.png\nubg_21.png\nubg_7.png\nubg_32.png\nubg_37.png\nubg_6.png\nubg_22.png\nubg_11.png\nubg_41.png\nubg_5.png\nubg_18.png\nubg_23.png\nubg_39.png\nubg_13.png\nubg_15.png\nubg_20.png\nubg_45.png\nubg_6.png\nubg_29.png\nubg_4.png\nubg_31.png\nubg_1.png\nubg_30.png\nubg_14.png\nubg_17.png\nubg_20.png\nubg_27.png\nubg_25.png\nubg_17.png\nubg_19.png\nubg_21.png\nubg_39.png\nubg_41.png\nubg_25.png\nubg_4.png\nubg_13.png\nubg_19.png\nubg_16.png\nubg_24.png\nubg_21.png\nubg_6.png\nubg_13.png\nubg_42.png\nubg_28.png\nubg_32.png\nubg_10.png\nubg_18.png\nubg_17.png\nubg_26.png\nubg_36.png\nubg_23.png\nubg_34.png\nubg_3.png\nubg_40.png\nubg_43.png", daoSession12, dVar34).d();
                    return;
                case 7:
                    if (ij.d.f34419e == null) {
                        synchronized (ij.d.class) {
                            if (ij.d.f34419e == null) {
                                LingoSkillApplication lingoSkillApplication22 = LingoSkillApplication.f21665b;
                                m.c(lingoSkillApplication22);
                                ij.d.f34419e = new ij.d(lingoSkillApplication22);
                            }
                            break;
                        }
                    }
                    ij.d dVar35 = ij.d.f34419e;
                    m.c(dVar35);
                    DaoSession daoSession13 = (DaoSession) dVar35.f34423d;
                    d dVar36 = this.P;
                    m.c(dVar36);
                    new h(this, "http://192.168.31.31:2020/AdminZG/", "uicon_81.png\nuicon_82.png\nuicon_83.png\nuicon_103.png\nuicon_45.png\nuicon_6.png\nuicon_110.png\nuicon_10.png\nuicon_7.png\nuicon_5.png\nuicon_13.png\nuicon_8.png\nuicon_120.png\nuicon_16.png\nuicon_17.png\nuicon_25.png\nuicon_115.png\nuicon_24.png\nuicon_70.png\nuicon_20.png\nuicon_2.png\nuicon_67.png\nuicon_37.png\nuicon_122.png\nuicon_12.png\nuicon_98.png\nuicon_104.png\nuicon_29.png\nuicon_47.png\nuicon133.png\nuicon_94.png\nuicon_15.png\nuicon_55.png\nuicon_134.png\nuicon_111.png\nuicon_44.png\nuicon_26.png\nuicon_42.png\nuicon_72.png\nuicon_28.png\nuicon_114.png\nuicon_126.png\nuicon_19.png\nuicon_36.png\nuicon_68.png\nuicon_49.png\nuicon_50.png\nuicon_72.png\nuicon_92.png\nuicon_118.png\nuicon_119.png\nuicon_135.png\nuicon_116.png\nuicon_85.png\nuicon_88.png\nuicon_4.png\nuicon_136.png\nuicon_31.png\nuicon_99.png\nuicon_121.png\nuicon_33.png\nuicon_105.png\nuicon_84.png\nuicon_90.png\nuicon_62.png", "ubg_36.png\nubg_5.png\nubg_28.png\nubg_21.png\nubg_31.png\nubg_9.png\nubg_24.png\nubg_12.png\nubg_26.png\nubg_32.png\nubg_4.png\nubg_37.png\nubg_19.png\nubg_35.png\nubg_44.png\nubg_33.png\nubg_2.png\nubg_18.png\nubg_41.png\nubg_11.png\nubg_27.png\nubg_43.png\nubg_40.png\nubg_36.png\nubg_5.png\nubg_17.png\nubg_30.png\nubg_38.png\nubg_40.png\nubg_39.png\nubg_45.png\nubg_22.png\nubg_17.png\nubg_25.png\nubg_13.png\nubg_6.png\nubg_10.png\nubg_29.png\nubg_4.png\nubg_17.png\nubg_40.png\nubg_20.png\nubg_9.png\nubg_23.png\nubg_25.png\nubg_1.png\nubg_44.png\nubg_31.png\nubg_4.png\nubg_20.png\nubg_34.png\nubg_35.png\nubg_22.png\nubg_7.png\nubg_16.png\nubg_45.png\nubg_24.png\nubg_8.png\nubg_24.png\nubg_3.png\nubg_29.png\nubg_15.png\nubg_34.png\nubg_43.png\nubg_45.png", daoSession13, dVar36).d();
                    return;
                case 8:
                    if (ij.d.f34419e == null) {
                        synchronized (ij.d.class) {
                            if (ij.d.f34419e == null) {
                                LingoSkillApplication lingoSkillApplication23 = LingoSkillApplication.f21665b;
                                m.c(lingoSkillApplication23);
                                ij.d.f34419e = new ij.d(lingoSkillApplication23);
                            }
                            break;
                        }
                    }
                    ij.d dVar37 = ij.d.f34419e;
                    m.c(dVar37);
                    DaoSession daoSession14 = (DaoSession) dVar37.f34423d;
                    d dVar38 = this.P;
                    m.c(dVar38);
                    new h(this, "http://192.168.31.31:1919/AdminZG/", "uicon_46.png\nuicon_36.png\nuicon_10.png\nuicon_13.png\nuicon_5.png\nuicon_112.png\nuicon_62.png\nuicon_8.png\nuicon_1.png\nuicon_7.png\nuicon_16.png\nuicon_100.png\nuicon_76.png\nuicon_80.png\nuicon_137.png\nuicon_134.png\nuicon_32.png\nuicon_25.png\nuicon_14.png\nuicon_2.png\nuicon_18.png\nuicon_15.png\nuicon_55.png\nuicon_70.png\nuicon_89.png\nuicon_24.png\nuicon_17.png\nuicon_22.png\nuicon_67.png\nuicon_21.png\nuicon_102.png\nuicon_28.png\nuicon_69.png\nuicon_37.png\nuicon_99.png\nuicon_103.png\nuicon_71.png\nuicon_140.png\nuicon_116.png\nuicon_119.png\nuicon_117.png\nuicon_49.png\nuicon_50.png\nuicon_59.png\nuicon_85.png\nuicon_93.png\nuicon_135.png\nuicon_33.png\nuicon_44.png\nuicon_68.png\nuicon_75.png\nuicon_34.png\nuicon_122.png\nuicon_90.png\nuicon_81.png\nuicon_82.png\nuicon_98.png\nuicon_29.png\nuicon_49.png\nuicon_104.png\nuicon_125.png\nuicon_50.png\nuicon_81.png\nuicon_82.png\nuicon_83.png\nuicon_94.png\nuicon_47.png", "ubg_42.png\nubg_9.png\nubg_42.png\nubg_2.png\nubg_32.png\nubg_31.png\nubg_34.png\nubg_37.png\nubg_26.png\nubg_6.png\nubg_39.png\nubg_21.png\nubg_24.png\nubg_20.png\nubg_40.png\nubg_21.png\nubg_31.png\nubg_18.png\nubg_14.png\nubg_29.png\nubg_13.png\nubg_39.png\nubg_22.png\nubg_26.png\nubg_7.png\nubg_18.png\nubg_28.png\nubg_25.png\nubg_38.png\nubg_25.png\nubg_8.png\nubg_17.png\nubg_44.png\nubg_10.png\nubg_21.png\nubg_20.png\nubg_41.png\nubg_34.png\nubg_4.png\nubg_25.png\nubg_4.png\nubg_21.png\nubg_2.png\nubg_7.png\nubg_23.png\nubg_17.png\nubg_15.png\nubg_30.png\nubg_3.png\nubg_38.png\nubg_24.png\nubg_42.png\nubg_34.png\nubg_45.png\nubg_43.png\nubg_1.png\nubg_19.png\nubg_38.png\nubg_40.png\nubg_27.png\nubg_11.png\nubg_33.png\nubg_41.png\nubg_12.png\nubg_43.png\nubg_36.png\nubg_45.png", daoSession14, dVar38).d();
                    return;
                default:
                    switch (i11) {
                        case 10:
                        case 22:
                            if (((o0) l()).f27733a.scLanguage == -1) {
                                if (ij.d.f34419e == null) {
                                    synchronized (ij.d.class) {
                                        if (ij.d.f34419e == null) {
                                            LingoSkillApplication lingoSkillApplication24 = LingoSkillApplication.f21665b;
                                            m.c(lingoSkillApplication24);
                                            ij.d.f34419e = new ij.d(lingoSkillApplication24);
                                        }
                                        break;
                                    }
                                }
                                ij.d dVar39 = ij.d.f34419e;
                                m.c(dVar39);
                                DaoSession daoSession15 = (DaoSession) dVar39.f34423d;
                                d dVar40 = this.P;
                                m.c(dVar40);
                                new h(this, "http://192.168.31.31:2424/AdminZG/", "uicon_92.png\nuicon_15.png\nuicon_10.png\nuicon_9.png\nuicon_112.png\nuicon_5.png\nuicon_25.png\nuicon_8.png\nuicon_16.png\nuicon_17.png\nuicon_14.png\nuicon_102.png\nuicon_78.png\nuicon_36.png\nuicon_52.png\nuicon_1.png\nuicon_11.png\nuicon_96.png\nuicon_81.png\nuicon_30.png\nuicon_67.png\nuicon119.png\nuicon_140.png\nuicon_26.png\nuicon_146.png\nuicon_90.png\nuicon_43.png\nuicon_99.png\nuicon_110.png\nuicon_6.png", "ubg_23.png\nubg_3.png\nubg_12.png\nubg_1.png\nubg_31.png\nubg_32.png\nubg_10.png\nubg_37.png\nubg_39.png\nubg_1.png\nubg_35.png\nubg_41.png\nubg_43.png\nubg_9.png\nubg_44.png\nubg_26.png\nubg_5.png\nubg_4.png\nubg_13.png\nubg_38.png\nubg_37.png\nubg_40.png\nubg_34.png\nubg_25.png\nubg_14.png\nubg_41.png\nubg_36.png\nubg_45.png\nubg_21.png\nubg_9.png", daoSession15, dVar40).d();
                                return;
                            }
                            if (dj.b.f23431e == null) {
                                synchronized (dj.b.class) {
                                    if (dj.b.f23431e == null) {
                                        LingoSkillApplication lingoSkillApplication25 = LingoSkillApplication.f21665b;
                                        m.c(lingoSkillApplication25);
                                        dj.b.f23431e = new dj.b(lingoSkillApplication25);
                                    }
                                    break;
                                }
                            }
                            dj.b bVar10 = dj.b.f23431e;
                            m.c(bVar10);
                            DaoSession daoSessionB10 = bVar10.b();
                            d dVar41 = this.P;
                            m.c(dVar41);
                            new com.lingo.lingoskill.base.refill.m(this, "http://192.168.31.31:2424/AdminZG/", daoSessionB10, dVar41).b();
                            return;
                        case 11:
                            if (((o0) l()).f27733a.scLanguage == -1) {
                                if (ij.d.f34419e == null) {
                                    synchronized (ij.d.class) {
                                        if (ij.d.f34419e == null) {
                                            LingoSkillApplication lingoSkillApplication26 = LingoSkillApplication.f21665b;
                                            m.c(lingoSkillApplication26);
                                            ij.d.f34419e = new ij.d(lingoSkillApplication26);
                                        }
                                        break;
                                    }
                                }
                                ij.d dVar42 = ij.d.f34419e;
                                m.c(dVar42);
                                DaoSession daoSession16 = (DaoSession) dVar42.f34423d;
                                d dVar43 = this.P;
                                m.c(dVar43);
                                new h(this, "http://192.168.31.31:3535/AdminZG/", "uicon_2.png\nuicon_137.png\nuicon_76.png\nuicon_18.png\nuicon_45.png\nuicon_15.png\nuicon_140.png\nuicon_6.png\nuicon_21.png\nuicon_63.png\nuicon_11.png\nuicon_126.png\nuicon_112.png\nuicon_55.png\nuicon_94.png\nuicon_69.png\nuicon_68.png\nuicon_80.png\nuicon_143.png\nuicon_86.png\nuicon_96.png\nuicon_20.png\nuicon_67.png\nuicon_22.png\nuicon_64.png", "ubg_13.png\nubg_8.png\nubg_20.png\nubg_5.png\nubg_39.png\nubg_3.png\nubg_45.png\nubg_9.png\nubg_25.png\nubg_6.png\nubg_4.png\nubg_41.png\nubg_23.png\nubg_22.png\nubg_38.png\nubg_21.png\nubg_1.png\nubg_31.png\nubg_42.png\nubg_45.png\nubg_40.png\nubg_11.png\nubg_26.png\nubg_28.png\nubg_43.png", daoSession16, dVar43).d();
                                return;
                            }
                            if (dj.b.f23431e == null) {
                                synchronized (dj.b.class) {
                                    if (dj.b.f23431e == null) {
                                        LingoSkillApplication lingoSkillApplication27 = LingoSkillApplication.f21665b;
                                        m.c(lingoSkillApplication27);
                                        dj.b.f23431e = new dj.b(lingoSkillApplication27);
                                    }
                                    break;
                                }
                            }
                            dj.b bVar11 = dj.b.f23431e;
                            m.c(bVar11);
                            DaoSession daoSessionB11 = bVar11.b();
                            d dVar44 = this.P;
                            m.c(dVar44);
                            new com.lingo.lingoskill.base.refill.m(this, "http://192.168.31.31:1515/AdminZG/", daoSessionB11, dVar44).b();
                            return;
                        case 12:
                            if (ij.d.f34419e == null) {
                                synchronized (ij.d.class) {
                                    if (ij.d.f34419e == null) {
                                        LingoSkillApplication lingoSkillApplication28 = LingoSkillApplication.f21665b;
                                        m.c(lingoSkillApplication28);
                                        ij.d.f34419e = new ij.d(lingoSkillApplication28);
                                    }
                                    break;
                                }
                            }
                            ij.d dVar45 = ij.d.f34419e;
                            m.c(dVar45);
                            DaoSession daoSession17 = (DaoSession) dVar45.f34423d;
                            d dVar46 = this.P;
                            m.c(dVar46);
                            new h(this, "http://192.168.31.31:3838/AdminZG/", "uicon_11.png\nuicon_96.png\nuicon_18.png\nuicon_56.png\nuicon_22.png\nuicon_45.png\nuicon_126.png\nuicon_41.png\nuicon_28.png\nuicon_75.png\nuicon_99.png\nuicon_131.png\nuicon_20.png\nuicon_80.png\nuicon_71.png\nuicon_115.png\nuicon_66.png\nuicon_15.png\nuicon_12.png\nuicon_73.png\nuicon_94.png\nuicon_74.png\nuicon_65.png\nuicon_18.png\nuicon_44.png\nuicon_135.png\nuicon_43.png\nuicon_67.png\nuicon_79.png\nuicon_30.png\nuicon_32.png\nuicon_10.png\nuicon_28.png\nuicon_23.png\nuicon_94.png\nuicon_45.png\nuicon_49.png\nuicon_50.png\nuicon_86.png\nuicon_116.png\nuicon_13.png\nuicon_98.png\nuicon_114.png\nuicon_81.png\nuicon_82.png\nuicon_83.png\nuicon_136.png\nuicon_6.png\nuicon_95.png\nuicon_24.png\nuicon_137.png\nuicon_101.png\nuicon_121.png\nuicon_34.png\nuicon_112.png\nuicon_126.png", "ubg_4.png\nubg_43.png\nubg_13.png\nubg_9.png\nubg_25.png\nubg_3.png\nubg_41.png\nubg_10.png\nubg_39.png\nubg_40.png\nubg_24.png\nubg_31.png\nubg_11.png\nubg_15.png\nubg_27.png\nubg_8.png\nubg_17.png\nubg_23.png\nubg_8.png\nubg_36.png\nubg_34.png\nubg_19.png\nubg_29.png\nubg_7.png\nubg_20.png\nubg_26.png\nubg_30.png\nubg_21.png\nubg_1.png\nubg_44.png\nubg_15.png\nubg_12.png\nubg_17.png\nubg_16.png\nubg_45.png\nubg_3.png\nubg_43.png\nubg_42.png\nubg_34.png\nubg_27.png\nubg_4.png\nubg_6.png\nubg_40.png\nubg_1.png\nubg_25.png\nubg_44.png\nubg_2.png\nubg_21.png\nubg_16.png\nubg_18.png\nubg_7.png\nubg_15.png\nubg_38.png\nubg_19.png\nubg_31.png\nubg_41.png", daoSession17, dVar46).d();
                            return;
                        case 13:
                            if (ij.d.f34419e == null) {
                                synchronized (ij.d.class) {
                                    if (ij.d.f34419e == null) {
                                        LingoSkillApplication lingoSkillApplication29 = LingoSkillApplication.f21665b;
                                        m.c(lingoSkillApplication29);
                                        ij.d.f34419e = new ij.d(lingoSkillApplication29);
                                    }
                                    break;
                                }
                            }
                            ij.d dVar47 = ij.d.f34419e;
                            m.c(dVar47);
                            DaoSession daoSession18 = (DaoSession) dVar47.f34423d;
                            d dVar48 = this.P;
                            m.c(dVar48);
                            new h(this, "http://192.168.31.31:3737/AdminZG/", "uicon_40.png\nuicon_114.png\nuicon_12.png\nuicon_29.png\nuicon_90.png\nuicon_20.png\nuicon_57.png\nuicon_76.png\nuicon_142.png\nuicon_128.png\nuicon_121.png\nuicon_126.png\nuicon_66.png\nuicon_18.png\nuicon_42.png\nuicon_22.png\nuicon_122.png\nuicon_46.png\nuicon_47.png\nuicon_44.png\nuicon_19.png\nuicon_3.png\nuicon_119.png\nuicon_33.png\nuicon_136.png\nuicon_4.png\nuicon_5.png\nuicon_15.png\nuicon_110.png\nuicon_77.png\nuicon_26.png\nuicon_99.png\nuicon_102.png\nuicon_135.png\nuicon_49.png\nuicon_50.png\nuicon_51.png\nuicon_81.png\nuicon_82.png\nuicon_83.png\nuicon_75.png\nuicon_2.png\nuicon_67.png\nuicon_104.png\nuicon_141.png\nuicon_13.png\nuicon_94.png\nuicon_34.png\nuicon_118.png\nuicon_89.png\nuicon_35.png\nuicon_30.png\nuicon_112.png", "ubg_1.png\nubg_25.png\nubg_34.png\nubg_38.png\nubg_6.png\nubg_5.png\nubg_28.png\nubg_12.png\nubg_25.png\nubg_4.png\nubg_3.png\nubg_31.png\nubg_17.png\nubg_5.png\nubg_11.png\nubg_25.png\nubg_15.png\nubg_2.png\nubg_4.png\nubg_24.png\nubg_9.png\nubg_41.png\nubg_25.png\nubg_22.png\nubg_32.png\nubg_16.png\nubg_37.png\nubg_43.png\nubg_25.png\nubg_34.png\nubg_10.png\nubg_21.png\nubg_27.png\nubg_19.png\nubg_20.png\nubg_1.png\nubg_44.png\nubg_23.png\nubg_44.png\nubg_34.png\nubg_42.png\nubg_13.png\nubg_6.png\nubg_40.png\nubg_33.png\nubg_16.png\nubg_45.png\nubg_12.png\nubg_30.png\nubg_7.png\nubg_31.png\nubg_44.png\nubg_30.png", daoSession18, dVar48).d();
                            return;
                        case 14:
                            if (((o0) l()).f27733a.scLanguage == -1) {
                                if (ij.d.f34419e == null) {
                                    synchronized (ij.d.class) {
                                        if (ij.d.f34419e == null) {
                                            LingoSkillApplication lingoSkillApplication110 = LingoSkillApplication.f21665b;
                                            m.c(lingoSkillApplication110);
                                            ij.d.f34419e = new ij.d(lingoSkillApplication110);
                                        }
                                        break;
                                    }
                                }
                                ij.d dVar210 = ij.d.f34419e;
                                m.c(dVar210);
                                DaoSession daoSession19 = (DaoSession) dVar210.f34423d;
                                d dVar211 = this.P;
                                m.c(dVar211);
                                new h(this, "http://192.168.31.31:2121/AdminZG/", "uicon_81.png\nuicon_36.png\nuicon_10.png\nuicon_83.png\nuicon_5.png\nuicon_3.png\nuicon_4.png\nuicon_8.png\nuicon_116.png\nuicon_7.png\nuicon_138.png\nuicon_99.png\nuicon_100.png\nuicon_101.png\nuicon_84.png\nuicon_77.png\nuicon_14.png\nuicon_25.png\nuicon_115.png\nuicon_24.png\nuicon_2.png\nuicon_15.png\nuicon_55.png\nuicon_18.png\nuicon_89.png\nuicon_16.png\nuicon_21.png\nuicon_22.png\nuicon_90.png\nuicon_76.png\nuicon_43.png\nuicon_93.png\nuicon_67.png\nuicon_105.png\nuicon_38.png\nuicon_13.png\nuicon_98.png\nuicon_132.png\nuicon_32.png\nuicon_45.png\nuicon_19.png\nuicon_108.png\nuicon_44.png\nuicon_40.png\nuicon_128.png\nuicon_121.png\nuicon_129.png\nuicon_23.png\nuicon_28.png\nuicon_46.png\nuicon_102.png\nuicon_64.png\nuicon_42.png\nuicon_12.png\nuicon_118.png\nuicon_17.png\nuicon_124.png\nuicon_137.png\nuicon_104.png\nuicon_68.png\nuicon_58.png\nuicon_136.png\nuicon_106.png\nuicon_98.png\nuicon_133.png\nuicon_134.png\nuicon_111.png\nuicon_95.png\nuicon_75.png\nuicon_135.png", "ubg_42.png\nubg_9.png\nubg_12.png\nubg_2.png\nubg_32.png\nubg_31.png\nubg_35.png\nubg_37.png\nubg_19.png\nubg_26.png\nubg_21.png\nubg_6.png\nubg_24.png\nubg_29.png\nubg_13.png\nubg_33.png\nubg_35.png\nubg_18.png\nubg_32.png\nubg_18.png\nubg_13.png\nubg_45.png\nubg_22.png\nubg_13.png\nubg_7.png\nubg_39.png\nubg_34.png\nubg_25.png\nubg_20.png\nubg_43.png\nubg_8.png\nubg_40.png\nubg_18.png\nubg_45.png\nubg_28.png\nubg_22.png\nubg_38.png\nubg_4.png\nubg_23.png\nubg_2.png\nubg_9.png\nubg_36.png\nubg_17.png\nubg_40.png\nubg_34.png\nubg_3.png\nubg_12.png\nubg_14.png\nubg_14.png\nubg_36.png\nubg_25.png\nubg_41.png\nubg_11.png\nubg_23.png\nubg_30.png\nubg_2.png\nubg_23.png\nubg_22.png\nubg_40.png\nubg_30.png\nubg_9.png\nubg_38.png\nubg_26.png\nubg_43.png\nubg_18.png\nubg_38.png\nubg_44.png\nubg_34.png\nubg_18.png\nubg_12.png", daoSession19, dVar211).d();
                                return;
                            }
                            if (dj.b.f23431e == null) {
                                synchronized (dj.b.class) {
                                    if (dj.b.f23431e == null) {
                                        LingoSkillApplication lingoSkillApplication111 = LingoSkillApplication.f21665b;
                                        m.c(lingoSkillApplication111);
                                        dj.b.f23431e = new dj.b(lingoSkillApplication111);
                                    }
                                    break;
                                }
                            }
                            dj.b bVar12 = dj.b.f23431e;
                            m.c(bVar12);
                            DaoSession daoSessionB12 = bVar12.b();
                            d dVar212 = this.P;
                            m.c(dVar212);
                            new com.lingo.lingoskill.base.refill.m(this, "http://192.168.31.31:2121/AdminZG/", daoSessionB12, dVar212).b();
                            return;
                        case 15:
                            if (((o0) l()).f27733a.scLanguage == -1) {
                                if (ij.d.f34419e == null) {
                                    synchronized (ij.d.class) {
                                        if (ij.d.f34419e == null) {
                                            LingoSkillApplication lingoSkillApplication112 = LingoSkillApplication.f21665b;
                                            m.c(lingoSkillApplication112);
                                            ij.d.f34419e = new ij.d(lingoSkillApplication112);
                                        }
                                        break;
                                    }
                                }
                                ij.d dVar310 = ij.d.f34419e;
                                m.c(dVar310);
                                DaoSession daoSession110 = (DaoSession) dVar310.f34423d;
                                d dVar311 = this.P;
                                m.c(dVar311);
                                new h(this, "http://192.168.31.31:2323/AdminZG/", "uicon_49.png\nuicon_83.png\nuicon_5.png\nuicon_3.png\nuicon_36.png\nuicon_36.png\nuicon_10.png\nuicon_10.png\nuicon_4.png\nuicon_8.png\nuicon_7.png\nuicon_68.png\nuicon_16.png\nuicon_99.png\nuicon_99.png\nuicon_99.png\nuicon_16.png\nuicon_81.png\nuicon_25.png\nuicon_5.png\nuicon_24.png\nuicon_2.png\nuicon_3.png\nuicon_15.png\nuicon_55.png\nuicon_20.png\nuicon_5.png\nuicon_18.png\nuicon_98.png\nuicon_22.png\nuicon_26.png\nuicon_103.png\nuicon_28.png\nuicon_134.png\nuicon_12.png\nuicon_94.png\nuicon_38.png\nuicon_108.png\nuicon_21.png\nuicon_75.png\nuicon_75.png\nuicon_123.png\nuicon_86.png\nuicon_135.png\nuicon_104.png\nuicon_43.png\nuicon_12.png\nuicon_81.png\nuicon_46.png\nuicon_86.png\nuicon_18.png\nuicon_117.png\nuicon_135.png\nuicon_118.png\nuicon_81.png\nuicon_35.png\nuicon_135.png\nuicon_46.png\nuicon_81.png\nuicon_9.png\nuicon_135.png\nuicon_33.png\nuicon_46.png\nuicon_119.png\nuicon_10.png\nuicon_44.png\nuicon_44.png\nuicon_19.png\nuicon_43.png\nuicon_43.png\nuicon_3.png", "ubg_42.png\nubg_4.png\nubg_32.png\nubg_31.png\nubg_9.png\nubg_21.png\nubg_12.png\nubg_39.png\nubg_29.png\nubg_37.png\nubg_26.png\nubg_30.png\nubg_44.png\nubg_20.png\nubg_40.png\nubg_24.png\nubg_39.png\nubg_4.png\nubg_18.png\nubg_16.png\nubg_18.png\nubg_13.png\nubg_31.png\nubg_7.png\nubg_22.png\nubg_43.png\nubg_29.png\nubg_5.png\nubg_38.png\nubg_25.png\nubg_18.png\nubg_21.png\nubg_17.png\nubg_21.png\nubg_20.png\nubg_45.png\nubg_34.png\nubg_4.png\nubg_25.png\nubg_40.png\nubg_36.png\nubg_14.png\nubg_10.png\nubg_42.png\nubg_44.png\nubg_17.png\nubg_8.png\nubg_45.png\nubg_5.png\nubg_6.png\nubg_7.png\nubg_1.png\nubg_28.png\nubg_30.png\nubg_4.png\nubg_18.png\nubg_19.png\nubg_13.png\nubg_41.png\nubg_1.png\nubg_12.png\nubg_43.png\nubg_27.png\nubg_19.png\nubg_39.png\nubg_20.png\nubg_17.png\nubg_9.png\nubg_36.png\nubg_43.png\nubg_33.png", daoSession110, dVar311).d();
                                return;
                            }
                            if (dj.b.f23431e == null) {
                                synchronized (dj.b.class) {
                                    if (dj.b.f23431e == null) {
                                        LingoSkillApplication lingoSkillApplication210 = LingoSkillApplication.f21665b;
                                        m.c(lingoSkillApplication210);
                                        dj.b.f23431e = new dj.b(lingoSkillApplication210);
                                    }
                                    break;
                                }
                            }
                            dj.b bVar13 = dj.b.f23431e;
                            m.c(bVar13);
                            DaoSession daoSessionB13 = bVar13.b();
                            d dVar312 = this.P;
                            m.c(dVar312);
                            new com.lingo.lingoskill.base.refill.m(this, "http://192.168.31.31:2323/AdminZG/", daoSessionB13, dVar312).b();
                            return;
                        case 16:
                            if (ij.d.f34419e == null) {
                                synchronized (ij.d.class) {
                                    if (ij.d.f34419e == null) {
                                        LingoSkillApplication lingoSkillApplication211 = LingoSkillApplication.f21665b;
                                        m.c(lingoSkillApplication211);
                                        ij.d.f34419e = new ij.d(lingoSkillApplication211);
                                    }
                                    break;
                                }
                            }
                            ij.d dVar313 = ij.d.f34419e;
                            m.c(dVar313);
                            DaoSession daoSession111 = (DaoSession) dVar313.f34423d;
                            d dVar314 = this.P;
                            m.c(dVar314);
                            new h(this, "http://192.168.31.31:1212/AdminZG/", "uicon_81.png\nuicon_36.png\nuicon_83.png\nuicon_3.png\nuicon_9.png\nuicon_4.png\nuicon_10.png\nuicon_5.png\nuicon_24.png\nuicon_18.png\nuicon_99.png\nuicon_66.png\nuicon_37.png\nuicon_8.png\nuicon_7.png\nuicon_55.png\nuicon_20.png\nuicon_68.png\nuicon_35.png\nuicon_25.png\nuicon_71.png\nuicon_16.png\nuicon_2.png\nuicon_15.png\nuicon_140.png\nuicon_38.png\nuicon_67.png\nuicon_12.png\nuicon_13.png\nuicon_121.png\nuicon_119.png\nuicon_29.png\nuicon_21.png\nuicon_19.png\nuicon_27.png\nuicon_77.png\nuicon_17.png\nuicon_28.png\nuicon_69.png\nuicon_114.png\nuicon_80.png\nuicon_108.png\nuicon_22.png\nuicon_105.png\nuicon_33.png\nuicon_47.png\nuicon_32.png\nuicon_134.png\nuicon_95.png\nuicon_116.png\nuicon_118.png\nuicon_76.png\nuicon_78.png\nuicon_115.png\nuicon_26.png\nuicon_102.png\nuicon_44.png\nuicon_135.png\nuicon_136.png\nuicon_112.png\nuicon_137.png\nuicon_46.png\nuicon_43.png\nuicon_40.png", "ubg_36.png\nubg_9.png\nubg_13.png\nubg_31.png\nubg_30.png\nubg_11.png\nubg_19.png\nubg_32.png\nubg_18.png\nubg_29.png\nubg_21.png\nubg_7.png\nubg_32.png\nubg_37.png\nubg_6.png\nubg_22.png\nubg_11.png\nubg_41.png\nubg_5.png\nubg_18.png\nubg_23.png\nubg_39.png\nubg_13.png\nubg_15.png\nubg_20.png\nubg_45.png\nubg_6.png\nubg_29.png\nubg_4.png\nubg_31.png\nubg_1.png\nubg_30.png\nubg_14.png\nubg_17.png\nubg_20.png\nubg_27.png\nubg_25.png\nubg_17.png\nubg_19.png\nubg_21.png\nubg_39.png\nubg_41.png\nubg_25.png\nubg_4.png\nubg_13.png\nubg_19.png\nubg_16.png\nubg_24.png\nubg_21.png\nubg_6.png\nubg_13.png\nubg_42.png\nubg_28.png\nubg_32.png\nubg_10.png\nubg_18.png\nubg_17.png\nubg_26.png\nubg_36.png\nubg_23.png\nubg_34.png\nubg_3.png\nubg_40.png\nubg_43.png", daoSession111, dVar314).d();
                            return;
                        case 17:
                            if (ij.d.f34419e == null) {
                                synchronized (ij.d.class) {
                                    if (ij.d.f34419e == null) {
                                        LingoSkillApplication lingoSkillApplication212 = LingoSkillApplication.f21665b;
                                        m.c(lingoSkillApplication212);
                                        ij.d.f34419e = new ij.d(lingoSkillApplication212);
                                    }
                                    break;
                                }
                            }
                            ij.d dVar315 = ij.d.f34419e;
                            m.c(dVar315);
                            DaoSession daoSession112 = (DaoSession) dVar315.f34423d;
                            d dVar316 = this.P;
                            m.c(dVar316);
                            new h(this, "http://192.168.31.31:1919/AdminZG/", "uicon_46.png\nuicon_36.png\nuicon_10.png\nuicon_13.png\nuicon_5.png\nuicon_112.png\nuicon_62.png\nuicon_8.png\nuicon_1.png\nuicon_7.png\nuicon_16.png\nuicon_100.png\nuicon_76.png\nuicon_80.png\nuicon_137.png\nuicon_134.png\nuicon_32.png\nuicon_25.png\nuicon_14.png\nuicon_2.png\nuicon_18.png\nuicon_15.png\nuicon_55.png\nuicon_70.png\nuicon_89.png\nuicon_24.png\nuicon_17.png\nuicon_22.png\nuicon_67.png\nuicon_21.png\nuicon_102.png\nuicon_28.png\nuicon_69.png\nuicon_37.png\nuicon_99.png\nuicon_103.png\nuicon_71.png\nuicon_140.png\nuicon_116.png\nuicon_119.png\nuicon_117.png\nuicon_49.png\nuicon_50.png\nuicon_59.png\nuicon_85.png\nuicon_93.png\nuicon_135.png\nuicon_33.png\nuicon_44.png\nuicon_68.png\nuicon_75.png\nuicon_34.png\nuicon_122.png\nuicon_90.png\nuicon_81.png\nuicon_82.png\nuicon_98.png\nuicon_29.png\nuicon_49.png\nuicon_104.png\nuicon_125.png\nuicon_50.png\nuicon_81.png\nuicon_82.png\nuicon_83.png\nuicon_94.png\nuicon_47.png", "ubg_42.png\nubg_9.png\nubg_42.png\nubg_2.png\nubg_32.png\nubg_31.png\nubg_34.png\nubg_37.png\nubg_26.png\nubg_6.png\nubg_39.png\nubg_21.png\nubg_24.png\nubg_20.png\nubg_40.png\nubg_21.png\nubg_31.png\nubg_18.png\nubg_14.png\nubg_29.png\nubg_13.png\nubg_39.png\nubg_22.png\nubg_26.png\nubg_7.png\nubg_18.png\nubg_28.png\nubg_25.png\nubg_38.png\nubg_25.png\nubg_8.png\nubg_17.png\nubg_44.png\nubg_10.png\nubg_21.png\nubg_20.png\nubg_41.png\nubg_34.png\nubg_4.png\nubg_25.png\nubg_4.png\nubg_21.png\nubg_2.png\nubg_7.png\nubg_23.png\nubg_17.png\nubg_15.png\nubg_30.png\nubg_3.png\nubg_38.png\nubg_24.png\nubg_42.png\nubg_34.png\nubg_45.png\nubg_43.png\nubg_1.png\nubg_19.png\nubg_38.png\nubg_40.png\nubg_27.png\nubg_11.png\nubg_33.png\nubg_41.png\nubg_12.png\nubg_43.png\nubg_36.png\nubg_45.png", daoSession112, dVar316).d();
                            return;
                        case 18:
                            if (((o0) l()).f27733a.scLanguage == -1) {
                                if (ij.d.f34419e == null) {
                                    synchronized (ij.d.class) {
                                        if (ij.d.f34419e == null) {
                                            LingoSkillApplication lingoSkillApplication30 = LingoSkillApplication.f21665b;
                                            m.c(lingoSkillApplication30);
                                            ij.d.f34419e = new ij.d(lingoSkillApplication30);
                                        }
                                        break;
                                    }
                                }
                                ij.d dVar49 = ij.d.f34419e;
                                m.c(dVar49);
                                DaoSession daoSession20 = (DaoSession) dVar49.f34423d;
                                d dVar50 = this.P;
                                m.c(dVar50);
                                new h(this, "http://192.168.31.31:1414/AdminZG/", "uicon_112.png\nuicon_92.png\nuicon_56.png\nuicon_146.png\nuicon_5.png\nuicon_139.png\nuicon_2.png\nuicon_61.png\nuicon_6.png\nuicon_141.png\nuicon_66.png\nuicon_93.png\nuicon_59.png\nuicon_77.png\nuicon_70.png\nuicon_103.png\nuicon_22.png\nuicon_55.png\nuicon_8.png\nuicon_138.png\nuicon_149.png\nuicon_44.png\nuicon_89.png\nuicon_35.png\nuicon_45.png\nuicon_68.png\nuicon_97.png\nuicon_121.png\nuicon_18.png\nuicon_19.png\nuicon_136.png\nuicon_81.png\nuicon_82.png", "ubg_31.png\nubg_23.png\nubg_41.png\nubg_14.png\nubg_32.png\nubg_26.png\nubg_13.png\nubg_27.png\nubg_9.png\nubg_3.png\nubg_39.png\nubg_17.png\nubg_17.png\nubg_8.png\nubg_10.png\nubg_24.png\nubg_25.png\nubg_21.png\nubg_37.png\nubg_38.png\nubg_42.png\nubg_27.png\nubg_32.png\nubg_45.png\nubg_31.png\nubg_27.png\nubg_28.png\nubg_29.png\nubg_17.png\nubg_9.png\nubg_14.png\nubg_21.png\nubg_13.png", daoSession20, dVar50).d();
                                return;
                            }
                            if (dj.b.f23431e == null) {
                                synchronized (dj.b.class) {
                                    if (dj.b.f23431e == null) {
                                        LingoSkillApplication lingoSkillApplication31 = LingoSkillApplication.f21665b;
                                        m.c(lingoSkillApplication31);
                                        dj.b.f23431e = new dj.b(lingoSkillApplication31);
                                    }
                                    break;
                                }
                            }
                            dj.b bVar14 = dj.b.f23431e;
                            m.c(bVar14);
                            DaoSession daoSessionB14 = bVar14.b();
                            d dVar51 = this.P;
                            m.c(dVar51);
                            new com.lingo.lingoskill.base.refill.m(this, "http://192.168.31.31:1414/AdminZG/", daoSessionB14, dVar51).b();
                            return;
                        case 19:
                            if (((o0) l()).f27733a.scLanguage == -1) {
                                if (ij.d.f34419e == null) {
                                    synchronized (ij.d.class) {
                                        if (ij.d.f34419e == null) {
                                            LingoSkillApplication lingoSkillApplication32 = LingoSkillApplication.f21665b;
                                            m.c(lingoSkillApplication32);
                                            ij.d.f34419e = new ij.d(lingoSkillApplication32);
                                        }
                                        break;
                                    }
                                }
                                ij.d dVar52 = ij.d.f34419e;
                                m.c(dVar52);
                                DaoSession daoSession21 = (DaoSession) dVar52.f34423d;
                                d dVar53 = this.P;
                                m.c(dVar53);
                                new h(this, "http://192.168.31.31:2929/AdminZG/", "uicon_112.png\nuicon_146.png\nuicon_90.png\nuicon_32.png\nuicon_56.png\nuicon_66.png\nuicon_5.png\nuicon_2.png\nuicon_1.png\nuicon_81.png\nuicon_82.png\nuicon_35.png\nuicon_73.png\nuicon_19.png\nuicon_120.png\nuicon_92.png\nuicon_17.png\nuicon_136.png\nuicon_28.png\nuicon_103.png\nuicon_80.png\nuicon_5.png\nuicon_22.png\nuicon_33.png\nuicon_55.png\nuicon_8.png\nuicon_5.png\nuicon_79.png\nuicon_89.png\nuicon_43.png", "ubg_31.png\nubg_14.png\nubg_39.png\nubg_4.png\nubg_9.png\nubg_45.png\nubg_32.png\nubg_13.png\nubg_26.png\nubg_40.png\nubg_40.png\nubg_3.png\nubg_8.png\nubg_9.png\nubg_34.png\nubg_23.png\nubg_2.png\nubg_44.png\nubg_17.png\nubg_24.png\nubg_21.png\nubg_32.png\nubg_37.png\nubg_6.png\nubg_22.png\nubg_37.png\nubg_32.png\nubg_1.png\nubg_11.png\nubg_30.png", daoSession21, dVar53).d();
                                return;
                            }
                            if (dj.b.f23431e == null) {
                                synchronized (dj.b.class) {
                                    if (dj.b.f23431e == null) {
                                        LingoSkillApplication lingoSkillApplication33 = LingoSkillApplication.f21665b;
                                        m.c(lingoSkillApplication33);
                                        dj.b.f23431e = new dj.b(lingoSkillApplication33);
                                    }
                                    break;
                                }
                            }
                            dj.b bVar15 = dj.b.f23431e;
                            m.c(bVar15);
                            DaoSession daoSessionB15 = bVar15.b();
                            d dVar54 = this.P;
                            m.c(dVar54);
                            new com.lingo.lingoskill.base.refill.m(this, "http://192.168.31.31:2929/AdminZG/", daoSessionB15, dVar54).b();
                            return;
                        case 20:
                            break;
                        case 21:
                            if (((o0) l()).f27733a.scLanguage == -1) {
                                if (ij.d.f34419e == null) {
                                    synchronized (ij.d.class) {
                                        if (ij.d.f34419e == null) {
                                            LingoSkillApplication lingoSkillApplication34 = LingoSkillApplication.f21665b;
                                            m.c(lingoSkillApplication34);
                                            ij.d.f34419e = new ij.d(lingoSkillApplication34);
                                        }
                                        break;
                                    }
                                }
                                ij.d dVar55 = ij.d.f34419e;
                                m.c(dVar55);
                                DaoSession daoSession22 = (DaoSession) dVar55.f34423d;
                                d dVar56 = this.P;
                                m.c(dVar56);
                                new h(this, "http://192.168.31.31:2525/AdminZG/", "uicon_112.png\nuicon_56.png\nuicon_43.png\nuicon_146.png\nuicon_61.png\nuicon_5.png\nuicon_139.png\nuicon_16.png\nuicon_32.png\nuicon_141.png\nuicon_6.png\nuicon_44.png\nuicon_18.png\nuicon_148.png\nuicon_70.png\nuicon_36.png\nuicon_103.png\nuicon_35.png\nuicon_22.png\nuicon_55.png\nuicon_8.png\nuicon_2.png\nuicon_7.png\nuicon_33.png\nuicon_20.png\nuicon_136.png\nuicon_30.png\nuicon_151.png\nuicon_120.png\nuicon_149.png", "ubg_31.png\nubg_41.png\nubg_9.png\nubg_14.png\nubg_27.png\nubg_32.png\nubg_26.png\nubg_39.png\nubg_4.png\nubg_3.png\nubg_32.png\nubg_27.png\nubg_17.png\nubg_42.png\nubg_10.png\nubg_11.png\nubg_24.png\nubg_45.png\nubg_25.png\nubg_38.png\nubg_37.png\nubg_13.png\nubg_14.png\nubg_12.png\nubg_11.png\nubg_28.png\nubg_44.png\nubg_29.png\nubg_34.png\nubg_8.png", daoSession22, dVar56).d();
                                return;
                            }
                            if (dj.b.f23431e == null) {
                                synchronized (dj.b.class) {
                                    if (dj.b.f23431e == null) {
                                        LingoSkillApplication lingoSkillApplication35 = LingoSkillApplication.f21665b;
                                        m.c(lingoSkillApplication35);
                                        dj.b.f23431e = new dj.b(lingoSkillApplication35);
                                    }
                                    break;
                                }
                            }
                            dj.b bVar16 = dj.b.f23431e;
                            m.c(bVar16);
                            DaoSession daoSessionB16 = bVar16.b();
                            d dVar57 = this.P;
                            m.c(dVar57);
                            new com.lingo.lingoskill.base.refill.m(this, "http://192.168.31.31:2525/AdminZG/", daoSessionB16, dVar57).b();
                            return;
                        default:
                            switch (i11) {
                                case 47:
                                case 48:
                                    if (ij.d.f34419e == null) {
                                        synchronized (ij.d.class) {
                                            if (ij.d.f34419e == null) {
                                                LingoSkillApplication lingoSkillApplication36 = LingoSkillApplication.f21665b;
                                                m.c(lingoSkillApplication36);
                                                ij.d.f34419e = new ij.d(lingoSkillApplication36);
                                            }
                                            break;
                                        }
                                    }
                                    ij.d dVar58 = ij.d.f34419e;
                                    m.c(dVar58);
                                    DaoSession daoSession23 = (DaoSession) dVar58.f34423d;
                                    d dVar59 = this.P;
                                    m.c(dVar59);
                                    new h(this, "http://192.168.31.31:4141/AdminZG/", "uicon_112.png\nuicon_77.png\nuicon_2.png\nuicon_14.png\nuicon_32.png\nuicon_36.png\nuicon_19.png\nuicon_10.png\nuicon_5.png\nuicon_34.png\nuicon_44.png\nuicon_59.png\nuicon_110.png\nuicon_18.png\nuicon_101.png\nuicon_25.png\nuicon_76.png\nuicon_5.png\nuicon_24.png\nuicon_55.png\nuicon_20.png\nuicon_29.png\nuicon_16.png\nuicon_68.png\nuicon_21.png\nuicon_19.png\nuicon_15.png\nuicon_57.png\nuicon_121.png\nuicon_30.png\nuicon_13.png\nuicon_55.png\nuicon_1.png\nuicon_95.png\nuicon_18.png\nuicon_69.png\nuicon_15.png\nuicon_97.png\nuicon_120.png\nuicon_49.png\nuicon_50.png\nuicon_39.png\nuicon_40.png\nuicon_136.png\nuicon_51.png\nuicon_47.png\nuicon_67.png\nuicon_96.png\nuicon_21.png\nuicon_57.png\nuicon_135.png\nuicon_44.png\nuicon_93.png\nuicon_67.png\nuicon_71.png\nuicon_116.png\nuicon_105.png\nuicon_99.png\nuicon_128.png\nuicon_80.png\nuicon_38.png\nuicon_7.png\nuicon_134.png\nuicon_118.png\nuicon_52.png\nuicon_15.png\nuicon_115.png\nuicon_102.png\nuicon_98.png\nuicon_46.png\nuicon_118.png\nuicon_86.png\nuicon_49.png\nuicon_50.png\nuicon_51.png\nuicon_57.png\nuicon_69.png\nuicon_15.png\nuicon_13.png\nuicon_63.png\nuicon_90.png\nuicon_43.png\nuicon_19.png\nuicon_12.png\nuicon_33.png\nuicon_115.png\nuicon_4.png\nuicon_62.png\nuicon_97.png\nuicon_89.png\nuicon_136.png\nuicon_116.png\nuicon_126.png\nuicon_62.png\nuicon_29.png\nuicon_22.png\nuicon_117.png\nuicon_121.png\nuicon_99.png\nuicon_81.png\nuicon_58.png\nuicon_29.png\nuicon_146.png\nuicon_116.png\nuicon_104.png\nuicon_82.png\nuicon_3.png\nuicon_49.png\nuicon_50.png\nuicon_13.png\nuicon_81.png\nuicon_82.png\nuicon_83.png\nuicon_141.png\nuicon_115.png\nuicon_11.png\nuicon_134.png\nuicon_84.png\nuicon_116.png\nuicon_71.png\nuicon_29.png\nuicon_142.png\nuicon_45.png\nuicon_23.png\nuicon_58.png\nuicon_49.png\nuicon_50.png\nuicon_57.png\nuicon_46.png\nuicon_38.png\nuicon_9.png\nuicon_129.png\nuicon_79.png\nuicon_94.png\nuicon_30.png\nuicon_24.png\nuicon_75.png\nuicon_117.png\nuicon_47.png\nuicon_81.png\nuicon_82.png\nuicon_83.png\nuicon_105.png\nuicon_76.png\nuicon_93.png", "ubg_31.png\nubg_31.png\nubg_13.png\nubg_14.png\nubg_4.png\nubg_21.png\nubg_9.png\nubg_19.png\nubg_32.png\nubg_42.png\nubg_17.png\nubg_12.png\nubg_24.png\nubg_29.png\nubg_2.png\nubg_18.png\nubg_24.png\nubg_32.png\nubg_18.png\nubg_22.png\nubg_11.png\nubg_40.png\nubg_28.png\nubg_24.png\nubg_43.png\nubg_9.png\nubg_45.png\nubg_45.png\nubg_12.png\nubg_30.png\nubg_2.png\nubg_22.png\nubg_26.png\nubg_38.png\nubg_29.png\nubg_44.png\nubg_45.png\nubg_28.png\nubg_12.png\nubg_40.png\nubg_43.png\nubg_23.png\nubg_2.png\nubg_27.png\nubg_41.png\nubg_38.png\nubg_18.png\nubg_42.png\nubg_40.png\nubg_33.png\nubg_3.png\nubg_27.png\nubg_17.png\nubg_39.png\nubg_6.png\nubg_2.png\nubg_8.png\nubg_24.png\nubg_24.png\nubg_10.png\nubg_38.png\nubg_26.png\nubg_11.png\nubg_28.png\nubg_37.png\nubg_45.png\nubg_28.png\nubg_8.png\nubg_25.png\nubg_4.png\nubg_28.png\nubg_2.png\nubg_18.png\nubg_2.png\nubg_40.png\nubg_45.png\nubg_14.png\nubg_7.png\nubg_22.png\nubg_29.png\nubg_30.png\nubg_13.png\nubg_9.png\nubg_25.png\nubg_23.png\nubg_30.png\nubg_33.png\nubg_12.png\nubg_27.png\nubg_3.png\nubg_19.png\nubg_40.png\nubg_39.png\nubg_2.png\nubg_32.png\nubg_41.png\nubg_34.png\nubg_31.png\nubg_24.png\nubg_37.png\nubg_9.png\nubg_42.png\nubg_15.png\nubg_4.png\nubg_6.png\nubg_21.png\nubg_31.png\nubg_18.png\nubg_44.png\nubg_40.png\nubg_30.png\nubg_2.png\nubg_4.png\nubg_14.png\nubg_28.png\nubg_8.png\nubg_44.png\nubg_30.png\nubg_19.png\nubg_43.png\nubg_12.png\nubg_21.png\nubg_31.png\nubg_4.png\nubg_9.png\nubg_40.png\nubg_38.png\nubg_33.png\nubg_43.png\nubg_19.png\nubg_1.png\nubg_34.png\nubg_42.png\nubg_45.png\nubg_44.png\nubg_10.png\nubg_38.png\nubg_1.png\nubg_2.png\nubg_32.png\nubg_4.png\nubg_2.png\nubg_17.png\nubg_43.png\nubg_25.png", daoSession23, dVar59).d();
                                    return;
                                case 49:
                                case 50:
                                    if (ij.d.f34419e == null) {
                                        synchronized (ij.d.class) {
                                            if (ij.d.f34419e == null) {
                                                LingoSkillApplication lingoSkillApplication37 = LingoSkillApplication.f21665b;
                                                m.c(lingoSkillApplication37);
                                                ij.d.f34419e = new ij.d(lingoSkillApplication37);
                                            }
                                            break;
                                        }
                                    }
                                    ij.d dVar60 = ij.d.f34419e;
                                    m.c(dVar60);
                                    DaoSession daoSession24 = (DaoSession) dVar60.f34423d;
                                    d dVar61 = this.P;
                                    m.c(dVar61);
                                    new h(this, "http://192.168.31.31:9601/AdminZG/", "uicon_112.png\nuicon_77.png\nuicon_2.png\nuicon_14.png\nuicon_32.png\nuicon_36.png\nuicon_19.png\nuicon_10.png\nuicon_5.png\nuicon_34.png\nuicon_44.png\nuicon_59.png\nuicon_110.png\nuicon_18.png\nuicon_101.png\nuicon_25.png\nuicon_76.png\nuicon_5.png\nuicon_24.png\nuicon_55.png\nuicon_20.png\nuicon_29.png\nuicon_16.png\nuicon_68.png\nuicon_21.png\nuicon_19.png\nuicon_15.png\nuicon_57.png\nuicon_121.png\nuicon_30.png\nuicon_13.png\nuicon_55.png\nuicon_1.png\nuicon_95.png\nuicon_18.png\nuicon_69.png\nuicon_15.png\nuicon_97.png\nuicon_120.png\nuicon_49.png\nuicon_50.png\nuicon_39.png\nuicon_40.png\nuicon_136.png\nuicon_51.png\nuicon_47.png\nuicon_67.png\nuicon_96.png\nuicon_21.png\nuicon_57.png\nuicon_135.png\nuicon_44.png\nuicon_93.png\nuicon_67.png\nuicon_71.png\nuicon_116.png\nuicon_105.png\nuicon_99.png\nuicon_128.png\nuicon_80.png\nuicon_38.png\nuicon_7.png\nuicon_134.png\nuicon_118.png\nuicon_52.png\nuicon_15.png\nuicon_115.png\nuicon_102.png\nuicon_98.png\nuicon_46.png\nuicon_118.png\nuicon_86.png\nuicon_49.png\nuicon_50.png\nuicon_51.png\nuicon_57.png\nuicon_69.png\nuicon_15.png\nuicon_13.png\nuicon_63.png\nuicon_90.png\nuicon_43.png\nuicon_19.png\nuicon_12.png\nuicon_33.png\nuicon_115.png\nuicon_4.png\nuicon_62.png\nuicon_97.png\nuicon_89.png\nuicon_136.png\nuicon_116.png\nuicon_126.png\nuicon_62.png\nuicon_29.png\nuicon_22.png\nuicon_117.png\nuicon_121.png\nuicon_99.png\nuicon_81.png\nuicon_58.png\nuicon_29.png\nuicon_146.png\nuicon_116.png\nuicon_104.png\nuicon_82.png\nuicon_3.png\nuicon_49.png\nuicon_50.png\nuicon_13.png\nuicon_81.png\nuicon_82.png\nuicon_83.png\nuicon_141.png\nuicon_115.png\nuicon_11.png\nuicon_134.png\nuicon_84.png\nuicon_116.png\nuicon_71.png\nuicon_29.png\nuicon_142.png\nuicon_45.png\nuicon_23.png\nuicon_58.png\nuicon_49.png\nuicon_50.png\nuicon_57.png\nuicon_46.png\nuicon_38.png\nuicon_9.png\nuicon_129.png\nuicon_79.png\nuicon_94.png\nuicon_30.png\nuicon_24.png\nuicon_75.png\nuicon_117.png\nuicon_47.png\nuicon_81.png\nuicon_82.png\nuicon_83.png\nuicon_105.png\nuicon_76.png\nuicon_93.png", "ubg_31.png\nubg_31.png\nubg_13.png\nubg_14.png\nubg_4.png\nubg_21.png\nubg_9.png\nubg_19.png\nubg_32.png\nubg_42.png\nubg_17.png\nubg_12.png\nubg_24.png\nubg_29.png\nubg_2.png\nubg_18.png\nubg_24.png\nubg_32.png\nubg_18.png\nubg_22.png\nubg_11.png\nubg_40.png\nubg_28.png\nubg_24.png\nubg_43.png\nubg_9.png\nubg_45.png\nubg_45.png\nubg_12.png\nubg_30.png\nubg_2.png\nubg_22.png\nubg_26.png\nubg_38.png\nubg_29.png\nubg_44.png\nubg_45.png\nubg_28.png\nubg_12.png\nubg_40.png\nubg_43.png\nubg_23.png\nubg_2.png\nubg_27.png\nubg_41.png\nubg_38.png\nubg_18.png\nubg_42.png\nubg_40.png\nubg_33.png\nubg_3.png\nubg_27.png\nubg_17.png\nubg_39.png\nubg_6.png\nubg_2.png\nubg_8.png\nubg_24.png\nubg_24.png\nubg_10.png\nubg_38.png\nubg_26.png\nubg_11.png\nubg_28.png\nubg_37.png\nubg_45.png\nubg_28.png\nubg_8.png\nubg_25.png\nubg_4.png\nubg_28.png\nubg_2.png\nubg_18.png\nubg_2.png\nubg_40.png\nubg_45.png\nubg_14.png\nubg_7.png\nubg_22.png\nubg_29.png\nubg_30.png\nubg_13.png\nubg_9.png\nubg_25.png\nubg_23.png\nubg_30.png\nubg_33.png\nubg_12.png\nubg_27.png\nubg_3.png\nubg_19.png\nubg_40.png\nubg_39.png\nubg_2.png\nubg_32.png\nubg_41.png\nubg_34.png\nubg_31.png\nubg_24.png\nubg_37.png\nubg_9.png\nubg_42.png\nubg_15.png\nubg_4.png\nubg_6.png\nubg_21.png\nubg_31.png\nubg_18.png\nubg_44.png\nubg_40.png\nubg_30.png\nubg_2.png\nubg_4.png\nubg_14.png\nubg_28.png\nubg_8.png\nubg_44.png\nubg_30.png\nubg_19.png\nubg_43.png\nubg_12.png\nubg_21.png\nubg_31.png\nubg_4.png\nubg_9.png\nubg_40.png\nubg_38.png\nubg_33.png\nubg_43.png\nubg_19.png\nubg_1.png\nubg_34.png\nubg_42.png\nubg_45.png\nubg_44.png\nubg_10.png\nubg_38.png\nubg_1.png\nubg_2.png\nubg_32.png\nubg_4.png\nubg_2.png\nubg_17.png\nubg_43.png\nubg_25.png", daoSession24, dVar61).d();
                                    return;
                                case 51:
                                    break;
                                default:
                                    switch (i11) {
                                        case 53:
                                        case 54:
                                            if (ij.d.f34419e == null) {
                                                synchronized (ij.d.class) {
                                                    if (ij.d.f34419e == null) {
                                                        LingoSkillApplication lingoSkillApplication38 = LingoSkillApplication.f21665b;
                                                        m.c(lingoSkillApplication38);
                                                        ij.d.f34419e = new ij.d(lingoSkillApplication38);
                                                    }
                                                    break;
                                                }
                                            }
                                            ij.d dVar62 = ij.d.f34419e;
                                            m.c(dVar62);
                                            DaoSession daoSession25 = (DaoSession) dVar62.f34423d;
                                            d dVar63 = this.P;
                                            m.c(dVar63);
                                            new h(this, "http://192.168.31.31:4343/AdminZG/", "uicon_112.png\nuicon_61.png\nuicon_6.png\nuicon_122.png\nuicon_2.png\nuicon_56.png\nuicon_36.png\nuicon_20.png\nuicon_8.png\nuicon_43.png\nuicon_62.png\nuicon_18.png\nuicon_3.png\nuicon_15.png\nuicon_44.png\nuicon_45.png\nuicon_84.png\nuicon_16.png\nuicon_65.png\nuicon_99.png\nuicon_24.png\nuicon_69.png\nuicon_30.png\nuicon_123.png\nuicon_20.png\nuicon_34.png\nuicon_25.png\nuicon_22.png\nuicon_90.png\nuicon_141.png\nuicon_42.png\nuicon_55.png\nuicon_68.png\nuicon_139.png\nuicon_5.png\nuicon_133.png\nuicon_24.png\nuicon_140.png\nuicon_67.png\nuicon_33.png\nuicon_17.png\nuicon_135.png\nuicon_110.png\nuicon_126.png\nuicon_100.png\nuicon_137.png\nuicon_14.png\nuicon_146.png\nuicon_38.png\nuicon_95.png\nuicon_128.png\nuicon_129.png\nuicon_79.png\nuicon_35.png\nuicon_112.png\nuicon_137.png\nuicon_19.png\nuicon_18.png\nuicon_123.png\nuicon_20.png\nuicon_66.png\nuicon_18.png\nuicon_121.png\nuicon_151.png\nuicon_128.png\nuicon_129.png\nuicon_67.png\nuicon_105.png\nuicon_121.png\nuicon_49.png\nuicon_45.png\nuicon_90.png\nuicon_50.png\nuicon_51.png\nuicon_81.png\nuicon_82.png\nuicon_123.png\nuicon_18.png\nuicon_80.png\nuicon_33.png\nuicon_32.png\nuicon_6.png\nuicon_102.png\nuicon_17.png\nuicon_59.png\nuicon_133.png\nuicon_3.png\nuicon_105.png\nuicon_44.png\nuicon_18.png\nuicon_134.png\nuicon_62.png\nuicon_123.png\nuicon_19.png\nuicon_144.png\nuicon_30.png\nuicon_125.png\nuicon_66.png\nuicon_20.png\nuicon_89.png\nuicon_85.png\nuicon_75.png\nuicon_55.png\nuicon_130.png\nuicon_27.png\nuicon_99.png\nuicon_8.png\nuicon_149.png\nuicon_148.png\nuicon_78.png\nuicon_76.png\nuicon_137.png\nuicon_113.png\nuicon_26.png\nuicon_42.png\nuicon_135.png\nuicon_141.png\nuicon_28.png\nuicon_122.png\nuicon_43.png\nuicon_34.png\nuicon_47.png\nuicon_95.png\nuicon_43.png\nuicon_79.png\nuicon_105.png\nuicon_114.png\nuicon_120.png\nuicon_29.png\nuicon_150.png\nuicon_150.png", "ubg_31.png\nubg_30.png\nubg_23.png\nubg_28.png\nubg_13.png\nubg_11.png\nubg_9.png\nubg_22.png\nubg_37.png\nubg_8.png\nubg_4.png\nubg_29.png\nubg_43.png\nubg_45.png\nubg_6.png\nubg_32.png\nubg_2.png\nubg_44.png\nubg_18.png\nubg_27.png\nubg_24.png\nubg_12.png\nubg_19.png\nubg_29.png\nubg_11.png\nubg_27.png\nubg_10.png\nubg_25.png\nubg_32.png\nubg_3.png\nubg_7.png\nubg_22.png\nubg_42.png\nubg_26.png\nubg_32.png\nubg_41.png\nubg_10.png\nubg_27.png\nubg_6.png\nubg_25.png\nubg_38.png\nubg_18.png\nubg_29.png\nubg_22.png\nubg_28.png\nubg_43.png\nubg_3.png\nubg_14.png\nubg_2.png\nubg_34.png\nubg_13.png\nubg_1.png\nubg_44.png\nubg_17.png\nubg_31.png\nubg_11.png\nubg_9.png\nubg_42.png\nubg_22.png\nubg_29.png\nubg_40.png\nubg_12.png\nubg_2.png\nubg_29.png\nubg_20.png\nubg_1.png\nubg_18.png\nubg_6.png\nubg_3.png\nubg_2.png\nubg_31.png\nubg_17.png\nubg_19.png\nubg_12.png\nubg_13.png\nubg_11.png\nubg_22.png\nubg_43.png\nubg_40.png\nubg_42.png\nubg_34.png\nubg_9.png\nubg_27.png\nubg_39.png\nubg_4.png\nubg_13.png\nubg_31.png\nubg_3.png\nubg_17.png\nubg_43.png\nubg_18.png\nubg_21.png\nubg_22.png\nubg_23.png\nubg_14.png\nubg_44.png\nubg_1.png\nubg_41.png\nubg_11.png\nubg_38.png\nubg_7.png\nubg_28.png\nubg_11.png\nubg_23.png\nubg_24.png\nubg_2.png\nubg_37.png\nubg_27.png\nubg_41.png\nubg_38.png\nubg_33.png\nubg_18.png\nubg_8.png\nubg_10.png\nubg_20.png\nubg_12.png\nubg_3.png\nubg_44.png\nubg_25.png\nubg_30.png\nubg_38.png\nubg_34.png\nubg_18.png\nubg_43.png\nubg_40.png\nubg_32.png\nubg_42.png\nubg_12.png\nubg_2.png\nubg_9.png\nubg_8.png", daoSession25, dVar63).d();
                                            return;
                                        case 55:
                                            break;
                                        default:
                                            return;
                                    }
                                    break;
                            }
                            if (((o0) l()).f27733a.scLanguage == -1) {
                                if (ij.d.f34419e == null) {
                                    synchronized (ij.d.class) {
                                        if (ij.d.f34419e == null) {
                                            LingoSkillApplication lingoSkillApplication39 = LingoSkillApplication.f21665b;
                                            m.c(lingoSkillApplication39);
                                            ij.d.f34419e = new ij.d(lingoSkillApplication39);
                                        }
                                        break;
                                    }
                                }
                                ij.d dVar64 = ij.d.f34419e;
                                m.c(dVar64);
                                DaoSession daoSession26 = (DaoSession) dVar64.f34423d;
                                d dVar65 = this.P;
                                m.c(dVar65);
                                new h(this, "http://192.168.31.31:1010/AdminZG/", "uicon_116.png\nuicon_104.png\nuicon_32.png\nuicon_10.png\nuicon_137.png\nuicon_14.png\nuicon_39.png\nuicon_2.png\nuicon_36.png\nuicon_112.png\nuicon_1.png\nuicon_16.png\nuicon_131.png\nuicon_30.png\nuicon_99.png\nuicon_25.png\nuicon_15.png\nuicon_57.png\nuicon_98.png\nuicon_84.png\nuicon_63.png\nuicon_42.png\nuicon_82.png\nuicon_83.png\nuicon_105.png\nuicon_103.png\nuicon_20.png\nuicon_89.png\nuicon_73.png\nuicon_28.png\nuicon_124.png\nuicon_19.png\nuicon_92.png\nuicon_110.png\nuicon_76.png\nuicon_62.png\nuicon_81.png\nuicon_118.png\nuicon_93.png\nuicon_66.png\nuicon_63.png\nuicon_85.png\nuicon_22.png\nuicon_126.png\nuicon_69.png\nuicon_133.png\nuicon_8.png\nuicon_81.png\nuicon_19.png\nuicon_2.png\nuicon_5.png\nuicon_25.png\nuicon_21.png\nuicon_137.png\nuicon_152.png\nuicon_9.png\nuicon_134.png\nuicon_40.png\nuicon_99.png\nuicon_46.png\nuicon_153.png\nuicon_8.png\nuicon_36.png\nuicon_131.png\nuicon_92.png\nuicon_130.png\nuicon_102.png\nuicon_42.png\nuicon_16.png\nuicon_146.png\nuicon_44.png\nuicon_89.png\nuicon_43.png\nuicon_116.png\nuicon_95.png\nuicon_132.png\nuicon_108.png\nuicon_28.png", "ubg_33.png\nubg_4.png\nubg_41.png\nubg_34.png\nubg_42.png\nubg_14.png\nubg_14.png\nubg_13.png\nubg_9.png\nubg_31.png\nubg_6.png\nubg_39.png\nubg_23.png\nubg_44.png\nubg_24.png\nubg_37.png\nubg_45.png\nubg_33.png\nubg_40.png\nubg_22.png\nubg_29.png\nubg_8.png\nubg_38.png\nubg_2.png\nubg_6.png\nubg_24.png\nubg_11.png\nubg_7.png\nubg_27.png\nubg_17.png\nubg_21.png\nubg_9.png\nubg_9.png\nubg_24.png\nubg_4.png\nubg_45.png\nubg_2.png\nubg_3.png\nubg_10.png\nubg_33.png\nubg_29.png\nubg_7.png\nubg_25.png\nubg_31.png\nubg_39.png\nubg_18.png\nubg_37.png\nubg_6.png\nubg_9.png\nubg_13.png\nubg_32.png\nubg_18.png\nubg_41.png\nubg_22.png\nubg_29.png\nubg_1.png\nubg_42.png\nubg_12.png\nubg_24.png\nubg_39.png\nubg_21.png\nubg_37.png\nubg_9.png\nubg_11.png\nubg_23.png\nubg_17.png\nubg_27.png\nubg_10.png\nubg_14.png\nubg_21.png\nubg_40.png\nubg_30.png\nubg_3.png\nubg_38.png\nubg_19.png\nubg_8.png\nubg_12.png\nubg_1.png", daoSession26, dVar65).d();
                                return;
                            }
                            if (dj.b.f23431e == null) {
                                synchronized (dj.b.class) {
                                    if (dj.b.f23431e == null) {
                                        LingoSkillApplication lingoSkillApplication40 = LingoSkillApplication.f21665b;
                                        m.c(lingoSkillApplication40);
                                        dj.b.f23431e = new dj.b(lingoSkillApplication40);
                                    }
                                    break;
                                }
                            }
                            dj.b bVar17 = dj.b.f23431e;
                            m.c(bVar17);
                            DaoSession daoSessionB17 = bVar17.b();
                            d dVar66 = this.P;
                            m.c(dVar66);
                            new com.lingo.lingoskill.base.refill.m(this, "http://192.168.31.31:1010/AdminZG/", daoSessionB17, dVar66).b();
                            return;
                    }
                    break;
            }
        }
        if (ij.d.f34419e == null) {
            synchronized (ij.d.class) {
                if (ij.d.f34419e == null) {
                    LingoSkillApplication lingoSkillApplication41 = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication41);
                    ij.d.f34419e = new ij.d(lingoSkillApplication41);
                }
            }
        }
        ij.d dVar67 = ij.d.f34419e;
        m.c(dVar67);
        DaoSession daoSession27 = (DaoSession) dVar67.f34423d;
        d dVar68 = this.P;
        m.c(dVar68);
        new h(this, "http://192.168.31.31:1111/AdminZG/", "uicon_81.png\nuicon_82.png\nuicon_36.png\nuicon_5.png\nuicon_13.png\nuicon_112.png\nuicon_10.png\nuicon_114.png\nuicon_62.png\nuicon_122.png\nuicon_8.png\nuicon_76.png\nuicon_99.png\nuicon_80.png\nuicon_137.png\nuicon_25.png\nuicon_5.png\nuicon_24.png\nuicon_1.png\nuicon_34.png\nuicon_55.png\nuicon_2.png\nuicon_15.png\nuicon_14.png\nuicon_16.png\nuicon_18.png\nuicon_89.png\nuicon_37.png\nuicon_116.png\nuicon_28.png\nuicon_22.png\nuicon_140.png\nuicon_116.png\nuicon_115.png\nuicon_99.png\nuicon_110.png\nuicon_102.png\nuicon_34.png\nuicon_49.png\nuicon_81.png\nuicon_82.png\nuicon_83.png\nuicon_126.png\nuicon_135.png\nuicon_141.png\nuicon_33.png\nuicon_101.png\nuicon_110.png\nuicon_50.png\nuicon_119.png\nuicon_46.png\nuicon_98.png\nuicon_97.png\nuicon_86.png\nuicon_34.png\nuicon_51.png\nuicon_28.png\nuicon_52.png\nuicon_29.png\nuicon_47.png\nuicon_36.png\nuicon_99.png\nuicon_110.png\nuicon_90.png\nuicon_29.png\nuicon_105.png\nuicon_106.png\nuicon_100.png\nuicon_74.png\nuicon_98.png\nuicon_97.png\nuicon_86.png\nuicon_117.png\nuicon_58.png\nuicon_13.png\nuicon_81.png\nuicon_82.png\nuicon_44.png\nuicon_94.png\nuicon_49.png\nuicon_50.png", "ubg_42.png\nubg_9.png\nubg_42.png\nubg_2.png\nubg_32.png\nubg_31.png\nubg_34.png\nubg_37.png\nubg_26.png\nubg_6.png\nubg_39.png\nubg_21.png\nubg_24.png\nubg_20.png\nubg_40.png\nubg_21.png\nubg_31.png\nubg_18.png\nubg_14.png\nubg_29.png\nubg_13.png\nubg_39.png\nubg_22.png\nubg_26.png\nubg_7.png\nubg_18.png\nubg_28.png\nubg_25.png\nubg_38.png\nubg_25.png\nubg_25.png\nubg_34.png\nubg_4.png\nubg_44.png\nubg_21.png\nubg_21.png\nubg_8.png\nubg_21.png\nubg_4.png\nubg_23.png\nubg_40.png\nubg_33.png\nubg_20.png\nubg_15.png\nubg_3.png\nubg_41.png\nubg_37.png\nubg_26.png\nubg_38.png\nubg_25.png\nubg_34.png\nubg_4.png\nubg_25.png\nubg_4.png\nubg_42.png\nubg_15.png\nubg_30.png\nubg_3.png\nubg_38.png\nubg_24.png\nubg_42.png\nubg_34.png\nubg_45.png\nubg_45.png\nubg_38.png\nubg_27.png\nubg_11.png\nubg_11.png\nubg_1.png\nubg_19.png\nubg_37.png\nubg_26.png\nubg_21.png\nubg_24.png\nubg_32.png\nubg_31.png\nubg_6.png\nubg_39.png\nubg_36.png\nubg_41.png\nubg_43.png", daoSession27, dVar68).d();
    }

    public UpdateLessonActivity() {
        super(iFLeRCXvYCGdPW.MUEhXDNbmNJB, p5.f4761a);
        j jVar = j.SYNCHRONIZED;
        this.Q = com.bumptech.glide.d.u(jVar, new s5(this, 0));
        this.R = com.bumptech.glide.d.u(jVar, new s5(this, 1));
        this.S = com.bumptech.glide.d.u(jVar, new s5(this, 2));
        com.bumptech.glide.d.u(jVar, new s5(this, 3));
        this.T = com.bumptech.glide.d.u(jVar, new s5(this, 4));
        this.U = com.bumptech.glide.d.u(jVar, new s5(this, 5));
        this.V = com.bumptech.glide.d.u(jVar, new s5(this, 6));
    }
}
