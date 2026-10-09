package dm;

import android.content.Intent;
import android.os.Looper;
import android.os.ResultReceiver;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.k1;
import av.l;
import b0.m2;
import b0.o2;
import b0.s;
import b0.t;
import bp.f4;
import bp.i4;
import bs.g;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.api.Service;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.DaoMaster;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.object.YinTuDao;
import com.lingo.lingoskill.object.YouYinDao;
import com.lingo.lingoskill.object.ZhuoYinDao;
import com.lingo.lingoskill.ui.base.NewsFeedActivity;
import com.lingo.lingoskill.ui.base.adapter.NewsFeedAdapter;
import com.lingo.lingoskill.widget.flingView.SwipeCardsView;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fx.j;
import gp.l1;
import hh.c1;
import hj.f0;
import hj.l6;
import hj.n6;
import hj.x3;
import hj.y3;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import jp.p0;
import js.y;
import jt.t0;
import kotlin.jvm.internal.m;
import l0.o;
import l0.w;
import m0.p;
import m0.x;
import mv.n;
import n0.k0;
import n0.l0;
import q.u;
import qy.b0;
import re.q;
import tp.e;
import uw.i;
import uz.i1;
import x1.f;
import zd.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements r, o2, tx.c, bq.d, th.c, i.b, yq.b, i, th.b, u, l, ne.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f23483c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f23485b;

    public /* synthetic */ a(int i11, boolean z11) {
        this.f23484a = i11;
    }

    public static k0 x(a aVar, int i11) {
        w wVar = (w) aVar.f23485b;
        f fVarN = q.n();
        fz.c cVarE = fVarN != null ? fVarN.e() : null;
        f fVarR = q.r(fVarN);
        try {
            o oVar = (o) wVar.f39207f.getValue();
            return wVar.f39216p.a(i11, oVar.f39155j, wVar.f39205d, new t0(i11, oVar));
        } finally {
            q.t(fVarN, fVarR, cVarE);
        }
    }

    @Override // th.c, th.b
    public void a() {
        switch (this.f23484a) {
            case 6:
                android.support.v4.media.session.a.H(((ImageView) this.f23485b).getBackground());
                break;
            case 19:
                ta.a aVar = ((p0) this.f23485b).f36400f;
                m.c(aVar);
                android.support.v4.media.session.a.H(((x3) aVar).f33576i.f32664c.getBackground());
                break;
            default:
                i1 i1Var = ((n) this.f23485b).f42254d;
                i1Var.getClass();
                i1Var.l(null, BuildConfig.VERSION_NAME);
                break;
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f23484a) {
            case 4:
                List it = (List) obj;
                m.f(it, "it");
                NewsFeedActivity newsFeedActivity = (NewsFeedActivity) this.f23485b;
                ((f0) newsFeedActivity.j()).f32559d.setRefreshing(false);
                ArrayList arrayList = newsFeedActivity.Q;
                arrayList.clear();
                arrayList.addAll(it);
                NewsFeedAdapter newsFeedAdapter = newsFeedActivity.P;
                if (newsFeedAdapter != null) {
                    newsFeedAdapter.notifyDataSetChanged();
                    return;
                }
                return;
            case 8:
                ep.f fVar = (ep.f) this.f23485b;
                int i11 = fVar.f25731c;
                List list = fVar.f25733e;
                m.c(list);
                int size = (int) (((i11 - list.size()) / fVar.f25731c) * 100.0f);
                i4 i4Var = (i4) fVar.f25729a;
                ta.a aVar = i4Var.f36400f;
                m.c(aVar);
                ta.a aVar2 = i4Var.f36400f;
                m.c(aVar2);
                ImageView imageView = ((y3) aVar2).f33618c;
                imageView.postDelayed(new b2.c(4, imageView, new f4(i4Var, size, 0)), 0L);
                ta.a aVar3 = i4Var.f36400f;
                m.c(aVar3);
                ((y3) aVar3).f33620e.setText(size + "%");
                ta.a aVar4 = i4Var.f36400f;
                m.c(aVar4);
                ((y3) aVar4).f33619d.setProgress(size);
                i4Var.y();
                if (size == 100) {
                    if (fVar.f25734f != null) {
                        fv.c.f();
                        return;
                    } else {
                        m.n("dlService");
                        throw null;
                    }
                }
                return;
            case 12:
                Boolean it2 = (Boolean) obj;
                m.f(it2, "it");
                i1 i1Var = ((l1) this.f23485b).Y;
                i1Var.getClass();
                i1Var.l(null, it2);
                return;
            case 15:
                m.f((Long) obj, "it");
                ta.a aVar5 = ((c1) this.f23485b).f36400f;
                m.c(aVar5);
                ((l6) aVar5).f32869d.setVisibility(4);
                return;
            case 17:
                m.f((b0) obj, "it");
                ((ReviewNew) this.f23485b).getCwsId();
                return;
            case 18:
                ((ip.a) this.f23485b).f34550d.setValue((ArrayList) obj);
                return;
            default:
                m.f((Long) obj, "<unused var>");
                oi.c cVar = (oi.c) this.f23485b;
                l.m mVar = (l.m) cVar.f44925a;
                m.c(mVar);
                k1 supportFragmentManager = mVar.getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar6 = new androidx.fragment.app.a(supportFragmentManager);
                aVar6.f1892b = 0;
                aVar6.f1893c = 0;
                aVar6.f1894d = 0;
                aVar6.f1895e = 0;
                androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) cVar.f44927c;
                m.c(k0Var);
                androidx.fragment.app.k0 k0Var2 = (androidx.fragment.app.k0) cVar.f44927c;
                m.c(k0Var2);
                aVar6.e(R.id.fl_container, k0Var, k0Var2.getClass().getSimpleName());
                aVar6.i(true, true);
                return;
        }
    }

    @Override // uw.i
    public void b(ww.b bVar) {
        zw.a.f((j) this.f23485b, bVar);
    }

    @Override // b0.o2, b0.l2
    public boolean c() {
        ((c) this.f23485b).getClass();
        return false;
    }

    @Override // q.u
    public void d(q.l lVar, boolean z11) {
        ((androidx.appcompat.app.b) this.f23485b).s(lVar);
    }

    @Override // b0.l2
    public long e(s sVar, s sVar2, s sVar3) {
        return ((c) this.f23485b).e(sVar, sVar2, sVar3);
    }

    @Override // i.b
    public void f(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f23485b;
        i.a aVar = (i.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f33865b;
        int i11 = zzc.e(intent, "ProxyBillingActivityV2").f7519a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f7452e;
        if (resultReceiver != null) {
            resultReceiver.send(i11, intent == null ? null : intent.getExtras());
        }
        int i12 = aVar.f33864a;
        proxyBillingActivityV2.finish();
    }

    @Override // b0.l2
    public s g(s sVar, s sVar2, s sVar3) {
        return ((c) this.f23485b).g(sVar, sVar2, sVar3);
    }

    @Override // ne.d
    public ne.c h(td.a aVar) {
        if (aVar == td.a.MEMORY_CACHE) {
            return ne.b.f43759a;
        }
        if (((ne.a) this.f23485b) == null) {
            this.f23485b = new ne.a();
        }
        return (ne.a) this.f23485b;
    }

    @Override // b0.l2
    public s i(long j11, s sVar, s sVar2, s sVar3) {
        return ((c) this.f23485b).i(j11, sVar, sVar2, sVar3);
    }

    @Override // yq.b
    public void j(View view) {
        ((fi.d) this.f23485b).h();
    }

    @Override // bq.d
    public void k(int i11) {
        bc.i iVar = (bc.i) this.f23485b;
        if (i11 == 0) {
            int i12 = iVar.f4121a + 1;
            iVar.f4121a = i12;
            if (i12 >= ((ArrayList) iVar.f4124d).size()) {
                if (!iVar.f4122b) {
                    return;
                } else {
                    iVar.f4121a = 0;
                }
            }
            iVar.e();
        }
    }

    @Override // yq.b
    public void l(yq.c type) {
        m.f(type, "type");
        fi.d dVar = (fi.d) this.f23485b;
        ta.a aVar = dVar.f45600c;
        m.c(aVar);
        SwipeCardsView swipeCardsView = ((n6) aVar).f32998b;
        swipeCardsView.postDelayed(new b2.c(4, swipeCardsView, new fi.a(dVar, 1)), 300L);
    }

    @Override // b0.l2
    public s m(long j11, s sVar, s sVar2, s sVar3) {
        return ((c) this.f23485b).m(j11, sVar, sVar2, sVar3);
    }

    public YinTuDao o() {
        YinTuDao yinTuDao = ((DaoSession) this.f23485b).getYinTuDao();
        m.e(yinTuDao, "getYinTuDao(...)");
        return yinTuDao;
    }

    @Override // uw.i
    public void onComplete() {
        ((j) this.f23485b).f28247a.onComplete();
    }

    @Override // uw.i
    public void onError(Throwable th2) {
        ((j) this.f23485b).f28247a.onError(th2);
    }

    @Override // uw.i
    public void onSuccess(Object obj) {
        ((j) this.f23485b).f28247a.onSuccess(obj);
    }

    @Override // zd.r
    public zd.q p(zd.w wVar) {
        return new ae.a((e) this.f23485b);
    }

    @Override // q.u
    public boolean q(q.l lVar) {
        Window.Callback callback = ((androidx.appcompat.app.b) this.f23485b).N.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    public YouYinDao s() {
        YouYinDao youYinDao = ((DaoSession) this.f23485b).getYouYinDao();
        m.e(youYinDao, "getYouYinDao(...)");
        return youYinDao;
    }

    public ZhuoYinDao t() {
        ZhuoYinDao zhuoYinDao = ((DaoSession) this.f23485b).getZhuoYinDao();
        m.e(zhuoYinDao, "getZhuoYinDao(...)");
        return zhuoYinDao;
    }

    public InputStream u() {
        InputStream inputStream = (InputStream) this.f23485b;
        this.f23485b = null;
        return inputStream;
    }

    public void v(String path) {
        Object value;
        Object value2;
        Object value3;
        y yVar = (y) this.f23485b;
        i1 i1Var = yVar.f36853e;
        av.n nVar = yVar.f36849a;
        m.f(path, "path");
        try {
            nVar.n();
            do {
                value2 = i1Var.getValue();
            } while (!i1Var.j(value2, g.a((g) value2, false, BuildConfig.VERSION_NAME)));
            nVar.h(path);
            do {
                value3 = i1Var.getValue();
            } while (!i1Var.j(value3, g.a((g) value3, true, path)));
            a5.j jVar = new a5.j(yVar, 24);
            nVar.getClass();
            nVar.f3172c = jVar;
        } catch (Exception e8) {
            e8.printStackTrace();
            do {
                value = i1Var.getValue();
            } while (!i1Var.j(value, g.a((g) value, false, BuildConfig.VERSION_NAME)));
        }
    }

    public ArrayList w(int i11) {
        ArrayList arrayList = new ArrayList();
        x xVar = (x) this.f23485b;
        f fVarN = q.n();
        fz.c cVarE = fVarN != null ? fVarN.e() : null;
        f fVarR = q.r(fVarN);
        try {
            p pVar = xVar.f40651b ? xVar.f40652c : (p) xVar.f40654e.getValue();
            if (pVar != null) {
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                wVar.f38359a = 1;
                List list = (List) pVar.f40598k.invoke(Integer.valueOf(i11));
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    qy.l lVar = (qy.l) list.get(i12);
                    l0 l0Var = xVar.f40663o;
                    int iIntValue = ((Number) lVar.f48495a).intValue();
                    long j11 = ((v3.a) lVar.f48496b).f53483a;
                    qp.o2 o2Var = x.f40649w;
                    wVar = wVar;
                    arrayList.add(l0Var.a(iIntValue, j11, false, new b0.a((ArrayList) null, wVar, list, i11, pVar)));
                }
            }
            return arrayList;
        } finally {
            q.t(fVarN, fVarR, cVarE);
        }
    }

    public /* synthetic */ a(Object obj, int i11) {
        this.f23484a = i11;
        this.f23485b = obj;
    }

    public a(LingoSkillApplication context) {
        this.f23484a = 0;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        Env envN = cf.x.n();
        m.f(context, "context");
        DaoSession daoSessionNewSession = new DaoMaster(new ao.a(context, "JsChar.db", null, 1, "jschar.db", envN, 5).getWritableDatabase()).m210newSession();
        m.e(daoSessionNewSession, "newSession(...)");
        this.f23485b = daoSessionNewSession;
        daoSessionNewSession.clear();
    }

    public a(int i11) {
        this.f23484a = i11;
        switch (i11) {
            case 11:
                this.f23485b = md.a.h(Looper.getMainLooper());
                break;
            case 23:
                this.f23485b = null;
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                this.f23485b = new AtomicInteger(0);
                break;
            default:
                this.f23485b = new e(9);
                break;
        }
    }

    public a(float f5, float f11, s sVar) {
        t fVar;
        this.f23484a = 3;
        int[] iArr = m2.f3610a;
        if (sVar != null) {
            fVar = new hd.d(f5, f11, sVar);
        } else {
            fVar = new a5.f(f5, f11);
        }
        this.f23485b = new c(fVar);
    }
}
