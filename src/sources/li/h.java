package li;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import bp.q3;
import bq.m;
import bq.r;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.billing.SubscriptionHelpActivity;
import com.lingodeer.R;
import fr.o0;
import oz.x;
import rz.b0;
import uz.x0;
import wt.m0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SubscriptionHelpActivity f40171c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(SubscriptionHelpActivity subscriptionHelpActivity, vy.d dVar, int i11) {
        super(2, dVar);
        this.f40169a = i11;
        this.f40171c = subscriptionHelpActivity;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f40169a) {
            case 0:
                return new h(this.f40171c, dVar, 0);
            default:
                return new h(this.f40171c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f40169a) {
            case 0:
                break;
        }
        return ((h) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objU;
        Object objU2;
        int i11 = this.f40169a;
        SubscriptionHelpActivity subscriptionHelpActivity = this.f40171c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f40170b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    m0 m0Var = subscriptionHelpActivity.n().f55339f;
                    this.f40170b = 1;
                    objU = x0.u(m0Var, this);
                    if (objU == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU = obj;
                }
                String str = (((Boolean) objU).booleanValue() || !TextUtils.isEmpty(((o0) subscriptionHelpActivity.l()).e())) ? "premium" : "basic";
                String string = subscriptionHelpActivity.getString(R.string.feedback_title_1);
                String strW = ((o0) subscriptionHelpActivity.l()).w();
                String strQ0 = x.q0(((o0) subscriptionHelpActivity.l()).b(), "lingoDeer", "email");
                int[] iArr = r.f4959a;
                String strI = m.i(((o0) subscriptionHelpActivity.l()).f27733a.keyLanguage);
                String strR = m.r(((o0) subscriptionHelpActivity.l()).f27733a.locateLanguage);
                String strD = m.d();
                String str2 = Build.MODEL;
                String str3 = Build.VERSION.RELEASE;
                StringBuilder sbS = defpackage.e.s("\n\n\n\n\n==========================\n", string, "\nLingoDeer Android Feedback\nUID: ", strW, "\nLoginMethod: ");
                com.google.android.material.datepicker.d.w(sbS, strQ0, "\nCurrent Course: ", strI, "-");
                com.google.android.material.datepicker.d.w(sbS, strR, "\nMembership: ", str, "\nApp version: Android-");
                com.google.android.material.datepicker.d.w(sbS, strD, "\nPhone model: ", str2, "\nOS Version: Android ");
                String strK = ep.a.k(sbS, str3, "\n==========================\n\n");
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"hi@".concat(FirebaseRemoteConfig.d().f("end_point"))});
                intent.putExtra("android.intent.extra.SUBJECT", "LingoDeer Android Feedback");
                intent.putExtra("android.intent.extra.TEXT", strK);
                if (intent.resolveActivity(subscriptionHelpActivity.getPackageManager()) != null) {
                    subscriptionHelpActivity.startActivity(intent);
                }
                subscriptionHelpActivity.m().c("jxz_contact_via_email", new ju.d(10));
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f40170b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    m0 m0Var2 = subscriptionHelpActivity.n().f55339f;
                    this.f40170b = 1;
                    objU2 = x0.u(m0Var2, this);
                    if (objU2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU2 = obj;
                }
                String str4 = (((Boolean) objU2).booleanValue() || !TextUtils.isEmpty(((o0) subscriptionHelpActivity.l()).e())) ? "premium" : "basic";
                String string2 = subscriptionHelpActivity.getString(R.string.feedback_title_1);
                String strW2 = ((o0) subscriptionHelpActivity.l()).w();
                String strQ1 = x.q0(((o0) subscriptionHelpActivity.l()).b(), "lingoDeer", "email");
                int[] iArr2 = r.f4959a;
                String strI2 = m.i(((o0) subscriptionHelpActivity.l()).f27733a.keyLanguage);
                String strR2 = m.r(((o0) subscriptionHelpActivity.l()).f27733a.locateLanguage);
                String strD2 = m.d();
                String str5 = Build.MODEL;
                String str6 = Build.VERSION.RELEASE;
                StringBuilder sbS2 = defpackage.e.s("\n\n\n\n\n==========================\n", string2, "\nLingoDeer Android Feedback\nUID: ", strW2, "\nLoginMethod: ");
                com.google.android.material.datepicker.d.w(sbS2, strQ1, "\nCurrent Course: ", strI2, "-");
                com.google.android.material.datepicker.d.w(sbS2, strR2, "\nMembership: ", str4, "\nApp version: Android-");
                com.google.android.material.datepicker.d.w(sbS2, strD2, "\nPhone model: ", str5, "\nOS Version: Android ");
                String strK2 = ep.a.k(sbS2, str6, "\n==========================\n\n");
                Intent intent2 = new Intent("android.intent.action.SENDTO");
                intent2.setData(Uri.parse("mailto:"));
                intent2.putExtra("android.intent.extra.EMAIL", new String[]{"hi@".concat(FirebaseRemoteConfig.d().f("end_point"))});
                intent2.putExtra("android.intent.extra.SUBJECT", "LingoDeer Android Feedback");
                intent2.putExtra("android.intent.extra.TEXT", strK2);
                if (intent2.resolveActivity(subscriptionHelpActivity.getPackageManager()) != null) {
                    subscriptionHelpActivity.startActivity(intent2);
                } else {
                    lc.d dVar = new lc.d(subscriptionHelpActivity);
                    lc.d.c(dVar, null, subscriptionHelpActivity.getString(R.string.email_not_found_message), 5);
                    lc.d.e(dVar, new Integer(R.string.f22251ok), null, new q3(dVar, 4), 2);
                    m.a(subscriptionHelpActivity, strK2);
                    dVar.show();
                }
                return qy.b0.f48488a;
        }
    }
}
