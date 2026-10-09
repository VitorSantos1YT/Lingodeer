package com.lingo.lingoskill.object;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.api.Service;
import com.lingodeer.data.model.CourseWord;
import d0.j;
import d0.k;
import d0.r1;
import fz.c;
import j9.e0;
import j9.z;
import kotlin.jvm.internal.m;
import l1.c3;
import l1.q1;
import l1.t;
import qy.b0;
import y2.k0;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21984a;

    public /* synthetic */ a(int i11) {
        this.f21984a = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f21984a;
        b0 b0Var = b0.f48488a;
        switch (i11) {
            case 0:
                return ConvertUtilsKt.mergeWords$lambda$61((CourseWord) obj);
            case 1:
                return Boolean.valueOf(ConvertUtilsKt.toSentenceItem$lambda$19((CourseWord) obj));
            case 2:
                return ConvertUtilsKt.mergeWords$lambda$62((CourseWord) obj);
            case 3:
                return ConvertUtilsKt.mergeWords$lambda$63((CourseWord) obj);
            case 4:
                return ConvertUtilsKt.mergeWords$lambda$64((CourseWord) obj);
            case 5:
                return ConvertUtilsKt.mergeWords$lambda$65((CourseWord) obj);
            case 6:
                return Boolean.valueOf(ConvertUtilsKt.toSentenceItem$lambda$18((CourseWord) obj));
            case 7:
                z navigate = (z) obj;
                m.f(navigate, "$this$navigate");
                navigate.a("chinese_tone_changes_bu_introduction", new a(9));
                navigate.f36278b = true;
                return b0Var;
            case 8:
                e0 popUpTo = (e0) obj;
                m.f(popUpTo, "$this$popUpTo");
                popUpTo.f36194a = true;
                return b0Var;
            case 9:
                e0 popUpTo2 = (e0) obj;
                m.f(popUpTo2, "$this$popUpTo");
                popUpTo2.f36194a = true;
                return b0Var;
            case 10:
                e0 popUpTo3 = (e0) obj;
                m.f(popUpTo3, "$this$popUpTo");
                popUpTo3.f36194a = true;
                return b0Var;
            case 11:
                e0 popUpTo4 = (e0) obj;
                m.f(popUpTo4, "$this$popUpTo");
                popUpTo4.f36194a = true;
                return b0Var;
            case 12:
                e0 popUpTo5 = (e0) obj;
                m.f(popUpTo5, "$this$popUpTo");
                popUpTo5.f36194a = true;
                return b0Var;
            case 13:
                e0 popUpTo6 = (e0) obj;
                m.f(popUpTo6, "$this$popUpTo");
                popUpTo6.f36194a = true;
                return b0Var;
            case 14:
                e0 popUpTo7 = (e0) obj;
                m.f(popUpTo7, "$this$popUpTo");
                popUpTo7.f36194a = true;
                return b0Var;
            case 15:
                e0 popUpTo8 = (e0) obj;
                m.f(popUpTo8, "$this$popUpTo");
                popUpTo8.f36194a = true;
                return b0Var;
            case 16:
                e0 popUpTo9 = (e0) obj;
                m.f(popUpTo9, "$this$popUpTo");
                popUpTo9.f36194a = true;
                return b0Var;
            case 17:
                z navigate2 = (z) obj;
                m.f(navigate2, "$this$navigate");
                navigate2.a("chinese_fourth_tone_introduction", new a(14));
                navigate2.f36278b = true;
                return b0Var;
            case 18:
                z navigate3 = (z) obj;
                m.f(navigate3, "$this$navigate");
                navigate3.a("chinese_third_tone_introduction", new a(12));
                navigate3.f36278b = true;
                return b0Var;
            case 19:
                z navigate4 = (z) obj;
                m.f(navigate4, "$this$navigate");
                navigate4.a("chinese_tone_changes_yi_introduction", new a(8));
                navigate4.f36278b = true;
                return b0Var;
            case 20:
                z navigate5 = (z) obj;
                m.f(navigate5, "$this$navigate");
                navigate5.a("chinese_tone_introduction", new a(10));
                navigate5.f36278b = true;
                return b0Var;
            case 21:
                z navigate6 = (z) obj;
                m.f(navigate6, "$this$navigate");
                navigate6.f36278b = true;
                return b0Var;
            case 22:
                z navigate7 = (z) obj;
                m.f(navigate7, "$this$navigate");
                navigate7.a("chinese_first_tone_introduction", new a(13));
                navigate7.f36278b = true;
                return b0Var;
            case 23:
                z navigate8 = (z) obj;
                m.f(navigate8, "$this$navigate");
                navigate8.a("chinese_second_tone_introduction", new a(15));
                navigate8.f36278b = true;
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                z navigate9 = (z) obj;
                m.f(navigate9, "$this$navigate");
                navigate9.a("chinese_tone_changes_3rd_tone_introduction", new a(11));
                navigate9.f36278b = true;
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                z navigate10 = (z) obj;
                m.f(navigate10, "$this$navigate");
                navigate10.a("chinese_neutral_tone_introduction", new a(16));
                navigate10.f36278b = true;
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ((k0) obj).a();
                return b0Var;
            case 27:
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ((Long) obj).getClass();
                return b0Var;
            default:
                q1 q1Var = (q1) obj;
                int i12 = k.f22740a;
                c3 c3Var = AndroidCompositionLocals_androidKt.f1200b;
                q1Var.getClass();
                Context context = (Context) t.E(q1Var, c3Var);
                v3.c cVar = (v3.c) t.E(q1Var, g1.f58547h);
                d0.q1 q1Var2 = (d0.q1) t.E(q1Var, r1.f22793a);
                if (q1Var2 == null) {
                    return null;
                }
                return new j(context, cVar, q1Var2.f22781a, q1Var2.f22782b);
        }
    }
}
