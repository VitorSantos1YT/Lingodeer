package le;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ce.l;
import ce.r;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.bumptech.glide.k;
import com.lingodeer.R;
import pe.m;
import vd.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Cloneable {
    public boolean K;
    public boolean O;
    public boolean P;
    public boolean R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39912a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39915d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f39913b = n.f53923d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f39914c = k.NORMAL;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39916e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39917f = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f39918t = -1;
    public td.g H = oe.a.f44901b;
    public td.j L = new td.j();
    public pe.c M = new pe.c(0);
    public Class N = Object.class;
    public boolean Q = true;

    public static boolean h(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    public a a(a aVar) {
        if (this.P) {
            return clone().a(aVar);
        }
        int i11 = aVar.f39912a;
        if (h(aVar.f39912a, 1048576)) {
            this.R = aVar.R;
        }
        if (h(aVar.f39912a, 4)) {
            this.f39913b = aVar.f39913b;
        }
        if (h(aVar.f39912a, 8)) {
            this.f39914c = aVar.f39914c;
        }
        if (h(aVar.f39912a, 16)) {
            this.f39912a &= -33;
        }
        if (h(aVar.f39912a, 32)) {
            this.f39912a &= -17;
        }
        if (h(aVar.f39912a, 64)) {
            this.f39915d = 0;
            this.f39912a &= -129;
        }
        if (h(aVar.f39912a, 128)) {
            this.f39915d = aVar.f39915d;
            this.f39912a &= -65;
        }
        if (h(aVar.f39912a, 256)) {
            this.f39916e = aVar.f39916e;
        }
        if (h(aVar.f39912a, 512)) {
            this.f39918t = aVar.f39918t;
            this.f39917f = aVar.f39917f;
        }
        if (h(aVar.f39912a, 1024)) {
            this.H = aVar.H;
        }
        if (h(aVar.f39912a, 4096)) {
            this.N = aVar.N;
        }
        if (h(aVar.f39912a, OSSConstants.DEFAULT_BUFFER_SIZE)) {
            this.f39912a &= -16385;
        }
        if (h(aVar.f39912a, 16384)) {
            this.f39912a &= -8193;
        }
        if (h(aVar.f39912a, OSSConstants.DEFAULT_STREAM_BUFFER_SIZE)) {
            this.K = aVar.K;
        }
        if (h(aVar.f39912a, 2048)) {
            this.M.putAll(aVar.M);
            this.Q = aVar.Q;
        }
        this.f39912a |= aVar.f39912a;
        this.L.f52127b.g(aVar.L.f52127b);
        m();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            td.j jVar = new td.j();
            aVar.L = jVar;
            jVar.f52127b.g(this.L.f52127b);
            pe.c cVar = new pe.c(0);
            aVar.M = cVar;
            cVar.putAll(this.M);
            aVar.O = false;
            aVar.P = false;
            return aVar;
        } catch (CloneNotSupportedException e8) {
            throw new RuntimeException(e8);
        }
    }

    public final a d(Class cls) {
        if (this.P) {
            return clone().d(cls);
        }
        this.N = cls;
        this.f39912a |= 4096;
        m();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return g((a) obj);
        }
        return false;
    }

    public final a f(n nVar) {
        if (this.P) {
            return clone().f(nVar);
        }
        this.f39913b = nVar;
        this.f39912a |= 4;
        m();
        return this;
    }

    public final boolean g(a aVar) {
        aVar.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = m.f46830a;
        return this.f39915d == aVar.f39915d && this.f39916e == aVar.f39916e && this.f39917f == aVar.f39917f && this.f39918t == aVar.f39918t && this.K == aVar.K && this.f39913b.equals(aVar.f39913b) && this.f39914c == aVar.f39914c && this.L.equals(aVar.L) && this.M.equals(aVar.M) && this.N.equals(aVar.N) && this.H.equals(aVar.H);
    }

    public int hashCode() {
        char[] cArr = m.f46830a;
        return m.h(m.h(m.h(m.h(m.h(m.h(m.h(m.g(0, m.g(0, m.g(1, m.g(this.K ? 1 : 0, m.g(this.f39918t, m.g(this.f39917f, m.g(this.f39916e ? 1 : 0, m.h(m.g(0, m.h(m.g(this.f39915d, m.h(m.g(0, m.g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f39913b), this.f39914c), this.L), this.M), this.N), this.H), null);
    }

    public final a i(l lVar, ce.d dVar) {
        if (this.P) {
            return clone().i(lVar, dVar);
        }
        n(l.f6873g, lVar);
        return r(dVar, false);
    }

    public final a j(int i11, int i12) {
        if (this.P) {
            return clone().j(i11, i12);
        }
        this.f39918t = i11;
        this.f39917f = i12;
        this.f39912a |= 512;
        m();
        return this;
    }

    public final a k() {
        if (this.P) {
            return clone().k();
        }
        this.f39915d = R.drawable.image_placeholder;
        this.f39912a = (this.f39912a | 128) & (-65);
        m();
        return this;
    }

    public final a l(k kVar) {
        if (this.P) {
            return clone().l(kVar);
        }
        pe.f.c(kVar, "Argument must not be null");
        this.f39914c = kVar;
        this.f39912a |= 8;
        m();
        return this;
    }

    public final void m() {
        if (this.O) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a n(td.i iVar, Object obj) {
        if (this.P) {
            return clone().n(iVar, obj);
        }
        pe.f.b(iVar);
        pe.f.b(obj);
        this.L.f52127b.put(iVar, obj);
        m();
        return this;
    }

    public final a o(oe.b bVar) {
        if (this.P) {
            return clone().o(bVar);
        }
        this.H = bVar;
        this.f39912a |= 1024;
        m();
        return this;
    }

    public final a p() {
        if (this.P) {
            return clone().p();
        }
        this.f39916e = false;
        this.f39912a |= 256;
        m();
        return this;
    }

    public final a q(Class cls, td.n nVar, boolean z11) {
        if (this.P) {
            return clone().q(cls, nVar, z11);
        }
        pe.f.b(nVar);
        this.M.put(cls, nVar);
        int i11 = this.f39912a;
        this.f39912a = 67584 | i11;
        this.Q = false;
        if (z11) {
            this.f39912a = i11 | 198656;
            this.K = true;
        }
        m();
        return this;
    }

    public final a r(td.n nVar, boolean z11) {
        if (this.P) {
            return clone().r(nVar, z11);
        }
        r rVar = new r(nVar, z11);
        q(Bitmap.class, nVar, z11);
        q(Drawable.class, rVar, z11);
        q(BitmapDrawable.class, rVar, z11);
        q(ge.d.class, new ge.e(nVar), z11);
        m();
        return this;
    }

    public final a s() {
        if (this.P) {
            return clone().s();
        }
        this.R = true;
        this.f39912a |= 1048576;
        m();
        return this;
    }
}
