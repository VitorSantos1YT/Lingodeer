package le;

import a.ar.MFeWs;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.k;
import com.bumptech.glide.load.engine.GlideException;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.display.internal.GlideErrorListener;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l.q;
import pe.m;
import qp.m4;
import vd.b0;
import vd.n;
import vd.o;
import vd.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements c, me.c {
    public static final boolean A = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qe.e f39925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f39927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f39928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.i f39929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f39930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f39931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f39932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f39933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f39934j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k f39935k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final me.d f39936l;
    public final List m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ne.d f39937n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q f39938o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b0 f39939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m4 f39940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile o f39941r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h f39942s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f39943t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f39944u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f39945v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f39946w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f39947x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f39948y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RuntimeException f39949z;

    public i(Context context, com.bumptech.glide.i iVar, Object obj, Object obj2, Class cls, a aVar, int i11, int i12, k kVar, me.d dVar, ArrayList arrayList, e eVar, o oVar, ne.d dVar2) {
        q qVar = pe.f.f46820a;
        if (A) {
            String.valueOf(hashCode());
        }
        this.f39925a = new qe.e();
        this.f39926b = obj;
        this.f39928d = context;
        this.f39929e = iVar;
        this.f39930f = obj2;
        this.f39931g = cls;
        this.f39932h = aVar;
        this.f39933i = i11;
        this.f39934j = i12;
        this.f39935k = kVar;
        this.f39936l = dVar;
        this.m = arrayList;
        this.f39927c = eVar;
        this.f39941r = oVar;
        this.f39937n = dVar2;
        this.f39938o = qVar;
        this.f39942s = h.PENDING;
        if (this.f39949z == null && ((Map) iVar.f7636h.f378b).containsKey(com.bumptech.glide.e.class)) {
            this.f39949z = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // le.c
    public final boolean a() {
        boolean z11;
        synchronized (this.f39926b) {
            z11 = this.f39942s == h.COMPLETE;
        }
        return z11;
    }

    @Override // le.c
    public final boolean b() {
        boolean z11;
        synchronized (this.f39926b) {
            z11 = this.f39942s == h.COMPLETE;
        }
        return z11;
    }

    public final void c() {
        if (this.f39948y) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f39925a.a();
        this.f39936l.b(this);
        m4 m4Var = this.f39940q;
        if (m4Var != null) {
            synchronized (((o) m4Var.f48062d)) {
                ((s) m4Var.f48060b).h((i) m4Var.f48061c);
            }
            this.f39940q = null;
        }
    }

    @Override // le.c
    public final void clear() {
        synchronized (this.f39926b) {
            try {
                if (this.f39948y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f39925a.a();
                h hVar = this.f39942s;
                h hVar2 = h.CLEARED;
                if (hVar == hVar2) {
                    return;
                }
                c();
                b0 b0Var = this.f39939p;
                if (b0Var != null) {
                    this.f39939p = null;
                } else {
                    b0Var = null;
                }
                e eVar = this.f39927c;
                if (eVar == null || eVar.c(this)) {
                    this.f39936l.h(d());
                }
                this.f39942s = hVar2;
                if (b0Var != null) {
                    this.f39941r.getClass();
                    o.e(b0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Drawable d() {
        if (this.f39944u == null) {
            a aVar = this.f39932h;
            aVar.getClass();
            this.f39944u = null;
            int i11 = aVar.f39915d;
            if (i11 > 0) {
                aVar.getClass();
                Context context = this.f39928d;
                this.f39944u = j3.u(context, context, i11, context.getTheme());
            }
        }
        return this.f39944u;
    }

    @Override // le.c
    public final void e() {
        synchronized (this.f39926b) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(GlideException glideException, int i11) {
        Drawable drawableD;
        this.f39925a.a();
        synchronized (this.f39926b) {
            try {
                glideException.getClass();
                int i12 = this.f39929e.f7637i;
                if (i12 <= i11) {
                    Objects.toString(this.f39930f);
                    if (i12 <= 4) {
                        ArrayList arrayList = new ArrayList();
                        GlideException.a(glideException, arrayList);
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            int i14 = i13 + 1;
                            i13 = i14;
                        }
                    }
                }
                this.f39940q = null;
                this.f39942s = h.FAILED;
                e eVar = this.f39927c;
                if (eVar != null) {
                    eVar.g(this);
                }
                boolean z11 = true;
                this.f39948y = true;
                try {
                    List<f> list = this.m;
                    if (list != null) {
                        for (f fVar : list) {
                            e eVar2 = this.f39927c;
                            if (eVar2 != null) {
                                eVar2.getRoot().a();
                            }
                            GlideErrorListener glideErrorListener = (GlideErrorListener) fVar;
                            FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks = glideErrorListener.f19773b;
                            glideException.getMessage();
                            Objects.toString(glideException.getCause());
                            if (glideErrorListener.f19772a != null && firebaseInAppMessagingDisplayCallbacks != null) {
                                if (glideException.getLocalizedMessage().contains("Failed to decode")) {
                                    firebaseInAppMessagingDisplayCallbacks.b(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.IMAGE_UNSUPPORTED_FORMAT);
                                } else {
                                    firebaseInAppMessagingDisplayCallbacks.b(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.UNSPECIFIED_RENDER_ERROR);
                                }
                            }
                        }
                    }
                    e eVar3 = this.f39927c;
                    if (eVar3 != null && !eVar3.d(this)) {
                        z11 = false;
                    }
                    if (z11) {
                        if (this.f39930f == null) {
                            if (this.f39945v == null) {
                                this.f39932h.getClass();
                                this.f39945v = null;
                            }
                            drawableD = this.f39945v;
                        } else {
                            drawableD = null;
                        }
                        if (drawableD == null) {
                            if (this.f39943t == null) {
                                this.f39932h.getClass();
                                this.f39943t = null;
                            }
                            drawableD = this.f39943t;
                        }
                        if (drawableD == null) {
                            drawableD = d();
                        }
                        this.f39936l.c(drawableD);
                    }
                    this.f39948y = false;
                } catch (Throwable th2) {
                    this.f39948y = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void g(b0 b0Var, Object obj, td.a aVar) {
        e eVar = this.f39927c;
        if (eVar != null) {
            eVar.getRoot().a();
        }
        this.f39942s = h.COMPLETE;
        this.f39939p = b0Var;
        if (this.f39929e.f7637i <= 3) {
            Objects.toString(aVar);
            Objects.toString(this.f39930f);
            int i11 = pe.h.f46822a;
            SystemClock.elapsedRealtimeNanos();
        }
        if (eVar != null) {
            eVar.i(this);
        }
        this.f39948y = true;
        try {
            List list = this.m;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((GlideErrorListener) ((f) it.next())).getClass();
                    Objects.toString((Drawable) obj);
                }
            }
            this.f39936l.e(obj, this.f39937n.h(aVar));
        } finally {
            this.f39948y = false;
        }
    }

    @Override // le.c
    public final boolean h() {
        boolean z11;
        synchronized (this.f39926b) {
            z11 = this.f39942s == h.CLEARED;
        }
        return z11;
    }

    public final void i(b0 b0Var, td.a aVar, boolean z11) {
        this.f39925a.a();
        b0 b0Var2 = null;
        try {
            synchronized (this.f39926b) {
                try {
                    this.f39940q = null;
                    if (b0Var == null) {
                        f(new GlideException("Expected to receive a Resource<R> with an object of " + this.f39931g + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = b0Var.get();
                    try {
                        if (obj == null || !this.f39931g.isAssignableFrom(obj.getClass())) {
                            this.f39939p = null;
                            StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                            sb2.append(this.f39931g);
                            sb2.append(" but instead got ");
                            sb2.append(obj != null ? obj.getClass() : BuildConfig.VERSION_NAME);
                            sb2.append("{");
                            sb2.append(obj);
                            sb2.append("} inside Resource{");
                            sb2.append(b0Var);
                            sb2.append("}.");
                            sb2.append(obj != null ? BuildConfig.VERSION_NAME : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            f(new GlideException(sb2.toString()), 5);
                        } else {
                            e eVar = this.f39927c;
                            if (eVar == null || eVar.f(this)) {
                                g(b0Var, obj, aVar);
                                return;
                            } else {
                                this.f39939p = null;
                                this.f39942s = h.COMPLETE;
                            }
                        }
                        this.f39941r.getClass();
                        o.e(b0Var);
                    } catch (Throwable th2) {
                        b0Var2 = b0Var;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (b0Var2 != null) {
                this.f39941r.getClass();
                o.e(b0Var2);
            }
            throw th4;
        }
    }

    @Override // le.c
    public final boolean isRunning() {
        boolean z11;
        synchronized (this.f39926b) {
            try {
                h hVar = this.f39942s;
                z11 = hVar == h.RUNNING || hVar == h.WAITING_FOR_SIZE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // le.c
    public final boolean k(c cVar) {
        int i11;
        int i12;
        Object obj;
        Class cls;
        a aVar;
        k kVar;
        int size;
        int i13;
        int i14;
        Object obj2;
        Class cls2;
        a aVar2;
        k kVar2;
        int size2;
        boolean zEquals;
        boolean zG;
        if (!(cVar instanceof i)) {
            return false;
        }
        synchronized (this.f39926b) {
            try {
                i11 = this.f39933i;
                i12 = this.f39934j;
                obj = this.f39930f;
                cls = this.f39931g;
                aVar = this.f39932h;
                kVar = this.f39935k;
                List list = this.m;
                size = list != null ? list.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i iVar = (i) cVar;
        synchronized (iVar.f39926b) {
            try {
                i13 = iVar.f39933i;
                i14 = iVar.f39934j;
                obj2 = iVar.f39930f;
                cls2 = iVar.f39931g;
                aVar2 = iVar.f39932h;
                kVar2 = iVar.f39935k;
                List list2 = iVar.m;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (i11 == i13 && i12 == i14) {
            char[] cArr = m.f46830a;
            if (obj == null) {
                zEquals = obj2 == null;
            } else {
                zEquals = obj.equals(obj2);
            }
            if (zEquals && cls.equals(cls2)) {
                if (aVar == null) {
                    zG = aVar2 == null;
                } else {
                    zG = aVar.g(aVar2);
                }
                if (zG && kVar == kVar2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void l(int i11, int i12) {
        Object obj;
        i iVar = this;
        int iRound = i11;
        iVar.f39925a.a();
        Object obj2 = iVar.f39926b;
        synchronized (obj2) {
            try {
                try {
                    boolean z11 = A;
                    if (z11) {
                        int i13 = pe.h.f46822a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (iVar.f39942s == h.WAITING_FOR_SIZE) {
                        h hVar = h.RUNNING;
                        iVar.f39942s = hVar;
                        iVar.f39932h.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        iVar.f39946w = iRound;
                        iVar.f39947x = i12 == Integer.MIN_VALUE ? i12 : Math.round(1.0f * i12);
                        if (z11) {
                            int i14 = pe.h.f46822a;
                            SystemClock.elapsedRealtimeNanos();
                        }
                        o oVar = iVar.f39941r;
                        try {
                            com.bumptech.glide.i iVar2 = iVar.f39929e;
                            Object obj3 = iVar.f39930f;
                            a aVar = iVar.f39932h;
                            try {
                                td.g gVar = aVar.H;
                                int i15 = iVar.f39946w;
                                try {
                                    int i16 = iVar.f39947x;
                                    Class cls = aVar.N;
                                    try {
                                        Class cls2 = iVar.f39931g;
                                        k kVar = iVar.f39935k;
                                        try {
                                            n nVar = aVar.f39913b;
                                            pe.c cVar = aVar.M;
                                            try {
                                                boolean z12 = aVar.K;
                                                boolean z13 = aVar.Q;
                                                try {
                                                    td.j jVar = aVar.L;
                                                    boolean z14 = aVar.f39916e;
                                                    boolean z15 = aVar.R;
                                                    q qVar = iVar.f39938o;
                                                    Object obj4 = obj2;
                                                    try {
                                                        iVar.f39940q = oVar.a(iVar2, obj3, gVar, i15, i16, cls, cls2, kVar, nVar, cVar, z12, z13, jVar, z14, z15, iVar, qVar);
                                                        if (iVar.f39942s != hVar) {
                                                            iVar.f39940q = null;
                                                        }
                                                        if (z11) {
                                                            int i17 = pe.h.f46822a;
                                                            SystemClock.elapsedRealtimeNanos();
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        obj = obj4;
                                                        throw th;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    obj = obj2;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                obj = obj2;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            obj = obj2;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        obj = obj2;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    obj = obj2;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                obj = obj2;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th10) {
                    th = th10;
                    obj = obj2;
                }
            } catch (Throwable th11) {
                th = th11;
                obj = iVar;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f39926b) {
            obj = this.f39930f;
            cls = this.f39931g;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    @Override // le.c
    public final void j() {
        synchronized (this.f39926b) {
            try {
                if (this.f39948y) {
                    throw new IllegalStateException(MFeWs.vspKseAtifzRv);
                }
                this.f39925a.a();
                int i11 = pe.h.f46822a;
                SystemClock.elapsedRealtimeNanos();
                if (this.f39930f == null) {
                    if (m.i(this.f39933i, this.f39934j)) {
                        this.f39946w = this.f39933i;
                        this.f39947x = this.f39934j;
                    }
                    if (this.f39945v == null) {
                        this.f39932h.getClass();
                        this.f39945v = null;
                    }
                    f(new GlideException("Received null model"), this.f39945v == null ? 5 : 3);
                    return;
                }
                h hVar = this.f39942s;
                if (hVar == h.RUNNING) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (hVar == h.COMPLETE) {
                    i(this.f39939p, td.a.MEMORY_CACHE, false);
                    return;
                }
                List<f> list = this.m;
                if (list != null) {
                    for (f fVar : list) {
                    }
                }
                h hVar2 = h.WAITING_FOR_SIZE;
                this.f39942s = hVar2;
                if (m.i(this.f39933i, this.f39934j)) {
                    l(this.f39933i, this.f39934j);
                } else {
                    this.f39936l.d(this);
                }
                h hVar3 = this.f39942s;
                if (hVar3 == h.RUNNING || hVar3 == hVar2) {
                    e eVar = this.f39927c;
                    if (eVar == null || eVar.d(this)) {
                        this.f39936l.f(d());
                    }
                }
                if (A) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
