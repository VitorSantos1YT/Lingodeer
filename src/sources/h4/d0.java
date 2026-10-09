package h4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f31583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.c0 f31584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c0 f31585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f31586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f31587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f31588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray f31589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f31590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseIntArray f31591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f31592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MotionEvent f31594l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f31595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f31596o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f31597p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a9.i f31598q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f31599r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f31600s;

    public static int d(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        return (identifier != -1 || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    public final boolean a(int i11, MotionLayout motionLayout) {
        c0 c0Var;
        if (this.f31596o == null) {
            ArrayList arrayList = this.f31586d;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                c0 c0Var2 = (c0) obj;
                int i13 = c0Var2.f31577n;
                if (i13 != 0 && ((c0Var = this.f31585c) != c0Var2 || (c0Var.f31581r & 2) == 0)) {
                    if (i11 == c0Var2.f31568d && (i13 == 4 || i13 == 2)) {
                        z zVar = z.FINISHED;
                        motionLayout.setState(zVar);
                        motionLayout.setTransition(c0Var2);
                        if (c0Var2.f31577n == 4) {
                            motionLayout.r(1.0f);
                            motionLayout.X0 = null;
                            motionLayout.setState(z.SETUP);
                            motionLayout.setState(z.MOVING);
                            return true;
                        }
                        motionLayout.setProgress(1.0f);
                        motionLayout.t(true);
                        motionLayout.setState(z.SETUP);
                        motionLayout.setState(z.MOVING);
                        motionLayout.setState(zVar);
                        motionLayout.A();
                        return true;
                    }
                    if (i11 == c0Var2.f31567c && (i13 == 3 || i13 == 1)) {
                        z zVar2 = z.FINISHED;
                        motionLayout.setState(zVar2);
                        motionLayout.setTransition(c0Var2);
                        if (c0Var2.f31577n == 3) {
                            motionLayout.r(CropImageView.DEFAULT_ASPECT_RATIO);
                            motionLayout.setState(z.SETUP);
                            motionLayout.setState(z.MOVING);
                            return true;
                        }
                        motionLayout.setProgress(CropImageView.DEFAULT_ASPECT_RATIO);
                        motionLayout.t(true);
                        motionLayout.setState(z.SETUP);
                        motionLayout.setState(z.MOVING);
                        motionLayout.setState(zVar2);
                        motionLayout.A();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final j4.p b(int i11) {
        int iH;
        com.android.billingclient.api.c0 c0Var = this.f31584b;
        if (c0Var != null && (iH = c0Var.h(i11)) != -1) {
            i11 = iH;
        }
        SparseArray sparseArray = this.f31589g;
        if (sparseArray.get(i11) != null) {
            return (j4.p) sparseArray.get(i11);
        }
        fb.g0.s(this.f31583a.getContext(), i11);
        return (j4.p) sparseArray.get(sparseArray.keyAt(0));
    }

    public final int c() {
        c0 c0Var = this.f31585c;
        return c0Var != null ? c0Var.f31572h : this.f31592j;
    }

    public final Interpolator e() {
        c0 c0Var = this.f31585c;
        int i11 = c0Var.f31569e;
        if (i11 == -2) {
            return AnimationUtils.loadInterpolator(this.f31583a.getContext(), this.f31585c.f31571g);
        }
        if (i11 == -1) {
            return new p(c4.e.d(c0Var.f31570f), 1);
        }
        if (i11 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i11 == 1) {
            return new AccelerateInterpolator();
        }
        if (i11 == 2) {
            return new DecelerateInterpolator();
        }
        if (i11 == 4) {
            return new BounceInterpolator();
        }
        if (i11 == 5) {
            return new OvershootInterpolator();
        }
        if (i11 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void f(q qVar) {
        c0 c0Var = this.f31585c;
        int i11 = 0;
        if (c0Var != null) {
            ArrayList arrayList = c0Var.f31575k;
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((h) obj).a(qVar);
            }
            return;
        }
        c0 c0Var2 = this.f31587e;
        if (c0Var2 != null) {
            ArrayList arrayList2 = c0Var2.f31575k;
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                ((h) obj2).a(qVar);
            }
        }
    }

    public final float g() {
        f0 f0Var;
        c0 c0Var = this.f31585c;
        return (c0Var == null || (f0Var = c0Var.f31576l) == null) ? CropImageView.DEFAULT_ASPECT_RATIO : f0Var.f31634t;
    }

    public final int h() {
        c0 c0Var = this.f31585c;
        if (c0Var == null) {
            return -1;
        }
        return c0Var.f31568d;
    }

    public final int i(Context context, XmlResourceParser xmlResourceParser) {
        j4.p pVar = new j4.p();
        pVar.f36015f = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iD = -1;
        int iD2 = -1;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeName = xmlResourceParser.getAttributeName(i11);
            String attributeValue = xmlResourceParser.getAttributeValue(i11);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iD2 = d(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        pVar.f36013d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                pVar.f36013d = 4;
                                break;
                            case "left":
                                pVar.f36013d = 2;
                                break;
                            case "none":
                                pVar.f36013d = 0;
                                break;
                            case "right":
                                pVar.f36013d = 1;
                                break;
                            case "x_right":
                                pVar.f36013d = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iD = d(context, attributeValue);
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    this.f31590h.put(attributeValue, Integer.valueOf(iD));
                    pVar.f36010a = fb.g0.s(context, iD);
                    break;
                case "stateLabels":
                    pVar.f36012c = attributeValue.split(",");
                    int i12 = 0;
                    while (true) {
                        String[] strArr = pVar.f36012c;
                        if (i12 < strArr.length) {
                            strArr[i12] = strArr[i12].trim();
                            i12++;
                        }
                    }
                    break;
            }
        }
        if (iD != -1) {
            int i13 = this.f31583a.f1289p0;
            pVar.k(context, xmlResourceParser);
            if (iD2 != -1) {
                this.f31591i.put(iD, iD2);
            }
            this.f31589g.put(iD, pVar);
        }
        return iD;
    }

    public final int j(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return i(context, xml);
                }
            }
            return -1;
        } catch (IOException | XmlPullParserException unused) {
            return -1;
        }
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), j4.t.H);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                j(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void l(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), j4.t.f36047w);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f31592j);
                this.f31592j = i12;
                if (i12 < 8) {
                    this.f31592j = 8;
                }
            } else if (index == 1) {
                this.f31593k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void m(int i11, MotionLayout motionLayout) {
        SparseArray sparseArray = this.f31589g;
        j4.p pVar = (j4.p) sparseArray.get(i11);
        String str = pVar.f36010a;
        HashMap map = pVar.f36016g;
        pVar.f36011b = str;
        int i12 = this.f31591i.get(i11);
        if (i12 > 0) {
            m(i12, motionLayout);
            j4.p pVar2 = (j4.p) sparseArray.get(i12);
            if (pVar2 == null) {
                fb.g0.s(this.f31583a.getContext(), i12);
                return;
            }
            HashMap map2 = pVar2.f36016g;
            pVar.f36011b += "/" + pVar2.f36011b;
            for (Integer num : map2.keySet()) {
                num.getClass();
                j4.k kVar = (j4.k) map2.get(num);
                if (!map.containsKey(num)) {
                    map.put(num, new j4.k());
                }
                j4.k kVar2 = (j4.k) map.get(num);
                if (kVar2 != null) {
                    j4.l lVar = kVar2.f35929e;
                    if (!lVar.f35936b) {
                        lVar.a(kVar.f35929e);
                    }
                    j4.n nVar = kVar2.f35927c;
                    if (!nVar.f35988a) {
                        j4.n nVar2 = kVar.f35927c;
                        nVar.f35988a = nVar2.f35988a;
                        nVar.f35989b = nVar2.f35989b;
                        nVar.f35991d = nVar2.f35991d;
                        nVar.f35992e = nVar2.f35992e;
                        nVar.f35990c = nVar2.f35990c;
                    }
                    j4.o oVar = kVar2.f35930f;
                    if (!oVar.f35994a) {
                        oVar.a(kVar.f35930f);
                    }
                    j4.m mVar = kVar2.f35928d;
                    if (!mVar.f35976a) {
                        mVar.a(kVar.f35928d);
                    }
                    for (String str2 : kVar.f35931g.keySet()) {
                        if (!kVar2.f35931g.containsKey(str2)) {
                            kVar2.f35931g.put(str2, (j4.b) kVar.f35931g.get(str2));
                        }
                    }
                }
            }
        } else {
            pVar.f36011b = ep.a.k(new StringBuilder(), pVar.f36011b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = motionLayout.getChildAt(i13);
                j4.e eVar = (j4.e) childAt.getLayoutParams();
                int id2 = childAt.getId();
                if (pVar.f36015f && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!map.containsKey(Integer.valueOf(id2))) {
                    map.put(Integer.valueOf(id2), new j4.k());
                }
                j4.k kVar3 = (j4.k) map.get(Integer.valueOf(id2));
                if (kVar3 != null) {
                    j4.n nVar3 = kVar3.f35927c;
                    j4.l lVar2 = kVar3.f35929e;
                    j4.o oVar2 = kVar3.f35930f;
                    if (!lVar2.f35936b) {
                        kVar3.c(id2, eVar);
                        if (childAt instanceof ConstraintHelper) {
                            lVar2.f35953j0 = ((ConstraintHelper) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                lVar2.f35962o0 = barrier.getAllowsGoneWidget();
                                lVar2.f35947g0 = barrier.getType();
                                lVar2.f35949h0 = barrier.getMargin();
                            }
                        }
                        lVar2.f35936b = true;
                    }
                    if (!nVar3.f35988a) {
                        nVar3.f35989b = childAt.getVisibility();
                        nVar3.f35991d = childAt.getAlpha();
                        nVar3.f35988a = true;
                    }
                    if (!oVar2.f35994a) {
                        oVar2.f35994a = true;
                        oVar2.f35995b = childAt.getRotation();
                        oVar2.f35996c = childAt.getRotationX();
                        oVar2.f35997d = childAt.getRotationY();
                        oVar2.f35998e = childAt.getScaleX();
                        oVar2.f35999f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            oVar2.f36000g = pivotX;
                            oVar2.f36001h = pivotY;
                        }
                        oVar2.f36003j = childAt.getTranslationX();
                        oVar2.f36004k = childAt.getTranslationY();
                        oVar2.f36005l = childAt.getTranslationZ();
                        if (oVar2.m) {
                            oVar2.f36006n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (j4.k kVar4 : map.values()) {
            if (kVar4.f35932h != null) {
                if (kVar4.f35926b == null) {
                    kVar4.f35932h.e(pVar.i(kVar4.f35925a));
                } else {
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        j4.k kVarI = pVar.i(((Integer) it.next()).intValue());
                        String str3 = kVarI.f35929e.f35957l0;
                        if (str3 != null && kVar4.f35926b.matches(str3)) {
                            kVar4.f35932h.e(kVarI);
                            kVarI.f35931g.putAll((HashMap) kVar4.f35931g.clone());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    /* JADX WARN: Code duplicated, block: B:31:0x004d  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public final void n(int i11, int i12) {
        int iH;
        int iH2;
        c0 c0Var;
        ArrayList arrayList;
        int size;
        int i13;
        int i14;
        ArrayList arrayList2;
        int size2;
        c0 c0Var2;
        c0 c0Var3;
        c0 c0Var4;
        c0 c0Var5;
        int i15;
        f0 f0Var;
        com.android.billingclient.api.c0 c0Var6 = this.f31584b;
        if (c0Var6 != null) {
            iH = c0Var6.h(i11);
            if (iH == -1) {
                iH = i11;
            }
            iH2 = this.f31584b.h(i12);
            if (iH2 == -1) {
            }
            c0Var = this.f31585c;
            if (c0Var == null && c0Var.f31567c == i12 && c0Var.f31568d == i11) {
                return;
            }
            arrayList = this.f31586d;
            size = arrayList.size();
            i13 = 0;
            i14 = 0;
            while (true) {
                if (i14 < size) {
                    arrayList2 = this.f31588f;
                    size2 = arrayList2.size();
                    c0Var2 = this.f31587e;
                    while (i13 < size2) {
                        Object obj = arrayList2.get(i13);
                        i13++;
                        c0Var4 = (c0) obj;
                        if (c0Var4.f31567c == i12) {
                            c0Var2 = c0Var4;
                        }
                    }
                    c0Var3 = new c0(this, c0Var2);
                    c0Var3.f31568d = iH;
                    c0Var3.f31567c = iH2;
                    if (iH != -1) {
                        arrayList.add(c0Var3);
                    }
                    this.f31585c = c0Var3;
                    return;
                }
                Object obj2 = arrayList.get(i14);
                i14++;
                c0Var5 = (c0) obj2;
                i15 = c0Var5.f31567c;
                if ((i15 != iH2 && c0Var5.f31568d == iH) || (i15 == i12 && c0Var5.f31568d == i11)) {
                    break;
                }
            }
            this.f31585c = c0Var5;
            f0Var = c0Var5.f31576l;
            if (f0Var != null) {
                f0Var.c(this.f31597p);
            }
        }
        iH = i11;
        iH2 = i12;
        c0Var = this.f31585c;
        if (c0Var == null) {
        }
        arrayList = this.f31586d;
        size = arrayList.size();
        i13 = 0;
        i14 = 0;
        while (true) {
            if (i14 < size) {
                arrayList2 = this.f31588f;
                size2 = arrayList2.size();
                c0Var2 = this.f31587e;
                while (i13 < size2) {
                    Object obj3 = arrayList2.get(i13);
                    i13++;
                    c0Var4 = (c0) obj3;
                    if (c0Var4.f31567c == i12) {
                        c0Var2 = c0Var4;
                    }
                }
                c0Var3 = new c0(this, c0Var2);
                c0Var3.f31568d = iH;
                c0Var3.f31567c = iH2;
                if (iH != -1) {
                    arrayList.add(c0Var3);
                }
                this.f31585c = c0Var3;
                return;
            }
            Object obj4 = arrayList.get(i14);
            i14++;
            c0Var5 = (c0) obj4;
            i15 = c0Var5.f31567c;
            if (i15 != iH2) {
            }
        }
        this.f31585c = c0Var5;
        f0Var = c0Var5.f31576l;
        if (f0Var != null) {
            f0Var.c(this.f31597p);
        }
    }

    public final boolean o() {
        ArrayList arrayList = this.f31586d;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (((c0) obj).f31576l != null) {
                return true;
            }
        }
        c0 c0Var = this.f31585c;
        return (c0Var == null || c0Var.f31576l == null) ? false : true;
    }

    public d0(Context context, MotionLayout motionLayout, int i11) {
        this.f31584b = null;
        this.f31585c = null;
        ArrayList arrayList = new ArrayList();
        this.f31586d = arrayList;
        this.f31587e = null;
        this.f31588f = new ArrayList();
        this.f31589g = new SparseArray();
        this.f31590h = new HashMap();
        this.f31591i = new SparseIntArray();
        this.f31592j = 400;
        this.f31593k = 0;
        this.m = false;
        this.f31595n = false;
        this.f31583a = motionLayout;
        a9.i iVar = new a9.i();
        iVar.f518b = new ArrayList();
        iVar.f521e = new ArrayList();
        iVar.f517a = motionLayout;
        this.f31598q = iVar;
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            c0 c0Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals(ypOOxsaJG.ncVwk)) {
                                i(context, xml);
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                h hVar = new h(context, xml);
                                if (c0Var != null) {
                                    c0Var.f31575k.add(hVar);
                                }
                            }
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                k(context, xml);
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                h0 h0Var = new h0(context, xml);
                                a9.i iVar2 = this.f31598q;
                                ((ArrayList) iVar2.f518b).add(h0Var);
                                iVar2.f519c = null;
                                int i12 = h0Var.f31674b;
                                if (i12 == 4) {
                                    ConstraintLayout.getSharedValues().a(h0Var.f31692u, new i0());
                                } else if (i12 == 5) {
                                    ConstraintLayout.getSharedValues().a(h0Var.f31692u, new i0());
                                }
                            }
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                c0Var = new c0(this, context, xml);
                                arrayList.add(c0Var);
                                if (this.f31585c == null && !c0Var.f31566b) {
                                    this.f31585c = c0Var;
                                    f0 f0Var = c0Var.f31576l;
                                    if (f0Var != null) {
                                        f0Var.c(this.f31597p);
                                    }
                                }
                                if (c0Var.f31566b) {
                                    if (c0Var.f31567c == -1) {
                                        this.f31587e = c0Var;
                                    } else {
                                        this.f31588f.add(c0Var);
                                    }
                                    arrayList.remove(c0Var);
                                }
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick") && c0Var != null && !motionLayout.isInEditMode()) {
                                c0Var.m.add(new b0(context, c0Var, xml));
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (c0Var == null) {
                                    context.getResources().getResourceEntryName(i11);
                                    xml.getLineNumber();
                                }
                                if (c0Var != null) {
                                    c0Var.f31576l = new f0(context, motionLayout, xml);
                                }
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                l(context, xml);
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.f31584b = new com.android.billingclient.api.c0(context, xml);
                            }
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                k(context, xml);
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        this.f31589g.put(R.id.motion_base, new j4.p());
        this.f31590h.put("motion_base", Integer.valueOf(R.id.motion_base));
    }
}
