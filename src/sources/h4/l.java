package h4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.yalantis.ucrop.view.CropImageView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31703e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f31704f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f31705g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f31706h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f31707i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f31708j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f31709k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f31710l = Float.NaN;
    public float m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f31711n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f31712o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f31713p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f31714q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f31715r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f31716s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f31717t = CropImageView.DEFAULT_ASPECT_RATIO;

    public l() {
        this.f31564d = new HashMap();
    }

    @Override // h4.c
    public final void a(HashMap map) {
        throw null;
    }

    @Override // h4.c
    /* JADX INFO: renamed from: b */
    public final c clone() {
        l lVar = new l();
        super.c(this);
        lVar.f31703e = this.f31703e;
        lVar.f31715r = this.f31715r;
        lVar.f31716s = this.f31716s;
        lVar.f31717t = this.f31717t;
        lVar.f31714q = this.f31714q;
        lVar.f31704f = this.f31704f;
        lVar.f31705g = this.f31705g;
        lVar.f31706h = this.f31706h;
        lVar.f31709k = this.f31709k;
        lVar.f31707i = this.f31707i;
        lVar.f31708j = this.f31708j;
        lVar.f31710l = this.f31710l;
        lVar.m = this.m;
        lVar.f31711n = this.f31711n;
        lVar.f31712o = this.f31712o;
        lVar.f31713p = this.f31713p;
        return lVar;
    }

    @Override // h4.c
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.f31704f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f31705g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f31706h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f31707i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f31708j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f31711n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f31712o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f31713p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f31709k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f31710l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f31714q)) {
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j4.t.f36038n);
        SparseIntArray sparseIntArray = k.f31702a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            SparseIntArray sparseIntArray2 = k.f31702a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f31704f = typedArrayObtainStyledAttributes.getFloat(index, this.f31704f);
                    break;
                case 2:
                    this.f31705g = typedArrayObtainStyledAttributes.getDimension(index, this.f31705g);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f31706h = typedArrayObtainStyledAttributes.getFloat(index, this.f31706h);
                    break;
                case 5:
                    this.f31707i = typedArrayObtainStyledAttributes.getFloat(index, this.f31707i);
                    break;
                case 6:
                    this.f31708j = typedArrayObtainStyledAttributes.getFloat(index, this.f31708j);
                    break;
                case 7:
                    this.f31710l = typedArrayObtainStyledAttributes.getFloat(index, this.f31710l);
                    break;
                case 8:
                    this.f31709k = typedArrayObtainStyledAttributes.getFloat(index, this.f31709k);
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
                    this.f31703e = typedArrayObtainStyledAttributes.getInteger(index, this.f31703e);
                    break;
                case 14:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 15:
                    this.f31711n = typedArrayObtainStyledAttributes.getDimension(index, this.f31711n);
                    break;
                case 16:
                    this.f31712o = typedArrayObtainStyledAttributes.getDimension(index, this.f31712o);
                    break;
                case 17:
                    this.f31713p = typedArrayObtainStyledAttributes.getDimension(index, this.f31713p);
                    break;
                case 18:
                    this.f31714q = typedArrayObtainStyledAttributes.getFloat(index, this.f31714q);
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        this.f31715r = 7;
                    } else {
                        this.f31715r = typedArrayObtainStyledAttributes.getInt(index, this.f31715r);
                    }
                    break;
                case 20:
                    this.f31716s = typedArrayObtainStyledAttributes.getFloat(index, this.f31716s);
                    break;
                case 21:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f31717t = typedArrayObtainStyledAttributes.getDimension(index, this.f31717t);
                    } else {
                        this.f31717t = typedArrayObtainStyledAttributes.getFloat(index, this.f31717t);
                    }
                    break;
            }
        }
    }

    @Override // h4.c
    public final void f(HashMap map) {
        if (this.f31703e == -1) {
            return;
        }
        if (!Float.isNaN(this.f31704f)) {
            map.put("alpha", Integer.valueOf(this.f31703e));
        }
        if (!Float.isNaN(this.f31705g)) {
            map.put("elevation", Integer.valueOf(this.f31703e));
        }
        if (!Float.isNaN(this.f31706h)) {
            map.put("rotation", Integer.valueOf(this.f31703e));
        }
        if (!Float.isNaN(this.f31707i)) {
            map.put("rotationX", Integer.valueOf(this.f31703e));
        }
        if (!Float.isNaN(this.f31708j)) {
            map.put("rotationY", Integer.valueOf(this.f31703e));
        }
        if (!Float.isNaN(this.f31711n)) {
            map.put("translationX", Integer.valueOf(this.f31703e));
        }
        if (!Float.isNaN(this.f31712o)) {
            map.put("translationY", Integer.valueOf(this.f31703e));
        }
        if (!Float.isNaN(this.f31713p)) {
            map.put("translationZ", Integer.valueOf(this.f31703e));
        }
        if (!Float.isNaN(this.f31709k)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f31703e));
        }
        if (!Float.isNaN(this.f31710l)) {
            map.put("scaleX", Integer.valueOf(this.f31703e));
        }
        if (!Float.isNaN(this.f31710l)) {
            map.put("scaleY", Integer.valueOf(this.f31703e));
        }
        if (!Float.isNaN(this.f31714q)) {
            map.put("progress", Integer.valueOf(this.f31703e));
        }
        if (this.f31564d.size() > 0) {
            Iterator it = this.f31564d.keySet().iterator();
            while (it.hasNext()) {
                map.put(ep.a.e("CUSTOM,", (String) it.next()), Integer.valueOf(this.f31703e));
            }
        }
    }

    public final void h(HashMap map) {
        for (String str : map.keySet()) {
            g4.q qVar = (g4.q) map.get(str);
            if (qVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f31707i)) {
                                break;
                            } else {
                                qVar.c(this.f31707i, this.f31716s, this.f31717t, this.f31561a, this.f31715r);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f31708j)) {
                                break;
                            } else {
                                qVar.c(this.f31708j, this.f31716s, this.f31717t, this.f31561a, this.f31715r);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f31711n)) {
                                break;
                            } else {
                                qVar.c(this.f31711n, this.f31716s, this.f31717t, this.f31561a, this.f31715r);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f31712o)) {
                                break;
                            } else {
                                qVar.c(this.f31712o, this.f31716s, this.f31717t, this.f31561a, this.f31715r);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f31713p)) {
                                break;
                            } else {
                                qVar.c(this.f31713p, this.f31716s, this.f31717t, this.f31561a, this.f31715r);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f31714q)) {
                                break;
                            } else {
                                qVar.c(this.f31714q, this.f31716s, this.f31717t, this.f31561a, this.f31715r);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f31710l)) {
                                break;
                            } else {
                                qVar.c(this.f31710l, this.f31716s, this.f31717t, this.f31561a, this.f31715r);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.m)) {
                                break;
                            } else {
                                qVar.c(this.m, this.f31716s, this.f31717t, this.f31561a, this.f31715r);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f31706h)) {
                                break;
                            } else {
                                qVar.c(this.f31706h, this.f31716s, this.f31717t, this.f31561a, this.f31715r);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f31705g)) {
                                break;
                            } else {
                                qVar.c(this.f31705g, this.f31716s, this.f31717t, this.f31561a, this.f31715r);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f31709k)) {
                                break;
                            } else {
                                qVar.c(this.f31709k, this.f31716s, this.f31717t, this.f31561a, this.f31715r);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f31704f)) {
                                break;
                            } else {
                                qVar.c(this.f31704f, this.f31716s, this.f31717t, this.f31561a, this.f31715r);
                                break;
                            }
                            break;
                    }
                } else {
                    j4.b bVar = (j4.b) this.f31564d.get(str.substring(7));
                    if (bVar != null) {
                        g4.n nVar = (g4.n) qVar;
                        int i11 = this.f31561a;
                        float f5 = this.f31716s;
                        int i12 = this.f31715r;
                        float f11 = this.f31717t;
                        nVar.f28763l.append(i11, bVar);
                        nVar.m.append(i11, new float[]{f5, f11});
                        nVar.f28767b = Math.max(nVar.f28767b, i12);
                    }
                }
            }
        }
    }
}
