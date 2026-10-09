package qh;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.FacebookException;
import com.lingo.fluent.object.WordOptions;
import com.lingo.lingoskill.widget.AutoResizeTextView;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import hj.v1;
import hj.w5;
import java.util.ArrayList;
import java.util.HashMap;
import jp.g1;
import jp.h1;
import jp.p0;
import lf.l1;
import qp.b2;
import tf.l0;
import z2.z0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z implements th.c, tx.c, g1, l1, z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f47796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f47797c;

    public /* synthetic */ z(int i11, Object obj, Object obj2) {
        this.f47795a = i11;
        this.f47796b = obj;
        this.f47797c = obj2;
    }

    @Override // th.c, th.b
    public void a() {
        c0 c0Var = (c0) this.f47796b;
        sh.c cVar = c0Var.S;
        if (cVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        if (cVar.f51691f) {
            cVar.L = true;
            return;
        }
        ta.a aVar = c0Var.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((w5) aVar).f33525b.stop();
        c0Var.E((WordOptions) this.f47797c);
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f47795a) {
            case 1:
                Long it = (Long) obj;
                View view = (View) this.f47797c;
                kotlin.jvm.internal.m.f(it, "it");
                qp.s sVar = (qp.s) this.f47796b;
                if (sVar.f48166u) {
                    view.startDragAndDrop(null, new vq.c(view), new vq.d(view, sVar.f48161p), 0);
                }
                break;
            case 2:
                Long it2 = (Long) obj;
                b2 b2Var = (b2) this.f47797c;
                kotlin.jvm.internal.m.f(it2, "it");
                View view2 = (View) this.f47796b;
                if (view2 != null && b2Var.f47855v) {
                    View viewFindViewById = view2.findViewById(R.id.arrow_left);
                    View viewFindViewById2 = view2.findViewById(R.id.arrow_right);
                    view2.findViewById(R.id.arrow_top).setVisibility(0);
                    viewFindViewById.setVisibility(8);
                    viewFindViewById2.setVisibility(8);
                    view2.startDragAndDrop(null, new vq.c(view2), new vq.d(view2, b2Var.f47850q), 0);
                }
                break;
            case 3:
                Long it3 = (Long) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                ((rq.b) this.f47796b).m((RelativeLayout) this.f47797c);
                break;
            default:
                Long it4 = (Long) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                zi.g gVar = (zi.g) this.f47796b;
                mp.b bVar = gVar.f59222a;
                String str = (String) this.f47797c;
                ta.a aVar = gVar.f59227f;
                kotlin.jvm.internal.m.c(aVar);
                ImageView ivAudio = (ImageView) ((v1) aVar).f33450d.f32408d;
                kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                ((p0) bVar).H(ivAudio, str);
                break;
        }
    }

    @Override // lf.l1
    public void b(Bundle bundle, FacebookException facebookException) {
        l0 l0Var = (l0) this.f47796b;
        tf.t request = (tf.t) this.f47797c;
        l0Var.getClass();
        kotlin.jvm.internal.m.f(request, "request");
        l0Var.s(request, bundle, facebookException);
    }

    @Override // z2.z0
    public void c(View view, float[] fArr) {
        g2.k0.d(fArr);
        j(view, fArr);
    }

    public Object d(wd.g gVar) {
        HashMap map = (HashMap) this.f47797c;
        wd.c cVar = (wd.c) map.get(gVar);
        if (cVar == null) {
            cVar = new wd.c(gVar);
            map.put(gVar, cVar);
        } else {
            gVar.a();
        }
        wd.c cVar2 = cVar.f55072d;
        cVar2.f55071c = cVar.f55071c;
        cVar.f55071c.f55072d = cVar2;
        wd.c cVar3 = (wd.c) this.f47796b;
        cVar.f55072d = cVar3;
        wd.c cVar4 = cVar3.f55071c;
        cVar.f55071c = cVar4;
        cVar4.f55072d = cVar;
        cVar.f55072d.f55071c = cVar;
        ArrayList arrayList = cVar.f55070b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return cVar.f55070b.remove(size - 1);
        }
        return null;
    }

    @Override // jp.g1
    public void e() {
        switch (this.f47795a) {
            case 4:
                sq.v vVar = (sq.v) this.f47796b;
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(vVar), null, null, new mv.f0(vVar, null, 27), 3);
                break;
            default:
                ui.h hVar = (ui.h) this.f47796b;
                l.m mVar = hVar.f36398d;
                if (mVar != null) {
                    mVar.setResult(INTENTS.RESULT_LESSON_QUIT);
                    l.m mVar2 = hVar.f36398d;
                    kotlin.jvm.internal.m.c(mVar2);
                    mVar2.finish();
                }
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(hVar), null, null, new tp.f0(hVar, (vy.d) null, 3), 3);
                break;
        }
    }

    @Override // jp.g1
    public void f() {
        switch (this.f47795a) {
            case 4:
                ((h1) this.f47797c).v();
                break;
            default:
                ((h1) this.f47797c).v();
                break;
        }
    }

    public void g(wd.g gVar, Object obj) {
        HashMap map = (HashMap) this.f47797c;
        wd.c cVar = (wd.c) map.get(gVar);
        if (cVar == null) {
            cVar = new wd.c(gVar);
            cVar.f55072d = cVar;
            wd.c cVar2 = (wd.c) this.f47796b;
            cVar.f55072d = cVar2.f55072d;
            cVar.f55071c = cVar2;
            cVar2.f55072d = cVar;
            cVar.f55072d.f55071c = cVar;
            map.put(gVar, cVar);
        } else {
            gVar.a();
        }
        if (cVar.f55070b == null) {
            cVar.f55070b = new ArrayList();
        }
        cVar.f55070b.add(obj);
    }

    public void h(String str) {
        xd.b bVar;
        synchronized (this) {
            try {
                bVar = (xd.b) ((HashMap) this.f47796b).get(str);
                pe.f.c(bVar, "Argument must not be null");
                int i11 = bVar.f56007b;
                if (i11 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f56007b);
                }
                int i12 = i11 - 1;
                bVar.f56007b = i12;
                if (i12 == 0) {
                    xd.b bVar2 = (xd.b) ((HashMap) this.f47796b).remove(str);
                    if (!bVar2.equals(bVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                    }
                    ge.a aVar = (ge.a) this.f47797c;
                    synchronized (aVar.f29130a) {
                        try {
                            if (aVar.f29130a.size() < 10) {
                                aVar.f29130a.offer(bVar2);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        bVar.f56006a.unlock();
    }

    public Object i() {
        wd.c cVar = (wd.c) this.f47796b;
        wd.c cVar2 = cVar.f55072d;
        while (true) {
            boolean zEquals = cVar2.equals(cVar);
            Object obj = cVar2.f55069a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = cVar2.f55070b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? cVar2.f55070b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            wd.c cVar3 = cVar2.f55072d;
            cVar3.f55071c = cVar2.f55071c;
            cVar2.f55071c.f55072d = cVar3;
            ((HashMap) this.f47797c).remove(obj);
            ((wd.g) obj).a();
            cVar2 = cVar2.f55072d;
        }
    }

    public void j(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.f47796b;
        Object parent = view.getParent();
        if (parent instanceof View) {
            j((View) parent, fArr);
            float f5 = -view.getScrollX();
            float f11 = -view.getScrollY();
            g2.k0.d(fArr2);
            g2.k0.f(fArr2, f5, f11);
            z2.g0.B(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            g2.k0.d(fArr2);
            g2.k0.f(fArr2, left, top);
            z2.g0.B(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.f47797c;
            view.getLocationInWindow(iArr);
            float f12 = -view.getScrollX();
            float f13 = -view.getScrollY();
            g2.k0.d(fArr2);
            g2.k0.f(fArr2, f12, f13);
            z2.g0.B(fArr, fArr2);
            float f14 = iArr[0];
            float f15 = iArr[1];
            g2.k0.d(fArr2);
            g2.k0.f(fArr2, f14, f15);
            z2.g0.B(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        g2.f0.z(matrix, fArr2);
        z2.g0.B(fArr, fArr2);
    }

    public String toString() {
        switch (this.f47795a) {
            case 9:
                StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
                wd.c cVar = (wd.c) this.f47796b;
                wd.c cVar2 = cVar.f55071c;
                boolean z11 = false;
                while (!cVar2.equals(cVar)) {
                    sb2.append('{');
                    sb2.append(cVar2.f55069a);
                    sb2.append(':');
                    ArrayList arrayList = cVar2.f55070b;
                    sb2.append(arrayList != null ? arrayList.size() : 0);
                    sb2.append("}, ");
                    cVar2 = cVar2.f55071c;
                    z11 = true;
                }
                if (z11) {
                    sb2.delete(sb2.length() - 2, sb2.length());
                }
                sb2.append(" )");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public z(int i11) {
        this.f47795a = i11;
        switch (i11) {
            case 11:
                this.f47796b = new HashMap();
                this.f47797c = new ge.a(1);
                break;
            default:
                this.f47796b = new wd.c(null);
                this.f47797c = new HashMap();
                break;
        }
    }

    public z(AutoResizeTextView autoResizeTextView) {
        this.f47795a = 8;
        this.f47797c = autoResizeTextView;
        this.f47796b = new RectF();
    }

    public z(EditText editText) {
        this.f47795a = 10;
        this.f47796b = editText;
        x5.i iVar = new x5.i(editText);
        this.f47797c = iVar;
        editText.addTextChangedListener(iVar);
        if (x5.a.f55783b == null) {
            synchronized (x5.a.f55782a) {
                try {
                    if (x5.a.f55783b == null) {
                        x5.a aVar = new x5.a();
                        try {
                            x5.a.f55784c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, x5.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        x5.a.f55783b = aVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        editText.setEditableFactory(x5.a.f55783b);
    }

    public z(v7.c cVar) {
        this.f47795a = 7;
        this.f47797c = cVar;
    }

    public z(float[] fArr) {
        this.f47795a = 13;
        this.f47796b = fArr;
        this.f47797c = new int[2];
    }
}
