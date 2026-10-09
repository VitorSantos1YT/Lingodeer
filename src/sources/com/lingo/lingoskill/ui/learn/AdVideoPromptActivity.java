package com.lingo.lingoskill.ui.learn;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.ViewModelLazy;
import ar.a;
import ay.x;
import bp.f1;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.billing.Subscription2Activity;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.lingo.lingoskill.ui.learn.AdVideoPromptActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dy.j;
import f7.a0;
import f7.n;
import fa.EQx.nuRcCS;
import fz.c;
import gr.s;
import hh.y;
import hj.g;
import jh.i;
import ji.b;
import jp.l;
import jp.p;
import jp.q;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import ky.e;
import qp.m3;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AdVideoPromptActivity extends b {
    public static final /* synthetic */ int V = 0;
    public String P;
    public a0 Q;
    public boolean R;
    public CountDownTimer S;
    public p T;
    public final ViewModelLazy U;

    @Override // ji.b, l.m, androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((g) j()).f32588e.setPlayer(null);
    }

    @Override // ji.b, l.m, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent event) {
        m.f(event, "event");
        if (i11 == 4) {
            return true;
        }
        return super.onKeyDown(i11, event);
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public final void onPause() {
        super.onPause();
        CountDownTimer countDownTimer = this.S;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.S = null;
        a0 a0Var = this.Q;
        if (a0Var != null) {
            a0Var.r(false);
        }
        a0 a0Var2 = this.Q;
        if (a0Var2 != null) {
            p pVar = this.T;
            m.c(pVar);
            a0Var2.B(pVar);
        }
    }

    @Override // ji.b, androidx.fragment.app.p0, android.app.Activity
    public final void onResume() {
        super.onResume();
        a0 a0Var = this.Q;
        if (a0Var != null) {
            p pVar = this.T;
            m.c(pVar);
            a0Var.P.a(pVar);
        }
        a0 a0Var2 = this.Q;
        if (a0Var2 != null) {
            a0Var2.r(true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdVideoPromptActivity() {
        l lVar = l.f36507a;
        String str = iFLeRCXvYCGdPW.VkbocQX;
        super(str, lVar);
        this.P = str;
        this.U = new ViewModelLazy(z.a(rp.b.class), new q(this, 0), new y(15), new q(this, 1));
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra(INTENTS.EXTRA_STRING);
        if (stringExtra == null) {
            stringExtra = BuildConfig.VERSION_NAME;
        }
        this.P = stringExtra;
        final String str = (String) ry.m.q0(oz.q.W0((CharSequence) ry.m.z0(oz.q.W0(stringExtra, new String[]{"/"}, 0, 6)), new String[]{nuRcCS.CkbJSuyFcmeXckF}, 0, 6));
        m().c("jxz_enter_purchase_ads", new a(str, 7));
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        m.c(lingoSkillApplication);
        this.Q = new n(lingoSkillApplication).a();
        ((g) j()).f32588e.setPlayer(this.Q);
        rp.b bVar = (rp.b) this.U.getValue();
        String adVideoUrl = this.P;
        bVar.getClass();
        m.f(adVideoUrl, "adVideoUrl");
        String str2 = (String) ry.m.z0(oz.q.W0(adVideoUrl, new String[]{"/"}, 0, 6));
        x xVar = new x(new i(str2, 5));
        j jVar = e.f38937b;
        xVar.k(jVar).g(px.b.a()).f(new m3(str2, bVar, adVideoUrl)).k(jVar).g(px.b.a()).h(rp.a.f49329b, rp.a.f49330c);
        bVar.f49333a.observe(this, new f1(new s(this, 15), 4));
        ((g) j()).f32587d.setMax(AchievementLevelType.XP_LV_6);
        ((g) j()).f32587d.setProgress(4000.0f);
        this.T = new p(this, str);
        final int i11 = 0;
        bq.z.b(((g) j()).f32585b, new c(this) { // from class: jp.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdVideoPromptActivity f36498b;

            {
                this.f36498b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                qy.b0 b0Var = qy.b0.f48488a;
                final String str3 = str;
                final AdVideoPromptActivity adVideoPromptActivity = this.f36498b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        int i13 = AdVideoPromptActivity.V;
                        kotlin.jvm.internal.m.f(it, "it");
                        adVideoPromptActivity.finish();
                        Intent intent = new Intent(adVideoPromptActivity, (Class<?>) Subscription2Activity.class);
                        intent.putExtra(INTENTS.EXTRA_STRING, "purchase_ads");
                        adVideoPromptActivity.startActivity(intent);
                        final int i14 = 1;
                        adVideoPromptActivity.m().c(bjXGJ.YKRcnvZiwmeOFn, new fz.a() { // from class: jp.k
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i14) {
                                    case 0:
                                        AdVideoPromptActivity adVideoPromptActivity2 = adVideoPromptActivity;
                                        f7.a0 a0Var = adVideoPromptActivity2.Q;
                                        long jP = a0Var != null ? a0Var.P() : 0L;
                                        Bundle bundleE = b7.e0.e("id", str3);
                                        bundleE.putString("time", ((int) (jP / 1000)) + "s");
                                        bundleE.putString("type", adVideoPromptActivity2.R ? "off" : "on");
                                        return bundleE;
                                    default:
                                        f7.a0 a0Var2 = adVideoPromptActivity.Q;
                                        long jP2 = a0Var2 != null ? a0Var2.P() : 0L;
                                        Bundle bundleE2 = b7.e0.e("id", str3);
                                        bundleE2.putString("time", ((int) (jP2 / 1000)) + "s");
                                        return bundleE2;
                                }
                            }
                        });
                        break;
                    default:
                        int i15 = AdVideoPromptActivity.V;
                        kotlin.jvm.internal.m.f(it, "it");
                        boolean z11 = adVideoPromptActivity.R;
                        adVideoPromptActivity.R = !z11;
                        if (z11) {
                            ((hj.g) adVideoPromptActivity.j()).f32586c.setImageResource(R.drawable.ad_video_ctrl_aduio_state_on);
                            f7.a0 a0Var = adVideoPromptActivity.Q;
                            if (a0Var != null) {
                                a0Var.K0(1.0f);
                            }
                        } else {
                            ((hj.g) adVideoPromptActivity.j()).f32586c.setImageResource(R.drawable.ad_video_ctrl_aduio_state_silence);
                            f7.a0 a0Var2 = adVideoPromptActivity.Q;
                            if (a0Var2 != null) {
                                a0Var2.K0(CropImageView.DEFAULT_ASPECT_RATIO);
                            }
                        }
                        final int i16 = 0;
                        adVideoPromptActivity.m().c("jxz_click_sound_purchse_ads", new fz.a() { // from class: jp.k
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        AdVideoPromptActivity adVideoPromptActivity2 = adVideoPromptActivity;
                                        f7.a0 a0Var3 = adVideoPromptActivity2.Q;
                                        long jP = a0Var3 != null ? a0Var3.P() : 0L;
                                        Bundle bundleE = b7.e0.e("id", str3);
                                        bundleE.putString("time", ((int) (jP / 1000)) + "s");
                                        bundleE.putString("type", adVideoPromptActivity2.R ? "off" : "on");
                                        return bundleE;
                                    default:
                                        f7.a0 a0Var4 = adVideoPromptActivity.Q;
                                        long jP2 = a0Var4 != null ? a0Var4.P() : 0L;
                                        Bundle bundleE2 = b7.e0.e("id", str3);
                                        bundleE2.putString("time", ((int) (jP2 / 1000)) + "s");
                                        return bundleE2;
                                }
                            }
                        });
                        break;
                }
                return b0Var;
            }
        });
        final int i12 = 1;
        bq.z.b(((g) j()).f32586c, new c(this) { // from class: jp.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdVideoPromptActivity f36498b;

            {
                this.f36498b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = i12;
                qy.b0 b0Var = qy.b0.f48488a;
                final String str3 = str;
                final AdVideoPromptActivity adVideoPromptActivity = this.f36498b;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        int i14 = AdVideoPromptActivity.V;
                        kotlin.jvm.internal.m.f(it, "it");
                        adVideoPromptActivity.finish();
                        Intent intent = new Intent(adVideoPromptActivity, (Class<?>) Subscription2Activity.class);
                        intent.putExtra(INTENTS.EXTRA_STRING, "purchase_ads");
                        adVideoPromptActivity.startActivity(intent);
                        final int i15 = 1;
                        adVideoPromptActivity.m().c(bjXGJ.YKRcnvZiwmeOFn, new fz.a() { // from class: jp.k
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        AdVideoPromptActivity adVideoPromptActivity2 = adVideoPromptActivity;
                                        f7.a0 a0Var3 = adVideoPromptActivity2.Q;
                                        long jP = a0Var3 != null ? a0Var3.P() : 0L;
                                        Bundle bundleE = b7.e0.e("id", str3);
                                        bundleE.putString("time", ((int) (jP / 1000)) + "s");
                                        bundleE.putString("type", adVideoPromptActivity2.R ? "off" : "on");
                                        return bundleE;
                                    default:
                                        f7.a0 a0Var4 = adVideoPromptActivity.Q;
                                        long jP2 = a0Var4 != null ? a0Var4.P() : 0L;
                                        Bundle bundleE2 = b7.e0.e("id", str3);
                                        bundleE2.putString("time", ((int) (jP2 / 1000)) + "s");
                                        return bundleE2;
                                }
                            }
                        });
                        break;
                    default:
                        int i16 = AdVideoPromptActivity.V;
                        kotlin.jvm.internal.m.f(it, "it");
                        boolean z11 = adVideoPromptActivity.R;
                        adVideoPromptActivity.R = !z11;
                        if (z11) {
                            ((hj.g) adVideoPromptActivity.j()).f32586c.setImageResource(R.drawable.ad_video_ctrl_aduio_state_on);
                            f7.a0 a0Var = adVideoPromptActivity.Q;
                            if (a0Var != null) {
                                a0Var.K0(1.0f);
                            }
                        } else {
                            ((hj.g) adVideoPromptActivity.j()).f32586c.setImageResource(R.drawable.ad_video_ctrl_aduio_state_silence);
                            f7.a0 a0Var2 = adVideoPromptActivity.Q;
                            if (a0Var2 != null) {
                                a0Var2.K0(CropImageView.DEFAULT_ASPECT_RATIO);
                            }
                        }
                        final int i17 = 0;
                        adVideoPromptActivity.m().c("jxz_click_sound_purchse_ads", new fz.a() { // from class: jp.k
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        AdVideoPromptActivity adVideoPromptActivity2 = adVideoPromptActivity;
                                        f7.a0 a0Var3 = adVideoPromptActivity2.Q;
                                        long jP = a0Var3 != null ? a0Var3.P() : 0L;
                                        Bundle bundleE = b7.e0.e("id", str3);
                                        bundleE.putString("time", ((int) (jP / 1000)) + "s");
                                        bundleE.putString("type", adVideoPromptActivity2.R ? "off" : "on");
                                        return bundleE;
                                    default:
                                        f7.a0 a0Var4 = adVideoPromptActivity.Q;
                                        long jP2 = a0Var4 != null ? a0Var4.P() : 0L;
                                        Bundle bundleE2 = b7.e0.e("id", str3);
                                        bundleE2.putString("time", ((int) (jP2 / 1000)) + "s");
                                        return bundleE2;
                                }
                            }
                        });
                        break;
                }
                return b0Var;
            }
        });
    }
}
