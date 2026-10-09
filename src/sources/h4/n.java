package h4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f31736w;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f31719e = 0.1f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31720f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31721g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f31722h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RectF f31723i = new RectF();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f31724j = new RectF();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashMap f31725k = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f31726l = null;
    public int m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f31727n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f31728o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31729p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f31730q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f31731r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f31732s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f31733t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f31734u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f31735v = Float.NaN;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f31737x = false;

    public n() {
        this.f31564d = new HashMap();
    }

    public static void j(RectF rectF, View view, boolean z11) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z11) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // h4.c
    public final void a(HashMap map) {
        throw null;
    }

    @Override // h4.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c clone() {
        n nVar = new n();
        super.c(this);
        nVar.f31726l = this.f31726l;
        nVar.m = this.m;
        nVar.f31727n = this.f31727n;
        nVar.f31728o = this.f31728o;
        nVar.f31729p = this.f31729p;
        nVar.f31730q = this.f31730q;
        nVar.f31731r = this.f31731r;
        nVar.f31719e = this.f31719e;
        nVar.f31732s = this.f31732s;
        nVar.f31733t = this.f31733t;
        nVar.f31734u = this.f31734u;
        nVar.f31735v = this.f31735v;
        nVar.f31736w = this.f31736w;
        nVar.f31737x = this.f31737x;
        nVar.f31723i = this.f31723i;
        nVar.f31724j = this.f31724j;
        nVar.f31725k = this.f31725k;
        return nVar;
    }

    @Override // h4.c
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j4.t.f36039o);
        SparseIntArray sparseIntArray = m.f31718a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            SparseIntArray sparseIntArray2 = m.f31718a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f31727n = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f31728o = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f31726l = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f31719e = typedArrayObtainStyledAttributes.getFloat(index, this.f31719e);
                    break;
                case 6:
                    this.f31729p = typedArrayObtainStyledAttributes.getResourceId(index, this.f31729p);
                    break;
                case 7:
                    if (MotionLayout.f1268h1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f31562b);
                        this.f31562b = resourceId;
                        if (resourceId == -1) {
                            this.f31563c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f31563c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f31562b = typedArrayObtainStyledAttributes.getResourceId(index, this.f31562b);
                    }
                    break;
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.f31561a);
                    this.f31561a = integer;
                    this.f31735v = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f31730q = typedArrayObtainStyledAttributes.getResourceId(index, this.f31730q);
                    break;
                case 10:
                    this.f31737x = typedArrayObtainStyledAttributes.getBoolean(index, this.f31737x);
                    break;
                case 11:
                    this.m = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                    break;
                case 12:
                    this.f31722h = typedArrayObtainStyledAttributes.getResourceId(index, this.f31722h);
                    break;
                case 13:
                    this.f31720f = typedArrayObtainStyledAttributes.getResourceId(index, this.f31720f);
                    break;
                case 14:
                    this.f31721g = typedArrayObtainStyledAttributes.getResourceId(index, this.f31721g);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d7  */
    public final void h(View view, float f5) {
        boolean z11;
        boolean z12;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z13;
        boolean z14;
        boolean z15 = true;
        boolean z16 = false;
        if (this.f31730q != -1) {
            if (this.f31731r == null) {
                this.f31731r = ((ViewGroup) view.getParent()).findViewById(this.f31730q);
            }
            j(this.f31723i, this.f31731r, this.f31737x);
            j(this.f31724j, view, this.f31737x);
            if (this.f31723i.intersect(this.f31724j)) {
                if (this.f31732s) {
                    this.f31732s = false;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f31734u) {
                    this.f31734u = false;
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f31733t = true;
            } else {
                if (this.f31732s) {
                    z11 = false;
                } else {
                    this.f31732s = true;
                    z11 = true;
                }
                if (this.f31733t) {
                    this.f31733t = false;
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f31734u = true;
                boolean z17 = z13;
                z14 = false;
                z16 = z17;
            }
            z15 = z14;
        } else {
            if (this.f31732s) {
                float f15 = this.f31735v;
                if ((this.f31736w - f15) * (f5 - f15) < CropImageView.DEFAULT_ASPECT_RATIO) {
                    this.f31732s = false;
                    z11 = true;
                }
                if (this.f31733t) {
                    f13 = this.f31735v;
                    f14 = f5 - f13;
                    if ((this.f31736w - f13) * f14 >= CropImageView.DEFAULT_ASPECT_RATIO && f14 < CropImageView.DEFAULT_ASPECT_RATIO) {
                        this.f31733t = false;
                        z12 = true;
                    }
                    if (this.f31734u) {
                        f11 = this.f31735v;
                        f12 = f5 - f11;
                        if ((this.f31736w - f11) * f12 >= CropImageView.DEFAULT_ASPECT_RATIO && f12 > CropImageView.DEFAULT_ASPECT_RATIO) {
                            this.f31734u = false;
                        }
                        z16 = z12;
                    } else if (Math.abs(f5 - this.f31735v) > this.f31719e) {
                        this.f31734u = true;
                    }
                    z15 = false;
                    z16 = z12;
                } else if (Math.abs(f5 - this.f31735v) > this.f31719e) {
                    this.f31733t = true;
                }
                z12 = false;
                if (this.f31734u) {
                    f11 = this.f31735v;
                    f12 = f5 - f11;
                    if ((this.f31736w - f11) * f12 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                    }
                    z16 = z12;
                } else if (Math.abs(f5 - this.f31735v) > this.f31719e) {
                    this.f31734u = true;
                }
                z15 = false;
                z16 = z12;
            } else if (Math.abs(f5 - this.f31735v) > this.f31719e) {
                this.f31732s = true;
            }
            z11 = false;
            if (this.f31733t) {
                f13 = this.f31735v;
                f14 = f5 - f13;
                if ((this.f31736w - f13) * f14 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                }
                if (this.f31734u) {
                    f11 = this.f31735v;
                    f12 = f5 - f11;
                    if ((this.f31736w - f11) * f12 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                    }
                    z16 = z12;
                } else if (Math.abs(f5 - this.f31735v) > this.f31719e) {
                    this.f31734u = true;
                }
                z15 = false;
                z16 = z12;
            } else if (Math.abs(f5 - this.f31735v) > this.f31719e) {
                this.f31733t = true;
            }
            z12 = false;
            if (this.f31734u) {
                f11 = this.f31735v;
                f12 = f5 - f11;
                if ((this.f31736w - f11) * f12 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                }
                z16 = z12;
            } else if (Math.abs(f5 - this.f31735v) > this.f31719e) {
                this.f31734u = true;
            }
            z15 = false;
            z16 = z12;
        }
        this.f31736w = f5;
        if (z16 || z11 || z15) {
            MotionLayout motionLayout = (MotionLayout) view.getParent();
            y yVar = motionLayout.f1288o0;
            CopyOnWriteArrayList copyOnWriteArrayList = motionLayout.G0;
            if (copyOnWriteArrayList != null) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((y) it.next()).getClass();
                }
            }
        }
        View viewFindViewById = this.m == -1 ? view : ((MotionLayout) view.getParent()).findViewById(this.m);
        if (z16) {
            String str = this.f31727n;
            if (str != null) {
                i(viewFindViewById, str);
            }
            if (this.f31720f != -1) {
                ((MotionLayout) view.getParent()).H(this.f31720f, viewFindViewById);
            }
        }
        if (z15) {
            String str2 = this.f31728o;
            if (str2 != null) {
                i(viewFindViewById, str2);
            }
            if (this.f31721g != -1) {
                ((MotionLayout) view.getParent()).H(this.f31721g, viewFindViewById);
            }
        }
        if (z11) {
            String str3 = this.f31726l;
            if (str3 != null) {
                i(viewFindViewById, str3);
            }
            if (this.f31722h != -1) {
                ((MotionLayout) view.getParent()).H(this.f31722h, viewFindViewById);
            }
        }
    }

    public final void i(View view, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.f31725k.containsKey(str)) {
                method = (Method) this.f31725k.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, null);
                    this.f31725k.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f31725k.put(str, null);
                    view.getClass();
                    fb.g0.t(view);
                    return;
                }
            }
            try {
                method.invoke(view, null);
                return;
            } catch (Exception unused2) {
                view.getClass();
                fb.g0.t(view);
                return;
            }
        }
        boolean z11 = str.length() == 1;
        if (!z11) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f31564d.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z11 || lowerCase.matches(str)) {
                j4.b bVar = (j4.b) this.f31564d.get(str2);
                if (bVar != null) {
                    Class<?> cls = view.getClass();
                    String strE = bVar.f35839b;
                    if (!bVar.f35838a) {
                        strE = ep.a.e("set", strE);
                    }
                    try {
                        int iOrdinal = bVar.f35840c.ordinal();
                        Class cls2 = Integer.TYPE;
                        Class cls3 = Float.TYPE;
                        switch (iOrdinal) {
                            case 0:
                            case 7:
                                cls.getMethod(strE, cls2).invoke(view, Integer.valueOf(bVar.f35841d));
                                break;
                            case 1:
                                cls.getMethod(strE, cls3).invoke(view, Float.valueOf(bVar.f35842e));
                                break;
                            case 2:
                                cls.getMethod(strE, cls2).invoke(view, Integer.valueOf(bVar.f35845h));
                                break;
                            case 3:
                                Method method2 = cls.getMethod(strE, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(bVar.f35845h);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 4:
                                cls.getMethod(strE, CharSequence.class).invoke(view, bVar.f35843f);
                                break;
                            case 5:
                                cls.getMethod(strE, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f35844g));
                                break;
                            case 6:
                                cls.getMethod(strE, cls3).invoke(view, Float.valueOf(bVar.f35842e));
                                break;
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
                    }
                }
            }
        }
    }

    @Override // h4.c
    public final void d(HashSet hashSet) {
    }
}
