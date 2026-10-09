package com.lingo.course.ui;

import android.os.Bundle;
import at.h;
import com.lingo.course.ui.CourseListenAlongActivity;
import fz.a;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.x1;
import mt.l5;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CourseListenAlongActivity extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f21613t = 0;

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1198731445);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            boolean zH = sVar.h(this);
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (zH || objQ == gVar) {
                final int i13 = 0;
                objQ = new a(this) { // from class: ch.j

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CourseListenAlongActivity f7051b;

                    {
                        this.f7051b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i14 = i13;
                        qy.b0 b0Var = qy.b0.f48488a;
                        CourseListenAlongActivity courseListenAlongActivity = this.f7051b;
                        switch (i14) {
                            case 0:
                                int i15 = CourseListenAlongActivity.f21613t;
                                courseListenAlongActivity.finish();
                                break;
                            default:
                                int i16 = CourseListenAlongActivity.f21613t;
                                int[] iArr = bq.r.f4959a;
                                bq.m.C(courseListenAlongActivity, "course_review");
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ);
            }
            a aVar = (a) objQ;
            boolean zH2 = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                final int i14 = 1;
                objQ2 = new a(this) { // from class: ch.j

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CourseListenAlongActivity f7051b;

                    {
                        this.f7051b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i15 = i14;
                        qy.b0 b0Var = qy.b0.f48488a;
                        CourseListenAlongActivity courseListenAlongActivity = this.f7051b;
                        switch (i15) {
                            case 0:
                                int i16 = CourseListenAlongActivity.f21613t;
                                courseListenAlongActivity.finish();
                                break;
                            default:
                                int i17 = CourseListenAlongActivity.f21613t;
                                int[] iArr = bq.r.f4959a;
                                bq.m.C(courseListenAlongActivity, "course_review");
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ2);
            }
            l5.k(aVar, (a) objQ2, null, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(this, i11, 26, bundle);
        }
    }
}
