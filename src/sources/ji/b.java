package ji;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.k0;
import androidx.lifecycle.LifecycleOwnerKt;
import bq.r;
import cf.x;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingo.fluent.ui.base.PdGrammarActivity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.UrlAdditionalInfo;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.base.NewsFeedStringDetailActivity;
import com.lingo.lingoskill.ui.base.RemoteUrlActivity;
import com.lingo.lingoskill.ui.base.RemoteWhyLearnActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import f.p;
import fr.o0;
import hh.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import jp.j1;
import kotlin.NoWhenBranchMatchedException;
import l.m;
import n9.q;
import qy.b0;
import qy.j;
import qy.o;
import ry.l;
import rz.e0;
import vt.n0;
import z4.j0;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends m {
    public final Object H;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public boolean O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f36386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AudioManager f36389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ta.a f36390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f36391f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public UrlAdditionalInfo f36392t;

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, fz.c inflate) {
        kotlin.jvm.internal.m.f(inflate, "inflate");
        this.f36386a = inflate;
        this.f36387b = str;
        this.f36388c = getClass().getSimpleName();
        this.f36391f = new q(29, false);
        this.f36392t = new UrlAdditionalInfo(null, null, null, null, null, null, null, null, null, null, false, false, 4095, null);
        j jVar = j.SYNCHRONIZED;
        this.H = com.bumptech.glide.d.u(jVar, new a(0 == true ? 1 : 0, this));
        this.K = com.bumptech.glide.d.u(jVar, new a(1, this));
        this.L = com.bumptech.glide.d.u(jVar, new a(2, this));
        this.M = com.bumptech.glide.d.u(jVar, new a(3, this));
        this.N = com.bumptech.glide.d.u(jVar, new a(4, this));
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

    public final ta.a j() {
        ta.a aVar = this.f36390e;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.m.n("binding");
        throw null;
    }

    public final k0 k() {
        return getSupportFragmentManager().C(R.id.fl_container);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final n0 l() {
        return (n0) this.H.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final ur.a m() {
        return (ur.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final wt.o0 n() {
        return (wt.o0) this.K.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void o(String url) {
        String str;
        kotlin.jvm.internal.m.f(url, "url");
        Pattern patternCompile = Pattern.compile("([?&]title=[^&]*?)#");
        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(url).replaceAll("$1%23");
        kotlin.jvm.internal.m.e(strReplaceAll, "replaceAll(...)");
        this.f36392t = new UrlAdditionalInfo(null, null, null, null, null, null, null, null, null, null, false, false, 4095, null);
        Uri uri = Uri.parse(strReplaceAll);
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str2 = BuildConfig.VERSION_NAME;
            if (!zHasNext) {
                if (this.f36392t.getForbid_defer()) {
                    return;
                }
                String type = this.f36392t.getType();
                int iHashCode = type.hashCode();
                if (iHashCode == 117509) {
                    type.equals("wbp");
                    return;
                }
                int i11 = 0;
                if (iHashCode == 117588) {
                    if (type.equals("web") && this.f36392t.getContent().length() != 0) {
                        Uri uri2 = Uri.parse(this.f36392t.getContent());
                        for (String str3 : uri2.getQueryParameterNames()) {
                            uri2.getQueryParameter(str3);
                            String queryParameter = uri2.getQueryParameter(str3);
                            if (queryParameter == null) {
                                queryParameter = BuildConfig.VERSION_NAME;
                            }
                            if (kotlin.jvm.internal.m.a(str3, "oib")) {
                                try {
                                    this.f36392t.setOib(Boolean.parseBoolean(queryParameter));
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                            }
                        }
                        Uri.Builder builderClearQuery = uri2.buildUpon().clearQuery();
                        for (String str4 : uri2.getQueryParameterNames()) {
                            String queryParameter2 = uri2.getQueryParameter(str4);
                            if (!kotlin.jvm.internal.m.a(str4, "uid") || (queryParameter2 != null && queryParameter2.length() != 0)) {
                                builderClearQuery.appendQueryParameter(str4, queryParameter2);
                            }
                        }
                        if (uri2.getQueryParameterNames().contains("from_type")) {
                            uri2.buildUpon();
                        } else if (this.f36392t.getOib()) {
                            builderClearQuery.appendQueryParameter("from_type", "browser");
                        } else {
                            builderClearQuery.appendQueryParameter("from_type", "webview");
                        }
                        UrlAdditionalInfo urlAdditionalInfo = this.f36392t;
                        String string = builderClearQuery.build().toString();
                        kotlin.jvm.internal.m.e(string, "toString(...)");
                        urlAdditionalInfo.setContent(string);
                        if (this.f36392t.getOptional_params().length() > 0) {
                            List listW0 = oz.q.W0(this.f36392t.getOptional_params(), new String[]{","}, 0, 6);
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
                                if (kotlin.jvm.internal.m.a((String) obj2, "uid")) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    if (!kotlin.jvm.internal.m.a(x.n().accountType, "unlogin_user")) {
                                        String uid = x.n().uid;
                                        kotlin.jvm.internal.m.e(uid, "uid");
                                        builderClearQuery.appendQueryParameter("uid", uid);
                                    }
                                }
                            }
                        }
                        if (this.f36392t.getForce_params().length() > 0) {
                            List listW1 = oz.q.W0(this.f36392t.getForce_params(), new String[]{","}, 0, 6);
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
                                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                    if (kotlin.jvm.internal.m.a(x.n().accountType, "unlogin_user")) {
                                        Intent intent = new Intent(this, (Class<?>) LoginActivity.class);
                                        intent.putExtra(INTENTS.EXTRA_INT, 11);
                                        startActivity(intent);
                                        return;
                                    } else {
                                        String uid2 = x.n().uid;
                                        kotlin.jvm.internal.m.e(uid2, "uid");
                                        builderClearQuery.appendQueryParameter("uid", uid2);
                                    }
                                }
                            }
                        }
                        Uri uriBuild = builderClearQuery.build();
                        boolean oib = this.f36392t.getOib();
                        if (oib) {
                            try {
                                startActivity(new Intent("android.intent.action.VIEW", uriBuild));
                                return;
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                return;
                            }
                        }
                        if (oib) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!kotlin.jvm.internal.m.a(this.f36392t.getShow_type(), "present_half")) {
                            String string2 = uriBuild.toString();
                            kotlin.jvm.internal.m.e(string2, "toString(...)");
                            String title = this.f36392t.getTitle();
                            kotlin.jvm.internal.m.f(title, "title");
                            Intent intent2 = new Intent(this, (Class<?>) RemoteUrlActivity.class);
                            intent2.putExtra(INTENTS.EXTRA_STRING, string2);
                            intent2.putExtra(INTENTS.EXTRA_STRING_2, title);
                            startActivity(intent2);
                            return;
                        }
                        String string3 = uriBuild.toString();
                        kotlin.jvm.internal.m.e(string3, "toString(...)");
                        String title2 = this.f36392t.getTitle();
                        kotlin.jvm.internal.m.f(title2, "title");
                        Bundle bundle = new Bundle();
                        bundle.putString(INTENTS.EXTRA_STRING, string3);
                        bundle.putString(INTENTS.EXTRA_STRING_2, title2);
                        j1 j1Var = new j1();
                        j1Var.setArguments(bundle);
                        j1Var.u(getSupportFragmentManager(), "RemoteUrlDialogFragment");
                        return;
                    }
                    return;
                }
                if (iHashCode == 3433103 && type.equals("page")) {
                    if (kotlin.jvm.internal.m.a(this.f36392t.getContent(), "billing_intro")) {
                        int[] iArr = r.f4959a;
                        bq.m.C(this, "web");
                        return;
                    }
                    if (kotlin.jvm.internal.m.a(this.f36392t.getContent(), "billing")) {
                        int[] iArr2 = r.f4959a;
                        bq.m.C(this, "web");
                        return;
                    }
                    if (kotlin.jvm.internal.m.a(this.f36392t.getContent(), "sbp")) {
                        return;
                    }
                    if (kotlin.jvm.internal.m.a(this.f36392t.getContent(), "why_learn")) {
                        startActivity(new Intent(this, (Class<?>) RemoteWhyLearnActivity.class));
                        return;
                    }
                    if (kotlin.jvm.internal.m.a(this.f36392t.getContent(), "chat_in_messenger")) {
                        try {
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://m.me/lingodeer")));
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        m().c("jxz_contact_via_messenger", new y(12));
                        return;
                    }
                    if (kotlin.jvm.internal.m.a(this.f36392t.getContent(), "contact_us")) {
                        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new gp.a(this, null, 13), 3);
                        return;
                    }
                    if (!oz.x.s0(this.f36392t.getContent(), "show_choose_lan_", false)) {
                        String title3 = this.f36392t.getTitle();
                        String content = this.f36392t.getContent();
                        kotlin.jvm.internal.m.f(title3, "title");
                        kotlin.jvm.internal.m.f(content, "content");
                        Intent intent3 = new Intent(this, (Class<?>) NewsFeedStringDetailActivity.class);
                        intent3.putExtra(INTENTS.EXTRA_STRING, title3);
                        intent3.putExtra(INTENTS.EXTRA_STRING_2, content);
                        startActivity(intent3);
                        return;
                    }
                    int[] iArr3 = r.f4959a;
                    String strQ0 = oz.x.q0(this.f36392t.getContent(), "show_choose_lan_", BuildConfig.VERSION_NAME);
                    switch (strQ0.hashCode()) {
                        case -1298712590:
                            str = "enesup";
                            break;
                        case -1293618329:
                            str = "esusup";
                            break;
                        case -1265912699:
                            str = "frusup";
                            break;
                        case 3179:
                            str = "cn";
                            break;
                        case 3201:
                            str = "de";
                            break;
                        case 3241:
                            str = "en";
                            break;
                        case 3246:
                            str = "es";
                            break;
                        case 3276:
                            str = "fr";
                            break;
                        case 3371:
                            str = "it";
                            break;
                        case 3398:
                            str = "jp";
                            break;
                        case 3431:
                            str = "kr";
                            break;
                        case 3588:
                            str = "pt";
                            break;
                        case 3651:
                            str = "ru";
                            break;
                        case 3774:
                            str = "vt";
                            break;
                        case 96848:
                            str = "ara";
                            break;
                        case 102624:
                            str = "grk";
                            break;
                        case 104115:
                            str = "idn";
                            break;
                        case 107864:
                            str = "mal";
                            break;
                        case 111181:
                            str = "pol";
                            break;
                        case 114649:
                            str = "tch";
                            break;
                        case 115217:
                            str = "tur";
                            break;
                        case 115868:
                            str = "ukr";
                            break;
                        case 3058758:
                            str = "cnup";
                            break;
                        case 3079900:
                            str = "deup";
                            break;
                        case 3117847:
                            str = "enes";
                            break;
                        case 3123145:
                            str = "esup";
                            break;
                        case 3123148:
                            str = "esus";
                            break;
                        case 3151975:
                            str = "frup";
                            break;
                        case 3151978:
                            str = "frus";
                            break;
                        case 3202374:
                            str = "hidi";
                            break;
                        case 3243270:
                            str = "itup";
                            break;
                        case 3269217:
                            str = "jpup";
                            break;
                        case 3300930:
                            str = "krup";
                            break;
                        case 3451807:
                            str = "ptup";
                            break;
                        case 3512350:
                            str = "ruup";
                            break;
                        case 3558812:
                            str = "thai";
                            break;
                        case 93074667:
                            str = "araup";
                            break;
                        default:
                            return;
                    }
                    strQ0.equals(str);
                    return;
                }
                return;
            }
            String next = it.next();
            uri.getQueryParameter(next);
            String queryParameter3 = uri.getQueryParameter(next);
            if (queryParameter3 != null) {
                str2 = queryParameter3;
            }
            if (next != null) {
                switch (next.hashCode()) {
                    case -1903312068:
                        if (next.equals("show_type")) {
                            this.f36392t.setShow_type(str2);
                        }
                        break;
                    case -896505829:
                        if (next.equals("source")) {
                            this.f36392t.setSource(str2);
                        }
                        break;
                    case -407108748:
                        if (next.equals("contentId")) {
                            this.f36392t.setContentId(str2);
                        }
                        break;
                    case -265871547:
                        if (next.equals("optional_params")) {
                            this.f36392t.setOptional_params(str2);
                        }
                        break;
                    case 110024:
                        if (next.equals("oib")) {
                            try {
                                this.f36392t.setOib(Boolean.parseBoolean(str2));
                            } catch (Exception e12) {
                                e12.printStackTrace();
                            }
                        }
                        break;
                    case 3575610:
                        if (next.equals("type")) {
                            this.f36392t.setType(str2);
                        }
                        break;
                    case 110371416:
                        if (next.equals("title")) {
                            this.f36392t.setTitle(str2);
                        }
                        break;
                    case 401594119:
                        if (next.equals("forbid_defer")) {
                            try {
                                this.f36392t.setForbid_defer(Boolean.parseBoolean(str2));
                            } catch (Exception e13) {
                                e13.printStackTrace();
                            }
                        }
                        break;
                    case 554589530:
                        if (next.equals("force_params")) {
                            this.f36392t.setForce_params(str2);
                        }
                        break;
                    case 951530617:
                        if (next.equals("content")) {
                            this.f36392t.setContent(str2);
                        }
                        break;
                }
            }
        }
    }

    @Override // androidx.fragment.app.p0, f.n, n4.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        q();
        if (!((o0) l()).f27733a.padStyle) {
            try {
                setRequestedOrientation(1);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            setRequestedOrientation(5);
        }
        super.onCreate(bundle);
        p.b(this, p20.c.g(0, 0), 1);
        LayoutInflater layoutInflater = getLayoutInflater();
        kotlin.jvm.internal.m.e(layoutInflater, "getLayoutInflater(...)");
        ta.a aVar = (ta.a) this.f36386a.invoke(layoutInflater);
        kotlin.jvm.internal.m.f(aVar, "<set-?>");
        this.f36390e = aVar;
        setContentView(j().getRoot());
        View root = j().getRoot();
        kotlin.jvm.internal.m.e(root, "getRoot(...)");
        View viewFindViewById = root.findViewById(R.id.status_bar_view);
        if (viewFindViewById != null) {
            setWindowsTopInserts(viewFindViewById);
        } else {
            View viewFindViewById2 = root.findViewById(R.id.banner_view);
            if (viewFindViewById2 != null) {
                setWindowsTopInserts(viewFindViewById2);
            } else {
                View viewFindViewById3 = root.findViewById(R.id.toolbar);
                if (viewFindViewById3 != null) {
                    setWindowsTopInserts(viewFindViewById3);
                }
            }
        }
        if (root.findViewById(R.id.bnv) == null) {
            setWindowsBottomInserts(root);
        }
        r(bundle);
        Object systemService = getSystemService("audio");
        kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f36389d = (AudioManager) systemService;
        if (!t() || f10.e.b().e(this)) {
            return;
        }
        f10.e.b().j(this);
    }

    @Override // l.m, androidx.fragment.app.p0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (t() && f10.e.b().e(this)) {
            f10.e.b().l(this);
        }
        this.f36391f.f();
    }

    @Override // l.m, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent event) {
        kotlin.jvm.internal.m.f(event, "event");
        if (i11 == 24) {
            try {
                AudioManager audioManager = this.f36389d;
                if (audioManager != null) {
                    audioManager.adjustStreamVolume(3, 1, 5);
                }
                return true;
            } catch (Exception unused) {
                return super.onKeyDown(i11, event);
            }
        }
        if (i11 != 25) {
            return super.onKeyDown(i11, event);
        }
        try {
            AudioManager audioManager2 = this.f36389d;
            if (audioManager2 != null) {
                audioManager2.adjustStreamVolume(3, -1, 5);
            }
            return true;
        } catch (Exception unused2) {
            return super.onKeyDown(i11, event);
        }
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public void onResume() {
        super.onResume();
        String str = this.f36387b;
        if (str.length() > 0) {
            m().d(str);
        }
    }

    public void p(Uri uri) {
        LingoSkillApplication.f21668e = uri;
    }

    public void q() {
        Object objL;
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
                    p(data);
                    return;
                }
            } else {
                String str = ((o0) l()).f27733a.installReferrer;
                if (str == null) {
                    str = BuildConfig.VERSION_NAME;
                }
                if (str.length() == 0) {
                    InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(this).build();
                    installReferrerClientBuild.startConnection(new ob.c(15, installReferrerClientBuild, this));
                }
            }
            objL = b0.f48488a;
        } catch (Throwable th2) {
            objL = com.bumptech.glide.e.l(th2);
        }
        Throwable thA = o.a(objL);
        if (thA != null) {
            thA.printStackTrace();
        }
    }

    public abstract void r(Bundle bundle);

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void s(Uri uri) {
        uri.toString();
        this.f36392t = new UrlAdditionalInfo(null, null, null, null, null, null, null, null, null, null, false, false, 4095, null);
        if (!l.D(new String[]{"www.lingodeer.com", "links.lingodeer.com"}, uri.getHost())) {
            return;
        }
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = BuildConfig.VERSION_NAME;
            if (!zHasNext) {
                if (this.O && this.f36392t.getForbid_defer()) {
                    return;
                }
                String type = this.f36392t.getType();
                int iHashCode = type.hashCode();
                if (iHashCode == 117509) {
                    type.equals("wbp");
                    return;
                }
                if (iHashCode != 117588) {
                    if (iHashCode == 3433103 && type.equals("page")) {
                        String content = this.f36392t.getContent();
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
                    Uri uri2 = Uri.parse(this.f36392t.getContent());
                    for (String str2 : uri2.getQueryParameterNames()) {
                        uri2.getQueryParameter(str2);
                        String queryParameter = uri2.getQueryParameter(str2);
                        if (queryParameter == null) {
                            queryParameter = BuildConfig.VERSION_NAME;
                        }
                        if (kotlin.jvm.internal.m.a(str2, "oib")) {
                            try {
                                this.f36392t.setOib(Boolean.parseBoolean(queryParameter));
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
                    } else if (this.f36392t.getOib()) {
                        builderClearQuery.appendQueryParameter("from_type", "browser");
                    } else {
                        builderClearQuery.appendQueryParameter("from_type", "webview");
                    }
                    UrlAdditionalInfo urlAdditionalInfo = this.f36392t;
                    String string = builderClearQuery.toString();
                    kotlin.jvm.internal.m.e(string, "toString(...)");
                    urlAdditionalInfo.setContent(string);
                    int i11 = 0;
                    if (this.f36392t.getOptional_params().length() > 0) {
                        List listW0 = oz.q.W0(this.f36392t.getOptional_params(), new String[]{","}, 0, 6);
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
                            if (kotlin.jvm.internal.m.a((String) obj2, "uid")) {
                                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                if (!kotlin.jvm.internal.m.a(x.n().accountType, "unlogin_user")) {
                                    String uid = x.n().uid;
                                    kotlin.jvm.internal.m.e(uid, "uid");
                                    builderClearQuery.appendQueryParameter("uid", uid);
                                }
                            }
                        }
                    }
                    if (this.f36392t.getForce_params().length() > 0) {
                        List listW1 = oz.q.W0(this.f36392t.getForce_params(), new String[]{","}, 0, 6);
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
                                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                if (kotlin.jvm.internal.m.a(x.n().accountType, "unlogin_user")) {
                                    Intent intent = new Intent(this, (Class<?>) LoginActivity.class);
                                    intent.putExtra(INTENTS.EXTRA_INT, 11);
                                    startActivity(intent);
                                    return;
                                } else {
                                    String uid2 = x.n().uid;
                                    kotlin.jvm.internal.m.e(uid2, "uid");
                                    builderClearQuery.appendQueryParameter("uid", uid2);
                                }
                            }
                        }
                    }
                    Uri uriBuild = builderClearQuery.build();
                    boolean oib = this.f36392t.getOib();
                    if (oib) {
                        try {
                            startActivity(new Intent("android.intent.action.VIEW", uriBuild));
                            return;
                        } catch (Exception unused) {
                            String string2 = uriBuild.toString();
                            kotlin.jvm.internal.m.e(string2, "toString(...)");
                            String title = this.f36392t.getTitle();
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
                    String title2 = this.f36392t.getTitle();
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
                            this.f36392t.setSource(str);
                        }
                        break;
                    case -265871547:
                        if (next.equals("optional_params")) {
                            this.f36392t.setOptional_params(str);
                        }
                        break;
                    case 110024:
                        if (next.equals("oib")) {
                            try {
                                this.f36392t.setOib(Boolean.parseBoolean(str));
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        }
                        break;
                    case 3059181:
                        if (next.equals("code")) {
                            this.f36392t.setCode(str);
                        }
                        break;
                    case 3433509:
                        if (next.equals("path")) {
                            this.f36392t.setPath(str);
                        }
                        break;
                    case 3575610:
                        if (next.equals("type")) {
                            this.f36392t.setType(str);
                        }
                        break;
                    case 110371416:
                        if (next.equals("title")) {
                            this.f36392t.setTitle(str);
                        }
                        break;
                    case 401594119:
                        if (next.equals("forbid_defer")) {
                            try {
                                this.f36392t.setForbid_defer(Boolean.parseBoolean(str));
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                        break;
                    case 554589530:
                        if (next.equals("force_params")) {
                            this.f36392t.setForce_params(str);
                        }
                        break;
                    case 951530617:
                        if (next.equals("content")) {
                            this.f36392t.setContent(str);
                        }
                        break;
                }
            }
        }
    }

    public void setWindowsBottomInserts(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        h2.d dVar = new h2.d(11);
        WeakHashMap weakHashMap = s0.f58893a;
        j0.m(view, dVar);
    }

    public void setWindowsTopInserts(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        h2.d dVar = new h2.d(10);
        WeakHashMap weakHashMap = s0.f58893a;
        j0.m(view, dVar);
    }

    public boolean t() {
        return this instanceof PdGrammarActivity;
    }
}
