package av;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewModelKt;
import au.d1;
import b0.a1;
import bp.r2;
import bp.t2;
import bp.v2;
import bp.y1;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.api.Service;
import com.lingo.course.ui.CourseReviewTestActivity;
import com.lingo.lingoskill.object.ARChar;
import com.lingo.lingoskill.object.KOCharZhuyin;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.handwrite.HandWriteGroupActivity;
import com.lingo.lingoskill.widget.daystreak.DayStreakWidgetReceiver;
import com.lingo.main.ui.MainComposeActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.DayStreakFinishedStatus;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LoginHistory;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dt.k3;
import e6.o0;
import e6.w0;
import hj.c4;
import hj.d4;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import jt.x0;
import kotlin.NoWhenBranchMatchedException;
import l0.Eeqr.HOBXIlHxIkMBEA;
import l1.b1;
import l1.c3;
import rt.t5;
import rt.z5;
import rz.g1;
import rz.z1;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f3129a = i11;
        this.f3131c = obj;
        this.f3130b = obj2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f3129a) {
            case 0:
                return new f0(0, (BufferedOutputStream) this.f3131c, (kotlin.jvm.internal.y) this.f3130b, dVar);
            case 1:
                f0 f0Var = new f0((kotlin.jvm.internal.y) this.f3130b, dVar, 1);
                f0Var.f3131c = obj;
                return f0Var;
            case 2:
                f0 f0Var2 = new f0((b1.m) this.f3130b, dVar, 2);
                f0Var2.f3131c = obj;
                return f0Var2;
            case 3:
                return new f0(3, (LoginActivity) this.f3131c, (b1) this.f3130b, dVar);
            case 4:
                f0 f0Var3 = new f0((r2) this.f3130b, dVar, 4);
                f0Var3.f3131c = obj;
                return f0Var3;
            case 5:
                f0 f0Var4 = new f0((v2) this.f3130b, dVar, 5);
                f0Var4.f3131c = obj;
                return f0Var4;
            case 6:
                f0 f0Var5 = new f0((MainComposeActivity) this.f3130b, dVar, 6);
                f0Var5.f3131c = obj;
                return f0Var5;
            case 7:
                return new f0(7, (j9.q) this.f3131c, (b1) this.f3130b, dVar);
            case 8:
                return new f0(8, (ou.c) this.f3131c, (ys.d0) this.f3130b, dVar);
            case 9:
                return new f0(9, (nu.e) this.f3131c, (b1) this.f3130b, dVar);
            case 10:
                f0 f0Var6 = new f0((b0.d) this.f3130b, dVar, 10);
                f0Var6.f3131c = obj;
                return f0Var6;
            case 11:
                return new f0(11, (fz.e) this.f3131c, (CourseSentence) this.f3130b, dVar);
            case 12:
                return new f0(12, (b1) this.f3131c, (x0) this.f3130b, dVar);
            case 13:
                return new f0(13, (CourseSentence) this.f3131c, (ht.o) this.f3130b, dVar);
            case 14:
                return new f0(14, (b1) this.f3131c, (js.i) this.f3130b, dVar);
            case 15:
                return new f0(15, (z5) this.f3131c, (ns.z) this.f3130b, dVar);
            case 16:
                return new f0(16, (ht.q) this.f3131c, (Context) this.f3130b, dVar);
            case 17:
                return new f0(17, (ht.l) this.f3131c, (b1) this.f3130b, dVar);
            case 18:
                f0 f0Var7 = new f0((ArrayList) this.f3130b, dVar, 18);
                f0Var7.f3131c = obj;
                return f0Var7;
            case 19:
                f0 f0Var8 = new f0((w0) this.f3130b, dVar, 19);
                f0Var8.f3131c = obj;
                return f0Var8;
            case 20:
                return new f0(20, (gi.d) this.f3131c, (o0.b) this.f3130b, dVar);
            case 21:
                return new f0(21, (gn.e) this.f3131c, (o0.b) this.f3130b, dVar);
            case 22:
                return new f0(22, (b1) this.f3131c, (jt.v) this.f3130b, dVar);
            case 23:
                return new f0(23, (ur.a) this.f3131c, (DayStreakFinishedStatus) this.f3130b, dVar);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new f0(24, (uv.b) this.f3131c, (fv.a) this.f3130b, dVar);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new f0(25, (gi.d) this.f3131c, (ARChar) this.f3130b, dVar);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new f0(26, (gn.e) this.f3131c, (KOCharZhuyin) this.f3130b, dVar);
            case 27:
                return new f0(27, (gq.u) this.f3131c, (gq.w) this.f3130b, dVar);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new f0(28, (List) this.f3131c, (HandWriteGroupActivity) this.f3130b, dVar);
            default:
                return new f0(29, (fz.c) this.f3131c, (b1) this.f3130b, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        switch (this.f3129a) {
            case 0:
                f0 f0Var = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                f0Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                return ((f0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((f0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                f0 f0Var2 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var2 = qy.b0.f48488a;
                f0Var2.invokeSuspend(b0Var2);
                return b0Var2;
            case 4:
                f0 f0Var3 = (f0) create((wu.h) obj, (vy.d) obj2);
                qy.b0 b0Var3 = qy.b0.f48488a;
                f0Var3.invokeSuspend(b0Var3);
                return b0Var3;
            case 5:
                f0 f0Var4 = (f0) create((wu.h) obj, (vy.d) obj2);
                qy.b0 b0Var4 = qy.b0.f48488a;
                f0Var4.invokeSuspend(b0Var4);
                return b0Var4;
            case 6:
                f0 f0Var5 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var5 = qy.b0.f48488a;
                f0Var5.invokeSuspend(b0Var5);
                return b0Var5;
            case 7:
                f0 f0Var6 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var6 = qy.b0.f48488a;
                f0Var6.invokeSuspend(b0Var6);
                return b0Var6;
            case 8:
                return ((f0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                f0 f0Var7 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var7 = qy.b0.f48488a;
                f0Var7.invokeSuspend(b0Var7);
                return b0Var7;
            case 10:
                f0 f0Var8 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var8 = qy.b0.f48488a;
                f0Var8.invokeSuspend(b0Var8);
                return b0Var8;
            case 11:
                f0 f0Var9 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var9 = qy.b0.f48488a;
                f0Var9.invokeSuspend(b0Var9);
                return b0Var9;
            case 12:
                f0 f0Var10 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var10 = qy.b0.f48488a;
                f0Var10.invokeSuspend(b0Var10);
                return b0Var10;
            case 13:
                return ((f0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                f0 f0Var11 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var11 = qy.b0.f48488a;
                f0Var11.invokeSuspend(b0Var11);
                return b0Var11;
            case 15:
                f0 f0Var12 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var12 = qy.b0.f48488a;
                f0Var12.invokeSuspend(b0Var12);
                return b0Var12;
            case 16:
                f0 f0Var13 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var13 = qy.b0.f48488a;
                f0Var13.invokeSuspend(b0Var13);
                return b0Var13;
            case 17:
                f0 f0Var14 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var14 = qy.b0.f48488a;
                f0Var14.invokeSuspend(b0Var14);
                return b0Var14;
            case 18:
                return ((f0) create((r5.b) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 19:
                return ((f0) create((g6.f) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 20:
                f0 f0Var15 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var15 = qy.b0.f48488a;
                f0Var15.invokeSuspend(b0Var15);
                return b0Var15;
            case 21:
                f0 f0Var16 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var16 = qy.b0.f48488a;
                f0Var16.invokeSuspend(b0Var16);
                return b0Var16;
            case 22:
                f0 f0Var17 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var17 = qy.b0.f48488a;
                f0Var17.invokeSuspend(b0Var17);
                return b0Var17;
            case 23:
                f0 f0Var18 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var18 = qy.b0.f48488a;
                f0Var18.invokeSuspend(b0Var18);
                return b0Var18;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((f0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                f0 f0Var19 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var19 = qy.b0.f48488a;
                f0Var19.invokeSuspend(b0Var19);
                return b0Var19;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                f0 f0Var20 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var20 = qy.b0.f48488a;
                f0Var20.invokeSuspend(b0Var20);
                return b0Var20;
            case 27:
                f0 f0Var21 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var21 = qy.b0.f48488a;
                f0Var21.invokeSuspend(b0Var21);
                return b0Var21;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                f0 f0Var22 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var22 = qy.b0.f48488a;
                f0Var22.invokeSuspend(b0Var22);
                return b0Var22;
            default:
                f0 f0Var23 = (f0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var23 = qy.b0.f48488a;
                f0Var23.invokeSuspend(b0Var23);
                return b0Var23;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3129a = i11;
        this.f3130b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0422  */
    /* JADX WARN: Code duplicated, block: B:141:0x04d2 A[PHI: r4
      0x04d2: PHI (r4v15 java.lang.Object) = (r4v57 java.lang.Object), (r4v58 java.lang.Object), (r4v59 java.lang.Object), (r4v60 java.lang.Object) binds: [B:140:0x04d0, B:143:0x04dc, B:146:0x04e7, B:149:0x04f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:203:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:204:0x06ca  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [vy.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v75 */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws IOException {
        String str;
        String str2;
        br.g0 g0Var;
        br.f0 f0Var;
        br.e0 e0Var;
        Object obj2;
        ys.d0 d0Var;
        boolean z11;
        String strC;
        int i11 = this.f3129a;
        int i12 = R.id.iv_pro;
        int i13 = R.id.tv_email;
        int i14 = R.id.tv_nick_name;
        int i15 = R.id.iv_login_method;
        int i16 = R.layout.item_login_history;
        int i17 = 29;
        int i18 = 2;
        boolean z12 = true;
        boolean zO = true;
        int i19 = 0;
        ?? L = 0;
        Object obj3 = null;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                BufferedOutputStream bufferedOutputStream = (BufferedOutputStream) this.f3131c;
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                ((kotlin.jvm.internal.y) this.f3130b).f38361a = null;
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f3130b;
                try {
                    BufferedOutputStream bufferedOutputStream2 = (BufferedOutputStream) yVar.f38361a;
                    if (bufferedOutputStream2 != null) {
                        bufferedOutputStream2.flush();
                    }
                    BufferedOutputStream bufferedOutputStream3 = (BufferedOutputStream) yVar.f38361a;
                    if (bufferedOutputStream3 != null) {
                        bufferedOutputStream3.close();
                        L = qy.b0.f48488a;
                    }
                    break;
                } catch (Throwable th2) {
                    L = com.bumptech.glide.e.l(th2);
                }
                return new qy.o(L);
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                rz.b0 b0Var = (rz.b0) this.f3131c;
                b1.m mVar = (b1.m) this.f3130b;
                g1 g1Var = (g1) mVar.f3794b.getAndSet(null);
                AtomicReference atomicReference = mVar.f3794b;
                z1 z1VarB = rz.e0.B(b0Var, null, null, new b1.c(true ? 1 : 0, g1Var, mVar, (vy.d) L), 3);
                while (!atomicReference.compareAndSet(null, z1VarB)) {
                    if (atomicReference.get() != null) {
                        z12 = false;
                        return Boolean.valueOf(z12);
                    }
                }
                return Boolean.valueOf(z12);
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                LoginActivity loginActivity = (LoginActivity) this.f3131c;
                new Integer(loginActivity.getIntent().getIntExtra(INTENTS.EXTRA_INT, -1));
                int intExtra = loginActivity.getIntent().getIntExtra(INTENTS.EXTRA_INT, 0);
                loginActivity.K = intExtra;
                int i21 = LoginActivity.Q;
                if (intExtra == 1) {
                    str = "launch_haveaccount";
                } else if (intExtra == 4) {
                    str = "me";
                } else if (intExtra == 5) {
                    str = "manage_account";
                } else if (intExtra == 6) {
                    str = "weekly_rank";
                } else if (intExtra == 2) {
                    str = "save_progress";
                } else if (intExtra == 7) {
                    str = "story_speak_publish";
                } else if (intExtra == 8) {
                    str = "story_speak_leaderbd_like";
                } else if (intExtra == 9) {
                    str = "me_progress_backup";
                } else if (intExtra == 10) {
                    str = "bug_report";
                } else {
                    str = intExtra == 3 ? "follow" : BuildConfig.VERSION_NAME;
                }
                loginActivity.m().c("jxz_enter_signin", new ar.a(str, i18));
                try {
                    xq.c cVar = new xq.c(loginActivity, new y1(loginActivity));
                    loginActivity.L = cVar;
                    cVar.L();
                    break;
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                bq.g gVar = new bq.g(loginActivity, loginActivity.O);
                loginActivity.M = gVar;
                GoogleSignInOptions.Builder builder = new GoogleSignInOptions.Builder(GoogleSignInOptions.M);
                builder.f8500a.add(GoogleSignInOptions.N);
                builder.f8500a.add(GoogleSignInOptions.O);
                gVar.f4949c = new GoogleSignInClient(loginActivity, Auth.f8351a, builder.a(), new ApiExceptionMapper());
                ((b1) this.f3130b).setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 4:
                wu.h hVar = (wu.h) this.f3131c;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (!kotlin.jvm.internal.m.a(hVar, wu.f.f55387a)) {
                    if (!(hVar instanceof wu.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r2 r2Var = (r2) this.f3130b;
                    List<LoginHistory> list = ((wu.g) hVar).f55389a;
                    ta.a aVar6 = r2Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar6);
                    ((c4) aVar6).f32465d.removeAllViews();
                    for (LoginHistory loginHistory : list) {
                        loginHistory.getUid();
                        LayoutInflater layoutInflaterFrom = LayoutInflater.from(r2Var.requireContext());
                        ta.a aVar7 = r2Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar7);
                        View viewInflate = layoutInflaterFrom.inflate(i16, (ViewGroup) ((c4) aVar7).f32465d, false);
                        ImageView imageView = (ImageView) viewInflate.findViewById(i15);
                        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_nick_name);
                        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_email);
                        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_pro);
                        String accountType = loginHistory.getAccountType();
                        if (kotlin.jvm.internal.m.a(accountType, "gg")) {
                            imageView.setImageResource(R.drawable.ic_login_history_method_google);
                        } else {
                            if (kotlin.jvm.internal.m.a(accountType, "fb")) {
                                imageView.setImageResource(R.drawable.ic_login_history_method_facebook);
                            } else {
                                imageView.setImageResource(R.drawable.ic_login_history_method_email);
                            }
                            textView.setText(loginHistory.getNickName());
                            textView2.setText(loginHistory.getEmail());
                            if (loginHistory.isMember()) {
                                imageView2.setVisibility(0);
                            } else {
                                imageView2.setVisibility(8);
                            }
                            bq.z.b(viewInflate, new d1(12, r2Var, loginHistory));
                            ta.a aVar8 = r2Var.f36400f;
                            kotlin.jvm.internal.m.c(aVar8);
                            ((c4) aVar8).f32465d.addView(viewInflate);
                            i15 = R.id.iv_login_method;
                            i16 = R.layout.item_login_history;
                        }
                        textView.setText(loginHistory.getNickName());
                        textView2.setText(loginHistory.getEmail());
                        if (loginHistory.isMember()) {
                            imageView2.setVisibility(0);
                        } else {
                            imageView2.setVisibility(8);
                        }
                        bq.z.b(viewInflate, new d1(12, r2Var, loginHistory));
                        ta.a aVar9 = r2Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar9);
                        ((c4) aVar9).f32465d.addView(viewInflate);
                        i15 = R.id.iv_login_method;
                        i16 = R.layout.item_login_history;
                    }
                }
                return qy.b0.f48488a;
            case 5:
                wu.h hVar2 = (wu.h) this.f3131c;
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (!kotlin.jvm.internal.m.a(hVar2, wu.f.f55387a)) {
                    if (!(hVar2 instanceof wu.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    v2 v2Var = (v2) this.f3130b;
                    List<LoginHistory> list2 = ((wu.g) hVar2).f55389a;
                    t2 t2Var = new t2(v2Var, true ? 1 : 0);
                    for (LoginHistory loginHistory2 : list2) {
                        loginHistory2.getUid();
                        LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(v2Var.requireContext());
                        ta.a aVar11 = v2Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar11);
                        View viewInflate2 = layoutInflaterFrom2.inflate(R.layout.item_login_history, (ViewGroup) ((d4) aVar11).f32493c, false);
                        ImageView imageView3 = (ImageView) viewInflate2.findViewById(R.id.iv_login_method);
                        TextView textView3 = (TextView) viewInflate2.findViewById(i14);
                        TextView textView4 = (TextView) viewInflate2.findViewById(i13);
                        ImageView imageView4 = (ImageView) viewInflate2.findViewById(i12);
                        ((ImageView) viewInflate2.findViewById(R.id.iv_delete)).setVisibility(0);
                        String accountType2 = loginHistory2.getAccountType();
                        if (kotlin.jvm.internal.m.a(accountType2, HOBXIlHxIkMBEA.DVSix)) {
                            imageView3.setImageResource(R.drawable.ic_login_history_method_google);
                        } else if (kotlin.jvm.internal.m.a(accountType2, "fb")) {
                            imageView3.setImageResource(R.drawable.ic_login_history_method_facebook);
                        } else {
                            imageView3.setImageResource(R.drawable.ic_login_history_method_email);
                        }
                        textView3.setText(loginHistory2.getNickName());
                        textView4.setText(loginHistory2.getEmail());
                        if (loginHistory2.isMember()) {
                            imageView4.setVisibility(0);
                        } else {
                            imageView4.setVisibility(8);
                        }
                        bq.z.b(viewInflate2, new b0.a(v2Var, t2Var, loginHistory2, viewInflate2, 4));
                        ta.a aVar12 = v2Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar12);
                        ((d4) aVar12).f32493c.addView(viewInflate2);
                        i12 = R.id.iv_pro;
                        i13 = R.id.tv_email;
                        i14 = R.id.tv_nick_name;
                    }
                    ta.a aVar13 = v2Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar13);
                    bq.z.b(((d4) aVar13).f32492b, new t2(v2Var, i19));
                }
                return qy.b0.f48488a;
            case 6:
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                MainComposeActivity mainComposeActivity = (MainComposeActivity) this.f3130b;
                try {
                    int i22 = MainComposeActivity.U;
                    ((ar.e) mainComposeActivity.P.getValue()).b();
                    break;
                } catch (Throwable th3) {
                    com.bumptech.glide.e.l(th3);
                }
                return qy.b0.f48488a;
            case 7:
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                j9.q qVar = (j9.q) this.f3131c;
                if (qVar != null && (str2 = (String) qVar.f36242b.f3962e) != null) {
                    b1 b1Var = (b1) this.f3130b;
                    br.d0 d0Var2 = br.d0.f5026d;
                    if (str2.equals("learn")) {
                        obj2 = d0Var2;
                        obj2 = g0Var;
                        obj2 = f0Var;
                        obj2 = e0Var;
                        obj2 = d0Var2;
                        obj2 = g0Var;
                        obj2 = f0Var;
                        obj2 = d0Var2;
                        obj2 = g0Var;
                        obj2 = d0Var2;
                        obj3 = obj2;
                    } else {
                        g0Var = br.g0.f5036d;
                        if (str2.equals("review")) {
                            obj2 = d0Var2;
                            obj2 = g0Var;
                            obj2 = f0Var;
                            obj2 = e0Var;
                            obj2 = d0Var2;
                            obj2 = g0Var;
                            obj2 = f0Var;
                            obj2 = d0Var2;
                            obj2 = g0Var;
                            obj2 = d0Var2;
                            obj3 = obj2;
                        } else {
                            f0Var = br.f0.f5032d;
                            if (str2.equals("premium")) {
                                obj2 = d0Var2;
                                obj2 = g0Var;
                                obj2 = f0Var;
                                obj2 = e0Var;
                                obj2 = d0Var2;
                                obj2 = g0Var;
                                obj2 = f0Var;
                                obj2 = d0Var2;
                                obj2 = g0Var;
                                obj2 = d0Var2;
                                obj3 = obj2;
                            } else {
                                e0Var = br.e0.f5029d;
                                if (str2.equals("me")) {
                                    obj2 = d0Var2;
                                    obj2 = g0Var;
                                    obj2 = f0Var;
                                    obj2 = e0Var;
                                    obj2 = d0Var2;
                                    obj2 = g0Var;
                                    obj2 = f0Var;
                                    obj2 = d0Var2;
                                    obj2 = g0Var;
                                    obj2 = d0Var2;
                                    obj3 = obj2;
                                }
                            }
                        }
                    }
                    if (obj3 != null) {
                        int i23 = MainComposeActivity.U;
                        b1Var.setValue(str2);
                    }
                }
                return qy.b0.f48488a;
            case 8:
                qy.b0 b0Var2 = qy.b0.f48488a;
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((ou.c) this.f3131c) == null && (d0Var = (ys.d0) this.f3130b) != null) {
                    d0Var.f();
                }
                return b0Var2;
            case 9:
                wy.a aVar17 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((nu.e) this.f3131c).d((ou.f) ((b1) this.f3130b).getValue());
                return qy.b0.f48488a;
            case 10:
                rz.b0 b0Var3 = (rz.b0) this.f3131c;
                wy.a aVar18 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                rz.e0.B(b0Var3, null, null, new bt.f0((b0.d) this.f3130b, L, i19), 3);
                return qy.b0.f48488a;
            case 11:
                CourseSentence courseSentence = (CourseSentence) this.f3130b;
                wy.a aVar19 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((fz.e) this.f3131c).invoke(jh.h.q(courseSentence), new ht.c(courseSentence.getVisemedMap()));
                return qy.b0.f48488a;
            case 12:
                wy.a aVar20 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (!((Boolean) ((b1) this.f3131c).getValue()).booleanValue()) {
                    ((x0) this.f3130b).f37265k.setValue(null);
                }
                return qy.b0.f48488a;
            case 13:
                wy.a aVar21 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                CourseSentence courseSentence2 = (CourseSentence) this.f3131c;
                if (!kotlin.jvm.internal.m.a(courseSentence2.getVideoUri(), Uri.EMPTY)) {
                    String path = courseSentence2.getVideoUri().getPath();
                    if (path == null) {
                        path = BuildConfig.VERSION_NAME;
                    }
                    z11 = new File(path).exists() && ((ht.o) this.f3130b).f33762j;
                }
                return Boolean.valueOf(z11);
            case 14:
                wy.a aVar22 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ChineseToneLesson chineseToneLesson = (ChineseToneLesson) ((b1) this.f3131c).getValue();
                if (chineseToneLesson != null) {
                    ((js.i) this.f3130b).a(chineseToneLesson);
                }
                return qy.b0.f48488a;
            case 15:
                wy.a aVar23 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                z5 z5Var = (z5) this.f3131c;
                Long l9 = new Long(((ns.z) this.f3130b).f44038a);
                if (!kotlin.jvm.internal.m.a(z5Var.f50769t, l9)) {
                    z5Var.f50769t = l9;
                    i1 i1Var = z5Var.f50766d;
                    t5 t5Var = t5.f50425a;
                    i1Var.getClass();
                    i1Var.l(null, t5Var);
                }
                return qy.b0.f48488a;
            case 16:
                wy.a aVar24 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((ht.q) this.f3131c) == ht.q.CORRECT) {
                    Context context = (Context) this.f3130b;
                    c3 c3Var = k3.f23943a;
                    kotlin.jvm.internal.m.f(context, "context");
                }
                return qy.b0.f48488a;
            case 17:
                wy.a aVar25 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (!(((ht.l) this.f3131c) instanceof ht.e)) {
                    ((b1) this.f3130b).setValue(-1L);
                }
                return qy.b0.f48488a;
            case 18:
                wy.a aVar26 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                r5.b bVarG = ((r5.b) this.f3131c).g();
                ArrayList arrayList = (ArrayList) this.f3130b;
                r5.d dVar = o0.f25004g;
                ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
                int size = arrayList.size();
                int i24 = 0;
                while (i24 < size) {
                    Object obj4 = arrayList.get(i24);
                    i24++;
                    arrayList2.add(((DayStreakWidgetReceiver) obj4).getClass().getName());
                }
                bVarG.e(dVar, ry.m.f1(arrayList2));
                int size2 = arrayList.size();
                while (i19 < size2) {
                    Object obj5 = arrayList.get(i19);
                    i19++;
                    DayStreakWidgetReceiver dayStreakWidgetReceiver = (DayStreakWidgetReceiver) obj5;
                    e6.j0 j0Var = o0.f25001d;
                    j0Var.getClass();
                    String canonicalName = dayStreakWidgetReceiver.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        throw new IllegalArgumentException("no receiver name");
                    }
                    r5.d dVarA = e6.j0.a(j0Var, canonicalName);
                    String canonicalName2 = dayStreakWidgetReceiver.f22194b.getClass().getCanonicalName();
                    if (canonicalName2 == null) {
                        throw new IllegalArgumentException("no provider name");
                    }
                    bVarG.f(dVarA, canonicalName2);
                }
                return bVarG.h();
            case 19:
                wy.a aVar27 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                g6.f fVar = (g6.f) this.f3131c;
                androidx.glance.appwidget.protobuf.u uVar = (androidx.glance.appwidget.protobuf.u) fVar.b(androidx.glance.appwidget.protobuf.w.NEW_BUILDER);
                if (!uVar.f1999a.equals(fVar)) {
                    uVar.d();
                    androidx.glance.appwidget.protobuf.u.f(uVar.f2000b, fVar);
                }
                w0 w0Var = (w0) this.f3130b;
                g6.e eVar = (g6.e) uVar;
                int iP = ((g6.f) eVar.f2000b).p();
                eVar.d();
                g6.f.m((g6.f) eVar.f2000b, iP);
                eVar.d();
                g6.f.l((g6.f) eVar.f2000b);
                for (Map.Entry entry : w0Var.f25070b.entrySet()) {
                    g6.j jVar = (g6.j) entry.getKey();
                    int iIntValue = ((Number) entry.getValue()).intValue();
                    if (w0Var.f25073e.contains(new Integer(iIntValue))) {
                        g6.g gVarO = g6.h.o();
                        gVarO.d();
                        g6.h.k((g6.h) gVarO.f2000b, jVar);
                        gVarO.d();
                        g6.h.l((g6.h) gVarO.f2000b, iIntValue);
                        eVar.d();
                        g6.f.k((g6.f) eVar.f2000b, (g6.h) gVarO.a());
                    }
                }
                return eVar.a();
            case 20:
                wy.a aVar28 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                gi.d dVar2 = (gi.d) this.f3131c;
                int iK = ((o0.b) this.f3130b).k();
                i1 i1Var2 = dVar2.f29260e;
                Integer numValueOf = Integer.valueOf(iK);
                i1Var2.getClass();
                i1Var2.l(null, numValueOf);
                dVar2.f29257b.n();
                rz.e0.B(ViewModelKt.getViewModelScope(dVar2), null, null, new p(dVar2, L, 14), 3);
                return qy.b0.f48488a;
            case 21:
                wy.a aVar29 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                gn.e eVar2 = (gn.e) this.f3131c;
                int iK2 = ((o0.b) this.f3130b).k();
                i1 i1Var3 = eVar2.f29326f;
                Integer numValueOf2 = Integer.valueOf(iK2);
                i1Var3.getClass();
                i1Var3.l(null, numValueOf2);
                eVar2.f29323c.n();
                rz.e0.B(ViewModelKt.getViewModelScope(eVar2), null, null, new a1(eVar2, iK2, L, i17), 3);
                return qy.b0.f48488a;
            case 22:
                wy.a aVar30 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (!((Boolean) ((b1) this.f3131c).getValue()).booleanValue()) {
                    ((jt.v) this.f3130b).f37215f.setValue(null);
                }
                return qy.b0.f48488a;
            case 23:
                wy.a aVar31 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((ur.a) this.f3131c).c("ep_streak_lesson_complete", new cr.n((DayStreakFinishedStatus) this.f3130b, 21));
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                wy.a aVar32 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                uv.b bVar = (uv.b) this.f3131c;
                File file = new File(bVar.f53185f);
                if (((fv.a) this.f3130b).f28185d != 6) {
                    String parent = file.getParent();
                    kotlin.jvm.internal.m.e(parent, "getParent(...)");
                    String str3 = bVar.f53186g;
                    kotlin.jvm.internal.m.e(str3, "getFilename(...)");
                    zO = ks.b.o(parent, str3);
                }
                return Boolean.valueOf(zO);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                wy.a aVar33 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                gi.d dVar3 = (gi.d) this.f3131c;
                ARChar aRChar = (ARChar) this.f3130b;
                qy.q qVar2 = fv.b.f28186a;
                dVar3.f29257b.h(fv.b.d(aRChar.getAudioName() + ".mp3"));
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                qy.b0 b0Var4 = qy.b0.f48488a;
                wy.a aVar34 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                gn.e eVar3 = (gn.e) this.f3131c;
                i1 i1Var4 = eVar3.f29326f;
                if (((gn.a) eVar3.f29324d.getValue()).f29307g) {
                    KOCharZhuyin kOCharZhuyin = (KOCharZhuyin) this.f3130b;
                    if (((Number) i1Var4.getValue()).intValue() == 3) {
                        qy.q qVar3 = fv.b.f28186a;
                        String zhuyin = kOCharZhuyin.getZhuyin();
                        kotlin.jvm.internal.m.e(zhuyin, "getZhuyin(...)");
                        strC = fv.b.l(zhuyin);
                    } else {
                        qy.q qVar4 = fv.b.f28186a;
                        String zhuyin2 = kOCharZhuyin.getZhuyin();
                        kotlin.jvm.internal.m.e(zhuyin2, "getZhuyin(...)");
                        strC = fv.b.c(zhuyin2, null, null);
                    }
                    eVar3.f29323c.h(strC);
                } else {
                    rz.e0.B(ViewModelKt.getViewModelScope(eVar3), null, null, new a1(eVar3, ((Number) i1Var4.getValue()).intValue(), L, i17), 3);
                }
                return b0Var4;
            case 27:
                wy.a aVar35 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                gq.k kVar = ((gq.u) this.f3131c).f29637e;
                gq.w session = (gq.w) this.f3130b;
                kVar.getClass();
                kotlin.jvm.internal.m.f(session, "session");
                synchronized (kVar.f29597a) {
                    try {
                        gq.d0 d0Var3 = kVar.f29599c;
                        if ((d0Var3 != null ? d0Var3.f29580a : null) == session) {
                            kVar.f29599c = null;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                gq.w wVar = (gq.w) this.f3130b;
                long j11 = wVar.f29648a;
                int i25 = wVar.f29649b;
                return qy.b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                wy.a aVar36 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                List groupCharacters = (List) this.f3131c;
                HandWriteGroupActivity handWriteGroupActivity = (HandWriteGroupActivity) this.f3130b;
                int i26 = ((fr.o0) handWriteGroupActivity.l()).f27733a.keyLanguage;
                kotlin.jvm.internal.m.f(groupCharacters, "groupCharacters");
                ArrayList arrayList3 = new ArrayList();
                Iterator it = groupCharacters.iterator();
                while (it.hasNext()) {
                    long characterId = ((CourseCharacter) it.next()).getCharacterId();
                    arrayList3.add(new SRSStatus(xt.d.q(characterId, 2, i26), -1L, characterId, 2, xt.d.k(i26), "drill", 0L, wt.o.CORRECT));
                }
                int i27 = CourseReviewTestActivity.M;
                handWriteGroupActivity.startActivity(tw.c.r(handWriteGroupActivity, arrayList3, CoursePracticeType.CHARACTER_DRILL, null, 20));
                return qy.b0.f48488a;
            default:
                wy.a aVar37 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                fz.c cVar2 = (fz.c) this.f3131c;
                if (cVar2 != null) {
                    Boolean bool = (Boolean) ((b1) this.f3130b).getValue();
                    bool.booleanValue();
                    cVar2.invoke(bool);
                }
                return qy.b0.f48488a;
        }
    }
}
