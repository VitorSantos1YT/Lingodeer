package com.lingo.course.ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import b0.a1;
import bp.h0;
import ch.h;
import ch.r;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingo.course.ui.CourseTestActivity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fz.a;
import fz.c;
import java.util.Iterator;
import java.util.Locale;
import l1.b1;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import qy.j;
import qy.q;
import rt.m9;
import rz.e0;
import xg.d;
import ys.p2;
import ys.q2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CourseTestActivity extends d {
    public static final /* synthetic */ int R = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f21616t = com.bumptech.glide.d.v(new r(this, 2));
    public final q H = com.bumptech.glide.d.v(new r(this, 3));
    public final q K = com.bumptech.glide.d.v(new r(this, 4));
    public final q L = com.bumptech.glide.d.v(new r(this, 5));
    public final q M = com.bumptech.glide.d.v(new r(this, 6));
    public final q N = com.bumptech.glide.d.v(new r(this, 7));
    public final q O = com.bumptech.glide.d.v(new r(this, 8));
    public final q P = com.bumptech.glide.d.v(new r(this, 9));
    public final Object Q = com.bumptech.glide.d.u(j.NONE, new r(this, 10));

    public static final void p(CourseTestActivity courseTestActivity) {
        if (courseTestActivity.isFinishing()) {
            return;
        }
        e0.B(LifecycleOwnerKt.getLifecycleScope(courseTestActivity), null, null, new a1(courseTestActivity, null, 12), 3);
        courseTestActivity.finish();
    }

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar;
        b1 b1Var;
        s sVar2 = (s) nVar;
        sVar2.f0(-402931345);
        int i12 = (sVar2.h(this) ? 32 : 16) | i11;
        if (sVar2.T(i12 & 1, (i12 & 17) != 16)) {
            q qVar = this.f21616t;
            ((Number) qVar.getValue()).longValue();
            q qVar2 = this.H;
            ((Number) qVar2.getValue()).longValue();
            ((Number) this.K.getValue()).intValue();
            ((Number) this.L.getValue()).intValue();
            ((Boolean) this.M.getValue()).getClass();
            ((Boolean) this.N.getValue()).getClass();
            Object objQ = sVar2.Q();
            g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = t.B(Boolean.FALSE);
                sVar2.o0(objQ);
            }
            final b1 b1Var2 = (b1) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = t.B(Boolean.FALSE);
                sVar2.o0(objQ2);
            }
            final b1 b1Var3 = (b1) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = t.B(Boolean.FALSE);
                sVar2.o0(objQ3);
            }
            final b1 b1Var4 = (b1) objQ3;
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = t.B(Boolean.FALSE);
                sVar2.o0(objQ4);
            }
            b1 b1Var5 = (b1) objQ4;
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar2.d0(708293695);
                boolean zH = sVar2.h(this);
                Object objQ5 = sVar2.Q();
                if (zH || objQ5 == gVar) {
                    final int i13 = 0;
                    a aVar = new a(this) { // from class: ch.q

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ CourseTestActivity f7086b;

                        {
                            this.f7086b = this;
                        }

                        /* JADX WARN: Code duplicated, block: B:22:0x00ba  */
                        /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        @Override // fz.a
                        public final Object invoke() {
                            boolean zS;
                            int i14 = i13;
                            qy.b0 b0Var = qy.b0.f48488a;
                            b1 b1Var6 = b1Var4;
                            b1 b1Var7 = b1Var2;
                            b1 b1Var8 = b1Var3;
                            CourseTestActivity courseTestActivity = this.f7086b;
                            switch (i14) {
                                case 0:
                                    int i15 = CourseTestActivity.R;
                                    b1Var8.setValue(Boolean.TRUE);
                                    Boolean bool = Boolean.FALSE;
                                    b1Var7.setValue(bool);
                                    courseTestActivity.m().c("jxz_rate_us_click_not_now", new m9(26));
                                    if (((Boolean) b1Var6.getValue()).booleanValue()) {
                                        b1Var6.setValue(bool);
                                        CourseTestActivity.p(courseTestActivity);
                                    }
                                    break;
                                default:
                                    int i16 = CourseTestActivity.R;
                                    boolean zBooleanValue = ((Boolean) b1Var8.getValue()).booleanValue();
                                    b1Var7.setValue(Boolean.TRUE);
                                    Boolean bool2 = Boolean.FALSE;
                                    b1Var8.setValue(bool2);
                                    b1Var6.setValue(bool2);
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    cf.x.n().neverPromptUserReview = true;
                                    cf.x.n().updateEntry("neverPromptUserReview");
                                    Iterator<PackageInfo> it = courseTestActivity.getPackageManager().getInstalledPackages(OSSConstants.DEFAULT_BUFFER_SIZE).iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            PackageInfo next = it.next();
                                            if (next.packageName.equals("com.google.market") || next.packageName.equals("com.android.vending")) {
                                                try {
                                                    zS = com.bumptech.glide.g.s(courseTestActivity);
                                                } catch (Exception e8) {
                                                    e8.printStackTrace();
                                                    zS = false;
                                                }
                                                if (!zS) {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW");
                                                        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.lingodeer"));
                                                        courseTestActivity.startActivity(intent);
                                                    } catch (ActivityNotFoundException unused) {
                                                        ff.h.C(String.format(Locale.getDefault(), ff.h.y(courseTestActivity, R.string.cant_open_it_please_search_s_in_google_play_store), "com.lingodeer"));
                                                    }
                                                }
                                                b7.e0.A(courseTestActivity.m(), "jxz_rate_us_click_yes");
                                                if (zBooleanValue) {
                                                    CourseTestActivity.p(courseTestActivity);
                                                }
                                                break;
                                            }
                                        }
                                        zS = false;
                                        if (!zS) {
                                            Intent intent2 = new Intent("android.intent.action.VIEW");
                                            intent2.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.lingodeer"));
                                            courseTestActivity.startActivity(intent2);
                                        }
                                        b7.e0.A(courseTestActivity.m(), "jxz_rate_us_click_yes");
                                        if (zBooleanValue) {
                                            CourseTestActivity.p(courseTestActivity);
                                        }
                                        break;
                                    }
                                    break;
                            }
                            return b0Var;
                        }
                    };
                    sVar2.o0(aVar);
                    objQ5 = aVar;
                }
                a aVar2 = (a) objQ5;
                boolean zH2 = sVar2.h(this);
                Object objQ6 = sVar2.Q();
                if (zH2 || objQ6 == gVar) {
                    final int i14 = 1;
                    a aVar3 = new a(this) { // from class: ch.q

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ CourseTestActivity f7086b;

                        {
                            this.f7086b = this;
                        }

                        /* JADX WARN: Code duplicated, block: B:22:0x00ba  */
                        /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        @Override // fz.a
                        public final Object invoke() {
                            boolean zS;
                            int i15 = i14;
                            qy.b0 b0Var = qy.b0.f48488a;
                            b1 b1Var6 = b1Var2;
                            b1 b1Var7 = b1Var3;
                            b1 b1Var8 = b1Var4;
                            CourseTestActivity courseTestActivity = this.f7086b;
                            switch (i15) {
                                case 0:
                                    int i16 = CourseTestActivity.R;
                                    b1Var8.setValue(Boolean.TRUE);
                                    Boolean bool = Boolean.FALSE;
                                    b1Var7.setValue(bool);
                                    courseTestActivity.m().c("jxz_rate_us_click_not_now", new m9(26));
                                    if (((Boolean) b1Var6.getValue()).booleanValue()) {
                                        b1Var6.setValue(bool);
                                        CourseTestActivity.p(courseTestActivity);
                                    }
                                    break;
                                default:
                                    int i17 = CourseTestActivity.R;
                                    boolean zBooleanValue = ((Boolean) b1Var8.getValue()).booleanValue();
                                    b1Var7.setValue(Boolean.TRUE);
                                    Boolean bool2 = Boolean.FALSE;
                                    b1Var8.setValue(bool2);
                                    b1Var6.setValue(bool2);
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    cf.x.n().neverPromptUserReview = true;
                                    cf.x.n().updateEntry("neverPromptUserReview");
                                    Iterator<PackageInfo> it = courseTestActivity.getPackageManager().getInstalledPackages(OSSConstants.DEFAULT_BUFFER_SIZE).iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            PackageInfo next = it.next();
                                            if (next.packageName.equals("com.google.market") || next.packageName.equals("com.android.vending")) {
                                                try {
                                                    zS = com.bumptech.glide.g.s(courseTestActivity);
                                                } catch (Exception e8) {
                                                    e8.printStackTrace();
                                                    zS = false;
                                                }
                                                if (!zS) {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW");
                                                        intent2.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.lingodeer"));
                                                        courseTestActivity.startActivity(intent2);
                                                    } catch (ActivityNotFoundException unused) {
                                                        ff.h.C(String.format(Locale.getDefault(), ff.h.y(courseTestActivity, R.string.cant_open_it_please_search_s_in_google_play_store), "com.lingodeer"));
                                                    }
                                                }
                                                b7.e0.A(courseTestActivity.m(), "jxz_rate_us_click_yes");
                                                if (zBooleanValue) {
                                                    CourseTestActivity.p(courseTestActivity);
                                                }
                                                break;
                                            }
                                        }
                                        zS = false;
                                        if (!zS) {
                                            Intent intent3 = new Intent("android.intent.action.VIEW");
                                            intent3.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.lingodeer"));
                                            courseTestActivity.startActivity(intent3);
                                        }
                                        b7.e0.A(courseTestActivity.m(), "jxz_rate_us_click_yes");
                                        if (zBooleanValue) {
                                            CourseTestActivity.p(courseTestActivity);
                                        }
                                        break;
                                    }
                                    break;
                            }
                            return b0Var;
                        }
                    };
                    b1Var4 = b1Var4;
                    b1Var3 = b1Var3;
                    b1Var2 = b1Var2;
                    sVar2.o0(aVar3);
                    objQ6 = aVar3;
                }
                h.a(aVar2, (a) objQ6, sVar2, 0);
            } else {
                sVar2.d0(703749715);
            }
            sVar2.p(false);
            q2 q2Var = new q2(((Number) qVar.getValue()).longValue(), ((Number) qVar2.getValue()).longValue(), (CoursePracticeType) this.P.getValue(), BuildConfig.VERSION_NAME, ry.r.f50854a);
            boolean zH3 = sVar2.h(this);
            Object objQ7 = sVar2.Q();
            if (zH3 || objQ7 == gVar) {
                objQ7 = new r(this, 0);
                sVar2.o0(objQ7);
            }
            a aVar4 = (a) objQ7;
            boolean zH4 = sVar2.h(this);
            Object objQ8 = sVar2.Q();
            if (zH4 || objQ8 == gVar) {
                b1 b1Var6 = b1Var2;
                b1 b1Var7 = b1Var3;
                b1 b1Var8 = b1Var4;
                b1Var = b1Var5;
                b1.a aVar5 = new b1.a(this, b1Var8, b1Var7, b1Var, b1Var6, 5);
                sVar2.o0(aVar5);
                objQ8 = aVar5;
            } else {
                b1Var = b1Var5;
            }
            c cVar = (c) objQ8;
            Object objQ9 = sVar2.Q();
            if (objQ9 == gVar) {
                objQ9 = new h0(9, b1Var);
                sVar2.o0(objQ9);
            }
            c cVar2 = (c) objQ9;
            boolean zH5 = sVar2.h(this);
            Object objQ10 = sVar2.Q();
            if (zH5 || objQ10 == gVar) {
                objQ10 = new r(this, 1);
                sVar2.o0(objQ10);
            }
            a aVar6 = (a) objQ10;
            boolean zH6 = sVar2.h(this);
            Object objQ11 = sVar2.Q();
            if (zH6 || objQ11 == gVar) {
                final int i15 = 0;
                objQ11 = new c(this) { // from class: ch.s

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CourseTestActivity f7098b;

                    {
                        this.f7098b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        int i16 = i15;
                        qy.b0 b0Var = qy.b0.f48488a;
                        CourseTestActivity courseTestActivity = this.f7098b;
                        switch (i16) {
                            case 0:
                                int iIntValue = ((Integer) obj).intValue();
                                int i17 = CourseTestActivity.R;
                                Intent intent = new Intent(courseTestActivity, (Class<?>) LoginActivity.class);
                                intent.putExtra(INTENTS.EXTRA_INT, iIntValue);
                                courseTestActivity.startActivity(intent);
                                break;
                            default:
                                String source = (String) obj;
                                int i18 = CourseTestActivity.R;
                                kotlin.jvm.internal.m.f(source, "source");
                                int[] iArr = bq.r.f4959a;
                                bq.m.C(courseTestActivity, source);
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar2.o0(objQ11);
            }
            c cVar3 = (c) objQ11;
            boolean zH7 = sVar2.h(this);
            Object objQ12 = sVar2.Q();
            if (zH7 || objQ12 == gVar) {
                final int i16 = 1;
                objQ12 = new c(this) { // from class: ch.s

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CourseTestActivity f7098b;

                    {
                        this.f7098b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        int i17 = i16;
                        qy.b0 b0Var = qy.b0.f48488a;
                        CourseTestActivity courseTestActivity = this.f7098b;
                        switch (i17) {
                            case 0:
                                int iIntValue = ((Integer) obj).intValue();
                                int i18 = CourseTestActivity.R;
                                Intent intent = new Intent(courseTestActivity, (Class<?>) LoginActivity.class);
                                intent.putExtra(INTENTS.EXTRA_INT, iIntValue);
                                courseTestActivity.startActivity(intent);
                                break;
                            default:
                                String source = (String) obj;
                                int i19 = CourseTestActivity.R;
                                kotlin.jvm.internal.m.f(source, "source");
                                int[] iArr = bq.r.f4959a;
                                bq.m.C(courseTestActivity, source);
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar2.o0(objQ12);
            }
            sVar = sVar2;
            p2.c(q2Var, null, null, aVar4, cVar, cVar2, aVar6, cVar3, (c) objQ12, sVar, 196616, 6);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.h(this, i11, 29, bundle);
        }
    }
}
