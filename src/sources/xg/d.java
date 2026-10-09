package xg;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import bq.r;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.UrlAdditionalInfo;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.base.RemoteWhyLearnActivity;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import f.p;
import fr.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import jp.j1;
import kotlin.NoWhenBranchMatchedException;
import l.m;
import l1.n;
import oz.q;
import qp.o2;
import qy.b0;
import qy.j;
import qy.o;
import ry.l;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UrlAdditionalInfo f56059a = new UrlAdditionalInfo(null, null, null, null, null, null, null, null, null, null, false, false, 4095, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f56061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f56062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f56063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f56064f;

    public d() {
        j jVar = j.SYNCHRONIZED;
        this.f56061c = com.bumptech.glide.d.u(jVar, new c(this, 0));
        this.f56062d = com.bumptech.glide.d.u(jVar, new c(this, 1));
        this.f56063e = com.bumptech.glide.d.u(jVar, new c(this, 2));
        this.f56064f = com.bumptech.glide.d.u(jVar, new c(this, 3));
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        if (configuration != null) {
            int i11 = configuration.uiMode;
            configuration.setTo(getBaseContext().getResources().getConfiguration());
            configuration.uiMode = i11;
        }
        super.applyOverrideConfiguration(configuration);
    }

    @Override // l.m, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context newBase) {
        kotlin.jvm.internal.m.f(newBase, "newBase");
        try {
            int[] iArr = r.f4959a;
            bq.m.K();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        super.attachBaseContext(ob.f.Q(newBase, ((o0) l()).f27733a.locateLanguage, xt.b.m));
    }

    public abstract void j(Bundle bundle, n nVar, int i11);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final vt.c k() {
        return (vt.c) this.f56061c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final n0 l() {
        return (n0) this.f56064f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final ur.a m() {
        return (ur.a) this.f56063e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final wt.o0 n() {
        return (wt.o0) this.f56062d.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void o(Uri uri) {
        kotlin.jvm.internal.m.f(uri, "<this>");
        uri.toString();
        this.f56059a = new UrlAdditionalInfo(null, null, null, null, null, null, null, null, null, null, false, false, 4095, null);
        if (!l.D(new String[]{"www.lingodeer.com", "links.lingodeer.com"}, uri.getHost())) {
            return;
        }
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = BuildConfig.VERSION_NAME;
            if (!zHasNext) {
                if (this.f56060b && this.f56059a.getForbid_defer()) {
                    return;
                }
                String type = this.f56059a.getType();
                int iHashCode = type.hashCode();
                if (iHashCode == 117509) {
                    type.equals("wbp");
                    return;
                }
                if (iHashCode != 117588) {
                    if (iHashCode == 3433103 && type.equals("page")) {
                        String content = this.f56059a.getContent();
                        switch (content.hashCode()) {
                            case -1190599768:
                                if (content.equals("billing_intro")) {
                                    int[] iArr = r.f4959a;
                                    bq.m.C(this, Constants.DEEPLINK);
                                    return;
                                }
                                return;
                            case -933656819:
                                if (content.equals("why_learn")) {
                                    startActivity(new Intent(this, (Class<?>) RemoteWhyLearnActivity.class));
                                    return;
                                }
                                return;
                            case -109829509:
                                if (content.equals("billing")) {
                                    int[] iArr2 = r.f4959a;
                                    bq.m.C(this, Constants.DEEPLINK);
                                    return;
                                }
                                return;
                            case 113665:
                                content.equals("sbp");
                                return;
                            default:
                                return;
                        }
                    }
                    return;
                }
                if (type.equals("web")) {
                    Uri uri2 = Uri.parse(this.f56059a.getContent());
                    for (String str2 : uri2.getQueryParameterNames()) {
                        uri2.getQueryParameter(str2);
                        String queryParameter = uri2.getQueryParameter(str2);
                        if (queryParameter == null) {
                            queryParameter = BuildConfig.VERSION_NAME;
                        }
                        if (kotlin.jvm.internal.m.a(str2, "oib")) {
                            try {
                                this.f56059a.setOib(Boolean.parseBoolean(queryParameter));
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                        }
                    }
                    Uri.Builder builderClearQuery = uri2.buildUpon().clearQuery();
                    for (String str3 : uri2.getQueryParameterNames()) {
                        String queryParameter2 = uri2.getQueryParameter(str3);
                        if (!kotlin.jvm.internal.m.a(str3, "uid") || (queryParameter2 != null && queryParameter2.length() != 0)) {
                            builderClearQuery.appendQueryParameter(str3, queryParameter2);
                        }
                    }
                    if (uri2.getQueryParameterNames().contains("from_type")) {
                        uri2.buildUpon();
                    } else if (this.f56059a.getOib()) {
                        builderClearQuery.appendQueryParameter("from_type", "browser");
                    } else {
                        builderClearQuery.appendQueryParameter("from_type", "webview");
                    }
                    UrlAdditionalInfo urlAdditionalInfo = this.f56059a;
                    String string = builderClearQuery.toString();
                    kotlin.jvm.internal.m.e(string, "toString(...)");
                    urlAdditionalInfo.setContent(string);
                    int i11 = 0;
                    if (this.f56059a.getOptional_params().length() > 0) {
                        List listW0 = q.W0(this.f56059a.getOptional_params(), new String[]{","}, 0, 6);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listW0) {
                            if (((String) obj).length() > 0) {
                                arrayList.add(obj);
                            }
                        }
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            if (kotlin.jvm.internal.m.a((String) obj2, "uid") && !((o0) l()).f27733a.isUnloginUser()) {
                                builderClearQuery.appendQueryParameter("uid", ((o0) l()).w());
                            }
                        }
                    }
                    if (this.f56059a.getForce_params().length() > 0) {
                        List listW1 = q.W0(this.f56059a.getForce_params(), new String[]{","}, 0, 6);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : listW1) {
                            if (((String) obj3).length() > 0) {
                                arrayList2.add(obj3);
                            }
                        }
                        int size2 = arrayList2.size();
                        while (i11 < size2) {
                            Object obj4 = arrayList2.get(i11);
                            i11++;
                            if (kotlin.jvm.internal.m.a((String) obj4, "uid")) {
                                if (((o0) l()).f27733a.isUnloginUser()) {
                                    Intent intent = new Intent(this, (Class<?>) LoginActivity.class);
                                    intent.putExtra(INTENTS.EXTRA_INT, 11);
                                    startActivity(intent);
                                    return;
                                }
                                builderClearQuery.appendQueryParameter("uid", ((o0) l()).w());
                            }
                        }
                    }
                    Uri uriBuild = builderClearQuery.build();
                    boolean oib = this.f56059a.getOib();
                    if (oib) {
                        try {
                            startActivity(new Intent("android.intent.action.VIEW", uriBuild));
                            return;
                        } catch (Exception unused) {
                            String string2 = uriBuild.toString();
                            kotlin.jvm.internal.m.e(string2, "toString(...)");
                            String title = this.f56059a.getTitle();
                            kotlin.jvm.internal.m.f(title, "title");
                            Bundle bundle = new Bundle();
                            bundle.putString(INTENTS.EXTRA_STRING, string2);
                            bundle.putString(INTENTS.EXTRA_STRING_2, title);
                            j1 j1Var = new j1();
                            j1Var.setArguments(bundle);
                            j1Var.u(getSupportFragmentManager(), "RemoteUrlDialogFragment");
                            return;
                        }
                    }
                    if (oib) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String string3 = uriBuild.toString();
                    kotlin.jvm.internal.m.e(string3, "toString(...)");
                    String title2 = this.f56059a.getTitle();
                    kotlin.jvm.internal.m.f(title2, "title");
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(INTENTS.EXTRA_STRING, string3);
                    bundle2.putString(INTENTS.EXTRA_STRING_2, title2);
                    j1 j1Var2 = new j1();
                    j1Var2.setArguments(bundle2);
                    j1Var2.u(getSupportFragmentManager(), "RemoteUrlDialogFragment");
                    return;
                }
                return;
            }
            String next = it.next();
            uri.getQueryParameter(next);
            String queryParameter3 = uri.getQueryParameter(next);
            if (queryParameter3 != null) {
                str = queryParameter3;
            }
            if (next != null) {
                switch (next.hashCode()) {
                    case -896505829:
                        if (next.equals("source")) {
                            this.f56059a.setSource(str);
                        }
                        break;
                    case -265871547:
                        if (next.equals("optional_params")) {
                            this.f56059a.setOptional_params(str);
                        }
                        break;
                    case 110024:
                        if (next.equals("oib")) {
                            try {
                                this.f56059a.setOib(Boolean.parseBoolean(str));
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        }
                        break;
                    case 3059181:
                        if (next.equals("code")) {
                            this.f56059a.setCode(str);
                        }
                        break;
                    case 3433509:
                        if (next.equals("path")) {
                            this.f56059a.setPath(str);
                        }
                        break;
                    case 3575610:
                        if (next.equals("type")) {
                            this.f56059a.setType(str);
                        }
                        break;
                    case 110371416:
                        if (next.equals("title")) {
                            this.f56059a.setTitle(str);
                        }
                        break;
                    case 401594119:
                        if (next.equals("forbid_defer")) {
                            try {
                                this.f56059a.setForbid_defer(Boolean.parseBoolean(str));
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                        break;
                    case 554589530:
                        if (next.equals("force_params")) {
                            this.f56059a.setForce_params(str);
                        }
                        break;
                    case 951530617:
                        if (next.equals("content")) {
                            this.f56059a.setContent(str);
                        }
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.fragment.app.p0, f.n, n4.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object objL;
        try {
            Class<?> cls = Class.forName("android.animation.ValueAnimator");
            Class cls2 = Float.TYPE;
            kotlin.jvm.internal.m.c(cls2);
            cls.getMethod("setDurationScale", cls2).invoke(null, Float.valueOf(1.0f));
        } catch (Throwable th2) {
            try {
                th2.printStackTrace();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        try {
            Intent intent = getIntent();
            if (intent != null) {
                intent.getAction();
            }
            Intent intent2 = getIntent();
            Uri data = intent2 != null ? intent2.getData() : null;
            Objects.toString(data);
            if (data != null) {
                data.getHost();
                if (kotlin.jvm.internal.m.a(data.getHost(), "links.lingodeer.com")) {
                    LingoSkillApplication.f21668e = data;
                }
                if (!((o0) l()).f27733a.padStyle) {
                    try {
                        setRequestedOrientation(1);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    setRequestedOrientation(5);
                }
                p.b(this, null, 3);
                super.onCreate(bundle);
                g.g.a(this, new t1.d(new a(this, bundle, 0), true, -917337413));
            }
            String str = ((o0) l()).f27733a.installReferrer;
            if (str == null) {
                str = BuildConfig.VERSION_NAME;
            }
            if (str.length() == 0) {
                InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(this).build();
                installReferrerClientBuild.startConnection(new o2(9, installReferrerClientBuild, this));
            }
            objL = b0.f48488a;
        } catch (Throwable th3) {
            objL = com.bumptech.glide.e.l(th3);
        }
        Throwable thA = o.a(objL);
        if (thA != null) {
            thA.printStackTrace();
        }
        if (!((o0) l()).f27733a.padStyle) {
            setRequestedOrientation(1);
            setRequestedOrientation(5);
        }
        p.b(this, null, 3);
        super.onCreate(bundle);
        g.g.a(this, new t1.d(new a(this, bundle, 0), true, -917337413));
    }
}
