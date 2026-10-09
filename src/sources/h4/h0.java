package h4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
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
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31673a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f31678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j4.k f31679g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f31682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f31683k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f31686o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31674b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31675c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31676d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f31680h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f31681i = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f31684l = 0;
    public String m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f31685n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31687p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f31688q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f31689r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f31690s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f31691t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f31692u = -1;

    /* JADX WARN: Code duplicated, block: B:32:0x008d A[Catch: IOException | XmlPullParserException -> 0x0098, IOException | XmlPullParserException -> 0x0098, TryCatch #0 {IOException | XmlPullParserException -> 0x0098, blocks: (B:3:0x0024, B:11:0x0034, B:11:0x0034, B:33:0x0093, B:33:0x0093, B:14:0x003f, B:14:0x003f, B:15:0x0047, B:15:0x0047, B:32:0x008d, B:32:0x008d, B:17:0x004b, B:17:0x004b, B:22:0x005c, B:22:0x005c, B:20:0x0054, B:20:0x0054, B:23:0x0064, B:23:0x0064, B:25:0x006a, B:25:0x006a, B:26:0x006e, B:26:0x006e, B:28:0x0076, B:28:0x0076, B:29:0x007e, B:29:0x007e, B:31:0x0086, B:31:0x0086), top: B:37:0x0024 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public h0(Context context, XmlResourceParser xmlResourceParser) {
        this.f31686o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                fb.g0.q();
                                xmlResourceParser.getLineNumber();
                            } else {
                                this.f31679g = j4.p.d(context, xmlResourceParser);
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                fb.g0.q();
                                xmlResourceParser.getLineNumber();
                            } else {
                                this.f31678f = new h(context, xmlResourceParser);
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                fb.g0.q();
                                xmlResourceParser.getLineNumber();
                            } else {
                                d(context, xmlResourceParser);
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                fb.g0.q();
                                xmlResourceParser.getLineNumber();
                            } else {
                                j4.b.d(context, xmlResourceParser, this.f31679g.f35931g);
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                fb.g0.q();
                                xmlResourceParser.getLineNumber();
                            } else {
                                j4.b.d(context, xmlResourceParser, this.f31679g.f35931g);
                            }
                            break;
                        default:
                            fb.g0.q();
                            xmlResourceParser.getLineNumber();
                            break;
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public final void a(a9.i iVar, MotionLayout motionLayout, int i11, j4.p pVar, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator interpolator;
        if (this.f31675c) {
            return;
        }
        int i12 = this.f31677e;
        h hVar = this.f31678f;
        int i13 = 0;
        if (i12 != 2) {
            j4.k kVar = this.f31679g;
            if (i12 == 1) {
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                int i14 = 0;
                while (i14 < constraintSetIds.length) {
                    int i15 = constraintSetIds[i14];
                    if (i15 != i11) {
                        d0 d0Var = motionLayout.S;
                        j4.p pVarB = d0Var == null ? null : d0Var.b(i15);
                        int length = viewArr.length;
                        for (int i16 = i13; i16 < length; i16++) {
                            j4.k kVarI = pVarB.i(viewArr[i16].getId());
                            if (kVar != null) {
                                j4.j jVar = kVar.f35932h;
                                if (jVar != null) {
                                    jVar.e(kVarI);
                                }
                                kVarI.f35931g.putAll(kVar.f35931g);
                            }
                        }
                    }
                    i14++;
                    i13 = 0;
                }
            }
            j4.p pVar2 = new j4.p();
            HashMap map = pVar2.f36016g;
            map.clear();
            for (Integer num : pVar.f36016g.keySet()) {
                j4.k kVar2 = (j4.k) pVar.f36016g.get(num);
                if (kVar2 != null) {
                    map.put(num, kVar2.clone());
                }
            }
            for (View view : viewArr) {
                j4.k kVarI2 = pVar2.i(view.getId());
                if (kVar != null) {
                    j4.j jVar2 = kVar.f35932h;
                    if (jVar2 != null) {
                        jVar2.e(kVarI2);
                    }
                    kVarI2.f35931g.putAll(kVar.f35931g);
                }
            }
            motionLayout.G(i11, pVar2);
            motionLayout.G(R.id.view_transition, pVar);
            motionLayout.D(R.id.view_transition);
            c0 c0Var = new c0(motionLayout.S, i11);
            for (View view2 : viewArr) {
                int i17 = this.f31680h;
                if (i17 != -1) {
                    c0Var.f31572h = Math.max(i17, 8);
                }
                c0Var.f31579p = this.f31676d;
                int i18 = this.f31684l;
                String str = this.m;
                int i19 = this.f31685n;
                c0Var.f31569e = i18;
                c0Var.f31570f = str;
                c0Var.f31571g = i19;
                int id2 = view2.getId();
                if (hVar != null) {
                    ArrayList arrayList = (ArrayList) hVar.f31672a.get(-1);
                    h hVar2 = new h();
                    hVar2.f31672a = new HashMap();
                    int size = arrayList.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj = arrayList.get(i21);
                        i21++;
                        c cVarB = ((c) obj).clone();
                        cVarB.f31562b = id2;
                        hVar2.b(cVarB);
                    }
                    c0Var.f31575k.add(hVar2);
                }
            }
            motionLayout.setTransition(c0Var);
            b2.c cVar = new b2.c(18, this, viewArr);
            motionLayout.r(1.0f);
            motionLayout.X0 = cVar;
            return;
        }
        View view3 = viewArr[0];
        q qVar = new q(view3);
        a0 a0Var = qVar.f31752f;
        float alpha = CropImageView.DEFAULT_ASPECT_RATIO;
        a0Var.f31553c = CropImageView.DEFAULT_ASPECT_RATIO;
        a0Var.f31554d = CropImageView.DEFAULT_ASPECT_RATIO;
        qVar.H = true;
        a0Var.e(view3.getX(), view3.getY(), view3.getWidth(), view3.getHeight());
        qVar.f31753g.e(view3.getX(), view3.getY(), view3.getWidth(), view3.getHeight());
        o oVar = qVar.f31754h;
        oVar.getClass();
        view3.getX();
        view3.getY();
        view3.getWidth();
        view3.getHeight();
        oVar.f31740c = view3.getVisibility();
        oVar.f31742e = view3.getVisibility() != 0 ? 0.0f : view3.getAlpha();
        oVar.f31743f = view3.getElevation();
        oVar.f31744t = view3.getRotation();
        oVar.H = view3.getRotationX();
        oVar.f31738a = view3.getRotationY();
        oVar.K = view3.getScaleX();
        oVar.L = view3.getScaleY();
        oVar.M = view3.getPivotX();
        oVar.N = view3.getPivotY();
        oVar.O = view3.getTranslationX();
        oVar.P = view3.getTranslationY();
        oVar.Q = view3.getTranslationZ();
        o oVar2 = qVar.f31755i;
        oVar2.getClass();
        view3.getX();
        view3.getY();
        view3.getWidth();
        view3.getHeight();
        oVar2.f31740c = view3.getVisibility();
        if (view3.getVisibility() == 0) {
            alpha = view3.getAlpha();
        }
        oVar2.f31742e = alpha;
        oVar2.f31743f = view3.getElevation();
        oVar2.f31744t = view3.getRotation();
        oVar2.H = view3.getRotationX();
        oVar2.f31738a = view3.getRotationY();
        oVar2.K = view3.getScaleX();
        oVar2.L = view3.getScaleY();
        oVar2.M = view3.getPivotX();
        oVar2.N = view3.getPivotY();
        oVar2.O = view3.getTranslationX();
        oVar2.P = view3.getTranslationY();
        oVar2.Q = view3.getTranslationZ();
        ArrayList arrayList2 = (ArrayList) hVar.f31672a.get(-1);
        if (arrayList2 != null) {
            qVar.f31768w.addAll(arrayList2);
        }
        qVar.i(System.nanoTime(), motionLayout.getWidth(), motionLayout.getHeight());
        int i22 = this.f31680h;
        int i23 = this.f31681i;
        int i24 = this.f31674b;
        Context context = motionLayout.getContext();
        int i25 = this.f31684l;
        if (i25 == -2) {
            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.f31685n);
        } else if (i25 == -1) {
            interpolatorLoadInterpolator = new p(c4.e.d(this.m), 2);
        } else if (i25 == 0) {
            interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
        } else if (i25 == 1) {
            interpolatorLoadInterpolator = new AccelerateInterpolator();
        } else if (i25 == 2) {
            interpolatorLoadInterpolator = new DecelerateInterpolator();
        } else if (i25 == 4) {
            interpolatorLoadInterpolator = new BounceInterpolator();
        } else {
            if (i25 != 5) {
                if (i25 != 6) {
                    interpolator = null;
                } else {
                    interpolatorLoadInterpolator = new AnticipateInterpolator();
                }
                new g0(iVar, qVar, i22, i23, i24, interpolator, this.f31687p, this.f31688q);
            }
            interpolatorLoadInterpolator = new OvershootInterpolator();
        }
        interpolator = interpolatorLoadInterpolator;
        new g0(iVar, qVar, i22, i23, i24, interpolator, this.f31687p, this.f31688q);
    }

    public final boolean b(View view) {
        int i11 = this.f31689r;
        boolean z11 = i11 == -1 || view.getTag(i11) != null;
        int i12 = this.f31690s;
        return z11 && (i12 == -1 || view.getTag(i12) == null);
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f31682j == -1 && this.f31683k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.f31682j) {
            return true;
        }
        return this.f31683k != null && (view.getLayoutParams() instanceof j4.e) && (str = ((j4.e) view.getLayoutParams()).Y) != null && str.matches(this.f31683k);
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), j4.t.G);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                this.f31673a = typedArrayObtainStyledAttributes.getResourceId(index, this.f31673a);
            } else if (index == 8) {
                if (MotionLayout.f1268h1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f31682j);
                    this.f31682j = resourceId;
                    if (resourceId == -1) {
                        this.f31683k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f31683k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f31682j = typedArrayObtainStyledAttributes.getResourceId(index, this.f31682j);
                }
            } else if (index == 9) {
                this.f31674b = typedArrayObtainStyledAttributes.getInt(index, this.f31674b);
            } else if (index == 12) {
                this.f31675c = typedArrayObtainStyledAttributes.getBoolean(index, this.f31675c);
            } else if (index == 10) {
                this.f31676d = typedArrayObtainStyledAttributes.getInt(index, this.f31676d);
            } else if (index == 4) {
                this.f31680h = typedArrayObtainStyledAttributes.getInt(index, this.f31680h);
            } else if (index == 13) {
                this.f31681i = typedArrayObtainStyledAttributes.getInt(index, this.f31681i);
            } else if (index == 14) {
                this.f31677e = typedArrayObtainStyledAttributes.getInt(index, this.f31677e);
            } else if (index == 7) {
                int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i12 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f31685n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f31684l = -2;
                    }
                } else if (i12 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f31684l = -1;
                    } else {
                        this.f31685n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f31684l = -2;
                    }
                } else {
                    this.f31684l = typedArrayObtainStyledAttributes.getInteger(index, this.f31684l);
                }
            } else if (index == 11) {
                this.f31687p = typedArrayObtainStyledAttributes.getResourceId(index, this.f31687p);
            } else if (index == 3) {
                this.f31688q = typedArrayObtainStyledAttributes.getResourceId(index, this.f31688q);
            } else if (index == 6) {
                this.f31689r = typedArrayObtainStyledAttributes.getResourceId(index, this.f31689r);
            } else if (index == 5) {
                this.f31690s = typedArrayObtainStyledAttributes.getResourceId(index, this.f31690s);
            } else if (index == 2) {
                this.f31692u = typedArrayObtainStyledAttributes.getResourceId(index, this.f31692u);
            } else if (index == 1) {
                this.f31691t = typedArrayObtainStyledAttributes.getInteger(index, this.f31691t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + fb.g0.s(this.f31686o, this.f31673a) + ")";
    }
}
