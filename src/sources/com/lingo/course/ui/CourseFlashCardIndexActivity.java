package com.lingo.course.ui;

import aj.c;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import at.h;
import com.lingo.course.ui.CourseFlashCardIndexActivity;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.RxPermissions;
import fz.a;
import l1.b1;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import mt.p2;
import oz.q;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CourseFlashCardIndexActivity extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f21612t = 0;

    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        String stringExtra;
        s sVar = (s) nVar;
        sVar.f0(1658877231);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = t.B(Boolean.valueOf(new n4.t(this).f43230a.areNotificationsEnabled()));
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) sVar.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            boolean zH = sVar.h(this) | sVar.h(lifecycleOwner);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new c(lifecycleOwner, this, b1Var, 18);
                sVar.o0(objQ2);
            }
            t.c(lifecycleOwner, (fz.c) objQ2, sVar);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            boolean zH2 = sVar.h(this);
            Object objQ3 = sVar.Q();
            if (zH2 || objQ3 == gVar) {
                final int i13 = 0;
                objQ3 = new a(this) { // from class: ch.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CourseFlashCardIndexActivity f7012b;

                    {
                        this.f7012b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i14 = i13;
                        qy.b0 b0Var = qy.b0.f48488a;
                        CourseFlashCardIndexActivity courseFlashCardIndexActivity = this.f7012b;
                        switch (i14) {
                            case 0:
                                int i15 = CourseFlashCardIndexActivity.f21612t;
                                courseFlashCardIndexActivity.finish();
                                break;
                            default:
                                int i16 = CourseFlashCardIndexActivity.f21612t;
                                if (Build.VERSION.SDK_INT >= 33) {
                                    a5.f fVar = new a5.f(courseFlashCardIndexActivity, 4);
                                    RxPermissions rxPermissions = new RxPermissions(courseFlashCardIndexActivity);
                                    rxPermissions.setLogging(true);
                                    if (!rxPermissions.isGranted("android.permission.POST_NOTIFICATIONS")) {
                                        rxPermissions.request("android.permission.POST_NOTIFICATIONS").h(new ob.u(16, fVar, courseFlashCardIndexActivity), vx.b.f54316e);
                                    }
                                }
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ3);
            }
            a aVar = (a) objQ3;
            boolean zH3 = sVar.h(this);
            Object objQ4 = sVar.Q();
            if (zH3 || objQ4 == gVar) {
                final int i14 = 0;
                objQ4 = new fz.c(this) { // from class: ch.d

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CourseFlashCardIndexActivity f7016b;

                    {
                        this.f7016b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        int i15 = i14;
                        qy.b0 b0Var = qy.b0.f48488a;
                        CourseFlashCardIndexActivity courseFlashCardIndexActivity = this.f7016b;
                        switch (i15) {
                            case 0:
                                int iIntValue = ((Integer) obj).intValue();
                                int i16 = CourseFlashCardIndexActivity.f21612t;
                                Intent intent = new Intent(courseFlashCardIndexActivity, (Class<?>) LoginActivity.class);
                                intent.putExtra(INTENTS.EXTRA_INT, iIntValue);
                                courseFlashCardIndexActivity.startActivity(intent);
                                break;
                            default:
                                String it = (String) obj;
                                int i17 = CourseFlashCardIndexActivity.f21612t;
                                kotlin.jvm.internal.m.f(it, "it");
                                int[] iArr = bq.r.f4959a;
                                bq.m.C(courseFlashCardIndexActivity, it);
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ4);
            }
            fz.c cVar = (fz.c) objQ4;
            boolean zH4 = sVar.h(this);
            Object objQ5 = sVar.Q();
            if (zH4 || objQ5 == gVar) {
                final int i15 = 1;
                objQ5 = new a(this) { // from class: ch.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CourseFlashCardIndexActivity f7012b;

                    {
                        this.f7012b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i16 = i15;
                        qy.b0 b0Var = qy.b0.f48488a;
                        CourseFlashCardIndexActivity courseFlashCardIndexActivity = this.f7012b;
                        switch (i16) {
                            case 0:
                                int i17 = CourseFlashCardIndexActivity.f21612t;
                                courseFlashCardIndexActivity.finish();
                                break;
                            default:
                                int i18 = CourseFlashCardIndexActivity.f21612t;
                                if (Build.VERSION.SDK_INT >= 33) {
                                    a5.f fVar = new a5.f(courseFlashCardIndexActivity, 4);
                                    RxPermissions rxPermissions = new RxPermissions(courseFlashCardIndexActivity);
                                    rxPermissions.setLogging(true);
                                    if (!rxPermissions.isGranted("android.permission.POST_NOTIFICATIONS")) {
                                        rxPermissions.request("android.permission.POST_NOTIFICATIONS").h(new ob.u(16, fVar, courseFlashCardIndexActivity), vx.b.f54316e);
                                    }
                                }
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ5);
            }
            a aVar2 = (a) objQ5;
            boolean zH5 = sVar.h(this);
            Object objQ6 = sVar.Q();
            if (zH5 || objQ6 == gVar) {
                final int i16 = 1;
                objQ6 = new fz.c(this) { // from class: ch.d

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CourseFlashCardIndexActivity f7016b;

                    {
                        this.f7016b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        int i17 = i16;
                        qy.b0 b0Var = qy.b0.f48488a;
                        CourseFlashCardIndexActivity courseFlashCardIndexActivity = this.f7016b;
                        switch (i17) {
                            case 0:
                                int iIntValue = ((Integer) obj).intValue();
                                int i18 = CourseFlashCardIndexActivity.f21612t;
                                Intent intent = new Intent(courseFlashCardIndexActivity, (Class<?>) LoginActivity.class);
                                intent.putExtra(INTENTS.EXTRA_INT, iIntValue);
                                courseFlashCardIndexActivity.startActivity(intent);
                                break;
                            default:
                                String it = (String) obj;
                                int i19 = CourseFlashCardIndexActivity.f21612t;
                                kotlin.jvm.internal.m.f(it, "it");
                                int[] iArr = bq.r.f4959a;
                                bq.m.C(courseFlashCardIndexActivity, it);
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ6);
            }
            fz.c cVar2 = (fz.c) objQ6;
            Intent intent = getIntent();
            if (intent == null || (stringExtra = intent.getStringExtra("extra_start_destination")) == null) {
                stringExtra = "index";
            } else {
                if (q.K0(stringExtra)) {
                    stringExtra = null;
                }
                if (stringExtra == null) {
                    stringExtra = "index";
                }
            }
            p2.a(zBooleanValue, aVar, cVar, aVar2, cVar2, stringExtra, null, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(this, i11, 25, bundle);
        }
    }
}
