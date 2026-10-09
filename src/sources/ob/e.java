package ob;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.b1;
import androidx.viewpager2.widget.ViewPager2;
import androidx.work.impl.WorkDatabase;
import ay.x;
import b0.j2;
import com.android.volley.AuthFailureError;
import com.android.volley.ClientError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.flexbox.FlexboxLayout;
import com.google.api.Service;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.chineseskill.ui.sc.adapter.ScCateAdapter;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.speak.object.PodSentence;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import fr.o0;
import fr.p3;
import hh.f1;
import hj.b5;
import hj.n4;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import jp.m0;
import jp.p0;
import km.s1;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.y;
import kr.v0;
import kr.z0;
import l1.p2;
import m1.k0;
import mv.f0;
import n0.n0;
import oo.d0;
import qh.c0;
import qy.b0;
import re.e0;
import rz.z1;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements tx.c, d7.e, ec.g, uw.i, tx.d, ki.a, av.k, m0, k0, t7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f44804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f44805c;

    public /* synthetic */ e(int i11, Object obj, Object obj2) {
        this.f44803a = i11;
        this.f44804b = obj;
        this.f44805c = obj2;
    }

    public static String w(m00.i iVar) {
        long j11 = iVar.f40718b;
        if (j11 <= 64) {
            return iVar.D().f();
        }
        return iVar.F((int) Math.min(j11, 64L)).f() + "...";
    }

    @Override // jp.m0
    public void D(ConstraintLayout constraintLayout) {
        ((TextView) ((p0) ((mp.b) this.f44804b)).y().findViewById(R.id.txt_answer_txt_2)).setText((SpannableStringBuilder) this.f44805c);
    }

    @Override // av.k
    public void a() {
        Object value;
        List list = (List) this.f44805c;
        z0 z0Var = (z0) this.f44804b;
        av.n nVar = z0Var.f38628b;
        i1 i1Var = z0Var.L;
        i1 i1Var2 = z0Var.K;
        do {
            value = i1Var2.getValue();
        } while (!i1Var2.j(value, Integer.valueOf(((Number) value).intValue() + 1)));
        if (((Boolean) i1Var.getValue()).booleanValue()) {
            if (((Number) i1Var2.getValue()).intValue() < list.size()) {
                nVar.h((String) list.get(((Number) i1Var2.getValue()).intValue()));
                return;
            }
            nVar.g();
            Boolean bool = Boolean.FALSE;
            i1Var.getClass();
            i1Var.l(null, bool);
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        int i11 = 1;
        switch (this.f44803a) {
            case 3:
                BaseViewHolder baseViewHolder = (BaseViewHolder) this.f44804b;
                Locale locale = Locale.getDefault();
                Context context = ((BaseQuickAdapter) ((ScCateAdapter) this.f44805c)).mContext;
                kotlin.jvm.internal.m.e(context, "access$getMContext$p$s526053488(...)");
                baseViewHolder.setText(R.id.tv_count, String.format(locale, ff.h.y(context, R.string._s_content), Arrays.copyOf(new Object[]{(Long) obj}, 1)));
                break;
            case 12:
                List it = (List) obj;
                kotlin.jvm.internal.m.f(it, "it");
                it.size();
                ArrayList arrayList = (ArrayList) this.f44804b;
                arrayList.clear();
                arrayList.addAll(it);
                b1 adapter = ((ViewPager2) this.f44805c).getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                break;
            case 13:
                int[] iArr = (int[]) this.f44805c;
                kotlin.jvm.internal.m.f((Long) obj, "it");
                f1 f1Var = (f1) this.f44804b;
                int i12 = f1Var.P;
                ta.a aVar = f1Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                if (i12 > ((n4) aVar).f32989d.getChildCount() - 1) {
                    f1Var.P = 0;
                }
                ta.a aVar2 = f1Var.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                View childAt = ((n4) aVar2).f32989d.getChildAt(f1Var.P);
                if (childAt != null) {
                    if (childAt.getVisibility() == 0) {
                        f1Var.P++;
                    } else {
                        int[] iArr2 = new int[2];
                        childAt.getLocationOnScreen(iArr2);
                        ta.a aVar3 = f1Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar3);
                        int width = ((n4) aVar3).f32989d.getWidth() / 2;
                        ta.a aVar4 = f1Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar4);
                        double dSqrt = Math.sqrt(((((n4) aVar4).f32989d.getWidth() * width) / 2) / 2);
                        int i13 = iArr[0];
                        ta.a aVar5 = f1Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar5);
                        int width2 = (int) (((double) ((((n4) aVar5).f32989d.getWidth() / 2) + i13)) - dSqrt);
                        double d5 = iArr[0];
                        ta.a aVar6 = f1Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar6);
                        int iN = th.j.n(width2, (int) (((d5 + ((double) (((n4) aVar6).f32989d.getWidth() / 2))) + dSqrt) - ((double) childAt.getWidth())));
                        double d11 = iArr[1];
                        ta.a aVar7 = f1Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar7);
                        int[] iArr3 = {iN, (int) (d11 + ((double) (((n4) aVar7).f32989d.getHeight() / 2)) + dSqrt)};
                        childAt.setVisibility(4);
                        childAt.setTranslationX(iArr3[0] - iArr2[0]);
                        childAt.setTranslationY(iArr3[1] - iArr2[1]);
                        childAt.postDelayed(new b2.c(4, childAt, new fp.f(9, childAt, f1Var)), 0L);
                        f1Var.P++;
                    }
                    break;
                }
                break;
            case 15:
                FlexboxLayout flexboxLayout = (FlexboxLayout) this.f44805c;
                kotlin.jvm.internal.m.f((Long) obj, "it");
                jp.i iVar = (jp.i) this.f44804b;
                th.e eVar = iVar.f36493w;
                th.e eVar2 = iVar.f36493w;
                if (eVar.f()) {
                    long jC = eVar2.c();
                    int childCount = flexboxLayout.getChildCount();
                    while (i11 < childCount) {
                        View childAt2 = flexboxLayout.getChildAt(i11);
                        if (childAt2.getTag(R.id.tag_start_pos) != null) {
                            Object tag = childAt2.getTag(R.id.tag_start_pos);
                            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type kotlin.Float");
                            float fFloatValue = ((Float) tag).floatValue();
                            Context context2 = iVar.f47883c;
                            int iD = (int) (fFloatValue * eVar2.d());
                            TextView textView = (TextView) childAt2.findViewById(R.id.tv_middle);
                            if (!kotlin.jvm.internal.m.a(childAt2.getTag(R.id.tag_is_invisiable), Boolean.TRUE)) {
                                if (iD <= jC) {
                                    textView.setTextColor(j3.G(context2, R.color.primary_black));
                                } else {
                                    textView.setTextColor(j3.G(context2, R.color.second_black));
                                }
                            }
                        }
                        i11++;
                    }
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                PodSentence podSentence = (PodSentence) this.f44805c;
                kotlin.jvm.internal.m.f((Long) obj, "it");
                d0 d0Var = (d0) this.f44804b;
                th.e eVar3 = d0Var.O;
                if (eVar3 != null && eVar3.f()) {
                    th.e eVar4 = d0Var.O;
                    if (eVar4 != null) {
                        eVar4.c();
                    }
                    th.e eVar5 = d0Var.O;
                    long jC2 = eVar5 != null ? eVar5.c() : 0L;
                    th.e eVar6 = d0Var.O;
                    long jD = eVar6 != null ? eVar6.d() : 0L;
                    int i14 = d0Var.T;
                    List list = d0Var.X;
                    kotlin.jvm.internal.m.c(list);
                    if (i14 >= list.size()) {
                        xx.f fVar = d0Var.S;
                        kotlin.jvm.internal.m.c(fVar);
                        ux.b.a(fVar);
                    } else {
                        int size = podSentence.getWords().size();
                        for (int i15 = 0; i15 < size; i15++) {
                            op.b bVar = (op.b) podSentence.getWords().get(i15);
                            bVar.getBegin();
                            if (!TextUtils.isEmpty(bVar.getBegin()) && ((int) (Float.valueOf(bVar.getBegin()).floatValue() * jD)) <= jC2) {
                                ta.a aVar8 = d0Var.f36400f;
                                kotlin.jvm.internal.m.c(aVar8);
                                View childAt3 = ((b5) aVar8).f32400f.getChildAt(i15);
                                TextView textView2 = (TextView) childAt3.findViewById(R.id.tv_top);
                                TextView textView3 = (TextView) childAt3.findViewById(R.id.tv_middle);
                                TextView textView4 = (TextView) childAt3.findViewById(R.id.tv_bottom);
                                Context contextRequireContext = d0Var.requireContext();
                                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                                textView2.setTextColor(contextRequireContext.getColor(R.color.color_5893DD));
                                Context contextRequireContext2 = d0Var.requireContext();
                                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                                textView3.setTextColor(contextRequireContext2.getColor(R.color.color_5893DD));
                                Context contextRequireContext3 = d0Var.requireContext();
                                kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                                textView4.setTextColor(contextRequireContext3.getColor(R.color.color_5893DD));
                            }
                        }
                    }
                    break;
                }
                break;
            case 27:
                List list2 = (List) obj;
                List list3 = (List) this.f44805c;
                pp.e eVar7 = (pp.e) this.f44804b;
                kotlin.jvm.internal.m.c(list2);
                if (list2.isEmpty()) {
                    th.j.a(new x(new pp.b(eVar7, i11)).k(ky.e.f38937b).g(px.b.a()).h(new c(27, eVar7, list3), vx.b.f54316e), eVar7.R);
                } else {
                    eVar7.f46976a.W(true);
                    w wVar = new w();
                    fv.c cVar = eVar7.M;
                    if (cVar != null) {
                        cVar.c(list2, new pp.c(eVar7, wVar, list2, list3), false);
                    }
                }
                break;
            default:
                kotlin.jvm.internal.m.f((Long) obj, "it");
                c0 c0Var = (c0) this.f44804b;
                y yVar = (y) this.f44805c;
                ((TextView) ((LinearLayout) yVar.f38361a).findViewById(R.id.tv_word)).setVisibility(0);
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (cf.x.n().keyLanguage == 0 && ((o0) c0Var.s()).t() == 0) {
                    ((TextView) ((LinearLayout) yVar.f38361a).findViewById(R.id.tv_zhuyin)).setVisibility(0);
                    break;
                }
                break;
        }
    }

    @Override // tx.d
    public Object apply(Object obj) {
        Boolean it = (Boolean) obj;
        kotlin.jvm.internal.m.f(it, "it");
        if (!it.booleanValue()) {
            ((ij.i) this.f44804b).f34435a.f34448h.insertOrReplace((ReviewNew) this.f44805c);
        }
        return b0.f48488a;
    }

    @Override // uw.i
    public void b(ww.b bVar) {
        zw.a.f((fx.r) this.f44805c, bVar);
    }

    @Override // ec.g
    public void c(int i11) {
        int i12;
        if (i11 >= 40) {
            ((ec.e) this.f44805c).u(-1);
            return;
        }
        if (10 > i11 || i11 >= 20) {
            return;
        }
        ec.e eVar = (ec.e) this.f44805c;
        synchronized (((e0) eVar.f2590g)) {
            i12 = eVar.f2586c;
        }
        eVar.u(i12 / 2);
    }

    @Override // m1.k0
    public List d(Integer num) {
        List listD = ((k0) this.f44804b).d(null);
        p2 p2Var = (p2) this.f44805c;
        int i11 = p2Var.f39416v;
        return i11 < 0 ? listD : ry.m.H0(gb.r.f(p2Var, num, i11, Integer.valueOf(p2Var.E(p2Var.f39397b, i11))), listD);
    }

    @Override // t7.p
    public Object e(Uri uri, d7.g gVar) {
        long j11;
        j7.c cVar = (j7.c) ((j7.e) this.f44804b).e(uri, gVar);
        List list = (List) this.f44805c;
        if (list == null || list.isEmpty()) {
            return cVar;
        }
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new y6.k0());
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= cVar.m.size()) {
                break;
            }
            if (((y6.k0) linkedList.peek()).f57221a != i11) {
                long jB = cVar.b(i11);
                if (jB != -9223372036854775807L) {
                    j12 += jB;
                }
            } else {
                j7.h hVarA = cVar.a(i11);
                List list2 = hVarA.f36133c;
                y6.k0 k0Var = (y6.k0) linkedList.poll();
                int i12 = k0Var.f57221a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i13 = k0Var.f57222b;
                    j7.a aVar = (j7.a) list2.get(i13);
                    List list3 = aVar.f36090c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((j7.m) list3.get(k0Var.f57223c));
                        k0Var = (y6.k0) linkedList.poll();
                        if (k0Var.f57221a != i12) {
                            break;
                        }
                    } while (k0Var.f57222b == i13);
                    j11 = j12;
                    arrayList2.add(new j7.a(aVar.f36088a, aVar.f36089b, arrayList3, aVar.f36091d, aVar.f36092e, aVar.f36093f));
                    if (k0Var.f57221a != i12) {
                        break;
                    }
                    j12 = j11;
                }
                linkedList.addFirst(k0Var);
                arrayList.add(new j7.h(hVarA.f36131a, hVarA.f36132b - j11, arrayList2, hVarA.f36134d));
                j12 = j11;
            }
            i11++;
        }
        long j13 = j12;
        long j14 = cVar.f36099b;
        return new j7.c(cVar.f36098a, j14 != -9223372036854775807L ? j14 - j13 : -9223372036854775807L, cVar.f36100c, cVar.f36101d, cVar.f36102e, cVar.f36103f, cVar.f36104g, cVar.f36105h, cVar.f36109l, cVar.f36106i, cVar.f36107j, cVar.f36108k, arrayList);
    }

    public void f() {
        this.f44804b = null;
        this.f44805c = null;
    }

    @Override // ec.g
    public void g(ec.a aVar, Bitmap bitmap, Map map) {
        int i11;
        int iE = z6.c.e(bitmap);
        ec.e eVar = (ec.e) this.f44805c;
        synchronized (((e0) eVar.f2590g)) {
            i11 = eVar.f2585b;
        }
        if (iE <= i11) {
            ((ec.e) this.f44805c).q(aVar, new ec.d(bitmap, map, iE));
        } else {
            ((ec.e) this.f44805c).r(aVar);
            ((com.android.billingclient.api.c0) this.f44804b).g(aVar, bitmap, map, iE);
        }
    }

    @Override // ec.g
    public ec.b h(ec.a aVar) {
        ec.d dVar = (ec.d) ((ec.e) this.f44805c).j(aVar);
        if (dVar != null) {
            return new ec.b(dVar.f25461a, dVar.f25462b);
        }
        return null;
    }

    public String i(String str) {
        HashMap map = (HashMap) this.f44804b;
        return map.containsKey(str) ? (String) map.get(str) : str;
    }

    public Long j(String str) {
        w9.u uVarB = w9.u.b(1, "SELECT long_value FROM Preference where `key`=?");
        uVarB.l(1, str);
        w9.s sVar = (w9.s) this.f44804b;
        sVar.b();
        Cursor cursorF = cf.x.F(sVar, uVarB, false);
        try {
            Long lValueOf = null;
            if (cursorF.moveToFirst() && !cursorF.isNull(0)) {
                lValueOf = Long.valueOf(cursorF.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorF.close();
            uVarB.release();
        }
    }

    public void k(d dVar) {
        w9.s sVar = (w9.s) this.f44804b;
        sVar.b();
        sVar.c();
        try {
            ((b) this.f44805c).m(dVar);
            sVar.x();
        } finally {
            sVar.s();
        }
    }

    public boolean l() {
        return ((Logger) this.f44804b).isLoggable((Level) this.f44805c);
    }

    @Override // ki.a
    public void m() {
        int[] iArr = bq.r.f4959a;
        String str = (String) ((y) this.f44804b).f38361a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        bq.m.L(str, bq.m.r(cf.x.n().keyLanguage) + ":" + bq.m.r(cf.x.n().locateLanguage) + "-ALPHABET-3.txt");
        Toast.makeText(((s1) this.f44805c).requireContext(), R.string.success, 1).show();
    }

    public void n(nw.q qVar, int i11, m00.i iVar, int i12, boolean z11) {
        if (l()) {
            ((Logger) this.f44804b).log((Level) this.f44805c, qVar + " DATA: streamId=" + i11 + " endStream=" + z11 + " length=" + i12 + " bytes=" + w(iVar));
        }
    }

    public void o(nw.q qVar, int i11, ow.a aVar, m00.l lVar) {
        if (l()) {
            Logger logger = (Logger) this.f44804b;
            Level level = (Level) this.f44805c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(qVar);
            sb2.append(" GO_AWAY: lastStreamId=");
            sb2.append(i11);
            sb2.append(" errorCode=");
            sb2.append(aVar);
            sb2.append(" length=");
            sb2.append(lVar.e());
            sb2.append(" bytes=");
            m00.i iVar = new m00.i();
            iVar.I(lVar);
            sb2.append(w(iVar));
            logger.log(level, sb2.toString());
        }
    }

    @Override // uw.i
    public void onComplete() {
        ((uw.i) this.f44804b).onComplete();
    }

    @Override // uw.i
    public void onError(Throwable th2) {
        ((uw.i) this.f44804b).onError(th2);
    }

    @Override // uw.i
    public void onSuccess(Object obj) {
        ((uw.i) this.f44804b).onSuccess(obj);
    }

    public void p(nw.q qVar, long j11) {
        if (l()) {
            ((Logger) this.f44804b).log((Level) this.f44805c, qVar + " PING: ack=false bytes=" + j11);
        }
    }

    public void q(nw.q qVar, int i11, ow.a aVar) {
        if (l()) {
            ((Logger) this.f44804b).log((Level) this.f44805c, qVar + " RST_STREAM: streamId=" + i11 + " errorCode=" + aVar);
        }
    }

    public void r(nw.q qVar, l1.p0 p0Var) {
        if (l()) {
            Logger logger = (Logger) this.f44804b;
            Level level = (Level) this.f44805c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(qVar);
            sb2.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(nw.r.class);
            for (nw.r rVar : nw.r.values()) {
                if (p0Var.a(rVar.a())) {
                    enumMap.put(rVar, Integer.valueOf(p0Var.f39389b[rVar.a()]));
                }
            }
            sb2.append(enumMap.toString());
            logger.log(level, sb2.toString());
        }
    }

    @Override // d7.e
    public d7.f s() {
        return new d7.i((Context) this.f44804b, ((ar.f) this.f44805c).s());
    }

    @Override // av.k
    public void start() {
        z0 z0Var = (z0) this.f44804b;
        rz.e0.B(ViewModelKt.getViewModelScope(z0Var), null, null, new v0(z0Var, (List) this.f44805c, null, 1), 3);
    }

    public void t(nw.q qVar, int i11, long j11) {
        if (l()) {
            ((Logger) this.f44804b).log((Level) this.f44805c, qVar + " WINDOW_UPDATE: streamId=" + i11 + " windowSizeIncrement=" + j11);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9221. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public void u(java.util.ArrayList r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.e.u(java.util.ArrayList, java.lang.String):void");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01d1 A[LOOP:0: B:3:0x0004->B:103:0x01d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x020a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
    /* JADX WARN: Code duplicated, block: B:64:0x0110  */
    /* JADX WARN: Code duplicated, block: B:66:0x0116  */
    /* JADX WARN: Code duplicated, block: B:67:0x0119  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a A[LOOP:1: B:68:0x0124->B:70:0x012a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x013b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0142  */
    /* JADX WARN: Code duplicated, block: B:95:0x0179  */
    /* JADX WARN: Code duplicated, block: B:96:0x0188  */
    /* JADX WARN: Code duplicated, block: B:97:0x0197  */
    /* JADX WARN: Code duplicated, block: B:99:0x019d  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x01d1, please report this as an issue */
    public pd.e v(pd.h hVar) throws Throwable {
        l lVar;
        int i11;
        List<pd.c> listUnmodifiableList;
        TreeMap treeMap;
        String str;
        int timeoutMs;
        VolleyError volleyError;
        int i12;
        Map map;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            qd.a aVar = null;
            try {
                pd.a cacheEntry = hVar.getCacheEntry();
                if (cacheEntry == null) {
                    try {
                        map = Collections.EMPTY_MAP;
                    } catch (IOException e8) {
                        e = e8;
                        e = e;
                        if (e instanceof SocketTimeoutException) {
                            lVar = new l(27, "socket", new TimeoutError());
                        } else {
                            if (e instanceof MalformedURLException) {
                                throw new RuntimeException("Bad URL " + hVar.getUrl(), e);
                            }
                            if (aVar != null) {
                                i11 = aVar.f47701a;
                                pd.p.a("Unexpected response code %d for %s", Integer.valueOf(i11), hVar.getUrl());
                                if (0 != 0) {
                                    listUnmodifiableList = Collections.unmodifiableList(aVar.f47702b);
                                    SystemClock.elapsedRealtime();
                                    if (listUnmodifiableList != null) {
                                        if (listUnmodifiableList.isEmpty()) {
                                            Map map2 = Collections.EMPTY_MAP;
                                        } else {
                                            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                                            for (pd.c cVar : listUnmodifiableList) {
                                                treeMap.put(cVar.f46776a, cVar.f46777b);
                                            }
                                        }
                                    }
                                    if (listUnmodifiableList != null) {
                                        Collections.unmodifiableList(listUnmodifiableList);
                                    }
                                    if (i11 != 401) {
                                        lVar = new l(27, "auth", new AuthFailureError());
                                    } else {
                                        lVar = new l(27, "auth", new AuthFailureError());
                                    }
                                } else {
                                    lVar = new l(27, "network", new NetworkError());
                                }
                            } else {
                                if (!hVar.shouldRetryConnectionErrors()) {
                                    throw new NoConnectionError(e);
                                }
                                lVar = new l(27, "connection", new NoConnectionError());
                            }
                        }
                        str = (String) lVar.f44822b;
                        pd.m retryPolicy = hVar.getRetryPolicy();
                        timeoutMs = hVar.getTimeoutMs();
                        try {
                            volleyError = (VolleyError) lVar.f44823c;
                            a9.e eVar = (a9.e) retryPolicy;
                            i12 = eVar.f479c + 1;
                            eVar.f479c = i12;
                            int i13 = eVar.f478b;
                            eVar.f478b = i13 + ((int) (i13 * 1.0f));
                            if (i12 > 1) {
                                throw volleyError;
                            }
                            hVar.addMarker(str + "-retry [timeout=" + timeoutMs + "]");
                        } catch (VolleyError e10) {
                            hVar.addMarker(str + "-timeout-giveup [timeout=" + timeoutMs + "]");
                            throw e10;
                        }
                    }
                } else {
                    HashMap map3 = new HashMap();
                    String str2 = cacheEntry.f46762b;
                    if (str2 != null) {
                        map3.put("If-None-Match", str2);
                    }
                    long j11 = cacheEntry.f46764d;
                    if (j11 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
                        map3.put("If-Modified-Since", simpleDateFormat.format(new Date(j11)));
                    }
                    map = map3;
                }
                try {
                    qd.a aVarM = ((p3) this.f44804b).m(hVar, map);
                    try {
                        int i14 = aVarM.f47701a;
                        List listUnmodifiableList2 = Collections.unmodifiableList(aVarM.f47702b);
                        if (i14 == 304) {
                            SystemClock.elapsedRealtime();
                            return se.k.p(hVar, listUnmodifiableList2);
                        }
                        InputStream inputStream = (InputStream) aVarM.f47704d;
                        if (inputStream == null) {
                            inputStream = null;
                        }
                        byte[] bArrR = inputStream != null ? se.k.r(inputStream, aVarM.f47703c, (qd.a) this.f44805c) : new byte[0];
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (pd.p.f46808a || jElapsedRealtime2 > 3000) {
                            pd.p.a("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", hVar, Long.valueOf(jElapsedRealtime2), bArrR != null ? Integer.valueOf(bArrR.length) : "null", Integer.valueOf(i14), Integer.valueOf(((a9.e) hVar.getRetryPolicy()).f479c));
                        }
                        if (i14 < 200 || i14 > 299) {
                            throw new IOException();
                        }
                        SystemClock.elapsedRealtime();
                        return new pd.e(bArrR, false, listUnmodifiableList2);
                    } catch (IOException e11) {
                        e = e11;
                        aVar = aVarM;
                        if (e instanceof SocketTimeoutException) {
                            lVar = new l(27, "socket", new TimeoutError());
                        } else {
                            if (e instanceof MalformedURLException) {
                                throw new RuntimeException("Bad URL " + hVar.getUrl(), e);
                            }
                            if (aVar != null) {
                                i11 = aVar.f47701a;
                                pd.p.a("Unexpected response code %d for %s", Integer.valueOf(i11), hVar.getUrl());
                                if (0 != 0) {
                                    listUnmodifiableList = Collections.unmodifiableList(aVar.f47702b);
                                    SystemClock.elapsedRealtime();
                                    if (listUnmodifiableList != null) {
                                        if (listUnmodifiableList.isEmpty()) {
                                            Map map4 = Collections.EMPTY_MAP;
                                        } else {
                                            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                                            while (r5.hasNext()) {
                                                treeMap.put(cVar.f46776a, cVar.f46777b);
                                            }
                                        }
                                    }
                                    if (listUnmodifiableList != null) {
                                        Collections.unmodifiableList(listUnmodifiableList);
                                    }
                                    if (i11 != 401 || i11 == 403) {
                                        lVar = new l(27, "auth", new AuthFailureError());
                                    } else {
                                        if (i11 >= 400 && i11 <= 499) {
                                            throw new ClientError();
                                        }
                                        if (i11 < 500 || i11 > 599 || !hVar.shouldRetryServerErrors()) {
                                            throw new ServerError();
                                        }
                                        lVar = new l(27, "server", new ServerError());
                                    }
                                } else {
                                    lVar = new l(27, "network", new NetworkError());
                                }
                            } else {
                                if (!hVar.shouldRetryConnectionErrors()) {
                                    throw new NoConnectionError(e);
                                }
                                lVar = new l(27, "connection", new NoConnectionError());
                            }
                        }
                        str = (String) lVar.f44822b;
                        pd.m retryPolicy2 = hVar.getRetryPolicy();
                        timeoutMs = hVar.getTimeoutMs();
                        volleyError = (VolleyError) lVar.f44823c;
                        a9.e eVar2 = (a9.e) retryPolicy2;
                        i12 = eVar2.f479c + 1;
                        eVar2.f479c = i12;
                        int i15 = eVar2.f478b;
                        eVar2.f478b = i15 + ((int) (i15 * 1.0f));
                        if (i12 > 1) {
                            throw volleyError;
                        }
                        hVar.addMarker(str + "-retry [timeout=" + timeoutMs + "]");
                    }
                } catch (IOException e12) {
                    e = e12;
                    e = e;
                    if (e instanceof SocketTimeoutException) {
                        lVar = new l(27, "socket", new TimeoutError());
                    } else {
                        if (e instanceof MalformedURLException) {
                            throw new RuntimeException("Bad URL " + hVar.getUrl(), e);
                        }
                        if (aVar != null) {
                            i11 = aVar.f47701a;
                            pd.p.a("Unexpected response code %d for %s", Integer.valueOf(i11), hVar.getUrl());
                            if (0 != 0) {
                                listUnmodifiableList = Collections.unmodifiableList(aVar.f47702b);
                                SystemClock.elapsedRealtime();
                                if (listUnmodifiableList != null) {
                                    if (listUnmodifiableList.isEmpty()) {
                                        Map map5 = Collections.EMPTY_MAP;
                                    } else {
                                        treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                                        while (r5.hasNext()) {
                                            treeMap.put(cVar.f46776a, cVar.f46777b);
                                        }
                                    }
                                }
                                if (listUnmodifiableList != null) {
                                    Collections.unmodifiableList(listUnmodifiableList);
                                }
                                if (i11 != 401) {
                                    lVar = new l(27, "auth", new AuthFailureError());
                                } else {
                                    lVar = new l(27, "auth", new AuthFailureError());
                                }
                            } else {
                                lVar = new l(27, "network", new NetworkError());
                            }
                        } else {
                            if (!hVar.shouldRetryConnectionErrors()) {
                                throw new NoConnectionError(e);
                            }
                            lVar = new l(27, "connection", new NoConnectionError());
                        }
                    }
                    str = (String) lVar.f44822b;
                    pd.m retryPolicy3 = hVar.getRetryPolicy();
                    timeoutMs = hVar.getTimeoutMs();
                    volleyError = (VolleyError) lVar.f44823c;
                    a9.e eVar3 = (a9.e) retryPolicy3;
                    i12 = eVar3.f479c + 1;
                    eVar3.f479c = i12;
                    int i16 = eVar3.f478b;
                    eVar3.f478b = i16 + ((int) (i16 * 1.0f));
                    if (i12 > 1) {
                        throw volleyError;
                    }
                    hVar.addMarker(str + "-retry [timeout=" + timeoutMs + "]");
                }
            } catch (IOException e13) {
                e = e13;
            }
            hVar.addMarker(str + "-retry [timeout=" + timeoutMs + "]");
        }
    }

    public void x(float f5, v3.c cVar, rz.b0 b0Var) {
        if (f5 <= cVar.e0(n0.f42976a)) {
            return;
        }
        x1.f fVarN = re.q.n();
        vy.d dVar = null;
        fz.c cVarE = fVarN != null ? fVarN.e() : null;
        x1.f fVarR = re.q.r(fVarN);
        try {
            float fFloatValue = ((Number) ((b0.n) this.f44805c).f3614b.getValue()).floatValue();
            z1 z1Var = (z1) this.f44804b;
            if (z1Var != null) {
                z1Var.cancel(null);
            }
            b0.n nVar = (b0.n) this.f44805c;
            if (nVar.f3618f) {
                this.f44805c = b0.e.l(nVar, fFloatValue - f5, CropImageView.DEFAULT_ASPECT_RATIO, 30);
            } else {
                this.f44805c = new b0.n(b0.e.f3496j, Float.valueOf(-f5), null, 60);
            }
            this.f44804b = rz.e0.B(b0Var, null, null, new f0(this, dVar, 1), 3);
        } finally {
            re.q.t(fVarN, fVarR, cVarE);
        }
    }

    public /* synthetic */ e(int i11, boolean z11) {
        this.f44803a = i11;
    }

    public e(com.android.billingclient.api.j jVar, ArrayList arrayList) {
        this.f44803a = 4;
        this.f44804b = arrayList;
        this.f44805c = jVar;
    }

    public e(WorkDatabase workDatabase) {
        this.f44803a = 0;
        this.f44804b = workDatabase;
        this.f44805c = new b(workDatabase);
    }

    public e(aw.q qVar) {
        this.f44803a = 1;
        this.f44805c = qVar;
        this.f44804b = new ArrayList();
        for (int i11 = 0; i11 < 5; i11++) {
            ((ArrayList) this.f44804b).add(new aw.u(i11, this));
        }
    }

    public e(int i11, com.android.billingclient.api.c0 c0Var) {
        this.f44803a = 7;
        this.f44804b = c0Var;
        this.f44805c = new ec.e(i11, this);
    }

    public e(Context context) {
        this.f44803a = 5;
        ar.f fVar = new ar.f(2, (byte) 0);
        this.f44804b = context.getApplicationContext();
        this.f44805c = fVar;
    }

    public e(p3 p3Var) {
        this.f44803a = 28;
        qd.a aVar = new qd.a();
        this.f44804b = p3Var;
        this.f44805c = aVar;
    }

    @Override // ki.a
    public void B() {
    }

    public e(int i11) {
        this.f44803a = i11;
        switch (i11) {
            case 16:
                this.f44804b = new AtomicReference();
                this.f44805c = new y.e(0);
                break;
            case 19:
                this.f44805c = new float[64];
                break;
            case 22:
                j2 j2Var = b0.e.f3496j;
                Float fValueOf = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
                this.f44805c = new b0.n(j2Var, fValueOf, (b0.s) j2Var.f3575a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
            case 23:
                Level level = Level.FINE;
                Logger logger = Logger.getLogger(nw.p.class.getName());
                Preconditions.k(level, "level");
                this.f44805c = level;
                Preconditions.k(logger, "logger");
                this.f44804b = logger;
                break;
            default:
                this.f44804b = new LinkedHashMap();
                this.f44805c = new LinkedHashMap();
                break;
        }
    }

    public e(List list, int[] iArr) {
        this.f44803a = 2;
        this.f44804b = ImmutableList.n(list);
        this.f44805c = iArr;
    }
}
