package qp;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.facebook.FacebookException;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mt.j5;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m4 implements tx.c, lf.i1, av.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f48060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f48061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f48062d;

    public /* synthetic */ m4(Object obj, Object obj2, Object obj3, int i11) {
        this.f48059a = i11;
        this.f48060b = obj;
        this.f48061c = obj2;
        this.f48062d = obj3;
    }

    public static m4 j(Context context, AttributeSet attributeSet, int[] iArr) {
        return new m4(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static m4 k(Context context, AttributeSet attributeSet, int[] iArr, int i11) {
        return new m4(context, context.obtainStyledAttributes(attributeSet, iArr, i11, 0));
    }

    @Override // av.l
    public void a() {
        ((kotlin.jvm.internal.y) this.f48060b).f38361a = rz.e0.B((rz.b0) this.f48061c, null, null, new ys.c0((fz.c) this.f48062d, null), 3);
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f48059a) {
            case 0:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ((CardView) this.f48060b).setVisibility(0);
                TextView textView = (TextView) this.f48061c;
                ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                Integer numValueOf = Integer.valueOf(textView.getTextColors().getDefaultColor());
                Context context = ((n4) this.f48062d).f47883c;
                kotlin.jvm.internal.m.f(context, "context");
                ObjectAnimator.ofObject(textView, "textColor", argbEvaluator, numValueOf, Integer.valueOf(context.getColor(R.color.colorAccent))).setDuration(300L).start();
                break;
            default:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                ((View) this.f48060b).setEnabled(false);
                View view = (View) this.f48061c;
                boolean z11 = true;
                view.setEnabled(true);
                view.setVisibility(0);
                zi.i iVar = (zi.i) this.f48062d;
                ta.a aVar = iVar.f59227f;
                kotlin.jvm.internal.m.c(aVar);
                int childCount = ((hj.x1) aVar).f33564c.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    ta.a aVar2 = iVar.f59227f;
                    kotlin.jvm.internal.m.c(aVar2);
                    if (((hj.x1) aVar2).f33564c.getChildAt(i11).getTag(R.id.tag_pinyin) == null) {
                        z11 = false;
                    }
                }
                if (z11) {
                    ((jp.p0) iVar.f59222a).O(4);
                }
                break;
        }
    }

    @Override // lf.i1
    public void b(JSONObject jSONObject) {
        String string;
        Bundle bundle = (Bundle) this.f48060b;
        tf.p pVar = (tf.p) this.f48061c;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("id");
            } catch (JSONException e8) {
                tf.w wVarD = pVar.d();
                tf.t tVar = pVar.d().f52234t;
                String message = e8.getMessage();
                ArrayList arrayListL = w4.c.l("Caught exception");
                if (message != null) {
                    arrayListL.add(message);
                }
                wVarD.c(new tf.v(tVar, tf.u.ERROR, null, TextUtils.join(": ", arrayListL), null));
                return;
            }
        } else {
            string = null;
        }
        bundle.putString("com.facebook.platform.extra.USER_ID", string);
        pVar.n((tf.t) this.f48062d, bundle);
    }

    @Override // lf.i1
    public void c(FacebookException facebookException) {
        tf.p pVar = (tf.p) this.f48061c;
        tf.w wVarD = pVar.d();
        tf.t tVar = pVar.d().f52234t;
        String message = facebookException != null ? facebookException.getMessage() : null;
        ArrayList arrayListL = w4.c.l("Caught exception");
        if (message != null) {
            arrayListL.add(message);
        }
        wVarD.c(new tf.v(tVar, tf.u.ERROR, null, TextUtils.join(": ", arrayListL), null));
    }

    public boolean d() {
        synchronized (this) {
            if (((AtomicBoolean) this.f48062d).get()) {
                return false;
            }
            ((AtomicInteger) this.f48061c).incrementAndGet();
            return true;
        }
    }

    public Object e() {
        long jC = t1.e.c();
        if (jC == t1.l.f52007a) {
            return this.f48062d;
        }
        t1.k kVar = (t1.k) ((AtomicReference) this.f48060b).get();
        int iA = kVar.a(jC);
        if (iA >= 0) {
            return kVar.f52006c[iA];
        }
        return null;
    }

    public ColorStateList f(int i11) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) this.f48061c;
        return (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0 || (colorStateListB = o4.c.b((Context) this.f48060b, resourceId)) == null) ? typedArray.getColorStateList(i11) : colorStateListB;
    }

    public Drawable g(int i11) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f48061c;
        return (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0) ? typedArray.getDrawable(i11) : jh.h.k((Context) this.f48060b, resourceId);
    }

    public Drawable h(int i11) {
        int resourceId;
        Drawable drawableD;
        if (!((TypedArray) this.f48061c).hasValue(i11) || (resourceId = ((TypedArray) this.f48061c).getResourceId(i11, 0)) == 0) {
            return null;
        }
        r.s sVarA = r.s.a();
        Context context = (Context) this.f48060b;
        synchronized (sVarA) {
            drawableD = sVarA.f48642a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public Typeface i(int i11, int i12, r.k0 k0Var) {
        int resourceId = ((TypedArray) this.f48061c).getResourceId(i11, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f48062d) == null) {
            this.f48062d = new TypedValue();
        }
        Context context = (Context) this.f48060b;
        TypedValue typedValue = (TypedValue) this.f48062d;
        ThreadLocal threadLocal = q4.j.f47447a;
        if (context.isRestricted()) {
            return null;
        }
        return q4.j.b(context, resourceId, typedValue, i12, k0Var, true, false);
    }

    public void l() {
        ((TypedArray) this.f48061c).recycle();
    }

    public void m(Object obj) {
        long jC = t1.e.c();
        if (jC == t1.l.f52007a) {
            this.f48062d = obj;
            return;
        }
        synchronized (this.f48061c) {
            t1.k kVar = (t1.k) ((AtomicReference) this.f48060b).get();
            int iA = kVar.a(jC);
            if (iA < 0) {
                ((AtomicReference) this.f48060b).set(kVar.b(jC, obj));
            } else {
                kVar.f52006c[iA] = obj;
            }
        }
    }

    public void n() {
        synchronized (this) {
            ((AtomicInteger) this.f48061c).decrementAndGet();
            if (((AtomicInteger) this.f48061c).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public m4(j5 j5Var) {
        this.f48059a = 8;
        this.f48060b = j5Var;
        this.f48061c = new AtomicInteger(0);
        this.f48062d = new AtomicBoolean(false);
    }

    public m4(int i11) {
        this.f48059a = i11;
        switch (i11) {
            case 3:
                this.f48060b = new AtomicReference(t1.e.f51987c);
                this.f48061c = new Object();
                break;
            default:
                this.f48060b = new WeakHashMap();
                this.f48061c = new WeakHashMap();
                this.f48062d = new WeakHashMap();
                break;
        }
    }

    public m4(Context context, TypedArray typedArray) {
        this.f48059a = 1;
        this.f48060b = context;
        this.f48061c = typedArray;
    }

    public m4(vd.o oVar, le.i iVar, vd.s sVar) {
        this.f48059a = 7;
        this.f48062d = oVar;
        this.f48061c = iVar;
        this.f48060b = sVar;
    }
}
