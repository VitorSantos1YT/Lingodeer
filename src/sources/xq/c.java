package xq;

import a0.b2;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.LocaleList;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import androidx.recyclerview.widget.p2;
import b7.f0;
import b7.w;
import bp.y1;
import bq.z;
import ce.a0;
import ce.y;
import com.android.billingclient.api.c0;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.FacebookException;
import com.google.android.material.snackbar.Snackbar;
import com.google.api.Service;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;
import com.lingo.lingoskill.chineseskill.ui.sc.adapter.ScDetailAdapter;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.lingo.lingoskill.object.JPChar;
import com.lingo.lingoskill.object.TravelPhrase;
import com.lingo.lingoskill.speak.adapter.SpeakTryAdapter;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.RxPermissions;
import com.yalantis.ucrop.view.CropImageView;
import e6.r1;
import e6.v1;
import e6.w1;
import e9.b0;
import fr.j3;
import fr.p3;
import gb.r;
import hj.p6;
import hj.u5;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLSocket;
import jp.m0;
import jt.t0;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kr.o1;
import kr.z0;
import l1.b1;
import lw.c1;
import lw.d1;
import lw.p1;
import lw.q1;
import lw.s;
import mw.t;
import n0.w0;
import n9.u;
import n9.v;
import n9.x;
import qp.d3;
import tf.d0;
import uz.i1;
import x7.e0;
import y.i0;
import y.r0;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements y, ki.a, b0, fc.f, he.b, th.c, av.k, tx.c, fv.e, mw.y, m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f56174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f56175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f56176d;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i11) {
        this.f56173a = i11;
        this.f56174b = obj;
        this.f56175c = obj2;
        this.f56176d = obj3;
    }

    public static Method G(Class cls, String str, Class[] clsArr) {
        if (cls != null) {
            try {
                if ((cls.getModifiers() & 1) == 0) {
                    return G(cls.getSuperclass(), str, clsArr);
                }
                Method method = cls.getMethod(str, clsArr);
                try {
                    if ((method.getModifiers() & 1) != 0) {
                        return method;
                    }
                } catch (NoSuchMethodException unused) {
                    return method;
                }
            } catch (NoSuchMethodException unused2) {
                return null;
            }
        }
        return null;
    }

    public static Object V(c cVar, Context context, int i11, xy.c cVar2) {
        cVar.getClass();
        AtomicBoolean atomicBoolean = v1.f25063a;
        if (Build.VERSION.SDK_INT >= 29 && v1.f25063a.get()) {
            w1.f25075a.a("GlanceAppWidget::update", 0);
        }
        Object objA = ((m6.m) cVar.f56174b).a(new e6.o(context, new e6.c(i11), cVar, (vy.d) null), cVar2);
        return objA == wy.a.COROUTINE_SUSPENDED ? objA : qy.b0.f48488a;
    }

    public static final void l(c cVar, Network network, boolean z11) {
        boolean z12;
        boolean z13 = false;
        for (Network network2 : ((ConnectivityManager) cVar.f56174b).getAllNetworks()) {
            if (kotlin.jvm.internal.m.a(network2, network)) {
                z12 = z11;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) cVar.f56174b).getNetworkCapabilities(network2);
                z12 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z12) {
                z13 = true;
                break;
            }
        }
        kc.m mVar = (kc.m) cVar.f56175c;
        synchronized (mVar) {
            try {
                if (((vb.i) mVar.f38072a.get()) != null) {
                    mVar.f38076e = z13;
                } else {
                    mVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public v3.c A() {
        return ((i2.b) this.f56176d).f34120a.f34116a;
    }

    @Override // ki.a
    public void B() {
    }

    @Override // ce.y
    public ImageHeaderParser$ImageType C() {
        List list = (List) this.f56176d;
        a0 a0Var = (a0) ((com.bumptech.glide.load.data.h) this.f56174b).f7659b;
        a0Var.reset();
        return r.w(list, a0Var, (m0.n) this.f56175c);
    }

    public v3.m E() {
        return ((i2.b) this.f56176d).f34120a.f34117b;
    }

    public Method F(Class cls) {
        Class cls2;
        Method methodG = G(cls, (String) this.f56175c, (Class[]) this.f56176d);
        if (methodG == null || (cls2 = (Class) this.f56174b) == null || cls2.isAssignableFrom(methodG.getReturnType())) {
            return methodG;
        }
        return null;
    }

    public long H() {
        return ((i2.b) this.f56176d).f34120a.f34119d;
    }

    public void J(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method methodF = F(sSLSocket.getClass());
            if (methodF == null) {
                return;
            }
            try {
                methodF.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e8) {
            Throwable targetException = e8.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object K(SSLSocket sSLSocket, Object... objArr) {
        try {
            return I(sSLSocket, objArr);
        } catch (InvocationTargetException e8) {
            Throwable targetException = e8.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public void L() {
        this.f56176d = new lf.j();
        final d0 d0VarC = d0.f52154i.c();
        lf.j jVar = (lf.j) this.f56176d;
        final a5.j jVar2 = new a5.j(this, 4);
        if (jVar == null) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        int iA = lf.i.Login.a();
        lf.h hVar = new lf.h() { // from class: tf.a0
            @Override // lf.h
            public final boolean a(Intent intent, int i11) {
                d0VarC.e(i11, intent, jVar2);
                return true;
            }
        };
        jVar.f40041a.put(Integer.valueOf(iA), hVar);
    }

    public void M(Activity activity, za.j jVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.f56176d;
        kotlin.jvm.internal.m.f(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f56175c;
        reentrantLock.lock();
        try {
            if (jVar.equals((za.j) weakHashMap.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((cb.m) ((a5.j) this.f56174b).f385b).f6824b.iterator();
            kotlin.jvm.internal.m.e(it, "iterator(...)");
            while (it.hasNext()) {
                cb.l lVar = (cb.l) it.next();
                if (lVar.f6818a.equals(activity)) {
                    lVar.f6820c = jVar;
                    lVar.f6819b.accept(jVar);
                }
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public wy.a N(xy.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i11 = bVar.f56172c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f56172c = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.f56170a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = bVar.f56172c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            bVar.f56172c = 1;
            if (c.a.D(a.f56169a, bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        throw new KotlinNothingValueException();
    }

    public void O(x states) {
        kotlin.jvm.internal.m.f(states, "states");
        this.f56174b = states.f43733a;
        this.f56176d = states.f43735c;
        this.f56175c = states.f43734b;
    }

    public void P(n9.y type, v vVar) {
        kotlin.jvm.internal.m.f(type, "type");
        int i11 = n9.a0.f43480a[type.ordinal()];
        if (i11 == 1) {
            this.f56174b = vVar;
        } else if (i11 == 2) {
            this.f56176d = vVar;
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.f56175c = vVar;
        }
    }

    public void Q(g2.v vVar) {
        ((i2.b) this.f56176d).f34120a.f34118c = vVar;
    }

    public void R(v3.c cVar) {
        ((i2.b) this.f56176d).f34120a.f34116a = cVar;
    }

    public void S(v3.m mVar) {
        ((i2.b) this.f56176d).f34120a.f34117b = mVar;
    }

    public void T(long j11) {
        ((i2.b) this.f56176d).f34120a.f34119d = j11;
    }

    public x U() {
        return new x((v) this.f56174b, (v) this.f56175c, (v) this.f56176d);
    }

    @Override // th.c, th.b
    public void a() {
        switch (this.f56173a) {
            case 13:
                ((SpeakTryAdapter) this.f56174b).g((View) this.f56175c, (String) this.f56176d);
                break;
            default:
                ((b1) this.f56174b).setValue(Boolean.TRUE);
                break;
        }
    }

    @Override // e9.b0
    public void b(b7.b0 b0Var, x7.o oVar, b10.b bVar) {
        this.f56175c = b0Var;
        bVar.d();
        bVar.j();
        e0 e0VarV = oVar.v(bVar.f3848c, 5);
        this.f56176d = e0VarV;
        e0VarV.b((p) this.f56174b);
    }

    @Override // e9.b0
    public void c(w wVar) {
        long jD;
        long j11;
        b7.a.k((b7.b0) this.f56175c);
        String str = f0.f3975a;
        b7.b0 b0Var = (b7.b0) this.f56175c;
        synchronized (b0Var) {
            try {
                long j12 = b0Var.f3956c;
                jD = j12 != -9223372036854775807L ? j12 + b0Var.f3955b : b0Var.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b7.b0 b0Var2 = (b7.b0) this.f56175c;
        synchronized (b0Var2) {
            j11 = b0Var2.f3955b;
        }
        if (jD == -9223372036854775807L || j11 == -9223372036854775807L) {
            return;
        }
        p pVar = (p) this.f56174b;
        if (j11 != pVar.f57296s) {
            y6.o oVarA = pVar.a();
            oVarA.f57269r = j11;
            p pVar2 = new p(oVarA);
            this.f56174b = pVar2;
            ((e0) this.f56176d).b(pVar2);
        }
        int iA = wVar.a();
        ((e0) this.f56176d).a(wVar, iA, 0);
        ((e0) this.f56176d).d(jD, 1, iA, 0, null);
    }

    @Override // fc.f
    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f56174b;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // mw.y
    public void e(dm.a aVar) {
        mw.v vVar = (mw.v) this.f56176d;
        tw.b.c();
        try {
            tw.b.a();
            tw.b.b();
            vVar.f42732e.execute(new mw.r(this, aVar));
            tw.b.f52660a.getClass();
        } catch (Throwable th2) {
            try {
                tw.b.f52660a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // mw.y
    public void f(q1 q1Var, mw.x xVar, c1 c1Var) {
        tw.b.c();
        try {
            tw.b.a();
            p(q1Var, c1Var);
            tw.b.f52660a.getClass();
        } catch (Throwable th2) {
            try {
                tw.b.f52660a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // fv.e
    public void g() {
        Object value;
        z0 z0Var = (z0) this.f56174b;
        rz.e0.B(ViewModelKt.getViewModelScope(z0Var), null, null, new kr.w((Object) z0Var, (String) this.f56175c, (String) this.f56176d, (vy.d) null, 2), 3);
        i1 i1Var = z0Var.M;
        do {
            value = i1Var.getValue();
        } while (!i1Var.j(value, o1.f38552a));
    }

    @Override // mw.y
    public void h() {
        mw.v vVar = (mw.v) this.f56176d;
        d1 d1Var = vVar.f42731d.f40367a;
        d1Var.getClass();
        if (d1Var == d1.UNARY || d1Var == d1.SERVER_STREAMING) {
            return;
        }
        tw.b.c();
        try {
            tw.b.a();
            tw.b.b();
            vVar.f42732e.execute(new t(this));
            tw.b.f52660a.getClass();
        } catch (Throwable th2) {
            try {
                tw.b.f52660a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // ce.y
    public int i() {
        List list = (List) this.f56176d;
        a0 a0Var = (a0) ((com.bumptech.glide.load.data.h) this.f56174b).f7659b;
        a0Var.reset();
        return r.t(list, a0Var, (m0.n) this.f56175c);
    }

    @Override // mw.y
    public void j(c1 c1Var) {
        mw.v vVar = (mw.v) this.f56176d;
        tw.b.c();
        try {
            tw.b.a();
            tw.b.b();
            vVar.f42732e.execute(new mw.r(this, c1Var));
            tw.b.f52660a.getClass();
        } catch (Throwable th2) {
            try {
                tw.b.f52660a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // he.b
    public vd.b0 k(vd.b0 b0Var, td.j jVar) {
        Drawable drawable = (Drawable) b0Var.get();
        if (drawable instanceof BitmapDrawable) {
            return ((c0) this.f56175c).k(ce.c.e(((BitmapDrawable) drawable).getBitmap(), (wd.a) this.f56174b), jVar);
        }
        if (drawable instanceof ge.d) {
            return ((he.d) this.f56176d).k(b0Var, jVar);
        }
        return null;
    }

    @Override // ki.a
    public void m() {
        BaseViewHolder baseViewHolder = (BaseViewHolder) this.f56175c;
        ScDetailAdapter scDetailAdapter = (ScDetailAdapter) this.f56174b;
        bq.f fVar = scDetailAdapter.f21760b;
        if (fVar.f4943a) {
            fVar.t();
            baseViewHolder.getView(R.id.iv_recorder).setBackgroundResource(R.drawable.bg_lesson_index_start_btn_enable);
            View view = baseViewHolder.getView(R.id.wave_view);
            kotlin.jvm.internal.m.d(view, "null cannot be cast to non-null type com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView");
            ((WaveView) view).b();
            ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_play_recorder);
            imageView.setVisibility(0);
            ViewParent parent = imageView.getParent();
            kotlin.jvm.internal.m.d(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) parent).setVisibility(0);
            imageView.setClickable(true);
            android.support.v4.media.session.a.H(imageView.getBackground());
            return;
        }
        TravelPhrase travelPhrase = (TravelPhrase) this.f56176d;
        View view2 = baseViewHolder.itemView;
        scDetailAdapter.f21768j = view2;
        view2.setTag(scDetailAdapter.getItem(baseViewHolder.getAdapterPosition()));
        FrameLayout frameLayout = (FrameLayout) baseViewHolder.getView(R.id.frame_score);
        View view3 = baseViewHolder.getView(R.id.view_line);
        frameLayout.setVisibility(4);
        view3.setVisibility(4);
        th.e eVar = scDetailAdapter.f21759a;
        if (eVar.f()) {
            eVar.n();
        }
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        fVar.r(cf.x.n().tempDir + xt.d.k(cf.x.n().keyLanguage) + "_sc_" + travelPhrase.getCID() + "_" + travelPhrase.getID() + "_recorder.mp3");
        View viewFindViewById = baseViewHolder.itemView.findViewById(R.id.wave_view);
        kotlin.jvm.internal.m.d(viewFindViewById, "null cannot be cast to non-null type com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView");
        ((WaveView) viewFindViewById).a();
        ImageView imageView2 = (ImageView) baseViewHolder.getView(R.id.iv_play_recorder);
        imageView2.setVisibility(4);
        ViewParent parent2 = imageView2.getParent();
        kotlin.jvm.internal.m.d(parent2, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((FrameLayout) parent2).setVisibility(4);
        imageView2.setClickable(false);
    }

    public String n(long j11, long j12, String str, int i11) {
        ArrayList arrayList = (ArrayList) this.f56174b;
        ArrayList arrayList2 = (ArrayList) this.f56176d;
        ArrayList arrayList3 = (ArrayList) this.f56175c;
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
            sb2.append((String) arrayList.get(i12));
            if (((Integer) arrayList3.get(i12)).intValue() == 1) {
                sb2.append(str);
            } else if (((Integer) arrayList3.get(i12)).intValue() == 2) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i12), Long.valueOf(j11)));
            } else if (((Integer) arrayList3.get(i12)).intValue() == 3) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i12), Integer.valueOf(i11)));
            } else if (((Integer) arrayList3.get(i12)).intValue() == 4) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i12), Long.valueOf(j12)));
            }
        }
        sb2.append((String) arrayList.get(arrayList3.size()));
        return sb2.toString();
    }

    public void o() throws IOException {
        ((BufferedOutputStream) this.f56174b).close();
        ((RandomAccessFile) this.f56176d).close();
    }

    public void p(q1 q1Var, c1 c1Var) {
        mw.v vVar = (mw.v) this.f56176d;
        s sVar = vVar.f42738k.f40349a;
        vVar.f42735h.getClass();
        if (sVar == null) {
            sVar = null;
        }
        if (q1Var.f40444a == p1.CANCELLED && sVar != null && sVar.a()) {
            l2.f fVar = new l2.f(1);
            vVar.f42739l.k(fVar);
            q1Var = q1.f40437h.b("ClientCall was cancelled at or after deadline. " + fVar);
            c1Var = new c1();
        }
        tw.b.b();
        vVar.f42732e.execute(new mw.s(this, q1Var, c1Var));
    }

    public void q(long j11, w wVar) {
        if (wVar.a() < 9) {
            return;
        }
        int iJ = wVar.j();
        int iJ2 = wVar.j();
        int iW = wVar.w();
        if (iJ == 434 && iJ2 == 1195456820 && iW == 3) {
            ((b7.c) this.f56176d).a(j11, wVar);
        }
    }

    @Override // fv.e
    public void r() {
        z0 z0Var = (z0) this.f56174b;
        rz.e0.B(ViewModelKt.getViewModelScope(z0Var), null, null, new kb.e(4, z0Var, (String) this.f56176d, null), 3);
    }

    public void s(x7.o oVar, b10.b bVar) {
        e0[] e0VarArr = (e0[]) this.f56175c;
        for (int i11 = 0; i11 < e0VarArr.length; i11++) {
            bVar.d();
            bVar.j();
            e0 e0VarV = oVar.v(bVar.f3848c, 3);
            p pVar = (p) ((List) this.f56174b).get(i11);
            String str = pVar.f57291n;
            b7.a.c("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            y6.o oVar2 = new y6.o();
            bVar.j();
            oVar2.f57253a = (String) bVar.f3850e;
            oVar2.f57264l = y6.d0.o("video/mp2t");
            oVar2.m = y6.d0.o(str);
            oVar2.f57257e = pVar.f57283e;
            oVar2.f57256d = pVar.f57282d;
            oVar2.J = pVar.K;
            oVar2.f57267p = pVar.f57294q;
            nv.p.D(oVar2, e0VarV);
            e0VarArr[i11] = e0VarV;
        }
    }

    @Override // fc.f
    public void shutdown() {
        ((ConnectivityManager) this.f56174b).unregisterNetworkCallback((fc.g) this.f56176d);
    }

    @Override // av.k
    public void start() {
        ((b1) this.f56174b).setValue(Boolean.FALSE);
        if (kotlin.jvm.internal.m.a(((b1) this.f56175c).getValue(), ht.g.f33738e)) {
            return;
        }
        ((b1) this.f56176d).setValue(-1);
    }

    @Override // ce.y
    public Bitmap t(BitmapFactory.Options options) {
        a0 a0Var = (a0) ((com.bumptech.glide.load.data.h) this.f56174b).f7659b;
        a0Var.reset();
        return ce.w.b(a0Var, options, this);
    }

    @Override // ce.y
    public boolean u() {
        List list = (List) this.f56176d;
        a0 a0Var = (a0) ((com.bumptech.glide.load.data.h) this.f56174b).f7659b;
        a0Var.reset();
        m0.n nVar = (m0.n) this.f56175c;
        a0Var.mark(5242880);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                boolean zF = ((td.f) list.get(i11)).f(a0Var, nVar);
                a0Var.reset();
                if (zF) {
                    return true;
                }
            } catch (Throwable th2) {
                a0Var.reset();
                throw th2;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(Context context, int i11, xy.c cVar) throws Throwable {
        e6.f0 f0Var;
        c cVar2;
        Context context2;
        int i12;
        n6.h hVar;
        n6.f fVar;
        String strF;
        n6.h hVar2;
        n6.f fVar2;
        String strF2;
        n6.h hVar3;
        n6.f fVar3;
        String strF3;
        if (cVar instanceof e6.f0) {
            f0Var = (e6.f0) cVar;
            int i13 = f0Var.f24905f;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                f0Var.f24905f = i13 - Integer.MIN_VALUE;
            } else {
                f0Var = new e6.f0(this, cVar);
            }
        } else {
            f0Var = new e6.f0(this, cVar);
        }
        Object obj = f0Var.f24903d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i14 = f0Var.f24905f;
        qy.b0 b0Var = qy.b0.f48488a;
        vy.d dVar = null;
        switch (i14) {
            case 0:
                com.bumptech.glide.e.F(obj);
                e6.c cVar3 = new e6.c(i11);
                m6.m mVar = (m6.m) this.f56174b;
                b1.c cVar4 = new b1.c(cVar3, dVar, 29);
                f0Var.f24900a = this;
                f0Var.f24901b = context;
                f0Var.f24902c = i11;
                f0Var.f24905f = 1;
                if (mVar.a(cVar4, f0Var) != aVar) {
                    cVar2 = this;
                    try {
                        f0Var.f24900a = cVar2;
                        f0Var.f24901b = context;
                        f0Var.f24902c = i11;
                        f0Var.f24905f = 2;
                        cVar2.getClass();
                        if (b0Var != aVar) {
                            int i15 = i11;
                            context2 = context;
                            i12 = i15;
                            hVar3 = (n6.h) cVar2.f56175c;
                            if (hVar3 != null) {
                                fVar3 = n6.f.f43456a;
                                strF3 = vc.a.f(i12);
                                f0Var.f24900a = null;
                                f0Var.f24901b = null;
                                f0Var.f24905f = 3;
                                if (fVar3.a(context2, hVar3, strF3, f0Var) == aVar) {
                                }
                            }
                            return b0Var;
                        }
                    } catch (CancellationException unused) {
                        int i16 = i11;
                        context2 = context;
                        i12 = i16;
                        hVar2 = (n6.h) cVar2.f56175c;
                        if (hVar2 != null) {
                            fVar2 = n6.f.f43456a;
                            strF2 = vc.a.f(i12);
                            f0Var.f24900a = null;
                            f0Var.f24901b = null;
                            f0Var.f24905f = 4;
                            if (fVar2.a(context2, hVar2, strF2, f0Var) == aVar) {
                                return aVar;
                            }
                        }
                    } catch (Throwable unused2) {
                        int i17 = i11;
                        context2 = context;
                        i12 = i17;
                        hVar = (n6.h) cVar2.f56175c;
                        if (hVar != null) {
                            fVar = n6.f.f43456a;
                            strF = vc.a.f(i12);
                            f0Var.f24900a = null;
                            f0Var.f24901b = null;
                            f0Var.f24905f = 5;
                            if (fVar.a(context2, hVar, strF, f0Var) == aVar) {
                                return aVar;
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                i11 = f0Var.f24902c;
                context = f0Var.f24901b;
                cVar2 = f0Var.f24900a;
                com.bumptech.glide.e.F(obj);
                f0Var.f24900a = cVar2;
                f0Var.f24901b = context;
                f0Var.f24902c = i11;
                f0Var.f24905f = 2;
                cVar2.getClass();
                if (b0Var != aVar) {
                    int i18 = i11;
                    context2 = context;
                    i12 = i18;
                    hVar3 = (n6.h) cVar2.f56175c;
                    if (hVar3 != null) {
                        fVar3 = n6.f.f43456a;
                        strF3 = vc.a.f(i12);
                        f0Var.f24900a = null;
                        f0Var.f24901b = null;
                        f0Var.f24905f = 3;
                        if (fVar3.a(context2, hVar3, strF3, f0Var) == aVar) {
                        }
                    }
                    return b0Var;
                }
                return aVar;
            case 2:
                i12 = f0Var.f24902c;
                context2 = f0Var.f24901b;
                cVar2 = f0Var.f24900a;
                try {
                    com.bumptech.glide.e.F(obj);
                    hVar3 = (n6.h) cVar2.f56175c;
                    if (hVar3 != null) {
                        fVar3 = n6.f.f43456a;
                        strF3 = vc.a.f(i12);
                        f0Var.f24900a = null;
                        f0Var.f24901b = null;
                        f0Var.f24905f = 3;
                        if (fVar3.a(context2, hVar3, strF3, f0Var) == aVar) {
                            return aVar;
                        }
                    }
                } catch (CancellationException unused3) {
                    hVar2 = (n6.h) cVar2.f56175c;
                    if (hVar2 != null) {
                        fVar2 = n6.f.f43456a;
                        strF2 = vc.a.f(i12);
                        f0Var.f24900a = null;
                        f0Var.f24901b = null;
                        f0Var.f24905f = 4;
                        if (fVar2.a(context2, hVar2, strF2, f0Var) == aVar) {
                            return aVar;
                        }
                    }
                } catch (Throwable unused4) {
                    hVar = (n6.h) cVar2.f56175c;
                    if (hVar != null) {
                        fVar = n6.f.f43456a;
                        strF = vc.a.f(i12);
                        f0Var.f24900a = null;
                        f0Var.f24901b = null;
                        f0Var.f24905f = 5;
                        if (fVar.a(context2, hVar, strF, f0Var) == aVar) {
                            return aVar;
                        }
                    }
                }
                return b0Var;
            case 3:
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 4:
            case 5:
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 6:
                Throwable th2 = (Throwable) f0Var.f24900a;
                com.bumptech.glide.e.F(obj);
                throw th2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public v w(n9.y loadType) {
        kotlin.jvm.internal.m.f(loadType, "loadType");
        int i11 = n9.a0.f43480a[loadType.ordinal()];
        if (i11 == 1) {
            return (v) this.f56174b;
        }
        if (i11 == 2) {
            return (v) this.f56176d;
        }
        if (i11 == 3) {
            return (v) this.f56175c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public g2.v x() {
        return ((i2.b) this.f56176d).f34120a.f34118c;
    }

    public q3.b y() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((p3) this.f56176d)) {
            try {
                q3.b bVar = (q3.b) this.f56175c;
                if (bVar != null && localeList == ((LocaleList) this.f56174b)) {
                    return bVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.add(new q3.a(localeList.get(i11)));
                }
                q3.b bVar2 = new q3.b(arrayList);
                this.f56174b = localeList;
                this.f56175c = bVar2;
                return bVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ce.y
    public void z() {
        a0 a0Var = (a0) ((com.bumptech.glide.load.data.h) this.f56174b).f7659b;
        synchronized (a0Var) {
            a0Var.f6835c = a0Var.f6833a.length;
        }
    }

    public c(l.m mVar, y1 y1Var) {
        this.f56173a = 2;
        this.f56174b = mVar;
        this.f56175c = y1Var;
    }

    @Override // jp.m0
    public void D(ConstraintLayout constraintLayout) {
        int i11;
        int i12 = this.f56173a;
        String str = DytezVyM.pyf;
        int i13 = 0;
        switch (i12) {
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                qp.b0 b0Var = (qp.b0) this.f56175c;
                View viewFindViewById = constraintLayout.findViewById(R.id.txt_answer_txt_2);
                kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                TextView textView = (TextView) viewFindViewById;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((String) this.f56174b);
                if (spannableStringBuilder.length() > 0) {
                    int[] iArr = bq.r.f4959a;
                    if (!bq.m.F() && b0Var.y()) {
                        String upperCase = String.valueOf(spannableStringBuilder.charAt(0)).toUpperCase(bq.m.p());
                        kotlin.jvm.internal.m.e(upperCase, "toUpperCase(...)");
                        spannableStringBuilder.replace(0, 1, (CharSequence) upperCase);
                    }
                }
                ArrayList arrayList = (ArrayList) this.f56176d;
                int size = arrayList.size();
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    kotlin.jvm.internal.m.e(obj, "next(...)");
                    int iIntValue = ((Number) obj).intValue();
                    try {
                        Context context = b0Var.f47883c;
                        kotlin.jvm.internal.m.f(context, str);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(R.color.color_wrong_high_light)), iIntValue, iIntValue + 1, 33);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
                textView.setText(spannableStringBuilder);
                break;
            default:
                d3 d3Var = (d3) this.f56175c;
                TextView textView2 = (TextView) constraintLayout.findViewById(R.id.txt_answer_txt_2);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) this.f56174b);
                if (spannableStringBuilder2.length() > 0 && (i11 = d3Var.f47884d.keyLanguage) != 0 && i11 != 2 && i11 != 1) {
                    String strValueOf = String.valueOf(spannableStringBuilder2.charAt(0));
                    int[] iArr2 = bq.r.f4959a;
                    String upperCase2 = strValueOf.toUpperCase(bq.m.p());
                    kotlin.jvm.internal.m.e(upperCase2, "toUpperCase(...)");
                    spannableStringBuilder2.replace(0, 1, (CharSequence) upperCase2);
                }
                ArrayList arrayList2 = (ArrayList) this.f56176d;
                int size2 = arrayList2.size();
                while (i13 < size2) {
                    Object obj2 = arrayList2.get(i13);
                    i13++;
                    kotlin.jvm.internal.m.e(obj2, "next(...)");
                    int iIntValue2 = ((Number) obj2).intValue();
                    try {
                        Context context2 = d3Var.f47883c;
                        kotlin.jvm.internal.m.f(context2, str);
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(context2.getColor(R.color.color_wrong_high_light)), iIntValue2, iIntValue2 + 1, 33);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                textView2.setText(spannableStringBuilder2);
                break;
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f56173a) {
            case 17:
                Boolean aBoolean = (Boolean) obj;
                ki.a aVar = (ki.a) this.f56174b;
                Context context = (Context) this.f56175c;
                kotlin.jvm.internal.m.f(aBoolean, "aBoolean");
                if (aBoolean.booleanValue()) {
                    aVar.m();
                    return;
                }
                aVar.B();
                kotlin.jvm.internal.m.d(context, bjXGJ.EdgEVy);
                Activity activity = (Activity) context;
                if (!activity.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    Snackbar snackbarH = Snackbar.h(activity.findViewById(android.R.id.content), R.string.to_record_an_audio_please_allow_lingodeer_to_use_microphone);
                    snackbarH.i(new bq.s(context, 3));
                    snackbarH.j();
                    return;
                } else {
                    lc.d dVar = new lc.d(context);
                    RxPermissions rxPermissions = (RxPermissions) this.f56176d;
                    lc.d.c(dVar, Integer.valueOf(R.string.to_record_an_audio_please_allow_lingodeer_to_use_microphone), null, 6);
                    lc.d.e(dVar, Integer.valueOf(R.string.retry), null, new ki.b(aVar, rxPermissions, context, 1), 2);
                    lc.d.d(dVar, new t0(12), 2);
                    dVar.show();
                    return;
                }
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                om.j jVar = (om.j) this.f56174b;
                JPChar jPChar = (JPChar) this.f56175c;
                CardView cardView = jVar.M;
                kotlin.jvm.internal.m.c(cardView);
                CardView cardView2 = (CardView) this.f56176d;
                cardView.setVisibility(8);
                cardView2.setVisibility(8);
                ta.a aVar2 = jVar.f45600c;
                kotlin.jvm.internal.m.c(aVar2);
                View childAt = ((p6) aVar2).f33103d.getChildAt(jVar.P);
                kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                CardView cardView3 = (CardView) childAt;
                cardView3.setTag(jPChar);
                cardView3.setCardElevation(ff.h.l(2.0f));
                View viewFindViewById = cardView3.findViewById(R.id.tv_top);
                kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                TextView textView = (TextView) viewFindViewById;
                View viewFindViewById2 = cardView3.findViewById(R.id.tv_middle);
                kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
                TextView textView2 = (TextView) viewFindViewById2;
                View viewFindViewById3 = cardView3.findViewById(R.id.tv_bottom);
                kotlin.jvm.internal.m.e(viewFindViewById3, "findViewById(...)");
                TextView textView3 = (TextView) viewFindViewById3;
                textView.setVisibility(0);
                textView3.setVisibility(0);
                jVar.l(jPChar, textView, textView2, textView3);
                z.b(cardView3, new w0(8, jVar, jPChar));
                jVar.O.add(cardView3);
                th.j.a(qx.h.m(400L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new dm.c(cardView3, jVar, textView, textView2, 12), om.a.K), jVar.f45601d);
                jVar.M = null;
                jVar.P++;
                ArrayList arrayList = jVar.N;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    View view = (View) arrayList.get(i11);
                    kotlin.jvm.internal.m.d(view, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                    int defaultColor = ((CardView) view).getCardBackgroundColor().getDefaultColor();
                    Context context2 = jVar.H;
                    if (context2 == null) {
                        kotlin.jvm.internal.m.n("mContext");
                        throw null;
                    }
                    view.setClickable(defaultColor == context2.getColor(R.color.white));
                }
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    View view2 = (View) arrayList.get(i12);
                    kotlin.jvm.internal.m.d(view2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                    int defaultColor2 = ((CardView) view2).getCardBackgroundColor().getDefaultColor();
                    Context context3 = jVar.H;
                    if (context3 == null) {
                        kotlin.jvm.internal.m.n("mContext");
                        throw null;
                    }
                    if (defaultColor2 == context3.getColor(R.color.white)) {
                        return;
                    }
                }
                jVar.f45614e.f43850a.x(2);
                return;
            default:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                qh.e eVar = (qh.e) this.f56174b;
                ta.a aVar3 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ((u5) aVar3).f33410j.animate().alpha(CropImageView.DEFAULT_ASPECT_RATIO).setDuration(300L).start();
                ta.a aVar4 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ((u5) aVar4).f33421v.setText("0");
                ta.a aVar5 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                LinearLayout linearLayout = ((u5) aVar5).f33417r;
                linearLayout.setVisibility(0);
                linearLayout.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                linearLayout.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
                ta.a aVar6 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                ImageView imageView = ((u5) aVar6).f33409i;
                imageView.setVisibility(0);
                imageView.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                imageView.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
                ta.a aVar7 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar7);
                ImageView imageView2 = ((u5) aVar7).f33408h;
                imageView2.setVisibility(0);
                imageView2.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                imageView2.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
                ta.a aVar8 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                ((u5) aVar8).f33409i.setImageResource(R.drawable.ic_game_word_choose_finish_house);
                sh.b bVar = eVar.N;
                if (bVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (bVar.f51684f > 0) {
                    ta.a aVar9 = eVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar9);
                    ((u5) aVar9).f33408h.setImageResource(R.drawable.ic_game_word_choose_finish_deer);
                    sh.b bVar2 = eVar.N;
                    if (bVar2 == null) {
                        kotlin.jvm.internal.m.n("viewModel");
                        throw null;
                    }
                    ValueAnimator duration = ValueAnimator.ofInt(0, bVar2.f51684f).setDuration(300L);
                    duration.addUpdateListener(new com.google.android.material.motion.c(eVar, 6));
                    duration.setStartDelay(500L);
                    duration.start();
                } else {
                    ta.a aVar10 = eVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar10);
                    ((u5) aVar10).f33408h.setImageResource(R.drawable.ic_game_word_choose_finish_deer_empty);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = ((ImageView) this.f56175c).animate();
                Context contextRequireContext = eVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                viewPropertyAnimatorAnimate.translationXBy(j3.Z(-667, contextRequireContext)).setDuration(400L).start();
                ViewPropertyAnimator viewPropertyAnimatorAnimate2 = ((ImageView) this.f56176d).animate();
                Context contextRequireContext2 = eVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                viewPropertyAnimatorAnimate2.translationXBy(j3.Z(641, contextRequireContext2)).setDuration(400L).start();
                th.j.a(qx.h.m(3000L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(eVar, 14), vx.b.f54316e), eVar.f36401t);
                return;
        }
    }

    public Object I(SSLSocket sSLSocket, Object... objArr) {
        Method methodF = F(sSLSocket.getClass());
        if (methodF != null) {
            try {
                return methodF.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException e8) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodF);
                assertionError.initCause(e8);
                throw assertionError;
            }
        }
        throw new AssertionError(MzwEyWCkjXL.Frtqqc + ((String) this.f56175c) + " not supported for object " + sSLSocket);
    }

    public c(l1.y1 y1Var) {
        this.f56173a = 19;
        this.f56174b = new t1.a(0);
        this.f56175c = new a9.i(12);
        this.f56176d = new fp.f(29, this, y1Var);
    }

    public c(int i11) {
        this.f56173a = i11;
        int i12 = 28;
        switch (i11) {
            case 1:
                break;
            case 23:
                this.f56174b = new p2(16);
                long[] jArr = r0.f56756a;
                this.f56175c = new i0();
                this.f56176d = new p3(i12);
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                u uVar = u.f43702c;
                this.f56174b = uVar;
                this.f56175c = uVar;
                this.f56176d = uVar;
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                this.f56176d = new p3(i12);
                break;
            default:
                this.f56173a = 0;
                this.f56174b = m6.n.f40911a;
                this.f56175c = n6.h.f43459a;
                this.f56176d = r1.f25039a;
                break;
        }
    }

    public c(File file) {
        this.f56173a = 6;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f56176d = randomAccessFile;
        this.f56175c = randomAccessFile.getFD();
        this.f56174b = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    public c(List list) {
        this.f56173a = 8;
        this.f56174b = list;
        this.f56175c = new e0[list.size()];
        b7.c cVar = new b7.c(new com.google.firebase.database.android.d(this, 11));
        this.f56176d = cVar;
        cVar.e(3);
    }

    public c(String str) {
        this.f56173a = 7;
        y6.o oVar = new y6.o();
        oVar.f57264l = y6.d0.o("video/mp2t");
        oVar.m = y6.d0.o(str);
        this.f56174b = new p(oVar);
    }

    public c(i2.b bVar) {
        this.f56173a = 12;
        this.f56176d = bVar;
        this.f56174b = new b2(this, 19);
    }

    public c(ConnectivityManager connectivityManager, kc.m mVar) {
        this.f56173a = 9;
        this.f56174b = connectivityManager;
        this.f56175c = mVar;
        fc.g gVar = new fc.g(this, 0);
        this.f56176d = gVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), gVar);
    }

    public c(z6.f[] fVarArr) {
        this.f56173a = 10;
        h7.c0 c0Var = new h7.c0();
        z6.i iVar = new z6.i();
        iVar.f58974c = 1.0f;
        iVar.f58975d = 1.0f;
        z6.e eVar = z6.e.f58938e;
        iVar.f58976e = eVar;
        iVar.f58977f = eVar;
        iVar.f58978g = eVar;
        iVar.f58979h = eVar;
        ByteBuffer byteBuffer = z6.f.f58943a;
        iVar.f58982k = byteBuffer;
        iVar.f58983l = byteBuffer.asShortBuffer();
        iVar.m = byteBuffer;
        iVar.f58973b = -1;
        z6.f[] fVarArr2 = new z6.f[fVarArr.length + 2];
        this.f56174b = fVarArr2;
        System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
        this.f56175c = c0Var;
        this.f56176d = iVar;
        fVarArr2[fVarArr.length] = c0Var;
        fVarArr2[fVarArr.length + 1] = iVar;
    }

    public c(pe.j jVar, ArrayList arrayList, m0.n nVar) {
        this.f56173a = 4;
        pe.f.c(nVar, "Argument must not be null");
        this.f56175c = nVar;
        pe.f.c(arrayList, "Argument must not be null");
        this.f56176d = arrayList;
        this.f56174b = new com.bumptech.glide.load.data.h(jVar, nVar);
    }

    public c(a5.j jVar) {
        this.f56173a = 3;
        this.f56174b = jVar;
        this.f56175c = new ReentrantLock();
        this.f56176d = new WeakHashMap();
    }

    public c(mw.v vVar, lw.y yVar) {
        this.f56173a = 21;
        this.f56176d = vVar;
        this.f56174b = yVar;
    }
}
