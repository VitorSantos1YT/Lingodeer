package sy;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import re.e0;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f51943d;

    public f() {
        if (e0.f49139b == null) {
            e0.f49139b = new e0(10);
        }
    }

    public int a(int i11) {
        if (i11 < this.f51942c) {
            return ((ByteBuffer) this.f51943d).getShort(this.f51941b + i11);
        }
        return 0;
    }

    public void b() {
        if (((g) this.f51943d).H != this.f51942c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i11 = this.f51940a;
            g gVar = (g) this.f51943d;
            if (i11 >= gVar.f51949f || gVar.f51946c[i11] >= 0) {
                return;
            } else {
                this.f51940a = i11 + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        z4.b bVar;
        if (Build.VERSION.SDK_INT >= this.f51941b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f51941b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f51940a);
            if (!((Class) this.f51943d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateE = s0.e(view);
            if (accessibilityDelegateE == null) {
                bVar = null;
            } else {
                bVar = accessibilityDelegateE instanceof z4.a ? ((z4.a) accessibilityDelegateE).f58803a : new z4.b(accessibilityDelegateE);
            }
            if (bVar == null) {
                bVar = new z4.b();
            }
            s0.q(view, bVar);
            view.setTag(this.f51940a, obj);
            s0.j(view, this.f51942c);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f51940a < ((g) this.f51943d).f51949f;
    }

    public void remove() {
        g gVar = (g) this.f51943d;
        b();
        if (this.f51941b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        gVar.c();
        gVar.l(this.f51941b);
        this.f51941b = -1;
        this.f51942c = gVar.H;
    }
}
