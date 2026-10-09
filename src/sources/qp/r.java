package qp;

import android.content.Context;
import android.graphics.Path;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.review.adapter.BaseLessonUnitReviewELemAdapter;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import rt.m5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements tx.c, ki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f48145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f48146c;

    public /* synthetic */ r(int i11, Object obj, Object obj2) {
        this.f48144a = i11;
        this.f48145b = obj;
        this.f48146c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void a(y2.i0 i0Var) {
        if (i0Var.f56902s0 > 0) {
            if (i0Var.f56893j0.f56963d == y2.e0.Idle && !i0Var.q() && !i0Var.s() && !i0Var.f56904t0 && i0Var.J()) {
                z1.q qVar = (z1.q) i0Var.f56892i0.f50089g;
                if ((qVar.f58485d & 256) != 0) {
                    while (qVar != null) {
                        if ((qVar.f58484c & 256) != 0) {
                            ?? F = qVar;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof y2.r) {
                                    y2.r rVar = (y2.r) F;
                                    rVar.m(y2.f.v(rVar, 256));
                                } else if ((F.f58484c & 256) != 0 && (F instanceof y2.n)) {
                                    z1.q qVar2 = ((y2.n) F).R;
                                    int i11 = 0;
                                    F = F;
                                    eVar = eVar;
                                    while (qVar2 != null) {
                                        if ((qVar2.f58484c & 256) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                eVar = eVar;
                                                F = qVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new n1.e(new z1.q[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.c(F);
                                                    F = 0;
                                                }
                                                eVar.c(qVar2);
                                            }
                                        }
                                        qVar2 = qVar2.f58487f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                F = y2.f.f(eVar);
                            }
                        }
                        if ((qVar.f58485d & 256) == 0) {
                            break;
                        } else {
                            qVar = qVar.f58487f;
                        }
                    }
                }
            }
            i0Var.f56901r0 = false;
            n1.e eVarA = i0Var.A();
            Object[] objArr = eVarA.f43112a;
            int i12 = eVarA.f43114c;
            for (int i13 = 0; i13 < i12; i13++) {
                a((y2.i0) objArr[i13]);
            }
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        boolean z11;
        switch (this.f48144a) {
            case 0:
                Long it = (Long) obj;
                s sVar = (s) this.f48146c;
                kotlin.jvm.internal.m.f(it, "it");
                View view = (View) this.f48145b;
                if (view != null && sVar.f48167v) {
                    View viewFindViewById = view.findViewById(R.id.arrow_left);
                    View viewFindViewById2 = view.findViewById(R.id.arrow_right);
                    view.findViewById(R.id.arrow_top).setVisibility(0);
                    viewFindViewById.setVisibility(8);
                    viewFindViewById2.setVisibility(8);
                    view.startDragAndDrop(null, new vq.c(view), new vq.d(view, sVar.f48162q), 0);
                }
                break;
            case 1:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                k2 k2Var = (k2) this.f48145b;
                Iterator it3 = k2Var.f48009j.iterator();
                kotlin.jvm.internal.m.e(it3, "iterator(...)");
                while (true) {
                    if (it3.hasNext()) {
                        Object next = it3.next();
                        kotlin.jvm.internal.m.e(next, "next(...)");
                        EditText editText = (EditText) ((View) next).findViewById(R.id.edt_text);
                        if (editText.length() == 0 && !editText.hasFocus()) {
                            editText.requestFocusFromTouch();
                            if (editText.getShowSoftInputOnFocus()) {
                                ve.i.J(editText);
                            }
                            z11 = true;
                        }
                    } else {
                        z11 = false;
                    }
                }
                k2Var.r();
                if (!z11 && !((kotlin.jvm.internal.u) this.f48146c).f38357a) {
                    th.j.a(qx.h.m(700L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.w(k2Var, 13), vx.b.f54316e), k2Var.f47887g);
                    break;
                }
                break;
            case 5:
                BaseLessonUnitReviewELemAdapter.c((Word) obj, (ReviewNew) this.f48145b, (BaseViewHolder) this.f48146c);
                break;
            default:
                Long it4 = (Long) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                boolean z12 = true;
                ((View) this.f48145b).setEnabled(true);
                zi.i iVar = (zi.i) this.f48146c;
                ta.a aVar = iVar.f59227f;
                kotlin.jvm.internal.m.c(aVar);
                int childCount = ((hj.x1) aVar).f33564c.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    ta.a aVar2 = iVar.f59227f;
                    kotlin.jvm.internal.m.c(aVar2);
                    if (((hj.x1) aVar2).f33564c.getChildAt(i11).getTag(R.id.bottom_view) != null) {
                        z12 = false;
                    }
                }
                if (z12) {
                    ((jp.p0) iVar.f59222a).O(0);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x01ce A[PHI: r6 r8
      0x01ce: PHI (r6v12 float) = (r6v11 float), (r6v11 float), (r6v28 float) binds: [B:32:0x019c, B:43:0x020f, B:38:0x01cb] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r8v1 float) = (r8v0 float), (r8v0 float), (r8v12 float) binds: [B:32:0x019c, B:43:0x020f, B:38:0x01cb] A[DONT_GENERATE, DONT_INLINE]] */
    public Path b(ArrayList arrayList) {
        int i11;
        float f5;
        float f11;
        float f12;
        Path path = (Path) this.f48146c;
        path.reset();
        ws.d dVar = (ws.d) this.f48145b;
        dVar.f55209a = CropImageView.DEFAULT_ASPECT_RATIO;
        dVar.f55210b = CropImageView.DEFAULT_ASPECT_RATIO;
        int size = arrayList.size();
        ws.c cVar = null;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            ws.c cVar2 = (ws.c) arrayList.get(i13);
            String str = cVar2.f55206a;
            ArrayList arrayList2 = cVar2.f55208c;
            if (str.equals("m")) {
                if (cVar2.f55207b) {
                    float f13 = ((ws.d) arrayList2.get(i12)).f55209a;
                    float f14 = ((ws.d) arrayList2.get(i12)).f55210b;
                    dVar.f55209a = f13;
                    dVar.f55210b = f14;
                } else {
                    float f15 = dVar.f55209a + ((ws.d) arrayList2.get(i12)).f55209a;
                    float f16 = dVar.f55210b + ((ws.d) arrayList2.get(i12)).f55210b;
                    dVar.f55209a = f15;
                    dVar.f55210b = f16;
                }
                path.moveTo(dVar.f55209a, dVar.f55210b);
                if (arrayList2.size() > 1) {
                    for (int i14 = 1; i14 < arrayList2.size(); i14++) {
                        if (cVar2.f55207b) {
                            float f17 = ((ws.d) arrayList2.get(i14)).f55209a;
                            float f18 = ((ws.d) arrayList2.get(i14)).f55210b;
                            dVar.f55209a = f17;
                            dVar.f55210b = f18;
                        } else {
                            float f19 = dVar.f55209a + ((ws.d) arrayList2.get(i14)).f55209a;
                            float f21 = dVar.f55210b + ((ws.d) arrayList2.get(i14)).f55210b;
                            dVar.f55209a = f19;
                            dVar.f55210b = f21;
                        }
                        path.lineTo(dVar.f55209a, dVar.f55210b);
                    }
                }
            } else if (cVar2.f55206a.equals("z")) {
                path.close();
            } else {
                if (!cVar2.f55206a.equals("c")) {
                    if (cVar2.f55206a.equals("s")) {
                        float f22 = dVar.f55209a;
                        float f23 = dVar.f55210b;
                        if (cVar != null) {
                            ArrayList arrayList3 = cVar.f55208c;
                            if (cVar.f55206a.equals("c")) {
                                if (cVar.f55207b) {
                                    f22 = (dVar.f55209a * 2.0f) + (((ws.d) arrayList3.get(1)).f55209a * (-1.0f));
                                    f11 = ((ws.d) arrayList3.get(1)).f55210b * (-1.0f);
                                    f12 = dVar.f55210b;
                                    f23 = (f12 * 2.0f) + f11;
                                    f5 = f22;
                                } else {
                                    float f24 = dVar.f55209a - ((ws.d) arrayList3.get(2)).f55209a;
                                    float f25 = dVar.f55210b - ((ws.d) arrayList3.get(2)).f55210b;
                                    f5 = (dVar.f55209a * 2.0f) + ((((ws.d) arrayList3.get(1)).f55209a + f24) * (-1.0f));
                                    f23 = (dVar.f55210b * 2.0f) + ((((ws.d) arrayList3.get(1)).f55210b + f25) * (-1.0f));
                                }
                            } else if (!cVar.f55206a.equals("s")) {
                                f5 = f22;
                            } else if (cVar.f55207b) {
                                f22 = (dVar.f55209a * 2.0f) + (((ws.d) arrayList3.get(0)).f55209a * (-1.0f));
                                f11 = ((ws.d) arrayList3.get(0)).f55210b * (-1.0f);
                                f12 = dVar.f55210b;
                                f23 = (f12 * 2.0f) + f11;
                                f5 = f22;
                            } else {
                                float f26 = dVar.f55209a - ((ws.d) arrayList3.get(1)).f55209a;
                                float f27 = dVar.f55210b - ((ws.d) arrayList3.get(1)).f55210b;
                                f5 = (dVar.f55209a * 2.0f) + ((((ws.d) arrayList3.get(0)).f55209a + f26) * (-1.0f));
                                f23 = (dVar.f55210b * 2.0f) + ((((ws.d) arrayList3.get(0)).f55210b + f27) * (-1.0f));
                            }
                        } else {
                            f5 = f22;
                        }
                        float f28 = f23;
                        if (cVar2.f55207b) {
                            path.cubicTo(f5, f28, ((ws.d) arrayList2.get(0)).f55209a, ((ws.d) arrayList2.get(0)).f55210b, ((ws.d) arrayList2.get(1)).f55209a, ((ws.d) arrayList2.get(1)).f55210b);
                            float f29 = ((ws.d) arrayList2.get(1)).f55209a;
                            float f30 = ((ws.d) arrayList2.get(1)).f55210b;
                            dVar.f55209a = f29;
                            dVar.f55210b = f30;
                        } else {
                            path.cubicTo(f5, f28, ((ws.d) arrayList2.get(0)).f55209a + dVar.f55209a, ((ws.d) arrayList2.get(0)).f55210b + dVar.f55210b, ((ws.d) arrayList2.get(1)).f55209a + dVar.f55209a, ((ws.d) arrayList2.get(1)).f55210b + dVar.f55210b);
                            float f31 = ((ws.d) arrayList2.get(1)).f55209a + dVar.f55209a;
                            float f32 = ((ws.d) arrayList2.get(1)).f55210b + dVar.f55210b;
                            dVar.f55209a = f31;
                            dVar.f55210b = f32;
                        }
                    } else if (cVar2.f55206a.equals("v")) {
                        if (cVar2.f55207b) {
                            path.lineTo(dVar.f55209a, ((ws.d) arrayList2.get(0)).f55210b);
                            dVar.f55210b = ((ws.d) arrayList2.get(0)).f55210b;
                        } else {
                            path.lineTo(dVar.f55209a, ((ws.d) arrayList2.get(0)).f55210b + dVar.f55210b);
                            dVar.f55210b = ((ws.d) arrayList2.get(0)).f55210b + dVar.f55210b;
                        }
                    } else if (cVar2.f55206a.equals("h")) {
                        if (cVar2.f55207b) {
                            path.lineTo(((ws.d) arrayList2.get(0)).f55209a, dVar.f55210b);
                            dVar.f55209a = ((ws.d) arrayList2.get(0)).f55209a;
                        } else {
                            path.lineTo(((ws.d) arrayList2.get(0)).f55209a + dVar.f55209a, dVar.f55210b);
                            dVar.f55209a = ((ws.d) arrayList2.get(0)).f55209a + dVar.f55209a;
                        }
                    } else if (cVar2.f55206a.equals("l")) {
                        if (cVar2.f55207b) {
                            i11 = 0;
                            float f33 = ((ws.d) arrayList2.get(0)).f55209a;
                            float f34 = ((ws.d) arrayList2.get(0)).f55210b;
                            dVar.f55209a = f33;
                            dVar.f55210b = f34;
                        } else {
                            i11 = 0;
                            float f35 = dVar.f55209a + ((ws.d) arrayList2.get(0)).f55209a;
                            float f36 = dVar.f55210b + ((ws.d) arrayList2.get(0)).f55210b;
                            dVar.f55209a = f35;
                            dVar.f55210b = f36;
                        }
                        path.lineTo(dVar.f55209a, dVar.f55210b);
                    }
                    i11 = 0;
                } else if (cVar2.f55207b) {
                    path.cubicTo(((ws.d) arrayList2.get(i12)).f55209a, ((ws.d) arrayList2.get(i12)).f55210b, ((ws.d) arrayList2.get(1)).f55209a, ((ws.d) arrayList2.get(1)).f55210b, ((ws.d) arrayList2.get(2)).f55209a, ((ws.d) arrayList2.get(2)).f55210b);
                    float f37 = ((ws.d) arrayList2.get(2)).f55209a;
                    float f38 = ((ws.d) arrayList2.get(2)).f55210b;
                    dVar.f55209a = f37;
                    dVar.f55210b = f38;
                } else {
                    path.cubicTo(((ws.d) arrayList2.get(i12)).f55209a + dVar.f55209a, ((ws.d) arrayList2.get(i12)).f55210b + dVar.f55210b, ((ws.d) arrayList2.get(1)).f55209a + dVar.f55209a, ((ws.d) arrayList2.get(1)).f55210b + dVar.f55210b, ((ws.d) arrayList2.get(2)).f55209a + dVar.f55209a, ((ws.d) arrayList2.get(2)).f55210b + dVar.f55210b);
                    float f39 = dVar.f55209a + ((ws.d) arrayList2.get(2)).f55209a;
                    float f40 = dVar.f55210b + ((ws.d) arrayList2.get(2)).f55210b;
                    dVar.f55209a = f39;
                    dVar.f55210b = f40;
                }
                i13++;
                i12 = i11;
                cVar = cVar2;
            }
            i11 = i12;
            i13++;
            i12 = i11;
            cVar = cVar2;
        }
        return path;
    }

    public String c(td.g gVar) {
        String str;
        synchronized (((h7.t) this.f48145b)) {
            str = (String) ((h7.t) this.f48145b).a(gVar);
        }
        if (str == null) {
            xd.e eVar = (xd.e) ((ob.m) this.f48146c).acquire();
            try {
                gVar.a(eVar.f56014a);
                byte[] bArrDigest = eVar.f56014a.digest();
                char[] cArr = pe.m.f46831b;
                synchronized (cArr) {
                    for (int i11 = 0; i11 < bArrDigest.length; i11++) {
                        byte b3 = bArrDigest[i11];
                        int i12 = i11 * 2;
                        char[] cArr2 = pe.m.f46830a;
                        cArr[i12] = cArr2[(b3 & 255) >>> 4];
                        cArr[i12 + 1] = cArr2[b3 & 15];
                    }
                    str = new String(cArr);
                }
                ((ob.m) this.f48146c).c(eVar);
            } catch (Throwable th2) {
                ((ob.m) this.f48146c).c(eVar);
                throw th2;
            }
        }
        synchronized (((h7.t) this.f48145b)) {
            ((h7.t) this.f48145b).d(gVar, str);
        }
        return str;
    }

    public void d(y6.z0 z0Var) {
        Handler handler = (Handler) this.f48145b;
        if (handler != null) {
            handler.post(new pb.b(17, this, z0Var));
        }
    }

    @Override // ki.a
    public void m() {
        tp.h hVar = (tp.h) this.f48145b;
        try {
            lc.d dVar = hVar.O;
            if (dVar == null) {
                Context contextRequireContext = hVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                lc.d dVar2 = new lc.d(contextRequireContext);
                hz.b.t(dVar2, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                dVar2.a();
                dVar2.show();
                hVar.O = dVar2;
            } else {
                dVar.show();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        ta.a aVar = hVar.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.g3) aVar).f32613b.setVisibility(8);
        ta.a aVar2 = hVar.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.g3) aVar2).f32614c.setVisibility(8);
        th.j.a(new ay.x(new com.google.common.cache.a(9, hVar, (String) this.f48146c)).k(ky.e.f38937b).g(px.b.a()).h(new m5(hVar, 4), new tp.g(hVar, 0)), hVar.f36401t);
    }

    public r(BaseLessonUnitReviewELemAdapter baseLessonUnitReviewELemAdapter, ReviewNew reviewNew, BaseViewHolder baseViewHolder) {
        this.f48144a = 5;
        this.f48145b = reviewNew;
        this.f48146c = baseViewHolder;
    }

    public r(int i11) {
        this.f48144a = i11;
        switch (i11) {
            case 9:
                this.f48145b = new h7.t(1000L);
                this.f48146c = qe.d.a(10, new re.v(14));
                break;
            case 10:
                this.f48145b = new n1.e(new y2.i0[16]);
                break;
            case 11:
                this.f48145b = new n1.e(new Reference[16]);
                this.f48146c = new ReferenceQueue();
                break;
            default:
                this.f48145b = new ws.d();
                this.f48146c = new Path();
                break;
        }
    }

    @Override // ki.a
    public void B() {
    }

    public r(Handler handler, f7.x xVar) {
        this.f48144a = 6;
        if (xVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f48145b = handler;
        this.f48146c = xVar;
    }
}
