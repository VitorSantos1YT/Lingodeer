package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f35975n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f35982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f35983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f35984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f35986k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f35987l;
    public int m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f35975n = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(m mVar) {
        this.f35976a = mVar.f35976a;
        this.f35977b = mVar.f35977b;
        this.f35979d = mVar.f35979d;
        this.f35980e = mVar.f35980e;
        this.f35981f = mVar.f35981f;
        this.f35983h = mVar.f35983h;
        this.f35982g = mVar.f35982g;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f36042r);
        this.f35976a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            switch (f35975n.get(index)) {
                case 1:
                    this.f35983h = typedArrayObtainStyledAttributes.getFloat(index, this.f35983h);
                    break;
                case 2:
                    this.f35980e = typedArrayObtainStyledAttributes.getInt(index, this.f35980e);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f35979d = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f35979d = c4.e.f6546d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f35981f = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f35977b = p.l(typedArrayObtainStyledAttributes, index, this.f35977b);
                    break;
                case 6:
                    this.f35978c = typedArrayObtainStyledAttributes.getInteger(index, this.f35978c);
                    break;
                case 7:
                    this.f35982g = typedArrayObtainStyledAttributes.getFloat(index, this.f35982g);
                    break;
                case 8:
                    this.f35985j = typedArrayObtainStyledAttributes.getInteger(index, this.f35985j);
                    break;
                case 9:
                    this.f35984i = typedArrayObtainStyledAttributes.getFloat(index, this.f35984i);
                    break;
                case 10:
                    int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i12 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.m = resourceId;
                        if (resourceId != -1) {
                            this.f35987l = -2;
                        }
                    } else if (i12 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f35986k = string;
                        if (string.indexOf("/") > 0) {
                            this.m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f35987l = -2;
                        } else {
                            this.f35987l = -1;
                        }
                    } else {
                        this.f35987l = typedArrayObtainStyledAttributes.getInteger(index, this.m);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
