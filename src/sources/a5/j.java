package a5;

import android.content.Intent;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.widget.ProgressBar;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import b0.d0;
import b0.t;
import b7.f0;
import b7.w;
import bp.e3;
import cf.x;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.api.Service;
import com.lingo.fluent.ui.base.adapter.PdLearnDetailAdapter;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.http.object.NewsFeed;
import com.lingo.lingoskill.japanskill.ui.syllable.JPHwCharListActivity;
import com.lingo.lingoskill.japanskill.ui.syllable.adapter.JPHwCharListAdapter;
import com.lingo.lingoskill.ui.base.MainActivity;
import com.lingo.me.MeAccountSettingsActivity;
import com.lingodeer.data.model.KnowledgeNote;
import com.tbruyelle.rxpermissions3.BuildConfig;
import gp.l1;
import gp.r0;
import hh.c0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import js.y;
import r.x0;
import ry.u;
import rz.e0;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class j implements ki.a, t, i.b, s20.f, u8.k, u, tx.d, th.c, t7.o, tx.c, av.l, x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f385b;

    public /* synthetic */ j(Object obj, int i11) {
        this.f384a = i11;
        this.f385b = obj;
    }

    @Override // ki.a
    public void B() {
        int i11 = this.f384a;
    }

    @Override // ry.u
    public Iterator C() {
        return ((Iterable) this.f385b).iterator();
    }

    @Override // th.c, th.b
    public void a() {
        ArrayList arrayList;
        Object value;
        switch (this.f384a) {
            case 18:
                c0 c0Var = (c0) this.f385b;
                int i11 = c0Var.Z + 1;
                c0Var.Z = i11;
                PdLearnDetailAdapter pdLearnDetailAdapter = c0Var.P;
                if (i11 >= ((pdLearnDetailAdapter == null || (arrayList = pdLearnDetailAdapter.f21634i) == null) ? 0 : arrayList.size())) {
                    c0Var.Z = 0;
                }
                xx.f fVar = c0Var.W;
                if (fVar != null) {
                    ux.b.a(fVar);
                }
                xx.f fVarH = qx.h.m(c0Var.f32214b0, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new f(c0Var, 13), vx.b.f54316e);
                th.j.a(fVarH, c0Var.f36401t);
                c0Var.W = fVarH;
                break;
            default:
                i1 i1Var = ((y) this.f385b).f36853e;
                do {
                    value = i1Var.getValue();
                } while (!i1Var.j(value, bs.g.a((bs.g) value, false, BuildConfig.VERSION_NAME)));
                break;
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f384a) {
            case 22:
                List list = (List) obj;
                list.size();
                MutableLiveData mutableLiveData = ((jh.r) this.f385b).f36382b;
                if (mutableLiveData != null) {
                    mutableLiveData.setValue(list);
                    return;
                } else {
                    kotlin.jvm.internal.m.n("favVocabularyList");
                    throw null;
                }
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                JPHwCharListAdapter jPHwCharListAdapter = ((JPHwCharListActivity) this.f385b).R;
                if (jPHwCharListAdapter != null) {
                    jPHwCharListAdapter.notifyDataSetChanged();
                    return;
                }
                return;
            default:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                oo.g gVar = (oo.g) this.f385b;
                th.e eVar = gVar.f45666k;
                kotlin.jvm.internal.m.c(eVar);
                if (!eVar.f()) {
                    ey.a aVar = gVar.f45670p;
                    kotlin.jvm.internal.m.c(aVar);
                    fy.c.a(aVar);
                    return;
                }
                int i11 = gVar.m;
                int iLongValue = 0;
                for (int i12 = 0; i12 < i11; i12++) {
                    ArrayList arrayList = gVar.f45673s;
                    kotlin.jvm.internal.m.c(arrayList);
                    iLongValue += (int) ((Number) arrayList.get(i12)).longValue();
                }
                kotlin.jvm.internal.m.c(eVar);
                ((ProgressBar) gVar.f45663h.f32795d).setProgress(((int) eVar.c()) + iLongValue);
                return;
        }
    }

    @Override // tx.d
    public Object apply(Object obj) {
        List it = (List) obj;
        kotlin.jvm.internal.m.f(it, "it");
        String strD = BuildConfig.VERSION_NAME;
        boolean z11 = false;
        for (NewsFeed newsFeed : ry.m.S0(it, new r0())) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            String hasReadFeedList = x.n().hasReadFeedList;
            kotlin.jvm.internal.m.e(hasReadFeedList, "hasReadFeedList");
            if (!oz.q.v0(hasReadFeedList, newsFeed.getFeedId() + ";", false)) {
                z11 = true;
            }
            strD = ep.a.D(strD, newsFeed.getFeedId(), ";");
        }
        ((l1) this.f385b).Z.k(strD);
        return Boolean.valueOf(z11);
    }

    @Override // t7.o
    public void b() throws DashManifestStaleException {
        i7.g gVar = (i7.g) this.f385b;
        gVar.A.b();
        DashManifestStaleException dashManifestStaleException = gVar.C;
        if (dashManifestStaleException != null) {
            throw dashManifestStaleException;
        }
    }

    @Override // s20.f
    public void c(File file) {
        kotlin.jvm.internal.m.f(file, "file");
        MeAccountSettingsActivity meAccountSettingsActivity = (MeAccountSettingsActivity) this.f385b;
        e0.B(LifecycleOwnerKt.getLifecycleScope(meAccountSettingsActivity), null, null, new b1.c(24, file, meAccountSettingsActivity, (vy.d) null), 3);
    }

    public g e(int i11) {
        return null;
    }

    @Override // i.b
    public void f(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f385b;
        i.a aVar = (i.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f33865b;
        int i11 = zzc.e(intent, "ProxyBillingActivityV2").f7519a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f7451d;
        if (resultReceiver != null) {
            resultReceiver.send(i11, intent == null ? null : intent.getExtras());
        }
        int i12 = aVar.f33864a;
        proxyBillingActivityV2.finish();
    }

    @Override // ry.u
    public Object g(Object obj) {
        return ((KnowledgeNote) obj).getNoteTypeCode();
    }

    @Override // b0.t
    public d0 get(int i11) {
        return (d0) this.f385b;
    }

    public g i(int i11) {
        return null;
    }

    @Override // u8.k
    public void j(byte[] bArr, int i11, int i12, u8.j jVar, b7.g gVar) {
        a7.b bVarA;
        w wVar = (w) this.f385b;
        wVar.G(bArr, i11 + i12);
        wVar.I(i11);
        ArrayList arrayList = new ArrayList();
        while (wVar.a() > 0) {
            b7.a.c("Incomplete Mp4Webvtt Top Level box header found.", wVar.a() >= 8);
            int iJ = wVar.j();
            if (wVar.j() == 1987343459) {
                int i13 = iJ - 8;
                CharSequence charSequenceF = null;
                a7.a aVarA = null;
                while (i13 > 0) {
                    b7.a.c("Incomplete vtt cue box header found.", i13 >= 8);
                    int iJ2 = wVar.j();
                    int iJ3 = wVar.j();
                    int i14 = iJ2 - 8;
                    byte[] bArr2 = wVar.f4039a;
                    int i15 = wVar.f4040b;
                    String str = f0.f3975a;
                    String str2 = new String(bArr2, i15, i14, StandardCharsets.UTF_8);
                    wVar.J(i14);
                    i13 = (i13 - 8) - i14;
                    if (iJ3 == 1937011815) {
                        d9.g gVar2 = new d9.g();
                        d9.h.e(str2, gVar2);
                        aVarA = gVar2.a();
                    } else if (iJ3 == 1885436268) {
                        charSequenceF = d9.h.f(Collections.EMPTY_LIST, null, str2.trim());
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = BuildConfig.VERSION_NAME;
                }
                if (aVarA != null) {
                    aVarA.f388a = charSequenceF;
                    aVarA.f389b = null;
                    bVarA = aVarA.a();
                } else {
                    Pattern pattern = d9.h.f23330a;
                    d9.g gVar3 = new d9.g();
                    gVar3.f23321c = charSequenceF;
                    bVarA = gVar3.a().a();
                }
                arrayList.add(bVarA);
            } else {
                wVar.J(iJ - 8);
            }
        }
        gVar.accept(new u8.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public Object k(e00.g descriptor, i00.k kVar) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) this.f385b).get(descriptor);
        Object obj = map != null ? map.get(kVar) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // u8.k
    public int l() {
        return 2;
    }

    @Override // ki.a
    public void m() {
        switch (this.f384a) {
            case 1:
                ((ar.e) this.f385b).c();
                break;
            default:
                MainActivity mainActivity = (MainActivity) this.f385b;
                int i11 = MainActivity.U;
                e0.B(LifecycleOwnerKt.getLifecycleScope(mainActivity), null, null, new e3(mainActivity, null, 0), 3);
                er.c.h();
                break;
        }
    }

    public void n(com.android.billingclient.api.j jVar) {
        rz.t tVar = (rz.t) this.f385b;
        kotlin.jvm.internal.m.c(jVar);
        tVar.J(jVar);
    }

    @Override // s20.f
    public void onError(Throwable e8) {
        kotlin.jvm.internal.m.f(e8, "e");
        MeAccountSettingsActivity meAccountSettingsActivity = (MeAccountSettingsActivity) this.f385b;
        int i11 = MeAccountSettingsActivity.R;
        meAccountSettingsActivity.p().a(new zu.d(false), new ju.d(25), new ju.d(25));
        e8.printStackTrace();
    }

    @Override // s20.f
    public void onStart() {
        MeAccountSettingsActivity meAccountSettingsActivity = (MeAccountSettingsActivity) this.f385b;
        int i11 = MeAccountSettingsActivity.R;
        meAccountSettingsActivity.p().a(new zu.d(true), new ju.d(25), new ju.d(25));
    }

    public boolean q(int i11, int i12, Bundle bundle) {
        return false;
    }

    public String toString() {
        switch (this.f384a) {
            case 21:
                StringBuilder sb2 = new StringBuilder();
                String[] strArr = (String[]) this.f385b;
                int length = strArr.length / 2;
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = i11 * 2;
                    String str = null;
                    sb2.append((i12 < 0 || i12 >= strArr.length) ? null : strArr[i12]);
                    sb2.append(": ");
                    int i13 = i12 + 1;
                    if (i13 >= 0 && i13 < strArr.length) {
                        str = strArr[i13];
                    }
                    sb2.append(str);
                    sb2.append("\n");
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public j(ed.c cVar) {
        this.f384a = 21;
        ArrayList arrayList = cVar.f25470a;
        this.f385b = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public j(w1.b bVar) {
        this.f384a = 29;
        this.f385b = new WeakReference(bVar);
    }

    public j(int i11) {
        this.f384a = i11;
        switch (i11) {
            case 6:
                break;
            case 9:
                this.f385b = new w();
                break;
            case 14:
                this.f385b = new Region();
                break;
            case 19:
                this.f385b = new ConcurrentHashMap(16);
                break;
            default:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f385b = new i(this);
                } else {
                    this.f385b = new h(this);
                }
                break;
        }
    }

    private final void o() {
    }

    private final void p() {
    }

    public void d(int i11, g gVar, String str, Bundle bundle) {
    }
}
