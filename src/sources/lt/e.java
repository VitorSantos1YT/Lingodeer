package lt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.ViewModelKt;
import bq.z;
import com.google.android.flexbox.FlexboxLayout;
import com.google.api.Service;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.polskill.ui.learn.POLSyllableIntroductionActivity;
import com.lingo.lingoskill.thaiskill.ui.learn.THAISyllableIntroductionActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.SyllableWriteLesson;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.lingodeer.leaderboard.model.LeaderBoardEmojiStatusKt;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.x4;
import hj.d2;
import hj.j2;
import hj.m1;
import hj.u2;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import jp.p0;
import kotlin.jvm.internal.m;
import m00.a0;
import m00.d0;
import m00.l0;
import m00.o;
import m00.w;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import oo.y;
import oz.q;
import oz.x;
import ph.p;
import ph.r;
import ph.s;
import qp.a5;
import qp.d3;
import qp.d5;
import qp.k2;
import qp.k3;
import qp.p3;
import qp.s1;
import qp.v3;
import qy.b0;
import qy.l;
import rt.b4;
import rt.e0;
import rt.jf;
import rt.m0;
import rt.n;
import rt.x8;
import uz.i1;
import uz.x0;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40319b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f40318a = i11;
        this.f40319b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:213:0x0591 A[Catch: all -> 0x052c, TRY_LEAVE, TryCatch #7 {all -> 0x052c, blocks: (B:113:0x03dc, B:115:0x03e9, B:116:0x03f6, B:126:0x0457, B:128:0x0462, B:184:0x0532, B:213:0x0591, B:219:0x05b1, B:210:0x058b, B:180:0x052b, B:176:0x0522, B:225:0x05bc, B:228:0x05cb, B:229:0x05d2, B:230:0x05d3, B:231:0x05d6, B:232:0x05d7, B:233:0x05ec, B:173:0x051d, B:207:0x0586, B:117:0x03fe, B:119:0x0407, B:125:0x0435, B:222:0x05b4, B:223:0x05b9), top: B:267:0x03dc, inners: #1, #6, #9 }] */
    /* JADX WARN: Code duplicated, block: B:217:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:272:0x05ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x05a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // fz.a
    public final Object invoke() throws IllegalAccessException, IOException, InvocationTargetException {
        int iM0;
        long j11;
        d0 d0Var;
        Throwable th2;
        l lVar;
        Throwable th3;
        Throwable th4;
        l lVar2;
        int i11 = this.f40318a;
        int i12 = 6;
        int i13 = 4;
        long j12 = 0;
        int i14 = 1;
        boolean z11 = false;
        b0 b0Var = b0.f48488a;
        Object obj = this.f40319b;
        switch (i11) {
            case 0:
                return Float.valueOf(((jf) obj).f49951d);
            case 1:
                i1 i1Var = ((e0) obj).f49662e;
                i1Var.getClass();
                i1Var.l(null, n.f50107a);
                return b0Var;
            case 2:
                return com.bumptech.glide.d.G((x8) obj);
            case 3:
                b4 b4Var = (b4) obj;
                m0 m0Var = (m0) b4Var.f49503m0.f53391a.getValue();
                if (m0Var != null) {
                    b4Var.k(m0Var);
                }
                return b0Var;
            case 4:
                n00.e eVar = (n00.e) obj;
                ClassLoader classLoader = eVar.f43070c;
                o oVar = eVar.f43071d;
                Enumeration<URL> resources = classLoader.getResources(BuildConfig.VERSION_NAME);
                m.e(resources, "getResources(...)");
                ArrayList list = Collections.list(resources);
                m.e(list, "list(...)");
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj2 = list.get(i15);
                    i15++;
                    URL url = (URL) obj2;
                    m.c(url);
                    if (m.a(url.getProtocol(), "file")) {
                        String str = a0.f40673b;
                        lVar2 = new l(oVar, p20.c.n(new File(url.toURI())));
                    } else {
                        lVar2 = null;
                    }
                    if (lVar2 != null) {
                        arrayList.add(lVar2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                m.e(resources2, "getResources(...)");
                ArrayList list2 = Collections.list(resources2);
                m.e(list2, "list(...)");
                ArrayList arrayList2 = new ArrayList();
                int size2 = list2.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj3 = list2.get(i16);
                    i16++;
                    URL url2 = (URL) obj3;
                    m.c(url2);
                    String string = url2.toString();
                    m.e(string, "toString(...)");
                    if (x.s0(string, "jar:file:", false) && (iM0 = q.M0(i12, string, "!")) != -1) {
                        String str2 = a0.f40673b;
                        String strSubstring = string.substring(i13, iM0);
                        m.e(strSubstring, "substring(...)");
                        a0 a0VarN = p20.c.n(new File(URI.create(strSubstring)));
                        w wVarV = oVar.v(a0VarN);
                        try {
                            long size3 = wVarV.size() - ((long) 22);
                            if (size3 < j12) {
                                throw new IOException("not a zip: size=" + wVarV.size());
                            }
                            long jMax = Math.max(size3 - 65536, j12);
                            j11 = j12;
                            long j13 = size3;
                            while (true) {
                                d0 d0VarC = m00.b.c(wVarV.a(j13));
                                try {
                                    if (d0VarC.d() == 101010256) {
                                        boolean zF = d0VarC.f() & 65535;
                                        boolean zF2 = d0VarC.f() & 65535;
                                        long jF = d0VarC.f() & 65535;
                                        if (jF != (d0VarC.f() & 65535) || zF != 0 || zF2 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        d0VarC.skip(4L);
                                        long jD = ((long) d0VarC.d()) & 4294967295L;
                                        int iF = d0VarC.f() & 65535;
                                        i9.f fVar = new i9.f(jF, iF, jD);
                                        d0VarC.h(iF);
                                        d0VarC.close();
                                        long j14 = j13 - ((long) 20);
                                        if (j14 > j11) {
                                            d0 d0VarC2 = m00.b.c(wVarV.a(j14));
                                            try {
                                                if (d0VarC2.d() == 117853008) {
                                                    int iD = d0VarC2.d();
                                                    long jE = d0VarC2.e();
                                                    if (d0VarC2.d() != 1 || iD != 0) {
                                                        throw new IOException("unsupported zip: spanned");
                                                    }
                                                    try {
                                                        d0 d0VarC3 = m00.b.c(wVarV.a(jE));
                                                        try {
                                                            int iD2 = d0VarC3.d();
                                                            if (iD2 != 101075792) {
                                                                throw new IOException("bad zip: expected " + n00.b.c(101075792) + " but was " + n00.b.c(iD2));
                                                            }
                                                            d0VarC3.skip(12L);
                                                            int iD3 = d0VarC3.d();
                                                            int iD4 = d0VarC3.d();
                                                            long jE2 = d0VarC3.e();
                                                            if (jE2 != d0VarC3.e() || iD3 != 0 || iD4 != 0) {
                                                                throw new IOException("unsupported zip: spanned");
                                                            }
                                                            d0VarC3.skip(8L);
                                                            i9.f fVar2 = new i9.f(jE2, iF, d0VarC3.e());
                                                            try {
                                                                d0VarC3.close();
                                                                th4 = null;
                                                            } catch (Throwable th5) {
                                                                th4 = th5;
                                                            }
                                                            fVar = fVar2;
                                                            if (th4 != null) {
                                                                throw th4;
                                                            }
                                                        } catch (Throwable th6) {
                                                            try {
                                                                d0VarC3.close();
                                                            } catch (Throwable th7) {
                                                                cf.x.b(th6, th7);
                                                            }
                                                            th4 = th6;
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        Throwable th9 = th;
                                                        try {
                                                            d0VarC2.close();
                                                        } catch (Throwable th10) {
                                                            cf.x.b(th9, th10);
                                                        }
                                                        th3 = th9;
                                                    }
                                                    break;
                                                }
                                                try {
                                                    d0VarC2.close();
                                                    th3 = null;
                                                } catch (Throwable th11) {
                                                    th3 = th11;
                                                }
                                            } catch (Throwable th12) {
                                                th = th12;
                                            }
                                            if (th3 != null) {
                                                throw th3;
                                            }
                                        }
                                        i9.f fVar3 = fVar;
                                        ArrayList arrayList3 = new ArrayList();
                                        d0 d0VarC4 = m00.b.c(wVarV.a(fVar3.f34276b));
                                        try {
                                            long j15 = fVar3.f34275a;
                                            long j16 = j11;
                                            while (j16 < j15) {
                                                n00.g gVarD = n00.b.d(d0VarC4);
                                                d0Var = d0VarC4;
                                                long j17 = j15;
                                                try {
                                                    if (gVarD.f43080h >= fVar3.f34276b) {
                                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                                    }
                                                    a0 a0Var = n00.e.f43069f;
                                                    if (p20.c.b(gVarD.f43073a)) {
                                                        arrayList3.add(gVarD);
                                                    }
                                                    j16++;
                                                    d0VarC4 = d0Var;
                                                    j15 = j17;
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    Throwable th14 = th;
                                                    try {
                                                        d0Var.close();
                                                    } catch (Throwable th15) {
                                                        cf.x.b(th14, th15);
                                                    }
                                                    th2 = th14;
                                                    if (th2 == null) {
                                                        throw th2;
                                                    }
                                                    l0 l0Var = new l0(a0VarN, oVar, n00.b.b(arrayList3));
                                                    try {
                                                        wVarV.close();
                                                        break;
                                                    } catch (Throwable unused) {
                                                    }
                                                    lVar = new l(l0Var, n00.e.f43069f);
                                                    if (lVar != null) {
                                                        arrayList2.add(lVar);
                                                    }
                                                    j12 = j11;
                                                    i12 = 6;
                                                    i13 = 4;
                                                }
                                                break;
                                            }
                                            try {
                                                d0VarC4.close();
                                                th2 = null;
                                            } catch (Throwable th16) {
                                                th2 = th16;
                                            }
                                        } catch (Throwable th17) {
                                            th = th17;
                                            d0Var = d0VarC4;
                                        }
                                        if (th2 == null) {
                                            throw th2;
                                        }
                                        l0 l0Var2 = new l0(a0VarN, oVar, n00.b.b(arrayList3));
                                        wVarV.close();
                                        lVar = new l(l0Var2, n00.e.f43069f);
                                        if (wVarV != null) {
                                            throw th;
                                        }
                                        try {
                                            wVarV.close();
                                            throw th;
                                        } catch (Throwable th18) {
                                            cf.x.b(th, th18);
                                            throw th;
                                        }
                                    }
                                    d0VarC.close();
                                    j13--;
                                    if (j13 < jMax) {
                                        throw new IOException("not a zip: end of central directory signature not found");
                                    }
                                } catch (Throwable th19) {
                                    d0VarC.close();
                                    throw th19;
                                }
                            }
                        } catch (Throwable th20) {
                            if (wVarV != null) {
                                throw th20;
                            }
                            wVarV.close();
                            throw th20;
                        }
                    } else {
                        j11 = j12;
                        lVar = null;
                    }
                    if (lVar != null) {
                        arrayList2.add(lVar);
                    }
                    j12 = j11;
                    i12 = 6;
                    i13 = 4;
                }
                return ry.m.H0(arrayList, arrayList2);
            case 5:
                s sVar = (s) obj;
                PdLesson pdLesson = ((p) sVar.f46913b.getValue()).f46903a;
                if (pdLesson != null) {
                    rz.e0.B(ViewModelKt.getViewModelScope(sVar), null, null, new r(pdLesson, sVar, null), 3);
                }
                return b0Var;
            case 6:
                ni.m mVar = (ni.m) obj;
                Bundle bundleE = b7.e0.e("type", "special_lifetime_sale");
                if (mVar.T.length() > 0) {
                    bundleE.putString("source", mVar.T);
                }
                return bundleE;
            case 7:
                int i17 = POLSyllableIntroductionActivity.f21985t;
                ((POLSyllableIntroductionActivity) obj).finish();
                return b0Var;
            case 8:
                qv.e eVar2 = (qv.e) obj;
                rz.e0.B(ViewModelKt.getViewModelScope(eVar2), null, null, new cj.b(eVar2, (vy.d) null, i12), 3);
                return b0Var;
            case 9:
                return obj;
            case 10:
                Http2Connection http2Connection = (Http2Connection) obj;
                Http2Connection.Companion companion = Http2Connection.f45421c0;
                http2Connection.getClass();
                try {
                    http2Connection.Z.f(2, 0, false);
                    break;
                } catch (IOException e8) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.a(errorCode, errorCode, e8);
                }
                return b0Var;
            case 11:
                Bundle bundle = new Bundle();
                b7.e0.v(((y) obj).N, bundle, "U", "unit");
                return bundle;
            case 12:
                return (f2.c) obj;
            case 13:
                vy.d dVar = null;
                ph.a0 a0Var2 = (ph.a0) obj;
                mh.b[] bVarArr = a0Var2.f46845f;
                int length = bVarArr.length;
                System.currentTimeMillis();
                int iW = ry.x.W(bVarArr.length);
                if (iW < 16) {
                    iW = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                int length2 = bVarArr.length;
                int i18 = 0;
                while (i18 < length2) {
                    mh.b bVar = bVarArr[i18];
                    bVar.getClass();
                    linkedHashMap.put(bVar, n9.m.a(x0.B(((x4) a0Var2.f46841b).f27974g, new gu.d(i14, a0Var2, bVar, dVar)), ViewModelKt.getViewModelScope(a0Var2)));
                    i18++;
                    dVar = null;
                }
                System.currentTimeMillis();
                return linkedHashMap;
            case 14:
                return Float.valueOf(((AchievementLanguage) obj).getProgress());
            case 15:
                return com.bumptech.glide.d.G((SyllableWriteLesson) obj);
            case 16:
                q0.g gVar = (q0.g) obj;
                gVar.f47346o0.invoke(Boolean.valueOf(!gVar.f47345n0));
                return b0Var;
            case 17:
                qh.e eVar3 = (qh.e) obj;
                eVar3.A();
                eVar3.C();
                return b0Var;
            case 18:
                qp.s sVar2 = (qp.s) obj;
                ta.a aVar = sVar2.f47886f;
                m.c(aVar);
                w0 w0VarB = s0.b(((m1) aVar).f32913e);
                ta.a aVar2 = sVar2.f47886f;
                m.c(aVar2);
                w0VarB.l(-((m1) aVar2).f32913e.getHeight());
                w0VarB.e(400L);
                w0VarB.i();
                return b0Var;
            case 19:
                s1 s1Var = (s1) obj;
                int i19 = s1Var.f48175p;
                for (int i21 = 0; i21 < i19; i21++) {
                    ta.a aVar3 = s1Var.f47886f;
                    m.c(aVar3);
                    if (((j2) aVar3).f32756b.getChildAt(i21) != null) {
                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) s1Var.o().findViewById(R.id.hor_scroll_view);
                        ImageView imageView = (ImageView) s1Var.o().findViewById(R.id.iv_sentence_more);
                        LinearLayout linearLayout = (LinearLayout) s1Var.o().findViewById(R.id.ll_word);
                        m.c(horizontalScrollView);
                        horizontalScrollView.postDelayed(new b2.c(i13, horizontalScrollView, new mt.l0(horizontalScrollView, linearLayout, imageView, 17)), 0L);
                    }
                }
                return b0Var;
            case 20:
                ((View) ((k2) obj).f48009j.get(0)).requestFocus();
                return b0Var;
            case 21:
                ta.a aVar4 = ((d3) obj).f47886f;
                m.c(aVar4);
                ((d2) aVar4).f32485f.performClick();
                return b0Var;
            case 22:
                Bundle bundle2 = new Bundle();
                mp.b bVar2 = ((k3) obj).f47881a;
                b7.e0.v(bVar2.d(), bundle2, "U", "unit");
                p0 p0Var = (p0) bVar2;
                b7.e0.v(p0Var.f36525a0, bundle2, "L", "lesson");
                bundle2.putString("mode", p0Var.f36534j0);
                return bundle2;
            case 23:
                ((p3) obj).k();
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                v3 v3Var = (v3) obj;
                ta.a aVar5 = v3Var.f47886f;
                m.c(aVar5);
                CardView cardView = (CardView) ((u2) aVar5).f33385d.f32490c;
                ta.a aVar6 = v3Var.f47886f;
                m.c(aVar6);
                CardView cardView2 = (CardView) ((u2) aVar6).f33386e.f32490c;
                ta.a aVar7 = v3Var.f47886f;
                m.c(aVar7);
                CardView cardView3 = (CardView) ((u2) aVar7).f33387f.f32490c;
                ta.a aVar8 = v3Var.f47886f;
                m.c(aVar8);
                return new CardView[]{cardView, cardView2, cardView3, (CardView) ((u2) aVar8).f33388g.f32490c};
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                d5 d5Var = (d5) obj;
                ArrayList arrayList4 = d5Var.f47903l;
                if (arrayList4 == null) {
                    m.n("views");
                    throw null;
                }
                int size4 = arrayList4.size();
                int i22 = 0;
                while (i22 < size4) {
                    Object obj4 = d5Var.r().get(i22);
                    m.e(obj4, "get(...)");
                    Word word = (Word) obj4;
                    ArrayList arrayList5 = d5Var.f47903l;
                    if (arrayList5 == null) {
                        m.n("views");
                        throw null;
                    }
                    CardView cardView4 = (CardView) arrayList5.get(i22);
                    ((TextView) cardView4.findViewById(R.id.tv_word)).setText(word.getWord());
                    View viewFindViewById = cardView4.findViewById(R.id.flex_option);
                    m.e(viewFindViewById, "findViewById(...)");
                    FlexboxLayout flexboxLayout = (FlexboxLayout) viewFindViewById;
                    z.b(cardView4, new a5(d5Var, word, z11 ? 1 : 0));
                    cardView4.setEnabled(z11);
                    List<String> list3 = d5Var.f47902k;
                    if (list3 == null) {
                        m.n("itemOptions");
                        throw null;
                    }
                    for (String str3 : list3) {
                        View viewInflate = LayoutInflater.from(d5Var.f47883c).inflate(R.layout.item_word_13_check_box, flexboxLayout, z11);
                        int width = flexboxLayout.getWidth() - ff.h.l(32.0f);
                        List list4 = d5Var.f47902k;
                        if (list4 == null) {
                            m.n("itemOptions");
                            throw null;
                        }
                        viewInflate.setLayoutParams(new FlexboxLayout.LayoutParams(width / list4.size(), -2));
                        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_check_box);
                        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_item_text);
                        imageView2.setImageResource(0);
                        imageView2.setBackgroundResource(R.drawable.bg_word_13_check);
                        textView.setText(str3);
                        flexboxLayout.addView(viewInflate);
                        Word word2 = word;
                        z.b(viewInflate, new bp.r(d5Var, word2, str3, imageView2, textView, cardView4, flexboxLayout, viewInflate, 3));
                        word = word2;
                        z11 = false;
                    }
                    i22++;
                    z11 = false;
                }
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                Bundle bundleE2 = b7.e0.e("source", "leaderboard_detail");
                bundleE2.putString("status", LeaderBoardEmojiStatusKt.getLeaderBoardEmojiStatusEventStatus(((LeaderBoardUser) obj).getEmojiStatus()));
                return bundleE2;
            case 27:
                int i23 = THAISyllableIntroductionActivity.M;
                ((THAISyllableIntroductionActivity) obj).finish();
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return kotlin.jvm.internal.l.a((Object[]) obj);
            default:
                return (j3.h) obj;
        }
    }
}
