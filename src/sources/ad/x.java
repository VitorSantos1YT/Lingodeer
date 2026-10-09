package ad;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.Toast;
import bt.i0;
import bv.c0;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionsUtilKt;
import com.google.api.Service;
import com.google.firebase.database.DataSnapshot;
import com.lingo.notification.UnifiedNotificationReceiver;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.CourseACK;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.DayStreakFinishedStatus;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import d1.z0;
import dt.m0;
import dt.v2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import jt.a2;
import jt.c2;
import jt.d2;
import jt.h0;
import jt.h2;
import jt.i2;
import jt.m1;
import jt.p2;
import jt.q1;
import kr.c1;
import l1.a1;
import l1.b1;
import l1.c3;
import l1.h1;
import l1.k1;
import mt.l5;
import oo.f0;
import oo.k0;
import rt.b5;
import rt.ke;
import rt.o1;
import rt.v4;
import rt.z5;
import rz.e0;
import ys.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f652e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, Object obj2, Object obj3, Object obj4, vy.d dVar, int i11) {
        super(2, dVar);
        this.f648a = i11;
        this.f649b = obj;
        this.f650c = obj2;
        this.f651d = obj3;
        this.f652e = obj4;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f648a) {
            case 0:
                return new x((wc.h) this.f649b, (Context) this.f650c, (String) this.f651d, (String) this.f652e, dVar, 0);
            case 1:
                return new x((CourseSentence) this.f649b, (jt.g) this.f650c, (d0) this.f651d, (b1) this.f652e, dVar, 1);
            case 2:
                return new x((PermissionState) this.f649b, (jt.g) this.f650c, (rz.b0) this.f651d, (b1) this.f652e, dVar, 2);
            case 3:
                x xVar = new x((b1) this.f650c, (b0.d) this.f651d, (c0) this.f652e, dVar, 3);
                xVar.f649b = obj;
                return xVar;
            case 4:
                return new x((qy.l) this.f649b, (b1) this.f650c, (b1) this.f651d, (b1) this.f652e, dVar, 4);
            case 5:
                return new x((a2) this.f649b, (kotlin.jvm.internal.y) this.f650c, (d0) this.f651d, (ht.o) this.f652e, dVar, 5);
            case 6:
                return new x((fz.a) this.f649b, (b1) this.f650c, (mu.x) this.f651d, (b1) this.f652e, dVar, 6);
            case 7:
                return new x((b1) this.f649b, (z5) this.f650c, (ns.z) this.f651d, (b1) this.f652e, dVar, 7);
            case 8:
                return new x((ns.z) this.f649b, (ur.a) this.f650c, (b1) this.f651d, (ys.v) this.f652e, dVar, 8);
            case 9:
                return new x((UnifiedNotificationReceiver) this.f649b, (Context) this.f650c, (er.e) this.f651d, (Intent) this.f652e, dVar, 9);
            case 10:
                return new x((l0.w) this.f649b, (c1) this.f650c, (fz.c) this.f651d, (b1) this.f652e, dVar, 10);
            case 11:
                return new x((i2) this.f649b, (fz.c) this.f650c, (x1.p) this.f651d, (HashMap) this.f652e, dVar, 11);
            case 12:
                x xVar2 = new x((h0) this.f650c, (CourseWord) this.f651d, (kotlin.jvm.internal.u) this.f652e, dVar, 12);
                xVar2.f649b = obj;
                return xVar2;
            case 13:
                return new x((CourseWord) this.f649b, (List) this.f650c, (List) this.f651d, (m1) this.f652e, dVar, 13);
            case 14:
                x xVar3 = new x((q1) this.f650c, (CourseWord) this.f651d, (kotlin.jvm.internal.u) this.f652e, dVar, 14);
                xVar3.f649b = obj;
                return xVar3;
            case 15:
                return new x((kr.b0) this.f649b, (List) this.f650c, (kr.i) this.f651d, (List) this.f652e, dVar, 15);
            case 16:
                x xVar4 = new x((Context) this.f650c, (String) this.f651d, (Bitmap) this.f652e, dVar, 16);
                xVar4.f649b = obj;
                return xVar4;
            case 17:
                return new x((Set) this.f649b, (fz.a) this.f650c, (List) this.f651d, (b1) this.f652e, dVar, 17);
            case 18:
                return new x((rt.p) this.f649b, (fz.a) this.f650c, (b1) this.f651d, (b1) this.f652e, dVar, 18);
            case 19:
                return new x((rt.p) this.f649b, (Context) this.f650c, (fz.a) this.f651d, (b1) this.f652e, dVar, 19);
            case 20:
                return new x((fz.e) this.f649b, this.f650c, (fz.c) this.f651d, (fz.a) this.f652e, dVar, 20);
            case 21:
                return new x((o0.b) this.f649b, (a1) this.f650c, (b1) this.f651d, (b1) this.f652e, dVar, 21);
            case 22:
                return new x((rt.b0) this.f649b, (fz.a) this.f650c, (b1) this.f651d, (b1) this.f652e, dVar, 22);
            case 23:
                return new x((o0.b) this.f649b, (List) this.f650c, (o1) this.f651d, (fz.c) this.f652e, dVar, 23);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new x((b5) this.f649b, (Context) this.f650c, (String) this.f651d, (b1) this.f652e, dVar, 24);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                x xVar5 = new x((DataSnapshot) this.f650c, (ArrayList) this.f651d, (no.s) this.f652e, dVar, 25);
                xVar5.f649b = obj;
                return xVar5;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new x((k0) this.f649b, (File) this.f650c, (String) this.f651d, (ArrayList) this.f652e, dVar, 26);
            case 27:
                x xVar6 = new x((s2.w) this.f650c, (s0.a1) this.f651d, (z0) this.f652e, dVar, 27);
                xVar6.f649b = obj;
                return xVar6;
            default:
                return new x((DayStreakFinishedStatus) this.f649b, (List) this.f650c, (x1.p) this.f651d, (b1) this.f652e, dVar, 28);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f648a) {
            case 0:
                x xVar = (x) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                xVar.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                x xVar2 = (x) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                xVar2.invokeSuspend(b0Var3);
                return b0Var3;
            case 2:
                x xVar3 = (x) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                xVar3.invokeSuspend(b0Var4);
                return b0Var4;
            case 3:
                x xVar4 = (x) create(b0Var, dVar);
                qy.b0 b0Var5 = qy.b0.f48488a;
                xVar4.invokeSuspend(b0Var5);
                return b0Var5;
            case 4:
                x xVar5 = (x) create(b0Var, dVar);
                qy.b0 b0Var6 = qy.b0.f48488a;
                xVar5.invokeSuspend(b0Var6);
                return b0Var6;
            case 5:
                x xVar6 = (x) create(b0Var, dVar);
                qy.b0 b0Var7 = qy.b0.f48488a;
                xVar6.invokeSuspend(b0Var7);
                return b0Var7;
            case 6:
                x xVar7 = (x) create(b0Var, dVar);
                qy.b0 b0Var8 = qy.b0.f48488a;
                xVar7.invokeSuspend(b0Var8);
                return b0Var8;
            case 7:
                x xVar8 = (x) create(b0Var, dVar);
                qy.b0 b0Var9 = qy.b0.f48488a;
                xVar8.invokeSuspend(b0Var9);
                return b0Var9;
            case 8:
                x xVar9 = (x) create(b0Var, dVar);
                qy.b0 b0Var10 = qy.b0.f48488a;
                xVar9.invokeSuspend(b0Var10);
                return b0Var10;
            case 9:
                x xVar10 = (x) create(b0Var, dVar);
                qy.b0 b0Var11 = qy.b0.f48488a;
                xVar10.invokeSuspend(b0Var11);
                return b0Var11;
            case 10:
                x xVar11 = (x) create(b0Var, dVar);
                qy.b0 b0Var12 = qy.b0.f48488a;
                xVar11.invokeSuspend(b0Var12);
                return b0Var12;
            case 11:
                x xVar12 = (x) create(b0Var, dVar);
                qy.b0 b0Var13 = qy.b0.f48488a;
                xVar12.invokeSuspend(b0Var13);
                return b0Var13;
            case 12:
                x xVar13 = (x) create(b0Var, dVar);
                qy.b0 b0Var14 = qy.b0.f48488a;
                xVar13.invokeSuspend(b0Var14);
                return b0Var14;
            case 13:
                return ((x) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 14:
                x xVar14 = (x) create(b0Var, dVar);
                qy.b0 b0Var15 = qy.b0.f48488a;
                xVar14.invokeSuspend(b0Var15);
                return b0Var15;
            case 15:
                x xVar15 = (x) create(b0Var, dVar);
                qy.b0 b0Var16 = qy.b0.f48488a;
                xVar15.invokeSuspend(b0Var16);
                return b0Var16;
            case 16:
                return ((x) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 17:
                x xVar16 = (x) create(b0Var, dVar);
                qy.b0 b0Var17 = qy.b0.f48488a;
                xVar16.invokeSuspend(b0Var17);
                return b0Var17;
            case 18:
                x xVar17 = (x) create(b0Var, dVar);
                qy.b0 b0Var18 = qy.b0.f48488a;
                xVar17.invokeSuspend(b0Var18);
                return b0Var18;
            case 19:
                x xVar18 = (x) create(b0Var, dVar);
                qy.b0 b0Var19 = qy.b0.f48488a;
                xVar18.invokeSuspend(b0Var19);
                return b0Var19;
            case 20:
                x xVar19 = (x) create(b0Var, dVar);
                qy.b0 b0Var20 = qy.b0.f48488a;
                xVar19.invokeSuspend(b0Var20);
                return b0Var20;
            case 21:
                x xVar20 = (x) create(b0Var, dVar);
                qy.b0 b0Var21 = qy.b0.f48488a;
                xVar20.invokeSuspend(b0Var21);
                return b0Var21;
            case 22:
                x xVar21 = (x) create(b0Var, dVar);
                qy.b0 b0Var22 = qy.b0.f48488a;
                xVar21.invokeSuspend(b0Var22);
                return b0Var22;
            case 23:
                x xVar22 = (x) create(b0Var, dVar);
                qy.b0 b0Var23 = qy.b0.f48488a;
                xVar22.invokeSuspend(b0Var23);
                return b0Var23;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                x xVar23 = (x) create(b0Var, dVar);
                qy.b0 b0Var24 = qy.b0.f48488a;
                xVar23.invokeSuspend(b0Var24);
                return b0Var24;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((x) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                x xVar24 = (x) create(b0Var, dVar);
                qy.b0 b0Var25 = qy.b0.f48488a;
                xVar24.invokeSuspend(b0Var25);
                return b0Var25;
            case 27:
                x xVar25 = (x) create(b0Var, dVar);
                qy.b0 b0Var26 = qy.b0.f48488a;
                xVar25.invokeSuspend(b0Var26);
                return b0Var26;
            default:
                x xVar26 = (x) create(b0Var, dVar);
                qy.b0 b0Var27 = qy.b0.f48488a;
                xVar26.invokeSuspend(b0Var27);
                return b0Var27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029e  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:312:0x0a4a  */
    /* JADX WARN: Code duplicated, block: B:362:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0249  */
    /* JADX WARN: Code duplicated, block: B:94:0x028d  */
    /* JADX WARN: Type inference failed for: r2v103, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws IOException {
        int i11;
        Object obj2;
        ht.q qVar;
        Object obj3;
        ht.q qVar2;
        Object objL;
        OutputStream outputStream;
        OutputStream outputStream2;
        Object objL2;
        String str;
        Iterator it;
        Object next;
        Object next2;
        int i12 = this.f648a;
        int i13 = 4;
        rt.o oVar = rt.o.f50161a;
        int i14 = 0;
        vy.d dVar = null;
        Boolean boolValueOf = null;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj4 = this.f652e;
        Object obj5 = this.f650c;
        Object obj6 = this.f651d;
        switch (i12) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                for (dd.d dVar2 : ((wc.h) this.f649b).f54962f.values()) {
                    Context context = (Context) obj5;
                    kotlin.jvm.internal.m.c(dVar2);
                    String str2 = dVar2.f23371c;
                    try {
                        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), ep.a.D((String) obj6, dVar2.f23369a, (String) obj4));
                        try {
                            kotlin.jvm.internal.m.c(typefaceCreateFromAsset);
                            kotlin.jvm.internal.m.e(str2, "getStyle(...)");
                            boolean zV0 = oz.q.v0(str2, "Italic", false);
                            boolean zV1 = oz.q.v0(str2, "Bold", false);
                            if (zV0 && zV1) {
                                i11 = 3;
                            } else if (zV0) {
                                i11 = 2;
                            } else {
                                i11 = zV1 ? 1 : 0;
                            }
                            if (typefaceCreateFromAsset.getStyle() != i11) {
                                typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i11);
                            }
                            dVar2.f23372d = typefaceCreateFromAsset;
                        } catch (Exception unused) {
                            kd.d.f38088a.getClass();
                            wc.a aVar2 = wc.d.f54943a;
                        }
                    } catch (Exception unused2) {
                        kd.d.f38088a.getClass();
                        wc.a aVar3 = wc.d.f54943a;
                    }
                }
                return b0Var;
            case 1:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                CourseSentence courseSentence = (CourseSentence) this.f649b;
                if (kotlin.jvm.internal.m.a(courseSentence.getVideoUri(), Uri.EMPTY)) {
                    i0.f((jt.g) obj5, (d0) obj6, jh.h.q(courseSentence), new ht.c(courseSentence.getVisemedMap()));
                    ((b1) obj4).setValue(Boolean.TRUE);
                } else {
                    String path = courseSentence.getVideoUri().getPath();
                    if (path == null) {
                        path = BuildConfig.VERSION_NAME;
                    }
                    if (!new File(path).exists()) {
                        i0.f((jt.g) obj5, (d0) obj6, jh.h.q(courseSentence), new ht.c(courseSentence.getVisemedMap()));
                        ((b1) obj4).setValue(Boolean.TRUE);
                    }
                }
                return b0Var;
            case 2:
                b1 b1Var = (b1) obj4;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (PermissionsUtilKt.b(((PermissionState) this.f649b).getStatus()) && !((Boolean) b1Var.getValue()).booleanValue()) {
                    jt.g gVar = (jt.g) obj5;
                    gVar.g((rz.b0) obj6, gVar.f36935d);
                    b1Var.setValue(Boolean.TRUE);
                }
                return b0Var;
            case 3:
                rz.b0 b0Var2 = (rz.b0) this.f649b;
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((b1) obj5).setValue(Boolean.TRUE);
                e0.B(b0Var2, null, null, new b1.c(13, (b0.d) obj6, (c0) obj4, (vy.d) null), 3);
                return b0Var;
            case 4:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b1 b1Var2 = (b1) obj5;
                qy.l lVar = (qy.l) b1Var2.getValue();
                qy.l lVar2 = (qy.l) this.f649b;
                if (!kotlin.jvm.internal.m.a(lVar, lVar2)) {
                    b1Var2.setValue(lVar2);
                    Boolean bool = Boolean.FALSE;
                    ((b1) obj6).setValue(bool);
                    ((b1) obj4).setValue(bool);
                }
                return b0Var;
            case 5:
                ht.o courseTestParams = (ht.o) obj4;
                d0 d0Var = (d0) obj6;
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) obj5;
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b1 b1Var3 = ((a2) this.f649b).f36878g;
                Objects.toString(b1Var3.getValue());
                if (b1Var3.getValue() instanceof c2) {
                    Object value = b1Var3.getValue();
                    kotlin.jvm.internal.m.d(value, "null cannot be cast to non-null type com.lingodeer.course.ui.lessontest.state.modelstate.CourseTestWordMatchUiEffect.MatchFiled");
                    Long l9 = ((c2) value).f36902a;
                    if (l9 != null) {
                        long jLongValue = l9.longValue();
                        ((x1.p) yVar.f38361a).add(new Long(jLongValue));
                        if (d0Var != null) {
                            kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
                            d0Var.f57958a.invoke(courseTestParams, Long.valueOf(jLongValue));
                        }
                    }
                } else if (b1Var3.getValue() instanceof d2) {
                    Object value2 = b1Var3.getValue();
                    kotlin.jvm.internal.m.d(value2, "null cannot be cast to non-null type com.lingodeer.course.ui.lessontest.state.modelstate.CourseTestWordMatchUiEffect.MatchSuccess");
                    Long l11 = ((d2) value2).f36908a;
                    if (l11 != null) {
                        long jLongValue2 = l11.longValue();
                        if (!((x1.p) yVar.f38361a).contains(new Long(jLongValue2)) && d0Var != null) {
                            kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
                            d0Var.f57959b.invoke(courseTestParams, Long.valueOf(jLongValue2));
                        }
                    }
                }
                return b0Var;
            case 6:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((Boolean) ((b1) obj4).getValue()).booleanValue()) {
                    ((fz.a) this.f649b).invoke();
                    ((b1) obj5).setValue(Boolean.FALSE);
                    ((mu.x) obj6).a(mu.f.f42142a);
                }
                return b0Var;
            case 7:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((Boolean) ((b1) this.f649b).getValue()).booleanValue()) {
                    ((b1) obj4).setValue(null);
                    ((z5) obj5).c((ns.z) obj6);
                }
                return b0Var;
            case 8:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b1 b1Var4 = (b1) obj6;
                c3 c3Var = v2.f24275a;
                Long l12 = (Long) b1Var4.getValue();
                ns.z zVar = (ns.z) this.f649b;
                long j11 = zVar.f44038a;
                if (l12 == null || l12.longValue() != j11) {
                    ((ur.a) obj5).c("jxz_main_emm_button_show", new m0((ys.v) obj4, zVar, i13));
                    b1Var4.setValue(new Long(j11));
                }
                return b0Var;
            case 9:
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                try {
                    UnifiedNotificationReceiver.a((UnifiedNotificationReceiver) this.f649b, (Context) obj5, (er.e) obj6, (Intent) obj4);
                    break;
                } catch (Exception unused3) {
                }
                return b0Var;
            case 10:
                fz.c cVar = (fz.c) obj6;
                c1 c1Var = (c1) obj5;
                b1 b1Var5 = (b1) obj4;
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l0.w wVar = (l0.w) this.f649b;
                if (wVar.f39210i.b()) {
                    b1Var5.setValue(Boolean.TRUE);
                } else if (((Boolean) b1Var5.getValue()).booleanValue()) {
                    b1Var5.setValue(Boolean.FALSE);
                    int iL = wVar.f39206e.f39181b.l();
                    int i15 = c1Var.f38436c;
                    List list = c1Var.f38434a;
                    if (iL != i15) {
                        if (iL < list.size()) {
                            cVar.invoke(new Integer(iL));
                        } else {
                            cVar.invoke(new Integer(list.size() - 1));
                        }
                    }
                }
                return b0Var;
            case 11:
                x1.p pVar = (x1.p) obj6;
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                i2 i2Var = (i2) this.f649b;
                k1 k1Var = i2Var.f36978c;
                k1 k1Var2 = i2Var.f36976a;
                k1 k1Var3 = i2Var.f36978c;
                long j12 = 9223372034707292159L;
                if ((((f2.b) k1Var.getValue()).f26570a & 9223372034707292159L) == 9205357640488583168L) {
                    pVar.getClass();
                    ((fz.c) obj5).invoke(x1.q.e(pVar).f55734c);
                } else {
                    pVar.getClass();
                    for (CourseWord courseWord : x1.q.e(pVar).f55734c) {
                        w2.x xVar = (w2.x) ((HashMap) obj4).get(courseWord);
                        if ((((f2.b) k1Var3.getValue()).f26570a & j12) != 9205357640488583168L && xVar != null && w2.a0.e(xVar).a(((f2.b) k1Var3.getValue()).f26570a) && k1Var2.getValue() == null) {
                            long jC = xVar.c(0L);
                            w2.x xVarH = xVar.H();
                            k1Var2.setValue(new h2(courseWord, 0L, jC, f2.b.h(xVarH != null ? xVarH.c(0L) : 0L, ((f2.b) k1Var3.getValue()).f26570a)));
                        }
                        j12 = 9223372034707292159L;
                    }
                }
                return b0Var;
            case 12:
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                h0 h0Var = (h0) obj5;
                b1 b1Var6 = h0Var.f36961g;
                b1 b1Var7 = h0Var.f36960f;
                Iterable<CourseWord> iterable = (Iterable) b1Var6.getValue();
                CourseWord courseWord2 = (CourseWord) obj6;
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) obj4;
                ArrayList arrayList = new ArrayList(ry.n.W(iterable, 10));
                for (CourseWord courseWordCopy$default : iterable) {
                    String word = courseWordCopy$default.getWord();
                    Locale locale = Locale.ROOT;
                    String lowerCase = word.toLowerCase(locale);
                    kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                    String lowerCase2 = courseWord2.getWord().toLowerCase(locale);
                    kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                    if (lowerCase.equals(lowerCase2) && courseWordCopy$default.getSelectedState() == OptionItemSelectedState.SELECTED && !uVar.f38357a) {
                        uVar.f38357a = true;
                        courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null);
                    }
                    arrayList.add(courseWordCopy$default);
                }
                b1Var6.setValue(arrayList);
                Iterable<CourseWord> iterable2 = (Iterable) b1Var7.getValue();
                ArrayList arrayList2 = new ArrayList(ry.n.W(iterable2, 10));
                for (CourseWord courseWordCopy$default2 : iterable2) {
                    if (kotlin.jvm.internal.m.a(courseWordCopy$default2, courseWord2)) {
                        courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, "_____", "      ", "      ", null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -15, 63, null);
                    }
                    arrayList2.add(courseWordCopy$default2);
                }
                b1Var7.setValue(arrayList2);
                b1 b1Var8 = h0Var.f36958d;
                Iterator it2 = ((Iterable) b1Var7.getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next3 = it2.next();
                        if (kotlin.jvm.internal.m.a(((CourseWord) next3).getWord(), "_____")) {
                            obj2 = next3;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                if (((CourseWord) obj2) == null || (qVar = ht.q.DEFAULT) == null) {
                    qVar = ht.q.SELECTED;
                }
                b1Var8.setValue(qVar);
                return b0Var;
            case 13:
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                CourseWord option = (CourseWord) this.f649b;
                List stemWords = (List) obj5;
                List optionWords = (List) obj6;
                int i16 = ((m1) obj4).f37049b;
                kotlin.jvm.internal.m.f(option, "option");
                kotlin.jvm.internal.m.f(stemWords, "stemWords");
                kotlin.jvm.internal.m.f(optionWords, "optionWords");
                qy.r rVarW = md.a.w(option, stemWords);
                if (rVarW != null) {
                    int iIntValue = ((Number) rVarW.f48505a).intValue();
                    int iIntValue2 = ((Number) rVarW.f48506b).intValue();
                    CourseWord courseWord3 = (CourseWord) rVarW.f48507c;
                    Iterator it3 = optionWords.iterator();
                    int i17 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i17 = -1;
                        } else if (((CourseWord) it3.next()).getWordId() != option.getWordId()) {
                            i17++;
                        }
                    }
                    if (i17 != -1) {
                        CourseWord courseWordCopy$default3 = CourseWord.copy$default(option, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null);
                        ArrayList arrayListC1 = ry.m.c1(stemWords);
                        arrayListC1.set(iIntValue, courseWord3);
                        ArrayList arrayList3 = new ArrayList(ry.n.W(arrayListC1, 10));
                        int size = arrayListC1.size();
                        int i18 = 0;
                        while (i18 < size) {
                            Object obj7 = arrayListC1.get(i18);
                            i18++;
                            int i19 = i14 + 1;
                            if (i14 < 0) {
                                ns.o.V();
                                throw null;
                            }
                            arrayList3.add(c.a.f((CourseWord) obj7, arrayListC1, i14, i16));
                            i14 = i19;
                        }
                        return new p2(i17, courseWordCopy$default3, new jt.a(courseWordCopy$default3, iIntValue, iIntValue2), arrayList3);
                    }
                }
                return null;
            case 14:
                wy.a aVar17 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                q1 q1Var = (q1) obj5;
                b1 b1Var9 = q1Var.f37131i;
                b1 b1Var10 = q1Var.f37132j;
                Iterable<CourseWord> iterable3 = (Iterable) b1Var10.getValue();
                CourseWord courseWord4 = (CourseWord) obj6;
                kotlin.jvm.internal.u uVar2 = (kotlin.jvm.internal.u) obj4;
                ArrayList arrayList4 = new ArrayList(ry.n.W(iterable3, 10));
                for (CourseWord courseWordCopy$default4 : iterable3) {
                    String word2 = courseWordCopy$default4.getWord();
                    vy.d dVar3 = dVar;
                    Locale locale2 = Locale.ROOT;
                    String lowerCase3 = word2.toLowerCase(locale2);
                    kotlin.jvm.internal.m.e(lowerCase3, "toLowerCase(...)");
                    String lowerCase4 = courseWord4.getWord().toLowerCase(locale2);
                    kotlin.jvm.internal.m.e(lowerCase4, "toLowerCase(...)");
                    if (lowerCase3.equals(lowerCase4) && courseWordCopy$default4.getSelectedState() == OptionItemSelectedState.SELECTED && !uVar2.f38357a) {
                        uVar2.f38357a = true;
                        courseWordCopy$default4 = CourseWord.copy$default(courseWordCopy$default4, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null);
                    }
                    arrayList4.add(courseWordCopy$default4);
                    dVar = dVar3;
                }
                vy.d dVar4 = dVar;
                b1Var10.setValue(arrayList4);
                Iterable<CourseWord> iterable4 = (Iterable) b1Var9.getValue();
                ArrayList arrayList5 = new ArrayList(ry.n.W(iterable4, 10));
                for (CourseWord courseWordCopy$default5 : iterable4) {
                    if (kotlin.jvm.internal.m.a(courseWordCopy$default5, courseWord4)) {
                        courseWordCopy$default5 = CourseWord.copy$default(courseWordCopy$default5, 0L, "_____", null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -3, 63, null);
                    }
                    arrayList5.add(courseWordCopy$default5);
                }
                b1Var9.setValue(arrayList5);
                b1 b1Var11 = q1Var.f37128f;
                Iterator it4 = ((Iterable) b1Var9.getValue()).iterator();
                while (true) {
                    if (it4.hasNext()) {
                        Object next4 = it4.next();
                        if (kotlin.jvm.internal.m.a(((CourseWord) next4).getWord(), "_____")) {
                            obj3 = next4;
                        }
                    } else {
                        obj3 = dVar4;
                    }
                }
                if (((CourseWord) obj3) == null || (qVar2 = ht.q.DEFAULT) == null) {
                    qVar2 = ht.q.SELECTED;
                }
                b1Var11.setValue(qVar2);
                return b0Var;
            case 15:
                wy.a aVar18 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                kr.b0 b0Var3 = (kr.b0) this.f649b;
                av.n nVar = b0Var3.f38426c;
                kr.i iVar = (kr.i) obj6;
                List list2 = (List) obj5;
                dm.c cVar2 = new dm.c(iVar, (List) obj4, b0Var3, list2, 7);
                nVar.getClass();
                nVar.f3172c = cVar2;
                nVar.h((String) list2.get(iVar.f38494d));
                return b0Var;
            case 16:
                String str3 = (String) obj6;
                wy.a aVar19 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (Build.VERSION.SDK_INT < 29) {
                    String str4 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM) + File.separator + "LingoDeer";
                    File file = new File(str4);
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    try {
                        objL = new FileOutputStream(new File(str4, defpackage.e.m(str3, ".png")));
                    } catch (Throwable th2) {
                        objL = com.bumptech.glide.e.l(th2);
                    }
                    if (qy.o.a(objL) == null) {
                        outputStream = (FileOutputStream) objL;
                    } else {
                        outputStream = null;
                    }
                    outputStream2 = outputStream;
                    break;
                } else {
                    ContentResolver contentResolver = ((Context) obj5).getContentResolver();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", str3);
                    contentValues.put("mime_type", "image/png");
                    contentValues.put("relative_path", "DCIM/LingoDeer");
                    Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    if (uriInsert != null) {
                        try {
                            objL2 = contentResolver.openOutputStream(uriInsert);
                        } catch (Throwable th3) {
                            objL2 = com.bumptech.glide.e.l(th3);
                        }
                        if (qy.o.a(objL2) == null) {
                            outputStream = (OutputStream) objL2;
                        } else {
                            outputStream = null;
                        }
                        outputStream2 = outputStream;
                    } else {
                        outputStream2 = null;
                    }
                    break;
                }
                if (outputStream2 != null) {
                    try {
                        boolValueOf = Boolean.valueOf(((Bitmap) obj4).compress(Bitmap.CompressFormat.PNG, 100, outputStream2));
                        outputStream2.close();
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            ns.o.m(outputStream2, th4);
                            throw th5;
                        }
                    }
                }
                return boolValueOf;
            case 17:
                List list3 = (List) obj6;
                b1 b1Var12 = (b1) obj4;
                wy.a aVar20 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Set set = (Set) this.f649b;
                if (set != null) {
                    Iterator it5 = list3.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            rt.r rVar = (rt.r) next2;
                            if (rVar.f50321d || set.contains(rVar.f50318a)) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    rt.r rVar2 = (rt.r) next2;
                    if (rVar2 != null) {
                        str = rVar2.f50318a;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str != null) {
                    b1Var12.setValue(str);
                    ((fz.a) obj5).invoke();
                } else if (((String) b1Var12.getValue()) == null || list3.isEmpty()) {
                    it = list3.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        rt.r rVar3 = (rt.r) next;
                        b1Var12.setValue(rVar3 != null ? rVar3.f50318a : null);
                    } while (!((rt.r) next).f50321d);
                    rt.r rVar4 = (rt.r) next;
                    b1Var12.setValue(rVar4 != null ? rVar4.f50318a : null);
                } else {
                    Iterator it6 = list3.iterator();
                    while (it6.hasNext()) {
                        if (kotlin.jvm.internal.m.a(((rt.r) it6.next()).f50318a, (String) b1Var12.getValue())) {
                        }
                    }
                    it = list3.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        rt.r rVar5 = (rt.r) next;
                        b1Var12.setValue(rVar5 != null ? rVar5.f50318a : null);
                    } while (!((rt.r) next).f50321d);
                    rt.r rVar6 = (rt.r) next;
                    b1Var12.setValue(rVar6 != null ? rVar6.f50318a : null);
                }
                return b0Var;
            case 18:
                wy.a aVar21 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b1 b1Var13 = (b1) obj6;
                if (((Boolean) b1Var13.getValue()).booleanValue() && kotlin.jvm.internal.m.a((rt.p) this.f649b, oVar)) {
                    Boolean bool2 = Boolean.FALSE;
                    b1Var13.setValue(bool2);
                    ((b1) obj4).setValue(bool2);
                    ((fz.a) obj5).invoke();
                }
                return b0Var;
            case 19:
                wy.a aVar22 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b1 b1Var14 = (b1) obj4;
                if (((Boolean) b1Var14.getValue()).booleanValue() && kotlin.jvm.internal.m.a((rt.p) this.f649b, oVar)) {
                    b1Var14.setValue(Boolean.FALSE);
                    Toast.makeText((Context) obj5, R.string.success, 0).show();
                    ((fz.a) obj6).invoke();
                }
                return b0Var;
            case 20:
                wy.a aVar23 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((fz.e) this.f649b).invoke(obj5, "__default_bookmark_folder__");
                ((fz.c) obj6).invoke(obj5);
                ((fz.a) obj4).invoke();
                return b0Var;
            case 21:
                wy.a aVar24 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                o0.b bVar = (o0.b) this.f649b;
                bVar.k();
                ((h1) ((a1) obj5)).m(bVar.k());
                ((b1) obj4).setValue(((CourseACK) ((List) ((b1) obj6).getValue()).get(bVar.k())).getUnitName());
                return b0Var;
            case 22:
                wy.a aVar25 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (kotlin.jvm.internal.m.a(((rt.b0) this.f649b).f49473b, oVar)) {
                    ((b1) obj6).setValue(null);
                    ((b1) obj4).setValue(null);
                    ((fz.a) obj5).invoke();
                }
                return b0Var;
            case 23:
                wy.a aVar26 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                o0.b bVar2 = (o0.b) this.f649b;
                if (!bVar2.f44442k.b()) {
                    ke keVar = (ke) ry.m.t0(bVar2.k(), (List) obj5);
                    if (keVar != null && keVar != ((o1) obj6).f50165c) {
                        ((fz.c) obj4).invoke(keVar);
                    }
                }
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                b1 b1Var15 = (b1) obj4;
                wy.a aVar27 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b5 b5Var = (b5) this.f649b;
                v4 v4Var = b5Var.f49515h;
                v4 v4Var2 = v4.FINISHED;
                if (v4Var == v4Var2) {
                    float f5 = l5.f41627a;
                    if (((v4) b1Var15.getValue()) != v4Var2 && !b5Var.f49512e.f50631h) {
                        Toast.makeText((Context) obj5, (String) obj6, 0).show();
                    }
                }
                v4 v4Var3 = b5Var.f49515h;
                float f11 = l5.f41627a;
                b1Var15.setValue(v4Var3);
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                rz.b0 b0Var4 = (rz.b0) this.f649b;
                wy.a aVar28 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return e0.B(b0Var4, null, null, new no.k((DataSnapshot) obj5, (ArrayList) obj6, (no.s) obj4, null, 1), 3);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                wy.a aVar29 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                k0 k0Var = (k0) this.f649b;
                ((av.i) k0Var.Z.getValue()).b((File) obj5, (String) obj6, (ArrayList) obj4, ry.r.f50854a, new mt.r(k0Var, 9), new f0(k0Var, i13));
                return b0Var;
            case 27:
                wy.a aVar30 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                rz.b0 b0Var5 = (rz.b0) this.f649b;
                rz.d0 d0Var2 = rz.d0.UNDISPATCHED;
                s2.w wVar2 = (s2.w) obj5;
                e0.B(b0Var5, null, d0Var2, new s0.e0(wVar2, (s0.a1) obj6, dVar, i14), 1);
                e0.B(b0Var5, null, d0Var2, new ns.j(28, wVar2, (z0) obj4, dVar), 1);
                return b0Var;
            default:
                x1.p pVar2 = (x1.p) obj6;
                wy.a aVar31 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                DayStreakFinishedStatus dayStreakFinishedStatus = (DayStreakFinishedStatus) this.f649b;
                if (dayStreakFinishedStatus != null) {
                    if (dayStreakFinishedStatus.getDayStreak() > 0) {
                        pVar2.add(new xu.h(dayStreakFinishedStatus));
                    }
                    if (dayStreakFinishedStatus.getRefillShieldCount() > 0) {
                        pVar2.add(new xu.i(dayStreakFinishedStatus));
                    }
                }
                Iterator it7 = ((List) obj5).iterator();
                while (it7.hasNext()) {
                    pVar2.add(new xu.g((AchievementLevel) it7.next()));
                }
                ((b1) obj4).setValue(Boolean.TRUE);
                return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, Object obj2, Object obj3, vy.d dVar, int i11) {
        super(2, dVar);
        this.f648a = i11;
        this.f650c = obj;
        this.f651d = obj2;
        this.f652e = obj3;
    }
}
