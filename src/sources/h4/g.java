package h4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.yalantis.ucrop.view.CropImageView;
import dt.Xk.wuoM;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31641e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31642f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f31643g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f31644h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f31645i = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f31646j = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f31647k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f31648l = -1;
    public float m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f31649n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f31650o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f31651p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f31652q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f31653r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f31654s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f31655t = Float.NaN;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f31656u = Float.NaN;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f31657v = Float.NaN;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f31658w = Float.NaN;

    public g() {
        this.f31564d = new HashMap();
    }

    @Override // h4.c
    public final void a(HashMap map) {
        throw null;
    }

    @Override // h4.c
    /* JADX INFO: renamed from: b */
    public final c clone() {
        g gVar = new g();
        super.c(this);
        gVar.f31641e = this.f31641e;
        gVar.f31642f = this.f31642f;
        gVar.f31643g = this.f31643g;
        gVar.f31644h = this.f31644h;
        gVar.f31645i = this.f31645i;
        gVar.f31646j = this.f31646j;
        gVar.f31647k = this.f31647k;
        gVar.f31648l = this.f31648l;
        gVar.m = this.m;
        gVar.f31649n = this.f31649n;
        gVar.f31650o = this.f31650o;
        gVar.f31651p = this.f31651p;
        gVar.f31652q = this.f31652q;
        gVar.f31653r = this.f31653r;
        gVar.f31654s = this.f31654s;
        gVar.f31655t = this.f31655t;
        gVar.f31656u = this.f31656u;
        gVar.f31657v = this.f31657v;
        gVar.f31658w = this.f31658w;
        return gVar;
    }

    @Override // h4.c
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j4.t.f36037l);
        SparseIntArray sparseIntArray = f.f31615a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            SparseIntArray sparseIntArray2 = f.f31615a;
            switch (sparseIntArray2.get(index)) {
                case 1:
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
                case 2:
                    this.f31561a = typedArrayObtainStyledAttributes.getInt(index, this.f31561a);
                    break;
                case 3:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f31641e = typedArrayObtainStyledAttributes.getInteger(index, this.f31641e);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f31643g = typedArrayObtainStyledAttributes.getString(index);
                        this.f31642f = 7;
                    } else {
                        this.f31642f = typedArrayObtainStyledAttributes.getInt(index, this.f31642f);
                    }
                    break;
                case 6:
                    this.f31644h = typedArrayObtainStyledAttributes.getFloat(index, this.f31644h);
                    break;
                case 7:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f31645i = typedArrayObtainStyledAttributes.getDimension(index, this.f31645i);
                    } else {
                        this.f31645i = typedArrayObtainStyledAttributes.getFloat(index, this.f31645i);
                    }
                    break;
                case 8:
                    this.f31648l = typedArrayObtainStyledAttributes.getInt(index, this.f31648l);
                    break;
                case 9:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 10:
                    this.f31649n = typedArrayObtainStyledAttributes.getDimension(index, this.f31649n);
                    break;
                case 11:
                    this.f31650o = typedArrayObtainStyledAttributes.getFloat(index, this.f31650o);
                    break;
                case 12:
                    this.f31652q = typedArrayObtainStyledAttributes.getFloat(index, this.f31652q);
                    break;
                case 13:
                    this.f31653r = typedArrayObtainStyledAttributes.getFloat(index, this.f31653r);
                    break;
                case 14:
                    this.f31651p = typedArrayObtainStyledAttributes.getFloat(index, this.f31651p);
                    break;
                case 15:
                    this.f31654s = typedArrayObtainStyledAttributes.getFloat(index, this.f31654s);
                    break;
                case 16:
                    this.f31655t = typedArrayObtainStyledAttributes.getFloat(index, this.f31655t);
                    break;
                case 17:
                    this.f31656u = typedArrayObtainStyledAttributes.getDimension(index, this.f31656u);
                    break;
                case 18:
                    this.f31657v = typedArrayObtainStyledAttributes.getDimension(index, this.f31657v);
                    break;
                case 19:
                    this.f31658w = typedArrayObtainStyledAttributes.getDimension(index, this.f31658w);
                    break;
                case 20:
                    this.f31647k = typedArrayObtainStyledAttributes.getFloat(index, this.f31647k);
                    break;
                case 21:
                    this.f31646j = typedArrayObtainStyledAttributes.getFloat(index, this.f31646j) / 360.0f;
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
            }
        }
    }

    @Override // h4.c
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f31649n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f31650o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f31652q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f31653r)) {
            hashSet.add(OYAvlbfUyD.qCdMsCWc);
        }
        if (!Float.isNaN(this.f31654s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f31655t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f31651p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f31656u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f31657v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f31658w)) {
            hashSet.add("translationZ");
        }
        if (this.f31564d.size() > 0) {
            Iterator it = this.f31564d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    public final void h(HashMap map) {
        g4.g gVar;
        float f5;
        g4.g gVar2;
        for (String str : map.keySet()) {
            byte b3 = 7;
            if (str.startsWith("CUSTOM")) {
                j4.b bVar = (j4.b) this.f31564d.get(str.substring(7));
                if (bVar != null && bVar.f35840c == j4.a.FLOAT_TYPE && (gVar = (g4.g) map.get(str)) != null) {
                    int i11 = this.f31561a;
                    int i12 = this.f31642f;
                    String str2 = this.f31643g;
                    int i13 = this.f31648l;
                    gVar.f28751f.add(new c4.g(this.f31644h, this.f31645i, this.f31646j, bVar.a(), i11));
                    if (i13 != -1) {
                        gVar.f28750e = i13;
                    }
                    gVar.f28748c = i12;
                    gVar.d(bVar);
                    gVar.f28749d = str2;
                }
            } else {
                switch (str.hashCode()) {
                    case -1249320806:
                        b3 = !str.equals("rotationX") ? (byte) -1 : (byte) 0;
                        break;
                    case -1249320805:
                        b3 = !str.equals("rotationY") ? (byte) -1 : (byte) 1;
                        break;
                    case -1225497657:
                        b3 = !str.equals("translationX") ? (byte) -1 : (byte) 2;
                        break;
                    case -1225497656:
                        b3 = !str.equals(wuoM.rfSs) ? (byte) -1 : (byte) 3;
                        break;
                    case -1225497655:
                        b3 = !str.equals("translationZ") ? (byte) -1 : (byte) 4;
                        break;
                    case -1001078227:
                        b3 = !str.equals("progress") ? (byte) -1 : (byte) 5;
                        break;
                    case -908189618:
                        b3 = !str.equals("scaleX") ? (byte) -1 : (byte) 6;
                        break;
                    case -908189617:
                        if (!str.equals("scaleY")) {
                            b3 = -1;
                        }
                        break;
                    case -40300674:
                        b3 = !str.equals("rotation") ? (byte) -1 : (byte) 8;
                        break;
                    case -4379043:
                        b3 = !str.equals("elevation") ? (byte) -1 : (byte) 9;
                        break;
                    case 37232917:
                        b3 = !str.equals("transitionPathRotate") ? (byte) -1 : (byte) 10;
                        break;
                    case 92909918:
                        b3 = !str.equals("alpha") ? (byte) -1 : (byte) 11;
                        break;
                    case 156108012:
                        b3 = !str.equals("waveOffset") ? (byte) -1 : (byte) 12;
                        break;
                    case 1530034690:
                        b3 = !str.equals("wavePhase") ? (byte) -1 : (byte) 13;
                        break;
                    default:
                        b3 = -1;
                        break;
                }
                switch (b3) {
                    case 0:
                        f5 = this.f31652q;
                        break;
                    case 1:
                        f5 = this.f31653r;
                        break;
                    case 2:
                        f5 = this.f31656u;
                        break;
                    case 3:
                        f5 = this.f31657v;
                        break;
                    case 4:
                        f5 = this.f31658w;
                        break;
                    case 5:
                        f5 = this.f31647k;
                        break;
                    case 6:
                        f5 = this.f31654s;
                        break;
                    case 7:
                        f5 = this.f31655t;
                        break;
                    case 8:
                        f5 = this.f31650o;
                        break;
                    case 9:
                        f5 = this.f31649n;
                        break;
                    case 10:
                        f5 = this.f31651p;
                        break;
                    case 11:
                        f5 = this.m;
                        break;
                    case 12:
                        f5 = this.f31645i;
                        break;
                    case 13:
                        f5 = this.f31646j;
                        break;
                    default:
                        str.startsWith("CUSTOM");
                        f5 = Float.NaN;
                        break;
                }
                float f11 = f5;
                if (!Float.isNaN(f11) && (gVar2 = (g4.g) map.get(str)) != null) {
                    int i14 = this.f31561a;
                    int i15 = this.f31642f;
                    String str3 = this.f31643g;
                    int i16 = this.f31648l;
                    gVar2.f28751f.add(new c4.g(this.f31644h, this.f31645i, this.f31646j, f11, i14));
                    if (i16 != -1) {
                        gVar2.f28750e = i16;
                    }
                    gVar2.f28748c = i15;
                    gVar2.f28749d = str3;
                }
            }
        }
    }
}
