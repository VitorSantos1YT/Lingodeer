package h4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31601e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f31602f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f31603g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f31604h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f31605i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f31606j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f31607k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f31608l = Float.NaN;
    public float m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f31609n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f31610o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f31611p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f31612q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f31613r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f31614s = Float.NaN;

    public e() {
        this.f31564d = new HashMap();
    }

    @Override // h4.c
    /* JADX INFO: renamed from: b */
    public final c clone() {
        e eVar = new e();
        super.c(this);
        eVar.f31601e = this.f31601e;
        eVar.f31602f = this.f31602f;
        eVar.f31603g = this.f31603g;
        eVar.f31604h = this.f31604h;
        eVar.f31605i = this.f31605i;
        eVar.f31606j = this.f31606j;
        eVar.f31607k = this.f31607k;
        eVar.f31608l = this.f31608l;
        eVar.m = this.m;
        eVar.f31609n = this.f31609n;
        eVar.f31610o = this.f31610o;
        eVar.f31611p = this.f31611p;
        eVar.f31612q = this.f31612q;
        eVar.f31613r = this.f31613r;
        eVar.f31614s = this.f31614s;
        return eVar;
    }

    @Override // h4.c
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.f31602f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f31603g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f31604h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f31605i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f31606j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f31607k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f31608l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f31611p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f31612q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f31613r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f31609n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f31610o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f31614s)) {
            hashSet.add("progress");
        }
        if (this.f31564d.size() > 0) {
            Iterator it = this.f31564d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // h4.c
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j4.t.f36036k);
        SparseIntArray sparseIntArray = d.f31582a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            SparseIntArray sparseIntArray2 = d.f31582a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f31602f = typedArrayObtainStyledAttributes.getFloat(index, this.f31602f);
                    break;
                case 2:
                    this.f31603g = typedArrayObtainStyledAttributes.getDimension(index, this.f31603g);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f31604h = typedArrayObtainStyledAttributes.getFloat(index, this.f31604h);
                    break;
                case 5:
                    this.f31605i = typedArrayObtainStyledAttributes.getFloat(index, this.f31605i);
                    break;
                case 6:
                    this.f31606j = typedArrayObtainStyledAttributes.getFloat(index, this.f31606j);
                    break;
                case 7:
                    this.f31609n = typedArrayObtainStyledAttributes.getFloat(index, this.f31609n);
                    break;
                case 8:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f31561a = typedArrayObtainStyledAttributes.getInt(index, this.f31561a);
                    break;
                case 13:
                    this.f31601e = typedArrayObtainStyledAttributes.getInteger(index, this.f31601e);
                    break;
                case 14:
                    this.f31610o = typedArrayObtainStyledAttributes.getFloat(index, this.f31610o);
                    break;
                case 15:
                    this.f31611p = typedArrayObtainStyledAttributes.getDimension(index, this.f31611p);
                    break;
                case 16:
                    this.f31612q = typedArrayObtainStyledAttributes.getDimension(index, this.f31612q);
                    break;
                case 17:
                    this.f31613r = typedArrayObtainStyledAttributes.getDimension(index, this.f31613r);
                    break;
                case 18:
                    this.f31614s = typedArrayObtainStyledAttributes.getFloat(index, this.f31614s);
                    break;
                case 19:
                    this.f31607k = typedArrayObtainStyledAttributes.getDimension(index, this.f31607k);
                    break;
                case 20:
                    this.f31608l = typedArrayObtainStyledAttributes.getDimension(index, this.f31608l);
                    break;
            }
        }
    }

    @Override // h4.c
    public final void f(HashMap map) {
        if (this.f31601e == -1) {
            return;
        }
        if (!Float.isNaN(this.f31602f)) {
            map.put("alpha", Integer.valueOf(this.f31601e));
        }
        if (!Float.isNaN(this.f31603g)) {
            map.put("elevation", Integer.valueOf(this.f31601e));
        }
        if (!Float.isNaN(this.f31604h)) {
            map.put("rotation", Integer.valueOf(this.f31601e));
        }
        if (!Float.isNaN(this.f31605i)) {
            map.put("rotationX", Integer.valueOf(this.f31601e));
        }
        if (!Float.isNaN(this.f31606j)) {
            map.put("rotationY", Integer.valueOf(this.f31601e));
        }
        if (!Float.isNaN(this.f31607k)) {
            map.put("transformPivotX", Integer.valueOf(this.f31601e));
        }
        if (!Float.isNaN(this.f31608l)) {
            map.put("transformPivotY", Integer.valueOf(this.f31601e));
        }
        if (!Float.isNaN(this.f31611p)) {
            map.put("translationX", Integer.valueOf(this.f31601e));
        }
        if (!Float.isNaN(this.f31612q)) {
            map.put("translationY", Integer.valueOf(this.f31601e));
        }
        if (!Float.isNaN(this.f31613r)) {
            map.put("translationZ", Integer.valueOf(this.f31601e));
        }
        if (!Float.isNaN(this.m)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f31601e));
        }
        if (!Float.isNaN(this.f31609n)) {
            map.put("scaleX", Integer.valueOf(this.f31601e));
        }
        if (!Float.isNaN(this.f31610o)) {
            map.put("scaleY", Integer.valueOf(this.f31601e));
        }
        if (!Float.isNaN(this.f31614s)) {
            map.put("progress", Integer.valueOf(this.f31601e));
        }
        if (this.f31564d.size() > 0) {
            Iterator it = this.f31564d.keySet().iterator();
            while (it.hasNext()) {
                map.put(ep.a.e("CUSTOM,", (String) it.next()), Integer.valueOf(this.f31601e));
            }
        }
    }

    @Override // h4.c
    public final void a(HashMap map) {
        for (String str : map.keySet()) {
            g4.l lVar = (g4.l) map.get(str);
            if (lVar != null) {
                byte b3 = 7;
                if (str.startsWith("CUSTOM")) {
                    j4.b bVar = (j4.b) this.f31564d.get(str.substring(7));
                    if (bVar != null) {
                        ((g4.i) lVar).f28753f.append(this.f31561a, bVar);
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
                            b3 = !str.equals(xTCJ.Tio) ? (byte) -1 : (byte) 3;
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
                        case -760884510:
                            b3 = !str.equals("transformPivotX") ? (byte) -1 : (byte) 8;
                            break;
                        case -760884509:
                            b3 = !str.equals("transformPivotY") ? (byte) -1 : (byte) 9;
                            break;
                        case -40300674:
                            b3 = !str.equals("rotation") ? (byte) -1 : (byte) 10;
                            break;
                        case -4379043:
                            b3 = !str.equals("elevation") ? (byte) -1 : (byte) 11;
                            break;
                        case 37232917:
                            b3 = !str.equals("transitionPathRotate") ? (byte) -1 : (byte) 12;
                            break;
                        case 92909918:
                            b3 = !str.equals("alpha") ? (byte) -1 : (byte) 13;
                            break;
                        default:
                            b3 = -1;
                            break;
                    }
                    switch (b3) {
                        case 0:
                            if (!Float.isNaN(this.f31605i)) {
                                lVar.b(this.f31561a, this.f31605i);
                            }
                            break;
                        case 1:
                            if (!Float.isNaN(this.f31606j)) {
                                lVar.b(this.f31561a, this.f31606j);
                            }
                            break;
                        case 2:
                            if (!Float.isNaN(this.f31611p)) {
                                lVar.b(this.f31561a, this.f31611p);
                            }
                            break;
                        case 3:
                            if (!Float.isNaN(this.f31612q)) {
                                lVar.b(this.f31561a, this.f31612q);
                            }
                            break;
                        case 4:
                            if (!Float.isNaN(this.f31613r)) {
                                lVar.b(this.f31561a, this.f31613r);
                            }
                            break;
                        case 5:
                            if (!Float.isNaN(this.f31614s)) {
                                lVar.b(this.f31561a, this.f31614s);
                            }
                            break;
                        case 6:
                            if (!Float.isNaN(this.f31609n)) {
                                lVar.b(this.f31561a, this.f31609n);
                            }
                            break;
                        case 7:
                            if (!Float.isNaN(this.f31610o)) {
                                lVar.b(this.f31561a, this.f31610o);
                            }
                            break;
                        case 8:
                            if (!Float.isNaN(this.f31605i)) {
                                lVar.b(this.f31561a, this.f31607k);
                            }
                            break;
                        case 9:
                            if (!Float.isNaN(this.f31606j)) {
                                lVar.b(this.f31561a, this.f31608l);
                            }
                            break;
                        case 10:
                            if (!Float.isNaN(this.f31604h)) {
                                lVar.b(this.f31561a, this.f31604h);
                            }
                            break;
                        case 11:
                            if (!Float.isNaN(this.f31603g)) {
                                lVar.b(this.f31561a, this.f31603g);
                            }
                            break;
                        case 12:
                            if (!Float.isNaN(this.m)) {
                                lVar.b(this.f31561a, this.m);
                            }
                            break;
                        case 13:
                            if (!Float.isNaN(this.f31602f)) {
                                lVar.b(this.f31561a, this.f31602f);
                            }
                            break;
                    }
                }
            }
        }
    }

    public final void h(Object obj, String str) {
        int iIntValue;
        byte b3 = -1;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    b3 = 0;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    b3 = 1;
                }
                break;
            case -1249320806:
                if (str.equals(bjXGJ.wls)) {
                    b3 = 2;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b3 = 3;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b3 = 4;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b3 = 5;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b3 = 6;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b3 = 7;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b3 = 8;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    b3 = 9;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    b3 = 10;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    b3 = 11;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b3 = 12;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b3 = 13;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b3 = 14;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    b3 = 15;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b3 = 16;
                }
                break;
        }
        switch (b3) {
            case 0:
                this.f31614s = c.g((Number) obj);
                break;
            case 1:
                obj.toString();
                break;
            case 2:
                this.f31605i = c.g((Number) obj);
                break;
            case 3:
                this.f31606j = c.g((Number) obj);
                break;
            case 4:
                this.f31611p = c.g((Number) obj);
                break;
            case 5:
                this.f31612q = c.g((Number) obj);
                break;
            case 6:
                this.f31613r = c.g((Number) obj);
                break;
            case 7:
                this.f31609n = c.g((Number) obj);
                break;
            case 8:
                this.f31610o = c.g((Number) obj);
                break;
            case 9:
                this.f31607k = c.g((Number) obj);
                break;
            case 10:
                this.f31608l = c.g((Number) obj);
                break;
            case 11:
                this.f31604h = c.g((Number) obj);
                break;
            case 12:
                this.f31603g = c.g((Number) obj);
                break;
            case 13:
                this.m = c.g((Number) obj);
                break;
            case 14:
                this.f31602f = c.g((Number) obj);
                break;
            case 15:
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    iIntValue = ((Integer) number).intValue();
                } else {
                    iIntValue = Integer.parseInt(number.toString());
                }
                this.f31601e = iIntValue;
                break;
            case 16:
                if (!(obj instanceof Boolean)) {
                    Boolean.parseBoolean(obj.toString());
                    break;
                }
                break;
        }
    }
}
