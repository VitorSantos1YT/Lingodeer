package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f35993o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f35995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f35996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f35997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f35998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f35999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f36000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f36001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f36002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f36003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f36004k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f36005l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f36006n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f35993o = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(o oVar) {
        this.f35994a = oVar.f35994a;
        this.f35995b = oVar.f35995b;
        this.f35996c = oVar.f35996c;
        this.f35997d = oVar.f35997d;
        this.f35998e = oVar.f35998e;
        this.f35999f = oVar.f35999f;
        this.f36000g = oVar.f36000g;
        this.f36001h = oVar.f36001h;
        this.f36002i = oVar.f36002i;
        this.f36003j = oVar.f36003j;
        this.f36004k = oVar.f36004k;
        this.f36005l = oVar.f36005l;
        this.m = oVar.m;
        this.f36006n = oVar.f36006n;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.D);
        this.f35994a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            switch (f35993o.get(index)) {
                case 1:
                    this.f35995b = typedArrayObtainStyledAttributes.getFloat(index, this.f35995b);
                    break;
                case 2:
                    this.f35996c = typedArrayObtainStyledAttributes.getFloat(index, this.f35996c);
                    break;
                case 3:
                    this.f35997d = typedArrayObtainStyledAttributes.getFloat(index, this.f35997d);
                    break;
                case 4:
                    this.f35998e = typedArrayObtainStyledAttributes.getFloat(index, this.f35998e);
                    break;
                case 5:
                    this.f35999f = typedArrayObtainStyledAttributes.getFloat(index, this.f35999f);
                    break;
                case 6:
                    this.f36000g = typedArrayObtainStyledAttributes.getDimension(index, this.f36000g);
                    break;
                case 7:
                    this.f36001h = typedArrayObtainStyledAttributes.getDimension(index, this.f36001h);
                    break;
                case 8:
                    this.f36003j = typedArrayObtainStyledAttributes.getDimension(index, this.f36003j);
                    break;
                case 9:
                    this.f36004k = typedArrayObtainStyledAttributes.getDimension(index, this.f36004k);
                    break;
                case 10:
                    this.f36005l = typedArrayObtainStyledAttributes.getDimension(index, this.f36005l);
                    break;
                case 11:
                    this.m = true;
                    this.f36006n = typedArrayObtainStyledAttributes.getDimension(index, this.f36006n);
                    break;
                case 12:
                    this.f36002i = p.l(typedArrayObtainStyledAttributes, index, this.f36002i);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
