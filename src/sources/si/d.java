package si;

import android.graphics.Bitmap;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import bq.z;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.HwCharPart;
import com.lingo.lingoskill.object.HwCharPartDao;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.HwCharacterDao;
import com.lingo.lingoskill.object.HwTCharPart;
import com.lingo.lingoskill.object.HwTCharPartDao;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.HwViewNew;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fv.g;
import hj.u1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import jh.h;
import jp.p0;
import kotlin.jvm.internal.m;
import lf.i0;
import o20.w;
import qp.n2;
import qy.q;
import rz.e0;
import rz.o0;
import se.n;
import ws.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends qp.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HwCharacter f51707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f51708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f51709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f51710l;

    public d(mp.b bVar, long j11) {
        super(bVar, j11);
        this.f51710l = BuildConfig.VERSION_NAME;
    }

    @Override // hi.a
    public final boolean a() {
        return true;
    }

    @Override // hi.a
    public final String b() {
        return this.f51710l;
    }

    @Override // hi.a
    public final String c() {
        String str = "2;" + this.f47882b + ";2";
        m.e(str, "toString(...)");
        return str;
    }

    @Override // qp.d, hi.a
    public final void f() {
        ta.a aVar = this.f47886f;
        m.c(aVar);
        if (((u1) aVar).f33381j != null) {
            ta.a aVar2 = this.f47886f;
            m.c(aVar2);
            HwViewNew hwViewNew = ((u1) aVar2).f33381j;
            Bitmap bitmap = hwViewNew.M;
            if (bitmap != null) {
                bitmap.recycle();
                hwViewNew.M = null;
            }
            ws.b bVar = hwViewNew.N;
            if (bVar != null) {
                bVar.b();
            }
            j jVar = hwViewNew.O;
            if (jVar != null) {
                jVar.reset();
            }
        }
        this.f47887g.f();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075 A[RETURN] */
    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        q qVar = fv.f.f28191a;
        HwCharacter hwCharacter = this.f51707i;
        if (hwCharacter == null) {
            m.n("mCurChar");
            throw null;
        }
        String pinyin = hwCharacter.getPinyin();
        m.e(pinyin, "getPinyin(...)");
        String strI = fv.f.i(pinyin);
        HwCharacter hwCharacter2 = this.f51707i;
        if (hwCharacter2 == null) {
            m.n("mCurChar");
            throw null;
        }
        String pinyin2 = hwCharacter2.getPinyin();
        m.e(pinyin2, "getPinyin(...)");
        w4.c.w(strI, 1L, fv.f.b(pinyin2), arrayList);
        HwCharacter hwCharacter3 = this.f51707i;
        if (hwCharacter3 == null) {
            m.n("mCurChar");
            throw null;
        }
        if (hwCharacter3.getAnimation() == 1) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (x.n().keyLanguage != 0) {
                if (!xt.b.f56279a) {
                    return arrayList;
                }
            }
        } else if (!xt.b.f56279a) {
            return arrayList;
        }
        q qVar2 = fv.b.f28186a;
        HwCharacter hwCharacter4 = this.f51707i;
        if (hwCharacter4 == null) {
            m.n("mCurChar");
            throw null;
        }
        String strJ = fv.b.j(hwCharacter4.getCharId());
        HwCharacter hwCharacter5 = this.f51707i;
        if (hwCharacter5 != null) {
            arrayList.add(new fv.a(3L, strJ, g.g(hwCharacter5.getCharId())));
            return arrayList;
        }
        m.n("mCurChar");
        throw null;
    }

    @Override // qp.d, hi.a
    public final String h() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // hi.a
    public final int i() {
        return 2;
    }

    @Override // hi.a
    public final void j() throws NoSuchElemException {
        try {
            k10.g gVarQueryBuilder = h.p().g().queryBuilder();
            gVarQueryBuilder.f(HwCharacterDao.Properties.CharId.b(Long.valueOf(this.f47882b)), new k10.h[0]);
            gVarQueryBuilder.f37855f = 1;
            Object obj = gVarQueryBuilder.d().get(0);
            m.e(obj, "get(...)");
            this.f51707i = (HwCharacter) obj;
            Object value = ((q) h.p().f44927c).getValue();
            m.e(value, "getValue(...)");
            k10.g gVarQueryBuilder2 = ((HwCharPartDao) value).queryBuilder();
            org.greenrobot.greendao.d dVar = HwCharPartDao.Properties.CharId;
            HwCharacter hwCharacter = this.f51707i;
            if (hwCharacter == null) {
                m.n("mCurChar");
                throw null;
            }
            gVarQueryBuilder2.f(dVar.b(Long.valueOf(hwCharacter.getCharId())), new k10.h[0]);
            List listD = gVarQueryBuilder2.d();
            m.e(listD, "list(...)");
            this.f51708j = listD;
            Object value2 = ((q) h.p().f44928d).getValue();
            m.e(value2, "getValue(...)");
            k10.g gVarQueryBuilder3 = ((HwTCharPartDao) value2).queryBuilder();
            org.greenrobot.greendao.d dVar2 = HwTCharPartDao.Properties.CharId;
            HwCharacter hwCharacter2 = this.f51707i;
            if (hwCharacter2 == null) {
                m.n("mCurChar");
                throw null;
            }
            gVarQueryBuilder3.f(dVar2.b(Long.valueOf(hwCharacter2.getCharId())), new k10.h[0]);
            List listD2 = gVarQueryBuilder3.d();
            m.e(listD2, "list(...)");
            this.f51709k = listD2;
        } catch (Exception e8) {
            e8.printStackTrace();
            throw new NoSuchElemException();
        }
    }

    @Override // qp.d
    public final fz.f n() {
        return b.f51702a;
    }

    @Override // qp.d
    public final void p() {
        mp.b bVar = this.f47881a;
        p0 p0Var = (p0) bVar;
        int i11 = 2;
        p0Var.O(2);
        ta.a aVar = this.f47886f;
        m.c(aVar);
        ((u1) aVar).f33381j.setTimeGap(200);
        ta.a aVar2 = this.f47886f;
        m.c(aVar2);
        TextView textView = ((u1) aVar2).f33379h;
        HwCharacter hwCharacter = this.f51707i;
        vy.d dVar = null;
        if (hwCharacter == null) {
            m.n("mCurChar");
            throw null;
        }
        textView.setText(hwCharacter.getPinyin());
        ta.a aVar3 = this.f47886f;
        m.c(aVar3);
        TextView textView2 = ((u1) aVar3).f33378g;
        HwCharacter hwCharacter2 = this.f51707i;
        if (hwCharacter2 == null) {
            m.n("mCurChar");
            throw null;
        }
        textView2.setText(hwCharacter2.getTranslation());
        ta.a aVar4 = this.f47886f;
        m.c(aVar4);
        ((u1) aVar4).f33381j.postDelayed(new i0(this, 10), 500L);
        Env env = this.f47884d;
        if (env.handWriteLanguage != -1) {
            p0Var.getClass();
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(p0Var);
            yz.f fVar = o0.f50940a;
            e0.B(lifecycleScope, yz.e.f58387a, null, new jr.i0(this, dVar, 27), 2);
        }
        ta.a aVar5 = this.f47886f;
        m.c(aVar5);
        int i12 = 1;
        ((u1) aVar5).f33375d.setOnClickListener(new a(this, i12));
        String strM = defpackage.e.m(xt.b.a().k(), g.g(this.f47882b));
        HwCharacter hwCharacter3 = this.f51707i;
        if (hwCharacter3 == null) {
            m.n("mCurChar");
            throw null;
        }
        if ((hwCharacter3.getAnimation() == 1 || xt.b.f56279a) && com.google.android.material.datepicker.d.D(strM)) {
            ta.a aVar6 = this.f47886f;
            m.c(aVar6);
            ((u1) aVar6).f33376e.setOnClickListener(new a(this, i11));
            ta.a aVar7 = this.f47886f;
            m.c(aVar7);
            ((u1) aVar7).f33376e.setVisibility(0);
            th.j.a(qx.h.m(600L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new w(this, 23), vx.b.f54316e), this.f47887g);
        } else {
            ta.a aVar8 = this.f47886f;
            m.c(aVar8);
            ((u1) aVar8).f33376e.setVisibility(8);
            if (env.isAudioModel) {
                s();
            }
        }
        ta.a aVar9 = this.f47886f;
        m.c(aVar9);
        ((u1) aVar9).f33374c.setVisibility(0);
        String strK = xt.d.k(env.keyLanguage);
        HwCharacter hwCharacter4 = this.f51707i;
        if (hwCharacter4 == null) {
            m.n("mCurChar");
            throw null;
        }
        String strK2 = b7.e0.k(hwCharacter4.getCharId(), strK, "_kanji_");
        ta.a aVar10 = this.f47886f;
        m.c(aVar10);
        z.b(((u1) aVar10).f33374c, new n2(18, this, strK2));
        p0 p0Var2 = (p0) bVar;
        p0Var2.getClass();
        e0.B(LifecycleOwnerKt.getLifecycleScope(p0Var2), null, null, new c(this, strK2, dVar, i12), 3);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb A[LOOP:2: B:45:0x00c5->B:47:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ec A[LOOP:3: B:51:0x00e6->B:53:0x00ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f3  */
    public final void r() {
        List list;
        List list2;
        ArrayList arrayList;
        List list3;
        Iterator it;
        ArrayList arrayList2;
        List list4;
        Iterator it2;
        HwCharacter hwCharacter = this.f51707i;
        if (hwCharacter == null) {
            m.n("mCurChar");
            throw null;
        }
        hwCharacter.getTCharacter();
        HwCharacter hwCharacter2 = this.f51707i;
        if (hwCharacter2 == null) {
            m.n("mCurChar");
            throw null;
        }
        hwCharacter2.getCharacter();
        Objects.toString(hwCharacter);
        Env env = this.f47884d;
        if (env.isSChinese) {
            list = this.f51708j;
            if (list != null) {
                m.n("mCharParts");
                throw null;
            }
            list.size();
            list2 = this.f51708j;
            if (list2 != null) {
                m.n("mCharParts");
                throw null;
            }
            Collections.sort(list2, new com.google.android.material.button.a(new rz.w(3), 8));
            arrayList = new ArrayList();
            list3 = this.f51708j;
            if (list3 != null) {
                m.n("mCharParts");
                throw null;
            }
            it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((HwCharPart) it.next()).getPartDirection());
            }
            arrayList2 = new ArrayList();
            list4 = this.f51708j;
            if (list4 != null) {
                m.n("mCharParts");
                throw null;
            }
            it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((HwCharPart) it2.next()).getPartPath());
            }
        } else {
            HwCharacter hwCharacter3 = this.f51707i;
            if (hwCharacter3 == null) {
                m.n("mCurChar");
                throw null;
            }
            String tCharacter = hwCharacter3.getTCharacter();
            HwCharacter hwCharacter4 = this.f51707i;
            if (hwCharacter4 == null) {
                m.n("mCurChar");
                throw null;
            }
            if (m.a(tCharacter, hwCharacter4.getCharacter())) {
                list = this.f51708j;
                if (list != null) {
                    m.n("mCharParts");
                    throw null;
                }
                list.size();
                list2 = this.f51708j;
                if (list2 != null) {
                    m.n("mCharParts");
                    throw null;
                }
                Collections.sort(list2, new com.google.android.material.button.a(new rz.w(3), 8));
                arrayList = new ArrayList();
                list3 = this.f51708j;
                if (list3 != null) {
                    m.n("mCharParts");
                    throw null;
                }
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((HwCharPart) it.next()).getPartDirection());
                }
                arrayList2 = new ArrayList();
                list4 = this.f51708j;
                if (list4 != null) {
                    m.n("mCharParts");
                    throw null;
                }
                it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((HwCharPart) it2.next()).getPartPath());
                }
            } else {
                List list5 = this.f51709k;
                if (list5 == null) {
                    m.n("mTCharParts");
                    throw null;
                }
                Collections.sort(list5, new com.google.android.material.button.a(new rz.w(2), 7));
                arrayList = new ArrayList();
                List list6 = this.f51709k;
                if (list6 == null) {
                    m.n("mTCharParts");
                    throw null;
                }
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((HwTCharPart) it3.next()).getPartDirection());
                }
                arrayList2 = new ArrayList();
                List list7 = this.f51709k;
                if (list7 == null) {
                    m.n("mTCharParts");
                    throw null;
                }
                Iterator it4 = list7.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((HwTCharPart) it4.next()).getPartPath());
                }
            }
        }
        try {
            ta.a aVar = this.f47886f;
            m.c(aVar);
            HwViewNew hwViewNew = ((u1) aVar).f33381j;
            HwCharacter hwCharacter5 = this.f51707i;
            if (hwCharacter5 == null) {
                m.n("mCurChar");
                throw null;
            }
            String showCharPath = hwCharacter5.getShowCharPath();
            HwCharacter hwCharacter6 = this.f51707i;
            if (hwCharacter6 == null) {
                m.n("mCurChar");
                throw null;
            }
            hwCharacter6.getCharId();
            hwViewNew.c(showCharPath, arrayList, arrayList2);
            ta.a aVar2 = this.f47886f;
            m.c(aVar2);
            ((u1) aVar2).f33381j.setAnimListener(new n(14));
            u();
            ta.a aVar3 = this.f47886f;
            m.c(aVar3);
            HwViewNew hwViewNew2 = ((u1) aVar3).f33380i;
            HwCharacter hwCharacter7 = this.f51707i;
            if (hwCharacter7 == null) {
                m.n("mCurChar");
                throw null;
            }
            String showCharPath2 = hwCharacter7.getShowCharPath();
            HwCharacter hwCharacter8 = this.f51707i;
            if (hwCharacter8 == null) {
                m.n("mCurChar");
                throw null;
            }
            hwCharacter8.getCharId();
            hwViewNew2.c(showCharPath2, arrayList, arrayList2);
            ta.a aVar4 = this.f47886f;
            m.c(aVar4);
            ((u1) aVar4).f33380i.b();
            ta.a aVar5 = this.f47886f;
            m.c(aVar5);
            ((u1) aVar5).f33380i.setBgHanziVisibility(false);
            ta.a aVar6 = this.f47886f;
            m.c(aVar6);
            ((u1) aVar6).f33380i.setBgHanziPartVisibility(true);
            ta.a aVar7 = this.f47886f;
            m.c(aVar7);
            ((u1) aVar7).f33380i.setShowBijiWhenWriting(false);
            ta.a aVar8 = this.f47886f;
            m.c(aVar8);
            ((u1) aVar8).f33380i.setShowBijiWhenWriting2(true);
            ta.a aVar9 = this.f47886f;
            m.c(aVar9);
            ((u1) aVar9).f33380i.setWritingListener(new lp.b(this, 29));
            ta.a aVar10 = this.f47886f;
            m.c(aVar10);
            ((u1) aVar10).f33377f.setOnClickListener(new a(this, 3));
            t();
            ta.a aVar11 = this.f47886f;
            m.c(aVar11);
            ((u1) aVar11).f33373b.setOnClickListener(new a(this, 0));
            if (env.isAudioModel) {
                return;
            }
            ta.a aVar12 = this.f47886f;
            m.c(aVar12);
            ((u1) aVar12).f33373b.setVisibility(8);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void s() {
        if (this.f47884d.isAudioModel) {
            String strG = xt.b.a().g();
            q qVar = fv.f.f28191a;
            HwCharacter hwCharacter = this.f51707i;
            if (hwCharacter == null) {
                m.n("mCurChar");
                throw null;
            }
            String pinyin = hwCharacter.getPinyin();
            m.e(pinyin, "getPinyin(...)");
            ((p0) this.f47881a).I(defpackage.e.m(strG, fv.f.b(pinyin)));
        }
    }

    public final void t() {
        ta.a aVar = this.f47886f;
        m.c(aVar);
        if (((u1) aVar).f33380i.R) {
            ta.a aVar2 = this.f47886f;
            m.c(aVar2);
            ((u1) aVar2).f33377f.setImageResource(R.drawable.strokes_order_new_write_onclick);
        } else {
            ta.a aVar3 = this.f47886f;
            m.c(aVar3);
            ((u1) aVar3).f33377f.setImageResource(R.drawable.strokes_order_new_write_noclick);
        }
    }

    public final void u() {
        ta.a aVar = this.f47886f;
        m.c(aVar);
        HwViewNew hwViewNew = ((u1) aVar).f33381j;
        j jVar = hwViewNew.O;
        if (jVar != null) {
            jVar.d();
        }
        ws.b bVar = hwViewNew.N;
        if (bVar != null) {
            bVar.c(0);
        }
        ta.a aVar2 = this.f47886f;
        m.c(aVar2);
        ((u1) aVar2).f33381j.setBgHanziVisibility(true);
        ta.a aVar3 = this.f47886f;
        m.c(aVar3);
        ((u1) aVar3).f33381j.setShowBijiWhenWriting(true);
    }

    @Override // hi.a
    public final void k() {
    }
}
