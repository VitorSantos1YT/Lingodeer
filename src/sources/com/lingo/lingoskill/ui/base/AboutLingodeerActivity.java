package com.lingo.lingoskill.ui.base;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import at.h;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.ui.base.AboutLingodeerActivity;
import com.lingo.lingoskill.ui.base.MethodologyActivity;
import com.lingo.lingoskill.ui.base.RemoteUrlActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import fz.a;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.x1;
import xg.d;
import xu.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AboutLingodeerActivity extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f22038t = 0;

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-539578425);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            boolean zH = sVar.h(this);
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (zH || objQ == gVar) {
                final int i13 = 0;
                objQ = new a(this) { // from class: bp.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AboutLingodeerActivity f4474b;

                    {
                        this.f4474b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i14 = i13;
                        qy.b0 b0Var = qy.b0.f48488a;
                        AboutLingodeerActivity context = this.f4474b;
                        switch (i14) {
                            case 0:
                                int i15 = AboutLingodeerActivity.f22038t;
                                context.finish();
                                break;
                            case 1:
                                int i16 = AboutLingodeerActivity.f22038t;
                                String url = "https://www." + FirebaseRemoteConfig.d().f("end_point") + "/privacypolicy-html";
                                kotlin.jvm.internal.m.f(context, "context");
                                kotlin.jvm.internal.m.f(url, "url");
                                Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent.putExtra(INTENTS.EXTRA_STRING, url);
                                intent.putExtra(INTENTS.EXTRA_STRING_2, "Privacy Policy");
                                context.startActivity(intent);
                                break;
                            case 2:
                                int i17 = AboutLingodeerActivity.f22038t;
                                context.m().c("jxz_click_whatsnew", new androidx.lifecycle.j(13));
                                f10.e.b().f(new np.b(17));
                                String strF = FirebaseRemoteConfig.d().f("what_s_new_url");
                                String string = context.getString(R.string.what_s_new);
                                kotlin.jvm.internal.m.e(string, "getString(...)");
                                Intent intent2 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent2.putExtra(INTENTS.EXTRA_STRING, strF);
                                intent2.putExtra(INTENTS.EXTRA_STRING_2, string);
                                context.startActivity(intent2);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(14));
                                break;
                            case 3:
                                int i18 = AboutLingodeerActivity.f22038t;
                                String url2 = ep.a.g("https://blog.", FirebaseRemoteConfig.d().f("end_point"), "/");
                                String string2 = context.getString(R.string.our_blog);
                                kotlin.jvm.internal.m.e(string2, "getString(...)");
                                kotlin.jvm.internal.m.f(url2, "url");
                                Intent intent3 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent3.putExtra(INTENTS.EXTRA_STRING, url2);
                                intent3.putExtra(INTENTS.EXTRA_STRING_2, string2);
                                context.startActivity(intent3);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(11));
                                break;
                            case 4:
                                int i19 = AboutLingodeerActivity.f22038t;
                                context.startActivity(new Intent(context, (Class<?>) MethodologyActivity.class));
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(17));
                                break;
                            case 5:
                                int i21 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/lingodeer/")));
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(12));
                                break;
                            case 6:
                                int i22 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/lingodeerapp/")));
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(16));
                                break;
                            case 7:
                                int i23 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.twitter.com/lingodeer/")));
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(10));
                                break;
                            case 8:
                                int i24 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.reddit.com/r/lingodeer/")));
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(15));
                                break;
                            default:
                                int i25 = AboutLingodeerActivity.f22038t;
                                int[] iArr = bq.r.f4959a;
                                String string3 = context.getString(R.string.twitter_share_app_prefix, bq.m.s(context, ((fr.o0) context.l()).f27733a.keyLanguage));
                                kotlin.jvm.internal.m.e(string3, "getString(...)");
                                Intent intent4 = new Intent();
                                intent4.setAction("android.intent.action.SEND");
                                intent4.putExtra("android.intent.extra.TEXT", string3.concat("\nhttps://c85vz.app.goo.gl/eJMg"));
                                intent4.setType("text/plain");
                                context.startActivity(Intent.createChooser(intent4, context.getString(R.string.share_lingodeer)));
                                b7.e0.A(context.m(), "jxz_me_about_ld_share_us");
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
                final int i14 = 2;
                objQ2 = new a(this) { // from class: bp.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AboutLingodeerActivity f4474b;

                    {
                        this.f4474b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i15 = i14;
                        qy.b0 b0Var = qy.b0.f48488a;
                        AboutLingodeerActivity context = this.f4474b;
                        switch (i15) {
                            case 0:
                                int i16 = AboutLingodeerActivity.f22038t;
                                context.finish();
                                break;
                            case 1:
                                int i17 = AboutLingodeerActivity.f22038t;
                                String url = "https://www." + FirebaseRemoteConfig.d().f("end_point") + "/privacypolicy-html";
                                kotlin.jvm.internal.m.f(context, "context");
                                kotlin.jvm.internal.m.f(url, "url");
                                Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent.putExtra(INTENTS.EXTRA_STRING, url);
                                intent.putExtra(INTENTS.EXTRA_STRING_2, "Privacy Policy");
                                context.startActivity(intent);
                                break;
                            case 2:
                                int i18 = AboutLingodeerActivity.f22038t;
                                context.m().c("jxz_click_whatsnew", new androidx.lifecycle.j(13));
                                f10.e.b().f(new np.b(17));
                                String strF = FirebaseRemoteConfig.d().f("what_s_new_url");
                                String string = context.getString(R.string.what_s_new);
                                kotlin.jvm.internal.m.e(string, "getString(...)");
                                Intent intent2 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent2.putExtra(INTENTS.EXTRA_STRING, strF);
                                intent2.putExtra(INTENTS.EXTRA_STRING_2, string);
                                context.startActivity(intent2);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(14));
                                break;
                            case 3:
                                int i19 = AboutLingodeerActivity.f22038t;
                                String url2 = ep.a.g("https://blog.", FirebaseRemoteConfig.d().f("end_point"), "/");
                                String string2 = context.getString(R.string.our_blog);
                                kotlin.jvm.internal.m.e(string2, "getString(...)");
                                kotlin.jvm.internal.m.f(url2, "url");
                                Intent intent3 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent3.putExtra(INTENTS.EXTRA_STRING, url2);
                                intent3.putExtra(INTENTS.EXTRA_STRING_2, string2);
                                context.startActivity(intent3);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(11));
                                break;
                            case 4:
                                int i110 = AboutLingodeerActivity.f22038t;
                                context.startActivity(new Intent(context, (Class<?>) MethodologyActivity.class));
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(17));
                                break;
                            case 5:
                                int i21 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/lingodeer/")));
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(12));
                                break;
                            case 6:
                                int i22 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/lingodeerapp/")));
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(16));
                                break;
                            case 7:
                                int i23 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.twitter.com/lingodeer/")));
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(10));
                                break;
                            case 8:
                                int i24 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.reddit.com/r/lingodeer/")));
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(15));
                                break;
                            default:
                                int i25 = AboutLingodeerActivity.f22038t;
                                int[] iArr = bq.r.f4959a;
                                String string3 = context.getString(R.string.twitter_share_app_prefix, bq.m.s(context, ((fr.o0) context.l()).f27733a.keyLanguage));
                                kotlin.jvm.internal.m.e(string3, "getString(...)");
                                Intent intent4 = new Intent();
                                intent4.setAction("android.intent.action.SEND");
                                intent4.putExtra("android.intent.extra.TEXT", string3.concat("\nhttps://c85vz.app.goo.gl/eJMg"));
                                intent4.setType("text/plain");
                                context.startActivity(Intent.createChooser(intent4, context.getString(R.string.share_lingodeer)));
                                b7.e0.A(context.m(), "jxz_me_about_ld_share_us");
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ2);
            }
            a aVar2 = (a) objQ2;
            boolean zH3 = sVar.h(this);
            Object objQ3 = sVar.Q();
            if (zH3 || objQ3 == gVar) {
                final int i15 = 3;
                objQ3 = new a(this) { // from class: bp.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AboutLingodeerActivity f4474b;

                    {
                        this.f4474b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i16 = i15;
                        qy.b0 b0Var = qy.b0.f48488a;
                        AboutLingodeerActivity context = this.f4474b;
                        switch (i16) {
                            case 0:
                                int i17 = AboutLingodeerActivity.f22038t;
                                context.finish();
                                break;
                            case 1:
                                int i18 = AboutLingodeerActivity.f22038t;
                                String url = "https://www." + FirebaseRemoteConfig.d().f("end_point") + "/privacypolicy-html";
                                kotlin.jvm.internal.m.f(context, "context");
                                kotlin.jvm.internal.m.f(url, "url");
                                Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent.putExtra(INTENTS.EXTRA_STRING, url);
                                intent.putExtra(INTENTS.EXTRA_STRING_2, "Privacy Policy");
                                context.startActivity(intent);
                                break;
                            case 2:
                                int i19 = AboutLingodeerActivity.f22038t;
                                context.m().c("jxz_click_whatsnew", new androidx.lifecycle.j(13));
                                f10.e.b().f(new np.b(17));
                                String strF = FirebaseRemoteConfig.d().f("what_s_new_url");
                                String string = context.getString(R.string.what_s_new);
                                kotlin.jvm.internal.m.e(string, "getString(...)");
                                Intent intent2 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent2.putExtra(INTENTS.EXTRA_STRING, strF);
                                intent2.putExtra(INTENTS.EXTRA_STRING_2, string);
                                context.startActivity(intent2);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(14));
                                break;
                            case 3:
                                int i110 = AboutLingodeerActivity.f22038t;
                                String url2 = ep.a.g("https://blog.", FirebaseRemoteConfig.d().f("end_point"), "/");
                                String string2 = context.getString(R.string.our_blog);
                                kotlin.jvm.internal.m.e(string2, "getString(...)");
                                kotlin.jvm.internal.m.f(url2, "url");
                                Intent intent3 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent3.putExtra(INTENTS.EXTRA_STRING, url2);
                                intent3.putExtra(INTENTS.EXTRA_STRING_2, string2);
                                context.startActivity(intent3);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(11));
                                break;
                            case 4:
                                int i111 = AboutLingodeerActivity.f22038t;
                                context.startActivity(new Intent(context, (Class<?>) MethodologyActivity.class));
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(17));
                                break;
                            case 5:
                                int i21 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/lingodeer/")));
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(12));
                                break;
                            case 6:
                                int i22 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/lingodeerapp/")));
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(16));
                                break;
                            case 7:
                                int i23 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.twitter.com/lingodeer/")));
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(10));
                                break;
                            case 8:
                                int i24 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.reddit.com/r/lingodeer/")));
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(15));
                                break;
                            default:
                                int i25 = AboutLingodeerActivity.f22038t;
                                int[] iArr = bq.r.f4959a;
                                String string3 = context.getString(R.string.twitter_share_app_prefix, bq.m.s(context, ((fr.o0) context.l()).f27733a.keyLanguage));
                                kotlin.jvm.internal.m.e(string3, "getString(...)");
                                Intent intent4 = new Intent();
                                intent4.setAction("android.intent.action.SEND");
                                intent4.putExtra("android.intent.extra.TEXT", string3.concat("\nhttps://c85vz.app.goo.gl/eJMg"));
                                intent4.setType("text/plain");
                                context.startActivity(Intent.createChooser(intent4, context.getString(R.string.share_lingodeer)));
                                b7.e0.A(context.m(), "jxz_me_about_ld_share_us");
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ3);
            }
            a aVar3 = (a) objQ3;
            boolean zH4 = sVar.h(this);
            Object objQ4 = sVar.Q();
            if (zH4 || objQ4 == gVar) {
                final int i16 = 4;
                objQ4 = new a(this) { // from class: bp.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AboutLingodeerActivity f4474b;

                    {
                        this.f4474b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i17 = i16;
                        qy.b0 b0Var = qy.b0.f48488a;
                        AboutLingodeerActivity context = this.f4474b;
                        switch (i17) {
                            case 0:
                                int i18 = AboutLingodeerActivity.f22038t;
                                context.finish();
                                break;
                            case 1:
                                int i19 = AboutLingodeerActivity.f22038t;
                                String url = "https://www." + FirebaseRemoteConfig.d().f("end_point") + "/privacypolicy-html";
                                kotlin.jvm.internal.m.f(context, "context");
                                kotlin.jvm.internal.m.f(url, "url");
                                Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent.putExtra(INTENTS.EXTRA_STRING, url);
                                intent.putExtra(INTENTS.EXTRA_STRING_2, "Privacy Policy");
                                context.startActivity(intent);
                                break;
                            case 2:
                                int i110 = AboutLingodeerActivity.f22038t;
                                context.m().c("jxz_click_whatsnew", new androidx.lifecycle.j(13));
                                f10.e.b().f(new np.b(17));
                                String strF = FirebaseRemoteConfig.d().f("what_s_new_url");
                                String string = context.getString(R.string.what_s_new);
                                kotlin.jvm.internal.m.e(string, "getString(...)");
                                Intent intent2 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent2.putExtra(INTENTS.EXTRA_STRING, strF);
                                intent2.putExtra(INTENTS.EXTRA_STRING_2, string);
                                context.startActivity(intent2);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(14));
                                break;
                            case 3:
                                int i111 = AboutLingodeerActivity.f22038t;
                                String url2 = ep.a.g("https://blog.", FirebaseRemoteConfig.d().f("end_point"), "/");
                                String string2 = context.getString(R.string.our_blog);
                                kotlin.jvm.internal.m.e(string2, "getString(...)");
                                kotlin.jvm.internal.m.f(url2, "url");
                                Intent intent3 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent3.putExtra(INTENTS.EXTRA_STRING, url2);
                                intent3.putExtra(INTENTS.EXTRA_STRING_2, string2);
                                context.startActivity(intent3);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(11));
                                break;
                            case 4:
                                int i112 = AboutLingodeerActivity.f22038t;
                                context.startActivity(new Intent(context, (Class<?>) MethodologyActivity.class));
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(17));
                                break;
                            case 5:
                                int i21 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/lingodeer/")));
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(12));
                                break;
                            case 6:
                                int i22 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/lingodeerapp/")));
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(16));
                                break;
                            case 7:
                                int i23 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.twitter.com/lingodeer/")));
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(10));
                                break;
                            case 8:
                                int i24 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.reddit.com/r/lingodeer/")));
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(15));
                                break;
                            default:
                                int i25 = AboutLingodeerActivity.f22038t;
                                int[] iArr = bq.r.f4959a;
                                String string3 = context.getString(R.string.twitter_share_app_prefix, bq.m.s(context, ((fr.o0) context.l()).f27733a.keyLanguage));
                                kotlin.jvm.internal.m.e(string3, "getString(...)");
                                Intent intent4 = new Intent();
                                intent4.setAction("android.intent.action.SEND");
                                intent4.putExtra("android.intent.extra.TEXT", string3.concat("\nhttps://c85vz.app.goo.gl/eJMg"));
                                intent4.setType("text/plain");
                                context.startActivity(Intent.createChooser(intent4, context.getString(R.string.share_lingodeer)));
                                b7.e0.A(context.m(), "jxz_me_about_ld_share_us");
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ4);
            }
            a aVar4 = (a) objQ4;
            boolean zH5 = sVar.h(this);
            Object objQ5 = sVar.Q();
            if (zH5 || objQ5 == gVar) {
                final int i17 = 5;
                objQ5 = new a(this) { // from class: bp.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AboutLingodeerActivity f4474b;

                    {
                        this.f4474b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i18 = i17;
                        qy.b0 b0Var = qy.b0.f48488a;
                        AboutLingodeerActivity context = this.f4474b;
                        switch (i18) {
                            case 0:
                                int i19 = AboutLingodeerActivity.f22038t;
                                context.finish();
                                break;
                            case 1:
                                int i110 = AboutLingodeerActivity.f22038t;
                                String url = "https://www." + FirebaseRemoteConfig.d().f("end_point") + "/privacypolicy-html";
                                kotlin.jvm.internal.m.f(context, "context");
                                kotlin.jvm.internal.m.f(url, "url");
                                Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent.putExtra(INTENTS.EXTRA_STRING, url);
                                intent.putExtra(INTENTS.EXTRA_STRING_2, "Privacy Policy");
                                context.startActivity(intent);
                                break;
                            case 2:
                                int i111 = AboutLingodeerActivity.f22038t;
                                context.m().c("jxz_click_whatsnew", new androidx.lifecycle.j(13));
                                f10.e.b().f(new np.b(17));
                                String strF = FirebaseRemoteConfig.d().f("what_s_new_url");
                                String string = context.getString(R.string.what_s_new);
                                kotlin.jvm.internal.m.e(string, "getString(...)");
                                Intent intent2 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent2.putExtra(INTENTS.EXTRA_STRING, strF);
                                intent2.putExtra(INTENTS.EXTRA_STRING_2, string);
                                context.startActivity(intent2);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(14));
                                break;
                            case 3:
                                int i112 = AboutLingodeerActivity.f22038t;
                                String url2 = ep.a.g("https://blog.", FirebaseRemoteConfig.d().f("end_point"), "/");
                                String string2 = context.getString(R.string.our_blog);
                                kotlin.jvm.internal.m.e(string2, "getString(...)");
                                kotlin.jvm.internal.m.f(url2, "url");
                                Intent intent3 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent3.putExtra(INTENTS.EXTRA_STRING, url2);
                                intent3.putExtra(INTENTS.EXTRA_STRING_2, string2);
                                context.startActivity(intent3);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(11));
                                break;
                            case 4:
                                int i113 = AboutLingodeerActivity.f22038t;
                                context.startActivity(new Intent(context, (Class<?>) MethodologyActivity.class));
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(17));
                                break;
                            case 5:
                                int i21 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/lingodeer/")));
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(12));
                                break;
                            case 6:
                                int i22 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/lingodeerapp/")));
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(16));
                                break;
                            case 7:
                                int i23 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.twitter.com/lingodeer/")));
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(10));
                                break;
                            case 8:
                                int i24 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.reddit.com/r/lingodeer/")));
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(15));
                                break;
                            default:
                                int i25 = AboutLingodeerActivity.f22038t;
                                int[] iArr = bq.r.f4959a;
                                String string3 = context.getString(R.string.twitter_share_app_prefix, bq.m.s(context, ((fr.o0) context.l()).f27733a.keyLanguage));
                                kotlin.jvm.internal.m.e(string3, "getString(...)");
                                Intent intent4 = new Intent();
                                intent4.setAction("android.intent.action.SEND");
                                intent4.putExtra("android.intent.extra.TEXT", string3.concat("\nhttps://c85vz.app.goo.gl/eJMg"));
                                intent4.setType("text/plain");
                                context.startActivity(Intent.createChooser(intent4, context.getString(R.string.share_lingodeer)));
                                b7.e0.A(context.m(), "jxz_me_about_ld_share_us");
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ5);
            }
            a aVar5 = (a) objQ5;
            boolean zH6 = sVar.h(this);
            Object objQ6 = sVar.Q();
            if (zH6 || objQ6 == gVar) {
                final int i18 = 6;
                objQ6 = new a(this) { // from class: bp.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AboutLingodeerActivity f4474b;

                    {
                        this.f4474b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i19 = i18;
                        qy.b0 b0Var = qy.b0.f48488a;
                        AboutLingodeerActivity context = this.f4474b;
                        switch (i19) {
                            case 0:
                                int i110 = AboutLingodeerActivity.f22038t;
                                context.finish();
                                break;
                            case 1:
                                int i111 = AboutLingodeerActivity.f22038t;
                                String url = "https://www." + FirebaseRemoteConfig.d().f("end_point") + "/privacypolicy-html";
                                kotlin.jvm.internal.m.f(context, "context");
                                kotlin.jvm.internal.m.f(url, "url");
                                Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent.putExtra(INTENTS.EXTRA_STRING, url);
                                intent.putExtra(INTENTS.EXTRA_STRING_2, "Privacy Policy");
                                context.startActivity(intent);
                                break;
                            case 2:
                                int i112 = AboutLingodeerActivity.f22038t;
                                context.m().c("jxz_click_whatsnew", new androidx.lifecycle.j(13));
                                f10.e.b().f(new np.b(17));
                                String strF = FirebaseRemoteConfig.d().f("what_s_new_url");
                                String string = context.getString(R.string.what_s_new);
                                kotlin.jvm.internal.m.e(string, "getString(...)");
                                Intent intent2 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent2.putExtra(INTENTS.EXTRA_STRING, strF);
                                intent2.putExtra(INTENTS.EXTRA_STRING_2, string);
                                context.startActivity(intent2);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(14));
                                break;
                            case 3:
                                int i113 = AboutLingodeerActivity.f22038t;
                                String url2 = ep.a.g("https://blog.", FirebaseRemoteConfig.d().f("end_point"), "/");
                                String string2 = context.getString(R.string.our_blog);
                                kotlin.jvm.internal.m.e(string2, "getString(...)");
                                kotlin.jvm.internal.m.f(url2, "url");
                                Intent intent3 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent3.putExtra(INTENTS.EXTRA_STRING, url2);
                                intent3.putExtra(INTENTS.EXTRA_STRING_2, string2);
                                context.startActivity(intent3);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(11));
                                break;
                            case 4:
                                int i114 = AboutLingodeerActivity.f22038t;
                                context.startActivity(new Intent(context, (Class<?>) MethodologyActivity.class));
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(17));
                                break;
                            case 5:
                                int i21 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/lingodeer/")));
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(12));
                                break;
                            case 6:
                                int i22 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/lingodeerapp/")));
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(16));
                                break;
                            case 7:
                                int i23 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.twitter.com/lingodeer/")));
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(10));
                                break;
                            case 8:
                                int i24 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.reddit.com/r/lingodeer/")));
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(15));
                                break;
                            default:
                                int i25 = AboutLingodeerActivity.f22038t;
                                int[] iArr = bq.r.f4959a;
                                String string3 = context.getString(R.string.twitter_share_app_prefix, bq.m.s(context, ((fr.o0) context.l()).f27733a.keyLanguage));
                                kotlin.jvm.internal.m.e(string3, "getString(...)");
                                Intent intent4 = new Intent();
                                intent4.setAction("android.intent.action.SEND");
                                intent4.putExtra("android.intent.extra.TEXT", string3.concat("\nhttps://c85vz.app.goo.gl/eJMg"));
                                intent4.setType("text/plain");
                                context.startActivity(Intent.createChooser(intent4, context.getString(R.string.share_lingodeer)));
                                b7.e0.A(context.m(), "jxz_me_about_ld_share_us");
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ6);
            }
            a aVar6 = (a) objQ6;
            boolean zH7 = sVar.h(this);
            Object objQ7 = sVar.Q();
            if (zH7 || objQ7 == gVar) {
                final int i19 = 7;
                objQ7 = new a(this) { // from class: bp.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AboutLingodeerActivity f4474b;

                    {
                        this.f4474b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i110 = i19;
                        qy.b0 b0Var = qy.b0.f48488a;
                        AboutLingodeerActivity context = this.f4474b;
                        switch (i110) {
                            case 0:
                                int i111 = AboutLingodeerActivity.f22038t;
                                context.finish();
                                break;
                            case 1:
                                int i112 = AboutLingodeerActivity.f22038t;
                                String url = "https://www." + FirebaseRemoteConfig.d().f("end_point") + "/privacypolicy-html";
                                kotlin.jvm.internal.m.f(context, "context");
                                kotlin.jvm.internal.m.f(url, "url");
                                Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent.putExtra(INTENTS.EXTRA_STRING, url);
                                intent.putExtra(INTENTS.EXTRA_STRING_2, "Privacy Policy");
                                context.startActivity(intent);
                                break;
                            case 2:
                                int i113 = AboutLingodeerActivity.f22038t;
                                context.m().c("jxz_click_whatsnew", new androidx.lifecycle.j(13));
                                f10.e.b().f(new np.b(17));
                                String strF = FirebaseRemoteConfig.d().f("what_s_new_url");
                                String string = context.getString(R.string.what_s_new);
                                kotlin.jvm.internal.m.e(string, "getString(...)");
                                Intent intent2 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent2.putExtra(INTENTS.EXTRA_STRING, strF);
                                intent2.putExtra(INTENTS.EXTRA_STRING_2, string);
                                context.startActivity(intent2);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(14));
                                break;
                            case 3:
                                int i114 = AboutLingodeerActivity.f22038t;
                                String url2 = ep.a.g("https://blog.", FirebaseRemoteConfig.d().f("end_point"), "/");
                                String string2 = context.getString(R.string.our_blog);
                                kotlin.jvm.internal.m.e(string2, "getString(...)");
                                kotlin.jvm.internal.m.f(url2, "url");
                                Intent intent3 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent3.putExtra(INTENTS.EXTRA_STRING, url2);
                                intent3.putExtra(INTENTS.EXTRA_STRING_2, string2);
                                context.startActivity(intent3);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(11));
                                break;
                            case 4:
                                int i115 = AboutLingodeerActivity.f22038t;
                                context.startActivity(new Intent(context, (Class<?>) MethodologyActivity.class));
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(17));
                                break;
                            case 5:
                                int i21 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/lingodeer/")));
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(12));
                                break;
                            case 6:
                                int i22 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/lingodeerapp/")));
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(16));
                                break;
                            case 7:
                                int i23 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.twitter.com/lingodeer/")));
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(10));
                                break;
                            case 8:
                                int i24 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.reddit.com/r/lingodeer/")));
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(15));
                                break;
                            default:
                                int i25 = AboutLingodeerActivity.f22038t;
                                int[] iArr = bq.r.f4959a;
                                String string3 = context.getString(R.string.twitter_share_app_prefix, bq.m.s(context, ((fr.o0) context.l()).f27733a.keyLanguage));
                                kotlin.jvm.internal.m.e(string3, "getString(...)");
                                Intent intent4 = new Intent();
                                intent4.setAction("android.intent.action.SEND");
                                intent4.putExtra("android.intent.extra.TEXT", string3.concat("\nhttps://c85vz.app.goo.gl/eJMg"));
                                intent4.setType("text/plain");
                                context.startActivity(Intent.createChooser(intent4, context.getString(R.string.share_lingodeer)));
                                b7.e0.A(context.m(), "jxz_me_about_ld_share_us");
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ7);
            }
            a aVar7 = (a) objQ7;
            boolean zH8 = sVar.h(this);
            Object objQ8 = sVar.Q();
            if (zH8 || objQ8 == gVar) {
                final int i21 = 8;
                objQ8 = new a(this) { // from class: bp.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AboutLingodeerActivity f4474b;

                    {
                        this.f4474b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i110 = i21;
                        qy.b0 b0Var = qy.b0.f48488a;
                        AboutLingodeerActivity context = this.f4474b;
                        switch (i110) {
                            case 0:
                                int i111 = AboutLingodeerActivity.f22038t;
                                context.finish();
                                break;
                            case 1:
                                int i112 = AboutLingodeerActivity.f22038t;
                                String url = "https://www." + FirebaseRemoteConfig.d().f("end_point") + "/privacypolicy-html";
                                kotlin.jvm.internal.m.f(context, "context");
                                kotlin.jvm.internal.m.f(url, "url");
                                Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent.putExtra(INTENTS.EXTRA_STRING, url);
                                intent.putExtra(INTENTS.EXTRA_STRING_2, "Privacy Policy");
                                context.startActivity(intent);
                                break;
                            case 2:
                                int i113 = AboutLingodeerActivity.f22038t;
                                context.m().c("jxz_click_whatsnew", new androidx.lifecycle.j(13));
                                f10.e.b().f(new np.b(17));
                                String strF = FirebaseRemoteConfig.d().f("what_s_new_url");
                                String string = context.getString(R.string.what_s_new);
                                kotlin.jvm.internal.m.e(string, "getString(...)");
                                Intent intent2 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent2.putExtra(INTENTS.EXTRA_STRING, strF);
                                intent2.putExtra(INTENTS.EXTRA_STRING_2, string);
                                context.startActivity(intent2);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(14));
                                break;
                            case 3:
                                int i114 = AboutLingodeerActivity.f22038t;
                                String url2 = ep.a.g("https://blog.", FirebaseRemoteConfig.d().f("end_point"), "/");
                                String string2 = context.getString(R.string.our_blog);
                                kotlin.jvm.internal.m.e(string2, "getString(...)");
                                kotlin.jvm.internal.m.f(url2, "url");
                                Intent intent3 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent3.putExtra(INTENTS.EXTRA_STRING, url2);
                                intent3.putExtra(INTENTS.EXTRA_STRING_2, string2);
                                context.startActivity(intent3);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(11));
                                break;
                            case 4:
                                int i115 = AboutLingodeerActivity.f22038t;
                                context.startActivity(new Intent(context, (Class<?>) MethodologyActivity.class));
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(17));
                                break;
                            case 5:
                                int i22 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/lingodeer/")));
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(12));
                                break;
                            case 6:
                                int i23 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/lingodeerapp/")));
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(16));
                                break;
                            case 7:
                                int i24 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.twitter.com/lingodeer/")));
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(10));
                                break;
                            case 8:
                                int i25 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.reddit.com/r/lingodeer/")));
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(15));
                                break;
                            default:
                                int i26 = AboutLingodeerActivity.f22038t;
                                int[] iArr = bq.r.f4959a;
                                String string3 = context.getString(R.string.twitter_share_app_prefix, bq.m.s(context, ((fr.o0) context.l()).f27733a.keyLanguage));
                                kotlin.jvm.internal.m.e(string3, "getString(...)");
                                Intent intent4 = new Intent();
                                intent4.setAction("android.intent.action.SEND");
                                intent4.putExtra("android.intent.extra.TEXT", string3.concat("\nhttps://c85vz.app.goo.gl/eJMg"));
                                intent4.setType("text/plain");
                                context.startActivity(Intent.createChooser(intent4, context.getString(R.string.share_lingodeer)));
                                b7.e0.A(context.m(), "jxz_me_about_ld_share_us");
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ8);
            }
            a aVar8 = (a) objQ8;
            boolean zH9 = sVar.h(this);
            Object objQ9 = sVar.Q();
            if (zH9 || objQ9 == gVar) {
                final int i22 = 9;
                objQ9 = new a(this) { // from class: bp.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AboutLingodeerActivity f4474b;

                    {
                        this.f4474b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i110 = i22;
                        qy.b0 b0Var = qy.b0.f48488a;
                        AboutLingodeerActivity context = this.f4474b;
                        switch (i110) {
                            case 0:
                                int i111 = AboutLingodeerActivity.f22038t;
                                context.finish();
                                break;
                            case 1:
                                int i112 = AboutLingodeerActivity.f22038t;
                                String url = "https://www." + FirebaseRemoteConfig.d().f("end_point") + "/privacypolicy-html";
                                kotlin.jvm.internal.m.f(context, "context");
                                kotlin.jvm.internal.m.f(url, "url");
                                Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent.putExtra(INTENTS.EXTRA_STRING, url);
                                intent.putExtra(INTENTS.EXTRA_STRING_2, "Privacy Policy");
                                context.startActivity(intent);
                                break;
                            case 2:
                                int i113 = AboutLingodeerActivity.f22038t;
                                context.m().c("jxz_click_whatsnew", new androidx.lifecycle.j(13));
                                f10.e.b().f(new np.b(17));
                                String strF = FirebaseRemoteConfig.d().f("what_s_new_url");
                                String string = context.getString(R.string.what_s_new);
                                kotlin.jvm.internal.m.e(string, "getString(...)");
                                Intent intent2 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent2.putExtra(INTENTS.EXTRA_STRING, strF);
                                intent2.putExtra(INTENTS.EXTRA_STRING_2, string);
                                context.startActivity(intent2);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(14));
                                break;
                            case 3:
                                int i114 = AboutLingodeerActivity.f22038t;
                                String url2 = ep.a.g("https://blog.", FirebaseRemoteConfig.d().f("end_point"), "/");
                                String string2 = context.getString(R.string.our_blog);
                                kotlin.jvm.internal.m.e(string2, "getString(...)");
                                kotlin.jvm.internal.m.f(url2, "url");
                                Intent intent3 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent3.putExtra(INTENTS.EXTRA_STRING, url2);
                                intent3.putExtra(INTENTS.EXTRA_STRING_2, string2);
                                context.startActivity(intent3);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(11));
                                break;
                            case 4:
                                int i115 = AboutLingodeerActivity.f22038t;
                                context.startActivity(new Intent(context, (Class<?>) MethodologyActivity.class));
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(17));
                                break;
                            case 5:
                                int i23 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/lingodeer/")));
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(12));
                                break;
                            case 6:
                                int i24 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/lingodeerapp/")));
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(16));
                                break;
                            case 7:
                                int i25 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.twitter.com/lingodeer/")));
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(10));
                                break;
                            case 8:
                                int i26 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.reddit.com/r/lingodeer/")));
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(15));
                                break;
                            default:
                                int i27 = AboutLingodeerActivity.f22038t;
                                int[] iArr = bq.r.f4959a;
                                String string3 = context.getString(R.string.twitter_share_app_prefix, bq.m.s(context, ((fr.o0) context.l()).f27733a.keyLanguage));
                                kotlin.jvm.internal.m.e(string3, "getString(...)");
                                Intent intent4 = new Intent();
                                intent4.setAction("android.intent.action.SEND");
                                intent4.putExtra("android.intent.extra.TEXT", string3.concat("\nhttps://c85vz.app.goo.gl/eJMg"));
                                intent4.setType("text/plain");
                                context.startActivity(Intent.createChooser(intent4, context.getString(R.string.share_lingodeer)));
                                b7.e0.A(context.m(), "jxz_me_about_ld_share_us");
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ9);
            }
            a aVar9 = (a) objQ9;
            boolean zH10 = sVar.h(this);
            Object objQ10 = sVar.Q();
            if (zH10 || objQ10 == gVar) {
                final int i23 = 1;
                objQ10 = new a(this) { // from class: bp.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AboutLingodeerActivity f4474b;

                    {
                        this.f4474b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        int i110 = i23;
                        qy.b0 b0Var = qy.b0.f48488a;
                        AboutLingodeerActivity context = this.f4474b;
                        switch (i110) {
                            case 0:
                                int i111 = AboutLingodeerActivity.f22038t;
                                context.finish();
                                break;
                            case 1:
                                int i112 = AboutLingodeerActivity.f22038t;
                                String url = "https://www." + FirebaseRemoteConfig.d().f("end_point") + "/privacypolicy-html";
                                kotlin.jvm.internal.m.f(context, "context");
                                kotlin.jvm.internal.m.f(url, "url");
                                Intent intent = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent.putExtra(INTENTS.EXTRA_STRING, url);
                                intent.putExtra(INTENTS.EXTRA_STRING_2, "Privacy Policy");
                                context.startActivity(intent);
                                break;
                            case 2:
                                int i113 = AboutLingodeerActivity.f22038t;
                                context.m().c("jxz_click_whatsnew", new androidx.lifecycle.j(13));
                                f10.e.b().f(new np.b(17));
                                String strF = FirebaseRemoteConfig.d().f("what_s_new_url");
                                String string = context.getString(R.string.what_s_new);
                                kotlin.jvm.internal.m.e(string, "getString(...)");
                                Intent intent2 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent2.putExtra(INTENTS.EXTRA_STRING, strF);
                                intent2.putExtra(INTENTS.EXTRA_STRING_2, string);
                                context.startActivity(intent2);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(14));
                                break;
                            case 3:
                                int i114 = AboutLingodeerActivity.f22038t;
                                String url2 = ep.a.g("https://blog.", FirebaseRemoteConfig.d().f("end_point"), "/");
                                String string2 = context.getString(R.string.our_blog);
                                kotlin.jvm.internal.m.e(string2, "getString(...)");
                                kotlin.jvm.internal.m.f(url2, "url");
                                Intent intent3 = new Intent(context, (Class<?>) RemoteUrlActivity.class);
                                intent3.putExtra(INTENTS.EXTRA_STRING, url2);
                                intent3.putExtra(INTENTS.EXTRA_STRING_2, string2);
                                context.startActivity(intent3);
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(11));
                                break;
                            case 4:
                                int i115 = AboutLingodeerActivity.f22038t;
                                context.startActivity(new Intent(context, (Class<?>) MethodologyActivity.class));
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(17));
                                break;
                            case 5:
                                int i24 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/lingodeer/")));
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(12));
                                break;
                            case 6:
                                int i25 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/lingodeerapp/")));
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(16));
                                break;
                            case 7:
                                int i26 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.twitter.com/lingodeer/")));
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(10));
                                break;
                            case 8:
                                int i27 = AboutLingodeerActivity.f22038t;
                                try {
                                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.reddit.com/r/lingodeer/")));
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                                context.m().c("jxz_me_about_ld_pageclick", new androidx.lifecycle.j(15));
                                break;
                            default:
                                int i28 = AboutLingodeerActivity.f22038t;
                                int[] iArr = bq.r.f4959a;
                                String string3 = context.getString(R.string.twitter_share_app_prefix, bq.m.s(context, ((fr.o0) context.l()).f27733a.keyLanguage));
                                kotlin.jvm.internal.m.e(string3, "getString(...)");
                                Intent intent4 = new Intent();
                                intent4.setAction("android.intent.action.SEND");
                                intent4.putExtra("android.intent.extra.TEXT", string3.concat("\nhttps://c85vz.app.goo.gl/eJMg"));
                                intent4.setType("text/plain");
                                context.startActivity(Intent.createChooser(intent4, context.getString(R.string.share_lingodeer)));
                                b7.e0.A(context.m(), "jxz_me_about_ld_share_us");
                                break;
                        }
                        return b0Var;
                    }
                };
                sVar.o0(objQ10);
            }
            c.b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, (a) objQ10, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(this, i11, 2, bundle);
        }
    }
}
