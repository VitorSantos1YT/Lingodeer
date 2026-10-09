package h4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f31572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f31573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f31574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f31575k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f0 f31576l;
    public final ArrayList m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f31577n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f31578o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31579p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f31580q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f31581r;

    public c0(d0 d0Var, c0 c0Var) {
        this.f31565a = -1;
        this.f31566b = false;
        this.f31567c = -1;
        this.f31568d = -1;
        this.f31569e = 0;
        this.f31570f = null;
        this.f31571g = -1;
        this.f31572h = 400;
        this.f31573i = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f31575k = new ArrayList();
        this.f31576l = null;
        this.m = new ArrayList();
        this.f31577n = 0;
        this.f31578o = false;
        this.f31579p = -1;
        this.f31580q = 0;
        this.f31581r = 0;
        this.f31574j = d0Var;
        this.f31572h = d0Var.f31592j;
        if (c0Var != null) {
            this.f31579p = c0Var.f31579p;
            this.f31569e = c0Var.f31569e;
            this.f31570f = c0Var.f31570f;
            this.f31571g = c0Var.f31571g;
            this.f31572h = c0Var.f31572h;
            this.f31575k = c0Var.f31575k;
            this.f31573i = c0Var.f31573i;
            this.f31580q = c0Var.f31580q;
        }
    }

    public c0(d0 d0Var, int i11) {
        this.f31565a = -1;
        this.f31566b = false;
        this.f31567c = -1;
        this.f31568d = -1;
        this.f31569e = 0;
        this.f31570f = null;
        this.f31571g = -1;
        this.f31572h = 400;
        this.f31573i = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f31575k = new ArrayList();
        this.f31576l = null;
        this.m = new ArrayList();
        this.f31577n = 0;
        this.f31578o = false;
        this.f31579p = -1;
        this.f31580q = 0;
        this.f31581r = 0;
        this.f31565a = -1;
        this.f31574j = d0Var;
        this.f31568d = R.id.view_transition;
        this.f31567c = i11;
        this.f31572h = d0Var.f31592j;
        this.f31580q = d0Var.f31593k;
    }

    public c0(d0 d0Var, Context context, XmlResourceParser xmlResourceParser) {
        this.f31565a = -1;
        this.f31566b = false;
        this.f31567c = -1;
        this.f31568d = -1;
        this.f31569e = 0;
        this.f31570f = null;
        this.f31571g = -1;
        this.f31572h = 400;
        this.f31573i = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f31575k = new ArrayList();
        this.f31576l = null;
        this.m = new ArrayList();
        this.f31577n = 0;
        this.f31578o = false;
        this.f31579p = -1;
        this.f31581r = 0;
        int i11 = d0Var.f31592j;
        SparseArray sparseArray = d0Var.f31589g;
        this.f31572h = i11;
        this.f31580q = d0Var.f31593k;
        this.f31574j = d0Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), j4.t.E);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i12);
            if (index == 2) {
                this.f31567c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f31567c);
                if ("layout".equals(resourceTypeName)) {
                    j4.p pVar = new j4.p();
                    pVar.j(context, this.f31567c);
                    sparseArray.append(this.f31567c, pVar);
                } else if ("xml".equals(resourceTypeName)) {
                    this.f31567c = d0Var.j(context, this.f31567c);
                }
            } else if (index == 3) {
                this.f31568d = typedArrayObtainStyledAttributes.getResourceId(index, this.f31568d);
                String resourceTypeName2 = context.getResources().getResourceTypeName(this.f31568d);
                if ("layout".equals(resourceTypeName2)) {
                    j4.p pVar2 = new j4.p();
                    pVar2.j(context, this.f31568d);
                    sparseArray.append(this.f31568d, pVar2);
                } else if ("xml".equals(resourceTypeName2)) {
                    this.f31568d = d0Var.j(context, this.f31568d);
                }
            } else if (index == 6) {
                int i13 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i13 == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f31571g = resourceId;
                    if (resourceId != -1) {
                        this.f31569e = -2;
                    }
                } else if (i13 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f31570f = string;
                    if (string != null) {
                        if (string.indexOf("/") > 0) {
                            this.f31571g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f31569e = -2;
                        } else {
                            this.f31569e = -1;
                        }
                    }
                } else {
                    this.f31569e = typedArrayObtainStyledAttributes.getInteger(index, this.f31569e);
                }
            } else if (index == 4) {
                int i14 = typedArrayObtainStyledAttributes.getInt(index, this.f31572h);
                this.f31572h = i14;
                if (i14 < 8) {
                    this.f31572h = 8;
                }
            } else if (index == 8) {
                this.f31573i = typedArrayObtainStyledAttributes.getFloat(index, this.f31573i);
            } else if (index == 1) {
                this.f31577n = typedArrayObtainStyledAttributes.getInteger(index, this.f31577n);
            } else if (index == 0) {
                this.f31565a = typedArrayObtainStyledAttributes.getResourceId(index, this.f31565a);
            } else if (index == 9) {
                this.f31578o = typedArrayObtainStyledAttributes.getBoolean(index, this.f31578o);
            } else if (index == 7) {
                this.f31579p = typedArrayObtainStyledAttributes.getInteger(index, -1);
            } else if (index == 5) {
                this.f31580q = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 10) {
                this.f31581r = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.f31568d == -1) {
            this.f31566b = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
