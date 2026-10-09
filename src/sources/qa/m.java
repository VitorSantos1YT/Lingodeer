package qa;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.h2;
import androidx.fragment.app.k0;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class m extends h2 {
    @Override // androidx.fragment.app.h2
    public final void a(View view, Object obj) {
        ((v) obj).c(view);
    }

    @Override // androidx.fragment.app.h2
    public final void b(Object obj, ArrayList arrayList) {
        v vVar = (v) obj;
        if (vVar == null) {
            return;
        }
        int i11 = 0;
        if (vVar instanceof b0) {
            b0 b0Var = (b0) vVar;
            int size = b0Var.f47595i0.size();
            while (i11 < size) {
                b(b0Var.T(i11), arrayList);
                i11++;
            }
            return;
        }
        if (h2.k(vVar.f47684e) && h2.k(vVar.f47685f)) {
            int size2 = arrayList.size();
            while (i11 < size2) {
                vVar.c((View) arrayList.get(i11));
                i11++;
            }
        }
    }

    @Override // androidx.fragment.app.h2
    public final void c(Object obj) {
        ((s) obj).g();
    }

    @Override // androidx.fragment.app.h2
    public final void d(Object obj, androidx.fragment.app.n nVar) {
        s sVar = (s) obj;
        sVar.f47667g = nVar;
        if (!sVar.f47662b) {
            sVar.f47664d = 2;
        } else {
            sVar.h();
            sVar.f47665e.a(CropImageView.DEFAULT_ASPECT_RATIO);
        }
    }

    @Override // androidx.fragment.app.h2
    public final void e(ViewGroup viewGroup, Object obj) {
        z.a(viewGroup, (v) obj);
    }

    @Override // androidx.fragment.app.h2
    public final boolean g(Object obj) {
        return obj instanceof v;
    }

    @Override // androidx.fragment.app.h2
    public final Object h(Object obj) {
        if (obj != null) {
            return ((v) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.h2
    public final Object i(ViewGroup viewGroup, Object obj) {
        v vVar = (v) obj;
        ArrayList arrayList = z.f47693c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!vVar.x()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        v vVarClone = vVar.clone();
        b0 b0Var = new b0();
        b0Var.S(vVarClone);
        z.c(viewGroup, b0Var);
        viewGroup.setTag(R.id.transition_current_scene, null);
        y yVar = new y();
        yVar.f47689a = b0Var;
        yVar.f47690b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(yVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(yVar);
        viewGroup.invalidate();
        s sVar = new s(b0Var);
        b0Var.f47681c0 = sVar;
        b0Var.a(sVar);
        return b0Var.f47681c0;
    }

    @Override // androidx.fragment.app.h2
    public final boolean l() {
        return true;
    }

    @Override // androidx.fragment.app.h2
    public final boolean m(Object obj) {
        boolean zX = ((v) obj).x();
        if (!zX) {
            Objects.toString(obj);
        }
        return zX;
    }

    @Override // androidx.fragment.app.h2
    public final Object n(Object obj, Object obj2, Object obj3) {
        v vVar = (v) obj;
        v vVar2 = (v) obj2;
        v vVar3 = (v) obj3;
        if (vVar != null && vVar2 != null) {
            b0 b0Var = new b0();
            b0Var.S(vVar);
            b0Var.S(vVar2);
            b0Var.W(1);
            vVar = b0Var;
        } else if (vVar == null) {
            vVar = vVar2 != null ? vVar2 : null;
        }
        if (vVar3 == null) {
            return vVar;
        }
        b0 b0Var2 = new b0();
        if (vVar != null) {
            b0Var2.S(vVar);
        }
        b0Var2.S(vVar3);
        return b0Var2;
    }

    @Override // androidx.fragment.app.h2
    public final Object o(Object obj, Object obj2) {
        b0 b0Var = new b0();
        if (obj != null) {
            b0Var.S((v) obj);
        }
        b0Var.S((v) obj2);
        return b0Var;
    }

    @Override // androidx.fragment.app.h2
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((v) obj).a(new j(view, arrayList));
    }

    @Override // androidx.fragment.app.h2
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((v) obj).a(new k(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.h2
    public final void r(Object obj, float f5) {
        s sVar = (s) obj;
        boolean z11 = sVar.f47662b;
        if (z11) {
            b0 b0Var = sVar.f47668h;
            long j11 = b0Var.f47679b0;
            long j12 = (long) (f5 * j11);
            if (j12 == 0) {
                j12 = 1;
            }
            if (j12 == j11) {
                j12 = j11 - 1;
            }
            if (sVar.f47665e != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j13 = sVar.f47661a;
            if (j12 == j13 || !z11) {
                return;
            }
            if (!sVar.f47663c) {
                if (j12 == 0 && j13 > 0) {
                    j12 = -1;
                } else if (j12 == j11 && j13 < j11) {
                    j12 = j11 + 1;
                }
                if (j12 != j13) {
                    b0Var.J(j12, j13);
                    sVar.f47661a = j12;
                }
            }
            ij.d dVar = sVar.f47666f;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i11 = (dVar.f34421b + 1) % 20;
            dVar.f34421b = i11;
            ((long[]) dVar.f34422c)[i11] = jCurrentAnimationTimeMillis;
            ((float[]) dVar.f34423d)[i11] = j12;
        }
    }

    @Override // androidx.fragment.app.h2
    public final void s(View view, Object obj) {
        if (view != null) {
            h2.j(view, new Rect());
            ((v) obj).L(new i(13));
        }
    }

    @Override // androidx.fragment.app.h2
    public final void t(Object obj, Rect rect) {
        ((v) obj).L(new i(13));
    }

    @Override // androidx.fragment.app.h2
    public final void u(k0 k0Var, Object obj, v4.b bVar, Runnable runnable) {
        v(obj, bVar, null, runnable);
    }

    @Override // androidx.fragment.app.h2
    public final void v(Object obj, v4.b bVar, androidx.fragment.app.z zVar, Runnable runnable) {
        v vVar = (v) obj;
        com.google.firebase.crashlytics.internal.concurrency.a aVar = new com.google.firebase.crashlytics.internal.concurrency.a(zVar, vVar, runnable, 8);
        synchronized (bVar) {
            while (bVar.f53507b) {
                try {
                    try {
                        bVar.wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (((com.google.firebase.crashlytics.internal.concurrency.a) bVar.f53508c) != aVar) {
                bVar.f53508c = aVar;
                if (bVar.f53506a) {
                    Runnable runnable2 = (Runnable) aVar.f18380b;
                    v vVar2 = (v) aVar.f18381c;
                    Runnable runnable3 = (Runnable) aVar.f18382d;
                    if (runnable2 == null) {
                        vVar2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        vVar.a(new l(runnable));
    }

    @Override // androidx.fragment.app.h2
    public final void w(Object obj, View view, ArrayList arrayList) {
        b0 b0Var = (b0) obj;
        ArrayList arrayList2 = b0Var.f47685f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            h2.f(arrayList2, (View) arrayList.get(i11));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(b0Var, arrayList);
    }

    @Override // androidx.fragment.app.h2
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        b0 b0Var = (b0) obj;
        if (b0Var != null) {
            ArrayList arrayList3 = b0Var.f47685f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(b0Var, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.h2
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        b0 b0Var = new b0();
        b0Var.S((v) obj);
        return b0Var;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        v vVar = (v) obj;
        int i11 = 0;
        if (vVar instanceof b0) {
            b0 b0Var = (b0) vVar;
            int size = b0Var.f47595i0.size();
            while (i11 < size) {
                z(b0Var.T(i11), arrayList, arrayList2);
                i11++;
            }
            return;
        }
        if (h2.k(vVar.f47684e)) {
            ArrayList arrayList3 = vVar.f47685f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i11 < size2) {
                    vVar.c((View) arrayList2.get(i11));
                    i11++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    vVar.F((View) arrayList.get(size3));
                }
            }
        }
    }
}
