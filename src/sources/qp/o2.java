package qp;

import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.WindowInsetsAnimation;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.ui.review.adapter.BaseLessonUnitReviewELemAdapter;
import com.lingodeer.R;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o2 implements jp.m0, tx.c, w1.i, wv.a, InstallReferrerStateListener, lf.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f48095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f48096c;

    public /* synthetic */ o2(int i11, Object obj, Object obj2) {
        this.f48094a = i11;
        this.f48095b = obj;
        this.f48096c = obj2;
    }

    @Override // jp.m0
    public void D(ConstraintLayout constraintLayout) {
        ((TextView) ((jp.p0) ((s2) this.f48095b).f47881a).y().findViewById(R.id.txt_answer_txt_2)).setText((SpannableStringBuilder) this.f48096c);
    }

    @Override // w1.i
    public Object a(Object obj) {
        return ((fz.c) this.f48096c).invoke(obj);
    }

    @Override // tx.c
    public void accept(Object obj) {
        BaseLessonUnitReviewELemAdapter.b((Sentence) obj, (ReviewNew) this.f48095b, (BaseViewHolder) this.f48096c);
    }

    @Override // wv.a
    public void b(bw.a aVar) {
        int i11 = aVar.f6384a;
        synchronized (((SparseArray) this.f48096c)) {
            try {
                List arrayList = (List) ((SparseArray) this.f48096c).get(i11);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    ((SparseArray) this.f48096c).put(i11, arrayList);
                }
                arrayList.add(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wv.a
    public void c(int i11) {
    }

    @Override // wv.a
    public void clear() {
        synchronized (((SparseArray) this.f48095b)) {
            ((SparseArray) this.f48095b).clear();
        }
    }

    @Override // wv.a
    public void d(int i11, String str, long j11, long j12, int i12) {
    }

    @Override // wv.a
    public void e(int i11) {
        remove(i11);
    }

    @Override // wv.a
    public void f(int i11, String str, String str2, long j11) {
    }

    @Override // wv.a
    public void g(long j11, int i11, int i12) {
        synchronized (((SparseArray) this.f48096c)) {
            try {
                List<bw.a> list = (List) ((SparseArray) this.f48096c).get(i11);
                if (list == null) {
                    return;
                }
                for (bw.a aVar : list) {
                    if (aVar.f6385b == i12) {
                        aVar.f6387d = j11;
                        return;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lf.m
    public Bundle getParameters() {
        return ob.f.h(((lf.a) this.f48095b).a(), (xf.d) this.f48096c, false);
    }

    @Override // wv.a
    public void h(int i11) {
        synchronized (((SparseArray) this.f48096c)) {
            ((SparseArray) this.f48096c).remove(i11);
        }
    }

    @Override // wv.a
    public void i(Exception exc, int i11) {
    }

    @Override // wv.a
    public void j(int i11) {
    }

    @Override // wv.a
    public void k(bw.c cVar) {
        if (cVar == null) {
            o00.a.P(this, "update but model == null!", new Object[0]);
            return;
        }
        if (r(cVar.f6390a) == null) {
            synchronized (((SparseArray) this.f48095b)) {
                ((SparseArray) this.f48095b).put(cVar.f6390a, cVar);
            }
        } else {
            synchronized (((SparseArray) this.f48095b)) {
                ((SparseArray) this.f48095b).remove(cVar.f6390a);
                ((SparseArray) this.f48095b).put(cVar.f6390a, cVar);
            }
        }
    }

    @Override // lf.m
    public Bundle l() {
        return o00.a.m(((lf.a) this.f48095b).a(), (xf.d) this.f48096c, false);
    }

    @Override // w1.i
    public Object m(w1.k kVar, Object obj) {
        return ((fz.e) this.f48095b).invoke(kVar, obj);
    }

    @Override // wv.a
    public void n(int i11, long j11) {
    }

    @Override // wv.a
    public void o(int i11, long j11, Throwable th2) {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i11) {
        Object objL;
        InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.f48095b;
        if (i11 == 0) {
            try {
                objL = installReferrerClient.getInstallReferrer().getInstallReferrer();
            } catch (Throwable th2) {
                objL = com.bumptech.glide.e.l(th2);
            }
            xg.d dVar = (xg.d) this.f48096c;
            if (!(objL instanceof qy.n)) {
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(dVar), null, null, new xg.b(0, dVar, (String) objL, null), 3);
            }
            Throwable thA = qy.o.a(objL);
            if (thA != null) {
                thA.printStackTrace();
            }
            installReferrerClient.endConnection();
        }
    }

    public x7.m p(Object... objArr) {
        Constructor constructorA;
        synchronized (((AtomicBoolean) this.f48096c)) {
            try {
                if (!((AtomicBoolean) this.f48096c).get()) {
                    try {
                        constructorA = ((se.n) this.f48095b).a();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.f48096c).set(true);
                        constructorA = null;
                    } catch (Exception e8) {
                        throw new RuntimeException("Error instantiating extension", e8);
                    }
                }
                constructorA = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (x7.m) constructorA.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException("Unexpected error creating extractor", e10);
        }
    }

    @Override // wv.a
    public ArrayList q(int i11) {
        List list;
        ArrayList arrayList = new ArrayList();
        synchronized (((SparseArray) this.f48096c)) {
            list = (List) ((SparseArray) this.f48096c).get(i11);
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    @Override // wv.a
    public bw.c r(int i11) {
        bw.c cVar;
        synchronized (((SparseArray) this.f48095b)) {
            cVar = (bw.c) ((SparseArray) this.f48095b).get(i11);
        }
        return cVar;
    }

    @Override // wv.a
    public boolean remove(int i11) {
        synchronized (((SparseArray) this.f48095b)) {
            ((SparseArray) this.f48095b).remove(i11);
        }
        return true;
    }

    @Override // wv.a
    public void s(int i11, int i12) {
    }

    @Override // wv.a
    public void t(int i11, long j11) {
    }

    public o2(BaseLessonUnitReviewELemAdapter baseLessonUnitReviewELemAdapter, ReviewNew reviewNew, BaseViewHolder baseViewHolder) {
        this.f48094a = 4;
        this.f48095b = reviewNew;
        this.f48096c = baseViewHolder;
    }

    public String toString() {
        switch (this.f48094a) {
            case 11:
                return txBUGYhC.VVRnkrXnjWTpqR + ((r4.d) this.f48095b) + " upper=" + ((r4.d) this.f48096c) + "}";
            default:
                return super.toString();
        }
    }

    public o2(WindowInsetsAnimation.Bounds bounds) {
        this.f48094a = 11;
        this.f48095b = z4.e1.g(bounds);
        this.f48096c = z4.e1.f(bounds);
    }

    public o2(int i11) {
        this.f48094a = i11;
        switch (i11) {
            case 3:
                this.f48095b = Choreographer.getInstance();
                this.f48096c = Looper.myLooper();
                break;
            case 7:
                this.f48095b = new SparseArray();
                this.f48096c = new SparseArray();
                break;
            default:
                this.f48095b = new AtomicLong();
                this.f48096c = new AtomicLong();
                break;
        }
    }

    public o2(se.n nVar) {
        this.f48094a = 8;
        this.f48095b = nVar;
        this.f48096c = new AtomicBoolean(false);
    }

    public o2(vd.l lVar, td.a aVar) {
        this.f48094a = 5;
        this.f48096c = lVar;
        this.f48095b = aVar;
    }
}
